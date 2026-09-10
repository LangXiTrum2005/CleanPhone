package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.tools.v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f36966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f36968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f36970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f36973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f36975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f36976k;
    private v.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f36977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f36978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f36984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f36985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f36986v;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f36983s;
    }

    public final boolean B() {
        return this.f36982r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t10);

    public void a(String str) {
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f36985u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f36967b)) {
            return this.f36967b;
        }
        if (this.f36966a == null) {
            this.f36966a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f36966a.a(this);
        this.f36967b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f36971f;
    }

    public p h() {
        return this.f36968c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "UTF-8";
    }

    public int k() {
        return this.f36973h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f36986v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f36969d;
    }

    public x o() {
        return this.f36984t;
    }

    public String p() {
        return this.f36974i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f36975j;
    }

    public String t() {
        return this.f36972g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(l());
        sb2.append(" ");
        sb2.append(this.f36977m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f36976k) {
            z10 = this.f36981q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f36976k) {
            z10 = this.f36980p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f36976k) {
            this.f36981q = true;
        }
    }

    public void x() {
        synchronized (this.f36976k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f36979o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        u uVar = this.f36978n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f36970e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f36970e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f36976k = new Object();
        this.f36979o = false;
        this.f36980p = false;
        this.f36981q = false;
        this.f36982r = false;
        this.f36983s = false;
        this.f36985u = null;
        this.f36986v = 0L;
        this.f36971f = i10;
        this.f36972g = str;
        this.f36973h = i11;
        this.f36974i = str2;
        a((x) new e());
        this.f36975j = b(str);
        this.f36969d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f36984t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public void a(int i10) {
        u uVar = this.f36978n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f36977m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f36982r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f36986v = bArrA.length;
            return bArrA;
        }
        this.f36986v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f36978n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(B5.U);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            if (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) {
                return ("p=" + URLEncoder.encode(v0.b(sb2.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(defpackage.e.n("Encoding not supported: ", str), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f36983s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f36976k) {
            aVar = this.l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f36979o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f36976k) {
        }
    }

    public void a(p pVar) {
        this.f36968c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f36970e == null) {
            this.f36970e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f36970e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        int iOrdinal;
        int iOrdinal2;
        a aVarL = l();
        a aVarL2 = tVar.l();
        if (aVarL == aVarL2) {
            iOrdinal = this.f36977m.intValue();
            iOrdinal2 = tVar.f36977m.intValue();
        } else {
            iOrdinal = aVarL2.ordinal();
            iOrdinal2 = aVarL.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }
}
