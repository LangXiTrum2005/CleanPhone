package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class wd implements View.OnTouchListener {
    private static int lnr = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mml;
    private int mzz;
    private float qdl;
    private float ud;
    private RectF mo = new RectF();
    private long wd = 0;
    private final int jpc = 200;
    private final int tvp = 3;
    private SoftReference<View> to = new SoftReference<>(null);

    public wd(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i2, final ViewGroup viewGroup) {
        this.mzz = lnr;
        this.mml = jpcVar;
        if (i2 > 0) {
            this.mzz = i2;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.wd.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    wd.this.to = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar2;
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
            int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(rawX - this.qdl));
            int i2 = lnr;
            if (fAbs < i2 || fAbs2 < i2) {
                if ((System.currentTimeMillis() - this.wd < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (jpcVar = this.mml) != null) {
                    jpcVar.qdl();
                }
            } else if (rawX > this.qdl && iUd > this.mzz && (jpcVar2 = this.mml) != null) {
                jpcVar2.qdl();
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
