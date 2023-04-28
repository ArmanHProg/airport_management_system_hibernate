package com.bdg.converter.persistent_to_model;

import com.bdg.converter.model_to_persistance.ModToPerAddress;
import com.bdg.converter.model_to_persistance.ModToPerPassenger;
import com.bdg.model.PassengerMod;
import com.bdg.persistent.PassengerPer;
import com.bdg.validator.Validator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerToModPassenger extends PerToMod<PassengerPer, PassengerMod> {

    @Override
    public PassengerMod getModelFrom(PassengerPer persistent) {
        Validator.checkNull(persistent);
        PerToModAddress temp = new PerToModAddress();
        PassengerMod model = new PassengerMod();
        model.setId(persistent.getId());
        model.setName(persistent.getName());
        model.setPhone(persistent.getPhone());
        model.setAddress(temp.getModelFrom(persistent.getAddress()));
        return model;
    }

    @Override
    public Collection<PassengerMod> getModelListFrom(Collection<PassengerPer> persistentList) {
        Validator.checkNull(persistentList);
        Set<PassengerMod> passengerModSet = new LinkedHashSet<>(persistentList.size());
        for (PassengerPer tempPassengerPer : persistentList){
            passengerModSet.add(getModelFrom(tempPassengerPer));
        }
        return passengerModSet;
    }
}