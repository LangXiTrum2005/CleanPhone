package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3914ku implements AW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4621a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3914ku(int i, Object obj, Object obj2) {
        this.f4621a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW
    public final Object get() {
        int i = this.f4621a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                C4266ou c4266ou = (C4266ou) obj;
                String strC = c4266ou.c();
                return new C3287dl((Context) obj2, strC);
            case 1:
                C4069mh c4069mh = (C4069mh) obj;
                C3190ch c3190ch = (C3190ch) obj2;
                c4069mh.getClass();
                InterfaceC3718ih interfaceC3718ih = c3190ch.f;
                C3274de0 c3274de0 = new C3274de0();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (C5226zo c5226zo : c3190ch.c) {
                    int i2 = c5226zo.c;
                    boolean z = i2 == 0;
                    int i3 = c5226zo.b;
                    RW rw = c5226zo.f5344a;
                    if (z) {
                        if (i3 == 2) {
                            hashSet4.add(rw);
                        } else {
                            hashSet.add(rw);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(rw);
                    } else if (i3 == 2) {
                        hashSet5.add(rw);
                    } else {
                        hashSet2.add(rw);
                    }
                }
                Set set = c3190ch.g;
                if (!set.isEmpty()) {
                    hashSet.add(RW.a(GW.class));
                }
                c3274de0.f4281a = Collections.unmodifiableSet(hashSet);
                c3274de0.b = Collections.unmodifiableSet(hashSet2);
                c3274de0.c = Collections.unmodifiableSet(hashSet3);
                c3274de0.d = Collections.unmodifiableSet(hashSet4);
                c3274de0.e = Collections.unmodifiableSet(hashSet5);
                c3274de0.f = set;
                c3274de0.g = c4069mh;
                return interfaceC3718ih.c(c3274de0);
            default:
                return new C5062xz((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ C3914ku(Context context, String str) {
        this.f4621a = 2;
        this.c = context;
        this.b = str;
    }
}
