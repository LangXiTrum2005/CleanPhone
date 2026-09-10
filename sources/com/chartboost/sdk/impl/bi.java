package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bi extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f13534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(String message, Integer num) {
        super(message);
        Intrinsics.f(message, "message");
        this.f13534b = num;
    }

    public final Integer a() {
        return this.f13534b;
    }
}
