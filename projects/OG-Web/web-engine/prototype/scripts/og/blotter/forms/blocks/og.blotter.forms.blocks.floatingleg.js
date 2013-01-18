/**
 * Copyright 2013 - present by OpenGamma Inc. and the OpenGamma group of companies
 * Please see distribution for license.
 */
$.register_module({
    name: 'og.blotter.forms.blocks.Floatingleg',
    dependencies: ['og.common.util.ui.Form'],
    obj: function () {
        var module = this, Block = og.common.util.ui.Block;
        var Floatingleg = function (config) {
            var block = this, id = og.common.id('attributes'), form = config.form,leg = config.leg,
                ui = og.common.util.ui, type = config.type, gear = ~type.indexOf('Gearing'),
                spre = ~type.indexOf('Spread'), leg_path = (leg.slice(0,leg.length-1)).split('.'),
                data = leg_path.reduce(function (acc, val) {return acc[val];},config.data);
            form.Block.call(block, {
                module: 'og.blotter.forms.blocks.swap_details_floating_tash',
                extras: {leg: leg, initial: data.initialFloatingRate, settlement: data.settlementDays, 
                    spread: data.spread, gearing: data.gearing, notional: data.notional.amount, index: config.index, 
                    gear: gear, spre: spre
                },
                children: [
                    new form.Block({module:'og.views.forms.currency_tash', 
                        extras:{name: leg + "notional.currency"}
                    }),
                    new og.blotter.forms.blocks.Security({
                        form: form, label: "Short Underlying ID", security: data.floatingReferenceRateId,
                        index: leg + "floatingReferenceRateId"
                    }),    
                    new ui.Dropdown({
                        form: form, resource: 'blotter.daycountconventions', index: leg + 'dayCount',
                        value: data.dayCount, placeholder: 'Select Day Count'
                    }),
                    new ui.Dropdown({
                        form: form, resource: 'blotter.frequencies', index:  leg + 'frequency',
                        value: data.frequency, placeholder: 'Select Frequency'
                    }),
                    new ui.Dropdown({
                        form: form, resource: 'blotter.businessdayconventions', 
                        index:  leg + 'businessDayConvention',
                        value: data.businessDayConvention, 
                        placeholder: 'Select Business Day Convention'
                    }),
                    new ui.Dropdown({
                        form: form, resource: 'blotter.floatingratetypes', 
                        index:  leg + 'floatingRateType',
                        value: data.floatingRateType, placeholder: 'Select Floating Rate Type'
                    }),
                    new ui.Dropdown({
                        form: form, resource: 'blotter.frequencies', index:  leg + 'offsetFixing',
                        value: data.offsetFixing, placeholder: 'Select Offset Fixing'
                    })
                ],
                processor: function (data) {
                    leg_path.reduce(function (acc, val) {return acc[val];},data)['eom'] = 
                        og.blotter.util.get_checkbox(leg + 'eom');
                }
            });
        };
        Floatingleg.prototype = new Block(); // inherit Block prototype
        return Floatingleg;
    }
});