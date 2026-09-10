package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class NJ {
    public static final NJ b = new NJ();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f3451a = new LruCache(20);

    public final MJ a(String str) {
        if (str == null) {
            return null;
        }
        return (MJ) this.f3451a.get(str);
    }
}
