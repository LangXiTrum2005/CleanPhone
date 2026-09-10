package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.appset.AppSetIdInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i6 implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i6 f15602b = new i6(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i6 f15603c = new i6(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i6 f15604d = new i6(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i6 f15605e = new i6(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i6 f15606f = new i6(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i6 f15607g = new i6(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i6 f15608h = new i6(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i6 f15609i = new i6(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i6 f15610j = new i6(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i6 f15611k = new i6(10);
    public static final /* synthetic */ i6 l = new i6(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i6 f15612m = new i6(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ i6 f15613n = new i6(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ i6 f15614o = new i6(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ i6 f15615p = new i6(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ i6 f15616q = new i6(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ i6 f15617r = new i6(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i6 f15618s = new i6(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i6 f15619t = new i6(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i6 f15620u = new i6(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i6 f15621v = new i6(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i6 f15622w = new i6(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i6 f15623x = new i6(24);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i6 f15624y = new i6(25);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ i6 f15625z = new i6(26);
    public static final /* synthetic */ i6 A = new i6(27);
    public static final /* synthetic */ i6 B = new i6(28);
    public static final /* synthetic */ i6 C = new i6(29);

    public /* synthetic */ i6(int i10) {
        this.f15626a = i10;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final Object apply(Object obj) {
        switch (this.f15626a) {
            case 0:
                return (w6) obj;
            case 1:
                w6 w6Var = (w6) obj;
                int i10 = r6.G;
                return w6Var;
            case 2:
                Throwable th2 = (Throwable) obj;
                iq iqVar = nq.f17890a;
                if (((Boolean) en.f14025i.o()).booleanValue()) {
                    zzt.zzh().d("prepareClickUrl.attestation1", th2);
                }
                return "failure_click_attok";
            case 3:
                List list = zy.l;
                return null;
            case 4:
                return "failure_click_attok";
            case 5:
                return new p80((m80) obj);
            case 6:
                return new p80((List) obj);
            case 7:
                m91 m91Var = a90.f11940a;
                return Integer.valueOf(((l80) obj).f16811p);
            case 8:
                ArrayList arrayList = new ArrayList();
                for (yn ynVar : (List) obj) {
                    if (ynVar != null) {
                        arrayList.add(ynVar);
                    }
                }
                return arrayList;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                for (vf0 vf0Var : (List) obj) {
                    if (vf0Var != null) {
                        arrayList2.add(vf0Var);
                    }
                }
                return arrayList2;
            case 10:
                return Collections.singletonList(zw1.d((ee0) obj));
            case 11:
                ArrayList arrayList3 = (ArrayList) obj;
                return new eq0(true != arrayList3.isEmpty() ? arrayList3 : null, 1);
            case 12:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return new nq0(appSetIdInfo.getId(), appSetIdInfo.getScope(), 0);
            case 13:
                return new yp0((String) obj, 5);
            case 14:
                return new fq0(4, (Bundle) obj);
            case 15:
                return new yp0((String) obj, 6);
            case 16:
                return null;
            case 17:
                return (gt0) obj;
            case 18:
                String str = ((ku0) obj).f16525b;
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return zzl.zzj() ? "fakeForAdDebugLog" : str;
            case 19:
                String str2 = ((ku0) obj).f16524a;
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                return zzl.zzj() ? "fakeForAdDebugLog" : str2;
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return f51.f14251a;
            case 23:
                return Boolean.FALSE;
            case 24:
                return null;
            case 25:
                return f51.f14253c;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return f51.f14255e;
            case 27:
                return f51.f14254d;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return null;
            default:
                return null;
        }
    }
}
