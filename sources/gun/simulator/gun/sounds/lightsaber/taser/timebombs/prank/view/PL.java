package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PL implements GB, InterfaceC2591Md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3547a;
    public final /* synthetic */ Object b;

    public /* synthetic */ PL(Object obj, int i) {
        this.f3547a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer a() {
        int i = this.f3547a;
        return Integer.valueOf(R.id.tv_native_ad_content);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public List b() {
        int i = this.f3547a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List list = AbstractC2952a.f4102a;
                MainActivity mainActivity = (MainActivity) obj;
                return AbstractC2340Cl.L(AbstractC2952a.a((C5) list.get(0), mainActivity), AbstractC2952a.a((C5) list.get(1), mainActivity));
            case 1:
                List list2 = AbstractC2952a.f4102a;
                RussianRouletteActivity russianRouletteActivity = (RussianRouletteActivity) obj;
                return AbstractC2340Cl.K(AbstractC2952a.b((C5) list2.get(0), russianRouletteActivity.getContext()), AbstractC2952a.b((C5) list2.get(1), russianRouletteActivity.getContext()));
            case 2:
                List list3 = AbstractC2952a.f4102a;
                WeaponSortActivity weaponSortActivity = (WeaponSortActivity) obj;
                return AbstractC2340Cl.K(AbstractC2952a.a((C5) list3.get(0), weaponSortActivity), AbstractC2952a.a((C5) list3.get(1), weaponSortActivity));
            case 3:
                List list4 = AbstractC2952a.f4102a;
                WeaponUseActivity weaponUseActivity = (WeaponUseActivity) obj;
                return AbstractC2340Cl.K(AbstractC2952a.b((C5) list4.get(0), weaponUseActivity.getContext()), AbstractC2952a.b((C5) list4.get(1), weaponUseActivity.getContext()));
            default:
                List list5 = AbstractC2952a.b;
                C5 c5 = (C5) list5.get(0);
                DialogC3094bd dialogC3094bd = (DialogC3094bd) obj;
                Context context = dialogC3094bd.getContext();
                AbstractC2995aW.p(context, "getContext(...)");
                C3784jT c3784jTC = AbstractC2952a.c(c5, context);
                C5 c6 = (C5) list5.get(1);
                Context context2 = dialogC3094bd.getContext();
                AbstractC2995aW.p(context2, "getContext(...)");
                return AbstractC2340Cl.K(c3784jTC, AbstractC2952a.c(c6, context2));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer c() {
        int i = this.f3547a;
        return Integer.valueOf(R.id.bt_download);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer d() {
        switch (this.f3547a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer e() {
        switch (this.f3547a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return i();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer f() {
        switch (this.f3547a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return j();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer g() {
        int i = this.f3547a;
        return Integer.valueOf(R.id.tv_native_ad_title);
    }

    public Integer h() {
        Integer numValueOf = Integer.valueOf(R.id.iv_ad_title);
        switch (this.f3547a) {
            case 0:
            case 2:
                return -1;
            case 1:
            default:
                return numValueOf;
        }
    }

    public Integer i() {
        Integer numValueOf = Integer.valueOf(R.id.iv_ad_title);
        switch (this.f3547a) {
            case 0:
                return numValueOf;
            case 1:
                return -1;
            case 2:
                return numValueOf;
            case 3:
                return -1;
            default:
                return Integer.valueOf(R.id.iv_ad_media_view);
        }
    }

    public Integer j() {
        Integer numValueOf = Integer.valueOf(R.layout.layout_native_ad_in_mainpage);
        Integer numValueOf2 = Integer.valueOf(R.layout.ad_placeholder_banner);
        switch (this.f3547a) {
            case 0:
                return numValueOf;
            case 1:
                return numValueOf2;
            case 2:
                return numValueOf;
            case 3:
                return numValueOf2;
            default:
                return Integer.valueOf(R.layout.layout_native_ad_in_reload_bullets);
        }
    }
}
