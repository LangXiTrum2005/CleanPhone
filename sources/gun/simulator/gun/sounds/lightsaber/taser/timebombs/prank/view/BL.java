package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.BottomSpaceItemDecoration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvNewCommonWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvNewSpecialWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityMainBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.utils.HomeSpaceItemDecoration;

/* JADX INFO: loaded from: classes4.dex */
public final class BL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2866a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MainActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        BL bl = new BL(this.c, interfaceC2857Wj);
        bl.b = obj;
        return bl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((BL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2866a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            AL al = new AL(2, null);
            this.f2866a = 1;
            obj = WD.X(al, AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        String str = (String) obj;
        boolean zI = AbstractC2995aW.i(str, "Two");
        MainActivity mainActivity = this.c;
        if (zI) {
            ((RvNewCommonWeaponSortsAdapter) mainActivity.b.getValue()).f(AbstractC4781ul0.b);
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.setLayoutManager(new GridLayoutManager(mainActivity, 2));
            RecyclerView recyclerView = ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun;
            Ma0 ma0 = mainActivity.b;
            recyclerView.setAdapter((RvNewCommonWeaponSortsAdapter) ma0.getValue());
            mainActivity.d = (RvNewCommonWeaponSortsAdapter) ma0.getValue();
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.addItemDecoration(new HomeSpaceItemDecoration(AbstractC3375el.x(6.0f), AbstractC3375el.x(8.0f)));
        } else if (AbstractC2995aW.i(str, "Gun_Two")) {
            ((RvNewSpecialWeaponSortsAdapter) mainActivity.c.getValue()).f(AbstractC4781ul0.c);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mainActivity, 2);
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity$initAdapter$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i2) {
                    return i2 == 0 ? 2 : 1;
                }
            });
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView2 = ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun;
            Ma0 ma1 = mainActivity.c;
            recyclerView2.setAdapter((RvNewSpecialWeaponSortsAdapter) ma1.getValue());
            mainActivity.d = (RvNewSpecialWeaponSortsAdapter) ma1.getValue();
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.addItemDecoration(new HomeSpaceItemDecoration(AbstractC3375el.x(6.0f), AbstractC3375el.x(5.0f)));
        } else {
            int i2 = MainActivity.j;
            ((RvWeaponSortsAdapter) mainActivity.f2777a.getValue()).f(AbstractC4781ul0.f5099a);
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.setLayoutManager(new LinearLayoutManager(mainActivity, 1, false));
            RecyclerView recyclerView3 = ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun;
            Ma0 ma2 = mainActivity.f2777a;
            recyclerView3.setAdapter((RvWeaponSortsAdapter) ma2.getValue());
            mainActivity.d = (RvWeaponSortsAdapter) ma2.getValue();
            ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.addItemDecoration(new BottomSpaceItemDecoration(AbstractC3375el.x(14.0f)));
            if (AbstractC2995aW.i(AbstractC3194cj.a().a(), "Guidance")) {
                Object obj2 = C3850k80.f4589a;
                SharedPreferences sharedPreferencesB = C3850k80.b(mainActivity, "SpHelper");
                if (!sharedPreferencesB.getBoolean("is_first_guide_click", false)) {
                    ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.post(new Ff0(26, mainActivity, sharedPreferencesB));
                }
            }
        }
        BaseRvAdapter baseRvAdapter = mainActivity.d;
        if (baseRvAdapter != null) {
            baseRvAdapter.d = new C5183zL(mainActivity);
        }
        return C5033xf0.f5238a;
    }
}
