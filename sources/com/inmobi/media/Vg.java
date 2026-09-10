package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.Vg;
import com.inmobi.media.Wg;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Vg {
    public static String a;
    public static C3005jh b;
    public static int c;
    public static final taiyuan d = saneness.saneness(new Function0() { // from class: adsuki.ghoulish
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(Vg.c());
        }
    });

    public static void a() {
        Ea eaA;
        Context context = Ji.a;
        String string = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.b;
            eaA = Da.a(context, "purchase_store");
        } else {
            eaA = null;
        }
        if (eaA != null) {
            Intrinsics.checkNotNullParameter("purchase_pref", com.ironsource.X3.i.W);
            string = eaA.a.getString("purchase_pref", null);
        }
        if (string != null) {
            a = string;
        }
    }

    public static void b() {
        try {
            Context context = Ji.a;
            if (context == null) {
                return;
            }
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) Y3.a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    c = 1;
                    C3005jh c3005jh = new C3005jh();
                    b = c3005jh;
                    c3005jh.a(context, new Function1() { // from class: adsuki.mef
                        @Override // p002kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Vg.a((Wg) obj);
                        }
                    });
                }
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
        }
    }

    public static final boolean c() {
        return true;
    }

    public static final Unit a(Wg wg) throws JSONException {
        Ea eaA;
        c = 2;
        if (wg == null) {
            C3005jh c3005jh = b;
            if (c3005jh != null) {
                c3005jh.a = null;
                BillingClient billingClient = c3005jh.b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            b = null;
            return Unit.f29295attabal;
        }
        wg.toString();
        JSONObject jSONObject = new JSONObject();
        int i = wg.a;
        if (i > 0) {
            jSONObject.put(TtmlNode.TAG_P, i);
        }
        int i2 = wg.b;
        if (i2 > 0) {
            jSONObject.put("s", i2);
        }
        String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            a = nipMapJSON;
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Context context = Ji.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.b;
                eaA = Da.a(context, "purchase_store");
            } else {
                eaA = null;
            }
            if (eaA != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.b;
                eaA.a("purchase_pref", nipMapJSON, false);
            }
        }
        C3005jh c3005jh2 = b;
        if (c3005jh2 != null) {
            c3005jh2.a = null;
            BillingClient billingClient2 = c3005jh2.b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        b = null;
        return Unit.f29295attabal;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            boolean zPermissivist = CollectionsKt.permissivist(((SignalsConfig) Y3.a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!zPermissivist) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                Wj wj = Wj.a;
                Wj.b("BillingClientNotCompatible", linkedHashMap, EnumC2779ak.SDK);
            }
            return zPermissivist;
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
            return false;
        }
    }

    public static boolean a(Context context) {
        short s;
        Intrinsics.checkNotNullParameter(context, "context");
        C3342x5.a.getClass();
        if (!C3342x5.v()) {
            return false;
        }
        if (!((Boolean) d.getValue()).booleanValue()) {
            AbstractC2802bh.a(new Yg((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i = c;
        if (i != 1 && i != 2) {
            return true;
        }
        if (i != 1) {
            s = i != 2 ? (short) 0 : (short) 2232;
        } else {
            s = 2231;
        }
        AbstractC2802bh.a(new Yg(s));
        return false;
    }
}
