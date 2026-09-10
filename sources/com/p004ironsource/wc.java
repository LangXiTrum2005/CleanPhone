package com.p004ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class wc extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, rp> f27569a;

    public wc(Looper looper) {
        super(looper);
        this.f27569a = new ConcurrentHashMap<>();
    }

    public void a(String str, rp rpVar) {
        if (str == null || rpVar == null) {
            return;
        }
        this.f27569a.put(str, rpVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            vh vhVar = (vh) message.obj;
            String path = vhVar.getPath();
            rp rpVar = this.f27569a.get(path);
            if (rpVar == null) {
                return;
            }
            if (a(message.what)) {
                rpVar.a(vhVar);
            } else {
                int i2 = message.what;
                rpVar.a(vhVar, new nh(i2, sw.a(i2)));
            }
            this.f27569a.remove(path);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private boolean a(int i2) {
        return i2 == 1016 || i2 == 1015;
    }
}
