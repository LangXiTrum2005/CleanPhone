package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SP implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3714a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ SP(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3714a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3714a;
        Object obj = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                VP.m215downloadJs$lambda1((TP) obj5, (C4980x2) obj4, (ZT) obj, (InterfaceC2526Jp) obj3, (C4689tj0) obj2);
                break;
            case 1:
                C4082mn0 c4082mn0 = (C4082mn0) obj5;
                String str = (String) obj4;
                ViewGroup viewGroup = (ViewGroup) obj3;
                Pm0 pm0 = (Pm0) obj2;
                if (c4082mn0.i0(str) != null) {
                    System.currentTimeMillis();
                    int i2 = ((M10) ((DS) c4082mn0.i0(str))).f3386a;
                }
                if (!viewGroup.isShown()) {
                    viewGroup.setVisibility(0);
                }
                c4082mn0.J0(viewGroup, pm0);
                break;
            case 2:
                AbstractC3950lJ.z(obj4);
                P8 p8 = (P8) obj3;
                AdView adView = (AdView) obj2;
                ((C4082mn0) obj5).getClass();
                C4082mn0.M0().getClass();
                AdManagerAdRequest adManagerAdRequestBuild = ((AdManagerAdRequest.Builder) obj).setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build();
                byte[] bArr = {10, -24, 44, -114, -45, 49, -21, -92, 3, -11, com.umeng.analytics.pro.cw.m, -109, -46, 63, -21, -84, com.umeng.analytics.pro.cw.m, -32, 119, -54, -3, 63, -28, -82, 37, -24, 35, -116, -8, 55, -85, -93, 21, -60, 34, -122, -3, 49, -11, -71, com.umeng.analytics.pro.cw.m, -27, 33, -113, -48, 52, -83, -29, 70, -70, 109};
                byte[] bArr2 = {102, -121, 77, -22, -111, 80, -123, -54};
                int i3 = 0;
                int i4 = 0;
                while (i3 < 51) {
                    if (i4 >= 8) {
                        i4 = 0;
                    }
                    bArr[i3] = (byte) (bArr[i3] ^ bArr2[i4]);
                    i3++;
                    i4++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                p8.getClass();
                adView.loadAd(adManagerAdRequestBuild);
                break;
            case 3:
                C3 c3 = (C3) obj5;
                MD md = (MD) obj4;
                WeakReference weakReference = (WeakReference) obj;
                GS gs = (GS) obj3;
                Context context = (Context) obj2;
                c3.getClass();
                Context contextJ = X0.j.j();
                String strW = ((C3491g4) md.f3354a).w(1);
                boolean z = md.c;
                C4981x20.u().q(new RunnableC4777uj0(c3, Um0.c(contextJ, strW, z ? AbstractC3661i1.f4483a : AbstractC3661i1.c, z ? AbstractC3661i1.l : AbstractC3661i1.m), md, weakReference, gs, context, 2));
                break;
            case 4:
                C3927l3 c3927l3 = (C3927l3) obj5;
                I5 i5 = (I5) obj4;
                WeakReference weakReference2 = (WeakReference) obj;
                C4806v3 c4806v3 = (C4806v3) obj3;
                Context context2 = (Context) obj2;
                c3927l3.getClass();
                Context contextJ2 = X0.j.j();
                String strW2 = ((C3491g4) i5.f3354a).w(1);
                boolean z2 = i5.c;
                C4981x20.u().q(new RunnableC4777uj0(c3927l3, Um0.c(contextJ2, strW2, z2 ? AbstractC3661i1.b : AbstractC3661i1.d, z2 ? AbstractC3661i1.n : AbstractC3661i1.o), i5, weakReference2, c4806v3, context2, 3));
                break;
            default:
                H3 h3 = (H3) obj5;
                VZ vz = (VZ) obj4;
                h3.getClass();
                C4981x20.u().q(new RunnableC4777uj0(h3, Um0.c(X0.j.j(), ((C3491g4) vz.f3354a).w(1), AbstractC3661i1.j, AbstractC3661i1.u), vz, (WeakReference) obj, (NS) obj3, (Context) obj2, 4));
                break;
        }
    }
}
