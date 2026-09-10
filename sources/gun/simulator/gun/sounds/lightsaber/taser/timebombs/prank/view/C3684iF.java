package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3684iF implements InterfaceC3561gr {
    public static final C3508gF f;
    public static final C3508gF g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4494a;
    public final HashMap b;
    public final C3420fF c;
    public boolean d;
    public static final C3420fF e = new C3420fF(0);
    public static final C3596hF h = new C3596hF();

    /* JADX WARN: Type inference failed for: r0v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gF] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gF] */
    static {
        final int i = 0;
        f = new InterfaceC3191ch0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gF
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC3280dh0) obj2).d((String) obj);
                        break;
                    default:
                        ((InterfaceC3280dh0) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new InterfaceC3191ch0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gF
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC3280dh0) obj2).d((String) obj);
                        break;
                    default:
                        ((InterfaceC3280dh0) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C3684iF() {
        HashMap map = new HashMap();
        this.f4494a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final InterfaceC3561gr a(Class cls, InterfaceC3521gS interfaceC3521gS) {
        this.f4494a.put(cls, interfaceC3521gS);
        this.b.remove(cls);
        return this;
    }
}
