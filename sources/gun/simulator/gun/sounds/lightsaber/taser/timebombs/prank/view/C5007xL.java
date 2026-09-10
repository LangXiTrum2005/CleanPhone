package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5007xL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5219a;
    public final /* synthetic */ MainActivity b;
    public final /* synthetic */ RecyclerView.ViewHolder c;
    public final /* synthetic */ WeaponSorts d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5007xL(MainActivity mainActivity, RecyclerView.ViewHolder viewHolder, WeaponSorts weaponSorts, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = mainActivity;
        this.c = viewHolder;
        this.d = weaponSorts;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C5007xL c5007xL = new C5007xL(this.b, this.c, this.d, interfaceC2857Wj);
        c5007xL.f5219a = obj;
        return c5007xL;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C5007xL c5007xL = (C5007xL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c5007xL.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.f5219a;
        int adapterPosition = this.c.getAdapterPosition();
        int i = MainActivity.j;
        MainActivity mainActivity = this.b;
        mainActivity.getClass();
        if (adapterPosition == 0) {
            S3.b("main_page_click", "machine_gun");
        } else if (adapterPosition == 1) {
            S3.b("main_page_click", "lightsaber");
        } else if (adapterPosition == 2) {
            S3.b("main_page_click", "taser");
        } else if (adapterPosition == 3) {
            S3.b("main_page_click", "time_bomb");
        } else if (adapterPosition == 4) {
            S3.b("main_page_click", "sci_fi_gun");
        }
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(mainActivity, "button_sound/button_sound.ogg", null), 2);
        WeaponSorts weaponSorts = this.d;
        if (AbstractC2995aW.i(String.valueOf(weaponSorts.getSortId()), "0") || AbstractC2995aW.i(String.valueOf(weaponSorts.getSortId()), "1")) {
            mainActivity.f.remove(String.valueOf(weaponSorts.getSortId()));
        }
        AbstractC3651ht.a(interfaceC4514rk, new C4919wL(weaponSorts, mainActivity, null));
        if (weaponSorts.getSortId() == 5) {
            if (mainActivity.h) {
                int i2 = RussianRouletteActivity.t;
                C2498In.k(mainActivity);
            } else {
                C2398Er.a().e(mainActivity, 2, new C4831vL(mainActivity, 0));
            }
        } else if (mainActivity.h) {
            Intent intent = new Intent(mainActivity.getBaseContext(), (Class<?>) WeaponSortActivity.class);
            intent.putExtra("weaponSort", weaponSorts);
            mainActivity.startActivity(intent);
        } else {
            C2398Er.a().e(mainActivity, 1, new C5095yL(mainActivity, weaponSorts));
        }
        return C5033xf0.f5238a;
    }
}
