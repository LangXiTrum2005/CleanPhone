package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzamb implements zzaga {
    private final zzaga zza;
    private final zzalw zzb;
    private zzaly zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfj.zzb;
    private final zzer zzc = new zzer();

    public zzamb(zzaga zzagaVar, zzalw zzalwVar) {
        this.zza = zzagaVar;
        this.zzb = zzalwVar;
    }

    private final void zzc(int i2) {
        int length = this.zzf.length;
        int i3 = this.zze;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.zzd;
        int iMax = Math.max(i4 + i4, i2 + i4);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i4);
        this.zzd = 0;
        this.zze = i4;
        this.zzf = bArr2;
    }

    public final void zza(boolean z2) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzb(long j, int i2, zzalq zzalqVar) {
        this.zzh.getClass();
        zzgtd zzgtdVar = zzalqVar.zza;
        long j2 = zzalqVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgtdVar.size());
        Iterator<E> it = zzgtdVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzer zzerVar = this.zzc;
        int length = bArrMarshall.length;
        zzerVar.zzb(bArrMarshall, length);
        zzaga zzagaVar = this.zza;
        zzagaVar.zzz(zzerVar, length);
        long j3 = zzalqVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzgqa.zzi(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzt;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzagaVar.zzx(j, i2 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzu(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgqa.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzalw zzalwVar = this.zzb;
            this.zzg = zzalwVar.zza(zzvVar) ? zzalwVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzu(zzvVar);
            return;
        }
        zzaga zzagaVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzm("application/x-media3-cues");
        zztVarZza.zzj(str);
        zztVarZza.zzr(Long.MAX_VALUE);
        zztVarZza.zzK(this.zzb.zzb(zzvVar));
        zzagaVar.zzu(zztVarZza.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzv(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzv(zzjVar, i2, z2, 0);
        }
        zzc(i2);
        int iZza = zzjVar.zza(this.zzf, this.zze, i2);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzw(zzer zzerVar, int i2, int i3) {
        if (this.zzg == null) {
            this.zza.zzw(zzerVar, i2, i3);
            return;
        }
        zzc(i2);
        zzerVar.zzm(this.zzf, this.zze, i2);
        this.zze += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzx(final long j, final int i2, int i3, int i4, zzafz zzafzVar) {
        if (this.zzg == null) {
            this.zza.zzx(j, i2, i3, i4, zzafzVar);
            return;
        }
        zzgqa.zzb(zzafzVar == null, "DRM on subtitles is not supported");
        int i5 = (this.zze - i4) - i3;
        try {
            this.zzg.zza(this.zzf, i5, i3, zzalx.zza(), new zzdr() { // from class: com.google.android.gms.internal.ads.zzama
                @Override // com.google.android.gms.internal.ads.zzdr
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzb(j, i2, (zzalq) obj);
                }
            });
        } catch (RuntimeException e2) {
            if (!this.zzi) {
                throw e2;
            }
            zzee.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e2);
        }
        int i6 = i5 + i3;
        this.zzd = i6;
        if (i6 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
