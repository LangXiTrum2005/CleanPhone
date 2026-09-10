package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.gyf.immersionbar.SupportRequestBarManagerFragment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogCartridgeClipReloadBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC3094bd extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final Weapon b;
    public final WeaponUseActivity c;
    public InterfaceC2766Sw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3094bd(WeaponUseActivity weaponUseActivity, Weapon weapon, WeaponUseActivity weaponUseActivity2) {
        super(weaponUseActivity, R.style.BottomAnimStyle);
        AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(weaponUseActivity2, "mActivity");
        this.b = weapon;
        this.c = weaponUseActivity2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogCartridgeClipReloadBinding dialogCartridgeClipReloadBindingInflate = DialogCartridgeClipReloadBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogCartridgeClipReloadBindingInflate, "inflate(...)");
        return dialogCartridgeClipReloadBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        String str;
        Weapon weapon = this.b;
        if (weapon != null) {
            ((DialogCartridgeClipReloadBinding) a()).ivWeaponBullet.setImageResource(weapon.getIconReloadCartridgeClip());
        }
        VQ vqA = VQ.a();
        Context context = getContext();
        ConstraintLayout constraintLayout = ((DialogCartridgeClipReloadBinding) a()).conNativeAdPlacement;
        C3491g4 c3491g4 = AbstractC3485g1.f;
        if (weapon instanceof LightSaber) {
            str = "Lightsaber";
        } else if (weapon instanceof MechanicalGun) {
            str = "MachineGun";
        } else if (weapon instanceof Taser) {
            str = "Taser";
        } else if (weapon instanceof TechnologyGun) {
            str = "SciFiGun";
        } else {
            str = weapon instanceof TimeBomb ? "TimeBomb" : "";
        }
        vqA.g(context, constraintLayout, c3491g4, "NavLarge_Reload".concat(str), new C2498In(1), 1, new QL(this, 3));
        ((DialogCartridgeClipReloadBinding) a()).btReload.setOnClickListener(new ViewOnClickListenerC3176ca(this, 5));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        XY xy = WY.f3925a;
        xy.getClass();
        WeaponUseActivity weaponUseActivity = this.c;
        if (weaponUseActivity != null) {
            StringBuilder sbO = DM.o(xy.f3974a + getClass().getName());
            sbO.append(System.identityHashCode(this));
            sbO.append(".tag.notOnly.");
            xy.b(weaponUseActivity.getSupportFragmentManager(), sbO.toString(), true);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        InterfaceC2766Sw interfaceC2766Sw = this.d;
        if (interfaceC2766Sw != null) {
            interfaceC2766Sw.invoke(Boolean.TRUE);
        }
        AbstractC3651ht.b(this);
    }

    @Override // android.app.Dialog
    public final void show() {
        XY xy = WY.f3925a;
        xy.getClass();
        WeaponUseActivity weaponUseActivity = this.c;
        if (weaponUseActivity == null) {
            throw new NullPointerException("activity is null");
        }
        StringBuilder sbO = DM.o(xy.f3974a + DialogC3094bd.class.getName());
        sbO.append(System.identityHashCode(this));
        sbO.append(".tag.notOnly.");
        SupportRequestBarManagerFragment supportRequestBarManagerFragmentB = xy.b(weaponUseActivity.getSupportFragmentManager(), sbO.toString(), false);
        if (supportRequestBarManagerFragmentB.f849a == null) {
            supportRequestBarManagerFragmentB.f849a = new RunnableC4646tC(weaponUseActivity, this);
        }
        com.gyf.immersionbar.a aVar = (com.gyf.immersionbar.a) supportRequestBarManagerFragmentB.f849a.c;
        aVar.d();
        aVar.k.e = true;
        aVar.e();
        super.show();
    }
}
