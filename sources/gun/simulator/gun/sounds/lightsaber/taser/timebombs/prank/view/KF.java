package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class KF extends AbstractC4623t {
    public final /* synthetic */ int f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KF(VE ve, InterfaceC2766Sw interfaceC2766Sw, int i) {
        super(ve, interfaceC2766Sw);
        this.f = i;
        if (i == 1) {
            AbstractC2995aW.q(ve, "json");
            AbstractC2995aW.q(interfaceC2766Sw, "nodeConsumer");
            super(ve, interfaceC2766Sw);
            this.g = new LinkedHashMap();
            return;
        }
        if (i != 2) {
            AbstractC2995aW.q(ve, "json");
            AbstractC2995aW.q(interfaceC2766Sw, "nodeConsumer");
            this.f2920a.add("primitive");
            return;
        }
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(interfaceC2766Sw, "nodeConsumer");
        super(ve, interfaceC2766Sw);
        this.g = new ArrayList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4623t
    public AbstractC4122nF K() {
        switch (this.f) {
            case 0:
                AbstractC4122nF abstractC4122nF = (AbstractC4122nF) this.g;
                if (abstractC4122nF != null) {
                    return abstractC4122nF;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new FF((Map) this.g);
            default:
                return new WE((ArrayList) this.g);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4623t
    public void L(String str, AbstractC4122nF abstractC4122nF) {
        switch (this.f) {
            case 0:
                AbstractC2995aW.q(str, "key");
                AbstractC2995aW.q(abstractC4122nF, "element");
                if (str != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
                }
                if (((AbstractC4122nF) this.g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                this.g = abstractC4122nF;
                return;
            case 1:
                AbstractC2995aW.q(str, "key");
                AbstractC2995aW.q(abstractC4122nF, "element");
                ((Map) this.g).put(str, abstractC4122nF);
                return;
            default:
                AbstractC2995aW.q(str, "key");
                AbstractC2995aW.q(abstractC4122nF, "element");
                ((ArrayList) this.g).add(Integer.parseInt(str), abstractC4122nF);
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void r(D40 d40, int i, InterfaceC4123nG interfaceC4123nG, Object obj) {
        int i2 = this.f;
        ArrayList arrayList = this.f2920a;
        switch (i2) {
            case 1:
                AbstractC2995aW.q(d40, "descriptor");
                AbstractC2995aW.q(interfaceC4123nG, "serializer");
                if (obj != null || this.d.f) {
                    arrayList.add(I(d40, i));
                    AbstractC4496rb.n(this, interfaceC4123nG, obj);
                }
                break;
            default:
                AbstractC2995aW.q(d40, "descriptor");
                AbstractC2995aW.q(interfaceC4123nG, "serializer");
                arrayList.add(I(d40, i));
                AbstractC4496rb.n(this, interfaceC4123nG, obj);
                break;
        }
    }
}
