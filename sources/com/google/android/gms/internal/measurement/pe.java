package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pe extends df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23859b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23860a;

    public pe(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f23860a = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f23860a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            Iterator it = this.f23860a.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.df, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = ((FilterInputStream) this).in.read(bArr);
        if (i10 != -1) {
            Iterator it = this.f23860a.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            Iterator it = this.f23860a.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
        }
        return i12;
    }
}
