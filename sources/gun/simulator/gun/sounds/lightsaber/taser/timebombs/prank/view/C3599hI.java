package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3599hI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4452a;
    public final /* synthetic */ C4213oI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3599hI(WeaponUseActivity weaponUseActivity, C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4452a = weaponUseActivity;
        this.b = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3599hI(this.f4452a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        C3599hI c3599hI = (C3599hI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3599hI.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        AssetFileDescriptor assetFileDescriptorOpenFd = this.f4452a.getAssets().openFd("weaponsound/lightsaber/light_saber_shake.ogg");
        C4213oI c4213oI = this.b;
        try {
            c4213oI.R = c4213oI.c().load(assetFileDescriptorOpenFd, 1);
            AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            return C5033xf0.f5238a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(assetFileDescriptorOpenFd, th);
                throw th2;
            }
        }
    }
}
