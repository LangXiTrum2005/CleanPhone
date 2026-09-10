package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.Tasks;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4969wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5203a = Qm0.D(new byte[]{30, -83, 122}, new byte[]{119, -39, 17, 28, 18, 119, 122, -10});
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final ArrayList f;
    public static int g;

    static {
        Qm0.D(new byte[]{99, -22, 29, -103, -6, 41, 113, -47, 118, -42, 38, -106, -17, 60}, new byte[]{19, -119, 66, -9, -101, 93, 24, -89});
        b = Qm0.D(new byte[]{com.umeng.analytics.pro.cw.k, -81, 102, -91, 30, -10, -84, -17, com.umeng.analytics.pro.cw.k, -75, 117, -66, 45, -14, -107, -23, com.umeng.analytics.pro.cw.k, -77, 88, -95, 19, -6, -97, -8, 12}, new byte[]{104, -63, 7, -57, 114, -109, -13, -99});
        c = Qm0.D(new byte[]{9, -34, 116, 86, 23, 27, 38, -62, 21, -49, 125, 75, 0, 30, 21, -12, com.umeng.analytics.pro.cw.m, -46, 117, 92}, new byte[]{123, -69, 24, 57, 118, 127, 121, -85});
        d = Qm0.D(new byte[]{-19, -119, -35, -122, -50, -42, 5, -97, -10, -126, -49, -111, -39, -45, 12, -84, -64, -104, -46, -103, -50}, new byte[]{-97, -20, -69, -12, -85, -91, 109, -64});
        e = Qm0.D(new byte[]{-48, -23, 4, 65, -69, 27, 95, -64, -59, -18, 4, 80, -80, 8, 80, -36, -40, -1, 58, 71, -80, 37, 88, -36, -49}, new byte[]{-74, -117, 91, 32, -43, 122, 51, -71});
        Qm0.D(new byte[]{20, -104, 38, -52, 43, -20, -56, 58, 28, -121, 0, -39, 44, -20, -51, 61, com.umeng.analytics.pro.cw.l, -118, 27, -58, 44, -20, -37, 49, com.umeng.analytics.pro.cw.k, -124, 11, -34, 22, -40, -52, 45}, new byte[]{125, -21, 121, -86, 73, -77, -87, 84});
        Qm0.D(new byte[]{-79, -77, 118, -57, -114, 18, 116, -2, -79, -75, 69, -61, -89, 0, 109, -13, -77, -78}, new byte[]{-48, -41, 41, -90, -8, 115, 29, -110});
        Qm0.D(new byte[]{75, 50, -7, -57, -13, 60, 74, 92, 64, 58, -27, -61, -10, 56, 75}, new byte[]{com.umeng.analytics.pro.cw.k, 91, -117, -94, -111, 93, 57, 57});
        f = new ArrayList();
        g = 0;
    }

    public static synchronized void a(InterfaceC2647Oh interfaceC2647Oh) {
        try {
            int i = g;
            if (i == 0) {
                if (interfaceC2647Oh != null) {
                    f.add(interfaceC2647Oh);
                }
            } else {
                if (i == 1) {
                    interfaceC2647Oh.b();
                } else {
                    interfaceC2647Oh.a();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void b() {
        int i = 6;
        byte[] bArr = {108, 49, 101, 6, 101, -21, 21, 106, 103, 62, 127, 23, 96, -19, 9, 105, 108, 56, 34, 92};
        byte[] bArr2 = {5, 95, 12, 114, 35, -126, 103, com.umeng.analytics.pro.cw.m};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 20) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        g = 0;
        if (!AbstractApplicationC2673Ph.m.d()) {
            C4266ou.f(AbstractApplicationC2673Ph.m);
        }
        long j = C2881Xh.j;
        D90 d90 = new D90();
        d90.f2959a = 60L;
        d90.b = 0L;
        C2375Du c2375DuA = C2375Du.a();
        c2375DuA.getClass();
        Tasks.call(c2375DuA.c, new GJ(3, c2375DuA, d90));
        C2375Du c2375DuA2 = C2375Du.a();
        C2881Xh c2881Xh = c2375DuA2.f;
        C3633hi c3633hi = c2881Xh.h;
        c3633hi.getClass();
        long j2 = c3633hi.f4465a.getLong("minimum_fetch_interval_in_seconds", j);
        HashMap map = new HashMap(c2881Xh.i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        c2881Xh.f.b().continueWithTask(c2881Xh.c, new C5035xg0(c2881Xh, j2, map)).onSuccessTask(EnumC4354pu.f4856a, new C2953a0(i)).onSuccessTask(c2375DuA2.c, new C2349Cu(c2375DuA2)).addOnCompleteListener(new G7());
    }
}
