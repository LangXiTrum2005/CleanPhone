package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3163cN implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4219a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC3163cN(Object obj, Object obj2, Object obj3, int i) {
        this.f4219a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4219a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                if (!C3778jN.b) {
                    ((ServiceConnectionC3340eN) obj).a();
                    throw null;
                }
                Objects.toString((ComponentName) obj2);
                Objects.toString((IBinder) obj3);
                AbstractC3950lJ.z(((ServiceConnectionC3340eN) obj).b);
                throw null;
            case 1:
                ((CD) obj).getClass();
                CD.b((WebView) obj2, (String) obj3);
                return;
            case 2:
                ((G7) obj).getClass();
                G7.p((WebView) obj2, (String) obj3);
                return;
            case 3:
                ((C4003lv) obj).getClass();
                C4003lv.b((WebView) obj2, (String) obj3);
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj2;
                viewGroup.bringChildToFront((AdView) obj3);
                HashMap map = H8.f3157a;
                if (viewGroup.getChildCount() <= 0) {
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null && childAt.getTag() != null && childAt.getTag().equals(H8.b)) {
                        viewGroup.removeView(childAt);
                    }
                }
                return;
            case 5:
                AbstractC4454r3 abstractC4454r3 = (AbstractC4454r3) obj;
                if (abstractC4454r3.s) {
                    return;
                }
                abstractC4454r3.s = true;
                int i3 = ((H9) abstractC4454r3.r()).d;
                if (i3 == 1) {
                    HashMap mapV = AbstractC2340Cl.v(AbstractC2340Cl.B());
                    if (mapV.isEmpty()) {
                        abstractC4454r3.O(AbstractC2340Cl.B(), ((I9) obj2).b(), (String) obj3);
                    } else {
                        abstractC4454r3.b0(mapV, ((I9) obj2).b(), (String) obj3);
                    }
                    mapV.clear();
                } else if (i3 == 2) {
                    abstractC4454r3.O(AbstractC2340Cl.B(), ((I9) obj2).b(), (String) obj3);
                } else if (i3 == 3) {
                    HashMap mapV2 = AbstractC2340Cl.v(AbstractC2340Cl.B());
                    if (!mapV2.isEmpty()) {
                        abstractC4454r3.b0(mapV2, ((I9) obj2).b(), (String) obj3);
                    }
                    mapV2.clear();
                }
                abstractC4454r3.s = false;
                return;
            default:
                try {
                    if (((WeakReference) obj2).get() != null && ((WeakReference) obj3).get() != null) {
                        File file = new File(((Context) ((WeakReference) obj3).get()).getExternalCacheDir().getAbsolutePath() + File.separator + Qm0.D(new byte[]{43, -34, -42, -125, 21, -76, 33, -97}, new byte[]{79, -82, -94, -64, 116, -41, 73, -6}));
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        String[] strArrSplit = Uri.parse((String) obj).getPath().split(Qm0.D(new byte[]{-46}, new byte[]{-3, -113, 55, -23, 80, -4, -116, -67}));
                        String str = strArrSplit[strArrSplit.length - 1];
                        String str2 = Base64.encodeToString(((String) obj).getBytes(), 11) + Qm0.D(new byte[]{11}, new byte[]{37, 30, 26, -117, -112, -23, 30, -18}) + str.substring(str.lastIndexOf(Qm0.D(new byte[]{58}, new byte[]{20, -68, 100, 51, 79, 1, 34, -21})) + 1);
                        File file2 = new File(file, str2);
                        if (!file2.exists() || !file2.isFile()) {
                            AbstractC2789Tt.a((String) obj, file.getAbsolutePath(), str2, new C3844k50(this, file, str2, file2));
                            return;
                        }
                        if (!AbstractC2995aW.X(file2)) {
                            Qm0.D(new byte[]{-77, 98, -2, 95, 119, -122, 75, 8, -102, 115, -19, 118}, new byte[]{-9, 18, -118, 19, 24, -25, 47, 65});
                            Qm0.D(new byte[]{-47, 1, -54, 45, -74, -17, 117, 72, -44, 9, -117, 35, -96, -17, 125, 78, -52, 76, -50, 36, -80, -67, 106, 81, -52, 9, -49}, new byte[]{-72, 108, -85, 74, -45, -49, 19, 33});
                            C4981x20.u().j(new RunnableC3252dN(13, this, file2));
                            return;
                        } else {
                            Qm0.D(new byte[]{65, 8, 41, 37, -126, 45, -99, -36, 104, 25, 58, 12}, new byte[]{5, 120, 93, 105, -19, 76, -7, -107});
                            Qm0.D(new byte[]{-100, -103, -83, -29, 47, -78, 106, -91, -103, -111, -20, -19, 57, -78, 105, -94, -106, -122, -75, -12, 62, -9, 104, -32, -122, -128, -83, -10, 62, -78, 104, -87, -106, -122, -75, -12, 62}, new byte[]{-11, -12, -52, -124, 74, -110, 12, -52});
                            Bitmap bitmapB = AbstractC3923l1.b(file2, AbstractC3923l1.f4625a);
                            if (bitmapB != null) {
                                C4981x20.u().j(new RunnableC3252dN(14, this, bitmapB));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
        }
    }

    public RunnableC3163cN(WeakReference weakReference, WeakReference weakReference2, String str) {
        this.f4219a = 6;
        this.b = weakReference;
        this.c = weakReference2;
        this.d = str;
    }
}
