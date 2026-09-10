package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.ImageView;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2301Ay extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2845a;
    public final /* synthetic */ C2612My b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301Ay(C2612My c2612My, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c2612My;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2301Ay(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2301Ay) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0297  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String str;
        float f;
        C3755j5 c3755j5O;
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C3443fb c3443fbA3;
        C3443fb c3443fbA4;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ImageView imageView;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2845a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Weapon weaponN = this.b.f4847a.n();
            String name = weaponN != null ? weaponN.getName() : null;
            if (name == null || name.length() == 0 || this.b.r() == null) {
                return C5033xf0.f5238a;
            }
            C2612My c2612My = this.b;
            SpineController spineControllerR = c2612My.r();
            AbstractC2995aW.n(spineControllerR);
            Weapon weaponN2 = this.b.f4847a.n();
            AbstractC2995aW.n(weaponN2);
            String name2 = weaponN2.getName();
            AbstractC2995aW.n(name2);
            this.f2845a = 1;
            if (!App.q) {
                S3.a("weapon_use");
                App.q = true;
            }
            C3109bk0 c3109bk0M = c2612My.f4847a.m();
            float f2 = AbstractC2995aW.i((c3109bk0M == null || (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) == null || (imageView = layoutWeaponActivityActionBinding.ivImmersive) == null) ? null : Boolean.valueOf(imageView.isSelected()), Boolean.TRUE) ? c2612My.f4847a.i + 0.05f : c2612My.f4847a.i;
            synchronized (c2612My.B) {
                try {
                    C4991x70 skeleton = spineControllerR.getSkeleton("GUN");
                    if (skeleton != null && (c3443fbA4 = skeleton.a("TX_weizhi")) != null) {
                        c2612My.E(c3443fbA4.e * f2);
                        c2612My.F(c3443fbA4.f * f2);
                    }
                    Iterator it = AbstractC2340Cl.K("GUN_SMOKE", "GUN_EFFECT", "GUN_EFFECT1", "GUN_EFFECT2", "GUN_EFFECT3").iterator();
                    while (it.hasNext()) {
                        C4991x70 skeleton2 = spineControllerR.getSkeleton((String) it.next());
                        if (skeleton2 != null && (c3443fbA3 = skeleton2.a("root")) != null) {
                            c3443fbA3.e = c2612My.x();
                            c3443fbA3.f = c2612My.y();
                        }
                    }
                    C4991x70 skeleton3 = spineControllerR.getSkeleton("GUN");
                    if (skeleton3 != null && (c3443fbA = skeleton3.a("zidan_weizhi")) != null) {
                        Iterator it2 = AbstractC2340Cl.K("GUN_BULLET", "GUN_BULLET1", "GUN_BULLET2", "GUN_BULLET3", "GUN_BULLET4", "GUN_BULLET5", "GUN_BULLET6", "GUN_BULLET7", "GUN_BULLET8", "GUN_BULLET9").iterator();
                        while (it2.hasNext()) {
                            C4991x70 skeleton4 = spineControllerR.getSkeleton((String) it2.next());
                            if (skeleton4 != null && (c3443fbA2 = skeleton4.a("root")) != null) {
                                c3443fbA2.e = c3443fbA.e * f2;
                                c3443fbA2.f = c3443fbA.f * f2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = c2612My.v;
            int i3 = i2 + 1;
            c2612My.v = i3;
            if (i3 == 2) {
                c2612My.v = i2 + 2;
            }
            if (c2612My.v >= 11) {
                c2612My.v = 1;
            }
            int i4 = c2612My.v;
            switch (i4) {
                case 1:
                    str = "GUN_BULLET";
                    break;
                case 2:
                    str = "GUN_BULLET1";
                    break;
                case 3:
                    str = "GUN_BULLET2";
                    break;
                case 4:
                    str = "GUN_BULLET3";
                    break;
                case 5:
                    str = "GUN_BULLET4";
                    break;
                case 6:
                    str = "GUN_BULLET5";
                    break;
                case 7:
                    str = "GUN_BULLET6";
                    break;
                case 8:
                    str = "GUN_BULLET7";
                    break;
                case 9:
                    str = "GUN_BULLET8";
                    break;
                case 10:
                    str = "GUN_BULLET9";
                    break;
                default:
                    str = "GUN_BULLET";
                    break;
            }
            String str2 = str;
            IControl.DefaultImpls.addAnimation$default(spineControllerR, "GUN", 0, name2, false, 0.0f, null, 32, null);
            C3843k5 animationState = spineControllerR.getAnimationState("GUN");
            if (animationState != null) {
                animationState.h = 2.5f;
            }
            try {
                c2612My.x++;
                C3843k5 animationState2 = spineControllerR.getAnimationState(c2612My.t());
                if (animationState2 != null) {
                    animationState2.s(0.0f);
                    c3755j5O = animationState2.o(c2612My.x, c2612My.s(), false);
                } else {
                    c3755j5O = null;
                }
                LinkedHashMap linkedHashMap = c2612My.y;
                linkedHashMap.put(c2612My.t(), c3755j5O);
                IControl.DefaultImpls.setAnimation$default(spineControllerR, c2612My.t(), (c2612My.x % 4) + 20, c2612My.s(), false, 0.0f, null, 32, null);
                C3843k5 animationState3 = spineControllerR.getAnimationState(c2612My.t());
                if (animationState3 != null) {
                    animationState3.h = 2.0f;
                }
                if (linkedHashMap.values().size() >= 4) {
                    Collection collectionValues = linkedHashMap.values();
                    AbstractC2995aW.p(collectionValues, "<get-values>(...)");
                    C3755j5 c3755j5 = (C3755j5) AbstractC2853Wf.f0(collectionValues);
                    if (c3755j5 != null) {
                        Set setKeySet = linkedHashMap.keySet();
                        AbstractC2995aW.p(setKeySet, "<get-keys>(...)");
                        C3843k5 animationState4 = spineControllerR.getAnimationState((String) AbstractC2853Wf.f0(setKeySet));
                        if (animationState4 != null) {
                            f = 0.0f;
                            try {
                                animationState4.q(0.0f, c3755j5.e);
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } else {
                            f = 0.0f;
                        }
                        Set setKeySet2 = linkedHashMap.keySet();
                        AbstractC2995aW.p(setKeySet2, "<get-keys>(...)");
                        C3843k5 animationState5 = spineControllerR.getAnimationState((String) AbstractC2853Wf.f0(setKeySet2));
                        if (animationState5 != null) {
                            animationState5.i(c3755j5.e);
                        }
                        Set setKeySet3 = linkedHashMap.keySet();
                        AbstractC2995aW.p(setKeySet3, "<get-keys>(...)");
                        linkedHashMap.remove(AbstractC2853Wf.f0(setKeySet3));
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
            } catch (Exception e2) {
                e = e2;
                f = 0.0f;
            }
            c2612My.w = (String) AbstractC4605sl0.f4996a.get(i4);
            if (c2612My.A) {
                synchronized (c2612My.B) {
                    try {
                        C3843k5 animationState6 = spineControllerR.getAnimationState(str2);
                        if (animationState6 != null) {
                            animationState6.s(f);
                        }
                        IControl.DefaultImpls.addAnimation$default(spineControllerR, str2, i4, c2612My.w, false, 0.0f, null, 32, null);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (C5033xf0.f5238a == enumC4602sk) {
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
