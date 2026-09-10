package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends zzbp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a50 f13612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nu0 f13613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a8 f13614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzbh f13615e;

    public dp0(a50 a50Var, Context context, String str) {
        nu0 nu0Var = new nu0();
        this.f13613c = nu0Var;
        this.f13614d = new a8();
        this.f13612b = a50Var;
        nu0Var.f17959c = str;
        this.f13611a = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        a8 a8Var = this.f13614d;
        a8Var.getClass();
        ne0 ne0Var = new ne0(a8Var);
        ArrayList arrayList = new ArrayList();
        if (ne0Var.f17783c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (ne0Var.f17781a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (ne0Var.f17782b != null) {
            arrayList.add(Integer.toString(2));
        }
        x.i iVar = ne0Var.f17786f;
        if (!iVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (ne0Var.f17785e != null) {
            arrayList.add(Integer.toString(7));
        }
        nu0 nu0Var = this.f13613c;
        nu0Var.f17962f = arrayList;
        ArrayList arrayList2 = new ArrayList(iVar.f53506c);
        for (int i10 = 0; i10 < iVar.f53506c; i10++) {
            arrayList2.add((String) iVar.f(i10));
        }
        nu0Var.f17963g = arrayList2;
        if (nu0Var.f17958b == null) {
            nu0Var.f17958b = zzr.zzb();
        }
        return new ep0(this.f13611a, this.f13612b, nu0Var, ne0Var, this.f13615e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) {
        this.f13615e = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(dp dpVar) {
        this.f13614d.f11926b = dpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(fp fpVar) {
        this.f13614d.f11925a = fpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, lp lpVar, ip ipVar) {
        a8 a8Var = this.f13614d;
        ((x.i) a8Var.f11930f).put(str, lpVar);
        if (ipVar != null) {
            ((x.i) a8Var.f11931g).put(str, ipVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(eo eoVar) {
        this.f13613c.f17964h = eoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(op opVar, zzr zzrVar) {
        this.f13614d.f11928d = opVar;
        this.f13613c.f17958b = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        nu0 nu0Var = this.f13613c;
        nu0Var.f17967k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            nu0Var.f17961e = publisherAdViewOptions.zza();
            nu0Var.l = publisherAdViewOptions.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(rp rpVar) {
        this.f13614d.f11927c = rpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(bs bsVar) {
        nu0 nu0Var = this.f13613c;
        nu0Var.f17969n = bsVar;
        nu0Var.f17960d = new zzfw(false, true, false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(gs gsVar) {
        this.f13614d.f11929e = gsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        nu0 nu0Var = this.f13613c;
        nu0Var.f17966j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            nu0Var.f17961e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) {
        this.f13613c.f17979x = zzcpVar;
    }
}
