package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f36876o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f36878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f36879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f36880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f36881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f36882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f36883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f36884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f36885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f36886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f36887k;
    private volatile s l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f36888m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f36889n;

    public k(String str, m mVar) {
        this.f36877a = str;
        this.f36878b = mVar;
    }

    public void a(Context context) {
        this.f36879c = context;
    }

    public void b() {
        this.f36888m = true;
        try {
            q().j();
            this.l = null;
            this.f36887k = null;
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "report manager shutdown exception", e10);
            }
        }
    }

    public x c() {
        x xVar = this.f36880d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f36880d = xVarA;
        return xVarA;
    }

    public Context d() {
        return this.f36879c;
    }

    public c e() {
        if (y.b(this.f36884h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f36884h)) {
                        String strU = u();
                        this.f36884h = new c(new b(d(), f(), strU), strU);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f36884h;
    }

    public String f() {
        return TextUtils.isEmpty(w()) ? "track_manager_default.db" : defpackage.e.o("track_manager_", w(), ".db");
    }

    public d g() {
        if (y.b(this.f36886j)) {
            this.f36886j = c().f37091h;
        }
        return this.f36886j;
    }

    public l h() {
        if (y.b(this.f36885i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f36885i)) {
                        this.f36885i = new q(new g(e(), q()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f36885i;
    }

    public j i() {
        if (y.b(this.f36887k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f36887k)) {
                        this.f36887k = new j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f36887k;
    }

    public int j() {
        if (c().f37084a < 0) {
            return 50;
        }
        return c().f37084a;
    }

    public int k() {
        return Math.max(c().f37088e, 0);
    }

    public int l() {
        if (c().f37087d <= 0) {
            return 2;
        }
        return c().f37087d;
    }

    public int m() {
        return Math.max(c().f37085b, 0);
    }

    public o n() {
        if (y.b(this.f36889n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f36889n)) {
                        this.f36889n = new o(l(), o(), s(), r());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f36889n;
    }

    public p o() {
        return c().f37090g;
    }

    public JSONObject p() {
        JSONObject jSONObject = this.f36881e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f36881e = jSONObject2;
        return jSONObject2;
    }

    public s q() {
        if (y.b(this.l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.l)) {
                        this.l = new s(this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.l;
    }

    public int r() {
        return c().f37086c;
    }

    public w s() {
        return c().f37092i;
    }

    public String t() {
        if (!TextUtils.isEmpty(f36876o)) {
            return f36876o;
        }
        String string = UUID.randomUUID().toString();
        f36876o = string;
        return string;
    }

    public String u() {
        return "event_table";
    }

    public m v() {
        return this.f36878b;
    }

    public String w() {
        return this.f36877a;
    }

    public boolean x() {
        return this.f36888m;
    }

    public String y() {
        if (!y.b(this.f36879c) && !y.b(this.f36880d)) {
            try {
                q().k();
                this.f36888m = false;
                if (TextUtils.isEmpty(f36876o)) {
                    f36876o = UUID.randomUUID().toString();
                }
                return f36876o;
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f36888m = true;
            }
        }
        return "";
    }

    public void a(x xVar) {
        this.f36880d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.f36881e = jSONObject;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = c().f37093j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        List<String> list = this.f36883g;
        if (list != null) {
            try {
                return !list.contains(strG);
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list2 = this.f36882f;
        if (list2 != null) {
            try {
                return list2.contains(strG);
            } catch (Exception e12) {
                if (a.f36843a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public boolean a() throws IllegalStateException {
        if (!y.b(c())) {
            if (!y.b(g())) {
                if (!y.b(s())) {
                    if (!y.b(o()) && !y.b(o().b())) {
                        if (TextUtils.isEmpty(o().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
