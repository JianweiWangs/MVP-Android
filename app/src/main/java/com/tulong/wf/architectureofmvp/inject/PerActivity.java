package com.tulong.wf.architectureofmvp.inject;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by wangjianwei on 2017/2/27.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {}
