package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qe extends ef {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23899b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23900a;

    public qe(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f23900a = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f23900a.iterator();
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

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        Iterator it = this.f23900a.iterator();
        if (it.hasNext()) {
            throw f2.j(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ef, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f23900a.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                int length = bArr.length;
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.measurement.ef, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        Iterator it = this.f23900a.iterator();
        if (it.hasNext()) {
            throw f2.j(it);
        }
    }
}
