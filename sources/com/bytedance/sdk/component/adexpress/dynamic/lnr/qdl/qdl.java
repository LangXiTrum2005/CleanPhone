package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements View.OnTouchListener {
    private static int lnr = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mml;
    private int mzz;
    private float qdl;
    private float ud;
    private RectF mo = new RectF();
    private long wd = 0;
    private final int jpc = 200;
    private final int tvp = 3;
    private SoftReference<ViewGroup> to = new SoftReference<>(null);

    public qdl(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i2, final ViewGroup viewGroup) {
        this.mzz = lnr;
        this.mml = jpcVar;
        if (i2 > 0) {
            this.mzz = i2;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.to = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mo = qdl(this.to.get());
            this.qdl = motionEvent.getRawX();
            this.ud = motionEvent.getRawY();
            this.wd = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.mo;
            if (rectF != null && !rectF.contains(this.qdl, this.ud)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.qdl);
            float fAbs2 = Math.abs(rawY - this.ud);
            int i2 = this.mzz;
            if (fAbs >= i2 && fAbs2 >= i2) {
                com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar2 = this.mml;
                if (jpcVar2 != null) {
                    jpcVar2.qdl();
                }
            } else if ((System.currentTimeMillis() - this.wd < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (jpcVar = this.mml) != null) {
                jpcVar.qdl();
            }
        }
        return true;
    }

    private RectF qdl(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        return new RectF(i2, iArr[1], view.getWidth() + i2, view.getHeight() + iArr[1]);
    }
}
