package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4090mu implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f4721a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (C4266ou.j) {
            try {
                for (C4266ou c4266ou : new ArrayList(C4266ou.k.values())) {
                    if (c4266ou.e.get()) {
                        Iterator it = c4266ou.i.iterator();
                        while (it.hasNext()) {
                            C4266ou c4266ou2 = ((C4002lu) it.next()).f4673a;
                            if (z) {
                                c4266ou2.getClass();
                            } else {
                                ((C3379en) c4266ou2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
