package com.bytedance.adsdk.ugeno.ZU.lk;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ZU.ebl;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.umeng.analytics.pro.f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lk extends Lxb {
    private int JVA;
    private float QAg;
    private float nBu;
    private String sLN;

    public lk(Context context) {
        super(context);
        this.JVA = 0;
        this.sLN = f.R;
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.lk.Lxb
    public boolean Lxb(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.JXs;
        if (map != null) {
            this.sLN = TextUtils.isEmpty(map.get("direction")) ? "all" : this.JXs.get("direction");
            this.JVA = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(this.JXs.get("distance"), 0);
        }
        return Lxb(this.LD, (MotionEvent) objArr[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    private boolean Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, MotionEvent motionEvent) {
        byte b;
        ebl eblVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.QAg = motionEvent.getX();
            this.nBu = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.JVA == 0 && (eblVar = this.Lxb) != null) {
                eblVar.Lxb(lkVar, this.lc, this.lk.LD());
                return true;
            }
            int iLD = OY.LD(this.OY, x - this.QAg);
            int iLD2 = OY.LD(this.OY, y - this.nBu);
            switch (this.sLN) {
                case "up":
                    b = 0;
                    break;
                case "all":
                    b = 4;
                    break;
                case "down":
                    b = 1;
                    break;
                case "left":
                    b = 2;
                    break;
                case "right":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                iLD = -iLD2;
            } else if (b == 1) {
                iLD = iLD2;
            } else if (b == 2) {
                iLD = -iLD;
            } else if (b != 3) {
                iLD = (int) Math.abs(Math.sqrt(Math.pow(iLD2, 2.0d) + Math.pow(iLD, 2.0d)));
            }
            if (iLD < this.JVA) {
                return false;
            }
            ebl eblVar2 = this.Lxb;
            if (eblVar2 != null) {
                this.QAg = 0.0f;
                this.nBu = 0.0f;
                eblVar2.Lxb(lkVar, this.lc, this.lk.LD());
                return true;
            }
        }
        return true;
    }
}
