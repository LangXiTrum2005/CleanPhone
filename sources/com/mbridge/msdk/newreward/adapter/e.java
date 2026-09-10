package com.mbridge.msdk.newreward.adapter;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBridgeIds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VN;
import java.io.File;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private String A;
    private String B;
    private int D;
    private long E;
    private MBridgeIds O;
    private f P;
    private com.mbridge.msdk.newreward.function.proxy.c Q;
    private N2 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1567a;
    private C4363q1 a0;
    private CampaignEx b;
    private VN b0;
    private boolean c;
    private boolean c0;
    public b d;
    private int e;
    private int f;
    private int g;
    private HandlerThread g0;
    private int h;
    private RewardVideoListener h0;
    private boolean l;
    private boolean m;
    private long o;
    private long p;
    private String t;
    private boolean u;
    private String w;
    private String x;
    private int y;
    int z;
    private int i = com.mbridge.msdk.foundation.same.a.F;
    private int j = 2;
    private int k = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private boolean n = false;
    private boolean q = false;
    private int r = 0;
    private int s = 0;
    private boolean v = false;
    private String C = "";
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private com.mbridge.msdk.newreward.function.model.a I = new com.mbridge.msdk.newreward.function.model.a();
    private com.mbridge.msdk.newreward.function.model.e J = new com.mbridge.msdk.newreward.function.model.e();
    private com.mbridge.msdk.newreward.function.model.f K = new com.mbridge.msdk.newreward.function.model.f();
    private com.mbridge.msdk.newreward.function.model.c L = new com.mbridge.msdk.newreward.function.model.c();
    private com.mbridge.msdk.newreward.function.model.d M = new com.mbridge.msdk.newreward.function.model.d();
    private int N = 25000;
    private boolean R = false;
    private boolean S = false;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    private boolean Y = false;
    private int d0 = 0;
    private JSONArray e0 = new JSONArray();
    private e f0 = null;

    public e(boolean z, int i, String str, String str2, boolean z2) {
        this.c = z;
        this.y = i;
        this.w = str;
        this.x = str2;
        this.m = z2;
    }

    public String A() {
        return this.f1567a;
    }

    public com.mbridge.msdk.newreward.function.model.c B() {
        return this.L;
    }

    public com.mbridge.msdk.newreward.function.model.d C() {
        return this.M;
    }

    public int D() {
        return this.e;
    }

    public String E() {
        if (H() == null) {
            return "ONLY_PLAYABLE";
        }
        boolean z = H().getPlayable_ads_without_video() == 2;
        boolean z2 = this.b.getAdSpaceT() == 2;
        if (z && z2) {
            return "HALF_END_CARD";
        }
        return this.c0 ? "ONLY_PLAYABLE" : "404";
    }

    public int F() {
        int i;
        int iB;
        CampaignEx campaignEx;
        try {
            iB = (g() == null || g().b() == null || g().b().isEmpty() || (campaignEx = g().b().get(0)) == null || campaignEx.getRewardTemplateMode() == null) ? 0 : campaignEx.getRewardTemplateMode().b();
            if (iB == 0) {
                try {
                    com.mbridge.msdk.newreward.function.model.f fVar = this.K;
                    if (fVar != null && fVar.c() != null) {
                        iB = this.K.c().y();
                    }
                } catch (Exception e) {
                    i = iB;
                    e = e;
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                    iB = i;
                }
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
        if (iB != 1) {
            return iB != 2 ? -1 : 0;
        }
        return 1;
    }

    public String G() {
        return this.B;
    }

    public CampaignEx H() {
        return this.b;
    }

    public String I() {
        CampaignEx campaignEx = this.b;
        return campaignEx == null ? "" : campaignEx.getRequestIdNotice();
    }

    public e J() {
        return this.f0;
    }

    public int K() {
        return this.c ? 2 : 3;
    }

    public com.mbridge.msdk.newreward.function.model.e L() {
        return this.J;
    }

    public RewardVideoListener M() {
        return this.h0;
    }

    public String N() {
        return TextUtils.isEmpty(MBridgeGlobalCommon.SESSION_ID) ? "" : MBridgeGlobalCommon.SESSION_ID;
    }

    public com.mbridge.msdk.newreward.function.model.f O() {
        return this.K;
    }

    public HandlerThread P() {
        return this.g0;
    }

    public String Q() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return "904";
        }
        String strE = this.b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return "904";
        }
        if (this.b.getAdSpaceT() == 2) {
            return "HALF_TEMPLATE";
        }
        boolean zC = com.mbridge.msdk.newreward.function.utils.c.c(strE);
        String strValueOf = String.valueOf(this.b.getRewardTemplateMode().f());
        return (!zC && this.c0) ? "WEB_TEMPLATE" : strValueOf;
    }

    public String R() {
        return this.x;
    }

    public VN S() {
        return this.b0;
    }

    public MBridgeIds T() {
        return this.O;
    }

    public boolean U() {
        return this.V;
    }

    public boolean V() {
        return this.S;
    }

    public boolean W() {
        return this.R;
    }

    public boolean X() {
        return this.c;
    }

    public boolean Y() {
        return this.n;
    }

    public boolean Z() {
        return this.F;
    }

    public void a(HandlerThread handlerThread) {
        this.g0 = handlerThread;
    }

    public boolean a0() {
        return this.U;
    }

    public void b(long j) {
        this.E = j;
    }

    public boolean b0() {
        return this.m;
    }

    public void c(long j) {
        this.p = j;
    }

    public boolean c0() {
        return this.l;
    }

    public int d() {
        return this.y;
    }

    public boolean d0() {
        return this.H;
    }

    public void e(boolean z) {
        this.F = z;
    }

    public boolean e0() {
        return this.G;
    }

    public void f(int i) {
        this.f = i;
    }

    public boolean f0() {
        return this.v;
    }

    public void g(int i) {
        this.h = i;
    }

    public boolean g0() {
        return this.T;
    }

    public long h() {
        return this.o;
    }

    public boolean h0() {
        return H() != null && H().getPlayable_ads_without_video() == 2;
    }

    public void i(boolean z) {
        this.H = z;
    }

    public boolean i0() {
        return this.X;
    }

    public void j(boolean z) {
        this.G = z;
    }

    public boolean j0() {
        return this.u;
    }

    public void k(boolean z) {
        this.v = z;
    }

    public boolean k0() {
        return this.Y;
    }

    public String l() {
        return this.C;
    }

    public boolean l0() {
        return this.q;
    }

    public int m() {
        return this.f;
    }

    public boolean m0() {
        return this.W;
    }

    public String n() {
        JSONArray jSONArray = this.e0;
        return jSONArray == null ? "" : jSONArray.toString();
    }

    public void n0() {
        this.r++;
    }

    public long o() {
        com.mbridge.msdk.newreward.function.model.a aVar = this.I;
        if (aVar != null && aVar.a() != null && this.I.a().m() > 0) {
            return this.I.a().m();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.setting.a aVarB = O().b();
        return (aVarB == null ? 3600000L : aVarB.e()) + jCurrentTimeMillis;
    }

    public void o0() {
        this.s++;
    }

    public com.mbridge.msdk.newreward.function.proxy.c p() {
        return this.Q;
    }

    public int q() {
        return this.D;
    }

    public String r() {
        return this.t;
    }

    public int s() {
        return this.j;
    }

    public int t() {
        return this.i;
    }

    public int u() {
        return this.f;
    }

    public int v() {
        return this.h;
    }

    public int w() {
        return this.g;
    }

    public long x() {
        return this.E;
    }

    public long y() {
        return this.p;
    }

    public int z() {
        return this.k;
    }

    public void a(String str) {
        if (this.e0 == null) {
            this.e0 = new JSONArray();
        }
        this.e0.put(str);
    }

    public int b() {
        return this.z;
    }

    public void c(int i) {
        this.D = i;
    }

    public void d(String str) {
        this.C = str;
    }

    public void e(String str) {
        this.t = str;
    }

    public void f(String str) {
        this.f1567a = str;
    }

    public void g(String str) {
        this.B = str;
    }

    public void h(boolean z) {
        this.l = z;
    }

    public int i() {
        int i = this.N;
        if (i <= 0) {
            return 25000;
        }
        return i;
    }

    public void j(int i) {
        this.e = i;
    }

    public String k() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return "404";
        }
        boolean z = this.b.isMraid() || !com.mbridge.msdk.newreward.function.utils.c.c(campaignEx.getendcard_url());
        long ecTemplateId = this.b.getEcTemplateId();
        if (ecTemplateId == 0) {
            ecTemplateId = 404;
        }
        return (z && this.c0) ? "WEB_EC" : String.valueOf(ecTemplateId);
    }

    public void l(boolean z) {
        this.T = z;
    }

    public void m(boolean z) {
        this.X = z;
    }

    public void p(boolean z) {
        this.q = z;
    }

    public void q(boolean z) {
        this.W = z;
    }

    public void b(int i) {
        this.N = i;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(boolean z) {
        this.n = z;
    }

    public void e(int i) {
        this.i = i;
    }

    public String f() {
        return this.w;
    }

    public com.mbridge.msdk.newreward.function.model.a g() {
        return this.I;
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(int i) {
        this.k = i;
    }

    public f j() {
        return this.P;
    }

    public void b(boolean z) {
        this.S = z;
    }

    public void c(boolean z) {
        this.R = z;
    }

    public void d(int i) {
        this.j = i;
    }

    public String e() {
        return this.A;
    }

    public void f(boolean z) {
        this.U = z;
    }

    public void g(boolean z) {
        this.c0 = z;
    }

    public void n(boolean z) {
        this.u = z;
    }

    public void a(com.mbridge.msdk.newreward.function.proxy.c cVar) {
        this.Q = cVar;
    }

    public File b(String str) {
        for (com.mbridge.msdk.newreward.function.core.campaign.a aVar : g().a().g()) {
            if (aVar.i().equals(str)) {
                return aVar.f().n();
            }
        }
        return null;
    }

    public N2 c() {
        return this.Z;
    }

    public void a(long j) {
        this.o = j;
    }

    public void o(boolean z) {
        this.Y = z;
    }

    public void a(com.mbridge.msdk.newreward.function.model.f fVar) {
        this.K = fVar;
    }

    public void a(int i) {
        this.z = i;
    }

    public void a(com.mbridge.msdk.newreward.function.model.a aVar) {
        this.I = aVar;
    }

    public void a(RewardVideoListener rewardVideoListener) {
        this.h0 = rewardVideoListener;
    }

    public void a(int i, int i2, int i3) {
        f(i);
        h(i2);
        g(i3);
    }

    public void a(MBridgeIds mBridgeIds) {
        this.O = mBridgeIds;
    }

    public void a(f fVar) {
        this.P = fVar;
    }

    public void a(boolean z) {
        this.V = z;
    }

    public void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public void a(N2 n2) {
        this.Z = n2;
    }

    public C4363q1 a() {
        return this.a0;
    }

    public void a(C4363q1 c4363q1) {
        this.a0 = c4363q1;
    }

    public void a(VN vn) {
        this.b0 = vn;
    }

    public void a(e eVar) {
        this.f0 = eVar;
    }
}
