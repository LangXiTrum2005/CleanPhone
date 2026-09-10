package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class TF extends GZ implements InterfaceC3655hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3764a;
    public /* synthetic */ C2755Sl b;
    public final /* synthetic */ VF c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TF(VF vf, InterfaceC2857Wj interfaceC2857Wj) {
        super(3, interfaceC2857Wj);
        this.c = vf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TF tf = new TF(this.c, (InterfaceC2857Wj) obj3);
        tf.b = (C2755Sl) obj;
        return tf.invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3764a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C2755Sl c2755Sl = this.b;
            VF vf = this.c;
            byte bS = vf.f3866a.s();
            if (bS == 1) {
                return vf.d(true);
            }
            if (bS == 0) {
                return vf.d(false);
            }
            if (bS != 6) {
                if (bS == 8) {
                    return vf.c();
                }
                T90.p(vf.f3866a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f3764a = 1;
            obj = VF.a(vf, c2755Sl, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return (AbstractC4122nF) obj;
    }
}
