package com.mbridge.msdk.newreward.player.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.iview.IWebTemplateView;
import com.mbridge.msdk.newreward.player.model.WebTemplateModel;
import com.mbridge.msdk.newreward.player.presenter.PlayWebPresenter;
import com.mbridge.msdk.newreward.player.view.floatview.AlertTempleView;
import com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewTemplate extends FrameLayout implements IWebTemplateView, View.OnClickListener {
    final int CLOSE_BUILD_TYPE;
    private final String TAG;
    private final Runnable getNotchDataRunnable;
    private boolean hasWebViewShow;
    private final Runnable hideCTAViewRunnable;
    boolean isWebViewAttached;
    boolean isWebViewShowed;
    AlertTempleView mAlertTempleView;
    MBridgeClickCTAView mCTAView;
    ImageView mCloseImageView;
    TextView mCountDownTextView;
    ImageView mLinkImageView;
    FrameLayout mPlayerLayout;
    PlayerView mPlayerView;
    MBridgeSegmentsProgressBar mSegmentsProgressBar;
    SoundImageView mSoundImageView;
    RelativeLayout mTopControllerView;
    PlayWebPresenter mWebTemplatePresenter;
    MBWebView mWebView;
    FloatWebTemplateView miniCardView;
    private final Runnable webViewShowRunnable;

    public WebViewTemplate(@NonNull Context context) {
        super(context);
        this.TAG = "WebViewTemplate";
        this.CLOSE_BUILD_TYPE = 2;
        this.hasWebViewShow = false;
        this.getNotchDataRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.6
            /* JADX WARN: Code duplicated, block: B:25:0x0064  */
            /* JADX WARN: Code duplicated, block: B:26:0x0066  */
            /* JADX WARN: Code duplicated, block: B:29:0x006b  */
            /* JADX WARN: Code duplicated, block: B:30:0x006d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code duplicated, block: B:34:0x0073  */
            @Override // java.lang.Runnable
            public void run() {
                DisplayCutout displayCutout;
                int i;
                int iA;
                int i2;
                int i3;
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23) {
                        WindowInsets rootWindowInsets = WebViewTemplate.this.getRootWindowInsets();
                        if (i4 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || WebViewTemplate.this.mTopControllerView == null) {
                            return;
                        }
                        int safeInsetLeft = displayCutout.getSafeInsetLeft();
                        int safeInsetTop = displayCutout.getSafeInsetTop();
                        int safeInsetRight = displayCutout.getSafeInsetRight();
                        int safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int rotation = WebViewTemplate.this.getDisplay().getRotation();
                        if (rotation != 0) {
                            if (rotation == 1) {
                                i = 90;
                            } else if (rotation == 2) {
                                i = 180;
                            } else if (rotation == 3) {
                                i = 270;
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                            iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                            if (safeInsetLeft == 0) {
                                i2 = iA;
                            } else {
                                i2 = safeInsetLeft;
                            }
                            layoutParams.leftMargin = i2;
                            if (safeInsetTop == 0) {
                                i3 = iA;
                            } else {
                                i3 = safeInsetTop;
                            }
                            layoutParams.topMargin = i3;
                            if (safeInsetRight == 0) {
                                iA = safeInsetRight;
                            }
                            layoutParams.rightMargin = iA;
                            WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams);
                            WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                        }
                        i = 0;
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                        iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                        if (safeInsetLeft == 0) {
                            i2 = iA;
                        } else {
                            i2 = safeInsetLeft;
                        }
                        layoutParams2.leftMargin = i2;
                        if (safeInsetTop == 0) {
                            i3 = iA;
                        } else {
                            i3 = safeInsetTop;
                        }
                        layoutParams2.topMargin = i3;
                        if (safeInsetRight == 0) {
                            iA = safeInsetRight;
                        }
                        layoutParams2.rightMargin = iA;
                        WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams2);
                        WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    }
                } catch (Throwable th) {
                    o0.b("WebViewTemplate", th.getMessage());
                }
            }
        };
        this.hideCTAViewRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate webViewTemplate = WebViewTemplate.this;
                webViewTemplate.removeView(webViewTemplate.mCTAView);
                WebViewTemplate.this.mSoundImageView.setVisibility(0);
            }
        };
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.8
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate.this.webViewShow();
            }
        };
        initPresenter();
    }

    private RelativeLayout getTopControllerView() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        int iA = t0.a(getContext(), 10.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = iA;
        layoutParams.rightMargin = iA;
        layoutParams.topMargin = iA;
        relativeLayout.setLayoutParams(layoutParams);
        this.mLinkImageView = new ImageView(getContext());
        int iA2 = t0.a(getContext(), 35.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA2, iA2);
        layoutParams2.addRule(9);
        this.mLinkImageView.setLayoutParams(layoutParams2);
        this.mLinkImageView.setImageResource(g0.a(getContext(), "mbridge_reward_notice", "drawable"));
        this.mLinkImageView.setId(c1.a());
        this.mLinkImageView.setOnClickListener(this);
        this.mCountDownTextView = new TextView(getContext());
        int iA3 = t0.a(getContext(), 30.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iA3, iA3);
        layoutParams3.addRule(1, this.mLinkImageView.getId());
        layoutParams3.addRule(15);
        this.mCountDownTextView.setLayoutParams(layoutParams3);
        this.mCountDownTextView.setId(c1.a());
        this.mCountDownTextView.setGravity(17);
        this.mCountDownTextView.setTextColor(-1);
        this.mCountDownTextView.setTextSize(11.0f);
        this.mCountDownTextView.setBackgroundResource(g0.a(getContext(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        this.mCloseImageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iA2, iA2);
        layoutParams4.addRule(11);
        this.mCloseImageView.setLayoutParams(layoutParams4);
        this.mCloseImageView.setImageResource(g0.a(getContext(), "mbridge_reward_close", "drawable"));
        this.mCloseImageView.setVisibility(4);
        this.mCloseImageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewTemplate.this.onCloseViewClick(2);
            }
        });
        relativeLayout.addView(this.mLinkImageView);
        relativeLayout.addView(this.mCountDownTextView);
        relativeLayout.addView(this.mCloseImageView);
        return relativeLayout;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void addViewToCurrentViewGroup(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void addWebView(MBWebView mBWebView, int i) {
        if (mBWebView != null) {
            this.mWebView = mBWebView;
            mBWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (this.mWebView.getHybridCommunicator() instanceof WebTemplateModel) {
                this.mWebTemplatePresenter.setTemplateModel((WebTemplateModel) this.mWebView.getHybridCommunicator());
            }
            this.mWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    WebViewTemplate webViewTemplate = WebViewTemplate.this;
                    webViewTemplate.isWebViewAttached = true;
                    webViewTemplate.mWebTemplatePresenter.onWebViewShow();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    WebViewTemplate.this.isWebViewAttached = false;
                }
            });
            addView(this.mWebView, i);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void alertDismiss() {
        if (this.mAlertTempleView != null) {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.resumeStart();
            }
            removeView(this.mAlertTempleView);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void alertShow() {
        if (this.mAlertTempleView != null) {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.pause();
            }
            addView(this.mAlertTempleView);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IWebTemplateView
    public void changeVideoViewPosition(JSONObject jSONObject) {
        if (this.mPlayerView == null || jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("margin_top", 0);
        int iOptInt2 = jSONObject.optInt("margin_left", 0);
        int iOptInt3 = jSONObject.optInt("view_width", 0);
        int iOptInt4 = jSONObject.optInt("view_height", 0);
        int iOptInt5 = jSONObject.optInt("radius", 0);
        if (iOptInt3 < 0 || iOptInt4 < 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerLayout.getLayoutParams();
        layoutParams.width = iOptInt3;
        layoutParams.height = iOptInt4;
        layoutParams.topMargin = iOptInt;
        layoutParams.leftMargin = iOptInt2;
        if (iOptInt5 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(t0.a(getContext(), iOptInt5));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.mPlayerView.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.mPlayerView.setClipToOutline(true);
        }
        this.mPlayerLayout.setLayoutParams(layoutParams);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public View getBaitClickView() {
        return null;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public View getCountDownView() {
        return this.mCountDownTextView;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public boolean getMuteState() {
        SoundImageView soundImageView = this.mSoundImageView;
        if (soundImageView != null) {
            return soundImageView.getStatus();
        }
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView, com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public ImageView getPrivacyButton() {
        return this.mLinkImageView;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public MBridgeSegmentsProgressBar getSegmentsProgressBar() {
        return this.mSegmentsProgressBar;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public MBWebView getWebView() {
        return this.mWebView;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void hideCTAView() {
        post(this.hideCTAViewRunnable);
    }

    public void initPresenter() {
        PlayWebPresenter playWebPresenter = new PlayWebPresenter(this);
        this.mWebTemplatePresenter = playWebPresenter;
        playWebPresenter.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public boolean initViews(boolean z) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mPlayerLayout = new FrameLayout(getContext());
        PlayerView playerView = new PlayerView(getContext());
        this.mPlayerView = playerView;
        playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mAlertTempleView = new AlertTempleView(getContext(), this.mWebTemplatePresenter);
        this.mSoundImageView = new SoundImageView(getContext());
        int iA = t0.a(getContext(), 35.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        int iA2 = t0.a(getContext(), 10.0f);
        layoutParams.leftMargin = iA2;
        layoutParams.bottomMargin = iA2;
        layoutParams.gravity = 8388691;
        this.mSoundImageView.setLayoutParams(layoutParams);
        this.mSoundImageView.setOnClickListener(this);
        this.mSegmentsProgressBar = new MBridgeSegmentsProgressBar(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        this.mSegmentsProgressBar.setLayoutParams(layoutParams2);
        this.mPlayerLayout.addView(this.mPlayerView);
        this.mPlayerLayout.addView(this.mSoundImageView);
        this.mPlayerLayout.addView(this.mSegmentsProgressBar);
        this.mTopControllerView = getTopControllerView();
        addView(this.mPlayerLayout);
        addView(this.mTopControllerView);
        this.mPlayerView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewTemplate.this.mWebTemplatePresenter.onClick(1);
            }
        });
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void onActivityLifeCycleCallback(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                PlayWebPresenter playWebPresenter = this.mWebTemplatePresenter;
                if (playWebPresenter != null) {
                    playWebPresenter.onDestroy();
                }
                str2 = "onSystemDestory";
                break;
            case "onPause":
                PlayerView playerView = this.mPlayerView;
                if (playerView != null) {
                    playerView.pause();
                }
                PlayWebPresenter playWebPresenter2 = this.mWebTemplatePresenter;
                if (playWebPresenter2 != null) {
                    playWebPresenter2.onPause();
                }
                str2 = "onSystemPause";
                break;
            case "onBackPressed":
                PlayWebPresenter playWebPresenter3 = this.mWebTemplatePresenter;
                if (playWebPresenter3 != null) {
                    playWebPresenter3.onBackPressed();
                }
                str2 = "onSystemBackPressed";
                break;
            case "onStop":
                PlayerView playerView2 = this.mPlayerView;
                if (playerView2 != null) {
                    playerView2.stop();
                }
                str2 = "";
                break;
            case "onResume":
                PlayerView playerView3 = this.mPlayerView;
                if (playerView3 != null) {
                    playerView3.onResume();
                }
                PlayWebPresenter playWebPresenter4 = this.mWebTemplatePresenter;
                if (playWebPresenter4 != null) {
                    playWebPresenter4.onResume();
                }
                str2 = "onSystemResume";
                break;
            default:
                str2 = "";
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        MBCommunicatorUtil.fireEvent(this.mWebView, str2, "");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mLinkImageView) {
            this.mWebTemplatePresenter.onClick(9);
        } else if (view == this.mSoundImageView) {
            this.mWebTemplatePresenter.onClick(5);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void onCloseViewClick(@BridgeParameter(key = "type") int i) {
        PlayWebPresenter playWebPresenter = this.mWebTemplatePresenter;
        if (playWebPresenter != null) {
            playWebPresenter.onClick(2);
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
            o0.b("WebViewTemplate", e.getMessage());
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
        removeCallbacks(this.getNotchDataRunnable);
        removeCallbacks(this.hideCTAViewRunnable);
        removeCallbacks(this.webViewShowRunnable);
        this.mWebTemplatePresenter.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PlayWebPresenter playWebPresenter = this.mWebTemplatePresenter;
        if (playWebPresenter != null && motionEvent != null) {
            playWebPresenter.handleInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public boolean onWebViewShow(@BridgeParameter(key = "type") int i) {
        if (this.mWebView.isAttachedToWindow()) {
            this.mWebView.post(this.webViewShowRunnable);
        }
        if (this.hasWebViewShow) {
            return true;
        }
        this.hasWebViewShow = true;
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void pause() {
        PlayerView playerView = this.mPlayerView;
        if (playerView == null) {
            return;
        }
        playerView.pause();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void play(String str, int i) {
        this.mPlayerView.initBufferIngParam(i);
        this.mPlayerView.initVFPData(str, str, this.mWebTemplatePresenter);
        this.mPlayerView.playVideo();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IWebTemplateView
    public void playOrPauseVideo(int i) {
        PlayerView playerView;
        if (i == -999) {
            return;
        }
        if (i == 1) {
            resume();
            return;
        }
        if (i == 2) {
            pause();
            return;
        }
        if (i == 3) {
            this.mPlayerView.stop();
        } else if (i == 6 && (playerView = this.mPlayerView) != null) {
            playerView.release();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void release() {
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.release();
            this.mPlayerView = null;
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void removeTempleFromSuperView(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void resume() {
        PlayerView playerView = this.mPlayerView;
        if (playerView == null) {
            return;
        }
        playerView.onResume();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IWebTemplateView
    public void seekToPlay(int i) {
        PlayerView playerView = this.mPlayerView;
        if (playerView == null || i == -1) {
            return;
        }
        playerView.seekTo(i);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setAdCloseVisibility(boolean z) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setAlertViewType(String str, int i, int i2) {
        AlertTempleView alertTempleView = this.mAlertTempleView;
        if (alertTempleView != null) {
            alertTempleView.setAlertType(i, str, i2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setBackGroundImage(Bitmap bitmap) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setCountDown(String str, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        TextView textView = this.mCountDownTextView;
        if (textView == null || textView.getVisibility() == 4) {
            return;
        }
        this.mCountDownTextView.setText(str);
        if (i != 0) {
            this.mCountDownTextView.setPadding(i, 0, i, 0);
        }
        if (layoutParams != null) {
            this.mCountDownTextView.setLayoutParams(layoutParams);
        }
        if (i2 != 0) {
            this.mCountDownTextView.setBackgroundResource(i2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setMuteState(boolean z) {
        SoundImageView soundImageView = this.mSoundImageView;
        if (soundImageView != null) {
            soundImageView.setSoundStatus(z);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (z) {
                playerView.openSound();
            } else {
                playerView.closeSound();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void setNativeCloseButtonVisibility(int i) {
        PlayWebPresenter playWebPresenter;
        ImageView imageView = this.mCloseImageView;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
        if (i != 0 || (playWebPresenter = this.mWebTemplatePresenter) == null) {
            return;
        }
        playWebPresenter.setCanResponseBack(true);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setPlayerSize(int i, int i2, int i3) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setSegmentsProgressBar(int i) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar = this.mSegmentsProgressBar;
        if (mBridgeSegmentsProgressBar != null) {
            mBridgeSegmentsProgressBar.init(1, 3);
            this.mSegmentsProgressBar.setVisibility(i);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void setTemplateWidthAndHeight(int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.addView(this);
        }
        postDelayed(this.getNotchDataRunnable, 500L);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showCTAView(String str, CampaignEx campaignEx) {
        if (this.mCTAView == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.mCTAView = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(campaignEx);
            this.mCTAView.setUnitId(str);
            this.mCTAView.preLoadData(null);
            this.mCTAView.setCtaClickCallBack(new MBridgeClickCTAView.f() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.4
                @Override // com.mbridge.msdk.video.module.MBridgeClickCTAView.f
                public void ctaClick() {
                    WebViewTemplate.this.mWebTemplatePresenter.onClick(3);
                }
            });
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        addView(this.mCTAView, layoutParams);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMRAIDExpandView(String str, int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseWebView
    public void showMiniCard() {
        if (this.miniCardView == null) {
            FloatWebTemplateView floatWebTemplateView = new FloatWebTemplateView(getContext());
            this.miniCardView = floatWebTemplateView;
            floatWebTemplateView.setFloatViewType(273);
        }
        this.miniCardView.addShowReqListener(new b() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.5
            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            }

            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqSuccessful(Object obj) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equals("show")) {
                        WebViewTemplate.this.pause();
                    } else if (str.equals("remove")) {
                        WebViewTemplate.this.resume();
                    }
                }
            }
        });
        this.miniCardView.show(this);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IPlayTempleView
    public void viewReport(Object obj) {
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
        MBCommunicatorUtil.notifyShowDataInfo(this.mWebView, i, this.mWebTemplatePresenter.getCampaignOrientation());
        MBCommunicatorUtil.notifyWebViewShowed(this.mWebView, str, this.mWebTemplatePresenter.getWebViewShowExtraData());
        this.isWebViewShowed = true;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IWebTemplateView
    public void setMuteState(int i, int i2) {
        SoundImageView soundImageView = this.mSoundImageView;
        if (soundImageView != null) {
            soundImageView.setVisibility(i2 == 1 ? 4 : 0);
            if (i == 1) {
                this.mSoundImageView.setSoundStatus(true);
            }
            if (i == 2) {
                this.mSoundImageView.setSoundStatus(false);
            }
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (i == 1) {
                playerView.closeSound();
            }
            if (i == 2) {
                this.mPlayerView.openSound();
            }
        }
    }

    public WebViewTemplate(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "WebViewTemplate";
        this.CLOSE_BUILD_TYPE = 2;
        this.hasWebViewShow = false;
        this.getNotchDataRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.6
            /* JADX WARN: Code duplicated, block: B:25:0x0064  */
            /* JADX WARN: Code duplicated, block: B:26:0x0066  */
            /* JADX WARN: Code duplicated, block: B:29:0x006b  */
            /* JADX WARN: Code duplicated, block: B:30:0x006d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code duplicated, block: B:34:0x0073  */
            @Override // java.lang.Runnable
            public void run() {
                DisplayCutout displayCutout;
                int i;
                int iA;
                int i2;
                int i3;
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23) {
                        WindowInsets rootWindowInsets = WebViewTemplate.this.getRootWindowInsets();
                        if (i4 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || WebViewTemplate.this.mTopControllerView == null) {
                            return;
                        }
                        int safeInsetLeft = displayCutout.getSafeInsetLeft();
                        int safeInsetTop = displayCutout.getSafeInsetTop();
                        int safeInsetRight = displayCutout.getSafeInsetRight();
                        int safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int rotation = WebViewTemplate.this.getDisplay().getRotation();
                        if (rotation != 0) {
                            if (rotation == 1) {
                                i = 90;
                            } else if (rotation == 2) {
                                i = 180;
                            } else if (rotation == 3) {
                                i = 270;
                            }
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                            iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                            if (safeInsetLeft == 0) {
                                i2 = iA;
                            } else {
                                i2 = safeInsetLeft;
                            }
                            layoutParams2.leftMargin = i2;
                            if (safeInsetTop == 0) {
                                i3 = iA;
                            } else {
                                i3 = safeInsetTop;
                            }
                            layoutParams2.topMargin = i3;
                            if (safeInsetRight == 0) {
                                iA = safeInsetRight;
                            }
                            layoutParams2.rightMargin = iA;
                            WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams2);
                            WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                        }
                        i = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                        iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                        if (safeInsetLeft == 0) {
                            i2 = iA;
                        } else {
                            i2 = safeInsetLeft;
                        }
                        layoutParams3.leftMargin = i2;
                        if (safeInsetTop == 0) {
                            i3 = iA;
                        } else {
                            i3 = safeInsetTop;
                        }
                        layoutParams3.topMargin = i3;
                        if (safeInsetRight == 0) {
                            iA = safeInsetRight;
                        }
                        layoutParams3.rightMargin = iA;
                        WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams3);
                        WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    }
                } catch (Throwable th) {
                    o0.b("WebViewTemplate", th.getMessage());
                }
            }
        };
        this.hideCTAViewRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate webViewTemplate = WebViewTemplate.this;
                webViewTemplate.removeView(webViewTemplate.mCTAView);
                WebViewTemplate.this.mSoundImageView.setVisibility(0);
            }
        };
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.8
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate.this.webViewShow();
            }
        };
        initPresenter();
    }

    public WebViewTemplate(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "WebViewTemplate";
        this.CLOSE_BUILD_TYPE = 2;
        this.hasWebViewShow = false;
        this.getNotchDataRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.6
            /* JADX WARN: Code duplicated, block: B:25:0x0064  */
            /* JADX WARN: Code duplicated, block: B:26:0x0066  */
            /* JADX WARN: Code duplicated, block: B:29:0x006b  */
            /* JADX WARN: Code duplicated, block: B:30:0x006d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code duplicated, block: B:34:0x0073  */
            @Override // java.lang.Runnable
            public void run() {
                DisplayCutout displayCutout;
                int i2;
                int iA;
                int i3;
                int i4;
                try {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 23) {
                        WindowInsets rootWindowInsets = WebViewTemplate.this.getRootWindowInsets();
                        if (i5 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || WebViewTemplate.this.mTopControllerView == null) {
                            return;
                        }
                        int safeInsetLeft = displayCutout.getSafeInsetLeft();
                        int safeInsetTop = displayCutout.getSafeInsetTop();
                        int safeInsetRight = displayCutout.getSafeInsetRight();
                        int safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int rotation = WebViewTemplate.this.getDisplay().getRotation();
                        if (rotation != 0) {
                            if (rotation == 1) {
                                i2 = 90;
                            } else if (rotation == 2) {
                                i2 = 180;
                            } else if (rotation == 3) {
                                i2 = 270;
                            }
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                            iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                            if (safeInsetLeft == 0) {
                                i3 = iA;
                            } else {
                                i3 = safeInsetLeft;
                            }
                            layoutParams3.leftMargin = i3;
                            if (safeInsetTop == 0) {
                                i4 = iA;
                            } else {
                                i4 = safeInsetTop;
                            }
                            layoutParams3.topMargin = i4;
                            if (safeInsetRight == 0) {
                                iA = safeInsetRight;
                            }
                            layoutParams3.rightMargin = iA;
                            WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams3);
                            WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i2, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                        }
                        i2 = 0;
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                        iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                        if (safeInsetLeft == 0) {
                            i3 = iA;
                        } else {
                            i3 = safeInsetLeft;
                        }
                        layoutParams4.leftMargin = i3;
                        if (safeInsetTop == 0) {
                            i4 = iA;
                        } else {
                            i4 = safeInsetTop;
                        }
                        layoutParams4.topMargin = i4;
                        if (safeInsetRight == 0) {
                            iA = safeInsetRight;
                        }
                        layoutParams4.rightMargin = iA;
                        WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams4);
                        WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i2, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    }
                } catch (Throwable th) {
                    o0.b("WebViewTemplate", th.getMessage());
                }
            }
        };
        this.hideCTAViewRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate webViewTemplate = WebViewTemplate.this;
                webViewTemplate.removeView(webViewTemplate.mCTAView);
                WebViewTemplate.this.mSoundImageView.setVisibility(0);
            }
        };
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.8
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate.this.webViewShow();
            }
        };
        initPresenter();
    }

    @RequiresApi(api = 21)
    public WebViewTemplate(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.TAG = "WebViewTemplate";
        this.CLOSE_BUILD_TYPE = 2;
        this.hasWebViewShow = false;
        this.getNotchDataRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.6
            /* JADX WARN: Code duplicated, block: B:25:0x0064  */
            /* JADX WARN: Code duplicated, block: B:26:0x0066  */
            /* JADX WARN: Code duplicated, block: B:29:0x006b  */
            /* JADX WARN: Code duplicated, block: B:30:0x006d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code duplicated, block: B:34:0x0073  */
            @Override // java.lang.Runnable
            public void run() {
                DisplayCutout displayCutout;
                int i3;
                int iA;
                int i4;
                int i5;
                try {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 23) {
                        WindowInsets rootWindowInsets = WebViewTemplate.this.getRootWindowInsets();
                        if (i6 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || WebViewTemplate.this.mTopControllerView == null) {
                            return;
                        }
                        int safeInsetLeft = displayCutout.getSafeInsetLeft();
                        int safeInsetTop = displayCutout.getSafeInsetTop();
                        int safeInsetRight = displayCutout.getSafeInsetRight();
                        int safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int rotation = WebViewTemplate.this.getDisplay().getRotation();
                        if (rotation != 0) {
                            if (rotation == 1) {
                                i3 = 90;
                            } else if (rotation == 2) {
                                i3 = 180;
                            } else if (rotation == 3) {
                                i3 = 270;
                            }
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                            iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                            if (safeInsetLeft == 0) {
                                i4 = iA;
                            } else {
                                i4 = safeInsetLeft;
                            }
                            layoutParams4.leftMargin = i4;
                            if (safeInsetTop == 0) {
                                i5 = iA;
                            } else {
                                i5 = safeInsetTop;
                            }
                            layoutParams4.topMargin = i5;
                            if (safeInsetRight == 0) {
                                iA = safeInsetRight;
                            }
                            layoutParams4.rightMargin = iA;
                            WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams4);
                            WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i3, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                        }
                        i3 = 0;
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) WebViewTemplate.this.mTopControllerView.getLayoutParams();
                        iA = t0.a(WebViewTemplate.this.getContext(), 10.0f);
                        if (safeInsetLeft == 0) {
                            i4 = iA;
                        } else {
                            i4 = safeInsetLeft;
                        }
                        layoutParams5.leftMargin = i4;
                        if (safeInsetTop == 0) {
                            i5 = iA;
                        } else {
                            i5 = safeInsetTop;
                        }
                        layoutParams5.topMargin = i5;
                        if (safeInsetRight == 0) {
                            iA = safeInsetRight;
                        }
                        layoutParams5.rightMargin = iA;
                        WebViewTemplate.this.mTopControllerView.setLayoutParams(layoutParams5);
                        WebViewTemplate.this.mWebTemplatePresenter.setNotchData(b0.a(i3, safeInsetLeft, safeInsetRight, safeInsetTop, safeInsetBottom));
                    }
                } catch (Throwable th) {
                    o0.b("WebViewTemplate", th.getMessage());
                }
            }
        };
        this.hideCTAViewRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate webViewTemplate = WebViewTemplate.this;
                webViewTemplate.removeView(webViewTemplate.mCTAView);
                WebViewTemplate.this.mSoundImageView.setVisibility(0);
            }
        };
        this.webViewShowRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.WebViewTemplate.8
            @Override // java.lang.Runnable
            public void run() {
                WebViewTemplate.this.webViewShow();
            }
        };
        initPresenter();
    }
}
