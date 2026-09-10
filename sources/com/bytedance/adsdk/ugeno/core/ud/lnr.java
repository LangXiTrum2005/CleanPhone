package com.bytedance.adsdk.ugeno.core.ud;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private exu lnr;
    private Context mml;
    private final int mo;
    private boolean mzz;
    private float qdl;
    private float ud;

    public lnr(Context context, exu exuVar) {
        this.mml = context;
        this.lnr = exuVar;
        this.mo = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean qdl(bjy bjyVar, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.ud = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.qdl) >= this.mo || Math.abs(y - this.ud) >= this.mo) {
                    this.mzz = true;
                }
            } else if (action == 3) {
                this.mzz = false;
            }
        } else {
            if (this.mzz) {
                this.mzz = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.qdl) >= this.mo || Math.abs(y2 - this.ud) >= this.mo) {
                this.mzz = false;
            } else if (bjyVar != null) {
                bjyVar.qdl(this.lnr, lnrVar, lnrVar);
                return true;
            }
        }
        return true;
    }
}
