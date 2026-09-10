package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.SoundPool;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3444fb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3794jb0 f4372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3444fb0(C3794jb0 c3794jb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4372a = c3794jb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3444fb0(this.f4372a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        C3444fb0 c3444fb0 = (C3444fb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3444fb0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        C3794jb0 c3794jb0 = this.f4372a;
        AssetManager assets = c3794jb0.f4847a.getAssets();
        Weapon weapon = c3794jb0.b;
        AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(weapon.getTaserRepeatSoundPath());
        try {
            c3794jb0.O = c3794jb0.c().load(assetFileDescriptorOpenFd, 1);
            AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            WeaponUseActivity weaponUseActivity = c3794jb0.f4847a;
            AssetFileDescriptor assetFileDescriptorOpenFd2 = weaponUseActivity.getAssets().openFd("weaponsound/taser/taser gun1.MP3");
            try {
                c3794jb0.V = c3794jb0.c().load(assetFileDescriptorOpenFd2, 1);
                AbstractC3375el.n(assetFileDescriptorOpenFd2, null);
                AssetFileDescriptor assetFileDescriptorOpenFd3 = weaponUseActivity.getAssets().openFd(weapon.getReloadSoundPath());
                try {
                    SoundPool soundPoolC = c3794jb0.c();
                    c3794jb0.e = soundPoolC != null ? new Integer(soundPoolC.load(assetFileDescriptorOpenFd3, 1)) : null;
                    AbstractC3375el.n(assetFileDescriptorOpenFd3, null);
                    AssetFileDescriptor assetFileDescriptorOpenFd4 = weaponUseActivity.getAssets().openFd(weapon.getBulletClearSoundPath());
                    try {
                        SoundPool soundPoolC2 = c3794jb0.c();
                        c3794jb0.f = soundPoolC2 != null ? new Integer(soundPoolC2.load(assetFileDescriptorOpenFd4, 1)) : null;
                        AbstractC3375el.n(assetFileDescriptorOpenFd4, null);
                        if (!c3794jb0.i) {
                            c3794jb0.i = ((Boolean) AbstractC3194cj.c().a()).booleanValue();
                        }
                        return C5033xf0.f5238a;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3375el.n(assetFileDescriptorOpenFd4, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC3375el.n(assetFileDescriptorOpenFd3, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC3375el.n(assetFileDescriptorOpenFd2, th5);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                AbstractC3375el.n(assetFileDescriptorOpenFd, th7);
                throw th8;
            }
        }
    }
}
