package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5002xG implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4123nG f5214a;
    public final InterfaceC4123nG b;

    public AbstractC5002xG(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2) {
        this.f5214a = interfaceC4123nG;
        this.b = interfaceC4123nG2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        C3427fM c3427fM = (C3427fM) this;
        F40 f40 = c3427fM.d;
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(f40);
        Object objZ = AbstractC5119ye0.f5287a;
        Object objZ2 = objZ;
        while (true) {
            int iK = interfaceC4421qhC.k(f40);
            if (iK == -1) {
                interfaceC4421qhC.b(f40);
                Object obj = AbstractC5119ye0.f5287a;
                if (objZ == obj) {
                    throw new P40("Element 'key' is missing");
                }
                if (objZ2 == obj) {
                    throw new P40("Element 'value' is missing");
                }
                switch (c3427fM.c) {
                    case 0:
                        return new C3251dM(objZ, objZ2);
                    default:
                        return new C4839vT(objZ, objZ2);
                }
            }
            if (iK == 0) {
                objZ = interfaceC4421qhC.z(f40, 0, this.f5214a, null);
            } else {
                if (iK != 1) {
                    throw new P40(AbstractC3950lJ.p("Invalid index: ", iK));
                }
                objZ2 = interfaceC4421qhC.z(f40, 1, this.b, null);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        Object key;
        Object value;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        C3427fM c3427fM = (C3427fM) this;
        F40 f40 = c3427fM.d;
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(f40);
        int i = c3427fM.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC2995aW.q(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                C4839vT c4839vT = (C4839vT) obj;
                AbstractC2995aW.q(c4839vT, "<this>");
                key = c4839vT.f5132a;
                break;
        }
        interfaceC4596shC.B(f40, 0, this.f5214a, key);
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC2995aW.q(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                C4839vT c4839vT2 = (C4839vT) obj;
                AbstractC2995aW.q(c4839vT2, "<this>");
                value = c4839vT2.b;
                break;
        }
        interfaceC4596shC.B(f40, 1, this.b, value);
        interfaceC4596shC.b(f40);
    }
}
