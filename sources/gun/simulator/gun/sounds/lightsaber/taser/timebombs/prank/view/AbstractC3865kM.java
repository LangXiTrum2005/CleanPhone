package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3865kM extends AbstractC3744j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4123nG f4595a;
    public final InterfaceC4123nG b;

    public AbstractC3865kM(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2) {
        this.f4595a = interfaceC4123nG;
        this.b = interfaceC4123nG2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Map map, boolean z) {
        int iK;
        AbstractC2995aW.q(map, "builder");
        C4007lz c4007lz = ((C4095mz) this).d;
        Object objZ = interfaceC4421qh.z(c4007lz, i, this.f4595a, null);
        if (z) {
            iK = interfaceC4421qh.k(c4007lz);
            if (iK != i + 1) {
                throw new IllegalArgumentException(AbstractC3888ke0.h("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iK).toString());
            }
        } else {
            iK = i + 1;
        }
        boolean zContainsKey = map.containsKey(objZ);
        InterfaceC4123nG interfaceC4123nG = this.b;
        map.put(objZ, (!zContainsKey || (interfaceC4123nG.getDescriptor().getKind() instanceof DV)) ? interfaceC4421qh.z(c4007lz, iK, interfaceC4123nG, null) : interfaceC4421qh.z(c4007lz, iK, interfaceC4123nG, U5.q0(map, objZ)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        int iD = d(obj);
        C4007lz c4007lz = ((C4095mz) this).d;
        InterfaceC4596sh interfaceC4596shZ = interfaceC3385er.z(c4007lz, iD);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC4596shZ.B(c4007lz, i, this.f4595a, key);
            i += 2;
            interfaceC4596shZ.B(c4007lz, i2, this.b, value);
        }
        interfaceC4596shZ.b(c4007lz);
    }
}
