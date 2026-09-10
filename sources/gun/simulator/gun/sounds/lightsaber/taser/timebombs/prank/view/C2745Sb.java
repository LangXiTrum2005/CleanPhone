package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2745Sb implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3722a;
    public final Object b;

    public /* synthetic */ C2745Sb(Object obj, int i) {
        this.f3722a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        switch (this.f3722a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        int i3 = this.f3722a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new EP(new C3697iS(bArr), new C2719Rb(bArr, (InterfaceC2693Qb) obj2));
            case 1:
                return new EP(new C3697iS(obj), new C4956wl(0, obj.toString(), (NN) obj2));
            default:
                File file = (File) obj;
                return new EP(new C3697iS(file), new C4956wl(1, file, (InterfaceC2867Wt) obj2));
        }
    }
}
