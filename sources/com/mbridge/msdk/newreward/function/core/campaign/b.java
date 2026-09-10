package com.mbridge.msdk.newreward.function.core.campaign;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.core.resource.d;
import com.mbridge.msdk.newreward.function.core.resource.e;
import com.mbridge.msdk.newreward.function.core.resource.i;
import com.mbridge.msdk.newreward.function.core.resource.n;
import com.mbridge.msdk.newreward.function.utils.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static long M = 30000;
    private String A;
    private int B;
    private int C;
    private List<CampaignEx> D;
    private int E;
    private long G;
    private Map<String, Object> H;
    private String I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1677a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private int o;
    private long p;
    private long q;
    private long r;
    private double s;
    private int t;
    private List<a> u;
    private JSONObject v;
    private d<?> w;
    private Context z;
    private long i = M;
    private int x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private int y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private int F = 0;
    private boolean J = false;
    private int K = 0;
    private int L = 0;

    public b(int i, String str, String str2, String str3) {
        this.f1677a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public int A() {
        return this.j;
    }

    public String B() {
        return this.l;
    }

    public int C() {
        return this.o;
    }

    public int D() {
        return this.F;
    }

    public String E() {
        return this.d;
    }

    public String F() {
        return this.I;
    }

    public int G() {
        int i = this.E;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public boolean H() {
        return m() > System.currentTimeMillis();
    }

    public boolean I() {
        d<?> dVar = this.w;
        if ((dVar != null && !dVar.j()) || g() == null || g().isEmpty()) {
            return false;
        }
        int size = g().size();
        Iterator<a> it = g().iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n nVarF = next.f();
            boolean z2 = nVarF == null || nVarF.j();
            d<?> dVarB = next.b();
            boolean z3 = dVarB == null || dVarB.j();
            d<?> dVarG = next.g();
            if (dVarG != null && !dVarG.j()) {
                z = false;
            }
            if (z2 && z3 && z) {
                i++;
            }
        }
        return i == size;
    }

    public boolean J() {
        return this.h;
    }

    public boolean K() {
        if (g() == null || g().isEmpty()) {
            return false;
        }
        int size = g().size();
        Iterator<a> it = g().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!it.next().j()) {
                i++;
            }
        }
        return i == size;
    }

    public boolean L() {
        return H() && I() && M() && K();
    }

    public boolean M() {
        d<?> dVar = this.w;
        if ((dVar != null && !dVar.j()) || g() == null || g().isEmpty()) {
            return false;
        }
        int size = g().size();
        Iterator<a> it = g().iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n nVarF = next.f();
            boolean z2 = nVarF == null || nVarF.l();
            d<?> dVarB = next.b();
            boolean z3 = dVarB == null || dVarB.l();
            d<?> dVarG = next.g();
            if (dVarG != null && !dVarG.l()) {
                z = false;
            }
            if (z2 && z3 && z) {
                i++;
            }
        }
        return i == size;
    }

    public boolean N() {
        return this.J;
    }

    public int a() {
        return this.f1677a;
    }

    public void b(String str) {
        this.g = str;
    }

    public String c() {
        return this.g;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(int i) {
        this.K = i;
    }

    public void f(int i) {
        this.L = i;
    }

    public void g(String str) {
        this.k = str;
    }

    public void h(int i) {
        this.j = i;
    }

    public void i(int i) {
        this.o = i;
    }

    public JSONObject j() {
        return this.v;
    }

    public double k() {
        return this.s;
    }

    public Map<String, Object> l() {
        if (this.H == null) {
            this.H = new HashMap();
        }
        return this.H;
    }

    public long m() {
        return this.p;
    }

    public long n() {
        return this.q;
    }

    public long o() {
        return this.r;
    }

    public String p() {
        return this.f;
    }

    public int q() {
        return this.B;
    }

    public String r() {
        return this.n;
    }

    public String s() {
        return this.c;
    }

    public String t() {
        return this.e;
    }

    public long u() {
        return this.i;
    }

    public int v() {
        return this.K;
    }

    public int w() {
        return this.L;
    }

    public String x() {
        return this.k;
    }

    public int y() {
        return this.t;
    }

    public long z() {
        return this.G;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public String b() {
        return this.m;
    }

    public void c(long j) {
        this.r = j;
    }

    public void d(long j) {
        this.i = j;
    }

    public void e(String str) {
        this.n = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(int i) {
        this.t = i;
    }

    public void h(String str) {
        this.l = str;
    }

    public Context i() {
        return this.z;
    }

    public void j(int i) {
        this.F = i;
    }

    public void k(int i) {
        this.E = i;
    }

    public void a(String str) {
        this.m = str;
    }

    public void b(long j) {
        this.q = j;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i) {
        this.y = i;
    }

    public String e() {
        return this.A;
    }

    public List<CampaignEx> f() {
        return this.D;
    }

    public List<a> g() {
        return this.u;
    }

    public d<?> h() {
        d<?> dVar = this.w;
        if (dVar != null) {
            return dVar;
        }
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        if (this.w == null) {
            if (c.c(strE)) {
                this.w = new e(this, null);
            } else {
                this.w = new i(this, null);
            }
        }
        return this.w;
    }

    public void i(String str) {
        this.I = str;
    }

    public void a(long j) {
        this.p = j;
    }

    public void b(List<a> list) {
        this.u = list;
    }

    public void c(int i) {
        this.B = i;
    }

    public int d() {
        return this.C;
    }

    public void e(long j) {
        this.G = j;
    }

    public void a(double d) {
        this.s = d;
    }

    public void b(int i) {
        this.x = i;
    }

    public void a(JSONObject jSONObject) {
        this.v = jSONObject;
    }

    public void b(boolean z) {
        this.J = z;
    }

    public void a(int i) {
        this.C = i;
    }

    public void a(List<CampaignEx> list) {
        this.D = list;
    }
}
