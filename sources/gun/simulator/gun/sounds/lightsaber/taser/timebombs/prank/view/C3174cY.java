package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3174cY extends AbstractC2671Pf {
    public final InterfaceC3156cG b;
    public final Q5 c;

    public C3174cY(InterfaceC3156cG interfaceC3156cG, InterfaceC4123nG interfaceC4123nG) {
        super(interfaceC4123nG);
        this.b = interfaceC3156cG;
        this.c = new Q5(interfaceC4123nG.getDescriptor(), 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object a() {
        return new ArrayList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC2995aW.q(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC2995aW.q(objArr, "<this>");
        return WD.B(objArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC2995aW.q(objArr, "<this>");
        return objArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        AbstractC2995aW.q(null, "<this>");
        U5.h0(null);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC2995aW.q(arrayList, "<this>");
        InterfaceC3156cG interfaceC3156cG = this.b;
        AbstractC2995aW.q(interfaceC3156cG, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC2995aW.K(interfaceC3156cG), arrayList.size());
        AbstractC2995aW.o(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC2995aW.p(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC2995aW.q(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
