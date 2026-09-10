package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iq f17890a = new iq(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final iq f17891b = new iq(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final iq f17892c = new iq(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final iq f17893d = new iq(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final iq f17894e = new iq(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final iq f17895f = new iq(17);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v10 f17896g = new v10();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final iq f17897h = new iq(25);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hq f17898i = new hq();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final lq f17899j = new lq();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final iq f17900k = new iq(18);
    public static final iq l = new iq(19);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final iq f17901m = new iq(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final iq f17902n = new iq(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final iq f17903o = new iq(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final iq f17904p = new iq(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final iq f17905q = new iq(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final iq f17906r = new iq(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final iq f17907s = new iq(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final iq f17908t = new iq(7);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final iq f17909u = new iq(8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final iq f17910v = new iq(9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final iq f17911w = new iq(10);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final iq f17912x = new iq(11);

    /* JADX WARN: Code duplicated, block: B:36:0x011a  */
    public static ListenableFuture a(b30 b30Var, String str) {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            qf qfVarM0 = b30Var.m0();
            pu0 pu0VarZzT = b30Var.zzT();
            if (!((Boolean) zzba.zzc().a(am.Hd)).booleanValue() || pu0VarZzT == null) {
                if (qfVarM0 != null && qfVarM0.a(uriB)) {
                    uriB = qfVarM0.b(uriB, b30Var.getContext(), b30Var.zzE(), b30Var.zzj());
                }
            } else if (qfVarM0 != null && qfVarM0.a(uriB)) {
                uriB = pu0VarZzT.a(uriB, b30Var.getContext(), b30Var.zzE(), b30Var.zzj());
            }
        } catch (rf unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = zze.zza;
            zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (b30Var.zzC() != null) {
            map = b30Var.zzC().f13716w0;
        }
        Context context = b30Var.getContext();
        if (zzt.zzD().a(context) && (strD = zzt.zzD().d(context)) != null) {
            String str2 = (String) zzba.zzc().a(am.Z0);
            String string = uriB.toString();
            if (((Boolean) zzba.zzc().a(am.Y0)).booleanValue() && string.contains(str2)) {
                kz kzVarZzD = zzt.zzD();
                Map map2 = (Map) map.get("_ac");
                kzVarZzD.getClass();
                kzVarZzD.h(context, "_ac", strD, kz.f(map2));
                strReplace = rb0.z(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid"))) {
                strReplace = string;
            } else if (((Boolean) zzba.zzc().a(am.X0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = rb0.u(rb0.z(context, string), "fbs_aeid", strD).toString();
                kz kzVarZzD2 = zzt.zzD();
                Map map3 = (Map) map.get("_ac");
                kzVarZzD2.getClass();
                kzVarZzD2.h(context, "_ac", strD, kz.f(map3));
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) en.f14021e.o()).longValue();
        if (jLongValue <= 0 || jLongValue > 254730000) {
            return zw1.d(strReplace);
        }
        vd1 vd1VarR = vd1.r(b30Var.o());
        i6 i6Var = i6.f15603c;
        k00 k00Var = l00.f16615h;
        return zw1.t(zw1.z(zw1.t(vd1VarR, Throwable.class, i6Var, k00Var), new kq(strReplace, 0), k00Var), Throwable.class, new kq(strReplace, 1), k00Var);
    }

    public static void b(Map map, qc0 qc0Var) {
        if (((Boolean) zzba.zzc().a(am.f12333rc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && qc0Var != null) {
            qc0Var.C();
        }
    }
}
