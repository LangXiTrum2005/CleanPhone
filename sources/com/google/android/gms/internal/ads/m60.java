package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f17306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm0 f17307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh0 f17308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fe1 f17309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fe1 f17310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f17311g;

    public m60(Context context, zzj zzjVar, lm0 lm0Var, hh0 hh0Var, fe1 fe1Var, fe1 fe1Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f17305a = context;
        this.f17306b = zzjVar;
        this.f17307c = lm0Var;
        this.f17308d = hh0Var;
        this.f17309e = fe1Var;
        this.f17310f = fe1Var2;
        this.f17311g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzba.zzc().a(am.Ob));
    }

    public final ListenableFuture a(String str, Random random) {
        return TextUtils.isEmpty(str) ? zw1.d(str) : zw1.u(c(str, this.f17308d.f15292a, random), Throwable.class, new mq(this, str, 1), this.f17309e);
    }

    public final ListenableFuture c(String str, MotionEvent motionEvent, Random random) {
        ListenableFuture listenableFutureL;
        try {
            if (!str.contains((CharSequence) zzba.zzc().a(am.Ob)) || this.f17306b.zzx()) {
                return zw1.d(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(am.Pb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(am.Qb), "11");
                return zw1.d(builderBuildUpon.toString());
            }
            lm0 lm0Var = this.f17307c;
            lm0Var.getClass();
            try {
                b4.d dVarB = b4.d.b(lm0Var.f17061b);
                lm0Var.f17060a = dVarB;
                listenableFutureL = dVarB == null ? zw1.l(new IllegalStateException("MeasurementManagerFutures is null")) : dVarB.c();
            } catch (Exception e10) {
                listenableFutureL = zw1.l(e10);
            }
            return zw1.u(zw1.x(vd1.r(listenableFutureL), new ft(1, this, builderBuildUpon, motionEvent, str), this.f17310f), Throwable.class, new ht(2, this, builderBuildUpon), this.f17309e);
        } catch (Exception e11) {
            return zw1.l(e11);
        }
    }
}
