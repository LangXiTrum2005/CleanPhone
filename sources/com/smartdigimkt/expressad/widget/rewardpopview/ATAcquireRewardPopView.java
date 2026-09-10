package com.smartdigimkt.expressad.widget.rewardpopview;

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
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class ATAcquireRewardPopView extends RelativeLayout {
    private final String e0;
    private com.smartdigimkt.i3.c f0;
    private AnimationSet g0;
    private float h0;
    private float i0;
    private float j0;
    private float k0;
    private int l0;
    private boolean m0;
    private boolean n0;
    private TextView o0;
    private final View.OnClickListener p0;
    private Runnable q0;
    private Runnable r0;
    private View.OnTouchListener s0;
    private final View.OnClickListener t0;
    private final View.OnClickListener u0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ATAcquireRewardPopView.this.f0.T != null) {
                ATAcquireRewardPopView.this.f0.T.a("Close view clicked");
            }
            ATAcquireRewardPopView.this.m0 = false;
            ATAcquireRewardPopView.this.setVisibility(8);
            ATAcquireRewardPopView.this.removeAllViews();
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ATAcquireRewardPopView.this.a(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (ATAcquireRewardPopView.this.g0 != null) {
                ATAcquireRewardPopView.this.g0.cancel();
            }
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ATAcquireRewardPopView.this.setLongClickable(true);
            ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
            aTAcquireRewardPopView.setOnTouchListener(aTAcquireRewardPopView.s0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34937a;

        public d(View view) {
            this.f34937a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f34937a.startAnimation(ATAcquireRewardPopView.this.g0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f34940b;

        public e(View view, AlphaAnimation alphaAnimation) {
            this.f34939a = view;
            this.f34940b = alphaAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f34939a.startAnimation(this.f34940b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
            aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.q0);
            String str = (String) view.getTag();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            boolean zContains = ATAcquireRewardPopView.this.f0.q.contains(str);
            View rightAnswerView = zContains ? ATAcquireRewardPopView.this.getRightAnswerView() : ATAcquireRewardPopView.this.getWrongAnswerView();
            View childAt = ATAcquireRewardPopView.this.getChildAt(0);
            if (childAt != null) {
                ATAcquireRewardPopView.this.a(childAt, rightAnswerView);
            }
            if (ATAcquireRewardPopView.this.f0.T != null) {
                if (zContains) {
                    ATAcquireRewardPopView.this.f0.T.a(ATAcquireRewardPopView.this.f0.f35824e);
                } else {
                    ATAcquireRewardPopView.this.f0.T.a("Clicked wrong answer");
                }
            }
            ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
            aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.r0, 2000L);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATAcquireRewardPopView.this.l0 > 0) {
                ATAcquireRewardPopView.n(ATAcquireRewardPopView.this);
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.postDelayed(aTAcquireRewardPopView.q0, 1000L);
            } else {
                if (ATAcquireRewardPopView.this.f0.T != null) {
                    ATAcquireRewardPopView.this.f0.T.a("Auto dismissed");
                }
                ATAcquireRewardPopView.this.m0 = false;
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }
        }
    }

    public class h implements Runnable {

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ATAcquireRewardPopView.this.m0 = false;
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.0f, 300L);
            alphaAnimationE.setAnimationListener(new a());
            ATAcquireRewardPopView.this.startAnimation(alphaAnimationE);
        }
    }

    public class i implements View.OnTouchListener {
        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                ATAcquireRewardPopView.this.h0 = motionEvent.getX();
                ATAcquireRewardPopView.this.i0 = motionEvent.getY();
            } else if (action != 1) {
                if (action == 2) {
                    ATAcquireRewardPopView.this.j0 = motionEvent.getX();
                    ATAcquireRewardPopView.this.k0 = motionEvent.getY();
                }
            } else if (ATAcquireRewardPopView.this.j0 <= ATAcquireRewardPopView.this.h0 || Math.abs(ATAcquireRewardPopView.this.j0 - ATAcquireRewardPopView.this.h0) <= 50.0f || Math.abs(ATAcquireRewardPopView.this.k0 - ATAcquireRewardPopView.this.i0) >= 100.0f) {
                ATAcquireRewardPopView.this.f0.T.a(ATAcquireRewardPopView.this.h0, ATAcquireRewardPopView.this.i0);
            } else {
                if (ATAcquireRewardPopView.this.n0) {
                    return false;
                }
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.q0);
                ATAcquireRewardPopView.this.n0 = true;
                View rightAnswerView = ATAcquireRewardPopView.this.getRightAnswerView();
                View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    ATAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (ATAcquireRewardPopView.this.f0.T != null) {
                    ATAcquireRewardPopView.this.f0.T.a(ATAcquireRewardPopView.this.f0.f35824e);
                }
                ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.r0, 2000L);
            }
            return false;
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ATAcquireRewardPopView.this.f0.T != null) {
                ATAcquireRewardPopView.this.f0.T.a(ATAcquireRewardPopView.this.h0, ATAcquireRewardPopView.this.i0);
            }
        }
    }

    public ATAcquireRewardPopView(Context context) {
        super(context);
        this.e0 = "ATAcquireRewardPopView";
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.p0 = new f();
        this.q0 = new g();
        this.r0 = new h();
        this.s0 = new i();
        this.t0 = new j();
        this.u0 = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        String str;
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        com.smartdigimkt.i3.c cVar = this.f0;
        aVar.f34944a = cVar.f35814F;
        aVar.f34945b = cVar.G;
        aVar.f34946c = cVar.H;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        com.smartdigimkt.i3.c cVar2 = this.f0;
        int i2 = cVar2.f35823c;
        if (i2 == 1) {
            str = cVar2.j;
        } else {
            str = i2 == 2 ? cVar2.f35829p : "";
        }
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setText(" " + str + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{16626264, -1860022, -1860022, 15968336}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f0.C);
        com.smartdigimkt.i3.c cVar3 = this.f0;
        textView.setText(String.format(cVar3.k, Integer.valueOf(cVar3.f35824e)));
        int iA = v.a(getContext(), 6.0f);
        int iA2 = v.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackgroundDrawable(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private View getSlidePopView() {
        int iA = v.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        com.smartdigimkt.i3.c cVar = this.f0;
        aVar.f34944a = cVar.f35814F;
        aVar.f34945b = cVar.G;
        aVar.f34946c = cVar.H;
        aVar.d = 30;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        aTGradientAndShadowTextView.setText(" " + this.f0.f35828n + " ");
        aTGradientAndShadowTextView.setGravity(17);
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{16626264, -1860022, -1860022, 15968336}, GradientDrawable.Orientation.LEFT_RIGHT);
        this.o0 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, v.a(getContext(), 25.0f));
        this.o0.setLayoutParams(layoutParams3);
        this.o0.setTextSize(12.0f);
        this.o0.setGravity(17);
        this.o0.setTextColor(this.f0.C);
        TextView textView = this.o0;
        com.smartdigimkt.i3.c cVar2 = this.f0;
        textView.setText(String.format(cVar2.o, Integer.valueOf(cVar2.f35824e)));
        int iA2 = v.a(getContext(), 6.0f);
        int iA3 = v.a(getContext(), 32.0f);
        this.o0.setPadding(iA3, iA2, iA3, iA2);
        this.o0.setBackgroundDrawable(gradientDrawableA);
        linearLayout.addView(this.o0);
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        imageView.setLayoutParams(layoutParams4);
        imageView.setBackgroundResource(getResources().getIdentifier("sdm_slide_rightarrow", k.d, com.smartdigimkt.u.a.f().g()));
        linearLayout.addView(imageView);
        View imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView2.setBackgroundResource(getResources().getIdentifier("sdm_slide_hand", k.d, com.smartdigimkt.u.a.f().g()));
        linearLayout.addView(imageView2);
        imageView2.addOnAttachStateChangeListener(new b());
        linearLayout.addOnAttachStateChangeListener(new c());
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        com.smartdigimkt.i3.c cVar = this.f0;
        aVar.f34944a = cVar.M;
        aVar.f34945b = cVar.f35817N;
        aVar.f34946c = cVar.O;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        aTGradientAndShadowTextView.setText(" " + this.f0.f35827l + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{11573888, -5203328, -5203328, 11573888}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f0.D);
        textView.setText(String.format(this.f0.m, ""));
        int iA = v.a(getContext(), 6.0f);
        int iA2 = v.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackgroundDrawable(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ int n(ATAcquireRewardPopView aTAcquireRewardPopView) {
        int i2 = aTAcquireRewardPopView.l0;
        aTAcquireRewardPopView.l0 = i2 - 1;
        return i2;
    }

    public void init(com.smartdigimkt.i3.c cVar) {
        View slidePopView;
        if (cVar == null) {
            return;
        }
        this.f0 = cVar;
        if (cVar.f35823c == 1) {
            slidePopView = a(a());
            if (this.f0.f) {
                setOnClickListener(this.t0);
            }
        } else {
            slidePopView = null;
        }
        if (this.f0.f35823c == 2) {
            slidePopView = getSlidePopView();
        }
        if (slidePopView != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f0.f35813E);
            addView(slidePopView);
            int i2 = this.f0.d;
            if (i2 > 0) {
                this.l0 = i2;
                post(this.q0);
                this.m0 = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.q0);
    }

    public void onPause() {
        if (!this.m0 || this.l0 <= 0) {
            return;
        }
        removeCallbacks(this.q0);
    }

    public void onResume() {
        if (!this.m0 || this.l0 <= 0) {
            return;
        }
        post(this.q0);
    }

    public void onStop() {
        if (!this.m0 || this.l0 <= 0) {
            return;
        }
        removeCallbacks(this.q0);
    }

    public void onTimeLessThanReduce(int i2) {
        com.smartdigimkt.i3.c cVar = this.f0;
        cVar.f35824e = i2;
        TextView textView = this.o0;
        if (textView != null) {
            textView.setText(String.format(cVar.f35826i, Integer.valueOf(i2)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        com.smartdigimkt.i3.c cVar = this.f0;
        linearLayout.setBackgroundDrawable(a(cVar.s, cVar.t, cVar.f35830u, cVar.v));
        ImageView imageView = new ImageView(getContext());
        int iA = v.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = 8388613;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("sdm_reward_popview_close", k.d, com.smartdigimkt.u.a.f().g()));
        imageView.setOnClickListener(this.u0);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int iA2 = v.a(getContext(), 18.0f);
        layoutParams3.setMargins(iA2, 5, iA2, v.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f0.f35825h);
        textView.setTextColor(this.f0.y);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int iA3 = v.a(getContext(), 8.0f);
            int iA4 = v.a(getContext(), 24.0f);
            int iA5 = v.a(getContext(), 30.0f);
            int iA6 = v.a(getContext(), 12.0f);
            int iA7 = v.a(getContext(), 40.0f);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                boolean zContains = this.f0.q.contains(arrayList.get(i2));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(iA5, iA6, iA5, 0);
                textView2.setPadding(iA4, iA3, iA4, iA3);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i2));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i2));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                textView2.setTextColor(zContains ? this.f0.f35811A : this.f0.f35812B);
                textView2.setBackgroundDrawable(a(zContains ? this.f0.f35831w : this.f0.x, iA7));
                textView2.setOnClickListener(this.p0);
                linearLayout.addView(textView2);
            }
        }
        this.o0 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iA8 = v.a(getContext(), 16.0f);
        int iA9 = v.a(getContext(), 18.0f);
        layoutParams5.setMargins(iA9, iA8, iA9, iA8);
        layoutParams5.gravity = 1;
        this.o0.setLayoutParams(layoutParams5);
        TextView textView3 = this.o0;
        com.smartdigimkt.i3.c cVar2 = this.f0;
        textView3.setText(String.format(cVar2.f35826i, Integer.valueOf(cVar2.f35824e)));
        this.o0.setTextColor(this.f0.f35832z);
        this.o0.setGravity(17);
        this.o0.setTextSize(12.0f);
        linearLayout.addView(this.o0);
        return linearLayout;
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = "ATAcquireRewardPopView";
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.p0 = new f();
        this.q0 = new g();
        this.r0 = new h();
        this.s0 = new i();
        this.t0 = new j();
        this.u0 = new a();
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = "ATAcquireRewardPopView";
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.p0 = new f();
        this.q0 = new g();
        this.r0 = new h();
        this.s0 = new i();
        this.t0 = new j();
        this.u0 = new a();
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.e0 = "ATAcquireRewardPopView";
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.p0 = new f();
        this.q0 = new g();
        this.r0 = new h();
        this.s0 = new i();
        this.t0 = new j();
        this.u0 = new a();
    }

    private LayerDrawable a(int i2, int i3, int i4, int i5) {
        int[] iArr = {i2, i3};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawableA = a(iArr, orientation);
        gradientDrawableA.setCornerRadius(v.a(getContext(), 12.0f));
        GradientDrawable gradientDrawableA2 = a(new int[]{i4, i5}, orientation);
        gradientDrawableA2.setCornerRadius(v.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableA, gradientDrawableA2});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        return layerDrawable;
    }

    private GradientDrawable a(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i3);
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
    public void a(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        this.g0 = animationSet;
        animationSet.addAnimation(translateAnimation);
        this.g0.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new d(view));
        this.g0.setAnimationListener(new e(view, alphaAnimation2));
        view.startAnimation(this.g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    private ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        com.smartdigimkt.i3.c cVar = this.f0;
        if (cVar != null) {
            List<String> list = cVar.q;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (this.f0.r != null) {
                int iNextInt = new Random().nextInt(this.f0.r.size());
                if (iNextInt > this.f0.r.size() - 1) {
                    iNextInt = 0;
                }
                arrayList.add(this.f0.r.get(iNextInt));
            }
        }
        return arrayList;
    }
}
