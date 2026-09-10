package com.smartdigimkt.t3;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.b8.f;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.sdk.api.AdError;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static final String j = com.smartdigimkt.n8.b.a("eyJkc3BfY2xpY2tfbWFjcm9fY29uZmlnIjp7IjQ5Ijp7Im1hcHBpbmdzIjpbeyJtYWNybyI6Il9fUkVfQ19ET1dOX1hfXyIsImFjdGlvbiI6IjMiLCJ2YWx1ZSI6IiRkeCQifSx7Im1hY3JvIjoiX19SRV9DX0RPV05fWV9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJGR5JCJ9LHsibWFjcm8iOiJfX1JFX0NfVVBfWF9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHV4JCJ9LHsibWFjcm8iOiJfX1JFX0NfVVBfWV9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHV5JCJ9LHsibWFjcm8iOiJfX01fWF9BQ0NfXyIsImFjdGlvbiI6IjMiLCJ2YWx1ZSI6IiR6bWEkIn0seyJtYWNybyI6Il9fTV9ZX0FDQ19fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHltYSQifSx7Im1hY3JvIjoiX19NX1pfQUNDX18iLCJhY3Rpb24iOiIzIiwidmFsdWUiOiIkem1hJCJ9XX19fQ==");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f38697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f38698c;
    private final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38699e;
    private final String f;
    private final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, com.smartdigimkt.t3.b> f38700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f38701i;

    /* JADX INFO: renamed from: com.smartdigimkt.t3.a$a, reason: collision with other inner class name */
    public class RunnableC0617a implements Runnable {
        public RunnableC0617a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f38697b = aVar.c();
            a aVar2 = a.this;
            aVar2.a(aVar2.f38697b);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        public c(String str) {
            this.X = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.d) {
                try {
                    if (!a.this.f38698c.exists()) {
                        a.this.f38698c.mkdirs();
                    }
                    File file = new File(a.this.f38698c, "tracker_mapping.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    l.a(this.X.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f38706a = new a(null);

        private d() {
        }
    }

    public /* synthetic */ a(RunnableC0617a runnableC0617a) {
        this();
    }

    public void b() {
    }

    private a() {
        this.f38696a = getClass().getSimpleName();
        this.d = new Object();
        this.f38699e = "tracker_mapping";
        this.f = "sdm_tracker_mapping/";
        this.g = "tracker_mapping.txt";
        this.f38701i = false;
        try {
            this.f38698c = new File(com.smartdigimkt.m6.b.p().k().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/sdm_tracker_mapping/");
        } catch (Throwable unused) {
        }
        this.f38700h = new HashMap();
        com.smartdigimkt.l7.b.a().g(new RunnableC0617a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.smartdigimkt.l7.b.a().g(new c(str));
    }

    public static a a() {
        return d.f38706a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        String strD;
        synchronized (this.d) {
            strD = j;
            try {
                File file = new File(this.f38698c, "tracker_mapping.txt");
                if (file.exists() && file.canRead()) {
                    strD = l.d(file);
                }
            } catch (Throwable unused) {
            }
        }
        return strD;
    }

    public synchronized void a(Context context, String str) {
        if (this.f38701i) {
            return;
        }
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String strA = p.a(applicationContext, "sdm_sdk", "tracker_mapping", "");
        if (TextUtils.isEmpty(strA) || !TextUtils.equals(strA, str)) {
            this.f38701i = true;
            try {
                new f(str).a(1, (com.smartdigimkt.w7.c) new b(str, applicationContext));
            } catch (Throwable unused) {
                this.f38701i = false;
            }
        }
    }

    public com.smartdigimkt.t3.b b(String str) {
        Map<String, com.smartdigimkt.t3.b> map = this.f38700h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public class b implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38703b;

        public b(String str, Context context) {
            this.f38702a = str;
            this.f38703b = context;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            String string = obj != null ? obj.toString() : "";
            if (!TextUtils.isEmpty(string)) {
                String unused = a.this.f38696a;
                a.this.f38697b = string;
                a.this.c(string);
                p.b(this.f38703b, "sdm_sdk", "tracker_mapping", this.f38702a);
                a aVar = a.this;
                aVar.a(aVar.f38697b);
            }
            a.this.f38701i = false;
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            a aVar = a.this;
            aVar.f38701i = false;
            String unused = aVar.f38696a;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            a.this.f38701i = false;
        }
    }

    public void a(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            Map<String, com.smartdigimkt.t3.b> map = this.f38700h;
            if (map == null) {
                return;
            }
            map.clear();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("dsp_click_macro_config");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("mappings")) != null) {
                        com.smartdigimkt.t3.b bVar = new com.smartdigimkt.t3.b();
                        bVar.a(jSONArrayOptJSONArray);
                        this.f38700h.put(next, bVar);
                    }
                }
            }
            Objects.toString(jSONObjectOptJSONObject);
        } catch (Throwable unused) {
        }
    }
}
