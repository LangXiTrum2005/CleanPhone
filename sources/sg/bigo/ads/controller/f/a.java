package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f48139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<InterfaceC0860a> f48140b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0860a {
        void a(boolean z2);
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean zB = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(zB)));
        synchronized (this.f48140b) {
            try {
                for (InterfaceC0860a interfaceC0860a : this.f48140b) {
                    if (interfaceC0860a != null) {
                        interfaceC0860a.a(zB);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void a(Context context, InterfaceC0860a interfaceC0860a) {
        try {
            if (f48139a == null) {
                f48139a = new a();
                sg.bigo.ads.common.d.a.a().a(context, f48139a);
            }
            synchronized (f48139a.f48140b) {
                if (interfaceC0860a != null) {
                    try {
                        f48139a.f48140b.add(interfaceC0860a);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
