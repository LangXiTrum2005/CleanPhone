package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatm implements zzatk {
    private int zza = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);
    private final byte[] zzb = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];
    private final zzato zzc;

    public zzatm(zzato zzatoVar) {
        this.zzc = zzatoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final byte zza(zzatw zzatwVar, int i2) {
        int i3 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i4 = 1761855727 % 1384724137;
        int i5 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i6 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i7 = 1694830070 % 1383960411;
        int i8 = i2 >>> i5;
        if (i8 != this.zza) {
            this.zzc.zza(i8, this.zzb);
            this.zza = i8;
        }
        int i9 = i6 ^ i7;
        return (byte) (((zzatwVar.zzb(i2) ^ this.zzb[i2 % (i3 ^ i4)]) << i9) >> i9);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final zzatw zzb(zzatw zzatwVar, int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > zzatwVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            bArr[i4] = zza(zzatwVar, i2);
            i2++;
            i4++;
        }
        return zzatw.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final /* bridge */ /* synthetic */ zzatk zzc() {
        return new zzatm(this.zzc);
    }
}
