package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapq implements zzaeo {
    private final int zza;
    private final List zzb;
    private final zzer zzc;
    private final SparseIntArray zzd;
    private final zzapt zze;
    private final zzalw zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapm zzj;
    private zzapl zzk;
    private zzaer zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzapq() {
        this(1, 1, zzalw.zza, new zzfg(0L), new zzaod(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzaef zzaefVar = (zzaef) zzaepVar;
        zzaefVar.zzh(bArrZzi, 0, 940, false);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    zzaefVar.zze(i2, false);
                    return true;
                }
                if (bArrZzi[(i3 * 188) + i2] != 71) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        if (this.zza == 0) {
            zzaerVar = new zzalz(zzaerVar, this.zzf);
        }
        this.zzl = zzaerVar;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        long j;
        long jZzo = zzaepVar.zzo();
        long j2 = -1;
        if (this.zzn) {
            if (jZzo != -1) {
                zzapm zzapmVar = this.zzj;
                if (!zzapmVar.zza()) {
                    return zzapmVar.zzb(zzaepVar, zzafoVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzapm zzapmVar2 = this.zzj;
                if (zzapmVar2.zzc() != -9223372036854775807L) {
                    j = 0;
                    zzapl zzaplVar = new zzapl(zzapmVar2.zzd(), zzapmVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzaplVar;
                    this.zzl.zzw(zzaplVar.zza());
                } else {
                    j = 0;
                    this.zzl.zzw(new zzafq(zzapmVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j, j);
                if (zzaepVar.zzn() != j) {
                    zzafoVar.zza = j;
                    return 1;
                }
            }
            zzapl zzaplVar2 = this.zzk;
            if (zzaplVar2 != null && zzaplVar2.zzc()) {
                return zzaplVar2.zzd(zzaepVar, zzafoVar);
            }
        } else {
            j2 = -1;
        }
        zzer zzerVar = this.zzc;
        byte[] bArrZzi = zzerVar.zzi();
        if (9400 - zzerVar.zzg() < 188) {
            int iZzd = zzerVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzerVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzerVar.zzb(bArrZzi, iZzd);
        }
        while (zzerVar.zzd() < 188) {
            int iZze = zzerVar.zze();
            int iZza = zzaepVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i2 >= sparseArray.size()) {
                        return -1;
                    }
                    zzapv zzapvVar = (zzapv) sparseArray.valueAt(i2);
                    if (zzapvVar instanceof zzaoz) {
                        zzaoz zzaozVar = (zzaoz) zzapvVar;
                        if (zzaozVar.zzd(false)) {
                            zzaozVar.zzc(new zzer(), 1);
                        }
                    }
                    i2++;
                }
            } else {
                zzerVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzerVar.zzg();
        int iZze2 = zzerVar.zze();
        int iZza2 = zzapw.zza(zzerVar.zzi(), iZzg, iZze2);
        zzerVar.zzh(iZza2);
        int i3 = iZza2 + 188;
        if (i3 > iZze2) {
            this.zzq = (iZza2 - iZzg) + this.zzq;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzerVar.zze();
        if (i3 > iZze3) {
            return 0;
        }
        int iZzB = zzerVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzerVar.zzh(i3);
            return 0;
        }
        int i4 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i5 = iZzB & 32;
        int i6 = (iZzB >> 8) & 8191;
        zzapv zzapvVar2 = (iZzB & 16) != 0 ? (zzapv) this.zzg.get(i6) : null;
        if (zzapvVar2 == null) {
            zzerVar.zzh(i3);
            return 0;
        }
        int i7 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i8 = sparseIntArray.get(i6, i7 - 1);
        sparseIntArray.put(i6, i7);
        if (i8 == i7) {
            zzerVar.zzh(i3);
            return 0;
        }
        if (i7 != ((i8 + 1) & 15)) {
            zzapvVar2.zzb();
        }
        if (i5 != 0) {
            int iZzs = zzerVar.zzs();
            i4 |= (zzerVar.zzs() & 64) != 0 ? 2 : 0;
            zzerVar.zzk(iZzs - 1);
        }
        boolean z2 = this.zzn;
        if (z2 || !this.zzi.get(i6, false)) {
            zzerVar.zzf(i3);
            zzapvVar2.zzc(zzerVar, i4);
            zzerVar.zzf(iZze3);
            if (!z2) {
                if (this.zzn && jZzo != j2) {
                    this.zzp = true;
                }
            }
        } else if (this.zzn) {
            this.zzp = true;
        }
        zzerVar.zzh(i3);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        zzapl zzaplVar;
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfg zzfgVar = (zzfg) list.get(i2);
            if (zzfgVar.zzc() != -9223372036854775807L) {
                long jZza = zzfgVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                    zzfgVar.zzd(j2);
                }
            } else {
                zzfgVar.zzd(j2);
            }
        }
        if (j2 != 0 && (zzaplVar = this.zzk) != null) {
            zzaplVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i3 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzapv) sparseArray.valueAt(i3)).zzb();
                i3++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public final /* synthetic */ List zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzapt zzi() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    public final /* synthetic */ zzaer zzm() {
        return this.zzl;
    }

    public final /* synthetic */ int zzn() {
        return this.zzm;
    }

    public final /* synthetic */ void zzo(int i2) {
        this.zzm = i2;
    }

    public final /* synthetic */ void zzp(boolean z2) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzq(int i2) {
        this.zzr = i2;
    }

    public zzapq(int i2, int i3, zzalw zzalwVar, zzfg zzfgVar, zzapt zzaptVar, int i4) {
        this.zze = zzaptVar;
        this.zza = i3;
        this.zzf = zzalwVar;
        this.zzb = Collections.singletonList(zzfgVar);
        this.zzc = new zzer(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapm(112800);
        this.zzl = zzaer.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaptVar.zza();
        int size = sparseArrayZza.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.zzg.put(sparseArrayZza.keyAt(i5), (zzapv) sparseArrayZza.valueAt(i5));
        }
        this.zzg.put(0, new zzaph(new zzapn(this)));
    }
}
