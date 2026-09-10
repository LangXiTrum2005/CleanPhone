package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class Bb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gb0 f2878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bb0(Gb0 gb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2878a = gb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Bb0(this.f2878a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        Bb0 bb0 = (Bb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        bb0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC3375el.b0(obj);
        Gb0 gb0 = this.f2878a;
        AssetFileDescriptor assetFileDescriptorOpenFd = gb0.f4847a.getAssets().openFd(gb0.b.getActiveSoundPath());
        try {
            gb0.O = gb0.c().load(assetFileDescriptorOpenFd, 1);
            AbstractC3375el.n(assetFileDescriptorOpenFd, null);
            if (!gb0.i) {
                gb0.i = ((Boolean) AbstractC3194cj.c().a()).booleanValue();
            }
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
