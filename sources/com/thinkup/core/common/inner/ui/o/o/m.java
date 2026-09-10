package com.thinkup.core.common.inner.ui.o.o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.thinkup.core.common.inner.ui.SimpleGuideToClickView;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o {
    SimpleGuideToClickView oo;

    public m(View view) {
        super(view);
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o, com.thinkup.core.common.inner.ui.o.m
    public final synchronized void o() {
        View view = this.o;
        if (view != null && view.getParent() != null && (this.o.getParent() instanceof RelativeLayout)) {
            Context context = this.o.getContext();
            if (this.oo == null) {
                try {
                    RelativeLayout relativeLayout = (RelativeLayout) this.o.getParent();
                    relativeLayout.setClipChildren(false);
                    SimpleGuideToClickView simpleGuideToClickView = new SimpleGuideToClickView(context);
                    this.oo = simpleGuideToClickView;
                    simpleGuideToClickView.init(o00.o(context, "myoffer_simple_guide_to_click_cta", "layout"), o00.o(context, 1.0f), o00.o(context, 3.0f), o00.o(context, 6.0f), o00.o(context, 6.0f));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(7, this.o.getId());
                    layoutParams.addRule(15);
                    relativeLayout.addView(this.oo, layoutParams);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o
    public final ValueAnimator oo() {
        return null;
    }
}
