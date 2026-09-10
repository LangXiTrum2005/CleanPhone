package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3420fF implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4361a;

    public /* synthetic */ C3420fF(int i) {
        this.f4361a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        switch (this.f4361a) {
            case 0:
                throw new C3823jr("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC3609hS interfaceC3609hS = (InterfaceC3609hS) obj2;
                Charset charset = C4930wW.f;
                interfaceC3609hS.c(C4930wW.g, entry.getKey());
                interfaceC3609hS.c(C4930wW.h, entry.getValue());
                return;
            default:
                throw new C3823jr("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
