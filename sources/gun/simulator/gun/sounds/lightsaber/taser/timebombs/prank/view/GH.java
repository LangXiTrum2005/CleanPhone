package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class GH extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4213oI f3114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GH(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3114a = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new GH(this.f3114a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        GH gh = (GH) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        gh.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        C4213oI c4213oI = this.f3114a;
        if (AbstractC2995aW.i(c4213oI.b0, "shensheng")) {
            AssetFileDescriptor assetFileDescriptorOpenFd = c4213oI.f4847a.getAssets().openFd("weaponsound/lightsaber/light_saber_circle_shensheng.ogg");
            try {
                c4213oI.P = c4213oI.c().load(assetFileDescriptorOpenFd, 1);
                AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(assetFileDescriptorOpenFd, th);
                    throw th2;
                }
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenFd2 = c4213oI.f4847a.getAssets().openFd("weaponsound/lightsaber/light_saber_circle_default.ogg");
            try {
                c4213oI.P = c4213oI.c().load(assetFileDescriptorOpenFd2, 1);
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
        return C5033xf0.f5238a;
    }
}
