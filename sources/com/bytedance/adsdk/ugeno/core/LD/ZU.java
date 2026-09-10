package com.bytedance.adsdk.ugeno.core.LD;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.f;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    private nBu JXs;
    private boolean OY;
    private nBu ZU;
    private Context ebl;
    private String lc;
    private float Lxb = Float.MIN_VALUE;
    private float LD = Float.MIN_VALUE;
    private int lk = 0;

    public ZU(Context context, nBu nbu, boolean z) {
        this.ebl = context;
        this.ZU = nbu;
        this.OY = z;
        LD();
    }

    private void LD() {
        nBu nbu = this.ZU;
        if (nbu == null) {
            return;
        }
        this.lk = nbu.lk().optInt("slideThreshold");
        this.lc = this.ZU.lk().optString("slideDirection");
    }

    public void Lxb() {
        this.Lxb = Float.MIN_VALUE;
        this.LD = Float.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    public boolean Lxb(sLN sln, com.bytedance.adsdk.ugeno.LD.lk lkVar, MotionEvent motionEvent) {
        float x;
        float y;
        int iLD;
        int iLD2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.OY && Math.abs(x - this.Lxb) <= 10.0f && Math.abs(y - this.LD) <= 10.0f && sln != null) {
                Lxb();
                sln.Lxb(this.JXs, lkVar, lkVar);
                return true;
            }
            if (this.lk != 0 && sln != null) {
                Lxb();
                sln.Lxb(this.ZU, lkVar, lkVar);
                return true;
            }
            iLD = OY.LD(this.ebl, x - this.Lxb);
            iLD2 = OY.LD(this.ebl, y - this.LD);
            if (TextUtils.equals(this.lc, f.R)) {
                iLD = -iLD2;
            } else if (!TextUtils.equals(this.lc, "down")) {
                iLD = iLD2;
            } else if (TextUtils.equals(this.lc, TtmlNode.LEFT)) {
                iLD = -iLD;
            } else if (!TextUtils.equals(this.lc, TtmlNode.RIGHT)) {
                iLD = (int) Math.abs(Math.sqrt(Math.pow(iLD2, 2.0d) + Math.pow(iLD, 2.0d)));
            }
            if (iLD >= this.lk) {
                Lxb();
                return false;
            }
            if (sln != null) {
                Lxb();
                sln.Lxb(this.ZU, lkVar, lkVar);
                return true;
            }
            Lxb();
        } else if (action == 3) {
            if (this.Lxb == Float.MIN_VALUE || this.LD == Float.MIN_VALUE) {
                return false;
            }
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.OY) {
            }
            if (this.lk != 0) {
            }
            iLD = OY.LD(this.ebl, x - this.Lxb);
            iLD2 = OY.LD(this.ebl, y - this.LD);
            if (TextUtils.equals(this.lc, f.R)) {
                iLD = -iLD2;
            } else if (!TextUtils.equals(this.lc, "down")) {
                iLD = iLD2;
            } else if (TextUtils.equals(this.lc, TtmlNode.LEFT)) {
                iLD = -iLD;
            } else if (!TextUtils.equals(this.lc, TtmlNode.RIGHT)) {
                iLD = (int) Math.abs(Math.sqrt(Math.pow(iLD2, 2.0d) + Math.pow(iLD, 2.0d)));
            }
            if (iLD >= this.lk) {
                Lxb();
                return false;
            }
            if (sln != null) {
                Lxb();
                sln.Lxb(this.ZU, lkVar, lkVar);
                return true;
            }
            Lxb();
        }
        return true;
    }

    public ZU(Context context, nBu nbu, nBu nbu2, boolean z) {
        this.ebl = context;
        this.ZU = nbu;
        this.JXs = nbu2;
        this.OY = z;
        LD();
    }
}
