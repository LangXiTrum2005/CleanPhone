package com.bytedance.sdk.openadsdk.core.ik;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.nr;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik implements View.OnClickListener, View.OnTouchListener {
    protected static int dw = 8;
    protected View hcw;
    protected float ac = -1.0f;
    protected float ihz = -1.0f;
    protected float uq = -1.0f;
    protected float wjv = -1.0f;
    protected long ay = -1;
    protected long fr = -1;
    protected int su = -1;
    protected int igq = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int zf = -1;
    protected boolean ory = true;
    public SparseArray<ri> oh = new SparseArray<>();
    private float ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ka = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private long fi = 0;
    private int di = 0;
    private int xha = 0;

    public static class ri {
        public double ik;
        public long ka;
        public double lr;
        public int ri;

        public ri(int i, double d, double d2, long j) {
            this.ri = i;
            this.lr = d;
            this.ik = d2;
            this.ka = j;
        }
    }

    static {
        if (nr.ri() != null) {
            dw = nr.lr();
        }
    }

    private boolean ri(View view, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (lr.lr(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i = point.x) >= (i2 = iArr[0]) && i <= i2 + childAt.getWidth() && (i3 = point.y) >= (i4 = iArr[1]) && i3 <= i4 + childAt.getHeight();
                }
                if (ri(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean di() {
        return this.ory;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            ri(view, this.ac, this.ihz, this.uq, this.wjv, this.oh, this.ory);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.igq = motionEvent.getDeviceId();
        this.su = motionEvent.getToolType(0);
        this.zf = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i = 1;
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                this.uq = motionEvent.getRawX();
                this.wjv = motionEvent.getRawY();
                this.fr = System.currentTimeMillis();
                if (Math.abs(this.uq - this.di) >= dw || Math.abs(this.wjv - this.xha) >= dw) {
                    this.ory = false;
                }
                Point point = new Point((int) this.uq, (int) this.wjv);
                if (view != null && !lr.lr(view) && ri((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.ik += Math.abs(motionEvent.getX() - this.ri);
                this.ka += Math.abs(motionEvent.getY() - this.lr);
                this.ri = motionEvent.getX();
                this.lr = motionEvent.getY();
                if (System.currentTimeMillis() - this.fi > 200) {
                    float f = this.ik;
                    int i3 = dw;
                    if (f <= i3 && this.ka <= i3) {
                        i = 2;
                    }
                } else {
                    i = 2;
                }
                this.uq = motionEvent.getRawX();
                this.wjv = motionEvent.getRawY();
                if (Math.abs(this.uq - this.di) >= dw || Math.abs(this.wjv - this.xha) >= dw) {
                    this.ory = false;
                }
            }
            i = i2;
        } else {
            this.di = (int) motionEvent.getRawX();
            this.xha = (int) motionEvent.getRawY();
            this.ac = motionEvent.getRawX();
            this.ihz = motionEvent.getRawY();
            this.ay = System.currentTimeMillis();
            this.su = motionEvent.getToolType(0);
            this.igq = motionEvent.getDeviceId();
            this.zf = motionEvent.getSource();
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fi = System.currentTimeMillis();
            this.ory = true;
            this.hcw = view;
            com.bytedance.sdk.openadsdk.core.sf.ik.ri(motionEvent);
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
            i = 0;
        }
        this.oh.put(motionEvent.getActionMasked(), new ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    public abstract void ri(View view, float f, float f2, float f3, float f4, SparseArray<ri> sparseArray, boolean z);
}
