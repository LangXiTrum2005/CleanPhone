package com.chartboost.sdk.impl;

import com.thinkup.core.common.n.mo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pb extends bi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(String elementName, Integer num) {
        super("Missing required element: " + elementName + mo.ono, num);
        Intrinsics.f(elementName, "elementName");
    }

    public /* synthetic */ pb(String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 101 : num);
    }
}
