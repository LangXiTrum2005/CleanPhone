package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2430Fx implements InterfaceC5171z90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yg0 f3095a;
    public final TaskCompletionSource b;

    public C2430Fx(Yg0 yg0, TaskCompletionSource taskCompletionSource) {
        this.f3095a = yg0;
        this.b = taskCompletionSource;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5171z90
    public final boolean a(C3761j8 c3761j8) {
        if (c3761j8.b != EnumC3699iU.d || this.f3095a.a(c3761j8)) {
            return false;
        }
        String str = c3761j8.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new C3146c8(str, c3761j8.e, c3761j8.f));
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5171z90
    public final boolean b(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }
}
