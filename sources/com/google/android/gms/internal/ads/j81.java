package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j81 implements h81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j81 f16021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j81[] f16022b;

    static {
        j81 j81Var = new j81("ALWAYS_TRUE", 0);
        f16021a = j81Var;
        f16022b = new j81[]{j81Var, new j81("ALWAYS_FALSE", 1), new j81("IS_NULL", 2), new j81("NOT_NULL", 3)};
    }

    public static j81[] values() {
        return (j81[]) f16022b.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }

    @Override // com.google.android.gms.internal.ads.h81
    public final /* synthetic */ boolean zza(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
