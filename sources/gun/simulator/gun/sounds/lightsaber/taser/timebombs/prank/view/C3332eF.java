package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3332eF implements InterfaceC2935Zj {
    public static final C3244dF Companion = new C3244dF(null);
    private static final VE json = WD.b(C3155cF.INSTANCE);
    private final InterfaceC4211oG kType;

    public C3332eF(InterfaceC4211oG interfaceC4211oG) {
        AbstractC2995aW.q(interfaceC4211oG, "kType");
        this.kType = interfaceC4211oG;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2935Zj
    public Object convert(CZ cz) throws IllegalAccessException, IOException, InvocationTargetException {
        if (cz != null) {
            try {
                String strString = cz.string();
                if (strString != null) {
                    Object objA = json.a(AbstractC3375el.V(VE.d.b, this.kType), strString);
                    AbstractC3375el.n(cz, null);
                    return objA;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(cz, th);
                    throw th2;
                }
            }
        }
        AbstractC3375el.n(cz, null);
        return null;
    }
}
