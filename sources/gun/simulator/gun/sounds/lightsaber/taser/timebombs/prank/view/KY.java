package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class KY extends NY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3317a;
    public final /* synthetic */ RO b;
    public final /* synthetic */ Object c;

    public KY(RO ro, Object obj, int i) {
        this.f3317a = i;
        this.b = ro;
        this.c = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final long contentLength() {
        int i = this.f3317a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((File) obj).length();
            default:
                return ((C3971lc) obj).c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final RO contentType() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final void writeTo(InterfaceC2434Gb interfaceC2434Gb) throws IllegalAccessException, IOException, InvocationTargetException {
        int i = this.f3317a;
        Object obj = this.c;
        switch (i) {
            case 0:
                File file = (File) obj;
                Logger logger = AbstractC4926wS.f5180a;
                AbstractC2995aW.q(file, "<this>");
                C5164z6 c5164z6 = new C5164z6(new FileInputStream(file), Ic0.d);
                try {
                    interfaceC2434Gb.B(c5164z6);
                    AbstractC3375el.n(c5164z6, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3375el.n(c5164z6, th);
                        throw th2;
                    }
                }
            default:
                interfaceC2434Gb.I((C3971lc) obj);
                return;
        }
    }
}
