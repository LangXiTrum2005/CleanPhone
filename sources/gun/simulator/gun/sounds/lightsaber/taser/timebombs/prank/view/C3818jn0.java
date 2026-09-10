package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.google.android.gms.ads.AdView;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3818jn0 implements KS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4572a;
    public final /* synthetic */ String b;
    public final EB c;
    public final /* synthetic */ I9 d;
    public final /* synthetic */ AbstractC4454r3 e;

    public /* synthetic */ C3818jn0(AbstractC4454r3 abstractC4454r3, EB eb, I9 i9, String str, int i) {
        this.f4572a = i;
        this.e = abstractC4454r3;
        this.d = i9;
        this.b = str;
        this.c = eb;
    }

    public final GB a(List list) {
        EB eb = this.c;
        int i = this.f4572a;
        boolean z = false;
        String str = this.b;
        I9 i9 = this.d;
        AbstractC4454r3 abstractC4454r3 = this.e;
        switch (i) {
            case 0:
                C4082mn0 c4082mn0 = (C4082mn0) abstractC4454r3;
                P8 p8 = (P8) i9;
                Pm0 pm0 = (Pm0) c4082mn0.g0((C3491g4) p8.f3354a, str);
                AdView adView = pm0 != null ? pm0.d : null;
                if (adView != null && adView.getAdSize() != null && !TextUtils.isEmpty(adView.getAdUnitId()) && !c4082mn0.l0(p8)) {
                    z = true;
                }
                Qm0.D(new byte[]{-126, 23, -84, -125, 124, 32, 72, -84, -101, 28, -67, -92, 126, 46, 93, -95, -120, 29, -67, -82, 86, 7, 85, -87, -127, 48, -110, -106, 91, 36, 75, -1, -51, com.umeng.analytics.pro.cw.n, -113, -127, 86, 0, 74, -92, -124, 21, -99, -94, 94, 36, 28, -8, -51}, new byte[]{-19, 121, -4, -64, 50, 65, 60, -59});
                if (C4082mn0.M0().f5021a) {
                    DS ds = (DS) c4082mn0.i0(c4082mn0.M((C3491g4) p8.f3354a));
                    if (ds != null && (c4082mn0.t != 3 || !z)) {
                        c4082mn0.t = 7;
                        return ((M10) ds).c();
                    }
                } else if (eb != null && (c4082mn0.t != 3 || !z)) {
                    c4082mn0.t = 7;
                    return eb.c();
                }
                Qm0.D(new byte[]{61, -55, -63, 25, -38, -109, -54, 35, 36, -62, -48, 62, -40, -99, -33, 46, 55, -61, -48, 52, -16, -76, -41, 38, 62, -18, -1, 12, -3, -105, -55, 112, 114, -55, -28, 54, -8}, new byte[]{82, -89, -111, 90, -108, -14, -66, 74});
                return null;
            default:
                C3293do0 c3293do0 = (C3293do0) abstractC4454r3;
                UQ uq = (UQ) i9;
                C3491g4 c3491g4 = (C3491g4) uq.f3354a;
                C3293do0 c3293do1 = C3293do0.v;
                if (((Kn0) c3293do0.g0(c3491g4, str)) != null && !c3293do0.l0(uq)) {
                    z = true;
                }
                if (X0.j.s().f5021a) {
                    IS is = (IS) c3293do0.i0(c3293do0.M((C3491g4) uq.f3354a));
                    if (is == null) {
                        return null;
                    }
                    if (c3293do0.u == 4 && z) {
                        return null;
                    }
                    c3293do0.u = 7;
                    return ((QL) is).c();
                }
                IS is2 = (IS) eb;
                if (is2 == null) {
                    return null;
                }
                if (c3293do0.u == 4 && z) {
                    return null;
                }
                c3293do0.u = 7;
                return ((QL) is2).c();
        }
    }
}
