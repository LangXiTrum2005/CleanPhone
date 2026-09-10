package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class to extends mml {
    private qdl mml;
    private float mo;
    private float mzz;

    public class qdl {
        private View ud;

        public qdl(View view) {
            this.ud = view;
        }

        public void qdl(int i2) {
            if (!"top".equals(to.this.ud.qdl())) {
                ViewGroup.LayoutParams layoutParams = this.ud.getLayoutParams();
                layoutParams.height = i2;
                this.ud.setLayoutParams(layoutParams);
                this.ud.requestLayout();
                return;
            }
            if (to.this.lnr instanceof ViewGroup) {
                for (int i3 = 0; i3 < ((ViewGroup) to.this.lnr).getChildCount(); i3++) {
                    ((ViewGroup) to.this.lnr).getChildAt(i3).setTranslationY(i2 - to.this.mzz);
                }
            }
            to toVar = to.this;
            toVar.lnr.setTranslationY(toVar.mzz - i2);
        }
    }

    public to(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        int i2;
        String str;
        View view = this.lnr;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
            this.lnr = (View) this.lnr.getParent();
        }
        this.lnr.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "alpha", 0.0f, 1.0f).setDuration((int) (this.ud.to() * 1000.0d));
        this.mml = new qdl(this.lnr);
        final int i3 = this.lnr.getLayoutParams().height;
        this.mzz = i3;
        this.mo = this.lnr.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.ud.qdl()) || TtmlNode.RIGHT.equals(this.ud.qdl())) {
            i2 = (int) this.mo;
            str = "width";
        } else {
            str = "height";
            i2 = i3;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.mml, str, 0, i2).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.to.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                to.this.mml.qdl(i3);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z2) {
            }
        });
        return arrayList;
    }
}
