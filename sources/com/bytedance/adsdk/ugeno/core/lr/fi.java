package com.bytedance.adsdk.ugeno.core.lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private ri aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18011co;
    private String jbs;
    private aw mj;
    private Context qt;
    private boolean sf;
    private aw xha;
    private float ri = Float.MIN_VALUE;
    private float lr = Float.MIN_VALUE;
    private int ik = 0;
    private int ka = Integer.MAX_VALUE;
    private int fi = Integer.MAX_VALUE;
    private AtomicBoolean di = new AtomicBoolean(true);

    public fi(Context context, aw awVar, boolean z, boolean z2) {
        this.qt = context;
        this.xha = awVar;
        this.sf = z;
        this.f18011co = z2;
        ik();
    }

    private void ik() {
        if (this.f18011co) {
            this.aw = new ri();
        }
        aw awVar = this.xha;
        if (awVar == null) {
            return;
        }
        this.ik = awVar.ik().optInt("slideThreshold");
        this.jbs = this.xha.ik().optString("slideDirection");
        this.ka = this.xha.ik().optInt("frequency", Integer.MAX_VALUE);
        this.fi = this.xha.ik().optInt("effectiveDuration", Integer.MAX_VALUE);
        this.di.get();
    }

    public void lr() {
        this.ri = Float.MIN_VALUE;
        this.lr = Float.MIN_VALUE;
    }

    public void ri() {
        if (this.fi == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                fi.this.di.set(false);
            }
        }, this.fi);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    public boolean ri(vr vrVar, com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent, boolean z) {
        float x;
        float y;
        int iLr;
        int iLr2;
        ri riVar = this.aw;
        if (riVar != null) {
            if (riVar.ri(motionEvent)) {
                return false;
            }
            this.aw.ri(ikVar, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.sf && Math.abs(x - this.ri) <= 10.0f && Math.abs(y - this.lr) <= 10.0f && vrVar != null) {
                lr();
                vrVar.ri(this.mj, ikVar, ikVar);
                return true;
            }
            if (this.ik != 0 && vrVar != null) {
                lr();
                ri(vrVar, this.xha, ikVar);
                return true;
            }
            iLr = mj.lr(this.qt, x - this.ri);
            iLr2 = mj.lr(this.qt, y - this.lr);
            if (TextUtils.equals(this.jbs, "up")) {
                iLr = -iLr2;
            } else if (!TextUtils.equals(this.jbs, "down")) {
                iLr = iLr2;
            } else if (TextUtils.equals(this.jbs, TtmlNode.LEFT)) {
                iLr = -iLr;
            } else if (!TextUtils.equals(this.jbs, TtmlNode.RIGHT)) {
                iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
            }
            if (iLr >= this.ik) {
                lr();
                ri(ikVar);
                return false;
            }
            if (vrVar != null) {
                lr();
                ri(vrVar, this.xha, ikVar);
                return true;
            }
            lr();
        } else if (action == 3) {
            if (this.ri == Float.MIN_VALUE || this.lr == Float.MIN_VALUE) {
                return false;
            }
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.sf) {
            }
            if (this.ik != 0) {
            }
            iLr = mj.lr(this.qt, x - this.ri);
            iLr2 = mj.lr(this.qt, y - this.lr);
            if (TextUtils.equals(this.jbs, "up")) {
                iLr = -iLr2;
            } else if (!TextUtils.equals(this.jbs, "down")) {
                iLr = iLr2;
            } else if (TextUtils.equals(this.jbs, TtmlNode.LEFT)) {
                iLr = -iLr;
            } else if (!TextUtils.equals(this.jbs, TtmlNode.RIGHT)) {
                iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
            }
            if (iLr >= this.ik) {
                lr();
                ri(ikVar);
                return false;
            }
            if (vrVar != null) {
                lr();
                ri(vrVar, this.xha, ikVar);
                return true;
            }
            lr();
        }
        return true;
    }

    public fi(Context context, aw awVar, aw awVar2, boolean z, boolean z2) {
        this.qt = context;
        this.xha = awVar;
        this.mj = awVar2;
        this.sf = z;
        this.f18011co = z2;
        ik();
    }

    private void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        ri riVar = this.aw;
        if (riVar != null) {
            riVar.ri(ikVar);
        }
    }

    private void ri(vr vrVar, aw awVar, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (this.ka <= 0) {
            ri(ikVar);
            return;
        }
        if (!this.di.get()) {
            ri(ikVar);
            return;
        }
        vrVar.ri(awVar, ikVar, ikVar);
        int i = this.ka;
        if (i != Integer.MAX_VALUE) {
            this.ka = i - 1;
        }
    }
}
