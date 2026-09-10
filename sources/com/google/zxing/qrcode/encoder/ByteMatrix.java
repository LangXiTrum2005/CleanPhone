package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f21410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21412c;

    public ByteMatrix(int i2, int i3) {
        this.f21410a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, i2);
        this.f21411b = i2;
        this.f21412c = i3;
    }

    public final byte a(int i2, int i3) {
        return this.f21410a[i3][i2];
    }

    public final void b(int i2, int i3, int i4) {
        this.f21410a[i3][i2] = (byte) i4;
    }

    public final void c(int i2, int i3, boolean z2) {
        this.f21410a[i3][i2] = z2 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i2 = this.f21411b;
        int i3 = this.f21412c;
        StringBuilder sb = new StringBuilder((i2 * 2 * i3) + 2);
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr = this.f21410a[i4];
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
