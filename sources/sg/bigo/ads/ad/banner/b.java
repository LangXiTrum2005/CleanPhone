package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC0789b, a> f45517a = new WeakHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f45518a;

        private a() {
            this.f45518a = new long[9];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC0789b {
    }

    public static <T extends Ad> long a(InterfaceC0789b interfaceC0789b, long j) {
        if (j == -1) {
            return -1L;
        }
        return j - j(interfaceC0789b).f45518a[4];
    }

    public static <T extends Ad> void b(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 1);
    }

    public static <T extends Ad> void c(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 2);
    }

    public static <T extends Ad> void d(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 3);
    }

    public static <T extends Ad> void e(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 4);
    }

    public static <T extends Ad> void f(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 5);
    }

    public static <T extends Ad> void g(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 6);
    }

    public static <T extends Ad> void h(InterfaceC0789b interfaceC0789b) {
        f45517a.remove(interfaceC0789b);
    }

    public static <T extends Ad> long i(InterfaceC0789b interfaceC0789b) {
        long[] jArr = j(interfaceC0789b).f45518a;
        return jArr[6] - jArr[4];
    }

    private static <T extends Ad> a j(InterfaceC0789b interfaceC0789b) {
        Map<InterfaceC0789b, a> map = f45517a;
        a aVar = map.get(interfaceC0789b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC0789b, aVar2);
        return aVar2;
    }

    public static <T extends Ad> void a(InterfaceC0789b interfaceC0789b) {
        a(interfaceC0789b, 0);
    }

    private static <T extends Ad> void a(InterfaceC0789b interfaceC0789b, int i2) {
        j(interfaceC0789b).f45518a[i2] = SystemClock.elapsedRealtime();
    }
}
