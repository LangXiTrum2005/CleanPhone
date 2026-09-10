package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class jl {
    private boolean fs;
    private ImageView jpc;
    private final ljh mo;
    private final RelativeLayout mzz;
    bjy qdl;
    private com.bytedance.sdk.openadsdk.core.mo.mo to;
    private TextView tvp;
    TTAdDislikeToast ud;
    private final Context wd;
    final AtomicBoolean lnr = new AtomicBoolean(false);
    final AtomicBoolean mml = new AtomicBoolean(false);
    private final int rq = ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 44.0f);

    public jl(Context context, RelativeLayout relativeLayout, ljh ljhVar) {
        this.wd = context;
        this.mzz = relativeLayout;
        this.mo = ljhVar;
        mzz();
    }

    private void mo() {
        try {
            if (this.qdl == null) {
                bjy bjyVar = new bjy(this.wd, this.mo);
                this.qdl = bjyVar;
                bjyVar.setDislikeSource("landing_page");
                this.qdl.setCallback(new bjy.qdl() { // from class: com.bytedance.sdk.openadsdk.common.jl.6
                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(View view) {
                        jl.this.lnr.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void ud(View view) {
                        jl.this.lnr.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(FilterWord filterWord) {
                        if (jl.this.mml.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        jl.this.mml.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.mzz.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.qdl);
            if (this.ud == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.wd);
                this.ud = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void mzz() {
        this.jpc = (ImageView) this.mzz.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.ijp);
        this.tvp = (TextView) this.mzz.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.zy);
        ImageView imageView = (ImageView) this.mzz.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.en);
        this.to = (com.bytedance.sdk.openadsdk.core.mo.mo) this.mzz.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.nz);
        ljh ljhVar = this.mo;
        if (ljhVar != null) {
            this.tvp.setText(TextUtils.isEmpty(ljhVar.gsv()) ? com.bytedance.sdk.component.utils.ljh.qdl(this.wd, "tt_web_title_default") : this.mo.gsv());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jl.this.mml();
            }
        });
    }

    private void wd() {
        this.ud.show(TTAdDislikeToast.getDislikeTip());
    }

    public ImageView lnr() {
        return this.jpc;
    }

    public void mml() {
        if (this.mml.get()) {
            wd();
            return;
        }
        if (this.qdl == null) {
            mo();
        }
        bjy bjyVar = this.qdl;
        if (bjyVar != null) {
            bjyVar.qdl();
        }
    }

    public void ud() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mzz.getLayoutParams();
            if (this.fs || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -this.rq);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.jl.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    jl.this.mzz.setLayoutParams(marginLayoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.jl.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    jl.this.fs = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    jl.this.fs = true;
                }
            });
            valueAnimatorOfInt.start();
        } catch (Throwable unused) {
        }
    }

    public void qdl(int i2) {
        if (i2 == 100) {
            this.to.setVisibility(8);
        } else {
            this.to.setVisibility(0);
            this.to.setProgress(i2);
        }
    }

    public void qdl() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mzz.getLayoutParams();
            if (this.fs) {
                return;
            }
            int i2 = marginLayoutParams.topMargin;
            int i3 = this.rq;
            if (i2 == (-i3)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i3, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.jl.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        jl.this.mzz.setLayoutParams(marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.jl.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        jl.this.fs = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        jl.this.fs = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
