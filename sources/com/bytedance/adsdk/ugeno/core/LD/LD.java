package com.bytedance.adsdk.ugeno.core.LD;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private boolean JXs;
    private float LD;
    private float Lxb;
    private Context ZU;
    private nBu lk;

    public LD(Context context, nBu nbu) {
        this.ZU = context;
        this.lk = nbu;
    }

    public boolean Lxb(sLN sln, com.bytedance.adsdk.ugeno.LD.lk lkVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.Lxb) >= 15.0f || Math.abs(y - this.LD) >= 15.0f) {
                    this.JXs = true;
                }
            } else if (action == 3) {
                this.JXs = false;
            }
        } else {
            if (this.JXs) {
                this.JXs = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.Lxb) >= 15.0f || Math.abs(y2 - this.LD) >= 15.0f) {
                this.JXs = false;
            } else if (sln != null) {
                sln.Lxb(this.lk, lkVar, lkVar);
                return true;
            }
        }
        return true;
    }
}
