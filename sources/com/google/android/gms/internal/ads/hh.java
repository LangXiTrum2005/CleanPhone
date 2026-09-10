package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum hh implements us1 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15291a;

    hh(int i10) {
        this.f15291a = i10;
    }

    public static hh a(int i10) {
        if (i10 == 0) {
            return UNSUPPORTED;
        }
        if (i10 == 2) {
            return ARM7;
        }
        if (i10 == 999) {
            return UNKNOWN;
        }
        if (i10 == 4) {
            return X86;
        }
        if (i10 == 5) {
            return ARM64;
        }
        if (i10 == 6) {
            return X86_64;
        }
        if (i10 != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15291a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        return this.f15291a;
    }
}
