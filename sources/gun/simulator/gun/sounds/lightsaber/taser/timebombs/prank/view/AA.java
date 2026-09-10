package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AA implements InterfaceC2714Qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JA f2807a;
    public final /* synthetic */ GA b;

    public AA(GA ga, JA ja) {
        AbstractC2995aW.q(ga, "this$0");
        this.b = ga;
        this.f2807a = ja;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() throws Throwable {
        EnumC2502Ir enumC2502Ir;
        GA ga = this.b;
        JA ja = this.f2807a;
        EnumC2502Ir enumC2502Ir2 = EnumC2502Ir.INTERNAL_ERROR;
        IOException e = null;
        try {
            ja.b(this);
            while (ja.a(false, this)) {
            }
            enumC2502Ir = EnumC2502Ir.NO_ERROR;
            try {
                try {
                    ga.a(enumC2502Ir, EnumC2502Ir.CANCEL, null);
                } catch (Throwable th) {
                    th = th;
                    ga.a(enumC2502Ir, enumC2502Ir2, e);
                    Vg0.c(ja);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                EnumC2502Ir enumC2502Ir3 = EnumC2502Ir.PROTOCOL_ERROR;
                ga.a(enumC2502Ir3, enumC2502Ir3, e);
            }
        } catch (IOException e3) {
            e = e3;
            enumC2502Ir = enumC2502Ir2;
        } catch (Throwable th2) {
            th = th2;
            enumC2502Ir = enumC2502Ir2;
            ga.a(enumC2502Ir, enumC2502Ir2, e);
            Vg0.c(ja);
            throw th;
        }
        Vg0.c(ja);
        return C5033xf0.f5238a;
    }
}
