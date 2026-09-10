package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {
    public final Dialog X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19277Y;
    public final int Z;
    public final int e0;

    public InsetDialogOnTouchListener(Dialog dialog, Rect rect) {
        this.X = dialog;
        this.f19277Y = rect.left;
        this.Z = rect.top;
        this.e0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f19277Y;
        int width = viewFindViewById.getWidth() + left;
        int top2 = viewFindViewById.getTop() + this.Z;
        if (new RectF(left, top2, width, viewFindViewById.getHeight() + top2).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.e0;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.X.onTouchEvent(motionEventObtain);
    }
}
