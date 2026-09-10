package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4956wl implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5195a;
    public Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ C4956wl(int i, Object obj, Object obj2) {
        this.f5195a = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        int i = this.f5195a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((NN) obj).a();
            default:
                return ((InterfaceC2867Wt) obj).a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        int i = this.f5195a;
        Object obj = this.d;
        switch (i) {
            case 0:
                try {
                    Object obj2 = this.b;
                    ((NN) obj).getClass();
                    ((InputStream) obj2).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            default:
                Object obj3 = this.b;
                if (obj3 != null) {
                    try {
                        ((InterfaceC2867Wt) obj).b(obj3);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        int i = this.f5195a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                try {
                    ((NN) obj2).getClass();
                    ByteArrayInputStream byteArrayInputStreamI = NN.i((String) obj);
                    this.b = byteArrayInputStreamI;
                    interfaceC3463fl.k(byteArrayInputStreamI);
                } catch (IllegalArgumentException e) {
                    interfaceC3463fl.d(e);
                }
                break;
            default:
                try {
                    Object objQ = ((InterfaceC2867Wt) obj2).q((File) obj);
                    this.b = objQ;
                    interfaceC3463fl.k(objQ);
                } catch (FileNotFoundException e2) {
                    interfaceC3463fl.d(e2);
                    return;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}
