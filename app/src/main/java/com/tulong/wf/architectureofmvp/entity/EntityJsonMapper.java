package com.tulong.wf.architectureofmvp.entity;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by wangjianwei on 2017/3/1.
 */

public class EntityJsonMapper {
    private final Gson gson;

    @Inject
    public EntityJsonMapper() {
        this.gson = new Gson();
    }

    public DemoModel transformDemoModelCollection(String demoResonse) throws JsonSyntaxException {
        final Type listOfDemoModelType = new TypeToken<DemoModel>() {}.getType();
        return this.gson.fromJson(demoResonse, listOfDemoModelType);
    }

}
