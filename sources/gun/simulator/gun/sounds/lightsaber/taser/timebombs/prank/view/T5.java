package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class T5 extends AbstractC2697Qf {
    public final /* synthetic */ int b;
    public final Q5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(InterfaceC4123nG interfaceC4123nG, int i) {
        super(interfaceC4123nG);
        this.b = i;
        if (i == 1) {
            AbstractC2995aW.q(interfaceC4123nG, "eSerializer");
            super(interfaceC4123nG);
            this.c = new Q5(interfaceC4123nG.getDescriptor(), 2);
        } else if (i != 2) {
            AbstractC2995aW.q(interfaceC4123nG, "element");
            this.c = new Q5(interfaceC4123nG.getDescriptor(), 1);
        } else {
            AbstractC2995aW.q(interfaceC4123nG, "eSerializer");
            super(interfaceC4123nG);
            this.c = new Q5(interfaceC4123nG.getDescriptor(), 3);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC2995aW.q(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC2995aW.q(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC2995aW.q(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                AbstractC2995aW.q(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                AbstractC2995aW.q(null, "<this>");
                return new HashSet((Collection) null);
            default:
                AbstractC2995aW.q(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC2995aW.q(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC2995aW.q(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC2995aW.q(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC2995aW.q(arrayList, "<this>");
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC2995aW.q(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC2995aW.q(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
