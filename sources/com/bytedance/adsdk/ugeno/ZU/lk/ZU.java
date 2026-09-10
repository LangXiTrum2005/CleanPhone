package com.bytedance.adsdk.ugeno.ZU.lk;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ZU.ebl;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends Lxb {
    private boolean JVA;
    private float QAg;
    private float nBu;

    public ZU(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.lk.Lxb
    public boolean Lxb(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return Lxb(this.LD, (MotionEvent) objArr[0]);
    }

    public boolean Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.QAg = motionEvent.getRawX();
            this.nBu = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(rawX - this.QAg) >= 15.0f || Math.abs(rawY - this.nBu) >= 15.0f) {
                    this.JVA = true;
                }
            } else if (action == 3) {
                this.JVA = false;
            }
        } else {
            if (this.JVA) {
                this.JVA = false;
                this.QAg = 0.0f;
                this.nBu = 0.0f;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.QAg) < 15.0f && Math.abs(rawY2 - this.nBu) < 15.0f) {
                ebl eblVar = this.Lxb;
                if (eblVar != null) {
                    eblVar.Lxb(lkVar, this.lc, this.lk.LD());
                    this.QAg = 0.0f;
                    this.nBu = 0.0f;
                    return true;
                }
            } else {
                this.JVA = false;
            }
        }
        return true;
    }
}
