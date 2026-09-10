package com.bytedance.adsdk.ugeno.core.ud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private qdl exu;
    private boolean fs;
    private exu jpc;
    private boolean rq;
    private Context to;
    private String tvp;
    private exu wd;
    private float qdl = Float.MIN_VALUE;
    private float ud = Float.MIN_VALUE;
    private int lnr = 0;
    private int mml = Integer.MAX_VALUE;
    private int mzz = Integer.MAX_VALUE;
    private AtomicBoolean mo = new AtomicBoolean(true);

    public mzz(Context context, exu exuVar, boolean z2, boolean z3) {
        this.to = context;
        this.wd = exuVar;
        this.rq = z2;
        this.fs = z3;
        lnr();
    }

    private void lnr() {
        if (this.fs) {
            this.exu = new qdl();
        }
        exu exuVar = this.wd;
        if (exuVar == null) {
            return;
        }
        this.lnr = exuVar.lnr().optInt("slideThreshold");
        this.tvp = this.wd.lnr().optString("slideDirection");
        this.mml = this.wd.lnr().optInt("frequency", Integer.MAX_VALUE);
        this.mzz = this.wd.lnr().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.mml + ", mEffectiveDuration: " + this.mzz + ", inEffectiveDuation: " + this.mo.get());
    }

    public void ud() {
        this.qdl = Float.MIN_VALUE;
        this.ud = Float.MIN_VALUE;
    }

    public void qdl() {
        if (this.mzz == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ud.mzz.1
            @Override // java.lang.Runnable
            public void run() {
                mzz.this.mo.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.mzz);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    public boolean qdl(bjy bjyVar, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent, boolean z2) {
        float x;
        float y;
        int iUd;
        int iUd2;
        qdl qdlVar = this.exu;
        if (qdlVar != null) {
            if (qdlVar.qdl(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.exu.qdl(lnrVar, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.ud = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.rq && Math.abs(x - this.qdl) <= 10.0f && Math.abs(y - this.ud) <= 10.0f && bjyVar != null) {
                ud();
                bjyVar.qdl(this.jpc, lnrVar, lnrVar);
                return true;
            }
            if (this.lnr != 0 && bjyVar != null) {
                ud();
                qdl(bjyVar, this.wd, lnrVar);
                return true;
            }
            iUd = jpc.ud(this.to, x - this.qdl);
            iUd2 = jpc.ud(this.to, y - this.ud);
            if (TextUtils.equals(this.tvp, "up")) {
                iUd = -iUd2;
            } else if (!TextUtils.equals(this.tvp, "down")) {
                iUd = iUd2;
            } else if (TextUtils.equals(this.tvp, TtmlNode.LEFT)) {
                iUd = -iUd;
            } else if (!TextUtils.equals(this.tvp, TtmlNode.RIGHT)) {
                iUd = (int) Math.abs(Math.sqrt(Math.pow(iUd2, 2.0d) + Math.pow(iUd, 2.0d)));
            }
            if (iUd >= this.lnr) {
                Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                if (bjyVar != null) {
                    ud();
                    qdl(bjyVar, this.wd, lnrVar);
                    return true;
                }
                ud();
            } else {
                ud();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                qdl(lnrVar);
                return false;
            }
        } else if (action == 3) {
            if (this.qdl != Float.MIN_VALUE && this.ud != Float.MIN_VALUE) {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (!this.rq) {
                }
                if (this.lnr != 0) {
                }
                iUd = jpc.ud(this.to, x - this.qdl);
                iUd2 = jpc.ud(this.to, y - this.ud);
                if (TextUtils.equals(this.tvp, "up")) {
                    iUd = -iUd2;
                } else if (!TextUtils.equals(this.tvp, "down")) {
                    iUd = iUd2;
                } else if (TextUtils.equals(this.tvp, TtmlNode.LEFT)) {
                    iUd = -iUd;
                } else if (!TextUtils.equals(this.tvp, TtmlNode.RIGHT)) {
                    iUd = (int) Math.abs(Math.sqrt(Math.pow(iUd2, 2.0d) + Math.pow(iUd, 2.0d)));
                }
                if (iUd >= this.lnr) {
                    Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                    if (bjyVar != null) {
                        ud();
                        qdl(bjyVar, this.wd, lnrVar);
                        return true;
                    }
                    ud();
                } else {
                    ud();
                    Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                    qdl(lnrVar);
                    return false;
                }
            } else {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                return false;
            }
        }
        return true;
    }

    public mzz(Context context, exu exuVar, exu exuVar2, boolean z2, boolean z3) {
        this.to = context;
        this.wd = exuVar;
        this.jpc = exuVar2;
        this.rq = z2;
        this.fs = z3;
        lnr();
    }

    private void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (this.exu != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.exu.qdl(lnrVar);
        }
    }

    private void qdl(bjy bjyVar, exu exuVar, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (this.mml <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            qdl(lnrVar);
        } else {
            if (!this.mo.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                qdl(lnrVar);
                return;
            }
            bjyVar.qdl(exuVar, lnrVar, lnrVar);
            int i2 = this.mml;
            if (i2 != Integer.MAX_VALUE) {
                this.mml = i2 - 1;
            }
        }
    }
}
