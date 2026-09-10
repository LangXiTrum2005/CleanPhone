package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes7.dex */
final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile c f48756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile sg.bigo.ads.common.h.a f48757c;
    private final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicInteger f48755a = new AtomicInteger(0);
    volatile long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile long f48758e = SystemClock.elapsedRealtime();
    final AtomicInteger f = new AtomicInteger(0);

    public e(String str) {
        this.g = (String) m.a(str);
    }

    public final synchronized boolean a() {
        c cVar;
        try {
            if (this.f48756b == null) {
                String str = this.g;
                HashMap map = new HashMap();
                for (String str2 : str.substring(str.indexOf("?") + 1).split(d9.i.f24749c)) {
                    String[] strArrSplit = str2.split(d9.i.f24747b);
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                this.f48757c = sg.bigo.ads.core.player.b.a().g.a((String) map.get("path"), (String) map.get("name"));
                if (this.f48757c == null) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "downloadInfo = null");
                    cVar = null;
                } else {
                    cVar = new c(this.f48757c);
                }
            } else {
                cVar = this.f48756b;
            }
            this.f48756b = cVar;
        } catch (Throwable th) {
            throw th;
        }
        return this.f48756b != null;
    }

    public final synchronized void b() {
        if (this.f48755a.decrementAndGet() <= 0) {
            c cVar = this.f48756b;
            synchronized (cVar.f48772c) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Shutdown proxy for ");
                cVar.d = true;
                cVar.f48771b.b();
            }
            this.f48756b = null;
        }
    }
}
