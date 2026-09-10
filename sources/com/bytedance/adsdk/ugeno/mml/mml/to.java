package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class to extends lnr implements com.bytedance.adsdk.ugeno.wd.tvp.qdl {
    private Handler exu;
    private int fs;
    private int rdp;
    private int rq;

    public to(Context context) {
        super(context);
        this.fs = 0;
        this.exu = new com.bytedance.adsdk.ugeno.wd.tvp(Looper.getMainLooper(), this);
        this.rdp = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        Map<String, String> map = this.mzz;
        if (map != null) {
            int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(map.get("loop"), 0);
            this.rq = iQdl;
            if (iQdl <= 0) {
                this.rdp = -1;
            } else {
                this.rdp = iQdl;
            }
            this.fs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("duration"), 0);
        }
        this.exu.sendEmptyMessageDelayed(1001, this.fs);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        int i2;
        int i3;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.rdp);
        this.qdl.qdl(this.ud, this.mo, this.lnr.ud());
        int i4 = this.rdp + (-1);
        this.rdp = i4;
        if (i4 < 0 && (i3 = this.fs) != 0) {
            this.exu.sendEmptyMessageDelayed(1001, i3);
        } else if (i4 > 0 && (i2 = this.fs) != 0) {
            this.exu.sendEmptyMessageDelayed(1001, i2);
        } else {
            this.exu.removeMessages(1001);
        }
    }
}
