package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Zj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4088a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C3109bk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zj0(C3109bk0 c3109bk0, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = str;
        this.d = c3109bk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Zj0 zj0 = new Zj0(this.d, this.c, interfaceC2857Wj);
        zj0.b = obj;
        return zj0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Zj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4088a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            ZX zx = new ZX();
            zx.f4074a = -1;
            String str = this.c;
            switch (str.hashCode()) {
                case -747473996:
                    if (str.equals("shandian")) {
                        String strConcat = "FF".concat("008CFF");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat, 16);
                    }
                    break;
                case 3143222:
                    if (str.equals("fire")) {
                        String strConcat2 = "FF".concat("FFA800");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat2, 16);
                    }
                    break;
                case 3322220:
                    if (str.equals("lizi")) {
                        String strConcat3 = "FF".concat("EC00D4");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat3, 16);
                    }
                    break;
                case 101119761:
                    if (str.equals("jichu")) {
                        String strConcat4 = "FF".concat("00E0FF");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat4, 16);
                    }
                    break;
                case 528694968:
                    if (str.equals("xunhuan_huoxing")) {
                        String strConcat5 = "FF".concat("FFE500");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat5, 16);
                    }
                    break;
                case 1866984299:
                    if (str.equals("shensheng")) {
                        String strConcat6 = "FF".concat("FFE500");
                        WD.k(16);
                        zx.f4074a = (int) Long.parseLong(strConcat6, 16);
                    }
                    break;
            }
            C3109bk0 c3109bk0 = this.d;
            Weapon weapon = c3109bk0.e;
            if (weapon != null) {
                c3109bk0.k(zx.f4074a, weapon);
            }
            Yj0 yj0 = new Yj0(c3109bk0, zx, null);
            this.f4088a = 1;
            if (AbstractC3651ht.d(yj0, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
