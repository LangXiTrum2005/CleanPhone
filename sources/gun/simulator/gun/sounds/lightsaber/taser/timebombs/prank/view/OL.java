package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityMainBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class OL extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ MainActivity f;
    public final /* synthetic */ SharedPreferences g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OL(MainActivity mainActivity, SharedPreferences sharedPreferences) {
        super(0);
        this.f = mainActivity;
        this.g = sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        MainActivity mainActivity = this.f;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            WeaponSorts weaponSorts = (WeaponSorts) AbstractC4781ul0.f5099a.get(0);
            if (weaponSorts.getSortId() != 6) {
                WD.D(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, 0, new C5007xL(mainActivity, viewHolderFindViewHolderForAdapterPosition, weaponSorts, null), 3);
            }
            SharedPreferences.Editor editorEdit = this.g.edit();
            editorEdit.putBoolean("is_first_guide_click", true);
            editorEdit.apply();
        }
        return C5033xf0.f5238a;
    }
}
