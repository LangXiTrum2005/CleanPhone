package com.smartdigimkt.expressad.reward.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.bt.module.ATTempContainer;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTContainer;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.r;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {
    private static final String b1 = "ATRewardVideoActivity";
    public static String c1 = "unitId";
    public static String d1 = "userId";
    public static String e1 = "reward";
    public static String f1 = "mute";
    public static String g1 = "isIV";
    public static String h1 = "isBid";
    public static String i1 = "isBigOffer";
    public static String j1 = "hasRelease";
    public static String k1 = "ivRewardMode";
    public static String l1 = "ivRewardValueType";
    public static String m1 = "ivRewardValue";
    public static String n1 = "extraData";
    public static String o1 = "baserequestInfo";
    public static String p1 = "lRid";
    public static String q1 = "at_intercept_show";
    private List<com.smartdigimkt.c3.c> A0;
    private List<com.smartdigimkt.x.d> B0;
    private ATTempContainer C0;
    private AnythinkBTContainer D0;
    private WindVaneWebView E0;
    private com.smartdigimkt.a2.a F0;
    private String G0;
    private String H0;
    private boolean I0;
    private com.smartdigimkt.l3.a L0;
    com.smartdigimkt.v6.a T0;
    com.smartdigimkt.x.d U0;
    long V0;
    long W0;
    long X0;
    private String h0;
    private String i0;
    private String j0;
    private com.smartdigimkt.d3.c k0;
    private int p0;
    private int q0;
    private int r0;
    private com.smartdigimkt.b2.h u0;
    private com.smartdigimkt.f3.d v0;
    private com.smartdigimkt.c3.c y0;
    private com.smartdigimkt.x.d z0;
    private int l0 = 2;
    private int m0 = 2;
    private boolean n0 = false;
    private boolean o0 = false;
    private boolean s0 = false;
    private boolean t0 = false;
    private boolean w0 = false;
    private boolean x0 = false;
    private int J0 = 1;
    private int K0 = 0;
    private int M0 = 0;
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private com.smartdigimkt.i2.a R0 = new a();
    private com.smartdigimkt.i2.d S0 = new b();
    com.smartdigimkt.i1.b Y0 = new c();
    com.smartdigimkt.s2.a Z0 = new f();
    BroadcastReceiver a1 = new g();

    public class a implements com.smartdigimkt.i2.a {
        public a() {
        }

        @Override // com.smartdigimkt.i2.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey("mute")) {
                ATRewardVideoActivity.this.l0 = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey("position")) {
                int iIntValue = ((Integer) map.get("position")).intValue();
                if (ATRewardVideoActivity.this.B0 == null || ATRewardVideoActivity.this.B0.size() <= 0 || iIntValue < 1) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.z0 = (com.smartdigimkt.x.d) aTRewardVideoActivity.B0.get(iIntValue);
                ATRewardVideoActivity.m(ATRewardVideoActivity.this);
                int i2 = iIntValue - 1;
                if (ATRewardVideoActivity.this.B0.get(i2) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.c(aTRewardVideoActivity2, ((com.smartdigimkt.x.d) aTRewardVideoActivity2.B0.get(i2)).t());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.z0.u0(aTRewardVideoActivity3.a(aTRewardVideoActivity3.z0.o2(), ATRewardVideoActivity.this.J0));
                ATRewardVideoActivity.this.z0.i0(ATRewardVideoActivity.this.J0);
                ATRewardVideoActivity.this.z0.j0(1);
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.b(aTRewardVideoActivity4.z0);
            }
        }
    }

    public class c implements com.smartdigimkt.i1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34712a = "1";

        public c() {
        }

        @Override // com.smartdigimkt.i1.c
        public void a() {
        }

        @Override // com.smartdigimkt.i1.c
        public void b() {
            if (TextUtils.equals(this.f34712a, "1")) {
                this.f34712a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.a("5-".concat(aTRewardVideoActivity.W0 <= aTRewardVideoActivity.X0 ? "2" : "1"), 0L);
        }

        @Override // com.smartdigimkt.i1.c
        public void c() {
        }

        @Override // com.smartdigimkt.i1.c
        public void d() {
            if (TextUtils.equals(this.f34712a, "1")) {
                this.f34712a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.a("6-".concat(aTRewardVideoActivity.W0 <= aTRewardVideoActivity.X0 ? "2" : "1"), 0L);
            }
        }

        @Override // com.smartdigimkt.i1.c
        public void e() {
            this.f34712a = "1";
            ATRewardVideoActivity.this.a("4", 0L);
        }

        @Override // com.smartdigimkt.i1.b
        public String f() {
            return this.f34712a;
        }
    }

    public class d implements com.smartdigimkt.a2.a {
        public d() {
        }

        @Override // com.smartdigimkt.a2.a
        public void a(boolean z2, com.smartdigimkt.d3.c cVar) {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.a(z2, cVar);
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onAdCloseWithIVReward(boolean z2, int i2) {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onAdCloseWithIVReward(z2, i2);
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onAdShow() {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onAdShow();
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onEndcardShow() {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onEndcardShow();
            }
            com.smartdigimkt.i1.b bVar = ATRewardVideoActivity.this.Y0;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onShowFail(String str) {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onShowFail(str);
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onVideoAdClicked(com.smartdigimkt.x.d dVar) {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onVideoAdClicked(dVar);
            }
            com.smartdigimkt.i1.b bVar = ATRewardVideoActivity.this.Y0;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.smartdigimkt.a2.a
        public void onVideoComplete() {
            if (ATRewardVideoActivity.this.u0 != null) {
                ATRewardVideoActivity.this.u0.onVideoComplete();
            }
        }
    }

    public class e implements com.smartdigimkt.z.a {
        public e() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            ATRewardVideoActivity.this.onPause();
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            ATRewardVideoActivity.this.onResume();
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            ATRewardVideoActivity.this.onResume();
        }
    }

    public class f implements com.smartdigimkt.s2.a {
        public f() {
        }

        @Override // com.smartdigimkt.s2.a
        public void a(boolean z2) {
            if (z2) {
                ATRewardVideoActivity.this.m0 = 1;
            } else {
                ATRewardVideoActivity.this.m0 = 2;
            }
            ATRewardVideoActivity.this.h();
        }
    }

    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ATRewardVideoActivity.this.finish();
        }
    }

    public static final class h implements Runnable {
        private final List<com.smartdigimkt.c3.c> X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final String f34718Y;
        private final String Z;

        public h(List<com.smartdigimkt.c3.c> list, String str, String str2) {
            this.X = list;
            this.f34718Y = str;
            this.Z = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.smartdigimkt.c3.c> list = this.X;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.smartdigimkt.c3.c cVar : this.X) {
                    if (cVar != null && cVar.c() != null) {
                        com.smartdigimkt.x.d dVarC = cVar.c();
                        com.smartdigimkt.c3.e.a().b(this.f34718Y, dVarC.N1() + dVarC.j() + dVarC.u2());
                        if (dVarC.U1() != null) {
                            if (!TextUtils.isEmpty(dVarC.U1().f())) {
                                com.smartdigimkt.a3.a.g(this.f34718Y + "_" + dVarC.j() + "_" + this.Z + "_" + dVarC.U1().f());
                                com.smartdigimkt.a3.a.b(dVarC.S(), dVarC);
                            }
                            if (!TextUtils.isEmpty(dVarC.g0())) {
                                com.smartdigimkt.a3.a.g(this.f34718Y + "_" + this.Z + "_" + dVarC.g0());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public static /* synthetic */ int m(ATRewardVideoActivity aTRewardVideoActivity) {
        int i2 = aTRewardVideoActivity.J0;
        aTRewardVideoActivity.J0 = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        List<com.smartdigimkt.x.d> list;
        r rVarT1;
        List<com.smartdigimkt.x.d> list2;
        int iB = b("sdm_temp_container");
        if (iB < 0) {
            d("no id sdm_temp_container in sdm_more_offer_activity layout");
        }
        ATTempContainer aTTempContainer = (ATTempContainer) findViewById(iB);
        this.C0 = aTTempContainer;
        if (aTTempContainer == null) {
            d("env error");
        }
        List<com.smartdigimkt.x.d> list3 = this.B0;
        if (list3 == null || list3.size() <= 0 || !this.B0.get(0).H2()) {
            this.C0.setVisibility(0);
        } else {
            new com.smartdigimkt.l2.b().a(this.C0, 500L);
        }
        a(-1);
        this.C0.setVisibility(0);
        this.C0.setActivity(this);
        this.C0.setBidCampaign(this.o0);
        this.C0.setBigOffer(this.s0);
        this.C0.setUnitId(this.h0);
        this.C0.setCampaign(this.z0);
        if (this.z0.t0() == 5 && (list2 = this.B0) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(b("sdm_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.C0.removeAllViews();
            this.C0.setCampOrderViewData(this.B0, this.K0);
            this.C0.setCamPlayOrderCallback(this.R0, this.J0);
        }
        this.C0.setCampaignDownLoadTask(this.y0);
        this.C0.setIV(this.n0);
        com.smartdigimkt.x.d dVar = this.z0;
        if (dVar == null || dVar.R() != 2) {
            this.C0.setIVRewardEnable(this.p0, this.q0, this.r0);
        } else {
            this.C0.setIVRewardEnable(0, 0, 0);
        }
        this.C0.setMute(this.l0);
        this.C0.setDeveloperExtraData(this.H0);
        com.smartdigimkt.x.d dVar2 = this.z0;
        if (((dVar2 != null && (rVarT1 = dVar2.T1()) != null) || ((list = this.B0) != null && list.size() > 0 && this.B0.get(0) != null && (rVarT1 = this.B0.get(0).T1()) != null)) && !TextUtils.isEmpty(rVarT1.g()) && rVarT1.b() > 0) {
            com.smartdigimkt.d3.c cVar = new com.smartdigimkt.d3.c(rVarT1.g(), rVarT1.b());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.k0 = cVar;
        }
        this.C0.setReward(this.k0);
        this.C0.setRewardUnitSetting(this.v0);
        this.C0.setPlacementId(this.i0);
        this.C0.setUserId(this.j0);
        this.C0.setShowRewardListener(this.u0);
        this.C0.setTempEventListener(this.Y0);
        this.C0.setSoundListener(this.Z0);
        this.C0.init(this);
        this.C0.onCreate();
        this.m0 = this.l0;
    }

    private void p() {
        r rVarT1;
        int iB = b("sdm_bt_container");
        if (iB < 0) {
            d("no sdm_webview_framelayout in sdm_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(iB);
        this.D0 = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            d("env error");
        }
        this.D0.setVisibility(0);
        com.smartdigimkt.a2.a aVarJ = j();
        this.F0 = aVarJ;
        this.D0.setBTContainerCallback(aVarJ);
        this.D0.setShowRewardVideoListener(this.u0);
        this.D0.setChoiceOneCallback(this.S0);
        this.D0.setSoundListener(this.Z0);
        this.D0.setCampaigns(this.B0);
        this.D0.setCampaignDownLoadTasks(this.A0);
        this.D0.setRewardUnitSetting(this.v0);
        this.D0.setUnitId(this.h0);
        this.D0.setPlacementId(this.i0);
        this.D0.setUserId(this.j0);
        this.D0.setActivity(this);
        this.D0.setDeveloperExtraData(this.H0);
        com.smartdigimkt.x.d dVar = this.z0;
        if (((dVar != null && (rVarT1 = dVar.T1()) != null) || (this.B0.get(0) != null && (rVarT1 = this.B0.get(0).T1()) != null)) && !TextUtils.isEmpty(rVarT1.g()) && rVarT1.b() > 0) {
            com.smartdigimkt.d3.c cVar = new com.smartdigimkt.d3.c(rVarT1.g(), rVarT1.b());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.k0 = cVar;
        }
        this.D0.setReward(this.k0);
        this.D0.setIVRewardEnable(this.p0, this.q0, this.r0);
        this.D0.setIV(this.n0);
        this.D0.setMute(this.l0);
        this.D0.setJSFactory((com.smartdigimkt.y2.b) this.f0);
        this.D0.init(this);
        this.D0.onCreate();
        this.m0 = this.l0;
    }

    private void q() {
        if (this.a1 != null) {
            com.smartdigimkt.s6.b.a(this).a(this.a1);
            this.a1 = null;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        int iA = k.a(this, "sdm_reward_activity_close", k.g);
        int iA2 = k.a(this, "sdm_reward_activity_stay", k.g);
        if (iA > 1 && iA2 > 1) {
            overridePendingTransition(iA2, iA);
        }
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.C0 = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.D0 = null;
        }
        com.smartdigimkt.z.b.b().d(this.h0 + "_1");
        com.smartdigimkt.z.b.b().d(this.h0 + "_2");
        super.finish();
    }

    @Override // com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.C0 != null) {
            a(configuration.orientation);
            this.C0.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.smartdigimkt.expressad.activity.ATBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayListC;
        List<com.smartdigimkt.c3.c> list;
        String strG0 = "";
        try {
            super.onCreate(bundle);
            com.smartdigimkt.b.b.y = true;
            com.smartdigimkt.u.a.f().a(this);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(c1);
            this.h0 = stringExtra;
            if (stringExtra != null) {
                try {
                    copyOnWriteArrayListC = com.smartdigimkt.c3.e.a().c(this.h0);
                } catch (Throwable unused) {
                }
            } else {
                copyOnWriteArrayListC = null;
            }
            this.U0 = copyOnWriteArrayListC != null ? copyOnWriteArrayListC.get(0) : null;
            Serializable serializableExtra = intent.getSerializableExtra(o1);
            this.T0 = serializableExtra instanceof com.smartdigimkt.v6.a ? (com.smartdigimkt.v6.a) serializableExtra : null;
            a("1", 0L);
            this.u0 = com.smartdigimkt.h1.a.h1.get(this.h0);
            this.i0 = intent.getStringExtra(com.smartdigimkt.b.b.f33814z);
            this.k0 = com.smartdigimkt.d3.c.a(intent.getStringExtra(e1));
            this.j0 = intent.getStringExtra(d1);
            this.l0 = intent.getIntExtra(f1, 2);
            this.n0 = intent.getBooleanExtra(g1, false);
            this.o0 = intent.getBooleanExtra(h1, false);
            this.H0 = intent.getStringExtra(n1);
            if (this.n0) {
                this.p0 = intent.getIntExtra(k1, 0);
                this.q0 = intent.getIntExtra(l1, 0);
                this.r0 = intent.getIntExtra(m1, 0);
            }
            this.s0 = intent.getBooleanExtra(i1, false);
            this.A0 = com.smartdigimkt.c3.e.a().b(this.h0);
            this.B0 = com.smartdigimkt.c3.e.a().c(this.h0);
            int iC = c("sdm_more_offer_activity");
            if (iC < 0) {
                d("no sdm_more_offer_activity layout");
                return;
            }
            setContentView(iC);
            if (TextUtils.isEmpty(this.h0)) {
                d("data empty error");
                return;
            }
            com.smartdigimkt.y2.b bVar = new com.smartdigimkt.y2.b(this);
            this.f0 = bVar;
            a(bVar);
            if (this.u0 == null) {
                d("showRewardListener is null");
                return;
            }
            com.smartdigimkt.f3.d dVarA = com.smartdigimkt.g1.e.a().a(this.i0, this.h0);
            this.v0 = dVarA;
            if (dVarA == null) {
                com.smartdigimkt.f3.d dVarB = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), this.h0);
                this.v0 = dVarB;
                if (dVarB == null) {
                    this.v0 = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.h0, this.n0);
                }
            }
            com.smartdigimkt.f3.d dVar = this.v0;
            if (dVar != null) {
                this.k0.a(dVar.e());
                this.k0.b(this.v0.E());
            }
            com.smartdigimkt.d3.c cVar = this.k0;
            if (cVar != null && cVar.a() <= 0) {
                this.k0.a(1);
            }
            int iA = k.a(this, "sdm_reward_activity_open", k.g);
            int iA2 = k.a(this, "sdm_reward_activity_stay", k.g);
            if (iA > 1 && iA2 > 1) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.x0 = bundle.getBoolean(j1);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            l();
            if (!this.s0) {
                List<com.smartdigimkt.c3.c> list2 = this.A0;
                if (list2 != null && list2.size() > 0) {
                    this.y0 = this.A0.get(0);
                }
                com.smartdigimkt.c3.c cVar2 = this.y0;
                if (cVar2 != null) {
                    this.z0 = cVar2.c();
                    this.y0.d(true);
                    this.y0.e(false);
                }
                if (this.y0 == null || this.z0 == null || this.k0 == null) {
                    d("data empty error");
                }
                o();
                return;
            }
            this.G0 = "";
            List<com.smartdigimkt.x.d> list3 = this.B0;
            if (list3 != null && list3.size() > 0) {
                com.smartdigimkt.x.d dVar2 = this.B0.get(0);
                strG0 = dVar2.g0();
                this.G0 = dVar2.N1();
            }
            WindVaneWebView windVaneWebViewA = a(this.h0 + "_" + this.G0 + "_" + strG0);
            this.E0 = windVaneWebViewA;
            if (windVaneWebViewA != null) {
                p();
                return;
            }
            if (this.y0 == null && (list = this.A0) != null && list.size() > 0) {
                this.y0 = this.A0.get(0);
            }
            if (this.y0 == null) {
                this.y0 = com.smartdigimkt.c3.e.a().a(this.n0 ? 287 : 94, this.h0, this.o0);
            }
            com.smartdigimkt.c3.c cVar3 = this.y0;
            if (cVar3 != null) {
                this.z0 = cVar3.c();
                this.y0.d(true);
                this.y0.e(false);
            }
            if (this.y0 == null || this.z0 == null || this.k0 == null) {
                d("data empty error");
            }
            this.s0 = false;
            List<com.smartdigimkt.x.d> listA = com.smartdigimkt.b3.a.a().a(this.B0);
            if (listA == null) {
                d("no available campaign");
                return;
            }
            int size = listA.size();
            if (size == 0) {
                d("no available campaign");
                return;
            }
            if (listA.get(0) == null || !listA.get(0).H2()) {
                o();
                return;
            }
            if (size != 1) {
                a(listA);
                return;
            }
            com.smartdigimkt.x.d dVar3 = listA.get(0);
            this.z0 = dVar3;
            if (dVar3 != null) {
                dVar3.d(true);
            }
            b(this.z0);
        } catch (Throwable th) {
            d("onCreate error" + th);
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity, com.smartdigimkt.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable unused) {
        }
        q();
        g();
        i();
        com.smartdigimkt.v2.a.a(this.h0);
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.C0 = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.D0 = null;
        }
        this.R0 = null;
        this.S0 = null;
        com.smartdigimkt.t0.a.a().execute(new h(this.A0, this.h0, this.G0));
        List<com.smartdigimkt.x.d> list = this.B0;
        com.smartdigimkt.x.d dVar = (list == null || list.size() <= 0) ? null : this.B0.get(0);
        if (dVar == null) {
            dVar = this.z0;
        }
        if (dVar != null && !TextUtils.isEmpty(dVar.u2())) {
            p.c().a();
        }
        this.Y0 = null;
        this.Z0 = null;
        if (this.T0 != null) {
            com.smartdigimkt.i7.a.a().a(this.T0.f + this.T0.f39166e);
        }
        m();
    }

    @Override // com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        long j = this.X0 + 1;
        this.X0 = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            com.smartdigimkt.i1.b bVar = this.Y0;
            sb.append(bVar != null ? bVar.f() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.V0);
        }
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.activity.AbstractJSActivity, com.smartdigimkt.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        AnythinkVideoView anythinkVideoView;
        super.onResume();
        this.V0 = SystemClock.elapsedRealtime();
        long j = this.W0 + 1;
        this.W0 = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            com.smartdigimkt.i1.b bVar = this.Y0;
            sb.append(bVar != null ? bVar.f() : "0");
            a(sb.toString(), 0L);
        }
        if (com.smartdigimkt.z.b.f) {
            ATTempContainer aTTempContainer = this.C0;
            if (aTTempContainer == null || (anythinkVideoView = aTTempContainer.mbridgeVideoView) == null) {
                return;
            }
            anythinkVideoView.setCover(false);
            return;
        }
        com.smartdigimkt.u.a.f().a(this);
        ATTempContainer aTTempContainer2 = this.C0;
        if (aTTempContainer2 != null) {
            aTTempContainer2.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
        h();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(j1, this.x0);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        new e();
        if (com.smartdigimkt.z.b.f) {
            return;
        }
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.z0.G(this.h0);
            com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.h0, "_1"), this.z0);
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<com.smartdigimkt.x.d> list = this.B0;
            if (list != null && list.size() > 0) {
                com.smartdigimkt.x.d dVar = this.B0.get(0);
                dVar.G(this.h0);
                com.smartdigimkt.z.b.b().a(this.h0 + "_1", dVar);
            }
        }
        if (this.I0) {
            return;
        }
        com.smartdigimkt.z.b.b().a(this.h0 + "_1", 1);
        com.smartdigimkt.z.b.b().d(this.h0 + "_2");
        this.I0 = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        com.smartdigimkt.b.b.y = false;
        try {
            super.onStop();
        } catch (Throwable unused) {
            a();
        }
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(k.a(this, "sdm_transparent_theme", "style"));
    }

    public static /* synthetic */ int c(ATRewardVideoActivity aTRewardVideoActivity, int i2) {
        int i3 = aTRewardVideoActivity.K0 - i2;
        aTRewardVideoActivity.K0 = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        com.smartdigimkt.b2.h hVar = this.u0;
        if (hVar != null) {
            hVar.onShowFail(str);
        }
        finish();
    }

    private void g() {
        try {
            com.smartdigimkt.b2.h hVar = this.u0;
            if (hVar instanceof com.smartdigimkt.b2.c) {
                com.smartdigimkt.b2.c cVar = (com.smartdigimkt.b2.c) hVar;
                if (cVar.f33891a || cVar.f33892b) {
                    return;
                }
                hVar.onShowFail("show fail : unexpected destroy");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.m0 == 2) {
            n();
        }
    }

    private void i() {
        try {
            List<com.smartdigimkt.x.d> list = this.B0;
            if (list != null && list.size() > 0) {
                Iterator<com.smartdigimkt.x.d> it = this.B0.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            com.smartdigimkt.x.d dVar = this.z0;
            if (dVar != null) {
                a(dVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private com.smartdigimkt.a2.a j() {
        if (this.F0 == null) {
            this.F0 = new d();
        }
        return this.F0;
    }

    private boolean k() {
        com.smartdigimkt.x.d dVar = this.U0;
        return (dVar == null || TextUtils.isEmpty(dVar.u2())) ? false : true;
    }

    private void l() {
        if (this.a1 != null) {
            IntentFilter intentFilter = new IntentFilter();
            String str = q1;
            if (this.T0 != null) {
                str = q1 + this.T0.f;
            }
            intentFilter.addAction(str);
            com.smartdigimkt.s6.b.a(this).a(this.a1, intentFilter);
        }
    }

    private void m() {
        com.smartdigimkt.l3.a aVar = this.L0;
        if (aVar != null) {
            aVar.a();
            this.L0 = null;
        }
    }

    private void n() {
        if (k()) {
            if (this.L0 == null) {
                com.smartdigimkt.l3.a aVar = new com.smartdigimkt.l3.a();
                this.L0 = aVar;
                aVar.a(this);
            }
            this.L0.b();
        }
    }

    private void c(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            int iA = a(dVar.o2(), this.J0);
            this.z0 = dVar;
            dVar.d(true);
            this.J0 = 1;
            this.z0.u0(iA);
            this.z0.i0(this.J0);
            this.z0.j0(1);
            b(this.z0);
            return;
        }
        d("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.x.d dVarC;
        try {
            List<com.smartdigimkt.c3.c> list = this.A0;
            if (list != null && list.size() > 0) {
                for (com.smartdigimkt.c3.c cVar : this.A0) {
                    if (cVar != null && (dVarC = cVar.c()) != null && TextUtils.equals(dVarC.j(), dVar.j()) && TextUtils.equals(dVarC.N1(), dVar.N1())) {
                        this.y0 = cVar;
                    }
                }
            }
            this.s0 = true;
            o();
            ATTempContainer aTTempContainer = this.C0;
            if (aTTempContainer != null) {
                aTTempContainer.setNotchPadding(this.Q0, this.M0, this.O0, this.N0, this.P0);
            }
        } catch (Exception e2) {
            e2.getMessage();
            d("more offer to one offer exception");
        }
    }

    public class b implements com.smartdigimkt.i2.d {
        public b() {
        }

        @Override // com.smartdigimkt.i2.d
        public void a(com.smartdigimkt.x.d dVar) {
            if (dVar == null) {
                ATRewardVideoActivity.this.d("campaign is null");
                return;
            }
            if (ATRewardVideoActivity.this.D0 != null) {
                new com.smartdigimkt.l2.b().b(ATRewardVideoActivity.this.D0, 500L);
            }
            ATRewardVideoActivity.this.z0 = dVar;
            ATRewardVideoActivity.this.z0.j0(2);
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.b(aTRewardVideoActivity.z0);
        }

        @Override // com.smartdigimkt.i2.d
        public void a() {
            if (ATRewardVideoActivity.this.D0 != null) {
                new com.smartdigimkt.l2.b().b(ATRewardVideoActivity.this.D0, 500L);
            }
            ATRewardVideoActivity.this.s0 = true;
            ATRewardVideoActivity.this.o();
            if (ATRewardVideoActivity.this.C0 != null) {
                ATRewardVideoActivity.this.C0.setNotchPadding(ATRewardVideoActivity.this.Q0, ATRewardVideoActivity.this.M0, ATRewardVideoActivity.this.O0, ATRewardVideoActivity.this.N0, ATRewardVideoActivity.this.P0);
            }
        }
    }

    private void a(List<com.smartdigimkt.x.d> list) {
        if (list == null) {
            d("no available campaign");
            return;
        }
        if (list.size() == 0) {
            d("no available campaign");
            return;
        }
        if (list.get(0) != null && list.get(0).t0() == 5) {
            for (com.smartdigimkt.x.d dVar : list) {
                if (dVar != null) {
                    this.K0 = dVar.t() + this.K0;
                }
            }
            c(list.get(0));
            return;
        }
        p();
    }

    public int c(String str) {
        return k.a(getApplicationContext(), str, "layout");
    }

    public int b(String str) {
        return k.a(getApplicationContext(), str, "id");
    }

    private WindVaneWebView a(String str) {
        com.smartdigimkt.a3.a.C0428a c0428aB = com.smartdigimkt.a3.a.b(str);
        if (c0428aB != null) {
            return c0428aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2, int i3) {
        List<com.smartdigimkt.x.d> list = this.B0;
        if (list != null && list.size() != 0) {
            int iT = 0;
            int iO2 = 0;
            for (int i4 = 0; i4 < this.B0.size(); i4++) {
                if (this.B0.get(0) != null) {
                    if (i4 == 0) {
                        iO2 = this.B0.get(0).o2();
                    }
                    iT += this.B0.get(i4).t();
                }
            }
            if (i3 == 1) {
                if (i2 == 0) {
                    if (iT >= 45) {
                        return 45;
                    }
                } else if (iT > i2) {
                    if (i2 > 45) {
                        return 45;
                    }
                }
                return iT;
            }
            int iT2 = 0;
            for (int i5 = 0; i5 < i3 - 1; i5++) {
                if (this.B0.get(i5) != null) {
                    iT2 += this.B0.get(i5).t();
                }
            }
            if (iO2 > iT2) {
                return iO2 - iT2;
            }
            return 0;
        }
        return i2;
    }

    @Override // com.smartdigimkt.expressad.activity.ATBaseActivity
    public void a(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        this.M0 = i3;
        this.O0 = i4;
        this.N0 = i5;
        this.P0 = i6;
        this.Q0 = i2;
        ATTempContainer aTTempContainer = this.C0;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i2, i3, i4, i5, i6);
            i11 = i6;
            i10 = i5;
            i9 = i4;
            i8 = i3;
            i7 = i2;
        } else {
            i7 = i2;
            i8 = i3;
            i9 = i4;
            i10 = i5;
            i11 = i6;
        }
        AnythinkBTContainer anythinkBTContainer = this.D0;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i7, i8, i9, i10, i11);
        }
        com.smartdigimkt.d2.b.a(i7, i8, i9, i10, i11);
    }

    public void a(int i2) {
        int iF;
        int iG;
        int iG2;
        float f2;
        try {
            com.smartdigimkt.x.d dVar = this.z0;
            if (dVar == null || dVar.R() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C0.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.z0.U1().c() == 0) {
                if (i2 == 2) {
                    iF = (int) (v.f(this) * 0.6f);
                    iG2 = v.g(this);
                    f2 = iG2 * 0.6f;
                } else {
                    iF = (int) (v.f(this) * 0.6f);
                    iG = v.g(this);
                    f2 = iG * 0.7f;
                }
            } else if (this.z0.U1().c() == 2) {
                iF = (int) (v.f(this) * 0.6f);
                iG2 = v.g(this);
                f2 = iG2 * 0.6f;
            } else {
                iF = (int) (v.f(this) * 0.6f);
                iG = v.g(this);
                f2 = iG * 0.7f;
            }
            int i3 = (int) f2;
            layoutParams.height = iF;
            layoutParams.width = i3;
            this.C0.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void a(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.k())) {
                com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.k());
            }
            if (TextUtils.isEmpty(dVar.i())) {
                return;
            }
            com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j) {
        String str2;
        String str3;
        try {
            com.smartdigimkt.v6.a aVar = this.T0;
            String str4 = aVar != null ? aVar.f39166e : "";
            if (aVar != null) {
                str2 = this.T0.f39164b + "";
            } else {
                str2 = "";
            }
            if (this.T0 != null) {
                str3 = this.T0.j + "";
            } else {
                str3 = "";
            }
            com.smartdigimkt.x.d dVar = this.U0;
            String strJ = dVar != null ? dVar.j() : "";
            com.smartdigimkt.x.d dVar2 = this.U0;
            com.smartdigimkt.i7.d.a(str, aVar, str4, str2, str3, 2, 1, strJ, "20", !TextUtils.isEmpty(dVar2 != null ? dVar2.u2() : ""), j);
        } catch (Throwable unused) {
        }
    }
}
