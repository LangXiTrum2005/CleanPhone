package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2849Wb implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3928a;
    public final Object b;

    public /* synthetic */ C2849Wb(Object obj, int i) {
        this.f3928a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        switch (this.f3928a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        int i = this.f3928a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    interfaceC3463fl.k(AbstractC3092bc.a((File) obj));
                } catch (IOException e) {
                    interfaceC3463fl.d(e);
                    return;
                }
                break;
            default:
                interfaceC3463fl.k(obj);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}
