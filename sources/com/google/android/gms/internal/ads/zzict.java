package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzict extends zzhzl {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzhzl zzd;
    private final zzhzl zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzict(zzhzl zzhzlVar, zzhzl zzhzlVar2, byte[] bArr) {
        this(zzhzlVar, zzhzlVar2);
    }

    private static zzhzl zzF(zzhzl zzhzlVar, zzhzl zzhzlVar2) {
        int iZzc = zzhzlVar.zzc();
        int iZzc2 = zzhzlVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzhzlVar.zzx(bArr, 0, 0, iZzc);
        zzhzlVar2.zzx(bArr, 0, iZzc, iZzc2);
        return zzhzl.zzu(bArr);
    }

    public static zzhzl zzd(zzhzl zzhzlVar, zzhzl zzhzlVar2) {
        if (zzhzlVar2.zzc() == 0) {
            return zzhzlVar;
        }
        if (zzhzlVar.zzc() == 0) {
            return zzhzlVar2;
        }
        int iZzc = zzhzlVar2.zzc() + zzhzlVar.zzc();
        if (iZzc < 128) {
            return zzF(zzhzlVar, zzhzlVar2);
        }
        if (zzhzlVar instanceof zzict) {
            zzict zzictVar = (zzict) zzhzlVar;
            zzhzl zzhzlVar3 = zzictVar.zze;
            if (zzhzlVar2.zzc() + zzhzlVar3.zzc() < 128) {
                return new zzict(zzictVar.zzd, zzF(zzhzlVar3, zzhzlVar2));
            }
            zzhzl zzhzlVar4 = zzictVar.zzd;
            if (zzhzlVar4.zzf() > zzhzlVar3.zzf() && zzictVar.zzg > zzhzlVar2.zzf()) {
                return new zzict(zzhzlVar4, new zzict(zzhzlVar3, zzhzlVar2));
            }
        }
        return iZzc >= zzh(Math.max(zzhzlVar.zzf(), zzhzlVar2.zzf()) + 1) ? new zzict(zzhzlVar, zzhzlVar2) : zzicr.zza(zzhzlVar, zzhzlVar2, new ArrayDeque());
    }

    public static int zzh(int i2) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhzl, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzicq(this);
    }

    public final /* synthetic */ zzhzl zzD() {
        return this.zzd;
    }

    public final /* synthetic */ zzhzl zzE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final byte zza(int i2) {
        zzhzl.zzB(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            this.zzd.zze(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.zze.zze(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.zzd.zze(bArr, i2, i3, i7);
            this.zze.zze(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final boolean zzg() {
        return this.zzc >= zzh(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final zzhzl zzi(int i2, int i3) {
        int i4 = this.zzc;
        int iZzC = zzhzl.zzC(i2, i3, i4);
        if (iZzC == 0) {
            return zzhzl.zzb;
        }
        if (iZzC == i4) {
            return this;
        }
        int i5 = this.zzf;
        if (i3 <= i5) {
            return this.zzd.zzi(i2, i3);
        }
        int i6 = i3 - i5;
        if (i2 >= i5) {
            return this.zze.zzi(i2 - i5, i6);
        }
        zzhzl zzhzlVar = this.zzd;
        return new zzict(zzhzlVar.zzi(i2, zzhzlVar.zzc()), this.zze.zzi(0, i6));
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final ByteBuffer zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final void zzk(zzhzc zzhzcVar) throws IOException {
        this.zzd.zzk(zzhzcVar);
        this.zze.zzk(zzhzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final String zzl(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final boolean zzm() {
        zzhzl zzhzlVar = this.zzd;
        zzhzl zzhzlVar2 = this.zze;
        return zzhzlVar2.zzn(zzhzlVar.zzn(0, 0, this.zzf), 0, zzhzlVar2.zzc()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzn(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzn(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzn(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzn(this.zzd.zzn(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final boolean zzo(zzhzl zzhzlVar) {
        zzhzi zzhziVarZza;
        byte[] bArr = null;
        zzics zzicsVar = new zzics(this, bArr);
        zzhzi zzhziVarZza2 = zzicsVar.next();
        zzics zzicsVar2 = new zzics(zzhzlVar, bArr);
        zzhzi zzhziVarZza3 = zzicsVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iZzc = zzhziVarZza2.zzc() - i2;
            int iZzc2 = zzhziVarZza3.zzc() - i3;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i2 == 0 ? zzhziVarZza2.zzh(zzhziVarZza3, i3, iMin) : zzhziVarZza3.zzh(zzhziVarZza2, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.zzc;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                zzhziVarZza = zzicsVar.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == iZzc2) {
                zzhziVarZza2 = zzhziVarZza2;
                zzhziVarZza2 = zzhziVarZza;
                zzhziVarZza3 = zzicsVar2.next();
                i3 = 0;
            } else {
                zzhziVarZza2 = zzhziVarZza2;
                zzhziVarZza2 = zzhziVarZza;
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final int zzp(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzp(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzp(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzp(this.zzd.zzp(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    public final zzhzq zzq() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte[] bArr = null;
        zzics zzicsVar = new zzics(this, bArr);
        while (zzicsVar.hasNext()) {
            arrayList.add(zzicsVar.next().zzj());
        }
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzhzn(arrayList, iRemaining, true, bArr) : zzhzq.zzF(new zzibh(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhzl
    /* JADX INFO: renamed from: zzr */
    public final zzhzg iterator() {
        return new zzicq(this);
    }

    private zzict(zzhzl zzhzlVar, zzhzl zzhzlVar2) {
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar2;
        int iZzc = zzhzlVar.zzc();
        this.zzf = iZzc;
        this.zzc = zzhzlVar2.zzc() + iZzc;
        this.zzg = Math.max(zzhzlVar.zzf(), zzhzlVar2.zzf()) + 1;
    }
}
