package sg.bigo.ads.controller.landing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.controller.form.AdFormActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> f48216a = new WeakHashMap<>();

    public static int a(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 1) {
            return i2 != 2 ? 5 : 4;
        }
        return 3;
    }

    public static sg.bigo.ads.ad.c<?, ?> b(int i2) {
        sg.bigo.ads.ad.c<?, ?> key;
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f48216a;
        synchronized (weakHashMap) {
            try {
                for (Map.Entry<sg.bigo.ads.ad.c<?, ?>, Integer> entry : weakHashMap.entrySet()) {
                    if (entry.getValue().intValue() == i2) {
                        key = entry.getKey();
                    }
                }
                key = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return key;
    }

    public static e a(Context context, String str, String str2, String str3, boolean z2, int i2, JSONArray jSONArray, sg.bigo.ads.ad.c<?, ?> cVar, boolean z3) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str);
        } else {
            arrayList = null;
        }
        return a(context, arrayList, str2, str3, z2, i2, jSONArray, cVar, z3);
    }

    public static e a(Context context, List<String> list, String str, String str2, boolean z2, int i2, JSONArray jSONArray, sg.bigo.ads.ad.c<?, ?> cVar, boolean z3) {
        sg.bigo.ads.ad.c<?, ?> cVar2;
        a aVar;
        e eVar = new e();
        boolean zA = false;
        eVar.f47022a = 0;
        if (cVar != null && (aVar = cVar.m) != null && !aVar.b()) {
            aVar.a();
        }
        if (list != null) {
            boolean zA2 = false;
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str3 = list.get(i3);
                if (!TextUtils.isEmpty(str3) && (zA2 = sg.bigo.ads.core.landing.a.a(Uri.parse(str3), context, eVar, str2))) {
                    eVar.f47022a = 1;
                    break;
                }
            }
            zA = zA2;
        }
        if (!zA && z2 && !TextUtils.isEmpty(str2) && (zA = sg.bigo.ads.core.landing.a.a(context, str2))) {
            eVar.f47022a = 4;
        }
        if (zA || TextUtils.isEmpty(str)) {
            cVar2 = cVar;
        } else {
            Uri uri = Uri.parse(str);
            if (sg.bigo.ads.core.landing.a.a(str)) {
                eVar.f47022a = 2;
                zA = sg.bigo.ads.core.landing.a.a(uri, context, eVar);
            } else {
                eVar.f47022a = 3;
                if (i2 == 1) {
                    zA = sg.bigo.ads.core.landing.a.a(context, str, jSONArray);
                } else if (i2 == 2) {
                    zA = a(context, str, cVar, eVar, z3);
                } else {
                    cVar2 = cVar;
                    zA = a(context, str, cVar2, eVar, 0, z3);
                }
            }
            cVar2 = cVar;
        }
        eVar.f47026h = zA;
        if (zA && cVar2 != null) {
            sg.bigo.ads.api.core.c cVarF = cVar2.f();
            if (cVar2.t != cVarF.y()) {
                cVar2.r = -1;
                cVar2.t = cVarF.y();
            }
            cVar2.s = System.currentTimeMillis();
            cVar2.r++;
        }
        return eVar;
    }

    public static void a() {
    }

    private static void a(int i2, sg.bigo.ads.ad.c<?, ?> cVar) {
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f48216a;
        synchronized (weakHashMap) {
            weakHashMap.put(cVar, Integer.valueOf(i2));
        }
    }

    public static void a(Context context, String str, sg.bigo.ads.ad.c<?, ?> cVar) {
        JSONArray jSONArrayD;
        int iC;
        e eVar = new e();
        eVar.f47022a = 0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        if (sg.bigo.ads.core.landing.a.a(str)) {
            eVar.f47022a = 2;
            sg.bigo.ads.core.landing.a.a(uri, context, eVar);
            return;
        }
        eVar.f47022a = 3;
        if (cVar != null) {
            iC = cVar.f().N().c();
            jSONArrayD = cVar.f().N().d();
        } else {
            jSONArrayD = null;
            iC = 0;
        }
        if (iC == 1) {
            sg.bigo.ads.core.landing.a.a(context, str, jSONArrayD);
        } else if (iC == 2) {
            a(context, str, cVar, eVar, false);
        } else {
            a(context, str, cVar, eVar, 0, false);
        }
    }

    public static boolean a(Context context, Class<? extends sg.bigo.ads.controller.e.b<?>> cls, sg.bigo.ads.ad.c<?, ?> cVar) {
        if (Build.VERSION.SDK_INT == 26) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, "android 8.0 cannot show popup");
            return false;
        }
        try {
            Intent intentB = AdActivity.b(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentB.putExtra("ad_identifier", iHashCode);
            context.startActivity(intentB);
            return true;
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e2));
            return false;
        }
    }

    public static boolean a(Context context, Class<? extends sg.bigo.ads.controller.e.b<?>> cls, sg.bigo.ads.ad.c<?, ?> cVar, boolean z2) {
        try {
            Intent intentE = z2 ? AdActivity.e(context, cls) : AdActivity.d(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentE.putExtra("ad_identifier", iHashCode);
            context.startActivity(intentE);
            return true;
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e2));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static boolean a(Context context, String str, sg.bigo.ads.ad.c<?, ?> cVar, e eVar, int i2, boolean z2) {
        LandingPageStyleConfig landingPageStyleConfigA;
        Intent intentC;
        int i3;
        Class<? extends c> cls;
        if (cVar != null) {
            try {
                WeakReference<sg.bigo.ads.ad.c.a> weakReference = cVar.f45592u;
                if (weakReference == null || weakReference.get() == null) {
                    landingPageStyleConfigA = null;
                } else {
                    landingPageStyleConfigA = cVar.f45592u.get().a(context, str, i2, z2);
                }
            } catch (Exception e2) {
                sg.bigo.ads.core.d.b.a(cVar != null ? cVar.f() : null, 3000, 10116, Log.getStackTraceString(e2));
                return false;
            }
        } else {
            landingPageStyleConfigA = null;
        }
        if (landingPageStyleConfigA == null || !landingPageStyleConfigA.a() || landingPageStyleConfigA.b()) {
            Class<? extends c> cls2 = c.class;
            if (landingPageStyleConfigA != null && (cls = landingPageStyleConfigA.g) != null) {
                cls2 = cls;
            }
            intentC = z2 ? AdActivity.c(context, cls2) : AdActivity.a(context, cls2);
            i3 = 0;
        } else {
            i3 = landingPageStyleConfigA.f48168a;
            intentC = AdActivity.f(context, landingPageStyleConfigA.g);
        }
        intentC.putExtra("layout_style", landingPageStyleConfigA);
        intentC.putExtra("webview_force_time", landingPageStyleConfigA != null ? landingPageStyleConfigA.f48169b : 1);
        intentC.putExtra("url", str);
        if (cVar != null) {
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentC.putExtra("ad_identifier", iHashCode);
            intentC.putExtra("land_way", i2);
        }
        context.startActivity(intentC);
        if (eVar != null) {
            eVar.d = i3;
        }
        return true;
    }

    private static boolean a(Context context, final String str, final sg.bigo.ads.ad.c<?, ?> cVar, final e eVar, final boolean z2) {
        final b bVar = new b(str, cVar == null ? null : cVar.f(), cVar, cVar != null ? cVar.m : null);
        sg.bigo.ads.a.a.C0778a c0778a = new sg.bigo.ads.a.a.C0778a();
        c0778a.f45343a = str;
        c0778a.f45344b = bVar;
        c0778a.f45345c = new sg.bigo.ads.a.a.b() { // from class: sg.bigo.ads.controller.landing.d.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, int i2, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "WebViewStatHelper", "Open landing page by chrome tabs failed, using webView.");
                d.a(context2, str, cVar, eVar, d.a(i2), z2);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                sg.bigo.ads.ad.c cVar2 = cVar;
                sg.bigo.ads.core.d.b.a(cVar2 == null ? null : cVar2.f(), 3002, 10114, str3);
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                b bVar2 = bVar;
                bVar2.f48189a = str2;
                bVar2.f48190b = str3;
                bVar2.f48191c = str4;
            }
        };
        c0778a.a().a(context);
        return true;
    }

    public static boolean a(Context context, sg.bigo.ads.ad.c<?, ?> cVar) {
        if (cVar == null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) null, 3000, 10221, "ad == null, launchFormActivity failed");
            return false;
        }
        try {
            Intent intentA = AdFormActivity.a(context);
            int iHashCode = cVar.hashCode();
            int iB_ = cVar.b_();
            a(iHashCode, cVar);
            intentA.putExtra("ad_identifier", iHashCode);
            intentA.putExtra("open_form_time", iB_);
            context.startActivity(intentA);
            return true;
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10221, Log.getStackTraceString(e2));
            return false;
        }
    }
}
