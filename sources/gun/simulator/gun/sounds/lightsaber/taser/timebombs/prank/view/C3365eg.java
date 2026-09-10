package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3365eg extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4329a;
    public final /* synthetic */ InterfaceC4443qv[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ InterfaceC2851Wd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3365eg(InterfaceC4443qv[] interfaceC4443qvArr, int i, AtomicInteger atomicInteger, InterfaceC2851Wd interfaceC2851Wd, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = interfaceC4443qvArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = interfaceC2851Wd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3365eg(this.b, this.c, this.d, this.e, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3365eg) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4329a;
        AtomicInteger atomicInteger = this.d;
        InterfaceC2851Wd interfaceC2851Wd = this.e;
        try {
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4443qv[] interfaceC4443qvArr = this.b;
                int i2 = this.c;
                InterfaceC4443qv interfaceC4443qv = interfaceC4443qvArr[i2];
                C3277dg c3277dg = new C3277dg(interfaceC2851Wd, i2);
                this.f4329a = 1;
                if (interfaceC4443qv.collect(c3277dg, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                interfaceC2851Wd.q(null);
            }
            return C5033xf0.f5238a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                interfaceC2851Wd.q(null);
            }
            throw th;
        }
    }
}
