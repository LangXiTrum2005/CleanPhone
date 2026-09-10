package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2456Gx implements InterfaceC5171z90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f3145a;

    public C2456Gx(TaskCompletionSource taskCompletionSource) {
        this.f3145a = taskCompletionSource;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5171z90
    public final boolean a(C3761j8 c3761j8) {
        EnumC3699iU enumC3699iU = EnumC3699iU.c;
        EnumC3699iU enumC3699iU2 = c3761j8.b;
        if (enumC3699iU2 != enumC3699iU && enumC3699iU2 != EnumC3699iU.d && enumC3699iU2 != EnumC3699iU.e) {
            return false;
        }
        this.f3145a.trySetResult(c3761j8.f4538a);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5171z90
    public final boolean b(Exception exc) {
        return false;
    }
}
