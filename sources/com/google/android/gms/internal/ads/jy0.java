package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum jy0 {
    HTML("html"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16218a;

    jy0(String str) {
        this.f16218a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16218a;
    }
}
