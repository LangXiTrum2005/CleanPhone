package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3190ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4237a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final InterfaceC3718ih f;
    public final Set g;

    public C3190ch(String str, Set set, Set set2, int i, int i2, InterfaceC3718ih interfaceC3718ih, Set set3) {
        this.f4237a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC3718ih;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static C3605hO a(Class cls) {
        return new C3605hO(cls, new Class[0]);
    }

    public static C3190ch b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(RW.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC3375el.l(cls2, "Null interface");
            hashSet.add(RW.a(cls2));
        }
        return new C3190ch(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C4808v4(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
