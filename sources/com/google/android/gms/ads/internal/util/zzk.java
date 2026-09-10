package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.jc1;
import com.google.android.gms.internal.ads.mm;
import com.google.android.gms.internal.ads.nm;
import com.google.android.gms.internal.ads.nx1;
import u.h;
import u.i;
import u.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzk implements mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f11153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f11154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f11155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f11156d;

    public zzk(zzs zzsVar, nm nmVar, Bundle bundle, Context context, Uri uri) {
        this.f11153a = nmVar;
        this.f11154b = bundle;
        this.f11155c = context;
        this.f11156d = uri;
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zza() {
        nm nmVar = this.f11153a;
        j jVar = nmVar.f17862b;
        if (jVar == null) {
            nmVar.f17861a = null;
        } else if (nmVar.f17861a == null) {
            nmVar.f17861a = jVar.c(null);
        }
        h hVar = new h(nmVar.f17861a);
        zzs.d(hVar, this.f11154b);
        i iVarA = hVar.a();
        Intent intent = iVarA.f51639a;
        Context context = this.f11155c;
        intent.setPackage(jc1.c(context));
        iVarA.a(context, this.f11156d);
        Activity activity = (Activity) context;
        nx1 nx1Var = nmVar.f17863c;
        if (nx1Var == null) {
            return;
        }
        activity.unbindService(nx1Var);
        nmVar.f17862b = null;
        nmVar.f17861a = null;
        nmVar.f17863c = null;
    }
}
