package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qi extends mu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageDigest f19087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19089e;

    public qi(int i10) {
        super(2);
        int i11 = i10 >> 3;
        this.f19088d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f19089e = i10;
    }

    public final byte[] X0(String str) {
        synchronized (this.f17550a) {
            try {
                MessageDigest messageDigestA0 = A0();
                this.f19087c = messageDigestA0;
                if (messageDigestA0 == null) {
                    return new byte[0];
                }
                messageDigestA0.reset();
                this.f19087c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f19087c.digest();
                int length = bArrDigest.length;
                int i10 = this.f19088d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.f19089e & 7;
                if (i11 > 0) {
                    long j10 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i12] & 255);
                    }
                    long j11 = j10 >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
