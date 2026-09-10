package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f32613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f32614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f32615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f32619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f32620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f32621k;
    private View.OnTouchListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View.OnClickListener f32622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f32623n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f32620j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f32616f <= 0) {
                MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f32620j, 1000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.f32612b = motionEvent.getX();
                MBAcquireRewardPopView.this.f32613c = motionEvent.getY();
            } else {
                if (action == 1) {
                    if (MBAcquireRewardPopView.this.f32614d <= MBAcquireRewardPopView.this.f32612b) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (Math.abs(MBAcquireRewardPopView.this.f32614d - MBAcquireRewardPopView.this.f32612b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f32615e - MBAcquireRewardPopView.this.f32613c) >= 100.0f) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.f32618h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f32620j);
                    MBAcquireRewardPopView.this.f32618h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.f32614d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f32615e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32611a = "MBAcquireRewardPopView";
        this.f32612b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32613c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32614d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32615e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32619i = new b();
        this.f32620j = new c();
        this.f32621k = new d();
        this.l = new e();
        this.f32622m = new f();
        this.f32623n = new a();
    }

    public static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    public static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f32616f;
        mBAcquireRewardPopView.f32616f = i10 - 1;
        return i10;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f32620j);
    }

    public void onPause() {
        if (!this.f32617g || this.f32616f <= 0) {
            return;
        }
        removeCallbacks(this.f32620j);
    }

    public void onResume() {
        if (!this.f32617g || this.f32616f <= 0) {
            return;
        }
        post(this.f32620j);
    }

    public void onStop() {
        if (!this.f32617g || this.f32616f <= 0) {
            return;
        }
        removeCallbacks(this.f32620j);
    }

    public void onTimeLessThanReduce(int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.f32617g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }
    }
}
