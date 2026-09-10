package sg.bigo.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: sg.bigo.ads.c$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47081a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f47081a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47081a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47081a[ConsentOptions.COPPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47081a[ConsentOptions.GDPR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final List<a> f47082h = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f47084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f47085c;
        private final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f47086e;
        private final String f;
        private final String g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f47083a = str;
            this.f47084b = str2;
            this.f47085c = str3;
            this.d = str4;
            this.f47086e = str5;
            this.f = str6;
            this.g = str7;
        }

        public static List<a> a() {
            return f47082h;
        }

        public static JSONObject b(a aVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("consent_type", aVar.f47083a);
                jSONObject.put("last_status", aVar.f47084b);
                jSONObject.put("cur_status", aVar.f47085c);
                jSONObject.put("get_token", aVar.d);
                jSONObject.put("tcf_applias", aVar.f47086e);
                jSONObject.put("tcf_purpose", aVar.f);
                jSONObject.put("tcf_interests", aVar.g);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static Map<String, String> c() {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = f47082h.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            map.put("user_consent_event", jSONArray.toString());
            map.put("uuid", sg.bigo.ads.common.x.a.r());
            return map;
        }

        public static void a(a aVar) {
            f47082h.add(aVar);
        }

        public static void b() {
            f47082h.clear();
        }
    }
}
