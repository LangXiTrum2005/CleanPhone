package com.bytedance.adsdk.ugeno.ZU.lk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.ebl.QAg;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JXs extends Lxb implements QAg.Lxb {
    private Handler JVA;
    private int QAg;
    private int nBu;
    private int sLN;

    public JXs(Context context) {
        super(context);
        this.nBu = 0;
        this.JVA = new QAg(Looper.getMainLooper(), this);
        this.sLN = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.lk.Lxb
    public boolean Lxb(Object... objArr) {
        Map<String, String> map = this.JXs;
        if (map != null) {
            int iLxb = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(map.get("loop"), 0);
            this.QAg = iLxb;
            if (iLxb <= 0) {
                this.sLN = -1;
            } else {
                this.sLN = iLxb;
            }
            this.nBu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(this.JXs.get("duration"), 0);
        }
        this.JVA.sendEmptyMessageDelayed(1001, this.nBu);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.ebl.QAg.Lxb
    public void Lxb(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        this.Lxb.Lxb(this.LD, this.lc, this.lk.LD());
        int i3 = this.sLN - 1;
        this.sLN = i3;
        if (i3 < 0 && (i2 = this.nBu) != 0) {
            this.JVA.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 > 0 && (i = this.nBu) != 0) {
            this.JVA.sendEmptyMessageDelayed(1001, i);
        } else {
            this.JVA.removeMessages(1001);
        }
    }
}
