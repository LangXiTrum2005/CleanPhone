package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.exoplayer2.ui.PlayerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2770Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3777a = 0;
    public int b = 0;
    public boolean c = false;
    public PlayerView d;
    public ImageView e;
    public TextureView f;
    public final /* synthetic */ C3355eb g;

    public C2770Ta(C3355eb c3355eb) {
        this.g = c3355eb;
    }

    public final void a() {
        C3355eb c3355eb = this.g;
        if (!c3355eb.f4847a.e) {
            c3355eb.k(c3355eb.j - 1);
        }
        InterfaceC2714Qw interfaceC2714Qw = c3355eb.G;
        if (interfaceC2714Qw != null) {
            interfaceC2714Qw.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int i = 2;
        boolean z = this.c;
        C3355eb c3355eb = this.g;
        if (z) {
            PlayerView playerView = this.d;
            if (playerView != null) {
                Oh0.e(playerView);
            }
            C3355eb.o(c3355eb);
            Weapon weapon = c3355eb.b;
            if (weapon.getNameId() == R.string.weapon_name_time_bomb_nuclear) {
                c3355eb.b().postDelayed(new P0(c3355eb, 10), 350L);
            } else {
                Ch0.a(c3355eb.f4847a).b(weapon.getSwitchBoomBrokenScreen());
            }
        } else {
            if (!c3355eb.D) {
                return;
            }
            Weapon weapon2 = c3355eb.b;
            int nameId = weapon2.getNameId();
            if (nameId == R.string.weapon_name_time_bomb_tomahawk || nameId == R.string.weapon_name_time_bomb_drone) {
                c3355eb.r(500L, false);
                WeaponUseActivity weaponUseActivity = c3355eb.f4847a;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((ActivityGunBinding) weaponUseActivity.getMBinding()).ivBoom, "translationX", 0.0f, 4.0f, -6.0f, 6.0f, -6.0f, 6.0f, -6.0f, 6.0f, -6.0f, 6.0f, 0.0f);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.setDuration(417L);
                objectAnimatorOfFloat.addListener(new C3178cb(c3355eb, i));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((ActivityGunBinding) weaponUseActivity.getMBinding()).ivBoom, "translationY", 0.0f, -(((ActivityGunBinding) weaponUseActivity.getMBinding()).ivBoom.getHeight() + AbstractC3375el.G(App.n.f())));
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.setStartDelay(417L);
                objectAnimatorOfFloat2.setDuration(333L);
                objectAnimatorOfFloat2.addListener(new C3178cb(c3355eb, 3));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(c3355eb.z);
                animatorSet.addListener(new C3178cb(c3355eb));
                animatorSet.start();
                c3355eb.z = animatorSet;
            } else if (nameId == R.string.weapon_name_time_bomb_skibidi) {
                TextureView textureView = this.f;
                if (textureView != null) {
                    textureView.setAlpha(1.0f);
                }
            } else {
                c3355eb.r(0L, true);
            }
            if (!AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_time_bomb_tomahawk), Integer.valueOf(R.string.weapon_name_time_bomb_drone)).contains(Integer.valueOf(weapon2.getNameId()))) {
                C3355eb.o(c3355eb);
                try {
                    MediaPlayer mediaPlayer = c3355eb.B;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (App.q) {
            return;
        }
        S3.a("weapon_use");
        App.q = true;
    }
}
