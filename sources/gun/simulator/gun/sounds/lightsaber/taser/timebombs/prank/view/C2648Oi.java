package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2648Oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3516a;
    public final C2700Qi b;
    public final Context c;
    public final ScheduledExecutorService d;

    public C2648Oi(C4266ou c4266ou, InterfaceC4705tu interfaceC4705tu, C2881Xh c2881Xh, C2777Th c2777Th, Context context, C3633hi c3633hi, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f3516a = linkedHashSet;
        this.b = new C2700Qi(c4266ou, interfaceC4705tu, c2881Xh, c2777Th, context, linkedHashSet, c3633hi, scheduledExecutorService);
        this.c = context;
        this.d = scheduledExecutorService;
    }

    public final synchronized void a() {
        if (!this.f3516a.isEmpty()) {
            this.b.e(0L);
        }
    }
}
