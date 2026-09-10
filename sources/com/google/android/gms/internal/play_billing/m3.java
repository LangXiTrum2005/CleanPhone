package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum m3 implements v1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24425a;

    m3(int i10) {
        this.f24425a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24425a);
    }
}
