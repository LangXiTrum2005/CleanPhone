package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21496a;

    public we(byte[] bArr, int i10) {
        switch (i10) {
            case 1:
                this.f21496a = bArr;
                break;
            default:
                this.f21496a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
                for (int i11 = 0; i11 < 256; i11++) {
                    this.f21496a[i11] = (byte) i11;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < 256; i13++) {
                    byte[] bArr2 = this.f21496a;
                    byte b10 = bArr2[i13];
                    i12 = (i12 + b10 + bArr[i13 % bArr.length]) & 255;
                    bArr2[i13] = bArr2[i12];
                    bArr2[i12] = b10;
                }
                break;
        }
    }
}
