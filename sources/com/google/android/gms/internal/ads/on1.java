package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum on1 implements us1 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18316a;

    on1(int i10) {
        this.f18316a = i10;
    }

    public static on1 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 == 4) {
            return CRUNCHY;
        }
        if (i10 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18316a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f18316a;
        }
        bt1.a();
        throw null;
    }
}
