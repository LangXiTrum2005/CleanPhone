package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.C0594u;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f37166s0 = "MBTempContainer";
    private int A;
    private int B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private String I;
    private String J;
    private List<CampaignEx> K;
    private int L;
    private com.mbridge.msdk.foundation.same.report.metrics.c M;
    protected boolean N;
    private LayoutInflater O;
    protected boolean P;
    protected k Q;
    protected WindVaneWebView R;
    protected MBridgeContainerView S;
    protected Handler T;
    private int U;
    private int V;
    protected Runnable W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected Runnable f37167a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private View f37168b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f37169c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f37170d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f37171e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f37172f0;
    private boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f37173h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f37174i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f37175j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f37176k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f37177l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f37178m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private AdSession f37179n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private MediaEvents f37180o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private AdEvents f37181p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Runnable f37182q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f37183r;
    private boolean r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CampaignEx f37184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f37185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f37186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f37187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f37188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f37189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f37190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f37191z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f37168b0.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                MBTempContainer.this.U = -3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                MBTempContainer.this.U = -4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements MBridgeVideoView.u {
        public d() {
        }

        @Override // com.mbridge.msdk.video.module.MBridgeVideoView.u
        public void a() {
            if (MBTempContainer.this.f37184s != null) {
                MBTempContainer.this.l();
                if (!MBTempContainer.this.f37184s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f38122p || MBTempContainer.this.f37184s.isCampaignIsFiltered()) {
                    MBTempContainer.this.f37186u.a(MBTempContainer.this.M);
                }
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f37184s, ((AbstractJSContainer) MBTempContainer.this).f38111d, MBTempContainer.this.f37189x);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements com.mbridge.msdk.video.dynview.listener.f {
        public e() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.f
        public void a() {
            MBTempContainer.this.w();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.f37168b0 != null) {
                MBTempContainer.this.f37168b0.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractJSContainer) MBTempContainer.this).f38110c != null) {
                ((AbstractJSContainer) MBTempContainer.this).f38110c.finish();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements com.mbridge.msdk.mbsignalcommon.mraid.d.b {
        public i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            MBridgeContainerView mBridgeContainerView;
            q0.b(MBTempContainer.f37166s0, "volume is : " + d10);
            try {
                if (!MBTempContainer.this.f37184s.isMraid() || (mBridgeContainerView = MBTempContainer.this.S) == null || mBridgeContainerView.getH5EndCardView() == null) {
                    return;
                }
                MBTempContainer.this.S.getH5EndCardView().volumeChange(d10);
            } catch (Exception e10) {
                q0.b(MBTempContainer.f37166s0, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f37168b0.setBackgroundColor(0);
            MBTempContainer.this.f37168b0.setVisibility(0);
            MBTempContainer.this.f37168b0.bringToFront();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface k {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f37202a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void a(boolean z10) {
                this.f37202a = z10;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void onError(String str) {
                q0.b("ActivityErrorListener", str);
                this.f37202a = true;
            }
        }

        void a(boolean z10);

        void onError(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class l extends AppletSchemeCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CampaignEx f37203a;

        public l(CampaignEx campaignEx) {
            this.f37203a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestFailed(int i10, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f37166s0, "request wx scheme failed: errorCode: " + i10 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f37203a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(MBTempContainer.f37166s0, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f37166s0, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f37166s0, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f37203a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(MBTempContainer.f37166s0, e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class m extends com.mbridge.msdk.video.module.listener.impl.a {
        public m(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        @Override // com.mbridge.msdk.video.module.listener.impl.a, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            if (com.mbridge.msdk.util.b.a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            if (i10 == 108) {
                if (com.mbridge.msdk.util.b.a()) {
                    MBTempContainer mBTempContainer = MBTempContainer.this;
                    mBTempContainer.setChinaCallBackStatus(mBTempContainer.R);
                }
                MBTempContainer.this.getJSCommon().a(new com.mbridge.msdk.video.signal.impl.a.b(MBTempContainer.this.getJSCommon(), new o(MBTempContainer.this, null)));
                MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i10 == 113) {
                MBTempContainer.this.f37186u.a(true, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
            } else if (i10 == 117) {
                MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                if (mBridgeVideoView != null) {
                    mBridgeVideoView.setVisible(4);
                }
                MBTempContainer.this.f37175j0 = true;
                MBTempContainer.this.f37186u.a(((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
            } else if (i10 == 126 || i10 == 128) {
                MBTempContainer.this.f37186u.a(false, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
            } else if (i10 != 131) {
                switch (i10) {
                    case InterfaceC0435l1.d.b.f29107d /* 103 */:
                    case InterfaceC0435l1.d.b.f29108e /* 104 */:
                        MBTempContainer.this.onAdClose();
                        break;
                    case InterfaceC0435l1.d.b.f29109f /* 105 */:
                        if (com.mbridge.msdk.util.b.a()) {
                            MBTempContainer.this.setChinaCTACallBack();
                        }
                        MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                    case 106:
                        if (!com.mbridge.msdk.util.b.a()) {
                            MBTempContainer.this.f37186u.a(true, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
                        } else {
                            MBTempContainer mBTempContainer2 = MBTempContainer.this;
                            mBTempContainer2.setChinaBrowserCallBack(mBTempContainer2.f37187v, MBTempContainer.this.f37190y, MBTempContainer.this.f37186u, MBTempContainer.this.f37184s);
                            if (((AbstractJSContainer) MBTempContainer.this).f38110c != null && MBTempContainer.this.f37184s != null) {
                                MBTempContainer.this.onAdClose();
                            }
                        }
                        break;
                }
            } else {
                MBTempContainer.this.f37186u.a(true, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
            }
            super.a(i10, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class n extends com.mbridge.msdk.video.module.listener.impl.f {
        private n() {
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            try {
                String string = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (((AbstractJSContainer) MBTempContainer.this).f38118k && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (iOptInt == 2) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.D;
                    } else if (iOptInt != 3) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.F;
                    } else {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.E;
                    }
                    MBTempContainer.this.B = iOptInt2;
                }
            } catch (Exception unused) {
                q0.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i10 == 120) {
                MBTempContainer.this.f37186u.a(((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
            }
            if (i10 == 131) {
                MBTempContainer.this.getJSCommon().click(4, obj != null ? obj.toString() : "");
                return;
            }
            if (i10 == 126) {
                MBTempContainer.this.f37186u.a(false, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
                return;
            }
            if (i10 == 127) {
                MBTempContainer.this.f37170d0 = true;
                MBTempContainer.this.f37186u.a(MBTempContainer.this.M);
                MBTempContainer.this.f37186u.a(((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i10) {
                case 100:
                    MBTempContainer.this.f37176k0 = true;
                    MBTempContainer mBTempContainer = MBTempContainer.this;
                    mBTempContainer.T.postDelayed(mBTempContainer.f37182q0, 250L);
                    MBTempContainer.this.f37186u.a(MBTempContainer.this.M);
                    break;
                case InterfaceC0435l1.d.b.f29105b /* 101 */:
                case InterfaceC0435l1.d.b.f29106c /* 102 */:
                    MBTempContainer.this.getJSCommon().f();
                    break;
                case InterfaceC0435l1.d.b.f29107d /* 103 */:
                    MBTempContainer.this.f37170d0 = true;
                    if (!MBTempContainer.this.f37184s.isMraid()) {
                        MBTempContainer.this.getJSCommon().f();
                    } else {
                        MBTempContainer.this.onAdClose();
                    }
                    break;
                case InterfaceC0435l1.d.b.f29108e /* 104 */:
                    MBTempContainer.this.onAdClose();
                    break;
                case InterfaceC0435l1.d.b.f29109f /* 105 */:
                    if (com.mbridge.msdk.util.b.a()) {
                        MBTempContainer.this.setChinaCTACallBack();
                    }
                    MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }

        public /* synthetic */ n(MBTempContainer mBTempContainer, b bVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class o extends com.mbridge.msdk.video.signal.impl.a.C0208a {
        private o() {
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(boolean z10) {
            if (MBTempContainer.this.f37180o0 != null) {
                try {
                    MBTempContainer.this.f37180o0.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
            super.a(z10);
            MBTempContainer.this.f37186u.a(z10, ((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.f37173h0 = true;
            MBTempContainer.this.m();
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String strOptString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals("1.0") && ((AbstractJSContainer) MBTempContainer.this).f38110c != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f38122p) {
                            MBTempContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f38110c.finish();
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            if (MBTempContainer.this.r0) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void onInitSuccess() {
            super.onInitSuccess();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.this.m();
            MBTempContainer.this.f37173h0 = true;
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.this.y();
            if (MBTempContainer.this.r0) {
                MBTempContainer.this.onPause();
            }
        }

        public /* synthetic */ o(MBTempContainer mBTempContainer, b bVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(int i10, String str) {
            super.a(i10, str);
            MBTempContainer.this.defaultLoad(i10, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0208a, com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a() {
            super.a();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.T;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.W);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class p extends com.mbridge.msdk.video.module.listener.impl.f {
        private p() {
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            String string;
            super.a(i10, obj);
            if (((AbstractJSContainer) MBTempContainer.this).f38118k) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            MBTempContainer.this.A = jSONObject.getInt("Alert_window_status");
                            MBTempContainer.this.B = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e10) {
                    q0.b("NotifyListener", e10.getMessage());
                }
            }
            if (i10 != 2) {
                if (i10 == 121) {
                    MBTempContainer.this.f37170d0 = true;
                    MBTempContainer.this.f37186u.b(((AbstractJSContainer) MBTempContainer.this).f38112e, ((AbstractJSContainer) MBTempContainer.this).f38111d);
                    MBTempContainer.this.f37174i0 = false;
                    return;
                }
                if (i10 == 16) {
                    if (com.mbridge.msdk.util.b.a()) {
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.getJSCommon().f();
                        return;
                    }
                }
                if (i10 == 17) {
                    MBTempContainer.this.f37170d0 = true;
                    MBridgeContainerView mBridgeContainerView = MBTempContainer.this.S;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i10) {
                    case 10:
                        MBTempContainer.this.f37174i0 = true;
                        if (MBTempContainer.this.f37184s != null && !s0.a().a("i_l_s_t_r_i", false)) {
                            MBTempContainer.this.l();
                            if (!MBTempContainer.this.f37184s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f38122p || MBTempContainer.this.f37184s.isCampaignIsFiltered()) {
                                MBTempContainer.this.f37186u.a(MBTempContainer.this.M);
                            }
                            com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f37184s, ((AbstractJSContainer) MBTempContainer.this).f38111d, MBTempContainer.this.f37189x);
                            break;
                        }
                        break;
                }
            }
            if (i10 == 12) {
                try {
                    string = obj instanceof String ? obj.toString() : "Play error but has no message.";
                } catch (Throwable th2) {
                    q0.b("NotifyListener", th2.getMessage());
                }
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f37184s, ((AbstractJSContainer) MBTempContainer.this).f38111d, string, MBTempContainer.this.f37189x);
                if (!MBTempContainer.this.f37174i0) {
                    if (((AbstractJSContainer) MBTempContainer.this).f38113f.C() == 0) {
                        MBTempContainer.this.f37186u.a(MBTempContainer.this.M, "play error");
                        MBTempContainer.this.f37174i0 = false;
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.l();
                        if (MBTempContainer.this.f37184s == null || !MBTempContainer.this.f37184s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f38122p || MBTempContainer.this.f37184s.isCampaignIsFiltered()) {
                            MBTempContainer.this.f37186u.a(MBTempContainer.this.M);
                        }
                    }
                }
            }
            MBTempContainer.this.getJSVideoModule().videoOperate(i10 == 2 ? 6 : 3);
            MBTempContainer.this.f37174i0 = false;
            if (MBTempContainer.this.f37180o0 == null || i10 != 2) {
                return;
            }
            q0.b("omsdk", "mbtc skip");
            try {
                MBTempContainer.this.f37180o0.skipped();
                MBTempContainer.this.f37180o0 = null;
            } catch (Exception e11) {
                q0.a("omsdk", e11.getMessage());
            }
        }

        public /* synthetic */ p(MBTempContainer mBTempContainer, b bVar) {
            this();
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f37189x = 1;
        this.f37190y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f37167a0 = new c();
        this.f37169c0 = false;
        this.f37170d0 = false;
        this.f37171e0 = false;
        this.g0 = false;
        this.f37173h0 = false;
        this.f37174i0 = false;
        this.f37175j0 = false;
        this.f37176k0 = false;
        this.f37177l0 = false;
        this.f37179n0 = null;
        this.f37180o0 = null;
        this.f37181p0 = null;
        this.f37182q0 = new f();
        this.r0 = false;
        init(context);
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                return (int) aVarC.i();
            }
            return 5;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 5;
        }
    }

    private int getCloseBtnTime() {
        CampaignEx campaignEx = this.f37184s;
        if (campaignEx == null) {
            return 1;
        }
        boolean zC = v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iE = v0.e(this.f37184s.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (!zC || iE < 0) {
            return this.f37184s.getCbd() > -2 ? this.f37184s.getCbd() : this.f38113f.i();
        }
        return iE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdClose() {
        int i10;
        try {
            com.mbridge.msdk.video.bt.module.listener.b bVar = this.f37187v;
            if (bVar == null) {
                Activity activity = this.f38110c;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f38118k && ((i10 = this.f38119m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                boolean z10 = true;
                if (this.B != 1) {
                    z10 = false;
                }
                bVar.a(z10, this.A);
            }
            this.f37187v.a(this.f37190y, this.f37170d0, this.f38115h);
        } catch (Exception unused) {
            Activity activity2 = this.f38110c;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.S;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void defaultLoad(int i10, String str) {
        int i11;
        superDefaultLoad(i10, str);
        CampaignEx campaignEx = this.f37184s;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f37184s.setTemplateRenderSucc(false);
        }
        if (!isLoadSuccess()) {
            b(i10, str);
            Activity activity = this.f38110c;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        b bVar = null;
        if (this.f37184s.getPlayable_ads_without_video() == 2) {
            this.S.setCampaign(this.f37184s);
            this.S.addOrderViewData(this.K);
            this.S.setUnitID(this.f38111d);
            this.S.setCloseDelayTime(getCloseBtnTime());
            this.S.setPlayCloseBtnTm(this.f38113f.u());
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f37184s, this.f37185t, this.f38115h, getInnerPlacementId(), this.f38111d, new n(this, bVar), this.f38113f.A(), this.f38122p));
            this.S.preLoadData(this.f37191z);
            this.f37191z.getJSCommon().g(this.f38117j);
            this.S.showPlayableView();
        } else {
            b(i10, str);
            this.f37168b0.setVisibility(8);
            loadModuleDatas();
            int iE = this.f38113f.E();
            int h5CloseType = getH5CloseType();
            int i12 = h5CloseType != 0 ? h5CloseType : iE;
            CampaignEx campaignEx2 = this.f37184s;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                this.mbridgeVideoView.setContainerViewOnNotifyListener(new m(this.f38110c, this.f37184s));
            }
            CampaignEx campaignEx3 = this.f37184s;
            int iF = (campaignEx3 == null || campaignEx3.getVst() <= -2) ? this.f38113f.F() : this.f37184s.getVst();
            CampaignEx campaignEx4 = this.f37184s;
            if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i11 = this.f37189x) > 1) {
                iF = a(iF, i11);
                this.f37184s.setVst(iF);
            }
            int i13 = iF;
            this.mbridgeVideoView.setVideoSkipTime(i13);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            mBridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.m(mBridgeVideoView, this.S, this.f37184s, this.f38115h, this.f37185t, getInnerPlacementId(), this.f38111d, i12, i13, new p(this, bVar), this.f38113f.A(), this.f38122p, this.f38113f.C()));
            this.mbridgeVideoView.setAdSession(this.f37179n0);
            this.mbridgeVideoView.setVideoEvents(this.f37180o0);
            this.mbridgeVideoView.defaultShow();
            MBridgeContainerView mBridgeContainerView = this.S;
            mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.b(this.mbridgeVideoView, mBridgeContainerView, this.f37184s, this.f38115h, this.f37185t, getInnerPlacementId(), this.f38111d, new m(this.f38110c, this.f37184s), this.f38113f.A(), this.f38122p));
            this.S.defaultShow();
        }
        q();
    }

    public int findID(String str) {
        return i0.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f38122p) {
                com.mbridge.msdk.videocommon.a.C0209a c0209aA = this.f38118k ? com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37184s) : com.mbridge.msdk.videocommon.a.a(94, this.f37184s);
                if (c0209aA == null || !c0209aA.c()) {
                    return null;
                }
                if (this.f38118k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37184s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f37184s);
                }
                WindVaneWebView windVaneWebViewB = c0209aA.b();
                if (this.g0) {
                    windVaneWebViewB.setWebViewTransparent();
                }
                return windVaneWebViewB;
            }
            CampaignEx campaignEx = this.f37184s;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
                return null;
            }
            com.mbridge.msdk.videocommon.a.C0209a c0209aB = com.mbridge.msdk.videocommon.a.b(this.f38111d + "_" + this.f37184s.getId() + "_" + this.f37184s.getRequestId() + "_" + this.f37184s.getRewardTemplateMode().j());
            if (c0209aB != null) {
                return c0209aB.b();
            }
            return null;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }

    public AdEvents getAdEvents() {
        return this.f37181p0;
    }

    public AdSession getAdSession() {
        return this.f37179n0;
    }

    public CampaignEx getCampaign() {
        return this.f37184s;
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public int getH5CloseType() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f37184s);
        if (kVarB != null) {
            return kVarB.l();
        }
        return 0;
    }

    public int getH5DialogRole() {
        if (getJSCommon() != null) {
            return getJSCommon().d();
        }
        return 1;
    }

    public int getH5MuteState() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f37184s);
        if (kVarB != null) {
            return kVarB.m();
        }
        return 0;
    }

    public String getInstanceId() {
        return this.f37190y;
    }

    public boolean getIsShowingTransparent() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f37184s);
        if (kVarB != null) {
            return kVarB.p();
        }
        return false;
    }

    public int getLayoutID() {
        return findLayout(this.g0 ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public MediaEvents getVideoEvents() {
        return this.f37180o0;
    }

    public void init(Context context) {
        this.O = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f37168b0 = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isHasDestoryed() {
        return this.C;
    }

    public boolean isLoadSuccess() {
        return this.P;
    }

    public void loadModuleDatas() {
        int i10;
        int i11;
        int h5MuteState = getH5MuteState();
        if (h5MuteState != 0) {
            this.f38117j = h5MuteState;
        }
        int iE = this.f38113f.E();
        int h5CloseType = getH5CloseType();
        int i12 = h5CloseType != 0 ? h5CloseType : iE;
        this.mbridgeVideoView.setSoundState(this.f38117j);
        this.mbridgeVideoView.setCampaign(this.f37184s);
        this.mbridgeVideoView.setPlayURL(this.f37185t.l());
        CampaignEx campaignEx = this.f37184s;
        int iF = (campaignEx == null || campaignEx.getVst() <= -2) ? this.f38113f.F() : this.f37184s.getVst();
        CampaignEx campaignEx2 = this.f37184s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i11 = this.f37189x) > 1) {
            iF = a(iF, i11);
            this.f37184s.setVst(iF);
        }
        int i13 = iF;
        this.mbridgeVideoView.setVideoSkipTime(i13);
        this.mbridgeVideoView.setCloseAlert(this.f38113f.h());
        this.mbridgeVideoView.setBufferTimeout(getBufferTimeout());
        b bVar = null;
        this.mbridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.n(this.f37191z, this.f37184s, this.f38115h, this.f37185t, getInnerPlacementId(), this.f38111d, i12, i13, new p(this, bVar), this.f38113f.A(), this.f38122p, this.f38113f.C()));
        this.mbridgeVideoView.setShowingTransparent(this.g0);
        this.mbridgeVideoView.setAdSession(this.f37179n0);
        if (this.f38118k && ((i10 = this.f38119m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
            this.mbridgeVideoView.setIVRewardEnable(i10, this.f38120n, this.f38121o);
            this.mbridgeVideoView.setDialogRole(getH5DialogRole());
        }
        this.S.setCampaign(this.f37184s);
        this.S.addOrderViewData(this.K);
        this.S.setUnitID(this.f38111d);
        this.S.setCloseDelayTime(getCloseBtnTime());
        this.S.setPlayCloseBtnTm(this.f38113f.u());
        this.S.setVideoInteractiveType(this.f38113f.D());
        this.S.setEndscreenType(this.f38113f.m());
        this.S.setVideoSkipTime(i13);
        this.S.setShowingTransparent(this.g0);
        this.S.setJSFactory(this.f37191z);
        this.f37191z.getJSCommon().g(this.f38117j);
        if (this.f37184s.getPlayable_ads_without_video() == 2) {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f37184s, this.f37185t, this.f38115h, getInnerPlacementId(), this.f38111d, new n(this, bVar), this.f38113f.A(), this.f38122p));
            this.S.preLoadData(this.f37191z);
            this.S.showPlayableView();
        } else {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.c(this.f37191z, this.f37184s, this.f38115h, this.f37185t, getInnerPlacementId(), this.f38111d, new m(this.f38110c, this.f37184s), this.f38113f.A(), this.f38122p));
            this.S.preLoadData(this.f37191z);
            this.mbridgeVideoView.preLoadData(this.f37191z);
        }
        if (this.g0) {
            this.S.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.g0 && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f37184s;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f37184s.getRewardTemplateMode().k() == 5002010) || this.f37174i0) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (!mBridgeVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            MBridgeContainerView mBridgeContainerView3 = this.S;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.f37176k0 && (mBridgeContainerView2 = this.S) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f37175j0 && (mBridgeContainerView = this.S) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().e();
                return;
            }
            return;
        }
        if (!canBackPress()) {
            q0.a(f37166s0, "onBackPressed can't excute");
            return;
        }
        Activity activity = this.f38110c;
        if (activity == null || this.f38122p || this.f37177l0) {
            return;
        }
        this.f37177l0 = true;
        activity.onBackPressed();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        k();
        try {
            A();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        this.f37177l0 = false;
        try {
            if (this.f38122p) {
                CampaignEx campaignEx = this.f37184s;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    this.f37186u = new com.mbridge.msdk.video.bt.module.orglistener.c(this.f37187v, this.f37190y);
                } else {
                    this.f37186u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f38118k, this.f38113f, this.f37184s, this.f37186u, getInnerPlacementId(), this.f38111d);
                }
            } else {
                this.f37186u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f38118k, this.f38113f, this.f37184s, this.f37186u, getInnerPlacementId(), this.f38111d);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.orglistener.e(this.M, this.f37186u));
            a(this.f38113f, this.f37184s);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (!i0.a(layoutID)) {
                b("layoutID not found");
                return;
            }
            View viewInflate = this.O.inflate(layoutID, (ViewGroup) null);
            this.f37183r = viewInflate;
            addView(viewInflate, getContentLayoutParams());
            x();
            if (n()) {
                this.P = true;
                p();
                return;
            }
            this.Q.onError("not found View IDS");
            Activity activity = this.f38110c;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.C) {
            return;
        }
        this.C = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.util.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.R;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.R.clearWebView();
                this.R.release();
            }
            if (this.f37187v != null) {
                this.f37187v = null;
            }
            this.T.removeCallbacks(this.W);
            this.T.removeCallbacks(this.f37167a0);
            getJSCommon().release();
            if (this.f38118k) {
                com.mbridge.msdk.setting.i.b().k(this.f38111d);
            }
            if (!this.f37169c0) {
                r();
            }
            if (!this.f37172f0) {
                s();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.f37178m0;
            if (dVar != null) {
                dVar.d();
            }
            if (this.f37179n0 != null) {
                q0.b("omsdk", "tc onDestroy");
                this.f37179n0.removeAllFriendlyObstructions();
                this.f37179n0.finish();
                this.f37179n0 = null;
            }
            if (!this.f38122p) {
                if (isLoadSuccess()) {
                    this.T.postDelayed(new g(), 100L);
                } else {
                    Activity activity = this.f38110c;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.f37172f0) {
                s();
            }
            com.mbridge.msdk.video.bt.component.d.c().a(this.f37190y);
        } catch (Throwable th2) {
            q0.a(f37166s0, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f37171e0 = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th2) {
            q0.b(f37166s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        t();
        try {
            if (this.mbridgeVideoView != null && !o() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.feedback.b.f33675f) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.f37171e0 && !o() && !com.mbridge.msdk.foundation.feedback.b.f33675f) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f38110c;
            if (activity2 != null) {
                v0.a(activity2.getWindow().getDecorView());
            }
            if (this.g0 && this.f37173h0 && (activity = this.f38110c) != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            q0.b(f37166s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void receiveSuccess() {
        q0.a(f37166s0, "receiveSuccess ,start hybrid");
        this.T.removeCallbacks(this.f37167a0);
        this.T.postDelayed(this.f37182q0, 250L);
    }

    public void registerErrorListener(k kVar) {
        this.Q = kVar;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f37181p0 = adEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f37191z;
        if (bVar == null || bVar.getJSCommon() == null) {
            return;
        }
        this.f37191z.getJSCommon().setAdEvents(adEvents);
    }

    public void setAdSession(AdSession adSession) {
        this.f37179n0 = adSession;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f37191z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f37191z.getJSCommon().setAdSession(adSession);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(adSession);
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, int i10) {
        this.f37188w = aVar;
        this.f37189x = i10;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i10) {
        if (list != null) {
            this.K = list;
        }
        this.L = i10;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f37184s = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
            this.M = cVarB;
            if (cVarB == null) {
                this.M = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.M.i(campaignEx.getCurrentLocalRid());
            this.M.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f38111d)) {
                campaignEx.setCampaignUnitId(this.f38111d);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.r0 = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f37185t = aVar;
    }

    public void setCampaignExpired(boolean z10) {
        try {
            CampaignEx campaignEx = this.f37184s;
            if (campaignEx != null) {
                if (!z10) {
                    campaignEx.setSpareOfferFlag(0);
                    this.f37184s.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (!com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.f38113f;
                    if (cVar != null) {
                        if (cVar.A() == 1) {
                            this.f37184s.setCbt(1);
                            return;
                        } else {
                            this.f37184s.setCbt(0);
                            return;
                        }
                    }
                    return;
                }
                if (this.l) {
                    this.f37184s.setCbt(0);
                    return;
                }
                com.mbridge.msdk.videocommon.setting.c cVar2 = this.f38113f;
                if (cVar2 != null) {
                    if (cVar2.A() == 1) {
                        this.f37184s.setCbt(1);
                    } else {
                        this.f37184s.setCbt(0);
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f37166s0, e10.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.J = str;
    }

    public void setInstanceId(String str) {
        this.f37190y = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f37191z = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.listener.b bVar) {
        this.f37187v = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        this.D = i10;
        this.E = i11;
        this.F = i12;
        this.G = i13;
        this.H = i14;
        String strA = d0.a(i10, i11, i12, i13, i14);
        this.I = strA;
        q0.b(f37166s0, strA);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.I)) {
            getJSCommon().a(this.I);
            if (this.R != null && !TextUtils.isEmpty(this.I)) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeContainerView mBridgeContainerView = this.S;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i10, i11, i12, i13, i14);
        }
    }

    public void setShowRewardListener(com.mbridge.msdk.video.bt.module.orglistener.h hVar) {
        this.f37186u = hVar;
    }

    public void setShowingTransparent() {
        Activity activity;
        boolean isShowingTransparent = getIsShowingTransparent();
        this.g0 = isShowingTransparent;
        if (isShowingTransparent) {
            return;
        }
        int iA = i0.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE);
        if (!i0.a(iA) || (activity = this.f38110c) == null) {
            return;
        }
        activity.setTheme(iA);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f37180o0 = mediaEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f37191z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f37191z.getJSCommon().setVideoEvents(mediaEvents);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(mediaEvents);
        }
    }

    public void setWebViewFront(int i10) {
        this.V = i10;
    }

    public void superDefaultLoad(int i10, String str) {
        this.T.removeCallbacks(this.W);
        this.T.removeCallbacks(this.f37167a0);
        this.Q.a(true);
        WindVaneWebView windVaneWebView = this.R;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    private void A() {
        AppletsModel appletsModel;
        if (this.f37184s == null) {
            return;
        }
        try {
            appletsModel = AppletModelManager.getInstance().get(this.f37184s);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            appletsModel = null;
        }
        if (appletsModel != null) {
            try {
                if (appletsModel.can(0)) {
                    appletsModel.setUserClick(false);
                    appletsModel.requestWxAppletsScheme(0, new l(this.f37184s));
                }
            } catch (Exception e11) {
                appletsModel.clearRequestState();
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
        }
    }

    private void k() {
        if (this.f38113f == null) {
            this.f38113f = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38111d, this.f38118k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView == null || mBridgeVideoView.notifyListener == null) {
                eVar.a("notify_listener", 0);
            } else {
                eVar.a("notify_listener", 1);
                com.mbridge.msdk.video.module.listener.a aVar = this.mbridgeVideoView.notifyListener;
                if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.n) {
                    eVar.a("listener_type", 1);
                } else if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.m) {
                    eVar.a("listener_type", 2);
                } else {
                    eVar.a("listener_type", 3);
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000130", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (isLoadSuccess()) {
            this.f38110c.runOnUiThread(new a());
        }
    }

    private void q() {
        AdSession adSession = this.f37179n0;
        if (adSession != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.S;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession.addFriendlyObstruction(mBridgeContainerView, friendlyObstructionPurpose, null);
                View view = this.f37168b0;
                if (view != null) {
                    this.f37179n0.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
                WindVaneWebView windVaneWebView = this.R;
                if (windVaneWebView != null) {
                    this.f37179n0.addFriendlyObstruction(windVaneWebView, friendlyObstructionPurpose, null);
                }
                this.mbridgeVideoView.setVideoEvents(this.f37180o0);
                this.f37179n0.start();
                if (this.f37181p0 != null) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    q0.a("omsdk", "bt:   adEvents.loaded");
                    this.f37181p0.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    this.f37181p0.impressionOccurred();
                }
            } catch (Exception e10) {
                q0.a("omsdk", e10.getMessage());
            }
        }
    }

    private void r() {
        CampaignEx campaignEx;
        int i10;
        boolean z10 = true;
        try {
            this.f37169c0 = true;
            CampaignEx campaignEx2 = this.f37184s;
            if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                this.f37170d0 = true;
            }
            MediaEvents mediaEvents = this.f37180o0;
            if (mediaEvents != null && !this.f37170d0) {
                try {
                    mediaEvents.skipped();
                    this.f37180o0 = null;
                } catch (Exception e10) {
                    q0.a("omsdk", e10.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f37186u;
            if (hVar != null) {
                if (this.f38118k && ((i10 = this.f38119m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                    if (this.B != 1) {
                        z10 = false;
                    }
                    hVar.a(z10, this.A);
                }
                if (!this.f37170d0) {
                    this.f38115h.a(0);
                }
                this.M.a(this.f37184s);
                this.f37186u.a(this.M, this.f37170d0, this.f38115h);
            }
            this.T.removeCallbacks(this.f37182q0);
            if ((!this.f38118k && !this.f38122p) || ((campaignEx = this.f37184s) != null && campaignEx.isDynamicView())) {
                u();
            }
            if (!this.f38122p) {
                if (this.f38118k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37184s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f37184s);
                }
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.release();
            }
        } catch (Throwable th2) {
            q0.b(f37166s0, th2.getMessage(), th2);
        }
    }

    private void s() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getContext());
        CampaignEx campaignEx = this.f37184s;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f37184s.getRequestIdNotice(), this.f37184s.getId(), this.f38111d, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f37184s.getId()), this.f37184s.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f37184s.getId());
            this.f37172f0 = true;
        }
    }

    private void t() {
        Runnable runnable;
        int i10 = this.U;
        if (i10 == -3) {
            runnable = this.W;
        } else {
            runnable = i10 == -4 ? this.f37167a0 : null;
        }
        if (runnable != null) {
            runnable.run();
            this.U = 0;
        }
    }

    private void u() {
        if (this.f37170d0) {
            if (com.mbridge.msdk.util.b.a() && checkChinaSendToServerDiff(this.f37186u)) {
                return;
            }
            q0.a(f37166s0, "sendToServerRewardInfo");
            com.mbridge.msdk.video.module.report.b.a(this.f37184s, this.f38115h, this.f38111d, this.f38114g, this.J);
        }
    }

    private void v() {
        getJSCommon().setAdEvents(this.f37181p0);
        getJSCommon().setAdSession(this.f37179n0);
        getJSCommon().setVideoEvents(this.f37180o0);
        getJSCommon().g(this.f38117j);
        getJSCommon().setUnitId(this.f38111d);
        getJSCommon().setRewardUnitSetting(this.f38113f);
        getJSCommon().a(new o(this, null));
        CampaignEx campaignEx = this.f37184s;
        if (campaignEx != null) {
            if (campaignEx.isMraid() || this.f37184s.isActiveOm()) {
                com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                this.f37178m0 = dVar;
                dVar.c();
                this.f37178m0.a();
                this.f37178m0.a(new i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("temp_container", getWidth() + "x" + getHeight());
            if (this.R != null) {
                eVar.a("web_view", this.R.getWidth() + "x" + this.R.getHeight());
            }
            if (this.mbridgeVideoView != null) {
                eVar.a("mbridge_video_view", this.mbridgeVideoView.getWidth() + "x" + this.mbridgeVideoView.getHeight());
                if (this.mbridgeVideoView.mPlayerView != null) {
                    eVar.a("player_view", this.mbridgeVideoView.mPlayerView.getWidth() + "x" + this.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000136", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoadSuccess()) {
            this.f38110c.runOnUiThread(new j());
        }
    }

    public boolean n() {
        this.R = findWindVaneWebView();
        MBridgeVideoView mBridgeVideoViewFindMBridgeVideoView = findMBridgeVideoView();
        this.mbridgeVideoView = mBridgeVideoViewFindMBridgeVideoView;
        mBridgeVideoViewFindMBridgeVideoView.setVideoLayout(this.f37184s);
        this.mbridgeVideoView.setIsIV(this.f38118k);
        this.mbridgeVideoView.setUnitId(this.f38111d);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f37188w, this.K, this.f37189x, this.L);
        if (this.f38122p) {
            this.mbridgeVideoView.setNotchPadding(this.E, this.F, this.G, this.H);
        }
        MBridgeContainerView mBridgeContainerViewFindMBridgeContainerView = findMBridgeContainerView();
        this.S = mBridgeContainerViewFindMBridgeContainerView;
        if (this.f38122p) {
            mBridgeContainerViewFindMBridgeContainerView.setNotchPadding(this.D, this.E, this.F, this.G, this.H);
        }
        if (s0.a().a("i_l_s_t_r_i", false)) {
            this.mbridgeVideoView.setPlayerViewAttachListener(new d());
        }
        this.mbridgeVideoView.setIPlayVideoViewLayoutCallBack(new e());
        return (this.mbridgeVideoView == null || this.S == null || !initViews()) ? false : true;
    }

    public boolean o() {
        if (this.mbridgeVideoView == null) {
            return false;
        }
        if (com.mbridge.msdk.util.b.a()) {
            return this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
    }

    public void p() {
        ViewGroup viewGroup;
        List<CampaignEx> list;
        WindVaneWebView windVaneWebView = this.R;
        CampaignEx campaignEx = this.f37184s;
        if (campaignEx != null) {
            b1.a(windVaneWebView, campaignEx.getLocalRequestId(), this.f37184s.getLocalAllowTrackClick());
        }
        this.f37191z = new com.mbridge.msdk.video.signal.factory.b(this.f38110c, windVaneWebView, this.mbridgeVideoView, this.S, this.f37184s, new o(this, null));
        CampaignEx campaignEx2 = this.f37184s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.K) != null) {
            this.f37191z.a(list);
        }
        registerJsFactory(this.f37191z);
        com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.f38111d, "_1", new StringBuilder()), new h());
        q();
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f37183r.findViewById(i0.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.f37191z);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.mbridge.msdk.video.signal.impl.k) {
            v();
            getJSContainerModule().readyStatus(((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).v());
            z();
            ((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).f38150m.onInitSuccess();
            if (this.f38122p) {
                getJSCommon().setWebViewFront(this.V);
            }
        }
        if (getJSCommon().b() == 1 && (viewGroup = (ViewGroup) this.f37183r.findViewById(i0.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f37183r).removeView(viewGroup);
            ((ViewGroup) this.f37183r).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void x() {
        if (this.N) {
            setMatchParent();
        }
    }

    public void z() {
        int iG;
        int iF;
        try {
            if (this.R != null) {
                int i10 = getResources().getConfiguration().orientation;
                if (getIsShowingTransparent()) {
                    iG = v0.i(getContext());
                    iF = v0.h(getContext());
                    if (com.mbridge.msdk.foundation.tools.f.a(getContext())) {
                        int iC = v0.c(getContext());
                        if (i10 == 2) {
                            iG += iC;
                        } else {
                            iF += iC;
                        }
                    }
                } else {
                    iG = v0.g(getContext());
                    iF = v0.f(getContext());
                }
                int iG2 = this.f37184s.getRewardTemplateMode().g();
                if (a(this.f37184s) == 1) {
                    iG2 = i10;
                }
                getJSNotifyProxy().a(i10, iG2, iG, iF);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.mbridge.msdk.foundation.same.a.l, v0.d(getContext()));
                try {
                    if (this.f38115h != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f38115h.c());
                        jSONObject2.put("amount", this.f38115h.a());
                        jSONObject2.put("id", this.f38116i);
                        jSONObject.put("userId", this.f38114g);
                        jSONObject.put(C0594u.f30746j, jSONObject2);
                        jSONObject.put("playVideoMute", this.f38117j);
                        jSONObject.put("extra", this.J);
                    }
                } catch (JSONException e10) {
                    q0.a(f37166s0, e10.getMessage());
                } catch (Exception e11) {
                    q0.a(f37166s0, e11.getMessage());
                }
                String string = jSONObject.toString();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f37184s, eVar);
                getJSNotifyProxy().a(string);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
                getJSCommon().b(true);
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCallBackStatus(this.R);
                }
                loadModuleDatas();
                this.T.postDelayed(this.W, 2000L);
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void b(String str) {
        com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f37186u;
        if (hVar != null) {
            hVar.a(this.M, str);
        }
        super.b(str);
    }

    private int a(int i10, int i11) {
        List<CampaignEx> list;
        if (i10 < 0 || (list = this.K) == null || list.size() == 0 || i11 <= 1) {
            return i10;
        }
        int videoLength = 0;
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            if (this.K.get(i12) != null) {
                videoLength += this.K.get(i12).getVideoLength();
            }
        }
        if (i10 > videoLength) {
            return i10 - videoLength;
        }
        return 0;
    }

    private void b(int i10, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.j("2000037");
            nVar.h("code=" + i10 + ",desc=" + str);
            CampaignEx campaignEx = this.f37184s;
            nVar.t((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f37184s.getRewardTemplateMode().j());
            nVar.u(this.f38111d);
            CampaignEx campaignEx2 = this.f37184s;
            nVar.b(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f37184s;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.n(this.f37184s.getRequestId());
            }
            CampaignEx campaignEx4 = this.f37184s;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.o(this.f37184s.getRequestIdNotice());
            }
            int iS = m0.s(getContext());
            nVar.c(iS);
            nVar.l(m0.a(getContext(), iS));
            com.mbridge.msdk.foundation.same.report.o.i(nVar);
        } catch (Throwable th2) {
            q0.b(f37166s0, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f37166s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f37166s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f37166s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37189x = 1;
        this.f37190y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f37167a0 = new c();
        this.f37169c0 = false;
        this.f37170d0 = false;
        this.f37171e0 = false;
        this.g0 = false;
        this.f37173h0 = false;
        this.f37174i0 = false;
        this.f37175j0 = false;
        this.f37176k0 = false;
        this.f37177l0 = false;
        this.f37179n0 = null;
        this.f37180o0 = null;
        this.f37181p0 = null;
        this.f37182q0 = new f();
        this.r0 = false;
        init(context);
    }
}
