package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class UF extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2755Sl f3816a;
    public VF b;
    public LinkedHashMap c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ VF f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UF(VF vf, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.f = vf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return VF.a(this.f, null, this);
    }
}
