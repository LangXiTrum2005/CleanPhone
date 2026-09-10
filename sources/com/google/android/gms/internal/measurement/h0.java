package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum h0 implements k1 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23532a;

    h0(int i10) {
        this.f23532a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23532a);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f23532a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
