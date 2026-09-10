package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBTempContainer A;
    private MBridgeBTContainer B;
    private WindVaneWebView C;
    private com.mbridge.msdk.video.bt.module.listener.a D;
    private String E;
    private String F;
    private boolean G;
    private String O;
    private com.mbridge.msdk.foundation.same.report.metrics.c P;
    private boolean R;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f35518j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35523p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f35526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f35527t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f35530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CampaignEx f35531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f35532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<CampaignEx> f35533z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35519k = 2;
    private boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35520m = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35524q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35525r = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35528u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35529v = false;
    private int H = 1;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private int N = 0;
    private boolean Q = false;
    private AdSession S = null;
    private MediaEvents T = null;
    private AdEvents U = null;
    private long V = 0;
    private String W = "";
    private Boolean X = null;
    private int Y = 0;
    private boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f35509a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f35510b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f35511c0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f35512d0 = "null";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f35513e0 = new a();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f35514f0 = new b();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.video.dynview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f35519k = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(X3.i.L)) {
                int iIntValue = ((Integer) map.get(X3.i.L)).intValue();
                if (MBRewardVideoActivity.this.f35533z == null || MBRewardVideoActivity.this.f35533z.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f35531x = (CampaignEx) mBRewardVideoActivity.f35533z.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f35533z.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f35533z.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f35531x.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f35531x.getVideoCompleteTime(), MBRewardVideoActivity.this.H));
                MBRewardVideoActivity.this.f35531x.setShowIndex(MBRewardVideoActivity.this.H);
                MBRewardVideoActivity.this.f35531x.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f35531x);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f35538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35540c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f35538a = list;
            this.f35539b = str;
            this.f35540c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f35538a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f35538a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx campaignExH = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExH);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f35539b, campaignExH.getRequestId() + campaignExH.getId() + campaignExH.getVideoUrlEncode());
                        if (campaignExH.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExH.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.f35539b + "_" + campaignExH.getId() + "_" + this.f35540c + "_" + campaignExH.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(campaignExH.getAdType(), campaignExH);
                            }
                            if (!TextUtils.isEmpty(campaignExH.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f35539b + "_" + this.f35540c + "_" + campaignExH.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f35539b, campaignExH);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f35541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35542b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f35541a = list;
            this.f35542b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f35541a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f35541a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.f35542b);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    public static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.H;
        mBRewardVideoActivity.H = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f35531x;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f35531x.getRewardTemplateMode().g() == 0) {
                if (i10 == 2) {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG2 = v0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG = v0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f35531x.getRewardTemplateMode().g() == 2) {
                iF = (int) (v0.f(this) * 0.6f);
                iG2 = v0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (v0.f(this) * 0.6f);
                iG = v0.g(this);
                f10 = iG * 0.7f;
            }
            int i11 = (int) f10;
            layoutParams.height = iF;
            layoutParams.width = i11;
            this.A.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        this.Z = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35515g);
        if (this.S != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.S.removeAllFriendlyObstructions();
            this.S.finish();
            this.S = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
        this.f35510b0 = true;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.f35509a0 = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.A.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
            this.f35512d0 = com.mbridge.msdk.foundation.controller.c.n().f().getClass().getSimpleName();
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.V = SystemClock.elapsedRealtime();
        this.W = TextUtils.isEmpty(this.W) ? "onCreate" : defpackage.e.q(this.W, "_onCreate", new StringBuilder());
        try {
            Intent intent = getIntent();
            this.f35515g = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f35516h = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f35518j = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f35517i = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f35519k = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.l = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c.n().b(this.l ? 287 : 94);
            this.f35520m = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.F = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            this.Q = intent.getBooleanExtra("is_refactor", false);
            if ((intent.getFlags() & 268435456) != 0) {
                this.f35511c0 = 0;
            } else {
                this.f35511c0 = 1;
            }
            if (this.Q) {
                this.f35526s = MBridgeGlobalCommon.showRewardListenerMap.get(this.f35515g);
            } else {
                this.f35526s = com.mbridge.msdk.reward.controller.a.f35416f0.get(this.f35515g);
            }
            if (this.l) {
                this.f35521n = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f35522o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f35523p = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f35524q = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f35532y = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f35515g);
            this.f35533z = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f35515g);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f35515g)) {
                b("data empty error");
                return;
            }
            IJSFactory bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f35526s;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.Y = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f35516h, this.f35515g);
            this.f35527t = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35515g);
                this.f35527t = cVarC;
                if (cVarC == null) {
                    this.f35527t = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35515g, this.l);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f35527t;
            if (cVar2 != null) {
                this.f35518j.a(cVar2.d());
                this.f35518j.b(this.f35527t.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f35518j;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f35518j.a(1);
            }
            int iA = i0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(iA) && i0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f35529v = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f35524q);
            if (!this.f35524q) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f35532y;
                if (list2 != null && list2.size() > 0) {
                    this.f35530w = this.f35532y.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f35530w;
                if (aVar != null) {
                    this.f35531x = aVar.h();
                    this.f35530w.b(true);
                    this.f35530w.d(false);
                    CampaignEx campaignEx = this.f35531x;
                    if (campaignEx != null) {
                        this.O = campaignEx.getCurrentLocalRid();
                        this.f35531x.setShowIndex(1);
                        this.f35531x.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f35412b0 = this.f35531x.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35531x.getMaitve(), this.f35531x.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f35531x;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f35530w != null && this.f35531x != null && this.f35518j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f35531x);
                    a(arrayList);
                    b(this.f35531x);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f35533z);
            this.E = "";
            List<CampaignEx> list3 = this.f35533z;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f35533z.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.f35533z, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.E = campaignEx3.getRequestId();
                this.O = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f35412b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f35515g + "_" + this.E + "_" + cMPTEntryUrl);
            this.C = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f35530w == null && (list = this.f35532y) != null && list.size() > 0) {
                    this.f35530w = this.f35532y.get(0);
                }
                if (this.f35530w == null) {
                    this.f35530w = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l ? 287 : 94, this.f35515g, this.f35520m);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f35530w;
                if (aVar2 != null) {
                    this.f35531x = aVar2.h();
                    this.f35530w.b(true);
                    this.f35530w.d(false);
                }
                if (this.f35530w != null && this.f35531x != null && this.f35518j != null) {
                    this.f35524q = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f35533z);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f35531x = campaignEx4;
                        if (campaignEx4 != null) {
                            this.O = campaignEx4.getCurrentLocalRid();
                            this.f35531x.setCampaignIsFiltered(true);
                        }
                        c(this.f35531x);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f35533z.get(0));
            WindVaneWebView windVaneWebView = this.C;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.f35533z.get(0).getLocalRequestId(), this.f35533z.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.C.getObject();
                    kVar.setAdEvents(this.U);
                    kVar.setAdSession(this.S);
                    kVar.setVideoEvents(this.T);
                    this.C.setObject(kVar);
                } catch (Exception e11) {
                    q0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th2) {
            a(this.f35533z);
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String strQ;
        int i10;
        if (TextUtils.isEmpty(this.W)) {
            strQ = "onDestroy";
        } else {
            strQ = defpackage.e.q(this.W, "_onDestroy", new StringBuilder());
        }
        this.W = strQ;
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.W) ? "unKnown" : this.W);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.V));
        Boolean bool = this.X;
        int i11 = 0;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.booleanValue() ? 1 : 2;
        }
        eVar.a("is_unexpected_destroy", Integer.valueOf(i10));
        eVar.a("is_listener_null", Integer.valueOf(this.f35526s == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Z ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.f35509a0 ? 1 : 2));
        eVar.a("is_back_dispatcher_invoked", Integer.valueOf(this.f35510b0 ? 1 : 2));
        h hVar = this.f35526s;
        if (hVar != null) {
            i11 = hVar.hashCode() == this.Y ? 1 : 2;
        }
        eVar.a("is_listener_change", Integer.valueOf(i11));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f35531x, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f35515g);
        h();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        this.f35513e0 = null;
        this.f35514f0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35515g + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35515g + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f35532y, this.f35515g, this.E));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String strQ;
        super.onPause();
        if (TextUtils.isEmpty(this.W)) {
            strQ = X3.i.t0;
        } else {
            strQ = defpackage.e.q(this.W, "_onPause", new StringBuilder());
        }
        this.W = strQ;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        String strQ;
        super.onRestart();
        if (TextUtils.isEmpty(this.W)) {
            strQ = "onRestart";
        } else {
            strQ = defpackage.e.q(this.W, "_onRestart", new StringBuilder());
        }
        this.W = strQ;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        this.W = TextUtils.isEmpty(this.W) ? X3.i.f27817u0 : defpackage.e.q(this.W, "_onResume", new StringBuilder());
        if (com.mbridge.msdk.foundation.feedback.b.f33675f) {
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f35515g, this.f35532y));
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.A;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f35529v);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        String strQ;
        super.onStart();
        if (TextUtils.isEmpty(this.W)) {
            strQ = "onStart";
        } else {
            strQ = defpackage.e.q(this.W, "_onStart", new StringBuilder());
        }
        this.W = strQ;
        if (com.mbridge.msdk.foundation.feedback.b.f33675f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f35531x.setCampaignUnitId(this.f35515g);
            com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.f35515g, "_1", new StringBuilder()), this.f35531x);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f35533z;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f35533z.get(0);
                campaignEx.setCampaignUnitId(this.f35515g);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f35515g + "_1", campaignEx);
            }
        }
        if (this.G) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f35515g + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35515g + "_2");
        this.G = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        String strQ;
        if (TextUtils.isEmpty(this.W)) {
            strQ = "onStop";
        } else {
            strQ = defpackage.e.q(this.W, "_onStop", new StringBuilder());
        }
        this.W = strQ;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        this.J = i11;
        this.L = i12;
        this.K = i13;
        this.M = i14;
        this.N = i10;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i10, i11, i12, i13, i14);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.video.bt.module.listener.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(MBRewardVideoActivity.this.P);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(MBRewardVideoActivity.this.P, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(MBRewardVideoActivity.this.P, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f35526s != null) {
                MBRewardVideoActivity.this.f35526s.a(i10, str, str2);
            }
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.I - i10;
        mBRewardVideoActivity.I = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExH;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f35532y;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f35532y) {
                    if (aVar != null && (campaignExH = aVar.h()) != null && TextUtils.equals(campaignExH.getId(), campaignEx.getId()) && TextUtils.equals(campaignExH.getRequestId(), campaignEx.getRequestId())) {
                        this.f35530w = aVar;
                    }
                }
            }
            this.f35524q = true;
            j();
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.N, this.J, this.L, this.K, this.M);
            }
        } catch (Exception e10) {
            q0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f35527t, this.f35515g);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35515g, this.l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.S;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.f35526s;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.X = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.X = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void g() {
        h hVar;
        try {
            Boolean bool = this.X;
            if ((bool == null || bool.booleanValue()) && (hVar = this.f35526s) != null) {
                hVar.a(this.P, "show fail : unexpected destroy");
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f35533z;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f35533z.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f35531x;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.D == null) {
            this.D = new c();
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!i0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.A = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f35533z;
        if (list3 == null || list3.size() <= 0 || !this.f35533z.get(0).isDynamicView()) {
            this.A.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.A, 500L);
        }
        changeHalfScreenPadding(-1);
        this.A.setActivity(this);
        this.A.setBidCampaign(this.f35520m);
        this.A.setBigOffer(this.f35524q);
        this.A.setUnitId(this.f35515g);
        this.A.setCampaign(this.f35531x);
        if (this.f35531x.getDynamicTempCode() == 5 && (list2 = this.f35533z) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.A.removeAllViews();
            this.A.setCampOrderViewData(this.f35533z, this.I);
            this.A.setCamPlayOrderCallback(this.f35513e0, this.H);
        }
        this.A.setCampaignDownLoadTask(this.f35530w);
        this.A.setIV(this.l);
        CampaignEx campaignEx2 = this.f35531x;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.A.setIVRewardEnable(this.f35521n, this.f35522o, this.f35523p);
        } else {
            this.A.setIVRewardEnable(0, 0, 0);
        }
        this.A.setMute(this.f35519k);
        CampaignEx campaignEx3 = this.f35531x;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f35533z) != null && list.size() > 0 && this.f35533z.get(0) != null && (rewardPlus = this.f35533z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f35518j = cVar;
        }
        this.A.setReward(this.f35518j);
        this.A.setRewardUnitSetting(this.f35527t);
        this.A.setPlacementId(this.f35516h);
        this.A.setUserId(this.f35517i);
        this.A.setShowRewardListener(this.f35526s);
        this.A.setDeveloperExtraData(this.F);
        this.A.init(this);
        this.A.setAdSession(this.S);
        this.A.setAdEvents(this.U);
        this.A.setVideoEvents(this.T);
        this.A.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f35531x) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!i0.a(iFindID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.B = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.B.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.D = aVarI;
        this.B.setBTContainerCallback(aVarI);
        this.B.setShowRewardVideoListener(this.f35526s);
        this.B.setChoiceOneCallback(this.f35514f0);
        this.B.setCampaigns(this.f35533z);
        this.B.setCampaignDownLoadTasks(this.f35532y);
        this.B.setRewardUnitSetting(this.f35527t);
        this.B.setUnitId(this.f35515g);
        this.B.setPlacementId(this.f35516h);
        this.B.setUserId(this.f35517i);
        this.B.setActivity(this);
        CampaignEx campaignEx = this.f35531x;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f35533z.get(0) != null && (rewardPlus = this.f35533z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f35518j = cVar;
        }
        this.B.setReward(this.f35518j);
        this.B.setIVRewardEnable(this.f35521n, this.f35522o, this.f35523p);
        this.B.setIV(this.l);
        this.B.setMute(this.f35519k);
        this.B.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.B.setDeveloperExtraData(this.F);
        this.B.init(this);
        this.B.setAdSession(this.S);
        this.B.setVideoEvents(this.T);
        this.B.setAdEvents(this.U);
        this.B.onCreate(this.Q);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f35533z) == null || list.size() <= 0 || this.f35533z.get(0) == null) {
            return;
        }
        d(this.f35533z.get(0));
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.S == null) {
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f35515g, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.S = adSessionA;
                    if (adSessionA != null) {
                        this.U = AdEvents.createAdEvents(adSessionA);
                        this.T = MediaEvents.createMediaEvents(this.S);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.video.dynview.listener.d {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f35531x = campaignEx;
            MBRewardVideoActivity.this.f35531x.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f35531x);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() {
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f35524q = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.A != null) {
                MBRewardVideoActivity.this.A.setNotchPadding(MBRewardVideoActivity.this.N, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.M);
            }
        }
    }

    private WindVaneWebView a(String str) {
        com.mbridge.msdk.videocommon.a.C0209a c0209aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0209aB != null) {
            return c0209aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f35533z;
        if (list != null && list.size() != 0) {
            int videoLength = 0;
            int videoCompleteTime = 0;
            for (int i12 = 0; i12 < this.f35533z.size(); i12++) {
                if (this.f35533z.get(0) != null) {
                    if (i12 == 0) {
                        videoCompleteTime = this.f35533z.get(0).getVideoCompleteTime();
                    }
                    videoLength += this.f35533z.get(i12).getVideoLength();
                }
            }
            if (i11 == 1) {
                if (i10 == 0) {
                    if (videoLength >= 45) {
                        return 45;
                    }
                } else if (videoLength > i10) {
                    if (i10 > 45) {
                        return 45;
                    }
                }
                return videoLength;
            }
            int videoLength2 = 0;
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                if (this.f35533z.get(i13) != null) {
                    videoLength2 += this.f35533z.get(i13).getVideoLength();
                }
            }
            if (videoCompleteTime > videoLength2) {
                return videoCompleteTime - videoLength2;
            }
            return 0;
        }
        return i10;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int iA = a(campaignEx.getVideoCompleteTime(), this.H);
            this.f35531x = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.H = 1;
            this.f35531x.setVideoCompleteTime(iA);
            this.f35531x.setShowIndex(this.H);
            this.f35531x.setShowType(1);
            c(this.f35531x);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.O = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.I = campaignEx.getVideoLength() + this.I;
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                f2.g().a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            f2.g().a(campaignEx.getIconUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.f35533z);
        h hVar = this.f35526s;
        if (hVar != null) {
            hVar.a(this.P, str);
        }
        finish();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a(List<CampaignEx> list) {
        ArrayList arrayList;
        List<CampaignEx> list2;
        CampaignEx campaignEx;
        if (this.R) {
            return;
        }
        if (list == null) {
            try {
                list2 = list;
                if (this.f35524q) {
                    list2 = this.f35533z;
                } else {
                    arrayList = new ArrayList();
                    List<com.mbridge.msdk.videocommon.download.a> list3 = this.f35532y;
                    if (list3 != null && list3.get(0) != null && this.f35532y.get(0).h() != null) {
                        list2 = arrayList;
                        list2 = arrayList;
                        list2 = arrayList;
                        arrayList.add(this.f35532y.get(0).h());
                        list2 = arrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        list2 = arrayList;
        list2 = arrayList;
        list2 = arrayList;
        list2 = arrayList;
        list2 = arrayList;
        list2 = arrayList;
        list2 = list;
        String currentLocalRid = "";
        if (list2 != null && !list2.isEmpty() && (campaignEx = list2.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("context_status", Integer.valueOf(this.f35511c0));
            eVar.a("activity_name", this.f35512d0);
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            this.P = cVarB;
            cVarB.a("2000129", eVar);
        }
        if (this.P == null) {
            this.P = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35515g);
            eVar2.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f35520m ? 1 : 0));
            eVar2.a("adtp", Integer.valueOf(this.l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar2.a("lrid", this.O);
            eVar2.a("his_reason", "show campaign is null");
            eVar2.a("context_status", Integer.valueOf(this.f35511c0));
            eVar2.a("activity_name", this.f35512d0);
            this.P.a("2000129", eVar2);
        }
        if (list2 != null) {
            this.P.b(list2);
        }
        this.R = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.P);
    }
}
