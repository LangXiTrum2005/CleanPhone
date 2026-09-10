package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qa extends bi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(String message, Integer num) {
        super(message, num);
        Intrinsics.f(message, "message");
    }

    public /* synthetic */ qa(String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 100 : num);
    }
}
