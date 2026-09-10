package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends ik implements com.bytedance.adsdk.ugeno.xha.jbs.ri {
    private Handler aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18022co;
    private int sf;

    public qt(Context context) {
        super(context);
        this.f18022co = 0;
        this.aw = new com.bytedance.adsdk.ugeno.xha.jbs(Looper.getMainLooper(), this);
        this.bgr = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        Map<String, String> map = this.fi;
        if (map != null) {
            int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(map.get("loop"), 0);
            this.sf = iRi;
            if (iRi <= 0) {
                this.bgr = -1;
            } else {
                this.bgr = iRi;
            }
            this.f18022co = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get(IronSourceConstants.EVENTS_DURATION), 0);
        }
        this.aw.sendEmptyMessageDelayed(1001, this.f18022co);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.ri
    public void ri(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        this.ri.ri(this.lr, this.di, this.ik.lr());
        int i3 = this.bgr - 1;
        this.bgr = i3;
        if (i3 < 0 && (i2 = this.f18022co) != 0) {
            this.aw.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 > 0 && (i = this.f18022co) != 0) {
            this.aw.sendEmptyMessageDelayed(1001, i);
        } else {
            this.aw.removeMessages(1001);
        }
    }
}
