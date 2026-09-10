package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18249e;

    public /* synthetic */ of0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18245a = i10;
        this.f18246b = obj;
        this.f18247c = obj2;
        this.f18248d = obj3;
        this.f18249e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws eo0 {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f18245a) {
            case 0:
                hz hzVar = (hz) this.f18246b;
                ju0 ju0Var = (ju0) this.f18247c;
                du0 du0Var = (du0) this.f18248d;
                JSONObject jSONObject = (JSONObject) this.f18249e;
                if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar.f15436e, "native-assets-loading-basic-start");
                }
                je0 je0Var = new je0();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (je0Var) {
                    je0Var.f16050a = iOptInt;
                }
                String strOptString = jSONObject.optString("custom_template_id");
                synchronized (je0Var) {
                    je0Var.f16069u = strOptString;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                synchronized (je0Var) {
                    je0Var.f16073y = strOptString2;
                }
                ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
                if (!ou0Var.f18367h.contains(Integer.toString(je0Var.q()))) {
                    int iQ = je0Var.q();
                    throw new eo0(1, l1.d.k(new StringBuilder(String.valueOf(iQ).length() + 21), "Invalid template ID: ", iQ));
                }
                if (je0Var.q() == 3) {
                    if (je0Var.g() == null) {
                        throw new eo0(1, "No custom template id for custom template ad response.");
                    }
                    if (!ou0Var.f18368i.contains(je0Var.g())) {
                        throw new eo0(1, "Unexpected custom template id in the response.");
                    }
                }
                double dOptDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d);
                synchronized (je0Var) {
                    je0Var.f16066r = dOptDouble;
                }
                String strOptString3 = jSONObject.optString("headline", null);
                if (du0Var.M) {
                    zzt.zzc();
                    String strZzB = zzs.zzB();
                    strOptString3 = q4.a.j(new StringBuilder(String.valueOf(strZzB).length() + 3 + String.valueOf(strOptString3).length()), strZzB, " : ", strOptString3);
                }
                je0Var.o("headline", strOptString3);
                je0Var.o("body", jSONObject.optString("body", null));
                je0Var.o("call_to_action", jSONObject.optString("call_to_action", null));
                je0Var.o(X3.i.U, jSONObject.optString(X3.i.U, null));
                je0Var.o("price", jSONObject.optString("price", null));
                je0Var.o(X3.i.F0, jSONObject.optString(X3.i.F0, null));
                return je0Var;
            case 1:
                if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle = ((mx) this.f18246b).f17577m) != null) {
                    ((p9.b) zzt.zzk()).getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new fl0((jl0) ((uv0) this.f18247c).f20915c.get(), (JSONObject) ((uv0) this.f18248d).f20915c.get(), (nx) ((uv0) this.f18249e).f20915c.get());
            case 2:
                Iterator it = ((ArrayList) this.f18246b).iterator();
                while (true) {
                    Object obj = this.f18247c;
                    if (!it.hasNext()) {
                        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle2 = (Bundle) this.f18248d) != null) {
                            Bundle bundle3 = (Bundle) this.f18249e;
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (obj instanceof Bundle) {
                                bundle2.putLong("client-signals-end", jCurrentTimeMillis);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", jCurrentTimeMillis);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                    as0 as0Var = (as0) ((ListenableFuture) it.next()).get();
                    if (as0Var != null) {
                        as0Var.zza(obj);
                    }
                }
                break;
            case 3:
                View view = (View) this.f18248d;
                Activity activity = (Activity) this.f18249e;
                p51 p51Var = (p51) this.f18246b;
                Context context = (Context) this.f18247c;
                a71 a71Var = p51Var.f18534d;
                m01 m01VarB = p51Var.f18531a.b();
                if (m01VarB == null) {
                    a71Var.b(15004);
                    return "";
                }
                String strE = m01VarB.e(context, view, activity);
                if (strE != null) {
                    return strE;
                }
                a71Var.b(15007);
                return "";
            case 4:
                p51 p51Var2 = (p51) this.f18246b;
                Context context2 = (Context) this.f18247c;
                String str = (String) this.f18248d;
                View view2 = (View) this.f18249e;
                a71 a71Var2 = p51Var2.f18534d;
                m01 m01VarB2 = p51Var2.f18531a.b();
                if (m01VarB2 == null) {
                    a71Var2.b(15004);
                    return "";
                }
                String strG = m01VarB2.g(context2, str, view2, null);
                if (strG != null) {
                    return strG;
                }
                a71Var2.b(15008);
                return "";
            case 5:
                View view3 = (View) this.f18248d;
                Activity activity2 = (Activity) this.f18249e;
                u51 u51Var = (u51) this.f18246b;
                Context context3 = (Context) this.f18247c;
                HashMap map = new HashMap();
                u51Var.f20636f.f(20106, new d20(u51Var, map, context3, view3, activity2));
                String strG2 = u51Var.g(map);
                map.clear();
                return strG2;
            case 6:
                u51 u51Var2 = (u51) this.f18246b;
                Context context4 = (Context) this.f18247c;
                String str2 = (String) this.f18248d;
                View view4 = (View) this.f18249e;
                HashMap map2 = new HashMap();
                u51Var2.f20636f.f(20106, new d20(u51Var2, map2, context4, view4, str2));
                String strG3 = u51Var2.g(map2);
                map2.clear();
                return strG3;
            default:
                ((i61) this.f18246b).f15628a.a((l31) this.f18247c, (byte[]) this.f18248d, (byte[]) this.f18249e);
                return null;
        }
    }
}
