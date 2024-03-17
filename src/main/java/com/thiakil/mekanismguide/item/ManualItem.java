package com.thiakil.mekanismguide.item;

import com.thiakil.mekanismguide.MekanismGuide;
import li.cil.manual.api.ManualModel;
import li.cil.manual.api.prefab.item.AbstractManualItem;

public class ManualItem extends AbstractManualItem {
    public ManualItem(Properties properties) {
        super(properties);
    }

    @Override
    protected ManualModel getManualModel() {
        return MekanismGuide.MANUAL.get();
    }
}
