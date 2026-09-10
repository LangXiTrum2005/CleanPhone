package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.media.SoundPool;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3576h20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4443a;
    public final /* synthetic */ C4629t20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3576h20(List list, C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4443a = list;
        this.b = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3576h20(this.f4443a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3576h20 c3576h20 = (C3576h20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3576h20.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        try {
            List<C4839vT> list = this.f4443a;
            C4629t20 c4629t20 = this.b;
            for (C4839vT c4839vT : list) {
                String str = (String) c4839vT.f5132a;
                InterfaceC2766Sw interfaceC2766Sw = (InterfaceC2766Sw) c4839vT.b;
                AssetFileDescriptor assetFileDescriptorOpenFd = c4629t20.f5012a.getAssets().openFd("weaponsound/russian_roulette/" + str);
                try {
                    interfaceC2766Sw.invoke(new Integer(((SoundPool) c4629t20.R.getValue()).load(assetFileDescriptorOpenFd, 1)));
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
        } catch (Exception unused) {
        }
        return C5033xf0.f5238a;
    }
}
