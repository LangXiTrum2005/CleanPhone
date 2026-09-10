package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends View {
    private View lr;
    private final ri ri;

    public interface ri {
        View ri(Context context);
    }

    public vr(Context context, ri riVar) {
        super(context);
        this.ri = riVar;
        ri();
    }

    private View lr() {
        ri riVar;
        if (this.lr == null && (riVar = this.ri) != null) {
            this.lr = riVar.ri(getContext());
            ri(this.lr, (ViewGroup) getParent());
        }
        return this.lr;
    }

    private void ri() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.lr;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            lr();
        }
    }

    private void ri(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
