package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class wjv extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.ik.di lr;
    private final ri ri;

    public static class ri extends GestureDetector.SimpleOnGestureListener {
        boolean ri = false;

        public boolean lr() {
            return this.ri;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.ri = true;
            return super.onSingleTapUp(motionEvent);
        }

        public void ri() {
            this.ri = false;
        }
    }

    public wjv(Context context) {
        this(context, new ri());
    }

    public boolean lr() {
        return this.ri.lr();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lr.ri(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void ri() {
        this.ri.ri();
    }

    public wjv(Context context, ri riVar) {
        super(context, riVar);
        this.ri = riVar;
        this.lr = new com.bytedance.sdk.openadsdk.core.ik.di();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.co ri(Context context, View view) {
        if (this.lr == null) {
            return new com.bytedance.sdk.openadsdk.core.model.co.ri().ri();
        }
        return new com.bytedance.sdk.openadsdk.core.model.co.ri().di(this.lr.ri).fi(this.lr.lr).ka(this.lr.ik).ik(this.lr.ka).lr(this.lr.fi).ri(this.lr.di).ri(qd.ri(view)).lr(qd.ik(view)).ka(this.lr.xha).fi(this.lr.mj).di(this.lr.jbs).ri(this.lr.f18120co).lr(com.bytedance.sdk.openadsdk.core.qt.lr().ri() ? 1 : 2).ri("vessel").ri(qd.mj(context)).ik(qd.qt(context)).lr(qd.jbs(context)).ri();
    }
}
