package com.smartdigimkt.r2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkTextView;
import com.smartdigimkt.expressad.video.module.AnythinkClickCTAView;
import com.smartdigimkt.expressad.video.widget.SoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38012a = "sdm_top_play_bg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38013b = "sdm_top_finger_bg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38014c = "sdm_bottom_play_bg";
    private String d = "sdm_bottom_finger_bg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38015e = "sdm_tv_count";
    private String f = "sdm_sound_switch";
    private String g = "sdm_top_control";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f38016h = "sdm_tv_title";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f38017i = "sdm_tv_desc";
    private String j = "sdm_tv_install";
    private String k = "sdm_sv_starlevel";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f38018l = "sdm_sv_heat_count_level";
    private String m = "sdm_tv_cta";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f38019n = "sdm_native_ec_controller";
    private String o = "sdm_reward_shape_choice_rl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f38020p = "#FFFFFF";
    private String q = "#FF000000";
    private String r = "#40000000";
    private String s = "#CAEF79";
    private String t = "#2196F3";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f38021u = "#402196F3";
    private String v = "#8FC31F";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f38022w = "#03A9F4";
    private String x = "#FF89C120";
    private String y = "#FF2BAE5D";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f38023z = false;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private void b(Context context, View view, com.smartdigimkt.c2.c cVar) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(b(this.f));
        int iA = v.a(context, 60.0f);
        int iA2 = v.a(context, 10.0f);
        if (soundImageView != null) {
            cVar.i();
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(iA2, 0, 0, iA);
        }
    }

    public void a(View view, com.smartdigimkt.c2.c cVar) {
    }

    public void a(View view, Map<String, Object> map) {
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            this.f38023z = false;
            ImageView imageView = (ImageView) view.findViewById(b(this.f38012a));
            ImageView imageView2 = (ImageView) view.findViewById(b(this.f38013b));
            ImageView imageView3 = (ImageView) view.findViewById(b(this.f38014c));
            ImageView imageView4 = (ImageView) view.findViewById(b(this.d));
            ObjectAnimator objectAnimatorC = imageView != null ? new com.smartdigimkt.l2.b().c(imageView) : null;
            ObjectAnimator objectAnimatorD = imageView2 != null ? new com.smartdigimkt.l2.b().d(imageView2) : null;
            ObjectAnimator objectAnimatorC2 = imageView3 != null ? new com.smartdigimkt.l2.b().c(imageView3) : null;
            ObjectAnimator objectAnimatorD2 = imageView4 != null ? new com.smartdigimkt.l2.b().d(imageView4) : null;
            if (objectAnimatorC == null || objectAnimatorC2 == null || objectAnimatorD == null || objectAnimatorD2 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimatorC, objectAnimatorC2, objectAnimatorD, objectAnimatorD2);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public void b(View view, com.smartdigimkt.c2.c cVar) {
        Context context;
        int iA;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.i() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(k.a(context, this.o, k.d)));
            TextView textView = (TextView) view.findViewById(b(this.f38016h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.q));
            }
            TextView textView2 = (TextView) view.findViewById(b(this.f38017i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.q));
            }
            iA = v.a(context, 2.0f);
        } else {
            iA = v.a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int iA2 = v.a(context, 8.0f);
        View viewFindViewById = view.findViewById(b(this.j));
        if (viewFindViewById != null) {
            if (cVar.j() != null && (cVar.j() instanceof AnythinkClickCTAView)) {
                ((AnythinkClickCTAView) cVar.j()).setObjectAnimator(new com.smartdigimkt.l2.b().a(viewFindViewById));
            }
            if (viewFindViewById instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTextColor(Color.parseColor(this.f38020p));
                textView3.setTextSize(15.0f);
                String str = this.v;
                String str2 = this.s;
                com.smartdigimkt.o2.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iA, iA, iA, iA2);
            layoutParams.height = v.a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    public void a(View view, com.smartdigimkt.c2.c cVar, Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        float f;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        this.f38023z = false;
        TextView textView = (TextView) view.findViewById(b(this.f38015e));
        TextView textView2 = (TextView) view.findViewById(b("sdm_reward_click_tv"));
        if (textView != null) {
            textView.setBackgroundResource(k.a(context, "sdm_reward_shape_progress", k.d));
            textView.setTextColor(Color.parseColor(this.f38020p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof AnyThinkTextView) {
                ((AnyThinkTextView) textView2).setObjectAnimator(new com.smartdigimkt.l2.b().a(textView2));
            }
        }
        String str4 = this.q;
        String str5 = this.s;
        int iM = cVar.m();
        float f2 = 10.0f;
        if (iM == 302) {
            str = this.t;
            str2 = this.f38022w;
            str4 = this.f38020p;
            str5 = this.f38021u;
        } else {
            if (iM == 802) {
                str = this.f38020p;
                str4 = this.q;
                f2 = 25.0f;
                str3 = this.r;
                f = 0.5f;
                str2 = str;
            } else if (iM != 5002010) {
                str = this.v;
                str2 = this.s;
                f2 = 5.0f;
            } else {
                String str6 = this.v;
                str4 = this.f38020p;
                str = str6;
                str2 = str;
                f = 1.0f;
                str3 = str2;
            }
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(str4));
                com.smartdigimkt.o2.a.a(textView2, f, f2, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
            if (cVar.j() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.j().getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 0);
                cVar.j().setLayoutParams(layoutParams);
            }
            a(view);
        }
        str3 = str5;
        f = 1.0f;
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str4));
            com.smartdigimkt.o2.a.a(textView2, f, f2, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.j() != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cVar.j().getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, 0);
            cVar.j().setLayoutParams(layoutParams2);
        }
        a(view);
    }

    public void b(View view, com.smartdigimkt.c2.c cVar, Map<String, Object> map) {
        if (view == null || cVar == null) {
            return;
        }
        Context context = view.getContext();
        if (context != null) {
            this.f38023z = false;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(b(this.k));
            View viewFindViewById = view.findViewById(b(this.m));
            if (linearLayout != null && (linearLayout instanceof AnyThinkLevelLayoutView)) {
                if (cVar.i() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            a(context, view, cVar);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    textView.setTextColor(Color.parseColor(this.f38020p));
                    textView.setTextSize(22.0f);
                    com.smartdigimkt.o2.a.a(viewFindViewById, 1.0f, cVar.m() == 1302 ? 25 : 5, this.s, new String[]{this.x, this.y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                int iM = cVar.m();
                if (iM == 404 || iM == 704 || iM == 1402) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new com.smartdigimkt.l2.b().a(viewFindViewById));
                    animatorSet.addListener(new a());
                    if (view instanceof AnyThinkFramLayout) {
                        ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof AnyThinkRelativeLayout) {
                        ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
        }
        new com.smartdigimkt.l2.b().a(view, 500L);
    }

    private void a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(b(this.g));
        if (relativeLayout != null) {
            if (com.smartdigimkt.d2.b.f34419a == 0 && com.smartdigimkt.d2.b.f34420b == 0 && com.smartdigimkt.d2.b.f34421c == 0 && com.smartdigimkt.d2.b.d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void a(Context context, View view, com.smartdigimkt.c2.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(b(this.f38019n));
        if (relativeLayout != null) {
            if (cVar.i() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + com.smartdigimkt.d2.b.f34419a, layoutParams.topMargin + com.smartdigimkt.d2.b.f34421c, layoutParams.rightMargin + com.smartdigimkt.d2.b.f34420b, layoutParams.bottomMargin + com.smartdigimkt.d2.b.d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + com.smartdigimkt.d2.b.f34419a, layoutParams2.topMargin + com.smartdigimkt.d2.b.f34421c, layoutParams2.rightMargin + com.smartdigimkt.d2.b.f34420b, layoutParams2.bottomMargin + com.smartdigimkt.d2.b.d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    public int b(String str) {
        return k.a(com.smartdigimkt.m6.b.p().k(), str, "id");
    }

    public int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }
}
