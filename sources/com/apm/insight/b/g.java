package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static int r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f10016c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10017e;
    private f f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10019i;
    private long j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10020l;
    private com.apm.insight.b.e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f10021n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f10022p;
    private volatile boolean q;
    private Runnable s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f10028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10030c;
        boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10031e;
        StackTraceElement[] f;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f10032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10033b;

        public final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10036c;
        int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10037e;
        long f;
        long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f10038h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f10039i;
        private String j;
        private d k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f10038h));
                jSONObject.put("cpuDuration", this.g);
                jSONObject.put("duration", this.f);
                jSONObject.put("type", this.d);
                jSONObject.put("count", this.f10037e);
                jSONObject.put("messageCount", this.f10037e);
                jSONObject.put("lastDuration", this.f10035b - this.f10036c);
                jSONObject.put("start", this.f10034a);
                jSONObject.put(TtmlNode.END, this.f10035b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.d = -1;
            this.f10037e = -1;
            this.f = -1L;
            this.f10038h = null;
            this.j = null;
            this.k = null;
            this.f10039i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    private g(byte b2) {
        this.f10015b = 0;
        this.f10016c = 0;
        this.d = 100;
        this.f10017e = 200;
        this.g = -1L;
        this.f10018h = -1L;
        this.f10019i = -1;
        this.j = -1L;
        this.f10021n = false;
        this.o = false;
        this.q = false;
        this.s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f10025b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f10024a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f10026c = -1;
            private int d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f10027e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f10032a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f10026c == g.this.f10016c) {
                    this.d++;
                } else {
                    this.d = 0;
                    this.f10027e = 0;
                    this.f10025b = jUptimeMillis;
                }
                this.f10026c = g.this.f10016c;
                int i2 = this.d;
                if (i2 > 0 && i2 - this.f10027e >= g.r && this.f10024a != 0 && jUptimeMillis - this.f10025b > 700 && g.this.q) {
                    aVar.f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f10027e = this.d;
                }
                aVar.d = g.this.q;
                aVar.f10030c = (jUptimeMillis - this.f10024a) - 300;
                aVar.f10028a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f10024a = jUptimeMillis2;
                aVar.f10029b = jUptimeMillis2 - jUptimeMillis;
                aVar.f10031e = g.this.f10016c;
                g.e().a(g.this.s, 300L);
                g.c().a(aVar);
            }
        };
        this.f10014a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f10022p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i2 = gVar.f10015b;
        gVar.f10015b = i2 + 1;
        return i2;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i2 = 0;
            for (e eVar : this.f.a()) {
                if (eVar != null) {
                    i2++;
                    jSONArray.put(eVar.a().put("id", i2));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f10021n) {
            return;
        }
        this.f10021n = true;
        this.d = 100;
        this.f10017e = 300;
        this.f = new f(100);
        this.m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f10008a);
                g gVar = g.this;
                gVar.k = gVar.f10020l;
                g.this.f10020l = "no message running";
                g.this.q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.q = true;
                g.this.f10020l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f10008a);
            }
        };
        h.a();
        h.a(this.m);
        j.a(j.a());
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f10042c;
        private List<e> d = new ArrayList();

        public f(int i2) {
            this.f10040a = i2;
        }

        public final e a(int i2) {
            e eVar = this.f10042c;
            if (eVar != null) {
                eVar.d = i2;
                this.f10042c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.d = i2;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.d.size();
            int i2 = this.f10040a;
            if (size < i2) {
                this.d.add(eVar);
                this.f10041b = this.d.size();
                return;
            }
            int i3 = this.f10041b % i2;
            this.f10041b = i3;
            e eVar2 = this.d.set(i3, eVar);
            eVar2.b();
            this.f10042c = eVar2;
            this.f10041b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            if (this.d.size() == this.f10040a) {
                for (int i3 = this.f10041b; i3 < this.d.size(); i3++) {
                    arrayList.add(this.d.get(i3));
                }
                while (i2 < this.f10041b - 1) {
                    arrayList.add(this.d.get(i2));
                    i2++;
                }
            } else {
                while (i2 < this.d.size()) {
                    arrayList.add(this.d.get(i2));
                    i2++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i2, long j, String str) {
        a(i2, j, str, true);
    }

    private void a(int i2, long j, String str, boolean z2) {
        this.o = true;
        e eVarA = this.f.a(i2);
        eVarA.f = j - this.g;
        if (z2) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.g = jCurrentThreadTimeMillis - this.j;
            this.j = jCurrentThreadTimeMillis;
        } else {
            eVarA.g = -1L;
        }
        eVarA.f10037e = this.f10015b;
        eVarA.f10038h = str;
        eVarA.f10039i = this.k;
        eVarA.f10034a = this.g;
        eVarA.f10035b = j;
        eVarA.f10036c = this.f10018h;
        this.f.a(eVarA);
        this.f10015b = 0;
        this.g = j;
    }

    public final e a(long j) {
        e eVar = new e();
        eVar.f10038h = this.f10020l;
        eVar.f10039i = this.k;
        eVar.f = j - this.f10018h;
        eVar.g = 0 - this.j;
        eVar.f10037e = this.f10015b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z2, long j) {
        int i2 = gVar.f10016c + 1;
        gVar.f10016c = i2;
        gVar.f10016c = i2 & 65535;
        gVar.o = false;
        if (gVar.g < 0) {
            gVar.g = j;
        }
        if (gVar.f10018h < 0) {
            gVar.f10018h = j;
        }
        if (gVar.f10019i < 0) {
            gVar.f10019i = Process.myTid();
            gVar.j = SystemClock.currentThreadTimeMillis();
        }
        long j2 = j - gVar.g;
        int i3 = gVar.f10017e;
        if (j2 > i3) {
            long j3 = gVar.f10018h;
            if (j - j3 <= i3) {
                gVar.a(9, j, gVar.f10020l);
            } else if (z2) {
                if (gVar.f10015b == 0) {
                    gVar.a(1, j, "no message running");
                } else {
                    gVar.a(9, j3, gVar.k);
                    gVar.a(1, j, "no message running", false);
                }
            } else if (gVar.f10015b == 0) {
                gVar.a(8, j, gVar.f10020l, true);
            } else {
                gVar.a(9, j3, gVar.k, false);
                gVar.a(8, j, gVar.f10020l, true);
            }
        }
        gVar.f10018h = j;
    }
}
