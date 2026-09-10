package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnDrawListenerC4367q3 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4866a;
    public final ViewGroup b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ AbstractC4454r3 d;

    public ViewTreeObserverOnDrawListenerC4367q3(AbstractC4454r3 abstractC4454r3, String str, ViewGroup viewGroup) {
        this.d = abstractC4454r3;
        this.c = viewGroup;
        this.f4866a = str;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.d.Q(this.b, this.f4866a);
        AbstractC4454r3 abstractC4454r3 = this.d;
        if (((H9) abstractC4454r3.r()).d == 0 || AbstractC2340Cl.B() == null || !(!AbstractC2340Cl.w(AbstractC2340Cl.B()).isEmpty())) {
            return;
        }
        synchronized (abstractC4454r3.b) {
            try {
                ArrayList<View> arrayListW = AbstractC2340Cl.w(AbstractC2340Cl.B());
                if (!arrayListW.isEmpty()) {
                    for (View view : arrayListW) {
                        if (view.getClass().getSimpleName().contains(Qm0.D(new byte[]{-104, -115, -119, 75, -127, 17, -84, -33, -89, -112, -81, 87, -108, 34}, new byte[]{-56, -30, -7, 62, -15, 85, -55, -68})) && AbstractC4454r3.d0(view, Qm0.D(new byte[]{-48, com.umeng.analytics.pro.cw.l, -55, -90, 126, -42, 78, -42, -33, 4, -118, -23, 119, -35, 83, -34, -38, 5, -118, -17, 116, -54, com.umeng.analytics.pro.cw.m, -48, -41, 18, -118, -31, 119, -51, 68, -61, -35, 0, -56, -90, 110, -36, 67, -57, -38, 4, -45, -90, 120, -37}, new byte[]{-77, 97, -92, -120, 25, -71, 33, -79})) && view.getVisibility() == 0) {
                            int i = ((H9) abstractC4454r3.r()).d;
                            if (i == 1) {
                                abstractC4454r3.x0();
                                abstractC4454r3.p0();
                                abstractC4454r3.u0();
                            } else if (i == 2) {
                                abstractC4454r3.u0();
                            } else if (i == 3) {
                                abstractC4454r3.p0();
                            } else if (i == 4) {
                                abstractC4454r3.x0();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
