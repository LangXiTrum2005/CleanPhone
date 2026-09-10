package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3687iI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4495a;
    public final /* synthetic */ C4213oI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3687iI(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3687iI(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3687iI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        C3109bk0 c3109bk0M;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4495a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4213oI c4213oI = this.b;
            int i2 = c4213oI.Q;
            WeaponUseActivity weaponUseActivity = c4213oI.f4847a;
            if (i2 == 0) {
                AssetFileDescriptor assetFileDescriptorOpenFd = weaponUseActivity.getAssets().openFd("weaponsound/lightsaber/light_saber_shoot.ogg");
                try {
                    c4213oI.Q = c4213oI.c().load(assetFileDescriptorOpenFd, 1);
                    AbstractC3375el.n(assetFileDescriptorOpenFd, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3375el.n(assetFileDescriptorOpenFd, th);
                        throw th2;
                    }
                }
            }
            if (c4213oI.S == 0) {
                AssetFileDescriptor assetFileDescriptorOpenFd2 = weaponUseActivity.getAssets().openFd("weaponsound/lightsaber/light_saber_return.ogg");
                try {
                    c4213oI.S = c4213oI.c().load(assetFileDescriptorOpenFd2, 1);
                    AbstractC3375el.n(assetFileDescriptorOpenFd2, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC3375el.n(assetFileDescriptorOpenFd2, th3);
                        throw th4;
                    }
                }
            }
            if (!c4213oI.i) {
                c4213oI.i = ((Boolean) AbstractC3194cj.c().a()).booleanValue();
            }
            c4213oI.k(c4213oI.b.getMagazineCapacity());
            if (AbstractC2995aW.i(c4213oI.b0, "xunhuan_huoxing") && (c3109bk0M = weaponUseActivity.m()) != null) {
                String str = c4213oI.b0;
                this.f4495a = 1;
                Object objX = WD.X(new Mj0(c3109bk0M, str, null), AbstractC4437qp.b, this);
                if (objX != enumC4602sk) {
                    objX = c5033xf0;
                }
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
