package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC0296d5 extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28418b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Oc f28419a;

    public HandlerC0296d5(Looper looper) {
        super(looper);
    }

    public void a(Oc oc2) {
        if (oc2 == null) {
            throw new IllegalArgumentException();
        }
        this.f28419a = oc2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Oc oc2 = this.f28419a;
        if (oc2 == null) {
            Logger.i(f28418b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                oc2.a((C0693z8) message.obj);
            } else {
                this.f28419a.a((C0693z8) message.obj, new C0532q8(i10, C0665xg.a(i10)));
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            Logger.i(f28418b, "handleMessage | Got exception: " + th2.getMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a() {
        this.f28419a = null;
    }
}
