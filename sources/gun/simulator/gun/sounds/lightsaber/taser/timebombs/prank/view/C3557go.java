package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3557go extends AbstractC4129nM {
    public static final AbstractC2992aT j;
    public static final AbstractC2992aT k;
    public final Object c;
    public final Context d;
    public final InterfaceC3211ct e;
    public final boolean f;
    public final C2939Zn g;
    public final C3877kY h;
    public Z6 i;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        P70 p70 = new P70(7);
        j = p70 instanceof AbstractC2992aT ? (AbstractC2992aT) p70 : new C2724Rg(p70);
        P70 p71 = new P70(8);
        k = p71 instanceof AbstractC2992aT ? (AbstractC2992aT) p71 : new C2724Rg(p71);
    }

    public C3557go(Context context) {
        G7 g7 = new G7();
        String str = C2939Zn.p0;
        C2939Zn c2939Zn = new C2939Zn(new C2913Yn(context));
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = g7;
        this.g = c2939Zn;
        this.i = Z6.g;
        boolean z = context != null && Ug0.K(context);
        this.f = z;
        if (!z && context != null && Ug0.f3833a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.h = audioManager != null ? new C3877kY(audioManager.getSpatializer()) : null;
        }
        if (c2939Zn.j0 && context == null) {
            AbstractC4038mJ.f();
        }
    }

    public static int b(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    public static void d(C4062md0 c4062md0, C2939Zn c2939Zn, HashMap map) {
        for (int i = 0; i < c4062md0.f4703a; i++) {
            C4501rd0 c4501rd0 = (C4501rd0) c2939Zn.y.get(c4062md0.a(i));
            if (c4501rd0 != null) {
                C3974ld0 c3974ld0 = c4501rd0.f4938a;
                C4501rd0 c4501rd1 = (C4501rd0) map.get(Integer.valueOf(c3974ld0.c));
                if (c4501rd1 == null || (c4501rd1.b.isEmpty() && !c4501rd0.b.isEmpty())) {
                    map.put(Integer.valueOf(c3974ld0.c), c4501rd0);
                }
            }
        }
    }

    public static int e(C4619sw c4619sw, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c4619sw.c)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(c4619sw.c);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        int i = Ug0.f3833a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean f(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static Pair i(int i, C4041mM c4041mM, int[][][] iArr, Cdo cdo, P70 p70) {
        RandomAccess randomAccessP;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c4041mM.f4692a; i2++) {
            if (i == c4041mM.b[i2]) {
                C4062md0 c4062md0 = c4041mM.c[i2];
                for (int i3 = 0; i3 < c4062md0.f4703a; i3++) {
                    C3974ld0 c3974ld0A = c4062md0.a(i3);
                    C3965lY c3965lYA = cdo.a(i2, c3974ld0A, iArr[i2][i3]);
                    int i4 = c3974ld0A.f4655a;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        AbstractC3381eo abstractC3381eo = (AbstractC3381eo) c3965lYA.get(i5);
                        int iA = abstractC3381eo.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessP = AC.p(abstractC3381eo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC3381eo);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    AbstractC3381eo abstractC3381eo2 = (AbstractC3381eo) c3965lYA.get(i6);
                                    if (abstractC3381eo2.a() == 2 && abstractC3381eo.b(abstractC3381eo2)) {
                                        arrayList2.add(abstractC3381eo2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessP = arrayList2;
                            }
                            arrayList.add(randomAccessP);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, p70);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC3381eo) list.get(i7)).c;
        }
        AbstractC3381eo abstractC3381eo3 = (AbstractC3381eo) list.get(0);
        return Pair.create(new C3123bt(0, abstractC3381eo3.b, iArr2), Integer.valueOf(abstractC3381eo3.f4340a));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4129nM
    public final void a() {
        C3877kY c3877kY;
        synchronized (this.c) {
            if (Ug0.f3833a >= 32 && (c3877kY = this.h) != null) {
                Object obj = c3877kY.e;
                if (((Spatializer.OnSpatializerStateChangedListener) obj) != null && ((Handler) c3877kY.d) != null) {
                    ((Spatializer) c3877kY.c).removeOnSpatializerStateChangedListener((Spatializer.OnSpatializerStateChangedListener) obj);
                    ((Handler) c3877kY.d).removeCallbacksAndMessages(null);
                    c3877kY.d = null;
                    c3877kY.e = null;
                }
            }
        }
        this.f4739a = null;
        this.b = null;
    }

    public final void g() {
        boolean z;
        InterfaceC4853vd0 interfaceC4853vd0;
        C3877kY c3877kY;
        synchronized (this.c) {
            try {
                z = this.g.j0 && !this.f && Ug0.f3833a >= 32 && (c3877kY = this.h) != null && c3877kY.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (interfaceC4853vd0 = this.f4739a) == null) {
            return;
        }
        ((C2918Ys) interfaceC4853vd0).h.d(10);
    }
}
