package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2191ex extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC2796pF A02;
    public final Uri A03;
    public final C5Y A04;
    public final C2296ge A05;
    public final String A06;

    public C2191ex(C2296ge c2296ge, Uri uri, C5Y c5y) throws IOException {
        this.A05 = c2296ge;
        this.A04 = c5y;
        this.A03 = uri;
        this.A06 = C2231fb.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i2) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5I();
        this.A01 = (int) this.A02.AGi(new C11205i(this.A03, i2, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b2 = new byte[1];
        return read(b2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.A02.read(bArr, i2, i3);
        int read = this.A00;
        this.A00 = read + i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - ((long) this.A00);
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (((long) this.A00) + j);
        A00(this.A00);
        return j;
    }
}
