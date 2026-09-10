package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ur0 implements bs0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fr0 f20864j = new fr0(new JSONArray().toString(), new Bundle(), "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe1 f20865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f20866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo0 f20867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f20868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ou0 f20869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vo0 f20870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nh0 f20871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zi0 f20872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20873i;

    public ur0(fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, String str, yo0 yo0Var, Context context, ou0 ou0Var, vo0 vo0Var, nh0 nh0Var, zi0 zi0Var) {
        this.f20865a = fe1Var;
        this.f20866b = scheduledExecutorService;
        this.f20873i = str;
        this.f20867c = yo0Var;
        this.f20868d = context;
        this.f20869e = ou0Var;
        this.f20870f = vo0Var;
        this.f20871g = nh0Var;
        this.f20872h = zi0Var;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            bp0 bp0Var = (bp0) ((Map.Entry) it.next()).getValue();
            String str = bp0Var.f12837a;
            Bundle bundle = this.f20869e.f18363d.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            ur0 ur0Var = this;
            arrayList.add(ur0Var.b(str, Collections.singletonList(bp0Var.f12841e), bundle2, bp0Var.f12838b, bp0Var.f12839c));
            this = ur0Var;
        }
    }

    public final vd1 b(String str, List list, Bundle bundle, boolean z10, boolean z11) {
        sr0 sr0Var = new sr0(this, str, list, bundle, z10, z11);
        fe1 fe1Var = this.f20865a;
        vd1 vd1VarR = vd1.r(zw1.r(sr0Var, fe1Var));
        if (!((Boolean) zzba.zzc().a(am.f12295p2)).booleanValue()) {
            vd1VarR = (vd1) zw1.v(vd1VarR, ((Long) zzba.zzc().a(am.f12190i2)).longValue(), TimeUnit.MILLISECONDS, this.f20866b);
        }
        return zw1.t(vd1VarR, Throwable.class, new kq(str, 3), fe1Var);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        ou0 ou0Var = this.f20869e;
        if (ou0Var.f18377s) {
            if (!Arrays.asList(((String) zzba.zzc().a(am.f12387v2)).split(",")).contains(zzv.zzb(zzv.zzc(ou0Var.f18363d)))) {
                return zw1.d(f20864j);
            }
        }
        return zw1.r(new b21(this, 29), this.f20865a);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 32;
    }
}
