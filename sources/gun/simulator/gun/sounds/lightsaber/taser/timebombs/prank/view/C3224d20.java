package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3224d20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4629t20 f4255a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4629t20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224d20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.d = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3224d20 c3224d20 = new C3224d20(this.d, interfaceC2857Wj);
        c3224d20.c = obj;
        return c3224d20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3224d20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        InterfaceC4514rk interfaceC4514rk;
        SpineController spineController;
        C2958a20 c2958a20;
        InterfaceC4514rk interfaceC4514rk2;
        C4629t20 c4629t20;
        C3047b20 c3047b20;
        C3135c20 c3135c20;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        C4629t20 c4629t21 = this.d;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            interfaceC4514rk = (InterfaceC4514rk) this.c;
            SpineController spineController2 = c4629t21.c;
            if (spineController2 != null) {
                spineController2.showSlotExcludeRedSlots("dancao");
            }
            SpineController spineController3 = c4629t21.c;
            if (spineController3 != null) {
                spineController3.showSlotExcludeRedSlots("banji");
            }
            if (spineController3 != null) {
                spineController3.showSlotExcludeRedSlots("jichui");
            }
            if (spineController3 != null) {
                spineController3.showSlot("qiang");
            }
            if (spineController3 != null) {
                spineController3.hideSlot("reload");
            }
            if (spineController3 != null) {
                spineController3.hideSlot("gun");
            }
            if (c4629t21.f0) {
                Z10 z10 = new Z10(c4629t21, null);
                this.c = interfaceC4514rk;
                this.b = 1;
                if (AbstractC3651ht.d(z10, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                spineController = c4629t21.c;
                if (spineController != null) {
                    c2958a20 = new C2958a20(c4629t21, spineController, null);
                    this.c = interfaceC4514rk;
                    this.f4255a = c4629t21;
                    this.b = 2;
                    if (AbstractC3651ht.d(c2958a20, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    interfaceC4514rk2 = interfaceC4514rk;
                    c4629t20 = c4629t21;
                    c3047b20 = new C3047b20(c4629t20, null);
                    this.c = interfaceC4514rk2;
                    this.f4255a = null;
                    this.b = 3;
                    if (WD.X(c3047b20, AbstractC4437qp.b, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                c3135c20 = new C3135c20(c4629t21, null);
                this.c = null;
                this.b = 4;
                if (WD.X(c3135c20, AbstractC4437qp.b, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else if (i == 1) {
            InterfaceC4514rk interfaceC4514rk3 = (InterfaceC4514rk) this.c;
            AbstractC3375el.b0(obj);
            interfaceC4514rk = interfaceC4514rk3;
            spineController = c4629t21.c;
            if (spineController != null) {
                c2958a20 = new C2958a20(c4629t21, spineController, null);
                this.c = interfaceC4514rk;
                this.f4255a = c4629t21;
                this.b = 2;
                if (AbstractC3651ht.d(c2958a20, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                interfaceC4514rk2 = interfaceC4514rk;
                c4629t20 = c4629t21;
                c3047b20 = new C3047b20(c4629t20, null);
                this.c = interfaceC4514rk2;
                this.f4255a = null;
                this.b = 3;
                if (WD.X(c3047b20, AbstractC4437qp.b, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            c3135c20 = new C3135c20(c4629t21, null);
            this.c = null;
            this.b = 4;
            if (WD.X(c3135c20, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else if (i == 2) {
            c4629t20 = this.f4255a;
            interfaceC4514rk2 = (InterfaceC4514rk) this.c;
            AbstractC3375el.b0(obj);
            c3047b20 = new C3047b20(c4629t20, null);
            this.c = interfaceC4514rk2;
            this.f4255a = null;
            this.b = 3;
            if (WD.X(c3047b20, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
            c3135c20 = new C3135c20(c4629t21, null);
            this.c = null;
            this.b = 4;
            if (WD.X(c3135c20, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else if (i == 3) {
            AbstractC3375el.b0(obj);
            c3135c20 = new C3135c20(c4629t21, null);
            this.c = null;
            this.b = 4;
            if (WD.X(c3135c20, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
