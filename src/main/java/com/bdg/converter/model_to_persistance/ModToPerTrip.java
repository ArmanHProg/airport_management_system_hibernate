package com.bdg.converter.model_to_persistance;

import com.bdg.model.TripMod;
import com.bdg.persistent.TripPer;
import com.bdg.validator.Validator;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class ModToPerTrip extends ModToPer<TripMod, TripPer> {
    @Override
    public TripPer getPersistentFrom(TripMod model) {
        Validator.checkNull(model);
        ModToPerCompany temp = new ModToPerCompany();

        TripPer persistent = new TripPer();
        persistent.setCompany(temp.getPersistentFrom(model.getCompany()));
        persistent.setAirplane(model.getAirplane());
        persistent.setTownFrom(model.getTownFrom());
        persistent.setTownTo(model.getTownTo());
        persistent.setTimeIn(model.getTimeIn());
        persistent.setTimeOut(model.getTimeOut());

        return persistent;
    }

    @Override
    public Collection<TripPer> getPersistentListFrom(Collection<TripMod> modelList) {
        Validator.checkNull(modelList);

        Set<TripPer> tripsPerSet = new LinkedHashSet<>(modelList.size());
        for(TripMod tempTripMod: modelList){
            tripsPerSet.add(getPersistentFrom(tempTripMod));
        }

        return tripsPerSet;

    }
}
