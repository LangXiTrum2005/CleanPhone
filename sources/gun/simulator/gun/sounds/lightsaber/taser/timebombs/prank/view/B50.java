package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B50 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2855a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ B50(KeyEvent.Callback callback, int i) {
        this.f2855a = i;
        this.b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Throwable {
        int i = this.f2855a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                SettingActivity settingActivity = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.O.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "flash_on");
                } else {
                    S3.b("setting_page_click", "flash_off");
                }
                Object obj = AbstractC3762j80.f4539a;
                G7.w(settingActivity).putBoolean("SWITCH_FLASH", z);
                return;
            case 1:
                SettingActivity settingActivity2 = (SettingActivity) callback;
                AbstractC3194cj.b().b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "screen_flash_on");
                } else {
                    S3.b("setting_page_click", "screen_flash_off");
                }
                Object obj2 = AbstractC3762j80.f4539a;
                G7.w(settingActivity2).putBoolean("SWITCH_SCREEN_FLASH", z);
                return;
            case 2:
                SettingActivity settingActivity3 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.Q.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "haptic_on");
                } else {
                    S3.b("setting_page_click", "haptic_off");
                }
                Object obj3 = AbstractC3762j80.f4539a;
                G7.w(settingActivity3).putBoolean("SWITCH_HAPTIC", z);
                return;
            case 3:
                SettingActivity settingActivity4 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.R.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "firing_sound_on");
                } else {
                    S3.b("setting_page_click", "firing_sound_off");
                }
                Object obj4 = AbstractC3762j80.f4539a;
                G7.w(settingActivity4).putBoolean("SWITCH_FIRING_SOUND", z);
                return;
            case 4:
                SettingActivity settingActivity5 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.S.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "bullet_drop_on");
                } else {
                    S3.b("setting_page_click", "bullet_drop_off");
                }
                Object obj5 = AbstractC3762j80.f4539a;
                G7.w(settingActivity5).putBoolean("SWITCH_MACHINE_BULLET_DROP", z);
                return;
            case 5:
                SettingActivity settingActivity6 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.T.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "shake_sound_on");
                } else {
                    S3.b("setting_page_click", "shake_sound_off");
                }
                Object obj6 = AbstractC3762j80.f4539a;
                G7.w(settingActivity6).putBoolean("SWITCH_LIGHTSABER_SHAKE_SOUND", z);
                return;
            case 6:
                SettingActivity settingActivity7 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.W.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "effect_explosion_on");
                } else {
                    S3.b("setting_page_click", "effect_explosion_off");
                }
                Object obj7 = AbstractC3762j80.f4539a;
                G7.w(settingActivity7).putBoolean("SWITCH_TIME_BOMB_EXPLOSION", z);
                return;
            case 7:
                SettingActivity settingActivity8 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.U.getValue()).b(Boolean.valueOf(z));
                if (z) {
                    S3.b("setting_page_click", "button_sound_on");
                } else {
                    S3.b("setting_page_click", "button_sound_off");
                }
                Object obj8 = AbstractC3762j80.f4539a;
                G7.w(settingActivity8).putBoolean("SWITCH_CLICK_SOUND", z);
                return;
            case 8:
                SettingActivity settingActivity9 = (SettingActivity) callback;
                ((C2856Wi) AbstractC3194cj.V.getValue()).b(Boolean.valueOf(z));
                Object obj9 = AbstractC3762j80.f4539a;
                G7.w(settingActivity9).putBoolean("SWITCH_BGM", z);
                if (z) {
                    S3.b("setting_page_click", "background_music_on");
                    C2498In c2498In = App.n;
                    WD.D(C2498In.g(), AbstractC4437qp.b, 0, new B8(settingActivity9, null), 2);
                    return;
                }
                S3.b("setting_page_click", "background_music_off");
                MediaPlayer mediaPlayer = BF.g;
                try {
                    if (mediaPlayer != null) {
                        try {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mediaPlayer.release();
                        BF.g = null;
                        break;
                    }
                    BF.g = null;
                    return;
                } catch (Throwable th) {
                    mediaPlayer.release();
                    BF.g = null;
                    throw th;
                }
            default:
                ((Chip) callback).lambda$new$0(compoundButton, z);
                return;
        }
    }
}
