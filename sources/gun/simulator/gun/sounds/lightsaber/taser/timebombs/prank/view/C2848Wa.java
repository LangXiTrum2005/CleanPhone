package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.SoundPool;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2848Wa extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3355eb f3927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848Wa(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3927a = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2848Wa(this.f3927a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        C2848Wa c2848Wa = (C2848Wa) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2848Wa.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        C3355eb c3355eb = this.f3927a;
        AssetManager assets = c3355eb.f4847a.getAssets();
        Weapon weapon = c3355eb.b;
        AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(weapon.getBombSoundPath());
        try {
            SoundPool soundPoolC = c3355eb.c();
            c3355eb.r = soundPoolC != null ? new Integer(soundPoolC.load(assetFileDescriptorOpenFd, 1)) : null;
            AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            int nameId = weapon.getNameId();
            WeaponUseActivity weaponUseActivity = c3355eb.f4847a;
            if (nameId == R.string.weapon_name_time_bomb_nuclear) {
                AssetFileDescriptor assetFileDescriptorOpenFd2 = weaponUseActivity.getAssets().openFd("weaponsound/bomb/nuclear_byoyomi.ogg");
                try {
                    SoundPool soundPoolC2 = c3355eb.c();
                    c3355eb.t = soundPoolC2 != null ? new Integer(soundPoolC2.load(assetFileDescriptorOpenFd2, 1)) : null;
                    AbstractC3375el.n(assetFileDescriptorOpenFd2, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3375el.n(assetFileDescriptorOpenFd2, th);
                        throw th2;
                    }
                }
            } else {
                if (weapon.getNameId() == R.string.weapon_name_time_bomb_tomahawk || weapon.getNameId() == R.string.weapon_name_time_bomb_drone) {
                    AssetFileDescriptor assetFileDescriptorOpenFd3 = weaponUseActivity.getAssets().openFd("weaponsound/bomb/bomb_fly.ogg");
                    try {
                        SoundPool soundPoolC3 = c3355eb.c();
                        c3355eb.s = soundPoolC3 != null ? new Integer(soundPoolC3.load(assetFileDescriptorOpenFd3, 1)) : null;
                        AbstractC3375el.n(assetFileDescriptorOpenFd3, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC3375el.n(assetFileDescriptorOpenFd3, th3);
                            throw th4;
                        }
                    }
                }
                c3355eb.x = EnumC3410f70.BombByoyomi;
                c3355eb.y = EnumC3410f70.BombFastByoyomi;
            }
            if (!c3355eb.i) {
                c3355eb.i = ((Boolean) AbstractC3194cj.c().a()).booleanValue();
            }
            return C5033xf0.f5238a;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC3375el.n(assetFileDescriptorOpenFd, th5);
                throw th6;
            }
        }
    }
}
