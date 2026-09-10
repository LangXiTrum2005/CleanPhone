package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RL f3768a;

    static {
        String property;
        Object next;
        int i = Ta0.f3778a;
        RL rlB = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List listP0 = AbstractC5073y40.P0(A40.G0(AbstractC3950lJ.w()));
        Iterator it = listP0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iC = ((SL) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((SL) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SL sl = (SL) next;
        if (sl != null) {
            try {
                rlB = sl.b(listP0);
            } catch (Throwable unused2) {
                sl.a();
            }
            if (rlB != null) {
                f3768a = rlB;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
