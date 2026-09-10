package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hh extends ih {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23552b;

    @Override // com.google.android.gms.internal.measurement.ih
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.ih
    public final String b() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.ih
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.ih
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.ih
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof hh;
    }

    public final int hashCode() {
        int i10 = this.f23552b;
        if (i10 != 0) {
            return i10;
        }
        this.f23552b = -1391114360;
        return -1391114360;
    }
}
