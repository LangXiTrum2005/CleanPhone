package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4907w90 extends V implements InterfaceC4309pQ, InterfaceC4443qv {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(C4907w90.class, Object.class, "_state");
    private volatile Object _state;
    public int e;

    public C4907w90(Object obj) {
        this._state = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ
    public final boolean a(Object obj) throws IllegalAccessException, InvocationTargetException {
        i(obj);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ
    public final void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0102 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0095, B:38:0x009d, B:41:0x00a4, B:42:0x00a8, B:44:0x00ab, B:54:0x00cc, B:57:0x00df, B:58:0x00f7, B:64:0x010b, B:61:0x0102, B:63:0x0108, B:46:0x00b1, B:50:0x00b8, B:21:0x0052, B:24:0x005d, B:35:0x0086), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:58:0x00f7->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00de -> B:36:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final java.lang.Object collect(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv r17, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90.collect(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rv, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj):java.lang.Object");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V
    public final W d() {
        return new C5083y90();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V
    public final W[] e() {
        return new C5083y90[2];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        i(obj);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90
    public final Object getValue() {
        SE se = YR.f4019a;
        Object obj = f.get(this);
        if (obj == se) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        if (obj == null) {
            obj = YR.f4019a;
        }
        if (obj2 == null) {
            obj2 = YR.f4019a;
        }
        return j(obj, obj2);
    }

    public final void i(Object obj) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            obj = YR.f4019a;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i;
        W[] wArr;
        SE se;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC2995aW.i(obj3, obj)) {
                return false;
            }
            if (AbstractC2995aW.i(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            W[] wArr2 = this.f3852a;
            while (true) {
                C5083y90[] c5083y90Arr = (C5083y90[]) wArr2;
                if (c5083y90Arr != null) {
                    for (C5083y90 c5083y90 : c5083y90Arr) {
                        if (c5083y90 != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C5083y90.f5266a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(c5083y90);
                                if (obj4 == null || obj4 == (se = AbstractC4995x90.b)) {
                                    break;
                                }
                                SE se2 = AbstractC4995x90.f5211a;
                                if (obj4 != se2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(c5083y90, obj4, se2)) {
                                            ((C2798Uc) obj4).resumeWith(C5033xf0.f5238a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(c5083y90) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(c5083y90, obj4, se)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(c5083y90) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    wArr = this.f3852a;
                }
                wArr2 = wArr;
                i3 = i;
            }
        }
    }
}
