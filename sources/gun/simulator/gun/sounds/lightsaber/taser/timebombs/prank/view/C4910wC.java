package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4910wC extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5173a;
    public final Object b;

    public C4910wC(Object obj, Object obj2) {
        this.f5173a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5173a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
