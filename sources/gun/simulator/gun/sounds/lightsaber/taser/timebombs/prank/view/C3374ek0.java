package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.media.SoundPool;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3374ek0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4340pk0 f4333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3374ek0(AbstractC4340pk0 abstractC4340pk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4333a = abstractC4340pk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3374ek0(this.f4333a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        C3374ek0 c3374ek0 = (C3374ek0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3374ek0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        AbstractC4340pk0 abstractC4340pk0 = this.f4333a;
        AssetFileDescriptor assetFileDescriptorOpenFd = abstractC4340pk0.f4847a.getAssets().openFd(abstractC4340pk0.b.getActiveSoundPath());
        try {
            SoundPool soundPoolC = abstractC4340pk0.c();
            abstractC4340pk0.d = soundPoolC != null ? new Integer(soundPoolC.load(assetFileDescriptorOpenFd, 1)) : null;
            AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            AssetFileDescriptor assetFileDescriptorOpenFd2 = abstractC4340pk0.f4847a.getAssets().openFd(abstractC4340pk0.b.getReloadSoundPath());
            try {
                SoundPool soundPoolC2 = abstractC4340pk0.c();
                abstractC4340pk0.e = soundPoolC2 != null ? new Integer(soundPoolC2.load(assetFileDescriptorOpenFd2, 1)) : null;
                AbstractC3375el.n(assetFileDescriptorOpenFd2, null);
                AssetFileDescriptor assetFileDescriptorOpenFd3 = abstractC4340pk0.f4847a.getAssets().openFd(abstractC4340pk0.b.getBulletClearSoundPath());
                try {
                    SoundPool soundPoolC3 = abstractC4340pk0.c();
                    abstractC4340pk0.f = soundPoolC3 != null ? new Integer(soundPoolC3.load(assetFileDescriptorOpenFd3, 1)) : null;
                    AbstractC3375el.n(assetFileDescriptorOpenFd3, null);
                    return C5033xf0.f5238a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3375el.n(assetFileDescriptorOpenFd3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3375el.n(assetFileDescriptorOpenFd2, th3);
                    throw th4;
                }
            }
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
