package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.SoundPool;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3057b70 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC3410f70 f4159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057b70(EnumC3410f70 enumC3410f70, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4159a = enumC3410f70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3057b70(this.f4159a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3057b70) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        EnumC3410f70 enumC3410f70 = this.f4159a;
        int i = enumC3410f70.b;
        if (i <= 0) {
            C2498In c2498In = App.n;
            AssetManager assets = C2498In.i().getAssets();
            AssetFileDescriptor assetFileDescriptorOpenFd = assets != null ? assets.openFd(enumC3410f70.f4353a) : null;
            try {
                int iLoad = ((SoundPool) C3498g70.f4404a.getValue()).load(assetFileDescriptorOpenFd, 1);
                enumC3410f70.b = iLoad;
                AbstractC3375el.n(assetFileDescriptorOpenFd, null);
                i = iLoad;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(assetFileDescriptorOpenFd, th);
                    throw th2;
                }
            }
        }
        return new Integer(i);
    }
}
