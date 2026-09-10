package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1826Xs extends Writer {
    public static String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final InterfaceC1825Xr A02;

    public C1826Xs(InterfaceC1825Xr interfaceC1825Xr) {
        this.A02 = interfaceC1825Xr;
    }

    private void A00() {
        this.A02.AH8(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i2;
        while (true) {
            int i5 = i2 + i3;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int length = str.length();
            int i6 = str2.length();
            if (length == i6) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "vRRDkAC7ww5dnR4MiguJ90FB5";
            strArr2[4] = "BIleT5EfDSeSU";
            if (i4 < i5) {
                if (cArr[i4] != '\n') {
                    int i7 = this.A00;
                    int i8 = this.A01.length;
                    if (i7 == i8) {
                        A00();
                    } else {
                        this.A01[this.A00] = cArr[i4];
                        int i9 = this.A00;
                        this.A00 = i9 + 1;
                    }
                } else {
                    A00();
                }
                i4++;
            } else {
                return;
            }
        }
    }
}
