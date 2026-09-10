package com.bytedance.sdk.openadsdk.core.ik;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.nr;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    public static int qt = 8;
    public float ri = -1.0f;
    public float lr = -1.0f;
    public float ik = -1.0f;
    public float ka = -1.0f;
    public long fi = -1;
    public long di = -1;
    public int xha = -1;
    public int mj = BackupConstant.UNFINISHED_FAIL_CODE;
    public int jbs = -1;
    public boolean sf = true;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public SparseArray<ik.ri> f18120co = new SparseArray<>();
    private float aw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float bgr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float vr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float slm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private long bu = 0;
    private int nr = 0;
    private int tan = 0;

    static {
        if (nr.ri() != null) {
            qt = nr.lr();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void ri(MotionEvent motionEvent) {
        int i;
        this.mj = motionEvent.getDeviceId();
        int i2 = 0;
        this.xha = motionEvent.getToolType(0);
        this.jbs = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked != 0) {
            i = 3;
            if (actionMasked == 1) {
                this.ik = motionEvent.getRawX();
                this.ka = motionEvent.getRawY();
                this.di = System.currentTimeMillis();
                if (Math.abs(this.ik - this.nr) >= qt || Math.abs(this.ka - this.tan) >= qt) {
                    this.sf = false;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.vr += Math.abs(motionEvent.getX() - this.aw);
                this.slm += Math.abs(motionEvent.getY() - this.bgr);
                this.aw = motionEvent.getX();
                this.bgr = motionEvent.getY();
                if (System.currentTimeMillis() - this.bu > 200) {
                    float f = this.vr;
                    int i4 = qt;
                    if (f <= i4 && this.slm <= i4) {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                }
                this.ik = motionEvent.getRawX();
                this.ka = motionEvent.getRawY();
                if (Math.abs(this.ik - this.nr) >= qt || Math.abs(this.ka - this.tan) >= qt) {
                    this.sf = false;
                }
                i = i3;
            }
            this.f18120co.put(motionEvent.getActionMasked(), new ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.nr = (int) motionEvent.getRawX();
        this.tan = (int) motionEvent.getRawY();
        this.ri = motionEvent.getRawX();
        this.lr = motionEvent.getRawY();
        this.fi = System.currentTimeMillis();
        this.xha = motionEvent.getToolType(0);
        this.mj = motionEvent.getDeviceId();
        this.jbs = motionEvent.getSource();
        this.vr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.slm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bu = System.currentTimeMillis();
        this.sf = true;
        this.aw = motionEvent.getX();
        this.bgr = motionEvent.getY();
        i = i2;
        this.f18120co.put(motionEvent.getActionMasked(), new ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
