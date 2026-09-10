package androidx.core.view;

import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.f35a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) obj);
                break;
            default:
                ((InterfaceC2714Qw) obj).invoke();
                break;
        }
    }
}
