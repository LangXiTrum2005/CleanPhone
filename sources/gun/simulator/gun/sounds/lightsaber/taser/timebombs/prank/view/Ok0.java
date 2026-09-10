package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Ok0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3519a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ SpineController d;
    public final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ok0(WeaponUseActivity weaponUseActivity, SpineController spineController, View view, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
        this.d = spineController;
        this.e = view;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Ok0 ok0 = new Ok0(this.c, this.d, this.e, interfaceC2857Wj);
        ok0.b = obj;
        return ok0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Ok0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        LifecycleCoroutineScope lifecycleScope4;
        LifecycleCoroutineScope lifecycleScope5;
        LifecycleCoroutineScope lifecycleScope6;
        LifecycleCoroutineScope lifecycleScope7;
        LifecycleCoroutineScope lifecycleScope8;
        LifecycleCoroutineScope lifecycleScope9;
        LifecycleCoroutineScope lifecycleScope10;
        LifecycleCoroutineScope lifecycleScope11;
        LifecycleCoroutineScope lifecycleScope12;
        C3443fb c3443fbA;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3519a;
        SpineController spineController = this.d;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Nk0 nk0 = new Nk0(spineController, null);
            this.f3519a = 1;
            if (WD.X(nk0, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        WeaponUseActivity weaponUseActivity = this.c;
        Weapon weaponN = weaponUseActivity.n();
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (weaponN != null && (name = weaponN.getName()) != null) {
            IControl.DefaultImpls.addAnimation$default(this.d, "LIGHT_SABER", 0, name, false, 0.0f, null, 56, null);
            spineController.showAllSlot();
            spineController.showSlot("LIGHT_SABER", name);
            C4991x70 skeleton = spineController.getSkeleton("LIGHT_SABER");
            if (skeleton != null && (c3443fbA = skeleton.a(name)) != null) {
                float f = weaponUseActivity.i;
                c3443fbA.h = f;
                c3443fbA.i = f;
            }
            AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
            if (abstractC4340pk0 != null && (abstractC4340pk0 instanceof C4213oI)) {
                View view = this.e;
                if (view != null) {
                    view.setOnTouchListener(new Dk0(abstractC4340pk0, 1));
                }
                C4213oI c4213oI = (C4213oI) abstractC4340pk0;
                String name2 = c4213oI.b.getName();
                int iHashCode = name2.hashCode();
                LifecycleOwner lifecycleOwner = c4213oI.M;
                switch (iHashCode) {
                    case -1012121825:
                        if (name2.equals("LightSaber-A") && lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope, AbstractC4437qp.b, 0, new PH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121824:
                        if (name2.equals("LightSaber-B") && lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope2, AbstractC4437qp.b, 0, new RH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121823:
                        if (name2.equals("LightSaber-C") && lifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope3, AbstractC4437qp.b, 0, new TH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121822:
                        if (name2.equals("LightSaber-D") && lifecycleOwner != null && (lifecycleScope4 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope4, AbstractC4437qp.b, 0, new VH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121821:
                        if (name2.equals("LightSaber-E") && lifecycleOwner != null && (lifecycleScope5 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope5, AbstractC4437qp.b, 0, new XH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121820:
                        if (name2.equals("LightSaber-F") && lifecycleOwner != null && (lifecycleScope6 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope6, AbstractC4437qp.b, 0, new ZH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121819:
                        if (name2.equals("LightSaber-G") && lifecycleOwner != null && (lifecycleScope7 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope7, AbstractC4437qp.b, 0, new C3070bI(c4213oI, null), 2);
                        }
                        break;
                    case -1012121818:
                        if (name2.equals("LightSaber-H") && lifecycleOwner != null && (lifecycleScope8 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope8, AbstractC4437qp.b, 0, new C3247dI(c4213oI, null), 2);
                        }
                        break;
                    case -1012121817:
                        if (name2.equals("LightSaber-I") && lifecycleOwner != null && (lifecycleScope9 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope9, AbstractC4437qp.b, 0, new C3423fI(c4213oI, null), 2);
                        }
                        break;
                    case -1012121816:
                        if (name2.equals("LightSaber-J") && lifecycleOwner != null && (lifecycleScope10 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope10, AbstractC4437qp.b, 0, new KH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121815:
                        if (name2.equals("LightSaber-K") && lifecycleOwner != null && (lifecycleScope11 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope11, AbstractC4437qp.b, 0, new MH(c4213oI, null), 2);
                        }
                        break;
                    case -1012121814:
                        if (name2.equals("LightSaber-L") && lifecycleOwner != null && (lifecycleScope12 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            WD.D(lifecycleScope12, AbstractC4437qp.b, 0, new OH(c4213oI, null), 2);
                        }
                        break;
                }
            }
        }
        return c5033xf0;
    }
}
