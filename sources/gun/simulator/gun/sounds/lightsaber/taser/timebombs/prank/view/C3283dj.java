package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.SoundPool;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3283dj extends WG implements InterfaceC2714Qw {
    public static final C3283dj g = new C3283dj(0);
    public static final C3283dj h = new C3283dj(1);
    public static final C3283dj i = new C3283dj(2);
    public static final C3283dj j = new C3283dj(3);
    public static final C3283dj k = new C3283dj(4);
    public static final C3283dj l = new C3283dj(5);
    public static final C3283dj m = new C3283dj(6);
    public static final C3283dj n = new C3283dj(7);
    public static final C3283dj o = new C3283dj(8);
    public static final C3283dj p = new C3283dj(9);
    public static final C3283dj q = new C3283dj(10);
    public static final C3283dj r = new C3283dj(11);
    public static final C3283dj s = new C3283dj(12);
    public static final C3283dj t = new C3283dj(13);
    public static final C3283dj u = new C3283dj(14);
    public static final C3283dj v = new C3283dj(15);
    public static final C3283dj w = new C3283dj(16);
    public static final C3283dj x = new C3283dj(17);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3283dj(int i2) {
        super(0);
        this.f = i2;
    }

    public final C2856Wi b() {
        switch (this.f) {
            case 0:
                return new C2856Wi("GLOCK17_SHOOT_EFFECT_RESOURCE", "Standard");
            case 1:
                return new C2856Wi("HK416_SHOOT_EFFECT_RESOURCE", "Standard");
            case 2:
                return new C2856Wi("KAR98K_SHOOT_EFFECT_RESOURCE", "Standard");
            case 3:
                return new C2856Wi("M1014_SHOOT_EFFECT_RESOURCE", "Buckshot");
            case 4:
                return new C2856Wi("M4A4_P_SHOOT_EFFECT_RESOURCE", "Standard");
            case 5:
                return new C2856Wi("M4A4_SHOOT_EFFECT_RESOURCE", "Standard");
            case 6:
                return new C2856Wi("M762_SHOOT_EFFECT_RESOURCE", "Standard");
            case 7:
                return new C2856Wi("MP5_SHOOT_EFFECT_RESOURCE", "Standard");
            case 8:
                return new C2856Wi("NEGEV_SHOOT_EFFECT_RESOURCE", "Standard");
            case 9:
                return new C2856Wi("P90_SHOOT_EFFECT_RESOURCE", "Standard");
            case 10:
                return new C2856Wi("SCAR_20S_SHOOT_EFFECT_RESOURCE", "Standard");
            case 11:
                return new C2856Wi("SVD_SHOOT_EFFECT_RESOURCE", "Standard");
            case 12:
                return new C2856Wi("UMP45_SHOOT_EFFECT_RESOURCE", "Standard");
            case 13:
                return new C2856Wi("USP_SHOOT_EFFECT_RESOURCE", "Standard");
            case 14:
                return new C2856Wi("USED_RUSSIAN_ROULETTE", Boolean.FALSE);
            default:
                return new C2856Wi("USED_WEAPON", Boolean.FALSE);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                return b();
            case 12:
                return b();
            case 13:
                return b();
            case 14:
                return b();
            case 15:
                return b();
            case 16:
                try {
                    return Camera.open();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            default:
                SoundPool.Builder maxStreams = new SoundPool.Builder().setMaxStreams(1);
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(3);
                return maxStreams.setAudioAttributes(builder.build()).build();
        }
    }
}
