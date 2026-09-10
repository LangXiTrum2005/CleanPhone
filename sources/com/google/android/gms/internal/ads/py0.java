package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum py0 {
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18838a;

    py0(String str) {
        this.f18838a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18838a;
    }
}
