package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2290An implements InterfaceC5098yO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3274de0 f2835a;
    public final InterfaceC4341pl b;
    public G7 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public C2290An(Context context) {
        this(new C2600Mm(context), new C3114bn());
    }

    public static InterfaceC5098yO d(Class cls, InterfaceC4341pl interfaceC4341pl) {
        try {
            return (InterfaceC5098yO) cls.getConstructor(InterfaceC4341pl.class).newInstance(interfaceC4341pl);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO a(C2808Um c2808Um) {
        FW.p(c2808Um, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        C3274de0 c3274de0 = this.f2835a;
        c3274de0.f = c2808Um;
        Iterator it = ((Map) c3274de0.d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC5098yO) it.next()).a(c2808Um);
        }
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO b(G7 g7) {
        FW.p(g7, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = g7;
        C3274de0 c3274de0 = this.f2835a;
        c3274de0.g = g7;
        Iterator it = ((Map) c3274de0.d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC5098yO) it.next()).b(g7);
        }
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final G9 c(C3693iO c3693iO) {
        Uri uri;
        String str;
        String str2;
        Object obj;
        List list;
        AC ac;
        C3341eO c3341eO;
        C3693iO c3693iO2 = c3693iO;
        C3341eO c3341eO2 = c3693iO2.b;
        c3341eO2.getClass();
        String scheme = c3341eO2.f4269a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iG = Ug0.G(c3341eO2.f4269a, c3341eO2.b);
        C3274de0 c3274de0 = this.f2835a;
        InterfaceC5098yO interfaceC5098yO = (InterfaceC5098yO) ((Map) c3274de0.d).get(Integer.valueOf(iG));
        if (interfaceC5098yO == null) {
            Ca0 ca0H = c3274de0.h(iG);
            if (ca0H == null) {
                interfaceC5098yO = null;
            } else {
                interfaceC5098yO = (InterfaceC5098yO) ca0H.get();
                C2808Um c2808Um = (C2808Um) c3274de0.f;
                if (c2808Um != null) {
                    interfaceC5098yO.a(c2808Um);
                }
                G7 g7 = (G7) c3274de0.g;
                if (g7 != null) {
                    interfaceC5098yO.b(g7);
                }
                ((Map) c3274de0.d).put(Integer.valueOf(iG), interfaceC5098yO);
            }
        }
        FW.u(interfaceC5098yO, "No suitable media source factory found for content type: " + iG);
        C3164cO c3164cO = c3693iO2.c;
        C3076bO c3076bOA = c3164cO.a();
        if (c3164cO.f4220a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c3076bOA.f4168a = this.d;
        }
        if (c3164cO.d == -3.4028235E38f) {
            c3076bOA.d = this.g;
        }
        if (c3164cO.e == -3.4028235E38f) {
            c3076bOA.e = this.h;
        }
        if (c3164cO.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c3076bOA.b = this.e;
        }
        if (c3164cO.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c3076bOA.c = this.f;
        }
        C3164cO c3164cOA = c3076bOA.a();
        int i = 0;
        if (!c3164cOA.equals(c3164cO)) {
            ZN zn = new ZN();
            List listEmptyList = Collections.emptyList();
            C3965lY c3965lY = C3965lY.e;
            C3429fO c3429fO = C3429fO.d;
            WN wn = new WN();
            YN yn = c3693iO2.e;
            wn.f3918a = yn.f3965a;
            wn.b = yn.b;
            wn.c = yn.c;
            wn.d = yn.d;
            wn.e = yn.e;
            c3164cO.a();
            if (c3341eO2 != null) {
                C2987aO c2987aO = c3341eO2.c;
                if (c2987aO != null) {
                    zn = new ZN();
                    zn.f4068a = c2987aO.f4120a;
                    zn.b = c2987aO.b;
                    zn.c = c2987aO.c;
                    zn.d = c2987aO.d;
                    zn.e = c2987aO.e;
                    zn.f = c2987aO.f;
                    zn.g = c2987aO.g;
                    zn.h = c2987aO.h;
                } else {
                    zn = new ZN();
                }
                String str3 = c3341eO2.e;
                String str4 = c3341eO2.b;
                Uri uri2 = c3341eO2.f4269a;
                List list2 = c3341eO2.d;
                AC ac2 = c3341eO2.f;
                obj = c3341eO2.g;
                str2 = str3;
                str = str4;
                uri = uri2;
                list = list2;
                ac = ac2;
            } else {
                uri = null;
                str = null;
                str2 = null;
                obj = null;
                list = listEmptyList;
                ac = c3965lY;
            }
            C3076bO c3076bOA2 = c3164cOA.a();
            FW.s(zn.b == null || zn.f4068a != null);
            if (uri != null) {
                c3341eO = new C3341eO(uri, str, zn.f4068a != null ? new C2987aO(zn) : null, list, str2, ac, obj);
            } else {
                c3341eO = null;
            }
            String str5 = c3693iO2.f4499a;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = str5;
            YN yn2 = new YN(wn);
            C3164cO c3164cOA2 = c3076bOA2.a();
            C3955lO c3955lO = c3693iO2.d;
            if (c3955lO == null) {
                c3955lO = C3955lO.I;
            }
            c3693iO2 = new C3693iO(str6, yn2, c3341eO, c3164cOA2, c3955lO, c3693iO2.f);
        }
        G9 g9C = interfaceC5098yO.c(c3693iO2);
        AC ac3 = c3693iO2.b.f;
        if (!ac3.isEmpty()) {
            G9[] g9Arr = new G9[ac3.size() + 1];
            g9Arr[0] = g9C;
            while (i < ac3.size()) {
                InterfaceC4341pl interfaceC4341pl = this.b;
                interfaceC4341pl.getClass();
                G7 g8 = new G7();
                G7 g9 = this.c;
                G7 g10 = g9 != null ? g9 : g8;
                int i2 = i + 1;
                g9Arr[i2] = new Z60(null, (C3517gO) ac3.get(i), interfaceC4341pl, g10, true, null);
                i = i2;
            }
            g9C = new C3694iP(g9Arr);
        }
        G9 g11 = g9C;
        YN yn3 = c3693iO2.e;
        long j = yn3.f3965a;
        long j2 = yn3.b;
        return (j == 0 && j2 == Long.MIN_VALUE && !yn3.d) ? g11 : new C2386Ef(g11, Ug0.L(j), Ug0.L(j2), !yn3.e, yn3.c, yn3.d);
    }

    public C2290An(C2600Mm c2600Mm, C3114bn c3114bn) {
        this.b = c2600Mm;
        C3274de0 c3274de0 = new C3274de0();
        c3274de0.f4281a = c3114bn;
        c3274de0.b = new HashMap();
        c3274de0.c = new HashSet();
        c3274de0.d = new HashMap();
        this.f2835a = c3274de0;
        if (c2600Mm != ((InterfaceC4341pl) c3274de0.e)) {
            c3274de0.e = c2600Mm;
            ((Map) c3274de0.b).clear();
            ((Map) c3274de0.d).clear();
        }
        this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }
}
