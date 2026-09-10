package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AcquireRewardPopViewParameters f33070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationSet f33071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f33072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f33073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f33074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f33075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f33079k;
    private final View.OnClickListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f33080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f33081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f33082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f33083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f33084q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f33069a = "MBAcquireRewardPopView";
        this.f33072d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33073e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33074f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33075g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f33070b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
            }
        };
        this.f33080m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f33076h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f33080m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f33077i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f33081n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f33077i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f33082o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f33072d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f33073e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f33074f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f33075g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f33074f <= MBAcquireRewardPopView.this.f33072d || Math.abs(MBAcquireRewardPopView.this.f33074f - MBAcquireRewardPopView.this.f33072d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f33075g - MBAcquireRewardPopView.this.f33073e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                } else {
                    if (MBAcquireRewardPopView.this.f33078j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                    MBAcquireRewardPopView.this.f33078j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
                }
                return false;
            }
        };
        this.f33083p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                }
            }
        };
        this.f33084q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f33077i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        String str;
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f33070b;
        int i10 = acquireRewardPopViewParameters2.viewType;
        if (i10 == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else {
            str = i10 == 2 ? acquireRewardPopViewParameters2.slideSuccessTitle : "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(" " + str + " ");
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f33070b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f33070b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int iA = v0.a(getContext(), 6.0f);
        int iA2 = v0.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        gradientAndShadowParameters.textSize = 30;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(" " + this.f33070b.slideTitle + " ");
        mBGradientAndShadowTextView.setGravity(17);
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        this.f33079k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, v0.a(getContext(), 25.0f));
        this.f33079k.setLayoutParams(layoutParams3);
        this.f33079k.setTextSize(12.0f);
        this.f33079k.setGravity(17);
        this.f33079k.setTextColor(this.f33070b.successTipTextColor);
        TextView textView = this.f33079k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f33070b;
        textView.setText(String.format(acquireRewardPopViewParameters2.slideTip, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        int iA2 = v0.a(getContext(), 6.0f);
        int iA3 = v0.a(getContext(), 32.0f);
        this.f33079k.setPadding(iA3, iA2, iA3, iA2);
        this.f33079k.setBackground(gradientDrawableA);
        linearLayout.addView(this.f33079k);
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        imageView.setLayoutParams(layoutParams4);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.n().i()));
        linearLayout.addView(imageView);
        View imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.n().i()));
        linearLayout.addView(imageView2);
        imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.a(view);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (MBAcquireRewardPopView.this.f33071c != null) {
                    MBAcquireRewardPopView.this.f33071c.cancel();
                }
            }
        });
        linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.setLongClickable(true);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f33082o);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(" " + this.f33070b.failTitle + " ");
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f33070b.failTipTextColor);
        textView.setText(String.format(this.f33070b.failTip, ""));
        int iA = v0.a(getContext(), 6.0f);
        int iA2 = v0.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ int n(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f33076h;
        mBAcquireRewardPopView.f33076h = i10 - 1;
        return i10;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        View slidePopView;
        if (acquireRewardPopViewParameters == null) {
            q0.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.f33070b = acquireRewardPopViewParameters;
        if (acquireRewardPopViewParameters.viewType == 1) {
            slidePopView = a(a());
            if (this.f33070b.canClickMaskArea) {
                setOnClickListener(this.f33083p);
            }
        } else {
            slidePopView = null;
        }
        if (this.f33070b.viewType == 2) {
            slidePopView = getSlidePopView();
        }
        if (slidePopView != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f33070b.containerBackgroundColor);
            addView(slidePopView);
            int i10 = this.f33070b.autoDismissTime;
            if (i10 > 0) {
                this.f33076h = i10;
                post(this.f33080m);
                this.f33077i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f33080m);
    }

    public void onPause() {
        if (!this.f33077i || this.f33076h <= 0) {
            return;
        }
        removeCallbacks(this.f33080m);
    }

    public void onResume() {
        if (!this.f33077i || this.f33076h <= 0) {
            return;
        }
        post(this.f33080m);
    }

    public void onStop() {
        if (!this.f33077i || this.f33076h <= 0) {
            return;
        }
        removeCallbacks(this.f33080m);
    }

    public void onTimeLessThanReduce(int i10) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        acquireRewardPopViewParameters.reduceTime = i10;
        TextView textView = this.f33079k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i10)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        linearLayout.setBackground(a(acquireRewardPopViewParameters.viewBackLayerTopColor, acquireRewardPopViewParameters.viewBackLayerBottomColor, acquireRewardPopViewParameters.viewForegroundTopColor, acquireRewardPopViewParameters.viewForegroundBottomColor));
        ImageView imageView = new ImageView(getContext());
        int iA = v0.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = 8388613;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.n().i()));
        imageView.setOnClickListener(this.f33084q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int iA2 = v0.a(getContext(), 18.0f);
        layoutParams3.setMargins(iA2, 5, iA2, v0.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f33070b.title);
        textView.setTextColor(this.f33070b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int iA3 = v0.a(getContext(), 8.0f);
            int iA4 = v0.a(getContext(), 24.0f);
            int iA5 = v0.a(getContext(), 30.0f);
            int iA6 = v0.a(getContext(), 12.0f);
            int iA7 = v0.a(getContext(), 40.0f);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                boolean zContains = this.f33070b.rightAnswerList.contains(arrayList.get(i10));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(iA5, iA6, iA5, 0);
                textView2.setPadding(iA4, iA3, iA4, iA3);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i10));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i10));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                textView2.setTextColor(zContains ? this.f33070b.buttonTextLightColor : this.f33070b.buttonTextDarkColor);
                textView2.setBackground(a(zContains ? this.f33070b.buttonBackgroundLightColor : this.f33070b.buttonBackgroundDarkColor, iA7));
                textView2.setOnClickListener(this.l);
                linearLayout.addView(textView2);
            }
        }
        this.f33079k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iA8 = v0.a(getContext(), 16.0f);
        int iA9 = v0.a(getContext(), 18.0f);
        layoutParams5.setMargins(iA9, iA8, iA9, iA8);
        layoutParams5.gravity = 1;
        this.f33079k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f33079k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f33070b;
        textView3.setText(String.format(acquireRewardPopViewParameters2.tips, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        this.f33079k.setTextColor(this.f33070b.tipTextColor);
        this.f33079k.setGravity(17);
        this.f33079k.setTextSize(12.0f);
        linearLayout.addView(this.f33079k);
        return linearLayout;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33069a = "MBAcquireRewardPopView";
        this.f33072d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33073e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33074f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33075g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f33070b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
            }
        };
        this.f33080m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f33076h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f33080m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f33077i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f33081n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f33077i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f33082o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f33072d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f33073e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f33074f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f33075g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f33074f <= MBAcquireRewardPopView.this.f33072d || Math.abs(MBAcquireRewardPopView.this.f33074f - MBAcquireRewardPopView.this.f33072d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f33075g - MBAcquireRewardPopView.this.f33073e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                } else {
                    if (MBAcquireRewardPopView.this.f33078j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                    MBAcquireRewardPopView.this.f33078j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
                }
                return false;
            }
        };
        this.f33083p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                }
            }
        };
        this.f33084q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f33077i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33069a = "MBAcquireRewardPopView";
        this.f33072d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33073e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33074f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33075g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f33070b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
            }
        };
        this.f33080m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f33076h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f33080m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f33077i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f33081n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f33077i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f33082o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f33072d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f33073e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f33074f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f33075g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f33074f <= MBAcquireRewardPopView.this.f33072d || Math.abs(MBAcquireRewardPopView.this.f33074f - MBAcquireRewardPopView.this.f33072d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f33075g - MBAcquireRewardPopView.this.f33073e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                } else {
                    if (MBAcquireRewardPopView.this.f33078j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                    MBAcquireRewardPopView.this.f33078j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
                }
                return false;
            }
        };
        this.f33083p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                }
            }
        };
        this.f33084q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f33077i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33069a = "MBAcquireRewardPopView";
        this.f33072d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33073e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33074f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33075g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f33070b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
            }
        };
        this.f33080m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f33076h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f33080m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f33077i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f33081n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f33077i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f33082o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f33072d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f33073e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f33074f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f33075g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f33074f <= MBAcquireRewardPopView.this.f33072d || Math.abs(MBAcquireRewardPopView.this.f33074f - MBAcquireRewardPopView.this.f33072d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f33075g - MBAcquireRewardPopView.this.f33073e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                } else {
                    if (MBAcquireRewardPopView.this.f33078j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33080m);
                    MBAcquireRewardPopView.this.f33078j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f33070b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f33081n, 2000L);
                }
                return false;
            }
        };
        this.f33083p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f33072d, MBAcquireRewardPopView.this.f33073e);
                }
            }
        };
        this.f33084q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f33070b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f33070b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f33077i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private LayerDrawable a(int i10, int i11, int i12, int i13) {
        int[] iArr = {i10, i11};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawableA = a(iArr, orientation);
        gradientDrawableA.setCornerRadius(v0.a(getContext(), 12.0f));
        GradientDrawable gradientDrawableA2 = a(new int[]{i12, i13}, orientation);
        gradientDrawableA2.setCornerRadius(v0.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableA, gradientDrawableA2});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        return layerDrawable;
    }

    private GradientDrawable a(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i11);
        return gradientDrawable;
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 0.8f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        this.f33071c = animationSet;
        animationSet.addAnimation(translateAnimation);
        this.f33071c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f33071c);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.f33071c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(this.f33071c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    private ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33070b;
        if (acquireRewardPopViewParameters != null) {
            List<String> list = acquireRewardPopViewParameters.rightAnswerList;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (this.f33070b.wrongAnswerList != null) {
                int iNextInt = new Random().nextInt(this.f33070b.wrongAnswerList.size());
                if (iNextInt > this.f33070b.wrongAnswerList.size() - 1) {
                    iNextInt = 0;
                }
                arrayList.add(this.f33070b.wrongAnswerList.get(iNextInt));
            }
        }
        return arrayList;
    }
}
