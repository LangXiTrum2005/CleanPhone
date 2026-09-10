package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p004ironsource.f9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoz implements zzmu {
    private final zzdn zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzoy zzd;
    private final SparseArray zze;
    private zzed zzf;
    private zzbb zzg;
    private zzdx zzh;
    private boolean zzi;

    public zzoz(zzdn zzdnVar) {
        zzdnVar.getClass();
        this.zza = zzdnVar;
        this.zzf = new zzed(zzfj.zze(), zzdnVar);
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzoy(zzbdVar);
        this.zze = new SparseArray();
    }

    private final zzmv zzad(zzwg zzwgVar) {
        this.zzg.getClass();
        zzbf zzbfVarZze = zzwgVar == null ? null : this.zzd.zze(zzwgVar);
        if (zzwgVar != null && zzbfVarZze != null) {
            return zzaa(zzbfVarZze, zzbfVarZze.zzo(zzwgVar.zza, this.zzb).zzc, zzwgVar);
        }
        int iZzs = this.zzg.zzs();
        zzbf zzbfVarZzq = this.zzg.zzq();
        if (iZzs >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, iZzs, null);
    }

    private final zzmv zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzmv zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzmv zzag(int i2, zzwg zzwgVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzwgVar != null) {
            return this.zzd.zze(zzwgVar) != null ? zzad(zzwgVar) : zzaa(zzbf.zza, i2, zzwgVar);
        }
        zzbf zzbfVarZzq = zzbbVar.zzq();
        if (i2 >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, i2, null);
    }

    private final zzmv zzah(zzau zzauVar) {
        zzwg zzwgVar;
        return (!(zzauVar instanceof zzit) || (zzwgVar = ((zzit) zzauVar).zzh) == null) ? zzZ() : zzad(zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzmv zzmvVarZzZ = zzZ();
        this.zzi = true;
        zzY(zzmvVarZzZ, -1, new zzdy(zzmvVarZzZ) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzB(final int i2, final int i3, final boolean z2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new zzdy(zzmvVarZzaf, i2, i3, z2) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzC(final zzik zzikVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1007, new zzdy(zzmvVarZzaf, zzikVar) { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzD(final String str, final long j, final long j2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1008, new zzdy(zzmvVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzE(final zzv zzvVar, final zzil zzilVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1009, new zzdy() { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzk(zzmvVarZzaf, zzvVar, zzilVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzF(final long j) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1010, new zzdy(zzmvVarZzaf, j) { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzG(final int i2, final long j, final long j2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1011, new zzdy(zzmvVarZzaf, i2, j, j2) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzH(final String str) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, TTAdConstant.IMAGE_MODE_1012, new zzdy(zzmvVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzI(final zzik zzikVar) {
        final zzmv zzmvVarZzae = zzae();
        zzY(zzmvVarZzae, f9.f24992i, new zzdy(zzmvVarZzae, zzikVar) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzJ(final Exception exc) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, f9.j, new zzdy(zzmvVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzK(final Exception exc) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new zzdy(zzmvVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzL(final zzqz zzqzVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new zzdy(zzmvVarZzaf, zzqzVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzM(final zzqz zzqzVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new zzdy(zzmvVarZzaf, zzqzVar) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzN(final zzik zzikVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1015, new zzdy(zzmvVarZzaf, zzikVar) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzO(final String str, final long j, final long j2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, f9.f24993l, new zzdy(zzmvVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzP(final zzv zzvVar, final zzil zzilVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1017, new zzdy() { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzl(zzmvVarZzaf, zzvVar, zzilVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzQ(final int i2, final long j) {
        final zzmv zzmvVarZzae = zzae();
        zzY(zzmvVarZzae, 1018, new zzdy() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzm(zzmvVarZzae, i2, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzR(final String str) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 1019, new zzdy(zzmvVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzS(final zzik zzikVar) {
        final zzmv zzmvVarZzae = zzae();
        zzY(zzmvVarZzae, 1020, new zzdy() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzdh(zzmvVarZzae, zzikVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzT(final Object obj, final long j) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 26, new zzdy() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj2) {
                ((zzmx) obj2).zzo(zzmvVarZzaf, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzU(final long j, final int i2) {
        final zzmv zzmvVarZzae = zzae();
        zzY(zzmvVarZzae, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new zzdy(zzmvVarZzae, j, i2) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzV(final Exception exc) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new zzdy(zzmvVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzW(final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new zzdy(zzmvVarZzZ, i2) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzX(final int i2, final long j, final long j2) {
        final zzmv zzmvVarZzad = zzad(this.zzd.zzd());
        zzY(zzmvVarZzad, 1006, new zzdy() { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzdg(zzmvVarZzad, i2, j, j2);
            }
        });
    }

    public final void zzY(zzmv zzmvVar, int i2, zzdy zzdyVar) {
        this.zze.put(i2, zzmvVar);
        zzed zzedVar = this.zzf;
        zzedVar.zzd(i2, zzdyVar);
        zzedVar.zze();
    }

    public final zzmv zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    @RequiresNonNull
    public final zzmv zzaa(zzbf zzbfVar, int i2, zzwg zzwgVar) {
        zzwg zzwgVar2 = true == zzbfVar.zzg() ? null : zzwgVar;
        long jZzb = this.zza.zzb();
        boolean z2 = zzbfVar.equals(this.zzg.zzq()) && i2 == this.zzg.zzs();
        long jZzp = 0;
        if (zzwgVar2 == null || !zzwgVar2.zzb()) {
            if (z2) {
                jZzp = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j = zzbfVar.zzb(i2, this.zzc, 0L).zzl;
                jZzp = zzfj.zzp(0L);
            }
        } else if (z2 && this.zzg.zzy() == zzwgVar2.zzb && this.zzg.zzz() == zzwgVar2.zzc) {
            jZzp = this.zzg.zzu();
        }
        return new zzmv(jZzb, zzbfVar, i2, zzwgVar2, jZzp, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    public final /* synthetic */ void zzab(zzbb zzbbVar, zzmx zzmxVar, zzs zzsVar) {
        zzmxVar.zzdi(zzbbVar, new zzmw(zzsVar, this.zze));
    }

    public final /* synthetic */ void zzac() {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new zzdy(zzmvVarZzZ) { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzai(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar, final int i3) {
        final zzmv zzmvVarZzag = zzag(i2, zzwgVar);
        zzY(zzmvVarZzag, 1000, new zzdy(zzmvVarZzag, zzvxVar, zzwcVar, i3) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzaj(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar) {
        final zzmv zzmvVarZzag = zzag(i2, zzwgVar);
        zzY(zzmvVarZzag, 1001, new zzdy(zzmvVarZzag, zzvxVar, zzwcVar) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzak(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar) {
        final zzmv zzmvVarZzag = zzag(i2, zzwgVar);
        zzY(zzmvVarZzag, 1002, new zzdy(zzmvVarZzag, zzvxVar, zzwcVar) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzal(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar, final IOException iOException, final boolean z2) {
        final zzmv zzmvVarZzag = zzag(i2, zzwgVar);
        zzY(zzmvVarZzag, 1003, new zzdy() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzh(zzmvVarZzag, zzvxVar, zzwcVar, iOException, z2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzam(int i2, zzwg zzwgVar, final zzwc zzwcVar) {
        final zzmv zzmvVarZzag = zzag(i2, zzwgVar);
        zzY(zzmvVarZzag, 1004, new zzdy() { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzdf(zzmvVarZzag, zzwcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i2) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 0, new zzdy(zzmvVarZzZ, i2) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 1, new zzdy(zzmvVarZzZ, zzakVar, i2) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 2, new zzdy(zzmvVarZzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 14, new zzdy(zzmvVarZzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 3, new zzdy(zzmvVarZzZ, z2) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 13, new zzdy(zzmvVarZzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z2, final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, -1, new zzdy(zzmvVarZzZ, z2, i2) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zze(zzmvVarZzZ, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z2, final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 5, new zzdy(zzmvVarZzZ, z2, i2) { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 6, new zzdy(zzmvVarZzZ, i2) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z2) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 7, new zzdy(zzmvVarZzZ, z2) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zzmv zzmvVarZzah = zzah(zzauVar);
        zzY(zzmvVarZzah, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzg(zzmvVarZzah, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zzmv zzmvVarZzah = zzah(zzauVar);
        zzY(zzmvVarZzah, 10, new zzdy(zzmvVarZzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i2) {
        if (i2 == 1) {
            this.zzi = false;
            i2 = 1;
        }
        zzoy zzoyVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzoyVar.zzf(zzbbVar);
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzmx) obj).zzde(zzmvVarZzZ, zzbaVar, zzbaVar2, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zzmv zzmvVarZzZ = zzZ();
        zzY(zzmvVarZzZ, 12, new zzdy(zzmvVarZzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 21, new zzdy(zzmvVarZzaf, i2) { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 22, new zzdy(zzmvVarZzaf, f) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z2) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 23, new zzdy(zzmvVarZzaf, z2) { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 25, new zzdy() { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                zzmv zzmvVar = zzmvVarZzaf;
                zzbv zzbvVar2 = zzbvVar;
                ((zzmx) obj).zzp(zzmvVar, zzbvVar2);
                int i2 = zzbvVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i2, final int i3) {
        final zzmv zzmvVarZzaf = zzaf();
        zzY(zzmvVarZzaf, 24, new zzdy(zzmvVarZzaf, i2, i3) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzv(zzmx zzmxVar) {
        this.zzf.zzb(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzw(zzmx zzmxVar) {
        this.zzf.zzc(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z2 = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z2 = false;
        }
        zzgqa.zzi(z2);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        this.zzh = this.zza.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdz() { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                this.zza.zzab(zzbbVar, (zzmx) obj, zzsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzy() {
        zzdx zzdxVar = this.zzh;
        zzdxVar.getClass();
        zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzz(List list, zzwg zzwgVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzwgVar, zzbbVar);
    }
}
