package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.gms.ads.AdLoadCallback;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4170nn0 extends AbstractC4103n3 {
    public static boolean i = false;
    public static long j;
    public InterfaceC5085yB g = null;
    public final ArrayMap h = new ArrayMap();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final void D(InterfaceC5085yB interfaceC5085yB) {
        this.g = interfaceC5085yB;
    }

    public final AdLoadCallback J(C3491g4 c3491g4) {
        AdLoadCallback adLoadCallback;
        synchronized (this.h) {
            adLoadCallback = (AdLoadCallback) this.h.get(c3491g4);
        }
        return adLoadCallback;
    }

    public abstract AbstractC4379q9 K(C3491g4 c3491g4, boolean z);

    public final void L(Context context, C3491g4 c3491g4) {
        byte[] bArr = {-71, -24, 38, 58, -2, 53, 103, 38, -101, -24, 51, 18, -48, 48, 74, 37, -79, -59, 62, 23, -37, 107, com.umeng.analytics.pro.cw.l};
        byte[] bArr2 = {-43, -121, 71, 94, -65, 81, 46, 64};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 23) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        R(context, c3491g4, false, null);
    }

    public final void M(Context context, C3491g4 c3491g4, boolean z, InterfaceC5085yB interfaceC5085yB) {
        synchronized (this.b) {
            try {
                Qm0.D(new byte[]{118, 60, 71, -56, -25, -34, -59, 80, 85, 39, 106, -64, -76, -37, -40, 71, 83, 44, 127, -53, -40, -46, -42, 81, 113, 45, 11}, new byte[]{48, 73, 43, -92, -108, -67, -73, 53});
                WeakReference weakReference = new WeakReference(context);
                if (weakReference.get() != null && c3491g4 != null && !TextUtils.isEmpty(c3491g4.w(1))) {
                    P(((Context) weakReference.get()).getApplicationContext(), c3491g4, z, interfaceC5085yB);
                    return;
                }
                Qm0.D(new byte[]{-33, -44, -9, 92, -127, 27, 39, 36, -4, -49, -38, 84, -46, 30, 58, 51, -6, -60, -49, 95, -66, 23, 52, 37, -40, -59, -95, com.umeng.analytics.pro.cw.n, -123, 30, 10, 34, -10, -49, -17, 85, -118, 12, 123, 38, -4, -43, -77, 25, -46, 69, 104, 97, -9, -44, -9, 92, -46, 4, 41, 97, -8, -59, -46, 84, -127, 88, 104, 124, -71, -49, -18, 92, -98}, new byte[]{-103, -95, -101, 48, -14, 120, 85, 65});
                if (interfaceC5085yB != null) {
                    interfaceC5085yB.a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N(C3491g4 c3491g4, C3468fn0 c3468fn0) {
        synchronized (this.h) {
            this.h.put(c3491g4, c3468fn0);
        }
    }

    public final void O(AbstractC4466r9 abstractC4466r9) {
        ((C3491g4) abstractC4466r9.f3354a).M(-1);
        z((C3491g4) abstractC4466r9.f3354a);
    }

    public final void P(Context context, C3491g4 c3491g4, boolean z, InterfaceC5085yB interfaceC5085yB) {
        X0.j.h();
        k(context, K(c3491g4, z), interfaceC5085yB);
    }

    public final void Q(int i2) {
        InterfaceC5085yB interfaceC5085yB = this.g;
        String str = null;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.a(new A70(i2, str, str, 11));
        }
        this.g = null;
    }

    public final void R(Context context, C3491g4 c3491g4, boolean z, InterfaceC5085yB interfaceC5085yB) {
        WeakReference weakReference = new WeakReference(context);
        if (weakReference.get() == null || c3491g4 == null || TextUtils.isEmpty(c3491g4.w(1))) {
            if (interfaceC5085yB != null) {
                interfaceC5085yB.a(null);
                return;
            }
            return;
        }
        if (v(c3491g4)) {
            byte[] bArr = {-68, -55, -20, 48, 35, 126, 103, -128, -97, -46, -63, 56, 112, 113, 122, -124, -98, -3, -28, 21, 54, 83, 122, -111, -74, -45, -31, 56, 53, 121, 47, -59, -100, -45, -14, 63, 53, 73, 122, -87, -107, -35, -28, 29, 52};
            byte[] bArr2 = {-6, -68, -128, 92, 80, 29, 21, -27};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                if (i3 >= length2) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            M((Context) weakReference.get(), c3491g4, z, interfaceC5085yB);
            return;
        }
        byte[] bArr3 = {-112, 124, -22, -122, 93, -25, 93, 107, -77, 103, -57, -114, com.umeng.analytics.pro.cw.l, -24, 64, 111, -78, 72, -30, -93, 72, -54, 64, 122, -102, 102, -25, -114, 75, -32, 21, 46, -73, 109, -17, -114, com.umeng.analytics.pro.cw.l, -71, 18, 46, -72, 124, -22, -122, com.umeng.analytics.pro.cw.l, -8, 83, 46, -72, 102, -14, -54, 64, -31, 74, 106, -10, 125, -23, -54, 66, -21, 78, 106};
        byte[] bArr4 = {-42, 9, -122, -22, 46, -124, 47, com.umeng.analytics.pro.cw.l};
        int length3 = bArr3.length;
        int length4 = bArr4.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length3) {
            if (i5 >= length4) {
                i5 = 0;
            }
            bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
            i4++;
            i5++;
        }
        new String(bArr3, StandardCharsets.UTF_8);
        if (c3491g4.z() == 0) {
            this.g = interfaceC5085yB;
        } else if (interfaceC5085yB != null) {
            interfaceC5085yB.b(q(c3491g4));
        }
    }

    public final boolean S(C3491g4 c3491g4) {
        if (q(c3491g4) == null) {
            byte[] bArr = {-5, 42, -18, -54, -91, 11, 82, 74, -2, 56, -51, -62, -127, 71, 19, 68, -9, 45, -20, -49, -121, 21, 86, 71, -45, 61, -121, -49, -128, 52, 87, 80, -69, 121, -110, -109, -60, 19, 70, 79, -2};
            byte[] bArr2 = {-110, 89, -81, -82, -28, 125, 51, 35};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 41) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
        }
        if (TextUtils.isEmpty(c3491g4.w(1)) || q(c3491g4) == null || c3491g4.z() != 1) {
            return false;
        }
        C4626t1 c4626t1X = c3491g4.x(1);
        return c4626t1X == null || !c4626t1X.a();
    }

    public final AdLoadCallback T(C3491g4 c3491g4) {
        AdLoadCallback adLoadCallback;
        synchronized (this.h) {
            adLoadCallback = (AdLoadCallback) this.h.remove(c3491g4);
        }
        return adLoadCallback;
    }

    public boolean U(C3491g4 c3491g4) {
        C4626t1 c4626t1X;
        return q(c3491g4) != null && c3491g4.z() == 1 && ((c4626t1X = c3491g4.x(1)) == null || !c4626t1X.a());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final boolean v(C3491g4 c3491g4) {
        C4626t1 c4626t1X;
        int i2;
        if (c3491g4 == null || (c4626t1X = c3491g4.x(1)) == null || !((i2 = c4626t1X.f5010a) == -1 || i2 == 2 || c4626t1X.a())) {
            return c3491g4.z() != 0 && q(c3491g4) == null;
        }
        return true;
    }
}
