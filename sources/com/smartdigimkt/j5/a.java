package com.smartdigimkt.j5;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smartdigimkt.b8.f;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.sdk.api.AdError;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static volatile a m;
    private String d;
    private File f;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36073l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36067a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36068b = com.smartdigimkt.n8.b.a("aHR0cHM6Ly9tb3Jlcy5tb3NzcGYubmV0L3RpbmlmeS90cG5fYWR4X2V4dF9yZXNfanNvbi50eHQ=");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36069c = "adx_optional_res.txt";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36070e = "sdm_optres/";
    boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f36071h = "adx_optional_res_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f36072i = new Object();
    private Map<String, String> j = new HashMap();

    /* JADX INFO: renamed from: com.smartdigimkt.j5.a$a, reason: collision with other inner class name */
    public class RunnableC0512a implements Runnable {
        final /* synthetic */ Context X;

        public RunnableC0512a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d(this.X);
            a aVar = a.this;
            aVar.j = aVar.e("adx_optional_res.txt");
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f36077Y;

        public c(String str, String str2) {
            this.X = str;
            this.f36077Y = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f36072i) {
                try {
                    if (!a.this.f.exists()) {
                        a.this.f.mkdirs();
                    }
                    File file = new File(a.this.f, this.X);
                    if (file.exists()) {
                        file.delete();
                    }
                    l.a(this.f36077Y.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> e(String str) {
        Map<String, String> mapA;
        synchronized (this.f36072i) {
            String strD = "";
            try {
                File file = new File(this.f, str);
                if (file.exists() && file.canRead()) {
                    strD = l.d(file);
                }
            } catch (Throwable unused) {
            }
            mapA = a(strD);
        }
        return mapA;
    }

    public boolean d(String str) {
        Map<String, String> map = this.j;
        if (map != null && !map.isEmpty()) {
            String str2 = this.j.get(str);
            if (!TextUtils.isEmpty(str2) && com.google.firebase.crashlytics.internal.model.a.g().b(new e(3, str2), 0, 0) != null) {
                return true;
            }
        }
        return false;
    }

    public void b(Context context) {
        try {
            this.f = new File(com.smartdigimkt.m6.b.p().k().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/sdm_optres/");
        } catch (Throwable unused) {
        }
        com.smartdigimkt.l7.b.a().g(new RunnableC0512a(context));
    }

    public boolean c(Context context) {
        String strK;
        if (this.g) {
            return false;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null && !aVarB.M0()) {
            strK = aVarB.k();
        } else {
            strK = "";
        }
        if (TextUtils.isEmpty(strK)) {
            strK = this.f36068b;
        }
        if (TextUtils.isEmpty(strK) || TextUtils.equals(this.f36073l, strK)) {
            return false;
        }
        String strB = b();
        if (!TextUtils.isEmpty(strB) && TextUtils.equals(strB, strK)) {
            if (this.j.isEmpty()) {
                this.j = e("adx_optional_res.txt");
            }
            return false;
        }
        this.d = strK;
        return true;
    }

    public Bitmap b(String str) {
        Map<String, String> map = this.j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str2 = this.j.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return com.google.firebase.crashlytics.internal.model.a.g().b(new e(3, str2), 0, 0);
    }

    public class b implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36075a;

        public b(Context context) {
            this.f36075a = context;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            String string = obj != null ? obj.toString() : "";
            String unused = a.this.f36067a;
            String unused2 = a.this.d;
            string.length();
            if (!TextUtils.isEmpty(string)) {
                a aVar = a.this;
                aVar.a(this.f36075a, aVar.d);
                a aVar2 = a.this;
                aVar2.j = aVar2.a(string);
                a.this.a(string, "adx_optional_res.txt");
            }
            a.this.g = false;
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            a aVar = a.this;
            aVar.f36073l = aVar.d;
            a aVar2 = a.this;
            aVar2.g = false;
            d.a(3, aVar2.d, adError != null ? adError.getErrorInfo() : "");
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            a.this.g = false;
        }
    }

    public static a a() {
        if (m == null) {
            synchronized (a.class) {
                try {
                    if (m == null) {
                        m = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context) {
        if (context == null) {
            try {
                context = com.smartdigimkt.m6.b.p().k();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k = p.a(context, "sdm_sdk", "adx_optional_res_url", "");
    }

    public void a(Context context) {
        if (c(context)) {
            String str = this.d;
            this.g = true;
            try {
                new f(str).a(1, (com.smartdigimkt.w7.c) new b(context));
            } catch (Throwable unused) {
                this.g = false;
            }
        }
    }

    private synchronized String b() {
        return this.k;
    }

    public String c(String str) {
        Map<String, String> map = this.j;
        if (map != null && !map.isEmpty()) {
            return this.j.get(str);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> a(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.smartdigimkt.l7.b.a().g(new c(str2, str));
    }

    public void a(List<String> list, String str) {
        if (list == null) {
            return;
        }
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        list.add(strC);
    }

    public void a(Set<String> set, String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        set.add(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.k = str;
        p.b(context, "sdm_sdk", "adx_optional_res_url", str);
    }
}
