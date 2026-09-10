package com.google.android.gms.internal.fido;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzbc extends zzbe {
    final char[] zza;

    public zzbc(String str, String str2) {
        zzbb zzbbVar = new zzbb("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbbVar, null);
        this.zza = new char[512];
        zzam.zzc(zzbbVar.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzbbVar.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzbbVar.zza(i2 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    public final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzam.zze(0, i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            appendable.append(this.zza[i5]);
            appendable.append(this.zza[i5 | 256]);
        }
    }
}
