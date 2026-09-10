package com.mbridge.msdk.newreward.player.view.ectemplate;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.iview.IBaseWebView;
import com.mbridge.msdk.newreward.player.presenter.ECWebPresenter;
import com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewEC extends FrameLayout implements IBaseWebView, View.OnClickListener {
    private final String TAG;
    private boolean hasWebViewShow;
    private boolean isWebViewAttached;
    private ImageView mCloseImageView;
    private FloatWebTemplateView mExpandView;
    private ImageView mLinkImageView;
    private ECWebPresenter mWebECPresenter;
    private MBWebView mWebView;
    private final Runnable webViewShowRunnable;

    public WebViewEC(@NonNull Context context) {
        super(context);
        this.TAG = "WebViewEC";
        this.isWebViewAttached = false;
        this.hasWebViewShow = false;
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.3
            @Override // java.lang.Runnable
            public void run() {
                WebViewEC.this.webViewShow();
                WebViewEC.this.setNotch();
            }
        };
        initPresenter();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void addViewToCurrentViewGroup(View view) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView, com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public ImageView getPrivacyButton() {
        return this.mLinkImageView;
    }

    public int getRenderStatus() {
        return this.mWebECPresenter.getRenderStatus();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public MBWebView getWebView() {
        return this.mWebView;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void hideCTAView() {
    }

    public void initPresenter() {
        ECWebPresenter eCWebPresenter = new ECWebPresenter(this);
        this.mWebECPresenter = eCWebPresenter;
        eCWebPresenter.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public boolean initViews(boolean z) {
        MBWebView mBWebView = new MBWebView(new MutableContextWrapper(c.n().d()));
        this.mWebView = mBWebView;
        mBWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mCloseImageView = new ImageView(getContext());
        int iA = t0.a(getContext(), 48.0f);
        int iA2 = t0.a(getContext(), 5.0f);
        int iA3 = t0.a(getContext(), 15.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.topMargin = iA3;
        layoutParams.rightMargin = iA3;
        layoutParams.gravity = 8388661;
        this.mCloseImageView.setLayoutParams(layoutParams);
        this.mCloseImageView.setPadding(iA2, iA2, iA2, iA2);
        this.mCloseImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mCloseImageView.setImageResource(g0.a(getContext(), "mbridge_reward_close", "drawable"));
        this.mCloseImageView.setOnClickListener(this);
        this.mCloseImageView.setVisibility(4);
        this.mLinkImageView = new ImageView(getContext());
        int iA4 = t0.a(getContext(), 35.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA4, iA4);
        layoutParams2.topMargin = iA3;
        layoutParams2.leftMargin = iA3;
        layoutParams2.gravity = 8388659;
        this.mLinkImageView.setLayoutParams(layoutParams2);
        this.mLinkImageView.setImageResource(g0.a(getContext(), "mbridge_reward_notice", "drawable"));
        this.mLinkImageView.setId(c1.a());
        this.mLinkImageView.setOnClickListener(this);
        this.mLinkImageView.setVisibility(4);
        this.mWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                WebViewEC.this.isWebViewAttached = true;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                WebViewEC.this.isWebViewAttached = false;
            }
        });
        addView(this.mWebView);
        addView(this.mCloseImageView);
        return true;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void onActivityLifeCycleCallback(String str) {
        ECWebPresenter eCWebPresenter = this.mWebECPresenter;
        if (eCWebPresenter != null) {
            eCWebPresenter.onActivityLifeCycleCallback(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mWebECPresenter.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ECWebPresenter eCWebPresenter = this.mWebECPresenter;
        if (eCWebPresenter != null) {
            eCWebPresenter.click(view);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void onCloseViewClick(@BridgeParameter(key = "type") int i) {
        ECWebPresenter eCWebPresenter = this.mWebECPresenter;
        if (eCWebPresenter != null) {
            eCWebPresenter.click(null);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "landscape");
            } else {
                jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "portrait");
            }
            MBCommunicatorUtil.fireEvent(this.mWebView, AdUnitActivity.EXTRA_ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            o0.b("WebViewEC", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void onDestroyWebContent(@BridgeParameter(key = "type") int i) {
        MBWebView mBWebView = this.mWebView;
        if (mBWebView != null) {
            mBWebView.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.webViewShowRunnable);
        this.mWebECPresenter.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ECWebPresenter eCWebPresenter = this.mWebECPresenter;
        if (eCWebPresenter != null && motionEvent != null) {
            eCWebPresenter.handleInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public boolean onWebViewShow(@BridgeParameter(key = "type") int i) {
        if (this.mWebView.isAttachedToWindow()) {
            Rect rect = new Rect();
            this.mWebView.getHitRect(rect);
            if (this.mWebView.getLocalVisibleRect(rect)) {
                this.mWebView.post(this.webViewShowRunnable);
            }
        }
        if (this.hasWebViewShow) {
            return true;
        }
        this.hasWebViewShow = true;
        return false;
    }

    public void preloadWebContent(String str) {
        if (this.mWebView != null) {
            this.mWebECPresenter.addECModel();
            if (TextUtils.isEmpty(str)) {
                this.mWebECPresenter.setRenderError();
            } else {
                this.mWebView.loadUrl(str);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void removeTempleFromSuperView(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void setNativeCloseButtonVisibility(int i) {
        ECWebPresenter eCWebPresenter;
        ImageView imageView = this.mCloseImageView;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        if (i != 0 || (eCWebPresenter = this.mWebECPresenter) == null) {
            return;
        }
        eCWebPresenter.setCanResponseBack(true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    public void setNotch() {
        DisplayCutout displayCutout;
        int i;
        int iA;
        int i2;
        int i3;
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23) {
                WindowInsets rootWindowInsets = getRootWindowInsets();
                if (i4 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                    return;
                }
                int safeInsetLeft = displayCutout.getSafeInsetLeft();
                int safeInsetTop = displayCutout.getSafeInsetTop();
                int safeInsetRight = displayCutout.getSafeInsetRight();
                int safeInsetBottom = displayCutout.getSafeInsetBottom();
                int rotation = getDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation == 1) {
                        i = 90;
                    } else if (rotation == 2) {
                        i = 180;
                    } else if (rotation == 3) {
                        i = 270;
                    }
                    this.mWebECPresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    iA = t0.a(getContext(), 15.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mCloseImageView.getLayoutParams();
                    if (safeInsetTop == 0) {
                        i2 = iA;
                    } else {
                        i2 = safeInsetTop;
                    }
                    layoutParams.topMargin = i2;
                    layoutParams.leftMargin = safeInsetLeft;
                    if (safeInsetRight == 0) {
                        i3 = iA;
                    } else {
                        i3 = safeInsetRight;
                    }
                    layoutParams.rightMargin = i3;
                    layoutParams.bottomMargin = safeInsetBottom;
                    this.mCloseImageView.setLayoutParams(layoutParams);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mLinkImageView.getLayoutParams();
                    if (safeInsetTop == 0) {
                        safeInsetTop = iA;
                    }
                    layoutParams2.topMargin = safeInsetTop;
                    if (safeInsetLeft == 0) {
                        safeInsetLeft = iA;
                    }
                    layoutParams2.leftMargin = safeInsetLeft;
                    layoutParams2.rightMargin = safeInsetRight;
                    layoutParams2.bottomMargin = safeInsetBottom;
                    this.mLinkImageView.setLayoutParams(layoutParams2);
                }
                i = 0;
                this.mWebECPresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                iA = t0.a(getContext(), 15.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mCloseImageView.getLayoutParams();
                if (safeInsetTop == 0) {
                    i2 = iA;
                } else {
                    i2 = safeInsetTop;
                }
                layoutParams3.topMargin = i2;
                layoutParams3.leftMargin = safeInsetLeft;
                if (safeInsetRight == 0) {
                    i3 = iA;
                } else {
                    i3 = safeInsetRight;
                }
                layoutParams3.rightMargin = i3;
                layoutParams3.bottomMargin = safeInsetBottom;
                this.mCloseImageView.setLayoutParams(layoutParams3);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.mLinkImageView.getLayoutParams();
                if (safeInsetTop == 0) {
                    safeInsetTop = iA;
                }
                layoutParams4.topMargin = safeInsetTop;
                if (safeInsetLeft == 0) {
                    safeInsetLeft = iA;
                }
                layoutParams4.leftMargin = safeInsetLeft;
                layoutParams4.rightMargin = safeInsetRight;
                layoutParams4.bottomMargin = safeInsetBottom;
                this.mLinkImageView.setLayoutParams(layoutParams4);
            }
        } catch (Throwable th) {
            o0.b("WebViewEC", th.getMessage());
        }
    }

    public void setRenderUrlType(int i) {
        ECWebPresenter eCWebPresenter = this.mWebECPresenter;
        if (eCWebPresenter != null) {
            eCWebPresenter.setRenderUrlType(i);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        if (getParent() != null) {
            viewGroup.bringToFront();
        } else if (viewGroup != null) {
            viewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
        }
        this.mWebECPresenter.onShown();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showCTAView(String str, CampaignEx campaignEx) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMRAIDExpandView(String str, int i) {
        if (this.mExpandView == null) {
            this.mExpandView = new FloatWebTemplateView(getContext());
        }
        this.mExpandView.setRenderUrl(str);
        this.mExpandView.setFloatViewType(FloatWebTemplateView.FLOAT_EXPAND_VIEW);
        this.mExpandView.addShowReqListener(new b() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.2
            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            }

            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqSuccessful(Object obj) {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.equals("show") && str2.equals("remove")) {
                        WebViewEC webViewEC = WebViewEC.this;
                        webViewEC.removeView(webViewEC.mExpandView);
                    }
                }
            }
        });
        this.mExpandView.show(this);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMiniCard() {
    }

    public void webViewShow() {
        try {
            if (this.mWebECPresenter.getRenderStatus() >= 2) {
                int i = getResources().getConfiguration().orientation;
                String str = AdError.UNDEFINED_DOMAIN;
                if (i != 0) {
                    if (i == 1) {
                        str = "portrait";
                    } else if (i == 2) {
                        str = "landscape";
                    }
                }
                MBCommunicatorUtil.notifyShowDataInfo(this.mWebView, i, this.mWebECPresenter.getCampaignOrientation());
                MBCommunicatorUtil.notifyWebViewShowed(this.mWebView, str, this.mWebECPresenter.getWebViewShowExtraData());
            }
        } catch (Throwable th) {
            o0.b("WebViewEC", th.getMessage());
        }
    }

    public WebViewEC(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "WebViewEC";
        this.isWebViewAttached = false;
        this.hasWebViewShow = false;
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.3
            @Override // java.lang.Runnable
            public void run() {
                WebViewEC.this.webViewShow();
                WebViewEC.this.setNotch();
            }
        };
        initPresenter();
    }

    public WebViewEC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "WebViewEC";
        this.isWebViewAttached = false;
        this.hasWebViewShow = false;
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.3
            @Override // java.lang.Runnable
            public void run() {
                WebViewEC.this.webViewShow();
                WebViewEC.this.setNotch();
            }
        };
        initPresenter();
    }

    @RequiresApi(api = 21)
    public WebViewEC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.TAG = "WebViewEC";
        this.isWebViewAttached = false;
        this.hasWebViewShow = false;
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC.3
            @Override // java.lang.Runnable
            public void run() {
                WebViewEC.this.webViewShow();
                WebViewEC.this.setNotch();
            }
        };
        initPresenter();
    }
}
