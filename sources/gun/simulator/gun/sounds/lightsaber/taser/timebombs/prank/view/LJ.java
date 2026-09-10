package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class LJ implements InterfaceC3513gK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3347a;
    public final WeakReference b;

    public LJ(LottieAnimationView lottieAnimationView, int i) {
        this.f3347a = i;
        if (i != 1) {
            this.b = new WeakReference(lottieAnimationView);
        } else {
            this.b = new WeakReference(lottieAnimationView);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3513gK
    public final void onResult(Object obj) {
        WeakReference weakReference = this.b;
        switch (this.f3347a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.d;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    InterfaceC3513gK interfaceC3513gK = lottieAnimationView.c;
                    if (interfaceC3513gK == null) {
                        interfaceC3513gK = LottieAnimationView.n;
                    }
                    interfaceC3513gK.onResult(th);
                    break;
                }
                break;
            default:
                MJ mj = (MJ) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(mj);
                    break;
                }
                break;
        }
    }
}
