package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cf extends ef implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f23363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f23364b;

    public cf(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f23363a = fileOutputStream;
        this.f23364b = file;
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final File zza() {
        return this.f23364b;
    }
}
