package com.google.android.gms.internal.fido;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzbd extends zzbe {
    public zzbd(String str, String str2, @CheckForNull Character ch) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    public final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzam.zze(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = ((bArr[i4 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (i6 << 16) | (bArr[i4 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            appendable.append(this.zzb.zza(i7 >>> 18));
            appendable.append(this.zzb.zza((i7 >>> 12) & 63));
            appendable.append(this.zzb.zza((i7 >>> 6) & 63));
            appendable.append(this.zzb.zza(i7 & 63));
            i4 += 3;
        }
        if (i4 < i3) {
            zzc(appendable, bArr, i4, i3 - i4);
        }
    }
}
