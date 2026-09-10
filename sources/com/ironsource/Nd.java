package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum Nd {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26663a;

    Nd(String str) {
        this.f26663a = str;
    }

    public final String b() {
        return this.f26663a;
    }
}
