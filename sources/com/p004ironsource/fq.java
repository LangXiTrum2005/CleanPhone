package com.p004ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25034a = "com.google.market";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25035b = "com.android.vending";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25036c = "isInstalled";
    private static final String d = "fq";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f25037e = new a();

    public class a extends ArrayList<String> {
        public a() {
            add(fq.f25034a);
            add("com.android.vending");
        }
    }

    public class b extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25038a;

        public b(boolean z2) throws JSONException {
            this.f25038a = z2;
            put("isInstalled", z2);
        }
    }

    public enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{fq.f25034a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Map<String, c> f25041h = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f25044b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f25041h.put(str, cVar);
                }
            }
        }

        c(int i2, String[] strArr) {
            this.f25043a = i2;
            this.f25044b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f25043a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f25044b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(f25041h.keySet());
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f25037e);
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> listO = on.U().f().o(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listO) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) {
        JSONObject jSONObjectA = a(context, c.b());
        int iPow = 0;
        for (c cVar : c.values()) {
            for (String str : cVar.d()) {
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(str);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (Math.pow(2.0d, cVar.c() - 1) + ((double) iPow));
                    break;
                }
            }
        }
        return Integer.valueOf(iPow);
    }

    public static boolean d(Context context) {
        JSONObject jSONObjectA = a(context);
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListB = b(context);
            for (String str : arrayList) {
                jSONObject.put(str, a(arrayListB.contains(str.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            Log.d(d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z2) throws JSONException {
        return new b(z2);
    }
}
