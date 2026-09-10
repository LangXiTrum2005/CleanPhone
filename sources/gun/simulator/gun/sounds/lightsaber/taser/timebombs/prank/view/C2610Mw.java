package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2610Mw extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3430a = 4;

    public C2610Mw(int i) {
        super(i, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f3430a;
    }
}
