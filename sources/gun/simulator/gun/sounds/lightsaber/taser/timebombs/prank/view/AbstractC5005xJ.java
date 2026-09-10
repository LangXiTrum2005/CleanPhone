package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5005xJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4741uJ f5217a = new C4741uJ();

    public static void a() {
        f5217a.getClass();
    }

    public static void b(String str) {
        f5217a.getClass();
        HashSet hashSet = C4741uJ.f5073a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f5217a.getClass();
        HashSet hashSet = C4741uJ.f5073a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
