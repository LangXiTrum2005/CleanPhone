package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements View.OnTouchListener {
    private static int lk = 10;
    private int JXs;
    private float LD;
    private float Lxb;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY ZU;
    private RectF lc = new RectF();
    private long ebl = 0;
    private final int OY = 200;
    private final int QAg = 3;
    private SoftReference<ViewGroup> nBu = new SoftReference<>(null);

    public Lxb(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy, int i, final ViewGroup viewGroup) {
        this.JXs = lk;
        this.ZU = oy;
        if (i > 0) {
            this.JXs = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.nBu = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lc = Lxb(this.nBu.get());
            this.Lxb = motionEvent.getRawX();
            this.LD = motionEvent.getRawY();
            this.ebl = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.lc;
            if (rectF != null && !rectF.contains(this.Lxb, this.LD)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.Lxb);
            float fAbs2 = Math.abs(rawY - this.LD);
            int i = this.JXs;
            if (fAbs >= i && fAbs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy2 = this.ZU;
                if (oy2 != null) {
                    oy2.Lxb();
                }
            } else if ((System.currentTimeMillis() - this.ebl < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (oy = this.ZU) != null) {
                oy.Lxb();
            }
        }
        return true;
    }

    private RectF Lxb(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
