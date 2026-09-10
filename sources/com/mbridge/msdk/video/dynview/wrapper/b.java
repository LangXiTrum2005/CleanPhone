package com.mbridge.msdk.video.dynview.wrapper;

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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37532a = "mbridge_top_play_bg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37533b = "mbridge_top_finger_bg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37534c = "mbridge_bottom_play_bg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37535d = "mbridge_bottom_finger_bg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37536e = "mbridge_tv_count";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37537f = "mbridge_sound_switch";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37538g = "mbridge_top_control";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37539h = "mbridge_tv_title";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37540i = "mbridge_tv_desc";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37541j = "mbridge_tv_install";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f37542k = "mbridge_sv_starlevel";
    private String l = "mbridge_sv_heat_count_level";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f37543m = "mbridge_tv_cta";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37544n = "mbridge_native_ec_controller";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f37545o = "mbridge_reward_shape_choice_rl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f37546p = "#FFFFFF";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f37547q = "#FF000000";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f37548r = "#40000000";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f37549s = "#CAEF79";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f37550t = "#2196F3";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f37551u = "#402196F3";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f37552v = "#8FC31F";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f37553w = "#03A9F4";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f37554x = "#FF89C120";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f37555y = "#FF2BAE5D";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37556z = false;

    public void a(View view, com.mbridge.msdk.video.dynview.c cVar) {
    }

    public void b(View view, com.mbridge.msdk.video.dynview.c cVar) {
        Context context;
        int iA;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.h() == 1) {
            view.setBackground(context.getResources().getDrawable(i0.a(context, this.f37545o, "drawable")));
            TextView textView = (TextView) view.findViewById(b(this.f37539h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f37547q));
            }
            TextView textView2 = (TextView) view.findViewById(b(this.f37540i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f37547q));
            }
            iA = v0.a(context, 2.0f);
        } else {
            iA = v0.a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int iA2 = v0.a(context, 8.0f);
        View viewFindViewById = view.findViewById(b(this.f37541j));
        if (viewFindViewById != null) {
            if (cVar.i() != null && (cVar.i() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) cVar.i()).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(viewFindViewById));
            }
            if (viewFindViewById instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTextColor(Color.parseColor(this.f37546p));
                textView3.setTextSize(15.0f);
                String str = this.f37552v;
                String str2 = this.f37549s;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iA, iA, iA, iA2);
            layoutParams.height = v0.a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public void a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f37556z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f37556z) {
                imageView = (ImageView) view.findViewById(a(this.f37532a));
                imageView2 = (ImageView) view.findViewById(a(this.f37533b));
                imageView3 = (ImageView) view.findViewById(a(this.f37534c));
                imageView4 = (ImageView) view.findViewById(a(this.f37535d));
            } else {
                imageView = (ImageView) view.findViewById(b(this.f37532a));
                imageView2 = (ImageView) view.findViewById(b(this.f37533b));
                imageView3 = (ImageView) view.findViewById(b(this.f37534c));
                imageView4 = (ImageView) view.findViewById(b(this.f37535d));
            }
            ObjectAnimator objectAnimatorB = imageView != null ? new com.mbridge.msdk.video.dynview.ui.b().b(imageView) : null;
            ObjectAnimator objectAnimatorC = imageView2 != null ? new com.mbridge.msdk.video.dynview.ui.b().c(imageView2) : null;
            ObjectAnimator objectAnimatorB2 = imageView3 != null ? new com.mbridge.msdk.video.dynview.ui.b().b(imageView3) : null;
            ObjectAnimator objectAnimatorC2 = imageView4 != null ? new com.mbridge.msdk.video.dynview.ui.b().c(imageView4) : null;
            if (objectAnimatorB == null || objectAnimatorB2 == null || objectAnimatorC == null || objectAnimatorC2 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimatorB, objectAnimatorB2, objectAnimatorC, objectAnimatorC2);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    public void a(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        String str3;
        float f10;
        RelativeLayout.LayoutParams layoutParams;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            boolean zBooleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
            this.f37556z = zBooleanValue;
            if (zBooleanValue) {
                textView = (TextView) view.findViewById(a(this.f37536e));
                textView2 = (TextView) view.findViewById(a("mbridge_reward_click_tv"));
            } else {
                textView = (TextView) view.findViewById(b(this.f37536e));
                textView2 = (TextView) view.findViewById(b("mbridge_reward_click_tv"));
            }
        } else {
            textView = (TextView) view.findViewById(b(this.f37536e));
            textView2 = (TextView) view.findViewById(b("mbridge_reward_click_tv"));
        }
        if (textView != null) {
            textView.setBackgroundResource(i0.a(context, "mbridge_reward_shape_progress", "drawable"));
            textView.setTextColor(Color.parseColor(this.f37546p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof MBridgeTextView) {
                ((MBridgeTextView) textView2).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(textView2));
            }
            if (textView2 instanceof MBTextView) {
                ((MBTextView) textView2).setAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(textView2));
            }
        }
        String str4 = this.f37547q;
        String str5 = this.f37549s;
        int iL = cVar.l();
        float f11 = 10.0f;
        float f12 = 1.0f;
        if (iL == 302) {
            str = this.f37550t;
            str2 = this.f37553w;
            str4 = this.f37546p;
            str5 = this.f37551u;
        } else {
            if (iL == 802) {
                str = this.f37546p;
                str4 = this.f37547q;
                f12 = 0.5f;
                str3 = this.f37548r;
                f10 = 25.0f;
                str2 = str;
            } else if (iL != 5002010) {
                str = this.f37552v;
                str2 = this.f37549s;
                f11 = 5.0f;
            } else {
                String str6 = this.f37552v;
                str4 = this.f37546p;
                str = str6;
                str2 = str;
                f10 = 10.0f;
                str3 = str2;
            }
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(str4));
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView2, f12, f10, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
            if (cVar.i() != null && (layoutParams = (RelativeLayout.LayoutParams) cVar.i().getLayoutParams()) != null) {
                layoutParams.setMargins(0, 0, 0, 0);
                cVar.i().setLayoutParams(layoutParams);
            }
            a(view);
        }
        float f13 = f11;
        str3 = str5;
        f10 = f13;
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str4));
            com.mbridge.msdk.video.dynview.util.drawable.a.a(textView2, f12, f10, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.i() != null) {
            layoutParams.setMargins(0, 0, 0, 0);
            cVar.i().setLayoutParams(layoutParams);
        }
        a(view);
    }

    public void b(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        LinearLayout linearLayout;
        View viewFindViewById;
        if (view == null || cVar == null) {
            return;
        }
        Context context = view.getContext();
        if (context != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f37556z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f37556z) {
                linearLayout = (LinearLayout) view.findViewById(a(this.f37542k));
                viewFindViewById = view.findViewById(a(this.f37543m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(b(this.f37542k));
                viewFindViewById = view.findViewById(b(this.f37543m));
            }
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (cVar.h() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            a(context, view, cVar);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    textView.setTextColor(Color.parseColor(this.f37546p));
                    textView.setTextSize(22.0f);
                    com.mbridge.msdk.video.dynview.util.drawable.a.a(viewFindViewById, 1.0f, cVar.l() == 1302 ? 25 : 5, this.f37549s, new String[]{this.f37554x, this.f37555y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                try {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new com.mbridge.msdk.video.dynview.ui.b().a(viewFindViewById));
                    animatorSet.addListener(new a());
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(view, 500L);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
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

    public int b(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }

    private void a(View view) {
        RelativeLayout relativeLayout;
        if (this.f37556z) {
            relativeLayout = (RelativeLayout) view.findViewById(a(this.f37538g));
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(b(this.f37538g));
        }
        if (relativeLayout != null) {
            if (com.mbridge.msdk.video.dynview.constant.a.f37341a == 0 && com.mbridge.msdk.video.dynview.constant.a.f37342b == 0 && com.mbridge.msdk.video.dynview.constant.a.f37343c == 0 && com.mbridge.msdk.video.dynview.constant.a.f37344d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void a(Context context, View view, com.mbridge.msdk.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(b(this.f37544n));
        if (relativeLayout != null) {
            if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin + com.mbridge.msdk.video.dynview.constant.a.f37341a, layoutParams.topMargin + com.mbridge.msdk.video.dynview.constant.a.f37343c, layoutParams.rightMargin + com.mbridge.msdk.video.dynview.constant.a.f37342b, layoutParams.bottomMargin + com.mbridge.msdk.video.dynview.constant.a.f37344d);
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams2.setMargins(layoutParams2.leftMargin + com.mbridge.msdk.video.dynview.constant.a.f37341a, layoutParams2.topMargin + com.mbridge.msdk.video.dynview.constant.a.f37343c, layoutParams2.rightMargin + com.mbridge.msdk.video.dynview.constant.a.f37342b, layoutParams2.bottomMargin + com.mbridge.msdk.video.dynview.constant.a.f37344d);
                relativeLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    public int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }
}
