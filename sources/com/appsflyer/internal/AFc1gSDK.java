package com.appsflyer.internal;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1gSDK<T> {
    public final Function0<T> getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1gSDK(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getMonetizationNetwork = function0;
    }
}
