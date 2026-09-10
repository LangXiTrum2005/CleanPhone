package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements View.OnTouchListener {
    private static int ik = 10;
    private int fi;
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj ka;
    private float lr;
    private float ri;
    private RectF di = new RectF();
    private long xha = 0;
    private final int mj = 200;
    private final int jbs = 3;
    private SoftReference<ViewGroup> qt = new SoftReference<>(null);

    public ri(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar, int i, final ViewGroup viewGroup) {
        this.fi = ik;
        this.ka = mjVar;
        if (i > 0) {
            this.fi = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.qt = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.di = ri(this.qt.get());
            this.ri = motionEvent.getRawX();
            this.lr = motionEvent.getRawY();
            this.xha = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.di;
            if (rectF != null && !rectF.contains(this.ri, this.lr)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.ri);
            float fAbs2 = Math.abs(rawY - this.lr);
            int i = this.fi;
            if (fAbs >= i && fAbs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar2 = this.ka;
                if (mjVar2 != null) {
                    mjVar2.ri();
                }
            } else if ((System.currentTimeMillis() - this.xha < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (mjVar = this.ka) != null) {
                mjVar.ri();
            }
        }
        return true;
    }

    private RectF ri(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }
}
