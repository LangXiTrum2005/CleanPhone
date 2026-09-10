package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3482g implements JS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f4394a;
    public final /* synthetic */ C9 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ InterfaceC5085yB d;
    public final /* synthetic */ AbstractC3570h e;

    public C3482g(AbstractC3570h abstractC3570h, C9 c9, InterfaceC5085yB interfaceC5085yB, Object obj, WeakReference weakReference) {
        this.e = abstractC3570h;
        this.f4394a = weakReference;
        this.b = c9;
        this.c = obj;
        this.d = interfaceC5085yB;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JS
    public final void a(int i) {
        AbstractC3570h abstractC3570h = this.e;
        String str = abstractC3570h.f4440a;
        Qm0.D(new byte[]{72, 121, 50, 36, -60, -100, 106, 112, 69, 116, 39, 61, -52, -117, 101, 106, 6, 111, 50, 50, -33, -101, 114, 112, 27, 60}, new byte[]{38, 28, 70, 83, -85, -18, 1, 80});
        C3044b1 c3044b1 = C3044b1.b;
        if (c3044b1.h()) {
            WeakReference weakReference = this.f4394a;
            if (weakReference.get() == null) {
                Qm0.D(new byte[]{126, 51, -51, -102, 59, -102, 59, -28, 75, 56, -104, -33, 48, -105, 55, -28, 83, 57, -104, -104, 9, -106, 22, -28, 78, 48, -36, -4, 41, -111, 32, -2, 85, 37, -106, -35, 45, -122, 21, -11, 101, 41, -47, -42, 44, -105, 38, -71, com.umeng.analytics.pro.cw.l, 114, -38, -49, 33, -98, 48, -71, 70, 44, -56, -106, 104, -109, 48, -45, 82, 53, -44, -34, 45, -128, 125, -77, 7, 58, -47, -56, 59, -122, 56, -24, 6}, new byte[]{39, 92, -72, -70, 72, -14, 84, -111});
                return;
            }
            if (i == 0) {
                boolean zC = AbstractApplicationC2673Ph.c();
                Object obj = this.c;
                C9 c9 = this.b;
                InterfaceC5085yB interfaceC5085yB = this.d;
                if (zC) {
                    abstractC3570h.G((Context) weakReference.get(), c9, obj, interfaceC5085yB);
                    return;
                }
                Qm0.D(new byte[]{com.umeng.analytics.pro.cw.k, 47, 115, -1, 26, 123, -50, 115, com.umeng.analytics.pro.cw.n, 43, 123, -80, 26, 123, -50, 104, 23, 47, 113, -80, 21, 122, -102, 104, com.umeng.analytics.pro.cw.n, 56, 116, -80, 26, 105, -113, 118, 19, 43, 125, -4, 30}, new byte[]{127, 74, 31, -112, 123, 31, -18, 31});
                c3044b1.g().getClass();
                if (AbstractC4969wu.g == 2) {
                    AbstractC4969wu.b();
                }
                if (c3044b1.g() == null || AbstractApplicationC2673Ph.c()) {
                    return;
                }
                abstractC3570h.A(obj);
                abstractC3570h.w((C3491g4) c9.f3354a);
                abstractC3570h.k(((Context) weakReference.get()).getApplicationContext(), c9, interfaceC5085yB);
            }
        }
    }
}
