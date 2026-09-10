package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Ao0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f2837a;

    public Ao0(HashMap map) {
        this.f2837a = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = this.f2837a;
        long jLongValue = ((Long) map.get((File) obj)).longValue() - ((Long) map.get((File) obj2)).longValue();
        if (jLongValue < 0) {
            return -1;
        }
        return jLongValue > 0 ? 1 : 0;
    }
}
