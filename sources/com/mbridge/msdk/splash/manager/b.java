package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f35769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBSplashView f35770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f35771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f35772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f35774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f35775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f35776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected MBridgeIds f35778k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f35783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Context f35785s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f35787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f35788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f35789w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f35768a = "SplashShowManager";
    protected int l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f35779m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f35780n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f35781o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f35782p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f35786t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f35790x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f35791y = new HandlerC0178b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35792z = true;
    protected j A = new e();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f35773f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class HandlerC0178b extends Handler {
        public HandlerC0178b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                if (!b.this.f35784r) {
                    b.this.i();
                }
                b bVar = b.this;
                if (bVar.l <= 0) {
                    bVar.b(2);
                    return;
                }
                if (com.mbridge.msdk.foundation.feedback.b.f33675f) {
                    b.this.f();
                } else {
                    b bVar2 = b.this;
                    if (bVar2.f35783q) {
                        b.this.f();
                    } else {
                        int i11 = bVar2.l - 1;
                        bVar2.l = i11;
                        bVar2.d(i11);
                        b bVar3 = b.this;
                        if (!bVar3.f35786t) {
                            bVar3.g();
                        }
                    }
                }
                b.this.f35791y.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (i10 != 2 || b.this.f35769b == null || !b.this.f35769b.isActiveOm() || (mBSplashView = b.this.f35770c) == null || (splashWebview = mBSplashView.getSplashWebview()) == null) {
                return;
            }
            try {
                b.this.f35789w = splashWebview.getAdSession();
                if (b.this.f35789w != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(b.this.f35789w);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                }
                q0.a("OMSDK", "adSession.impressionOccurred()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                if (b.this.f35769b != null) {
                    String requestId = b.this.f35769b.getRequestId();
                    String requestIdNotice = b.this.f35769b.getRequestIdNotice();
                    String id2 = b.this.f35769b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, b.this.f35776i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f35770c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f35770c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f35770c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35798a;

        public f(int i10) {
            this.f35798a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f35798a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35801b;

        public g(Context context, CampaignEx campaignEx) {
            this.f35800a = context;
            this.f35801b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f35800a)).b(this.f35801b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f35770c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.l = i10;
            bVar.f35791y.removeMessages(1);
            b.this.f35791y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f35791y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f35771d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f35771d.a(bVar.f35778k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f35769b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f35791y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.l = i11;
                bVar.f35791y.removeMessages(1);
                b.this.f35791y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f35776i = str2;
        this.f35777j = str;
        this.f35778k = new MBridgeIds(str, str2);
        this.f35785s = context;
        if (this.f35774g == null) {
            TextView textView = new TextView(context);
            this.f35774g = textView;
            textView.setGravity(1);
            this.f35774g.setTextIsSelectable(false);
            this.f35774g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f35774g.getLayoutParams();
            this.f35774g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f35769b == null) {
                return;
            }
            this.f35784r = true;
            if (this.f35771d != null && (mBSplashView = this.f35770c) != null) {
                if (mBSplashView.getContext() != null && (this.f35770c.getContext() instanceof Activity) && ((Activity) this.f35770c.getContext()).isFinishing()) {
                    q0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f35770c.isShown()) {
                    this.f35771d.b(this.f35778k);
                } else {
                    this.f35771d.a(this.f35778k, "SplashView or container is not visibility");
                }
            }
            if (!this.f35769b.isReport()) {
                MBSplashView mBSplashView2 = this.f35770c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f35769b);
                } else {
                    b(this.f35769b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35769b, this.f35776i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j() {
        String str;
        if (this.f35773f) {
            str = this.f35780n + this.l + this.f35781o;
        } else {
            str = this.l + this.f35782p;
        }
        this.f35774g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f35770c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f35770c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f35769b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f35769b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f35792z) {
            this.f35792z = false;
            this.f35770c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f35769b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f35769b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f35770c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f35769b);
                this.f35789w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f35789w.registerAdView(splashWebview);
                    this.f35789w.start();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = this.f35769b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f35769b.getRequestIdNotice();
                    String id2 = this.f35769b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f35776i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f35776i);
        this.f35791y.removeMessages(1);
        this.f35791y.sendEmptyMessageDelayed(1, 1000L);
        this.f35791y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f35769b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35769b.getMaitve(), this.f35769b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35776i, this.f35769b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f35787u == null) {
                    this.f35787u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f35787u.getVisibility() != 0) {
                    this.f35787u.setVisibility(0);
                }
                v0.a(this.f35787u, bitmapDrawableA, this.f35770c.getResources().getDisplayMetrics());
                if (this.f35787u.getParent() == null) {
                    this.f35770c.addView(this.f35787u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f35789w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f35787u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f35786t = true;
        if (this.f35770c != null && this.l > 0 && (handler = this.f35791y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f35770c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f35770c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f35769b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f35791y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f33675f || (mBSplashView = this.f35770c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f35770c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f35771d != null) {
            this.f35771d = null;
        }
        if (this.f35788v != null) {
            this.f35788v = null;
        }
        if (this.f35790x != null) {
            this.f35790x = null;
        }
        MBSplashView mBSplashView = this.f35770c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35776i);
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", strI);
            this.f35780n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f35782p = string;
            this.f35779m = string;
            this.f35781o = contextD.getResources().getString(identifier3);
            this.f35774g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f35774g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strI)));
        }
    }

    public void c(int i10) {
        this.l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f35769b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f35769b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f35786t = false;
        if (this.f35770c != null && this.l > 0 && (handler = this.f35791y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f35770c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f35770c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f35769b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f35776i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f35771d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f35770c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f35770c.getSplashSignalCommunicationImpl() != null) {
                this.f35770c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f35771d;
        if (dVar != null) {
            dVar.a(this.f35778k, i10 * 1000);
        }
        if (this.f35775h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f35790x);
        }
        this.f35775h = viewGroup;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f35773f);
        this.f35769b = campaignEx;
        this.f35770c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        com.mbridge.msdk.splash.signal.b bVar = splashSignalCommunicationImpl;
        if (splashSignalCommunicationImpl == null) {
            com.mbridge.msdk.splash.signal.b bVar2 = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f35777j, this.f35776i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            bVar2.a(arrayList);
            bVar = bVar2;
        }
        bVar.b(this.l);
        bVar.a(this.f35773f ? 1 : 0);
        if (this.f35788v == null) {
            this.f35788v = new i(this, null);
        }
        bVar.a(this.f35788v);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f35775h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f35774g.setVisibility(8);
            }
            j();
            a(this.f35774g);
            mBSplashView.setCloseView(this.f35774g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f35775h);
            mBSplashView.setCloseView(this.f35775h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f35769b.getLocalRequestId(), this.f35769b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f35792z = true;
        k();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f35770c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f35770c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f35770c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f35770c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f35791y != null && (campaignEx = this.f35769b) != null && campaignEx.isActiveOm()) {
            this.f35791y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31753n);
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f35769b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f35770c) == null || mBSplashView.getSplashWebview() == null || this.f35770c.isDynamicView() || !this.f35769b.isMraid() || (context = this.f35770c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f35769b, context, true, new h());
            this.f35770c.addView(imageView);
        } catch (Throwable th2) {
            q0.b("SplashShowManager", th2.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f35769b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f35776i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f35776i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f35776i, this.f35769b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f35770c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f35776i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f35776i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f33674e, com.mbridge.msdk.foundation.feedback.b.f33673d);
                    }
                    layoutParams.topMargin = f2.c(10.0f);
                    layoutParams.leftMargin = f2.c(10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f35770c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f35776i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f35771d;
        if (dVar != null) {
            dVar.a(this.f35778k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f35770c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f35770c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f35770c.getParent()).removeView(this.f35770c);
    }

    public void a(boolean z10) {
        this.f35773f = z10;
        if (z10) {
            this.f35779m = this.f35780n;
        } else {
            this.f35779m = this.f35782p;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f35772e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35776i);
            this.f35772e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f35776i);
        this.f35772e.a(campaignEx);
        if (!this.f35769b.isReportClick()) {
            this.f35769b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f35771d;
        if (dVar != null) {
            dVar.a(this.f35778k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f35776i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f35790x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f35771d;
            if (dVar != null) {
                dVar.a(this.f35778k, i10);
                this.f35771d = null;
                com.mbridge.msdk.splash.report.a.a(this.f35776i, this.f35769b);
            }
            ImageView imageView = this.f35787u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f35770c) != null) {
                mBSplashView.removeView(this.f35787u);
                this.f35787u.setVisibility(8);
            }
            this.f35784r = false;
            com.mbridge.msdk.splash.report.a.a(this.f35776i, i10, this.f35769b);
            Handler handler = this.f35791y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31752m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
