package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC3394f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4343a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ InterfaceC5085yB d;
    public final /* synthetic */ C9 e;
    public final /* synthetic */ AbstractC3570h f;

    public RunnableC3394f(AbstractC3570h abstractC3570h, C9 c9, InterfaceC5085yB interfaceC5085yB, Object obj, WeakReference weakReference) {
        this.f = abstractC3570h;
        this.b = obj;
        this.c = weakReference;
        this.d = interfaceC5085yB;
        this.e = c9;
        this.f4343a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.c;
        Object obj = weakReference.get();
        InterfaceC5085yB interfaceC5085yB = this.d;
        if (obj == null) {
            if (interfaceC5085yB != null) {
                interfaceC5085yB.a(null);
                return;
            }
            return;
        }
        AbstractApplicationC2673Ph abstractApplicationC2673PhG = C3044b1.b.g();
        C9 c9 = this.e;
        AbstractC3570h abstractC3570h = this.f;
        if ((abstractApplicationC2673PhG != null && AbstractApplicationC2673Ph.c()) || !W1.a((Context) weakReference.get())) {
            String str = abstractC3570h.f4440a;
            byte[] bArr = {-57, 10, -45, 96, 38, -48, 115, -39, -58, 27, -63, 122, 19, -26, 65, -41, -47, com.umeng.analytics.pro.cw.n, -2, 125, 51, -26, 115, -37, -114, 94, -37, 97, 19, -14, 102, -3, -43, 29, -39, 117, 32, -19, 99, -47, -48, 94, -50, 50, 55, -16, 100, -48, -58, 94, -36, 119, 38, -94, 54, -49, -37, com.umeng.analytics.pro.cw.k, -58, 86, 55, -18, 119, -58, -32, 17, -1, 115, 59, -20, 66, -41, -58, 27, -45, 118};
            byte[] bArr2 = {-76, 126, -78, 18, 82, -126, 22, -65};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            C4981x20.u().v(abstractC3570h.t((C3491g4) c9.f3354a), this);
            return;
        }
        String str2 = abstractC3570h.f4440a;
        byte[] bArr3 = {-122, 86, -90, 92, 0, -68, -39, 119, -111, 118, -90, 93, 31, -89, -34, 127, -103, 71, -127, 79, 29, -100, -45, 114, -49, 2, -85, 65, 21, -108, -9, 114};
        byte[] bArr4 = {-11, 34, -57, 46, 116, -16, -74, 22};
        int length3 = bArr3.length;
        int length4 = bArr4.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length3) {
            if (i4 >= length4) {
                i4 = 0;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
            i3++;
            i4++;
        }
        new String(bArr3, StandardCharsets.UTF_8);
        c9.d = false;
        abstractC3570h.B(this.f4343a);
        abstractC3570h.k(((Context) weakReference.get()).getApplicationContext(), c9, interfaceC5085yB);
    }
}
