package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f21751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21753e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public x6(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 1;
        ps1.v((bArr2 == null) ^ (i10 == 0));
        this.f21749a = z10;
        this.f21750b = str;
        this.f21752d = i10;
        this.f21753e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(C.CENC_TYPE_cbc1)) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Unsupported protection scheme type '");
                        sb2.append(str);
                        sb2.append("'. Assuming AES-CTR crypto mode.");
                        v71.y("TrackEncryptionBox", sb2.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals(C.CENC_TYPE_cbcs)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 68);
                        sb3.append("Unsupported protection scheme type '");
                        sb3.append(str);
                        sb3.append("'. Assuming AES-CTR crypto mode.");
                        v71.y("TrackEncryptionBox", sb3.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals(C.CENC_TYPE_cenc)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 68);
                        sb4.append("Unsupported protection scheme type '");
                        sb4.append(str);
                        sb4.append("'. Assuming AES-CTR crypto mode.");
                        v71.y("TrackEncryptionBox", sb4.toString());
                    }
                    break;
                case 3049895:
                    if (!str.equals(C.CENC_TYPE_cens)) {
                        StringBuilder sb5 = new StringBuilder(str.length() + 68);
                        sb5.append("Unsupported protection scheme type '");
                        sb5.append(str);
                        sb5.append("'. Assuming AES-CTR crypto mode.");
                        v71.y("TrackEncryptionBox", sb5.toString());
                    }
                    break;
                default:
                    StringBuilder sb6 = new StringBuilder(str.length() + 68);
                    sb6.append("Unsupported protection scheme type '");
                    sb6.append(str);
                    sb6.append("'. Assuming AES-CTR crypto mode.");
                    v71.y("TrackEncryptionBox", sb6.toString());
                    break;
            }
        }
        this.f21751c = new g3(i13, bArr, i11, i12);
    }
}
