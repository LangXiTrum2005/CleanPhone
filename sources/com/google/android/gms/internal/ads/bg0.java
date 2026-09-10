package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou0 f12765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f12766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh0 f12767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg0 f12768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yh0 f12770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mx0 f12771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ul0 f12772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wh0 f12773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ji0 f12774j;

    public bg0(ou0 ou0Var, Executor executor, eh0 eh0Var, Context context, yh0 yh0Var, mx0 mx0Var, ul0 ul0Var, rg0 rg0Var, wh0 wh0Var, ji0 ji0Var) {
        this.f12765a = ou0Var;
        this.f12766b = executor;
        this.f12767c = eh0Var;
        this.f12769e = context;
        this.f12770f = yh0Var;
        this.f12771g = mx0Var;
        this.f12772h = ul0Var;
        this.f12768d = rg0Var;
        this.f12773i = wh0Var;
        this.f12774j = ji0Var;
    }

    public static final void b(b30 b30Var) {
        b30Var.D("/videoClicked", nq.f17893d);
        g30 g30VarZzP = b30Var.zzP();
        synchronized (g30VarZzP.f14697d) {
            g30VarZzP.f14710r = true;
        }
        b30Var.D("/getNativeAdViewSignals", nq.f17902n);
        b30Var.D("/getNativeClickMeta", nq.f17903o);
    }

    public final void a(b30 b30Var, zzb zzbVar, bz bzVar) {
        ji0 ji0Var;
        b(b30Var);
        b30Var.D("/video", nq.f17896g);
        b30Var.D("/videoMeta", nq.f17897h);
        b30Var.D("/precache", new iq(26));
        b30Var.D("/delayPageLoaded", nq.f17900k);
        b30Var.D("/instrument", nq.f17898i);
        b30Var.D("/log", nq.f17892c);
        b30Var.D("/click", new lq(0, null, null));
        if (this.f12765a.f18361b != null) {
            g30 g30VarZzP = b30Var.zzP();
            synchronized (g30VarZzP.f14697d) {
                g30VarZzP.f14712t = true;
            }
            b30Var.D("/open", new vq(true != ((Boolean) zzba.zzc().a(am.f12352sf)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            g30 g30VarZzP2 = b30Var.zzP();
            synchronized (g30VarZzP2.f14697d) {
                g30VarZzP2.f14712t = false;
            }
        }
        if (zzt.zzD().a(b30Var.getContext())) {
            Object map = new HashMap();
            if (b30Var.zzC() != null) {
                map = b30Var.zzC().f13716w0;
            }
            b30Var.D("/logScionEvent", new lq(1, b30Var.getContext(), map));
        }
        if (((Boolean) zzba.zzc().a(am.f12352sf)).booleanValue()) {
            b30Var.zzP().f14715w = zzbVar;
            b30Var.zzP().f14717y = bzVar;
        }
        if (!((Boolean) zzba.zzc().a(am.Q8)).booleanValue() || (ji0Var = this.f12774j) == null) {
            return;
        }
        b30Var.D("/onDeviceStorageEvent", new eq(ji0Var, 3));
    }
}
