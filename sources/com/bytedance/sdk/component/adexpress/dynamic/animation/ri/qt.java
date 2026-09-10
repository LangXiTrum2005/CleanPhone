package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends ka {
    private float di;
    private float fi;
    private ri ka;

    public class ri {
        private View lr;

        public ri(View view) {
            this.lr = view;
        }

        public void ri(int i) {
            if (!"top".equals(qt.this.lr.ri())) {
                ViewGroup.LayoutParams layoutParams = this.lr.getLayoutParams();
                layoutParams.height = i;
                this.lr.setLayoutParams(layoutParams);
                this.lr.requestLayout();
                return;
            }
            if (qt.this.ik instanceof ViewGroup) {
                for (int i2 = 0; i2 < ((ViewGroup) qt.this.ik).getChildCount(); i2++) {
                    ((ViewGroup) qt.this.ik).getChildAt(i2).setTranslationY(i - qt.this.fi);
                }
            }
            qt qtVar = qt.this;
            qtVar.ik.setTranslationY(qtVar.fi - i);
        }
    }

    public qt(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        int i;
        String str;
        View view = this.ik;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi)) {
            this.ik = (View) this.ik.getParent();
        }
        this.ik.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.lr.qt() * 1000.0d));
        this.ka = new ri(this.ik);
        final int i2 = this.ik.getLayoutParams().height;
        this.fi = i2;
        this.di = this.ik.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.lr.ri()) || TtmlNode.RIGHT.equals(this.lr.ri())) {
            i = (int) this.di;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.ka, str, 0, i).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        arrayList.add(ri(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.qt.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                qt.this.ka.ri(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
