package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15386c;

    public /* synthetic */ ht(int i10, Object obj, Object obj2) {
        this.f15384a = i10;
        this.f15385b = obj;
        this.f15386c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) throws JSONException, zs {
        eo0 eo0Var;
        int i10 = 23;
        fv0 fv0Var = null;
        int i11 = 0;
        switch (this.f15384a) {
            case 0:
                xs xsVar = (xs) obj;
                xsVar.z((String) this.f15385b, (oq) this.f15386c);
                return zw1.d(xsVar);
            case 1:
                mt mtVar = (mt) this.f15385b;
                Object obj2 = this.f15386c;
                m00 m00Var = new m00();
                zzt.zzc();
                String string = UUID.randomUUID().toString();
                nq.f17899j.a(string, new xq(mtVar, m00Var));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) obj2);
                js jsVar = (js) ((xs) obj);
                jsVar.getClass();
                jsVar.a("google.afma.activeView.handleUpdate", jSONObject.toString());
                return m00Var;
            case 2:
                m60 m60Var = (m60) this.f15385b;
                Uri.Builder builder = (Uri.Builder) this.f15386c;
                ((k00) m60Var.f17309e).a(new l60(m60Var, (Throwable) obj, 0));
                builder.appendQueryParameter((String) zzba.zzc().a(am.Qb), "9");
                return zw1.d(builder.toString());
            case 3:
                v80 v80Var = (v80) this.f15385b;
                mx mxVar = (mx) obj;
                mxVar.f17574i = (ev0) this.f15386c;
                vu0 vu0Var = v80Var.f21109h;
                return vu0Var.t(mxVar, new x11((uk0) vu0Var.f21275c, 19), new b21(vu0Var, i10), new fk0(mxVar, 2));
            case 4:
                bg0 bg0Var = (bg0) this.f15385b;
                JSONObject jSONObject2 = (JSONObject) this.f15386c;
                b30 b30Var = (b30) obj;
                bs bsVar = bg0Var.f12765a.f18361b;
                kj kjVar = new kj(b30Var);
                if (bsVar != null) {
                    b30Var.F(new t0(5, 0, 0));
                } else {
                    b30Var.F(new t0(4, 0, 0));
                }
                b30Var.zzP().f14700g = new zf0(bg0Var, b30Var, kjVar, 1);
                b30Var.b("google.afma.nativeAds.renderVideo", jSONObject2);
                return kjVar;
            case 5:
                nk0 nk0Var = (nk0) this.f15385b;
                ft ftVar = (ft) this.f15386c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), nk0Var.f17854i, "scar-preloader-processing-done");
                }
                return ftVar.a(jSONObject3);
            case 6:
                nk0 nk0Var2 = (nk0) this.f15385b;
                List list = (List) this.f15386c;
                Exception exc = (Exception) obj;
                zzt.zzh().e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    eo0Var = new eo0(1, "Timed out waiting for ad response.");
                } else if (exc instanceof eo0) {
                    eo0Var = (eo0) exc;
                } else {
                    eo0Var = new eo0(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = eo0Var.getMessage() == null ? "" : eo0Var.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listM = t6.l.h(new z71(':')).m(message);
                            if (listM.size() == 2) {
                                message = (String) listM.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(lx0.c(lx0.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    nk0Var2.f17855j.a(arrayList, null);
                }
                return zw1.l(eo0Var);
            case 7:
                return ((xk0) ((kx1) this.f15385b).zzb()).a((mx) this.f15386c);
            case 8:
                Bundle bundle = (Bundle) obj;
                z40 z40Var = (z40) this.f15385b;
                e60 e60Var = (e60) z40Var.f22493c;
                a50 a50Var = (a50) z40Var.f22492b;
                Context context = a50Var.f11852a.f15966b;
                ic1.h(context);
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                ic1.h(k00Var);
                ic1.h(((mx) ((ps0) e60Var.f13858b).f18793b.f5411c).f17569d);
                os0 os0Var = new os0();
                fx1 fx1Var = a50Var.f11858d;
                vp0 vp0Var = new vp0(os0Var, 0L, (ScheduledExecutorService) fx1Var.zzb());
                w70 w70Var = (w70) z40Var.f22494d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) w70Var.f21437b.zzb();
                ((o40) w70Var.f21438c).a();
                vp0 vp0Var2 = new vp0(new qp0(scheduledExecutorService, 7), ((Long) zzba.zzc().a(am.f12253m5)).longValue(), (ScheduledExecutorService) fx1Var.zzb());
                vp0 vp0Var3 = new vp0(((d80) z40Var.f22495e).c(), 0L, (ScheduledExecutorService) fx1Var.zzb());
                ic1.h(k00Var);
                vp0 vp0Var4 = new vp0(new yq0(k00Var, 5), 0L, (ScheduledExecutorService) fx1Var.zzb());
                er0 er0Var = (er0) z40Var.f22496f;
                ic1.h(k00Var);
                ((o40) er0Var.f14059b).a();
                yq0 yq0Var = new yq0(k00Var, 4);
                b2.w wVar = (b2.w) z40Var.f22491a;
                ic1.h(k00Var);
                List list2 = ((mx) wVar.f5411c).f17570e;
                ic1.h(list2);
                jq0 jq0Var = new jq0(6, k00Var, list2);
                b2.w wVar2 = (b2.w) z40Var.f22491a;
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                mx mxVar2 = (mx) wVar2.f5411c;
                String string2 = mxVar2.f17566a.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = mxVar2.f17571f;
                return new hz(context, k00Var, ia1.t(vp0Var, vp0Var2, vp0Var3, vp0Var4, yq0Var, jq0Var, new jq0(5, k00Var2, string2), (bs0) a50Var.O0.zzb(), ((fz) z40Var.f22497g).c(), ((d80) z40Var.f22498h).d()), (jw0) ((fx1) z40Var.f22499i).zzb()).b(((mx) this.f15386c).f17577m, zzay.zza().zzo(bundle));
            case 9:
                return ((hz) this.f15385b).b(((mx) this.f15386c).f17577m, zzay.zza().zzo((Bundle) obj));
            case 10:
                rn0 rn0Var = (rn0) this.f15385b;
                ng0 ng0Var = (ng0) this.f15386c;
                JSONObject jSONObject4 = (JSONObject) obj;
                xu0 xu0Var = rn0Var.f19625d;
                be1 be1VarD = zw1.d(ng0Var);
                synchronized (xu0Var) {
                    xu0Var.f22005a.addFirst(be1VarD);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new zs("process json failed", 0);
                }
                if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-native-ads-preprocess-end");
                }
                return zw1.d(jSONObject4.getJSONObject("json").getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS));
            case 11:
                rn0 rn0Var2 = (rn0) this.f15385b;
                du0 du0Var = (du0) this.f15386c;
                ng0 ng0Var2 = (ng0) obj;
                if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var2.f19627f, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) zzba.zzc().a(am.f12086ba)).booleanValue()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(Ve.f27442n, du0Var.f13708s.f15396c);
                jSONObject6.put("sdk_params", jSONObject5);
                return zw1.x(ng0Var2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new ht(10, rn0Var2, ng0Var2), rn0Var2.f19623b);
            case 12:
                ju0 ju0Var = (ju0) obj;
                ((fv0) this.f15385b).f14568b = ju0Var;
                Iterator it2 = ((List) ju0Var.f16196b.f20919c).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((du0) it2.next()).f13675a.iterator();
                    while (it3.hasNext()) {
                        if (!((String) it3.next()).contains("FirstPartyRenderer")) {
                            return be1.f12743b;
                        }
                        i11 = 1;
                    }
                }
                if (i11 != 0) {
                    return ((v80) this.f15386c).c(zw1.d(ju0Var));
                }
                return be1.f12743b;
            case 13:
                vu0 vu0Var2 = (vu0) this.f15385b;
                u90 u90Var = (u90) this.f15386c;
                gt0 gt0Var = (gt0) obj;
                vu0 vu0Var3 = (vu0) vu0Var2.f21274b;
                gv0 gv0Var = gt0Var.f14954b;
                mx mxVar3 = gt0Var.f14953a;
                synchronized (vu0Var3) {
                    try {
                        av0 av0Var = (av0) ((ConcurrentHashMap) vu0Var3.f21274b).get(gv0Var);
                        if (av0Var != null) {
                            nv0 nv0Var = av0Var.f12530d;
                            nv0Var.getClass();
                            ((p9.b) zzt.zzk()).getClass();
                            nv0Var.f18002d = System.currentTimeMillis();
                            nv0Var.f17999a++;
                            av0Var.a();
                            LinkedList linkedList = av0Var.f12527a;
                            if (!linkedList.isEmpty() && (fv0Var = (fv0) linkedList.remove()) != null) {
                                nv0Var.f18000b++;
                                ((mv0) nv0Var.f18004f).f17552a = true;
                            }
                            if (fv0Var == null) {
                                ((ma) vu0Var3.f21276d).f17363d++;
                            }
                            mv0 mv0Var = (mv0) av0Var.f12530d.f18004f;
                            mv0 mv0VarClone = mv0Var.clone();
                            mv0Var.f17552a = false;
                            mv0Var.f17553b = 0;
                            if (fv0Var != null) {
                                ok okVarZ = tk.z();
                                mk mkVarA = nk.A();
                                mkVarA.b();
                                ((nk) mkVarA.f19193b).B();
                                pk pkVarZ = qk.z();
                                boolean z10 = mv0VarClone.f17552a;
                                pkVarZ.b();
                                ((qk) pkVarZ.f19193b).B(z10);
                                int i12 = mv0VarClone.f17553b;
                                pkVarZ.b();
                                ((qk) pkVarZ.f19193b).C(i12);
                                mkVarA.b();
                                ((nk) mkVarA.f19193b).C((qk) pkVarZ.e());
                                okVarZ.b();
                                ((tk) okVarZ.f19193b).A((nk) mkVarA.e());
                                fv0Var.f14567a.zza().f21107f.e((tk) okVarZ.e());
                            }
                            vu0Var3.s();
                        } else {
                            ((ma) vu0Var3.f21276d).f17362c++;
                            vu0Var3.s();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fv0Var != null && mxVar3 != null) {
                    v80 v80VarZza = u90Var.zza();
                    vu0 vu0Var4 = v80VarZza.f21109h;
                    uv0 uv0VarM = v80VarZza.f21104c.a(vu0Var4.t(mxVar3, new vf(vu0Var4, i10), new so0(vu0Var4, 27), c60.f13061f), vv0.NOTIFY_CACHE_HIT).m();
                    uv0VarM.addListener(new zd1(i11, uv0VarM, new x11(v80VarZza, 11)), v80VarZza.f21111j);
                    uv0VarM.addListener(new zd1(i11, uv0VarM, (tc0) vu0Var2.f21276d), (Executor) vu0Var2.f21275c);
                }
                return zw1.d(new dt0(gv0Var, mxVar3, fv0Var));
            default:
                return ((m31) ((f21) this.f15385b).f14180b.f18916f.get()).a((Context) this.f15386c);
        }
    }
}
