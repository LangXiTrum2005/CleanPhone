package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class HD extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.LD.lc LD;
    private final Lxb Lxb;

    public static class Lxb extends GestureDetector.SimpleOnGestureListener {
        boolean Lxb = false;

        public boolean LD() {
            return this.Lxb;
        }

        public void Lxb() {
            this.Lxb = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.Lxb = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public HD(Context context) {
        this(context, new Lxb());
    }

    public boolean LD() {
        return this.Lxb.LD();
    }

    public void Lxb() {
        this.Lxb.Lxb();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.LD.Lxb(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public HD(Context context, Lxb lxb) {
        super(context, lxb);
        this.Lxb = lxb;
        this.LD = new com.bytedance.sdk.openadsdk.core.LD.lc();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.nBu Lxb(Context context, View view, View view2) {
        if (this.LD == null) {
            return new com.bytedance.sdk.openadsdk.core.model.nBu.Lxb().Lxb();
        }
        return new com.bytedance.sdk.openadsdk.core.model.nBu.Lxb().lc(this.LD.Lxb).JXs(this.LD.LD).ZU(this.LD.lk).lk(this.LD.ZU).LD(this.LD.JXs).Lxb(this.LD.lc).LD(le.Lxb(view)).Lxb(le.Lxb(view2)).lk(le.lk(view)).ZU(le.lk(view2)).ZU(this.LD.ebl).JXs(this.LD.OY).lc(this.LD.QAg).Lxb(this.LD.sLN).LD(com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb() ? 1 : 2).Lxb("vessel").Lxb(le.JXs(context)).lk(le.ebl(context)).LD(le.lc(context)).Lxb();
    }
}
