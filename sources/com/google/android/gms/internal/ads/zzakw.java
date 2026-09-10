package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakw {
    public final boolean zza;
    public final String zzb;
    public final zzafz zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzakw(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        byte b2 = 0;
        int i5 = 1;
        zzgqa.zza((i2 == 0) ^ (bArr2 == null));
        this.zza = z2;
        this.zzb = str;
        this.zzd = i2;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b2 = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0 && b2 != 1) {
                if (b2 == 2 || b2 == 3) {
                    i5 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzee.zzc("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.zzc = new zzafz(i5, bArr, i3, i4);
    }
}
