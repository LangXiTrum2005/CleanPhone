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
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class brP {
    private final RelativeLayout JXs;
    TTAdDislikeToast LD;
    IeN Lxb;
    private ImageView OY;
    private TextView QAg;
    private final Context ebl;
    private final tD lc;
    private com.bytedance.sdk.openadsdk.core.JXs.lc nBu;
    private boolean sLN;
    final AtomicBoolean lk = new AtomicBoolean(false);
    final AtomicBoolean ZU = new AtomicBoolean(false);
    private final int JVA = le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 44.0f);

    public brP(Context context, RelativeLayout relativeLayout, tD tDVar) {
        this.ebl = context;
        this.JXs = relativeLayout;
        this.lc = tDVar;
        JXs();
    }

    private void JXs() {
        this.OY = (ImageView) this.JXs.findViewById(com.bytedance.sdk.openadsdk.utils.STP.bG);
        this.QAg = (TextView) this.JXs.findViewById(com.bytedance.sdk.openadsdk.utils.STP.jeq);
        ImageView imageView = (ImageView) this.JXs.findViewById(com.bytedance.sdk.openadsdk.utils.STP.MGT);
        this.nBu = (com.bytedance.sdk.openadsdk.core.JXs.lc) this.JXs.findViewById(com.bytedance.sdk.openadsdk.utils.STP.nTb);
        tD tDVar = this.lc;
        if (tDVar != null) {
            this.QAg.setText(TextUtils.isEmpty(tDVar.FD()) ? com.bytedance.sdk.component.utils.tD.Lxb(this.ebl, "tt_web_title_default") : this.lc.FD());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.brP.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                brP.this.ZU();
            }
        });
    }

    private void ebl() {
        this.LD.show(TTAdDislikeToast.getDislikeTip());
    }

    private void lc() {
        try {
            if (this.Lxb == null) {
                IeN ieN = new IeN(this.ebl, this.lc);
                this.Lxb = ieN;
                ieN.setDislikeSource("landing_page");
                this.Lxb.setCallback(new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.common.brP.6
                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void LD(View view) {
                        brP.this.lk.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(View view) {
                        brP.this.lk.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(FilterWord filterWord) {
                        if (brP.this.ZU.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        brP.this.ZU.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.JXs.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.Lxb);
            if (this.LD == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.ebl);
                this.LD = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    public void LD() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.JXs.getLayoutParams();
            if (this.sLN || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -this.JVA);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.brP.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    brP.this.JXs.setLayoutParams(marginLayoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.brP.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    brP.this.sLN = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    brP.this.sLN = true;
                }
            });
            valueAnimatorOfInt.start();
        } catch (Throwable unused) {
        }
    }

    public void ZU() {
        if (this.ZU.get()) {
            ebl();
            return;
        }
        if (this.Lxb == null) {
            lc();
        }
        IeN ieN = this.Lxb;
        if (ieN != null) {
            ieN.Lxb();
        }
    }

    public ImageView lk() {
        return this.OY;
    }

    public void Lxb(int i) {
        if (i == 100) {
            this.nBu.setVisibility(8);
        } else {
            this.nBu.setVisibility(0);
            this.nBu.setProgress(i);
        }
    }

    public void Lxb() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.JXs.getLayoutParams();
            if (this.sLN) {
                return;
            }
            int i = marginLayoutParams.topMargin;
            int i2 = this.JVA;
            if (i == (-i2)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i2, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.brP.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        brP.this.JXs.setLayoutParams(marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.brP.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        brP.this.sLN = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        brP.this.sLN = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
