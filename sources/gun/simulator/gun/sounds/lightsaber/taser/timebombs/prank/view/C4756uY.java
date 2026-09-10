package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4756uY implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5082a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Clock clock = C4844vY.j;
        synchronized (C4844vY.class) {
            Iterator it = C4844vY.l.values().iterator();
            while (it.hasNext()) {
                ((C2375Du) it.next()).d(z);
            }
        }
    }
}
