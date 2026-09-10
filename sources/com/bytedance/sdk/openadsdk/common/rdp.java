package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class rdp extends View {
    private final qdl qdl;
    private View ud;

    public interface qdl {
        View qdl(Context context);
    }

    public rdp(Context context, qdl qdlVar) {
        super(context);
        this.qdl = qdlVar;
        qdl();
    }

    private void qdl() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    private View ud() {
        qdl qdlVar;
        if (this.ud == null && (qdlVar = this.qdl) != null) {
            this.ud = qdlVar.qdl(getContext());
            qdl(this.ud, (ViewGroup) getParent());
        }
        return this.ud;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        View view = this.ud;
        if (view != null) {
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            ud();
        }
    }

    private void qdl(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
