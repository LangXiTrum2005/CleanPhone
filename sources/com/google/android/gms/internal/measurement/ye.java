package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.ironsource.X3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ye implements jf {
    @Override // com.google.android.gms.internal.measurement.jf
    public final bf a(Uri uri) throws b2.z {
        File fileB = yg.b(uri);
        return new bf(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final boolean b(Uri uri) {
        return yg.b(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final File c(Uri uri) {
        return yg.b(uri);
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final OutputStream d(Uri uri) throws IOException {
        File fileB = yg.b(uri);
        go.c.f(fileB);
        return new cf(new FileOutputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final void e(Uri uri) throws IOException {
        File fileB = yg.b(uri);
        if (fileB.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileB.delete()) {
            return;
        }
        if (!fileB.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final void f(Uri uri, Uri uri2) throws IOException {
        File fileB = yg.b(uri);
        File fileB2 = yg.b(uri2);
        go.c.f(fileB2);
        if (!fileB.renameTo(fileB2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final String zzc() {
        return X3.i.f27782b;
    }
}
