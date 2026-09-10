package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackEncryptionBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrackOutput.CryptoData f17838c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f17839e;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public TrackEncryptionBox(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        int i5 = 2;
        byte b2 = 0;
        Assertions.b((i2 == 0) ^ (bArr2 == null));
        this.f17836a = z2;
        this.f17837b = str;
        this.d = i2;
        this.f17839e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b2 = -1;
                    }
                    break;
                case 3046671:
                    b2 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b2 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b2 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                    break;
                default:
                    Log.g("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i5 = 1;
                    break;
            }
        } else {
            i5 = 1;
        }
        this.f17838c = new TrackOutput.CryptoData(i5, bArr, i3, i4);
    }
}
