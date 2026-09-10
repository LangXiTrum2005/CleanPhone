package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5037xh0 implements InterfaceC4861vh0, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f5241a;
    public Md0 b;

    public C5037xh0(DisplayManager displayManager) {
        this.f5241a = displayManager;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4861vh0
    public final void a() {
        this.f5241a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4861vh0
    public final void b(Md0 md0) {
        this.b = md0;
        Handler handlerM = Ug0.m(null);
        DisplayManager displayManager = this.f5241a;
        displayManager.registerDisplayListener(this, handlerM);
        md0.a(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        Md0 md0 = this.b;
        if (md0 == null || i != 0) {
            return;
        }
        md0.a(this.f5241a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
