package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class HandlerC3453c5 extends Handler {
    private static final String b = "DownloadHandler";
    Jc a;

    public HandlerC3453c5(Looper looper) {
        super(looper);
    }

    public void a(Jc jc) {
        if (jc == null) {
            throw new IllegalArgumentException();
        }
        this.a = jc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Jc jc = this.a;
        if (jc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                jc.a((C3824x8) message.obj);
            } else {
                this.a.a((C3824x8) message.obj, new C3671o8(i, C3500eg.a(i)));
            }
        } catch (Throwable th) {
            C3631m4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
