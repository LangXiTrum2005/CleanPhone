package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4982x3 extends AbstractC4170nn0 implements InterfaceC4733uB {
    public static final C4982x3 k = new C4982x3();

    public static void V(Activity activity, D3 d3, ES es) {
        C4894w3 c4894w3 = new C4894w3(es);
        if (Y()) {
            C3 c3Z = C3.Z();
            C3491g4 c3491g4 = Z().h;
            String str = (String) d3.b;
            int i = d3.d;
            c3Z.getClass();
            c3Z.Y(activity, new D3(c3491g4, str, d3.g, d3.h, d3.e, d3.f, i, true), c4894w3);
            return;
        }
        C3 c3Z2 = C3.Z();
        String str2 = (String) d3.b;
        int i2 = d3.d;
        c3Z2.getClass();
        boolean zU = c3Z2.U(C3.a0().d);
        Dialog dialog = d3.g;
        long j = d3.h;
        int i3 = d3.e;
        boolean z = d3.f;
        if (zU) {
            c3Z2.Y(activity, new D3(C3.a0().d, str2, dialog, j, i3, z, i2, true), c4894w3);
            return;
        }
        C3.a0().getClass();
        if (!c3Z2.U(null)) {
            c3Z2.Y(activity, new D3(C3.a0().d, str2, dialog, j, i3, z, i2, true), c4894w3);
        } else {
            C3.a0().getClass();
            c3Z2.Y(activity, new D3(null, str2, dialog, j, i3, z, i2, true), c4894w3);
        }
    }

    public static synchronized C4982x3 X() {
        return k;
    }

    public static boolean Y() {
        return (Z().h == null || TextUtils.isEmpty(Z().h.w(1))) ? false : true;
    }

    public static C2346Cr Z() {
        return ((Om0) X0.j.k()).c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final AbstractC4379q9 K(C3491g4 c3491g4, boolean z) {
        return new C2372Dr(c3491g4, true, true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final boolean U(C3491g4 c3491g4) {
        if (Z().i == 1 && c3491g4 != null) {
            return C3.Z().U(c3491g4);
        }
        if (Z().i == 2 && c3491g4 != null) {
            return C3927l3.C.U(c3491g4);
        }
        C3 c3Z = C3.Z();
        c3Z.getClass();
        if (c3Z.U(C3.a0().d)) {
            return true;
        }
        C3.a0().getClass();
        return c3Z.U(null);
    }

    public final void W(Context context, C2372Dr c2372Dr) {
        X0.j.h();
        if (Z().i == 1 && Z().h != null) {
            byte[] bArr = {-40, 96, -10, -43, 2, -118, -115, -37, -15, 97, -29, -44, 57, -91, -99, -98, -17, 125};
            byte[] bArr2 = {-99, com.umeng.analytics.pro.cw.l, -126, -80, 112, -53, -23, -5};
            int i = 0;
            int i2 = 0;
            while (i < 18) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            C3491g4 c3491g4 = (C3491g4) c2372Dr.f3354a;
            boolean z = c2372Dr.d;
            C4718u3 c4718u3 = new C4718u3(this, context);
            if (z) {
                C3.Z().M(context, c3491g4, true, c4718u3);
                return;
            } else {
                C3.Z().R(context, c3491g4, true, c4718u3);
                return;
            }
        }
        if (Z().i != 2 || Z().h == null) {
            byte[] bArr3 = {66, 83, -85, 30, -6, -35, 54, -118, 107, 82, -66, 31, -88, -14, 61, -34, 111, 84, -79, 28};
            byte[] bArr4 = {7, 61, -33, 123, -120, -100, 82, -86};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 20) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            return;
        }
        byte[] bArr5 = {-123, -73, 52, -19, 5, 82, 24, -32, -84, -74, 33, -20, 54, 99, 12, -113, -80, -68, 46, -55, 19};
        byte[] bArr6 = {-64, -39, 64, -120, 119, 19, 124, -64};
        int i5 = 0;
        int i6 = 0;
        while (i5 < 21) {
            if (i6 >= 8) {
                i6 = 0;
            }
            bArr5[i5] = (byte) (bArr5[i5] ^ bArr6[i6]);
            i5++;
            i6++;
        }
        new String(bArr5, StandardCharsets.UTF_8);
        C3491g4 c3491g5 = (C3491g4) c2372Dr.f3354a;
        boolean z2 = c2372Dr.d;
        C4806v3 c4806v3 = new C4806v3(this, context);
        if (z2) {
            C3927l3.C.M(context, c3491g5, true, c4806v3);
        } else {
            C3927l3.C.R(context, c3491g5, true, c4806v3);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4733uB
    public final void e(Activity activity, int i, ES es) {
        int i2 = 23;
        D3 d3 = new D3(Z().h, "Inter_EnterSupplement", i, 1, 0);
        X0.j.h();
        if (Z().i == 1 && Z().h != null) {
            byte[] bArr = {-116, -118, 55, -94, 84, 42, -83, 40, -91, -105, 43, -88, 81, 46, -89, 124, -84, -106, 10, -87, 82, com.umeng.analytics.pro.cw.l, -69, 123, -23, -95, com.umeng.analytics.pro.cw.k, -109, 99, 57, -106, 65, -121, -80, 6, -107, 117, 52, -120, 76};
            byte[] bArr2 = {-55, -28, 67, -57, 38, 107, -55, 8};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 40) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i4]);
                i3++;
                i4++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            V(activity, d3, es);
            return;
        }
        if (Z().i != 2 || Z().h == null) {
            byte[] bArr3 = {86, -50, -13, 90, 47, 17, -126, -59, 96, -56, -24, 72, 24, 62, -110, -128, 97, -17, -9, 90, 51, 17, -126};
            byte[] bArr4 = {19, -96, -121, 63, 93, 80, -26, -27};
            int i5 = 0;
            int i6 = 0;
            while (i5 < 23) {
                if (i6 >= 8) {
                    i6 = 0;
                }
                bArr3[i5] = (byte) (bArr3[i5] ^ bArr4[i6]);
                i5++;
                i6++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            V(activity, d3, es);
            return;
        }
        byte[] bArr5 = {61, -61, -49, -42, -25, -109, 54, -96, 11, -59, -44, -60, -48, -68, 38, -27, 10, -30, -53, -42, -5, -109, 54, -96, 61, -29, -17, -10, -57, -115, 29, -48, 61, -29, -28, -14, -47};
        byte[] bArr6 = {120, -83, -69, -77, -107, -46, 82, -128};
        int i7 = 0;
        int i8 = 0;
        while (i7 < 37) {
            if (i8 >= 8) {
                i8 = 0;
            }
            bArr5[i7] = (byte) (bArr5[i7] ^ bArr6[i8]);
            i7++;
            i8++;
        }
        new String(bArr5, StandardCharsets.UTF_8);
        C3927l3 c3927l3 = C3927l3.C;
        C3491g4 c3491g4 = (C3491g4) d3.f3354a;
        String str = (String) d3.b;
        int i9 = d3.d;
        C3491g4 c3491g5 = new C3491g4(this, es, i2);
        c3927l3.getClass();
        J5 j5 = new J5(c3491g4, str, d3.g, d3.h, d3.e, d3.f, i9);
        j5.i = true;
        c3927l3.Y(activity, j5, c3491g5);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final /* bridge */ /* synthetic */ void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        AbstractC3950lJ.z(interfaceC5085yB);
        W(context, (C2372Dr) c9);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final /* bridge */ /* synthetic */ AbstractC4642t9 r() {
        return Z();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        return new C2372Dr(c3491g4, false, true);
    }
}
