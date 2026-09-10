package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 implements mb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f21193b;

    public vk0(Context context, kz kzVar) {
        this.f21192a = context;
        this.f21193b = kzVar;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        String str = ((fu0) ju0Var.f16196b.f20920d).f14549e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kz kzVar = this.f21193b;
        Context context = this.f21192a;
        kzVar.getClass();
        if (((Boolean) zzba.zzc().a(am.h1)).booleanValue() && kzVar.a(context) && kz.g(context)) {
            synchronized (kzVar.f16575j) {
            }
        }
        kzVar.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
    }
}
