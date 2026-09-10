package com.inmobi.media;

import A.RunnableC0907o;
import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class De {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f22786b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final De f22785a = new De();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ce f22787c = new Ce();

    public static final /* synthetic */ void a(De de) {
        de.getClass();
        b();
    }

    public static final void b(Context context) {
        Intrinsics.f(context, "$context");
        try {
            WebView webView = new WebView(context);
            webView.setWebViewClient(new wf());
            webView.clearCache(true);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static final void d(Context context) {
        C6 c6A;
        Context contextD;
        Context contextD2;
        JSONObject jSONObject;
        Intrinsics.f(context, "$context");
        Vc vc = Vc.f23304a;
        if (vc.b(context) && F4.a(context).isEmpty()) {
            vc.a(context, false);
        }
        C3044h3 c3044h3 = C3044h3.f23645a;
        LinkedList linkedList = new LinkedList(T1.a((C2979d3) Nc.d.getX(), null, null, null, null, null, null, 63));
        C3044h3.f23646b = linkedList;
        Object objClone = linkedList.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        C3044h3.f23647c = (LinkedList) objClone;
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        Log.i("AdQualityComponent", "starting");
        if (C3009f0.d == null) {
            C3009f0.d = new C2976d0(C3009f0.f23597e);
        }
        C2976d0 c2976d0 = C3009f0.d;
        if (c2976d0 == null) {
            Intrinsics.m("executor");
            throw null;
        }
        if (c2976d0.f23504b.get()) {
            Log.i("AdQualityComponent", "already started");
        } else {
            C2976d0 c2976d1 = C3009f0.d;
            if (c2976d1 == null) {
                Intrinsics.m("executor");
                throw null;
            }
            c2976d1.a();
        }
        Q5.b();
        Q5.a();
        V3 v3 = U3.f23253a;
        LinkedHashMap linkedHashMap = O2.f23027a;
        AdConfig adConfig = (AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        C3185q0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
        U3.f23256e = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
        U3.e();
        if (adConfig.getRendering().getEnableImmersive()) {
            if (U3.f23258i && (contextD2 = Uc.d()) != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                String string = B6.a(contextD2, "display_info_store").f22735a.getString("safe_area", null);
                if (string != null) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
                U3.f = jSONObject;
                Objects.toString(jSONObject);
            }
            if (U3.f23258i && U3.f() == null && (contextD = Uc.d()) != null) {
                ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                int i2 = B6.a(contextD, "display_info_store").f22735a.getInt("nav_bar_type", -1);
                Integer numValueOf = Integer.valueOf(i2);
                U3.g = numValueOf;
                if (i2 == -1) {
                    numValueOf = null;
                }
                U3.g = numValueOf;
            }
        }
        String str = C2987db.f23526a;
        try {
            Context contextD3 = Uc.d();
            if (contextD3 != null && C2987db.f23528c.getPurchases().getInapp()) {
                Context contextD4 = Uc.d();
                if (contextD4 != null) {
                    ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
                    c6A = B6.a(contextD4, "purchase_store");
                } else {
                    c6A = null;
                }
                String string2 = c6A != null ? c6A.f22735a.getString("purchase_pref", null) : null;
                if (string2 != null) {
                    C2987db.f23526a = string2;
                }
                if (C2987db.a(contextD3)) {
                    C2987db.d = 1;
                    C3259ub c3259ub = new C3259ub();
                    C2987db.f23527b = c3259ub;
                    c3259ub.a(contextD3, new C2953bb());
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
        b();
        try {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            reflectionFactory.b(ActivityFilter.class).l();
            reflectionFactory.b(ActivityRule.class).l();
            reflectionFactory.b(RuleController.class).l();
            RuleController.Companion.getInstance(context).addRule(new ActivityRule.Builder(SetsKt.h(new ActivityFilter(new ComponentName(context, (Class<?>) InMobiAdActivity.class), (String) null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused2) {
        }
        try {
            C3233t1.f23990a.c();
            C3233t1.a();
        } catch (Exception unused3) {
        }
        Vc.f23304a.a(context, "10.8.7");
        f22786b = true;
    }

    public final boolean c() {
        try {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            reflectionFactory.b(CustomTabsClient.class).l();
            reflectionFactory.b(Omid.class).l();
            reflectionFactory.b(OkHttpClient.class).l();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void e(Context context) {
        Intrinsics.f(context, "context");
        C3090k1.f23737a.a(context, f22787c);
    }

    public final void a(Context context) {
        Intrinsics.f(context, "context");
        try {
            Vc vc = Vc.f23304a;
            if (vc.a(context) != null && Intrinsics.a(vc.a(context), "10.8.7")) {
                return;
            }
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            RunnableC0907o runnableC0907o = new RunnableC0907o(context, 0);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(runnableC0907o);
            vc.a(context, F4.b(context));
            Uc uc = Uc.f23270a;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.e(applicationContext, "getApplicationContext(...)");
            uc.a(applicationContext);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static void b() {
        try {
            C3246te.f24014a.a();
            AppSetIdInfo appSetIdInfo = AbstractC3026g1.f23620a;
            LinkedHashMap linkedHashMap = O2.f23027a;
            M2.a();
            C3298x2.f24089a.h();
            Pd.c();
            C2972cd.f23496a.a();
            sf sfVar = sf.f23987a;
            C3233t1.f23990a.c();
            Cb.f22746c.set(true);
            Cb.b();
            Uc.f().a(new int[]{2, 1, 100, 151, 150, 152}, Cb.g);
            Aa.a();
            S5.f23167a.a();
            Pd.b("SessionStarted", new HashMap(), Td.SDK);
            Jd.b();
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 2, "De", "SDK encountered unexpected error while starting internal components");
        }
    }

    public final void c(Context context) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        int i2;
        Intrinsics.f(context, "context");
        if (f22786b) {
            return;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        M2.a();
        Pd.c();
        C3246te.f24014a.a();
        AppSetIdInfo appSetIdInfo = AbstractC3026g1.f23620a;
        Lazy lazy = I5.f22882a;
        L3.f22938a.v();
        int i3 = AbstractC2936ab.f23443a;
        Context contextD = Uc.d();
        int i4 = Integer.MIN_VALUE;
        if (i3 != Integer.MIN_VALUE) {
            AbstractC2936ab.f23443a = i3;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_age", i3, false, 4, (Object) null);
            }
        }
        String str = AbstractC2936ab.f23445c;
        Context contextD2 = Uc.d();
        if (str != null) {
            AbstractC2936ab.f23445c = str;
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                C6.a(B6.a(contextD2, "user_info_store"), "user_age_group", str, false, 4, (Object) null);
            }
        }
        String str2 = AbstractC2936ab.d;
        Context contextD3 = Uc.d();
        AbstractC2936ab.d = str2;
        if (contextD3 != null && str2 != null) {
            ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
            C6.a(B6.a(contextD3, "user_info_store"), "user_area_code", str2, false, 4, (Object) null);
        }
        String str3 = AbstractC2936ab.f23446e;
        Context contextD4 = Uc.d();
        if (str3 != null) {
            AbstractC2936ab.f23446e = str3;
            if (contextD4 != null) {
                ConcurrentHashMap concurrentHashMap4 = C6.f22734b;
                C6.a(B6.a(contextD4, "user_info_store"), "user_post_code", str3, false, 4, (Object) null);
            }
        }
        String str4 = AbstractC2936ab.f;
        Context contextD5 = Uc.d();
        if (str4 != null) {
            AbstractC2936ab.f = str4;
            if (contextD5 != null) {
                ConcurrentHashMap concurrentHashMap5 = C6.f22734b;
                C6.a(B6.a(contextD5, "user_info_store"), "user_city_code", str4, false, 4, (Object) null);
            }
        }
        String str5 = AbstractC2936ab.g;
        Context contextD6 = Uc.d();
        if (str5 != null) {
            AbstractC2936ab.g = str5;
            if (contextD6 != null) {
                ConcurrentHashMap concurrentHashMap6 = C6.f22734b;
                C6.a(B6.a(contextD6, "user_info_store"), "user_state_code", str5, false, 4, (Object) null);
            }
        }
        String str6 = AbstractC2936ab.f23447h;
        Context contextD7 = Uc.d();
        if (str6 != null) {
            AbstractC2936ab.f23447h = str6;
            if (contextD7 != null) {
                ConcurrentHashMap concurrentHashMap7 = C6.f22734b;
                C6.a(B6.a(contextD7, "user_info_store"), "user_country_code", str6, false, 4, (Object) null);
            }
        }
        int i5 = AbstractC2936ab.f23448i;
        Context contextD8 = Uc.d();
        if (i5 != Integer.MIN_VALUE) {
            AbstractC2936ab.f23448i = i5;
            if (contextD8 != null) {
                ConcurrentHashMap concurrentHashMap8 = C6.f22734b;
                C6.a(B6.a(contextD8, "user_info_store"), "user_yob", i5, false, 4, (Object) null);
            }
        }
        String str7 = AbstractC2936ab.j;
        Context contextD9 = Uc.d();
        if (str7 != null) {
            AbstractC2936ab.j = str7;
            if (contextD9 != null) {
                ConcurrentHashMap concurrentHashMap9 = C6.f22734b;
                C6.a(B6.a(contextD9, "user_info_store"), "user_gender", str7, false, 4, (Object) null);
            }
        }
        String str8 = AbstractC2936ab.k;
        Context contextD10 = Uc.d();
        if (str8 != null) {
            AbstractC2936ab.k = str8;
            if (contextD10 != null) {
                ConcurrentHashMap concurrentHashMap10 = C6.f22734b;
                C6.a(B6.a(contextD10, "user_info_store"), "user_education", str8, false, 4, (Object) null);
            }
        }
        String str9 = AbstractC2936ab.f23449l;
        Context contextD11 = Uc.d();
        if (str9 != null) {
            AbstractC2936ab.f23449l = str9;
            if (contextD11 != null) {
                ConcurrentHashMap concurrentHashMap11 = C6.f22734b;
                C6.a(B6.a(contextD11, "user_info_store"), "user_language", str9, false, 4, (Object) null);
            }
        }
        String str10 = AbstractC2936ab.m;
        Context contextD12 = Uc.d();
        if (str10 != null) {
            AbstractC2936ab.m = str10;
            if (contextD12 != null) {
                ConcurrentHashMap concurrentHashMap12 = C6.f22734b;
                C6.a(B6.a(contextD12, "user_info_store"), "user_interest", str10, false, 4, (Object) null);
            }
        }
        Location location = AbstractC2936ab.f23450n;
        Context contextD13 = Uc.d();
        if (location != null) {
            AbstractC2936ab.f23450n = location;
            if (contextD13 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(location.getLatitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(location.getLongitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append((int) location.getAccuracy());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(location.getTime());
                String string10 = sb.toString();
                ConcurrentHashMap concurrentHashMap13 = C6.f22734b;
                C6.a(B6.a(contextD13, "user_info_store"), "user_location", string10, false, 4, (Object) null);
            }
        }
        if (AbstractC2936ab.f23443a == Integer.MIN_VALUE) {
            Context contextD14 = Uc.d();
            if (contextD14 == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap14 = C6.f22734b;
                i2 = B6.a(contextD14, "user_info_store").f22735a.getInt("user_age", Integer.MIN_VALUE);
            }
            AbstractC2936ab.f23443a = i2;
        }
        String string11 = null;
        if (AbstractC2936ab.f23445c == null) {
            Context contextD15 = Uc.d();
            if (contextD15 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap15 = C6.f22734b;
                string9 = B6.a(contextD15, "user_info_store").f22735a.getString("user_age_group", null);
            }
            AbstractC2936ab.f23445c = string9;
        }
        if (AbstractC2936ab.d == null) {
            Context contextD16 = Uc.d();
            if (contextD16 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap16 = C6.f22734b;
                string8 = B6.a(contextD16, "user_info_store").f22735a.getString("user_area_code", null);
            }
            AbstractC2936ab.d = string8;
        }
        if (AbstractC2936ab.f23446e == null) {
            Context contextD17 = Uc.d();
            if (contextD17 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap17 = C6.f22734b;
                string7 = B6.a(contextD17, "user_info_store").f22735a.getString("user_post_code", null);
            }
            AbstractC2936ab.f23446e = string7;
        }
        if (AbstractC2936ab.f == null) {
            Context contextD18 = Uc.d();
            if (contextD18 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap18 = C6.f22734b;
                string6 = B6.a(contextD18, "user_info_store").f22735a.getString("user_city_code", null);
            }
            AbstractC2936ab.f = string6;
        }
        if (AbstractC2936ab.g == null) {
            Context contextD19 = Uc.d();
            if (contextD19 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap19 = C6.f22734b;
                string5 = B6.a(contextD19, "user_info_store").f22735a.getString("user_state_code", null);
            }
            AbstractC2936ab.g = string5;
        }
        if (AbstractC2936ab.f23447h == null) {
            Context contextD20 = Uc.d();
            if (contextD20 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap20 = C6.f22734b;
                string4 = B6.a(contextD20, "user_info_store").f22735a.getString("user_country_code", null);
            }
            AbstractC2936ab.f23447h = string4;
        }
        if (AbstractC2936ab.f23448i == Integer.MIN_VALUE) {
            Context contextD21 = Uc.d();
            if (contextD21 != null) {
                ConcurrentHashMap concurrentHashMap21 = C6.f22734b;
                i4 = B6.a(contextD21, "user_info_store").f22735a.getInt("user_yob", Integer.MIN_VALUE);
            }
            AbstractC2936ab.f23448i = i4;
        }
        if (AbstractC2936ab.j == null) {
            Context contextD22 = Uc.d();
            if (contextD22 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap22 = C6.f22734b;
                string3 = B6.a(contextD22, "user_info_store").f22735a.getString("user_gender", null);
            }
            AbstractC2936ab.j = string3;
        }
        if (AbstractC2936ab.k == null) {
            Context contextD23 = Uc.d();
            if (contextD23 == null) {
                string2 = null;
            } else {
                ConcurrentHashMap concurrentHashMap23 = C6.f22734b;
                string2 = B6.a(contextD23, "user_info_store").f22735a.getString("user_education", null);
            }
            AbstractC2936ab.k = string2;
        }
        if (AbstractC2936ab.f23449l == null) {
            Context contextD24 = Uc.d();
            if (contextD24 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap24 = C6.f22734b;
                string = B6.a(contextD24, "user_info_store").f22735a.getString("user_language", null);
            }
            AbstractC2936ab.f23449l = string;
        }
        if (AbstractC2936ab.m == null) {
            Context contextD25 = Uc.d();
            if (contextD25 != null) {
                ConcurrentHashMap concurrentHashMap25 = C6.f22734b;
                string11 = B6.a(contextD25, "user_info_store").f22735a.getString("user_interest", null);
            }
            AbstractC2936ab.m = string11;
        }
        AbstractC2936ab.b();
        AbstractC2936ab.c();
        Uc.a(new RunnableC0907o(context, 1));
    }

    @JvmStatic
    public static final void a() {
        try {
            if (O2.f23029c.getAndSet(false)) {
                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                ((I2) O2.f23028b.getX()).sendEmptyMessage(5);
            }
            Pd.d.set(false);
            C3236t4 c3236t4 = Pd.f;
            if (c3236t4 != null) {
                ScheduledExecutorService scheduledExecutorService = c3236t4.f24003h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                c3236t4.f24003h = null;
                c3236t4.f24002e.set(false);
                c3236t4.f.set(true);
                c3236t4.g.clear();
                c3236t4.f24004i = null;
            }
            Pd.f = null;
            Pd.f23082i = null;
            Uc.f().a(Pd.f23081h);
            synchronized (C2972cd.f23496a) {
                try {
                    X6 x6 = X6.f23341a;
                    if (X6.c()) {
                        LocationManager locationManager = X6.f23342b;
                        if (locationManager != null) {
                            locationManager.removeUpdates(x6);
                        }
                        GoogleApiClient googleApiClient = X6.d;
                        if (googleApiClient != null) {
                            googleApiClient.disconnect();
                        }
                    }
                    X6.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3233t1.j.set(true);
            C3233t1.d();
            Cb.f22746c.set(false);
            Uc.f().a(Cb.g);
            Cb.f22745b = null;
            if (Aa.f22693c.compareAndSet(true, false)) {
                C2947b5 c2947b5 = Aa.f22691a;
                if (c2947b5 != null) {
                    O4 o4 = c2947b5.f23460e;
                    o4.getClass();
                    Ca ca = Ca.STOPPED;
                    if (o4.a(ca)) {
                        o4.d = ca;
                        o4.e();
                    }
                }
                F3 f3 = Aa.f22692b;
                if (f3 != null) {
                    W9 w9 = f3.f22807e;
                    w9.getClass();
                    Ca ca2 = Ca.STOPPED;
                    if (w9.a(ca2)) {
                        w9.d = ca2;
                        w9.b();
                    }
                }
            }
            H3 h3 = S5.f23169c;
            if (h3 != null) {
                Iterator it = h3.f22857c.iterator();
                while (it.hasNext()) {
                    ((G3) it.next()).b();
                }
            }
            E6 e6 = S5.d;
            C3236t4 c3236t5 = e6.f22797b;
            if (c3236t5 != null) {
                ScheduledExecutorService scheduledExecutorService2 = c3236t5.f24003h;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                }
                c3236t5.f24003h = null;
                c3236t5.f24002e.set(false);
                c3236t5.f.set(true);
                c3236t5.g.clear();
                c3236t5.f24004i = null;
            }
            e6.f22797b = null;
            Uc.f().a(e6.d);
            Jd.a();
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "De", "SDK encountered unexpected error while stopping internal components");
        }
    }
}
