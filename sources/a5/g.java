package a5;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3390b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3391a;

    public g() {
        u.n(3, "verificationMode");
        this.f3391a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (n.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return n.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (a((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x4.c cVarE = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarE != null) {
                arrayList.add(cVarE);
            }
        }
        return arrayList;
    }

    public final x4.i d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new x4.i(v.f53866a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new x4.i(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final x4.c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        x4.b bVar;
        x4.b bVar2 = x4.b.f53608e;
        n.f(feature, "feature");
        int i10 = this.f3391a;
        u.n(i10, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new u4.g(feature, i10, u4.a.f51878a).G("Type must be either TYPE_FOLD or TYPE_HINGE", c.f3386e).G("Feature bounds must not be 0", d.f3387e).G("TYPE_FOLD must have 0 area", e.f3388e).G("Feature be pinned to either left or top", f.f3389e).g();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = x4.b.f53610g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = x4.b.f53611h;
        }
        int iB = b.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar2 = x4.b.f53609f;
        } else if (iB != 3 && iB == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        n.e(rect, "feature.rect");
        return new x4.c(new u4.b(rect), bVar, bVar2);
    }
}
