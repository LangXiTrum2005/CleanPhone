package com.smartdigimkt.n5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.SimpleGuideToClickView;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SimpleGuideToClickView f37087e;

    public b(View view) {
        super(view);
    }

    @Override // com.smartdigimkt.n5.a
    public ValueAnimator a() {
        return null;
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public synchronized void start() {
        View view = this.f37084a;
        if (view != null && view.getParent() != null && (this.f37084a.getParent() instanceof RelativeLayout)) {
            Context context = this.f37084a.getContext();
            if (this.f37087e == null) {
                try {
                    RelativeLayout relativeLayout = (RelativeLayout) this.f37084a.getParent();
                    relativeLayout.setClipChildren(false);
                    SimpleGuideToClickView simpleGuideToClickView = new SimpleGuideToClickView(context);
                    this.f37087e = simpleGuideToClickView;
                    simpleGuideToClickView.init(h.a(context, "myoffer_simple_guide_to_click_cta", "layout"), h.a(context, 1.0f), h.a(context, 3.0f), h.a(context, 6.0f), h.a(context, 6.0f));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(7, this.f37084a.getId());
                    layoutParams.addRule(15);
                    relativeLayout.addView(this.f37087e, layoutParams);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
