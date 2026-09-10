package p7;

import an.p;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import l7.s;
import q7.b0;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48263a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f48264b = new HashMap();

    public static final void a(String str) {
        if (v7.a.b(b.class)) {
            return;
        }
        try {
            f48263a.b(str);
        } catch (Throwable th2) {
            v7.a.a(b.class, th2);
        }
    }

    public static final boolean c() {
        if (v7.a.b(b.class)) {
            return false;
        }
        try {
            r rVarB = u.b(s.c());
            return rVarB != null && rVarB.f48759c.contains(b0.f48666c);
        } catch (Throwable th2) {
            v7.a.a(b.class, th2);
            return false;
        }
    }

    public final void b(String str) {
        HashMap map = f48264b;
        if (v7.a.b(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
            if (registrationListener != null) {
                Object systemService = s.b().getSystemService("servicediscovery");
                n.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    e0.A("p7.b", e10);
                }
                map.remove(str);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final boolean d(String str) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            HashMap map = f48264b;
            if (map.containsKey(str)) {
                return true;
            }
            s sVar = s.f45212a;
            String str2 = "fbsdk_" + "android-".concat(p.m0("18.3.0", '.', '|')) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = s.b().getSystemService("servicediscovery");
            n.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            a aVar = new a(str2, str);
            map.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
