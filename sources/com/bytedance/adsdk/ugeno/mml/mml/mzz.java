package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends lnr {
    private int bjy;
    private int exu;
    private float fs;
    private String jl;
    private AtomicBoolean jtx;
    private int rdp;
    private float rq;
    private int yt;

    public mzz(Context context) {
        super(context);
        this.exu = 0;
        this.rdp = Integer.MAX_VALUE;
        this.bjy = Integer.MAX_VALUE;
        this.jtx = new AtomicBoolean(true);
        this.yt = 0;
        this.jl = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.mzz;
        if (map != null) {
            this.jl = TextUtils.isEmpty(map.get("direction")) ? "all" : this.mzz.get("direction");
            this.exu = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("distance"), 0);
            if (this.rdp == Integer.MAX_VALUE) {
                this.rdp = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.bjy == Integer.MAX_VALUE) {
                this.bjy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.yt = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.rdp + ", mEffectiveDuration: " + this.bjy + ", inEffectiveDuation: " + this.jtx.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        qdl();
        return qdl(this.ud, motionEvent);
    }

    private void qdl() {
        if (this.bjy == Integer.MAX_VALUE || this.ud == null || System.currentTimeMillis() - this.ud.uw() < this.bjy) {
            return;
        }
        this.jtx.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    private boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        byte b2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rq = motionEvent.getX();
            this.fs = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.exu == 0 && this.qdl != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return qdl(lnrVar, x, y);
            }
            int iUd = com.bytedance.adsdk.ugeno.wd.jpc.ud(this.to, x - this.rq);
            int iUd2 = com.bytedance.adsdk.ugeno.wd.jpc.ud(this.to, y - this.fs);
            switch (this.jl) {
                case "up":
                    b2 = 0;
                    break;
                case "all":
                    b2 = 4;
                    break;
                case "down":
                    b2 = 1;
                    break;
                case "left":
                    b2 = 2;
                    break;
                case "right":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                iUd = -iUd2;
            } else if (b2 == 1) {
                iUd = iUd2;
            } else if (b2 == 2) {
                iUd = -iUd;
            } else if (b2 != 3) {
                iUd = (int) Math.abs(Math.sqrt(Math.pow(iUd2, 2.0d) + Math.pow(iUd, 2.0d)));
            }
            if (iUd >= this.exu) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.qdl != null) {
                    this.rq = 0.0f;
                    this.fs = 0.0f;
                    return qdl(lnrVar, x, y);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        }
        return true;
    }

    private boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, float f, float f2) {
        if (this.rdp <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.jtx.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.yt == 1 && !qdl(lnrVar.rq(), f, f2)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.qdl.qdl(lnrVar, this.mo, this.lnr.ud());
        int i2 = this.rdp;
        if (i2 != Integer.MAX_VALUE) {
            this.rdp = i2 - 1;
        }
        return true;
    }

    private boolean qdl(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
