package com.bytedance.sdk.openadsdk.core.lnr;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lnr implements View.OnClickListener, View.OnTouchListener {
    private static float lnr = 0.0f;
    private static float mml = 0.0f;
    private static long mzz = 0;
    private static float qdl = 0.0f;
    private static float ud = 0.0f;
    protected static int vu = 8;
    protected View kdv;
    protected float aaj = -1.0f;
    protected float jyq = -1.0f;
    protected float oth = -1.0f;
    protected float ljh = -1.0f;
    protected long bch = -1;
    protected long uw = -1;
    protected int xmv = -1;
    protected int bqt = -1024;
    protected int koa = -1;
    protected boolean rc = true;
    public SparseArray<qdl> ekw = new SparseArray<>();
    private int mo = 0;
    private int wd = 0;

    public static class qdl {
        public double lnr;
        public long mml;
        public int qdl;
        public double ud;

        public qdl(int i2, double d, double d2, long j) {
            this.qdl = i2;
            this.ud = d;
            this.lnr = d2;
            this.mml = j;
        }
    }

    static {
        if (yt.qdl() != null) {
            vu = yt.ud();
        }
        qdl = 0.0f;
        ud = 0.0f;
        lnr = 0.0f;
        mml = 0.0f;
        mzz = 0L;
    }

    private boolean qdl(View view, Point point) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (ud.ud(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i2 = point.x) >= (i3 = iArr[0]) && i2 <= childAt.getWidth() + i3 && (i4 = point.y) >= (i5 = iArr[1]) && i4 <= childAt.getHeight() + i5;
                }
                if (qdl(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean mo() {
        return this.rc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            qdl(view, this.aaj, this.jyq, this.oth, this.ljh, this.ekw, this.rc);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        this.bqt = motionEvent.getDeviceId();
        this.xmv = motionEvent.getToolType(0);
        this.koa = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked != 0) {
            int i4 = 3;
            if (actionMasked == 1) {
                this.oth = motionEvent.getRawX();
                this.ljh = motionEvent.getRawY();
                this.uw = System.currentTimeMillis();
                if (Math.abs(this.oth - this.mo) >= vu || Math.abs(this.ljh - this.wd) >= vu) {
                    this.rc = false;
                }
                Point point = new Point((int) this.oth, (int) this.ljh);
                if (view != null && !ud.ud(view) && qdl((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i4 = actionMasked != 3 ? -1 : 4;
            } else {
                lnr = Math.abs(motionEvent.getX() - qdl) + lnr;
                mml = Math.abs(motionEvent.getY() - ud) + mml;
                qdl = motionEvent.getX();
                ud = motionEvent.getY();
                if (System.currentTimeMillis() - mzz > 200) {
                    float f = lnr;
                    int i5 = vu;
                    if (f <= i5 && mml <= i5) {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                }
                this.oth = motionEvent.getRawX();
                this.ljh = motionEvent.getRawY();
                if (Math.abs(this.oth - this.mo) >= vu || Math.abs(this.ljh - this.wd) >= vu) {
                    this.rc = false;
                }
                i2 = i3;
            }
            i2 = i4;
        } else {
            this.mo = (int) motionEvent.getRawX();
            this.wd = (int) motionEvent.getRawY();
            this.aaj = motionEvent.getRawX();
            this.jyq = motionEvent.getRawY();
            this.bch = System.currentTimeMillis();
            this.xmv = motionEvent.getToolType(0);
            this.bqt = motionEvent.getDeviceId();
            this.koa = motionEvent.getSource();
            mzz = System.currentTimeMillis();
            this.rc = true;
            this.kdv = view;
            com.bytedance.sdk.openadsdk.core.to.lnr.qdl(motionEvent);
            i2 = 0;
        }
        this.ekw.put(motionEvent.getActionMasked(), new qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    public abstract void qdl(View view, float f, float f2, float f3, float f4, SparseArray<qdl> sparseArray, boolean z2);
}
