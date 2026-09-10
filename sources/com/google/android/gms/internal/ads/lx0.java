package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo0 f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ku0 f17145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mu0 f17146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p9.a f17147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qf f17148i;

    public lx0(bo0 bo0Var, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, ku0 ku0Var, mu0 mu0Var, p9.a aVar, qf qfVar) {
        this.f17140a = bo0Var;
        this.f17141b = versionInfoParcel.afmaVersion;
        this.f17142c = str;
        this.f17143d = str2;
        this.f17144e = context;
        this.f17145f = ku0Var;
        this.f17146g = mu0Var;
        this.f17147h = aVar;
        this.f17148i = qfVar;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(ju0 ju0Var, du0 du0Var, List list) {
        return b(ju0Var, du0Var, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    public final ArrayList b(ju0 ju0Var, du0 du0Var, boolean z10, String str, String str2, List list, n90 n90Var, t0 t0Var) {
        String str3;
        String str4;
        long j10;
        boolean z11;
        String str5 = "1";
        String str6 = "0";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strC = c(c(c((String) it.next(), "@gw_adlocid@", ((ou0) ju0Var.f16195a.f20839b).f18366g), "@gw_adnetrefresh@", true != z10 ? str6 : str5), "@gw_sdkver@", this.f17141b);
            if (du0Var != 0) {
                String strC2 = c(c(c(strC, "@gw_qdata@", du0Var.f13719y), "@gw_adnetid@", du0Var.f13717x), "@gw_allocid@", du0Var.f13715w);
                Context context = this.f17144e;
                strC = rb0.e(strC2, context, du0Var.W, du0Var.f13716w0);
                if (((Boolean) zzba.zzc().a(am.lf)).booleanValue() && du0Var.f13683e == 4) {
                    zzt.zzc();
                    strC = c(strC, "@gw_aps@", true != zzs.zzJ(context) ? str6 : str5);
                }
                if (((Boolean) zzba.zzc().a(am.f12412wf)).booleanValue() && t0Var != null) {
                    int i10 = t0Var.f20103a;
                    String strC3 = c(strC, "@gw_is@", i10 >= 0 ? Integer.toString(i10) : "");
                    int i11 = t0Var.f20104b;
                    String strC4 = c(strC3, "@gw_fis@", i11 >= 0 ? Integer.toString(i11) : "");
                    int i12 = t0Var.f20105c;
                    strC = c(strC4, "@gw_sfis@", i12 >= 0 ? Integer.toString(i12) : "");
                }
            }
            bo0 bo0Var = this.f17140a;
            String strC5 = c(strC, "@gw_adnetstatus@", bo0Var.d());
            synchronized (bo0Var) {
                str3 = str5;
                str4 = str6;
                j10 = bo0Var.f12834h;
            }
            String strC6 = c(c(c(strC5, "@gw_ttr@", Long.toString(j10, 10)), "@gw_seqnum@", this.f17142c), "@gw_sessid@", this.f17143d);
            if (((Boolean) zzba.zzc().a(am.f12383uf)).booleanValue()) {
                if (n90Var != 0) {
                    AtomicLong atomicLong = n90Var.f17723a;
                    if (atomicLong.get() > 0) {
                        strC6 = c(strC6, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    } else {
                        strC6 = c(strC6, "@gw_placement_id@", "");
                    }
                } else {
                    strC6 = c(strC6, "@gw_placement_id@", "");
                }
            }
            boolean z12 = false;
            if (((Boolean) zzba.zzc().a(am.B4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z13 = !zIsEmpty;
            if (z12) {
                z11 = z13;
            } else {
                if (!zIsEmpty) {
                    z11 = true;
                }
                arrayList.add(strC6);
                str5 = str3;
                str6 = str4;
            }
            if (this.f17148i.a(Uri.parse(strC6))) {
                Uri.Builder builderBuildUpon = Uri.parse(strC6).buildUpon();
                if (z12) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strC6 = builderBuildUpon.build().toString();
            }
            arrayList.add(strC6);
            str5 = str3;
            str6 = str4;
        }
        return arrayList;
    }
}
