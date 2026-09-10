package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class CE extends PE implements InterfaceC2880Xg {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CE(InterfaceC5000xE interfaceC5000xE) {
        super(true);
        boolean z = true;
        Q(interfaceC5000xE);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PE.b;
        InterfaceC2489Ie interfaceC2489Ie = (InterfaceC2489Ie) atomicReferenceFieldUpdater.get(this);
        C2515Je c2515Je = interfaceC2489Ie instanceof C2515Je ? (C2515Je) interfaceC2489Ie : null;
        if (c2515Je == null) {
            z = false;
            break;
        }
        PE peI = c2515Je.i();
        while (!peI.K()) {
            InterfaceC2489Ie interfaceC2489Ie2 = (InterfaceC2489Ie) atomicReferenceFieldUpdater.get(peI);
            C2515Je c2515Je2 = interfaceC2489Ie2 instanceof C2515Je ? (C2515Je) interfaceC2489Ie2 : null;
            if (c2515Je2 == null) {
                z = false;
                break;
            }
            peI = c2515Je2.i();
        }
        this.c = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final boolean K() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final boolean L() {
        return true;
    }
}
