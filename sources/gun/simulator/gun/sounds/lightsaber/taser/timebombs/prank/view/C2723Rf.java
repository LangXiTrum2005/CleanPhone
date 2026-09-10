package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2723Rf {
    public static final C2723Rf INSTANCE = new C2723Rf();

    private C2723Rf() {
    }

    public static final synchronized void addToSet(HashSet<String> hashSet, String str) {
        AbstractC2995aW.q(hashSet, "hashset");
        AbstractC2995aW.q(str, "set");
        hashSet.add(str);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
