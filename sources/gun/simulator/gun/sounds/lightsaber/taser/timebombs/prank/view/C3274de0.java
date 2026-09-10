package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.BooleanArray;
import com.badlogic.gdx.utils.ShortArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3274de0 implements InterfaceC3543gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4281a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public C3274de0(int i) {
        int i2 = 1;
        if (i != 1 && i != 2 && i != 5) {
            this.f4281a = new Array(false, 16);
            this.b = new Array(false, 16);
            this.c = new ShortArray();
            this.e = new BooleanArray();
            this.d = new ShortArray();
            this.f = new C3185ce0(this, 0);
            this.g = new C3185ce0(this, i2);
        }
    }

    public static boolean g(float[] fArr, int i, int i2, short[] sArr) {
        int i3 = sArr[((i2 + i) - 1) % i2] << 1;
        int i4 = sArr[i] << 1;
        int i5 = sArr[(i + 1) % i2] << 1;
        return !i(fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i4 + 1], fArr[i5], fArr[i5 + 1]);
    }

    public static boolean i(float f, float f2, float f3, float f4, float f5, float f6) {
        return AbstractC5044xl.w(f4, f2, f5, AbstractC5044xl.w(f2, f6, f3, (f6 - f4) * f)) >= 0.0f;
    }

    public static int l(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        return ((f7 * f2) + ((f5 * f8) - (f6 * f7))) - (f * f8) >= 0.0f ? 1 : -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Object a(Class cls) {
        if (!((Set) this.f4281a).contains(RW.a(cls))) {
            throw new C3770jF("Attempting to request an undeclared dependency " + cls + ".", 4);
        }
        Object objA = ((InterfaceC3543gh) this.g).a(cls);
        if (!cls.equals(GW.class)) {
            return objA;
        }
        return new EZ();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Set b(RW rw) {
        if (((Set) this.d).contains(rw)) {
            return ((InterfaceC3543gh) this.g).b(rw);
        }
        throw new C3770jF("Attempting to request an undeclared dependency Set<" + rw + ">.", 4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final AW c(Class cls) {
        return d(RW.a(cls));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final AW d(RW rw) {
        if (((Set) this.b).contains(rw)) {
            return ((InterfaceC3543gh) this.g).d(rw);
        }
        throw new C3770jF("Attempting to request an undeclared dependency Provider<" + rw + ">.", 4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Object e(RW rw) {
        if (((Set) this.f4281a).contains(rw)) {
            return ((InterfaceC3543gh) this.g).e(rw);
        }
        throw new C3770jF("Attempting to request an undeclared dependency " + rw + ".", 4);
    }

    public final C3761j8 f() {
        String strH = ((EnumC3699iU) this.b) == null ? " registrationStatus" : "";
        if (((Long) this.e) == null) {
            strH = strH.concat(" expiresInSecs");
        }
        if (((Long) this.f) == null) {
            strH = DM.h(strH, " tokenCreationEpochInSecs");
        }
        if (strH.isEmpty()) {
            return new C3761j8((String) this.f4281a, (EnumC3699iU) this.b, (String) this.c, (String) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (String) this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    public final Ca0 h(int i) {
        Ca0 ca0;
        Ca0 c2762Ss;
        if (((Map) this.b).containsKey(Integer.valueOf(i))) {
            return (Ca0) ((Map) this.b).get(Integer.valueOf(i));
        }
        final InterfaceC4341pl interfaceC4341pl = (InterfaceC4341pl) this.e;
        interfaceC4341pl.getClass();
        Ca0 ca1 = null;
        try {
            if (i != 0) {
                final int i2 = 1;
                if (i != 1) {
                    final int i3 = 2;
                    if (i != 2) {
                        final int i4 = 3;
                        if (i == 3) {
                            c2762Ss = new C2762Ss(RtspMediaSource$Factory.class.asSubclass(InterfaceC5098yO.class), i2);
                        } else if (i == 4) {
                            c2762Ss = new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yn
                                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
                                public final Object get() {
                                    int i5 = i4;
                                    InterfaceC4341pl interfaceC4341pl2 = interfaceC4341pl;
                                    Object obj = this;
                                    switch (i5) {
                                        case 0:
                                            return C2290An.d((Class) obj, interfaceC4341pl2);
                                        case 1:
                                            return C2290An.d((Class) obj, interfaceC4341pl2);
                                        case 2:
                                            return C2290An.d((Class) obj, interfaceC4341pl2);
                                        default:
                                            return new C3701iW(interfaceC4341pl2, (InterfaceC4441qt) ((C3274de0) obj).f4281a);
                                    }
                                }
                            };
                        }
                        ca1 = c2762Ss;
                    } else {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC5098yO.class);
                        ca0 = new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yn
                            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
                            public final Object get() {
                                int i5 = i3;
                                InterfaceC4341pl interfaceC4341pl2 = interfaceC4341pl;
                                Object obj = clsAsSubclass;
                                switch (i5) {
                                    case 0:
                                        return C2290An.d((Class) obj, interfaceC4341pl2);
                                    case 1:
                                        return C2290An.d((Class) obj, interfaceC4341pl2);
                                    case 2:
                                        return C2290An.d((Class) obj, interfaceC4341pl2);
                                    default:
                                        return new C3701iW(interfaceC4341pl2, (InterfaceC4441qt) ((C3274de0) obj).f4281a);
                                }
                            }
                        };
                    }
                } else {
                    final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC5098yO.class);
                    ca1 = new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yn
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
                        public final Object get() {
                            int i5 = i2;
                            InterfaceC4341pl interfaceC4341pl2 = interfaceC4341pl;
                            Object obj = clsAsSubclass2;
                            switch (i5) {
                                case 0:
                                    return C2290An.d((Class) obj, interfaceC4341pl2);
                                case 1:
                                    return C2290An.d((Class) obj, interfaceC4341pl2);
                                case 2:
                                    return C2290An.d((Class) obj, interfaceC4341pl2);
                                default:
                                    return new C3701iW(interfaceC4341pl2, (InterfaceC4441qt) ((C3274de0) obj).f4281a);
                            }
                        }
                    };
                }
                ((Map) this.b).put(Integer.valueOf(i), ca1);
                if (ca1 != null) {
                    ((Set) this.c).add(Integer.valueOf(i));
                }
                return ca1;
            }
            final Class clsAsSubclass3 = DashMediaSource$Factory.class.asSubclass(InterfaceC5098yO.class);
            final int i5 = 0;
            ca0 = new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yn
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
                public final Object get() {
                    int i6 = i5;
                    InterfaceC4341pl interfaceC4341pl2 = interfaceC4341pl;
                    Object obj = clsAsSubclass3;
                    switch (i6) {
                        case 0:
                            return C2290An.d((Class) obj, interfaceC4341pl2);
                        case 1:
                            return C2290An.d((Class) obj, interfaceC4341pl2);
                        case 2:
                            return C2290An.d((Class) obj, interfaceC4341pl2);
                        default:
                            return new C3701iW(interfaceC4341pl2, (InterfaceC4441qt) ((C3274de0) obj).f4281a);
                    }
                }
            };
            ca1 = ca0;
        } catch (ClassNotFoundException unused) {
        }
        ((Map) this.b).put(Integer.valueOf(i), ca1);
        if (ca1 != null) {
            ((Set) this.c).add(Integer.valueOf(i));
        }
        return ca1;
    }

    public final Set j(Class cls) {
        return b(RW.a(cls));
    }

    public final void k(EnumC3699iU enumC3699iU) {
        if (enumC3699iU == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.b = enumC3699iU;
    }
}
