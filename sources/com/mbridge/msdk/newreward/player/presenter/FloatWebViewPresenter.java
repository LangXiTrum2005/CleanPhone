package com.mbridge.msdk.newreward.player.presenter;

import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.vungle.VungleConstants;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.feedback.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.player.iview.IBaseWebView;
import com.mbridge.msdk.newreward.player.model.BaseWebContentModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.mbridge.msdk.widget.MBAdChoice;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FloatWebViewPresenter extends AbsPresenter implements b {
    final int EXPAND_VIEW_BUILD_TYPE;
    final int MINI_CARD_BUILD_TYPE;
    private final String TAG;
    boolean isLoadResourceError;
    boolean isShown;
    Handler mHandler;
    IBaseWebView mWebContentView;
    int muteState;
    public Runnable nativeCloseBtnVisibleRunnable;
    int webCloseViewStatus;
    BaseWebContentModel webContentModel;

    public FloatWebViewPresenter(IBaseWebView iBaseWebView, int i) {
        super(iBaseWebView);
        this.TAG = "MiniCardPresenter";
        this.webCloseViewStatus = -1;
        this.muteState = -1;
        this.isLoadResourceError = false;
        this.isShown = false;
        this.MINI_CARD_BUILD_TYPE = 3;
        this.EXPAND_VIEW_BUILD_TYPE = 4;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.nativeCloseBtnVisibleRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.FloatWebViewPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                FloatWebViewPresenter floatWebViewPresenter = FloatWebViewPresenter.this;
                if (floatWebViewPresenter.webCloseViewStatus != -1) {
                    return;
                }
                floatWebViewPresenter.mWebContentView.setNativeCloseButtonVisibility(0);
            }
        };
        this.mWebContentView = iBaseWebView;
        BaseWebContentModel baseWebContentModel = new BaseWebContentModel();
        this.webContentModel = baseWebContentModel;
        baseWebContentModel.setCommandManager(this.commandManager);
        this.webContentModel.setAdapterModel(this.adapterModel);
        this.webContentModel.setCallbackListener(this);
        this.TEMPLATE_MARK_TYPE = i != 273 ? 5 : 4;
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
    private void addAdChoice() {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 0) {
                return;
            }
            MBAdChoice mBAdChoice = new MBAdChoice(c.n().d());
            mBAdChoice.setCampaign(this.campaignEx);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t0.a(c.n().d(), 12.0f), t0.a(c.n().d(), 12.0f));
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = 30;
            layoutParams.rightMargin = 30;
            mBAdChoice.setLayoutParams(layoutParams);
            mBAdChoice.setFeedbackDialogEventListener(new a() { // from class: com.mbridge.msdk.newreward.player.presenter.FloatWebViewPresenter.2
                @Override // com.mbridge.msdk.foundation.feedback.a
                public void close() {
                }

                @Override // com.mbridge.msdk.foundation.feedback.a
                public void showed() {
                }

                @Override // com.mbridge.msdk.foundation.feedback.a
                public void summit(String str) {
                }
            });
            this.mWebContentView.addViewToCurrentViewGroup(mBAdChoice);
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
    }

    private void addWaterMark(String str) {
        try {
            BitmapDrawable bitmapDrawableA = c.n().a(str, 296);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(c.n().d());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                t0.a(imageView, bitmapDrawableA, this.mWebContentView.getWebView().getResources().getDisplayMetrics());
                this.mWebContentView.addViewToCurrentViewGroup(imageView);
            }
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
    }

    private void render(String str) {
        if (TextUtils.isEmpty(str) || this.mWebContentView.getWebView() == null) {
            return;
        }
        this.mWebContentView.getWebView().setHybridCommunicator(this.webContentModel);
        this.mWebContentView.getWebView().setWebViewEventListener(this.webContentModel);
        this.mWebContentView.getWebView().loadUrl(str);
    }

    public void changeNativeCloseButton() {
        int cbd = this.adapterModel.H().getCbd();
        if (cbd < 0) {
            cbd = this.adapterModel.O().c().i();
        }
        this.mHandler.postDelayed(this.nativeCloseBtnVisibleRunnable, ((long) cbd) * 1000);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        IBaseWebView iBaseWebView = this.mWebContentView;
        if (iBaseWebView != null) {
            iBaseWebView.removeTempleFromSuperView(null);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        this.mWebContentView.onDestroyWebContent(this.TEMPLATE_MARK_TYPE);
    }

    public int getCampaignOrientation() {
        try {
            if (this.adapterModel.H() != null) {
                return this.adapterModel.H().getRewardTemplateMode().b();
            }
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
        return 0;
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        initDataForView(null);
    }

    public String getWebViewShowExtraData() {
        if (this.reward == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", this.reward.c());
            jSONObject2.put(RewardPlus.AMOUNT, this.reward.a());
            jSONObject2.put("id", "");
            jSONObject.put(VungleConstants.KEY_USER_ID, "");
            jSONObject.put("reward", jSONObject2);
            jSONObject.put("playVideoMute", this.muteState);
            jSONObject.put("extra", this.adapterModel.j());
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        this.mWebContentView.initViews(false);
        addWaterMark(this.adapterModel.R());
        addAdChoice();
    }

    public void onActivityLifeCycleCallback(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                str2 = "onSystemDestory";
                break;
            case "onPause":
                str2 = "onSystemPause";
                break;
            case "onBackPressed":
                str2 = "onSystemBackPressed";
                break;
            case "onResume":
                str2 = "onSystemResume";
                break;
            default:
                str2 = "";
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            MBCommunicatorUtil.fireEvent(this.mWebContentView.getWebView(), str2, "");
        }
        if (str.equals("onBackPressed") && this.isShown) {
            click(null);
        }
    }

    public void onDetachedFromWindow() {
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onShown() {
        this.isShown = true;
    }

    public void onWebContentError() {
        if (this.isLoadResourceError) {
            return;
        }
        this.isLoadResourceError = true;
        this.mWebContentView.onDestroyWebContent(this.TEMPLATE_MARK_TYPE);
        this.mWebContentView.removeTempleFromSuperView(this.data.getRootViewGroup());
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }

    public void renderMRAID(String str) {
        CampaignEx campaignEx;
        try {
            if (TextUtils.isEmpty(str) && (campaignEx = this.campaignEx) != null && !TextUtils.isEmpty(campaignEx.getMraid())) {
                str = "file:////" + this.campaignEx.getMraid();
            }
            render(str);
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
    }

    public void renderPauseUrl() {
        try {
            if (this.adapterModel.H() != null) {
                String strI = this.adapterModel.I();
                String strH = "";
                if (!TextUtils.isEmpty(strI)) {
                    for (com.mbridge.msdk.newreward.function.core.campaign.a aVar : this.adapterModel.g().a().g()) {
                        if (aVar.i().equals(strI)) {
                            strH = aVar.e().h();
                            break;
                        }
                    }
                }
                render(strH);
            }
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqSuccessful(Object obj) {
        byte b;
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    String string = jSONObject.getString(com.umeng.ccg.a.w);
                    switch (string.hashCode()) {
                        case -1765453640:
                            if (!string.equals("toggleCloseBtn")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1488920312:
                            if (!string.equals("onReceivedError")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case -505277536:
                            if (!string.equals("onPageFinished")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 94750088:
                            if (!string.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case 94756344:
                            if (!string.equals("close")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 96046965:
                            if (!string.equals("readyStatus")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        this.mWebContentView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
                        return;
                    }
                    if (b == 1) {
                        if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1) == 1) {
                            this.mWebContentView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
                            return;
                        } else {
                            onWebContentError();
                            return;
                        }
                    }
                    if (b == 2) {
                        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1);
                        this.webCloseViewStatus = iOptInt;
                        this.mWebContentView.setNativeCloseButtonVisibility(iOptInt == 1 ? 0 : 4);
                    } else {
                        if (b == 3) {
                            this.mWebContentView.onCloseViewClick(3);
                            return;
                        }
                        if (b == 4) {
                            onWebContentError();
                            return;
                        }
                        if (b != 5) {
                            return;
                        }
                        com.mbridge.msdk.newreward.function.command.c cVar = this.commandManager;
                        cVar.e(cVar.a("campaign_redirect", this.redirectModel.setRedirectType(RedirectType.AD_TRACKING_CLICK_URL)), f.CAMPAIGN_REDIRECT);
                        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
                        if (rewardVideoListener != null) {
                            rewardVideoListener.onVideoAdClicked(this.mBridgeIds);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o0.b("MiniCardPresenter", th.getMessage());
        }
    }

    public void setNotchData(String str) {
        this.webContentModel.sendNotchData(this.mWebContentView.getWebView(), str);
    }
}
