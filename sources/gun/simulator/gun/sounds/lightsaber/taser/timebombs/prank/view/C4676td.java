package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvLightSaberEffectChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4676td extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogC5116yd f5042a;
    public String b;
    public int c;
    public final /* synthetic */ RvLightSaberEffectChangeAdapter.EffectViewHolder d;
    public final /* synthetic */ DialogC5116yd e;
    public final /* synthetic */ ShootEffect f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4676td(RvLightSaberEffectChangeAdapter.EffectViewHolder effectViewHolder, DialogC5116yd dialogC5116yd, ShootEffect shootEffect, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.d = effectViewHolder;
        this.e = dialogC5116yd;
        this.f = shootEffect;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4676td(this.d, this.e, this.f, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4676td) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Weapon weapon;
        String name;
        String str;
        DialogC5116yd dialogC5116yd;
        LifecycleCoroutineScope lifecycleScope;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.c;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        DialogC5116yd dialogC5116yd2 = this.e;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            int adapterPosition = this.d.getAdapterPosition();
            if (adapterPosition == 0) {
                S3.b("effect_lightsaber", "standard");
            } else if (adapterPosition == 1) {
                S3.b("effect_lightsaber", "fire");
            } else if (adapterPosition == 2) {
                S3.b("effect_lightsaber", "lightning");
            } else if (adapterPosition == 3) {
                S3.b("effect_lightsaber", "particle");
            } else if (adapterPosition == 4) {
                S3.b("effect_lightsaber", "sparking");
            } else if (adapterPosition == 5) {
                S3.b("effect_lightsaber", "radiant");
            }
            RvLightSaberEffectChangeAdapter rvLightSaberEffectChangeAdapter = dialogC5116yd2.d;
            ShootEffect shootEffect = this.f;
            rvLightSaberEffectChangeAdapter.g(shootEffect);
            String effectName = shootEffect.getEffectName();
            if (effectName != null && (weapon = dialogC5116yd2.b) != null && (name = weapon.getName()) != null) {
                this.f5042a = dialogC5116yd2;
                this.b = effectName;
                this.c = 1;
                Object objX = WD.X(new C4342pl0(name, effectName, null), AbstractC4437qp.b, this);
                if (objX != enumC4602sk) {
                    objX = c5033xf0;
                }
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                str = effectName;
                dialogC5116yd = dialogC5116yd2;
            }
            AbstractC3651ht.b(dialogC5116yd2);
            return c5033xf0;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.b;
        dialogC5116yd = this.f5042a;
        AbstractC3375el.b0(obj);
        Lj0 lj0 = dialogC5116yd.c;
        lj0.getClass();
        AbstractC2995aW.q(str, "effectName");
        C3109bk0 c3109bk0 = lj0.f3368a;
        LifecycleOwner lifecycleOwner = c3109bk0.g;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new Kj0(c3109bk0, str, null), 3);
        }
        AbstractC3651ht.b(dialogC5116yd2);
        return c5033xf0;
    }
}
