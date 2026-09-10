package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 implements mb0, ta0, ha0, na0, zza, wb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pj f19082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19083b = false;

    public qh0(pj pjVar, nt0 nt0Var) {
        this.f19082a = pjVar;
        pjVar.b(2);
        if (nt0Var != null) {
            pjVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void Y(boolean z10) {
        this.f19082a.b(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void b0(boolean z10) {
        this.f19082a.b(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void e(tk tkVar) {
        pj pjVar = this.f19082a;
        synchronized (pjVar) {
            if (pjVar.f18694c) {
                try {
                    pjVar.f18693b.h(tkVar);
                } catch (NullPointerException e10) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        pjVar.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(zze zzeVar) {
        int i10 = zzeVar.zza;
        pj pjVar = this.f19082a;
        switch (i10) {
            case 1:
                pjVar.b(InterfaceC0435l1.d.b.f29105b);
                break;
            case 2:
                pjVar.b(InterfaceC0435l1.d.b.f29106c);
                break;
            case 3:
                pjVar.b(5);
                break;
            case 4:
                pjVar.b(InterfaceC0435l1.d.b.f29107d);
                break;
            case 5:
                pjVar.b(InterfaceC0435l1.d.b.f29108e);
                break;
            case 6:
                pjVar.b(InterfaceC0435l1.d.b.f29109f);
                break;
            case 7:
                pjVar.b(106);
                break;
            default:
                pjVar.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final synchronized void k() {
        this.f19082a.b(6);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.f19083b) {
            this.f19082a.b(8);
        } else {
            this.f19082a.b(7);
            this.f19083b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void u0(tk tkVar) {
        pj pjVar = this.f19082a;
        synchronized (pjVar) {
            if (pjVar.f18694c) {
                try {
                    pjVar.f18693b.h(tkVar);
                } catch (NullPointerException e10) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        pjVar.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void v0(tk tkVar) {
        pj pjVar = this.f19082a;
        synchronized (pjVar) {
            if (pjVar.f18694c) {
                try {
                    pjVar.f18693b.h(tkVar);
                } catch (NullPointerException e10) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        pjVar.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        this.f19082a.a(new kb0(ju0Var));
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        this.f19082a.b(3);
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void zzo() {
        this.f19082a.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
    }
}
