package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class gb extends bi {
    public gb(Integer num) {
        super("Maximum wrapper depth exceeded.", num);
    }

    public /* synthetic */ gb(Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 302 : num);
    }
}
