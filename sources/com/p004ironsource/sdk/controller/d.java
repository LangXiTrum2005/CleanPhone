package com.p004ironsource.sdk.controller;

import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.p004ironsource.gb;
import com.p004ironsource.hs;
import com.p004ironsource.oh;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.th;
import com.p004ironsource.vh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f26846h = "controllerSourceData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26847i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f26848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26850c;
    private EnumC0293d d = EnumC0293d.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26851e;
    private String f;
    private gb g;

    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(d9.a.j, Integer.valueOf(d.this.f26849b));
            putOpt(d.k, Integer.valueOf(d.this.d.a()));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26853a;

        static {
            int[] iArr = new int[c.values().length];
            f26853a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26853a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26853a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0293d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26861a;

        EnumC0293d(int i2) {
            this.f26861a = i2;
        }

        public int a() {
            return this.f26861a;
        }
    }

    public d(JSONObject jSONObject, String str, String str2, gb gbVar) {
        int iOptInt = jSONObject.optInt(d9.a.j, -1);
        this.f26849b = iOptInt;
        this.f26850c = a(iOptInt);
        this.f26851e = str;
        this.f = str2;
        this.g = gbVar;
    }

    private void c() {
        try {
            vh vhVarG = g();
            if (vhVarG.exists()) {
                vh vhVarH = h();
                if (vhVarH.exists()) {
                    vhVarH.delete();
                }
                IronSourceStorageUtils.renameFile(vhVarG.getPath(), vhVarH.getPath());
            }
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private vh h() {
        return new vh(this.f26851e, "fallback_mobileController.html");
    }

    private vh i() {
        return new vh(this.f26851e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        oh ohVarA = new oh().a(dc.y, Integer.valueOf(this.f26849b));
        if (this.f26848a > 0) {
            ohVarA.a(dc.f24770B, Long.valueOf(System.currentTimeMillis() - this.f26848a));
        }
        th.a(hs.x, ohVarA.a());
    }

    public JSONObject f() throws JSONException {
        return new a();
    }

    public vh g() {
        return new vh(this.f26851e, d9.f);
    }

    public boolean k() {
        vh vhVar;
        int i2 = b.f26853a[this.f26850c.ordinal()];
        if (i2 == 1) {
            e();
            vhVar = new vh(this.f26851e, SDKUtils.getFileName(this.f));
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        vh vhVarG = g();
                        vh vhVarI = i();
                        if (!vhVarI.exists() && !vhVarG.exists()) {
                            a(new vh(this.f26851e, SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        if (!vhVarI.exists() && vhVarG.exists()) {
                            EnumC0293d enumC0293d = EnumC0293d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = enumC0293d;
                            a(enumC0293d);
                            a(new vh(this.f26851e, vhVarI.getName()));
                            return true;
                        }
                        c();
                        if (b()) {
                            EnumC0293d enumC0293d2 = EnumC0293d.PREPARED_CONTROLLER_LOADED;
                            this.d = enumC0293d2;
                            a(enumC0293d2);
                            d();
                            a(new vh(this.f26851e, vhVarI.getName()));
                            return true;
                        }
                        if (!a()) {
                            a(new vh(this.f26851e, SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        EnumC0293d enumC0293d3 = EnumC0293d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.d = enumC0293d3;
                        a(enumC0293d3);
                        a(new vh(this.f26851e, vhVarI.getName()));
                        return true;
                    } catch (Exception e2) {
                        q9.d().a(e2);
                    }
                }
                return false;
            }
            c();
            vhVar = new vh(this.f26851e, SDKUtils.getFileName(this.f));
        }
        a(vhVar);
        return false;
    }

    public boolean m() {
        return this.d != EnumC0293d.NONE;
    }

    private c a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    public void a(oh ohVar) {
        ohVar.a(dc.y, Integer.valueOf(this.f26849b));
        th.a(hs.v, ohVar.a());
        this.f26848a = System.currentTimeMillis();
    }

    private void a(EnumC0293d enumC0293d) {
        oh ohVarA = new oh().a(dc.y, Integer.valueOf(this.f26849b)).a(dc.f24791z, Integer.valueOf(enumC0293d.a()));
        if (this.f26848a > 0) {
            ohVarA.a(dc.f24770B, Long.valueOf(System.currentTimeMillis() - this.f26848a));
        }
        th.a(hs.f25284w, ohVarA.a());
    }

    private void a(vh vhVar) {
        if (this.g.c()) {
            return;
        }
        this.g.a(vhVar, this.f);
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f26850c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0293d enumC0293d = EnumC0293d.CONTROLLER_FROM_SERVER;
        this.d = enumC0293d;
        a(enumC0293d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f26850c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            EnumC0293d enumC0293d = EnumC0293d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0293d;
            a(enumC0293d);
            runnable.run();
        }
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e2) {
            q9.d().a(e2);
            return false;
        }
    }
}
