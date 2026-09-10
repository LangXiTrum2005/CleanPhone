package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnDrawListenerC4487rT implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4931a;
    public final /* synthetic */ C4663tT b;

    public ViewTreeObserverOnDrawListenerC4487rT(C4663tT c4663tT, List list) {
        this.b = c4663tT;
        this.f4931a = list;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        synchronized (this) {
            try {
                if (this.b.h() && ((ViewGroup) this.b.d.get()).isShown()) {
                    C4663tT c4663tT = this.b;
                    if (!c4663tT.e) {
                        c4663tT.e = true;
                        C4312pT c4312pT = C4312pT.n;
                        if (c4312pT.e) {
                            c4312pT.e = false;
                            if (this.f4931a != null) {
                                c4312pT.h();
                            }
                        }
                    }
                } else {
                    C4663tT c4663tT2 = this.b;
                    if (c4663tT2.e) {
                        c4663tT2.e = false;
                        if (this.f4931a != null) {
                            C4312pT.n.h();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
