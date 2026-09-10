package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
class zzeb extends zzea {
    protected final byte[] zza;

    public zzeb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return obj.equals(this);
        }
        zzeb zzebVar = (zzeb) obj;
        int iZzj = zzj();
        int iZzj2 = zzebVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException(a.g(iZzd, zzebVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzebVar.zza;
        zzebVar.zzc();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iZzd) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final int zze(int i2, int i3, int i4) {
        return zzez.zzd(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final zzee zzf(int i2, int i3) {
        int iZzi = zzee.zzi(0, i3, zzd());
        return iZzi == 0 ? zzee.zzb : new zzdy(this.zza, 0, iZzi);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}
