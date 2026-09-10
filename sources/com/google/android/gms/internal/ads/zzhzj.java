package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
class zzhzj extends zzhzi {
    protected final byte[] zza;

    public zzhzj(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhzi
    public final boolean zzh(zzhzl zzhzlVar, int i2, int i3) {
        if (i3 > zzhzlVar.zzc()) {
            int iZzc = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 18 + String.valueOf(iZzc).length());
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(iZzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i2 + i3;
        if (i4 > zzhzlVar.zzc()) {
            int iZzc2 = zzhzlVar.zzc();
            int length = String.valueOf(i2).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iZzc2).length());
            androidx.datastore.preferences.protobuf.a.z(sb2, "Ran off end of other: ", i2, ", ", i3);
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(iZzc2, ", ", sb2));
        }
        if (!(zzhzlVar instanceof zzhzj)) {
            return zzhzlVar.zzi(i2, i4).equals(zzi(0, i3));
        }
        zzhzj zzhzjVar = (zzhzj) zzhzlVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzhzjVar.zza;
        int iZzd = zzd() + i3;
        int iZzd2 = zzd();
        int iZzd3 = zzhzjVar.zzd() + i2;
        while (iZzd2 < iZzd) {
            if (bArr[iZzd2] != bArr2[iZzd3]) {
                return false;
            }
            iZzd2++;
            iZzd3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final zzhzl zzi(int i2, int i3) {
        int iZzC = zzhzl.zzC(i2, i3, zzc());
        return iZzC == 0 ? zzhzl.zzb : new zzhzf(this.zza, zzd() + i2, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final void zzk(zzhzc zzhzcVar) throws IOException {
        zzhzcVar.zza(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final boolean zzm() {
        int iZzd = zzd();
        return zzidr.zza(this.zza, iZzd, zzc() + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzn(int i2, int i3, int i4) {
        int iZzd = zzd() + i3;
        return zzidr.zzb(i2, this.zza, iZzd, i4 + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final boolean zzo(zzhzl zzhzlVar) {
        return zzhzlVar instanceof zzhzj ? zzh(zzhzlVar, 0, zzc()) : zzhzlVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzp(int i2, int i3, int i4) {
        return zzibe.zzc(i2, this.zza, zzd() + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final zzhzq zzq() {
        return zzhzq.zzG(this.zza, zzd(), zzc(), true);
    }
}
