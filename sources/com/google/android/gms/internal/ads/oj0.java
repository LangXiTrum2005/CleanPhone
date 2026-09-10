package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 implements zzr, y30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f18282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lj0 f18283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b30 f18284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzdk f18288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18289i;

    public oj0(Context context, VersionInfoParcel versionInfoParcel) {
        this.f18281a = context;
        this.f18282b = versionInfoParcel;
    }

    public final synchronized void a(zzdk zzdkVar, pq pqVar, wq wqVar, pq pqVar2) {
        if (c(zzdkVar)) {
            try {
                zzt.zzd();
                b30 b30VarA = l30.a(this.f18281a, new t0(0, 0, 0), "", false, false, null, null, this.f18282b, null, null, new pj(), null, null, null, null, null);
                this.f18284d = b30VarA;
                g30 g30VarZzP = b30VarA.zzP();
                if (g30VarZzP == null) {
                    int i10 = zze.zza;
                    zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        zzt.zzh().d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdkVar.zze(pi1.C(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        zzt.zzh().d("InspectorUi.openInspector 3", e10);
                        return;
                    }
                }
                this.f18288h = zzdkVar;
                Context context = this.f18281a;
                g30VarZzP.J(null, null, null, null, null, false, null, null, null, null, null, null, null, pqVar, null, new eq(context, 5), wqVar, pqVar2, null, null, null, null);
                g30VarZzP.f14700g = this;
                this.f18284d.loadUrl((String) zzba.zzc().a(am.f12407wa));
                zzt.zzb();
                zzn.zza(context, new AdOverlayInfoParcel(this, this.f18284d, 1, this.f18282b), true, null);
                ((p9.b) zzt.zzk()).getClass();
                this.f18287g = System.currentTimeMillis();
            } catch (k30 e11) {
                int i11 = zze.zza;
                zzo.zzj("Failed to obtain a web view for the ad inspector", e11);
                try {
                    zzt.zzh().d("InspectorUi.openInspector 0", e11);
                    zzdkVar.zze(pi1.C(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    zzt.zzh().d("InspectorUi.openInspector 1", e12);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f18285e && this.f18286f) {
            l00.f16613f.execute(new x60(this, 11));
        }
    }

    public final synchronized boolean c(zzdk zzdkVar) {
        if (!((Boolean) zzba.zzc().a(am.f12393va)).booleanValue()) {
            int i10 = zze.zza;
            zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdkVar.zze(pi1.C(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f18283c == null) {
            int i11 = zze.zza;
            zzo.zzi("Ad inspector had an internal error.");
            try {
                zzt.zzh().d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdkVar.zze(pi1.C(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f18285e && !this.f18286f) {
            ((p9.b) zzt.zzk()).getClass();
            if (System.currentTimeMillis() >= this.f18287g + ((long) ((Integer) zzba.zzc().a(am.f12440ya)).intValue())) {
                return true;
            }
        }
        int i12 = zze.zza;
        zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdkVar.zze(pi1.C(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            zze.zza("Ad inspector loaded.");
            this.f18285e = true;
            b();
            return;
        }
        int i11 = zze.zza;
        zzo.zzi("Ad inspector failed to load.");
        try {
            f00 f00VarZzh = zzt.zzh();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i10);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            f00VarZzh.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb2.toString()));
            zzdk zzdkVar = this.f18288h;
            if (zzdkVar != null) {
                zzdkVar.zze(pi1.C(17, null, null));
            }
        } catch (RemoteException e10) {
            zzt.zzh().d("InspectorUi.onAdWebViewFinishedLoading 1", e10);
        }
        this.f18289i = true;
        this.f18284d.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdU(int i10) {
        this.f18284d.destroy();
        if (!this.f18289i) {
            zze.zza("Inspector closed.");
            zzdk zzdkVar = this.f18288h;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f18286f = false;
        this.f18285e = false;
        this.f18287g = 0L;
        this.f18289i = false;
        this.f18288h = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.f18286f = true;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
