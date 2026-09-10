package com.p004ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class fb extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25009b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    rp f25010a;

    public fb(Looper looper) {
        super(looper);
    }

    public void a() {
        this.f25010a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        rp rpVar = this.f25010a;
        if (rpVar == null) {
            Logger.i(f25009b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i2 = message.what;
            if (i2 == 1016) {
                rpVar.a((vh) message.obj);
            } else {
                this.f25010a.a((vh) message.obj, new nh(i2, sw.a(i2)));
            }
        } catch (Throwable th) {
            StringBuilder sbP = a.p("handleMessage | Got exception: ", th);
            sbP.append(th.getMessage());
            Logger.i(f25009b, sbP.toString());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(rp rpVar) {
        if (rpVar == null) {
            throw new IllegalArgumentException();
        }
        this.f25010a = rpVar;
    }
}
