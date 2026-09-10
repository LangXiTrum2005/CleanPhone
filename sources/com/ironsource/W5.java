package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class W5 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Oc> f27526a;

    public W5(Looper looper) {
        super(looper);
        this.f27526a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C0693z8 c0693z8 = (C0693z8) message.obj;
            String path = c0693z8.getPath();
            Oc oc2 = this.f27526a.get(path);
            if (oc2 == null) {
                return;
            }
            if (a(message.what)) {
                oc2.a(c0693z8);
            } else {
                int i10 = message.what;
                oc2.a(c0693z8, new C0532q8(i10, C0665xg.a(i10)));
            }
            this.f27526a.remove(path);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a(String str, Oc oc2) {
        if (str == null || oc2 == null) {
            return;
        }
        this.f27526a.put(str, oc2);
    }
}
