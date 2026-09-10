package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.fi;
import com.google.android.gms.internal.ads.qt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qt f10825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzq f10826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f10827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VideoController f10828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzaz f10829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zza f10830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdListener f10831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AdSize[] f10832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppEventListener f10833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzbu f10834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VideoOptions f10835k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewGroup f10836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnPaidEventListener f10839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicLong f10840q;

    public zzek(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzq.zza, i10);
    }

    public static zzr a(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = i10 == 1;
        return zzrVar;
    }

    public final void zzA(VideoOptions videoOptions) {
        this.f10835k = videoOptions;
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzG(videoOptions == null ? null : new zzfw(videoOptions));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final VideoOptions zzB() {
        return this.f10835k;
    }

    public final boolean zzC(zzbu zzbuVar) {
        try {
            a aVarZzb = zzbuVar.zzb();
            if (aVarZzb == null || ((View) b.y1(aVarZzb)).getParent() != null) {
                return false;
            }
            this.f10836m.addView((View) b.y1(aVarZzb));
            this.f10834j = zzbuVar;
            return true;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final void zza() {
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzc();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final AdListener zzb() {
        return this.f10831g;
    }

    @Nullable
    public final AdSize zzc() {
        zzr zzrVarZzn;
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null && (zzrVarZzn = zzbuVar.zzn()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzrVarZzn.zze, zzrVarZzn.zzb, zzrVarZzn.zza);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.f10832h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.f10832h;
    }

    public final String zze() {
        zzbu zzbuVar;
        if (this.l == null && (zzbuVar = this.f10834j) != null) {
            try {
                this.l = zzbuVar.zzu();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.l;
    }

    @Nullable
    public final AppEventListener zzf() {
        return this.f10833i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: RemoteException -> 0x00bc, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00bc, blocks: (B:26:0x008b, B:28:0x0091, B:30:0x009f, B:32:0x00b1, B:35:0x00be), top: B:56:0x008b, outer: #1 }] */
    public final void zzg(zzeh zzehVar) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVar = this.f10834j;
            ViewGroup viewGroup = this.f10836m;
            if (zzbuVar == null) {
                if (this.f10832h == null || this.l == null) {
                    if (zzbuVar == null) {
                        throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                    }
                }
                Context context = viewGroup.getContext();
                zzbu zzbuVar2 = (zzbu) new zzal(zzay.zzb(), context, a(context, this.f10832h, this.f10837n), this.l, this.f10825a).zzd(context, false);
                this.f10834j = zzbuVar2;
                zzbuVar2.zzdS(new zzg(this.f10829e));
                zza zzaVar = this.f10830f;
                if (zzaVar != null) {
                    this.f10834j.zzy(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.f10833i;
                if (appEventListener != null) {
                    this.f10834j.zzi(new fi(appEventListener));
                }
                if (this.f10835k != null) {
                    this.f10834j.zzG(new zzfw(this.f10835k));
                }
                this.f10834j.zzP(new zzfo(this.f10839p));
                this.f10834j.zzz(this.f10838o);
                zzbu zzbuVar3 = this.f10834j;
                if (zzbuVar3 != null) {
                    try {
                        final a aVarZzb = zzbuVar3.zzb();
                        if (aVarZzb != null) {
                            if (((Boolean) dn.f13594f.o()).booleanValue()) {
                                if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzek zzekVar = this.f10823a;
                                            zzekVar.getClass();
                                            zzekVar.f10836m.addView((View) b.y1(aVarZzb));
                                        }
                                    });
                                } else {
                                    viewGroup.addView((View) b.y1(aVarZzb));
                                }
                            } else {
                                viewGroup.addView((View) b.y1(aVarZzb));
                            }
                        }
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
            zzehVar.zzp(jCurrentTimeMillis);
            long jZzr = zzehVar.zzr();
            AtomicLong atomicLong = this.f10840q;
            if (jZzr != 0) {
                atomicLong.set(zzehVar.zzr());
            }
            zzbu zzbuVar4 = this.f10834j;
            if (zzbuVar4 == null) {
                throw null;
            }
            if (atomicLong.get() != 0) {
                zzbuVar4.zzT(atomicLong.get());
            }
            zzbuVar4.zze(this.f10826b.zza(viewGroup.getContext(), zzehVar));
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzh() {
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzf();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzi() {
        if (this.f10827c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzm();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzj() {
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzg();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzk(AdListener adListener) {
        this.f10831g = adListener;
        this.f10829e.zza(adListener);
    }

    public final void zzl(@Nullable zza zzaVar) {
        try {
            this.f10830f = zzaVar;
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzy(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.f10832h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public final void zzn(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.f10836m;
        this.f10832h = adSizeArr;
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzo(a(viewGroup.getContext(), this.f10832h, this.f10837n));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        viewGroup.requestLayout();
    }

    public final void zzo(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void zzp(@Nullable AppEventListener appEventListener) {
        try {
            this.f10833i = appEventListener;
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzi(appEventListener != null ? new fi(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzq(boolean z10) {
        this.f10838o = z10;
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzz(z10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean zzr() {
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                return zzbuVar.zzA();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                return zzbuVar.zzB();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    @Nullable
    public final ResponseInfo zzt() {
        zzdx zzdxVarZzt = null;
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzdxVarZzt = zzbuVar.zzt();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdxVarZzt);
    }

    public final void zzu(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.f10839p = onPaidEventListener;
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final long zzv() {
        AtomicLong atomicLong = this.f10840q;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                atomicLong.set(zzbuVar.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        return 0L;
    }

    public final void zzw(long j10) {
        this.f10840q.set(j10);
        try {
            zzbu zzbuVar = this.f10834j;
            if (zzbuVar != null) {
                zzbuVar.zzT(j10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Nullable
    public final OnPaidEventListener zzx() {
        return this.f10839p;
    }

    public final VideoController zzy() {
        return this.f10828d;
    }

    @Nullable
    public final zzea zzz() {
        zzbu zzbuVar = this.f10834j;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzF();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzq.zza, 0);
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzq.zza, i10);
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzq zzqVar, int i10) {
        zzr zzrVar;
        this.f10825a = new qt();
        this.f10828d = new VideoController();
        this.f10829e = new zzei(this);
        this.f10840q = new AtomicLong();
        this.f10836m = viewGroup;
        this.f10826b = zzqVar;
        this.f10834j = null;
        this.f10827c = new AtomicBoolean(false);
        this.f10837n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.f10832h = zzzVar.zza(z10);
                this.l = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZza = zzay.zza();
                    AdSize adSize = this.f10832h[0];
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.zzj = i10 == 1;
                    }
                    zzfVarZza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                zzay.zza().zzb(viewGroup, new zzr(context, AdSize.BANNER), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
