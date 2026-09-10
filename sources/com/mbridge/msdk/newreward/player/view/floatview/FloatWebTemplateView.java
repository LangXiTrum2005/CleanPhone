package com.mbridge.msdk.newreward.player.view.floatview;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DisplayCutout;
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
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.player.iview.IBaseWebView;
import com.mbridge.msdk.newreward.player.presenter.FloatWebViewPresenter;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class FloatWebTemplateView extends FrameLayout implements IBaseWebView, View.OnClickListener {
    public static final int FLOAT_EXPAND_VIEW = 546;
    public static final int FLOAT_MINI_CARD = 273;
    private static final String TAG = "FloatTemplateView";
    boolean hasWebViewShow;
    boolean isWebViewAttached;
    boolean isWebViewShowed;
    ImageView mCloseImageView;
    FloatWebViewPresenter mFloatPresenter;
    String mUrl;
    int mViewType;
    MBWebView mWebView;
    b reqCallBack;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FloatViewType {
    }

    public FloatWebTemplateView(@NonNull Context context) {
        super(context);
        this.isWebViewAttached = false;
        this.isWebViewShowed = false;
    }

    private void initPresenter() {
        FloatWebViewPresenter floatWebViewPresenter = new FloatWebViewPresenter(this, this.mViewType);
        this.mFloatPresenter = floatWebViewPresenter;
        floatWebViewPresenter.getView();
    }

    public void addShowReqListener(b bVar) {
        this.reqCallBack = bVar;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void addViewToCurrentViewGroup(View view) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView, com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public ImageView getPrivacyButton() {
        return null;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public MBWebView getWebView() {
        return this.mWebView;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void hideCTAView() {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public boolean initViews(boolean z) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(2130706432);
        int iG = t0.g(getContext());
        int iF = t0.f(getContext());
        this.mWebView = new MBWebView(new MutableContextWrapper(c.n().d()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mViewType == 273) {
            layoutParams.width = (int) ((((double) iG) * 0.7d) + 0.5d);
            layoutParams.height = (int) ((((double) iF) * 0.7d) + 0.5d);
            layoutParams.gravity = 17;
        }
        this.mWebView.setLayoutParams(layoutParams);
        this.mCloseImageView = new ImageView(getContext());
        int iA = this.mViewType == 273 ? t0.a(getContext(), 48.0f) : 96;
        int iA2 = t0.a(getContext(), 5.0f);
        int i = (int) ((((double) iG) * 0.15d) + 0.5d);
        int i2 = (int) ((((double) iF) * 0.15d) + 0.5d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA, iA);
        int i3 = this.mViewType;
        if (i3 != 273) {
            i2 = 30;
        }
        layoutParams2.topMargin = i2;
        if (i3 != 273) {
            i = 30;
        }
        layoutParams2.rightMargin = i;
        layoutParams2.gravity = 8388661;
        this.mCloseImageView.setLayoutParams(layoutParams2);
        this.mCloseImageView.setPadding(iA2, iA2, iA2, iA2);
        this.mCloseImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mCloseImageView.setImageResource(g0.a(getContext(), "mbridge_reward_close_ec", "drawable"));
        this.mCloseImageView.setOnClickListener(this);
        this.mCloseImageView.setVisibility(4);
        this.mWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                FloatWebTemplateView.this.isWebViewAttached = true;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                FloatWebTemplateView.this.isWebViewAttached = false;
            }
        });
        addView(this.mWebView);
        addView(this.mCloseImageView);
        FloatWebViewPresenter floatWebViewPresenter = this.mFloatPresenter;
        if (floatWebViewPresenter == null) {
            return true;
        }
        if (this.mViewType == 273) {
            floatWebViewPresenter.renderPauseUrl();
        }
        if (this.mViewType != 546) {
            return true;
        }
        this.mFloatPresenter.renderMRAID(this.mUrl);
        return true;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void onActivityLifeCycleCallback(String str) {
        FloatWebViewPresenter floatWebViewPresenter = this.mFloatPresenter;
        if (floatWebViewPresenter != null) {
            floatWebViewPresenter.onActivityLifeCycleCallback(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.mFloatPresenter.click(view);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void onCloseViewClick(int i) {
        FloatWebViewPresenter floatWebViewPresenter = this.mFloatPresenter;
        if (floatWebViewPresenter != null) {
            floatWebViewPresenter.click(null);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void onDestroyWebContent(int i) {
        MBWebView mBWebView = this.mWebView;
        if (mBWebView != null) {
            mBWebView.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FloatWebViewPresenter floatWebViewPresenter = this.mFloatPresenter;
        if (floatWebViewPresenter != null) {
            floatWebViewPresenter.onDetachedFromWindow();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public boolean onWebViewShow(int i) {
        this.mWebView.post(new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView.1
            @Override // java.lang.Runnable
            public void run() {
                FloatWebTemplateView.this.mFloatPresenter.changeNativeCloseButton();
                FloatWebTemplateView.this.webViewShow();
                FloatWebTemplateView.this.setNotch();
            }
        });
        if (this.hasWebViewShow) {
            return true;
        }
        this.hasWebViewShow = true;
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void removeTempleFromSuperView(ViewGroup viewGroup) {
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ((ViewGroup) getParent()).removeView(this);
        }
        b bVar = this.reqCallBack;
        if (bVar != null) {
            bVar.reqSuccessful("remove");
        }
    }

    public void setFloatViewType(int i) {
        this.mViewType = i;
        initPresenter();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void setNativeCloseButtonVisibility(int i) {
        ImageView imageView = this.mCloseImageView;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setNotch() {
        DisplayCutout displayCutout;
        int i;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                WindowInsets rootWindowInsets = getRootWindowInsets();
                if (i2 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
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
                    this.mFloatPresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mCloseImageView.getLayoutParams();
                    layoutParams.topMargin = safeInsetTop;
                    layoutParams.leftMargin = safeInsetLeft;
                    layoutParams.rightMargin = safeInsetRight;
                    layoutParams.bottomMargin = safeInsetBottom;
                }
                i = 0;
                this.mFloatPresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mCloseImageView.getLayoutParams();
                layoutParams2.topMargin = safeInsetTop;
                layoutParams2.leftMargin = safeInsetLeft;
                layoutParams2.rightMargin = safeInsetRight;
                layoutParams2.bottomMargin = safeInsetBottom;
            }
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public void setRenderUrl(String str) {
        this.mUrl = str;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        if (getParent() != null) {
            viewGroup.bringToFront();
        } else if (viewGroup != null) {
            viewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
        }
        this.mFloatPresenter.onShown();
        b bVar = this.reqCallBack;
        if (bVar != null) {
            bVar.reqSuccessful("show");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showCTAView(String str, CampaignEx campaignEx) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMRAIDExpandView(String str, int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMiniCard() {
    }

    public void webViewShow() {
        if (this.isWebViewShowed) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i != 0) {
            if (i == 1) {
                str = "portrait";
            } else if (i == 2) {
                str = "landscape";
            }
        }
        MBCommunicatorUtil.notifyShowDataInfo(this.mWebView, i, this.mFloatPresenter.getCampaignOrientation());
        MBCommunicatorUtil.notifyWebViewShowed(this.mWebView, str, this.mFloatPresenter.getWebViewShowExtraData());
        this.isWebViewShowed = true;
    }

    public FloatWebTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isWebViewAttached = false;
        this.isWebViewShowed = false;
    }

    public FloatWebTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isWebViewAttached = false;
        this.isWebViewShowed = false;
    }

    @RequiresApi(api = 21)
    public FloatWebTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.isWebViewAttached = false;
        this.isWebViewShowed = false;
    }
}
