package com.ironsource.sdk.controller;

import com.ironsource.B5;
import com.ironsource.C0314e5;
import com.ironsource.C0377he;
import com.ironsource.C0474n4;
import com.ironsource.C0549r8;
import com.ironsource.C0639w8;
import com.ironsource.C0693z8;
import com.ironsource.X3;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f30292h = "controllerSourceData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30293i = "next_";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30294j = "fallback_";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30295k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f30296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f30298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0083d f30299d = EnumC0083d.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0314e5 f30302g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(X3.a.f27675j, Integer.valueOf(d.this.f30297b));
            putOpt(d.f30295k, Integer.valueOf(d.this.f30299d.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30304a;

        static {
            int[] iArr = new int[c.values().length];
            f30304a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30304a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30304a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum EnumC0083d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30316a;

        EnumC0083d(int i10) {
            this.f30316a = i10;
        }

        public int b() {
            return this.f30316a;
        }
    }

    public d(JSONObject jSONObject, String str, String str2, C0314e5 c0314e5) {
        int iOptInt = jSONObject.optInt(X3.a.f27675j, -1);
        this.f30297b = iOptInt;
        this.f30298c = a(iOptInt);
        this.f30300e = str;
        this.f30301f = str2;
        this.f30302g = c0314e5;
    }

    private void c() {
        try {
            C0693z8 c0693z8G = g();
            if (c0693z8G.exists()) {
                C0693z8 c0693z8H = h();
                if (c0693z8H.exists()) {
                    c0693z8H.delete();
                }
                IronSourceStorageUtils.renameFile(c0693z8G.getPath(), c0693z8H.getPath());
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C0693z8 h() {
        return new C0693z8(this.f30300e, "fallback_mobileController.html");
    }

    private C0693z8 i() {
        return new C0693z8(this.f30300e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C0549r8 c0549r8A = new C0549r8().a(B5.f25711y, Integer.valueOf(this.f30297b));
        if (this.f30296a > 0) {
            c0549r8A.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.f30296a));
        }
        C0639w8.a(C0377he.f28824x, c0549r8A.a());
    }

    public JSONObject f() throws JSONException {
        return new a();
    }

    public C0693z8 g() {
        return new C0693z8(this.f30300e, X3.f27647f);
    }

    public boolean k() {
        int i10 = b.f30304a[this.f30298c.ordinal()];
        if (i10 == 1) {
            e();
            a(new C0693z8(this.f30300e, SDKUtils.getFileName(this.f30301f)));
            return false;
        }
        if (i10 == 2) {
            c();
            a(new C0693z8(this.f30300e, SDKUtils.getFileName(this.f30301f)));
            return false;
        }
        if (i10 == 3) {
            try {
                C0693z8 c0693z8G = g();
                C0693z8 c0693z8I = i();
                if (!c0693z8I.exists() && !c0693z8G.exists()) {
                    a(new C0693z8(this.f30300e, SDKUtils.getFileName(this.f30301f)));
                    return false;
                }
                if (!c0693z8I.exists() && c0693z8G.exists()) {
                    EnumC0083d enumC0083d = EnumC0083d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f30299d = enumC0083d;
                    a(enumC0083d);
                    a(new C0693z8(this.f30300e, c0693z8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0083d enumC0083d2 = EnumC0083d.PREPARED_CONTROLLER_LOADED;
                    this.f30299d = enumC0083d2;
                    a(enumC0083d2);
                    d();
                    a(new C0693z8(this.f30300e, c0693z8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C0693z8(this.f30300e, SDKUtils.getFileName(this.f30301f)));
                    return false;
                }
                EnumC0083d enumC0083d3 = EnumC0083d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f30299d = enumC0083d3;
                a(enumC0083d3);
                a(new C0693z8(this.f30300e, c0693z8I.getName()));
                return true;
            } catch (Exception e10) {
                C0474n4.d().a(e10);
            }
        }
        return false;
    }

    public boolean m() {
        return this.f30299d != EnumC0083d.NONE;
    }

    private c a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f30298c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0083d enumC0083d = EnumC0083d.CONTROLLER_FROM_SERVER;
        this.f30299d = enumC0083d;
        a(enumC0083d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f30298c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0083d enumC0083d = EnumC0083d.FALLBACK_CONTROLLER_RECOVERY;
            this.f30299d = enumC0083d;
            a(enumC0083d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C0693z8 c0693z8) {
        if (this.f30302g.c()) {
            return;
        }
        this.f30302g.a(c0693z8, this.f30301f);
    }

    public void a(C0549r8 c0549r8) {
        c0549r8.a(B5.f25711y, Integer.valueOf(this.f30297b));
        C0639w8.a(C0377he.f28822v, c0549r8.a());
        this.f30296a = System.currentTimeMillis();
    }

    private void a(EnumC0083d enumC0083d) {
        C0549r8 c0549r8A = new C0549r8().a(B5.f25711y, Integer.valueOf(this.f30297b)).a(B5.f25712z, Integer.valueOf(enumC0083d.b()));
        if (this.f30296a > 0) {
            c0549r8A.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.f30296a));
        }
        C0639w8.a(C0377he.f28823w, c0549r8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return false;
        }
    }
}
