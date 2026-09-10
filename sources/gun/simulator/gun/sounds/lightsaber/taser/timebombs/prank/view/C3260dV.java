package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3260dV extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ C3348eV g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3260dV(C3348eV c3348eV, int i) {
        super(0);
        this.f = i;
        this.g = c3348eV;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        InterfaceC4123nG[] interfaceC4123nGArrChildSerializers;
        ArrayList arrayList;
        InterfaceC4123nG[] interfaceC4123nGArrTypeParametersSerializers;
        int i = this.f;
        C3348eV c3348eV = this.g;
        switch (i) {
            case 0:
                return Integer.valueOf(AbstractC2871Wx.i0(c3348eV, (D40[]) c3348eV.j.getValue()));
            case 1:
                InterfaceC5060xx interfaceC5060xx = c3348eV.b;
                return (interfaceC5060xx == null || (interfaceC4123nGArrChildSerializers = interfaceC5060xx.childSerializers()) == null) ? WD.h : interfaceC4123nGArrChildSerializers;
            default:
                InterfaceC5060xx interfaceC5060xx2 = c3348eV.b;
                if (interfaceC5060xx2 == null || (interfaceC4123nGArrTypeParametersSerializers = interfaceC5060xx2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(interfaceC4123nGArrTypeParametersSerializers.length);
                    for (InterfaceC4123nG interfaceC4123nG : interfaceC4123nGArrTypeParametersSerializers) {
                        arrayList.add(interfaceC4123nG.getDescriptor());
                    }
                }
                return AbstractC2871Wx.W(arrayList);
        }
    }
}
