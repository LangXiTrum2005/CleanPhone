package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ik {
    private int aw;
    private int bgr;
    private int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18019co;
    private String nr;
    private float sf;
    private AtomicBoolean slm;
    private int vr;

    public fi(Context context) {
        super(context);
        this.aw = 0;
        this.bgr = Integer.MAX_VALUE;
        this.vr = Integer.MAX_VALUE;
        this.slm = new AtomicBoolean(true);
        this.bu = 0;
        this.nr = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.fi;
        if (map != null) {
            this.nr = TextUtils.isEmpty(map.get("direction")) ? "all" : this.fi.get("direction");
            this.aw = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("distance"), 0);
            if (this.bgr == Integer.MAX_VALUE) {
                this.bgr = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.vr == Integer.MAX_VALUE) {
                this.vr = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.bu = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("inView"), 0);
            this.slm.get();
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        ri();
        return ri(this.lr, motionEvent);
    }

    private void ri() {
        if (this.vr == Integer.MAX_VALUE || this.lr == null || System.currentTimeMillis() - this.lr.fr() < this.vr) {
            return;
        }
        this.slm.set(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    private boolean ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sf = motionEvent.getX();
            this.f18019co = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.aw == 0 && this.ri != null) {
                return ri(ikVar, x, y);
            }
            int iLr = com.bytedance.adsdk.ugeno.xha.mj.lr(this.qt, x - this.sf);
            int iLr2 = com.bytedance.adsdk.ugeno.xha.mj.lr(this.qt, y - this.f18019co);
            String str = this.nr;
            switch (str.hashCode()) {
                case 3739:
                    if (!str.equals("up")) {
                        iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    } else {
                        iLr = -iLr2;
                    }
                    break;
                case 96673:
                    str.equals("all");
                    iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    break;
                case 3089570:
                    if (!str.equals("down")) {
                        iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    } else {
                        iLr = iLr2;
                    }
                    break;
                case 3317767:
                    if (!str.equals(TtmlNode.LEFT)) {
                        iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    } else {
                        iLr = -iLr;
                    }
                    break;
                case 108511772:
                    if (!str.equals(TtmlNode.RIGHT)) {
                        iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    }
                    break;
                default:
                    iLr = (int) Math.abs(Math.sqrt(Math.pow(iLr, 2.0d) + Math.pow(iLr2, 2.0d)));
                    break;
            }
            if (iLr < this.aw) {
                return false;
            }
            if (this.ri != null) {
                this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f18019co = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return ri(ikVar, x, y);
            }
        }
        return true;
    }

    private boolean ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, float f, float f2) {
        if (this.bgr <= 0 || !this.slm.get()) {
            return false;
        }
        if (this.bu == 1 && !ri(ikVar.sf(), f, f2)) {
            return false;
        }
        this.ri.ri(ikVar, this.di, this.ik.lr());
        int i = this.bgr;
        if (i != Integer.MAX_VALUE) {
            this.bgr = i - 1;
        }
        return true;
    }

    private boolean ri(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }
}
