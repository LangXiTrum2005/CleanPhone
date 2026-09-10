package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2646Og extends M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3514a;
    public int b;
    public final /* synthetic */ C2698Qg c;

    public C2646Og(C2698Qg c2698Qg, int i) {
        this.c = c2698Qg;
        Object obj = C2698Qg.j;
        this.f3514a = c2698Qg.k()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.f3514a;
        C2698Qg c2698Qg = this.c;
        if (i != -1 && i < c2698Qg.size()) {
            if (FW.B(obj, c2698Qg.k()[this.b])) {
                return;
            }
        }
        Object obj2 = C2698Qg.j;
        this.b = c2698Qg.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3514a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2698Qg c2698Qg = this.c;
        Map mapC = c2698Qg.c();
        if (mapC != null) {
            return mapC.get(this.f3514a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return c2698Qg.l()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2698Qg c2698Qg = this.c;
        Map mapC = c2698Qg.c();
        Object obj2 = this.f3514a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            c2698Qg.put(obj2, obj);
            return null;
        }
        Object obj3 = c2698Qg.l()[i];
        c2698Qg.l()[this.b] = obj;
        return obj3;
    }
}
