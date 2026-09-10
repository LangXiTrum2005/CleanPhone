package com.bytedance.adsdk.ugeno.jbs.lr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.ka;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends FrameLayout {
    private Map<Integer, aw> lr;
    private ka ri;

    public ri(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, aw> map = this.lr;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.di();
        }
        super.onLayout(z, i, i2, i3, i4);
        ka kaVar2 = this.ri;
        if (kaVar2 != null) {
            kaVar2.ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.ri;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        } else {
            super.onMeasure(i, i2);
        }
        ka kaVar2 = this.ri;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void ri(ka kaVar) {
        this.ri = kaVar;
    }

    public void setEventMap(Map<Integer, aw> map) {
        this.lr = map;
    }
}
