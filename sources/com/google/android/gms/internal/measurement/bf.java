package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bf extends df implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23322a;

    public bf(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f23322a = file;
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final File zza() {
        return this.f23322a;
    }
}
