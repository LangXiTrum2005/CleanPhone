package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdu extends zzbdm {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbdu(int i2) {
        int i3 = i2 >> 3;
        this.zzc = (i2 & 7) > 0 ? i3 + 1 : i3;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i2 = this.zzc;
                if (length > i2) {
                    length = i2;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i3 = this.zzd & 7;
                if (i3 > 0) {
                    long j = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (i4 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    }
                    long j2 = j >>> (8 - i3);
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
