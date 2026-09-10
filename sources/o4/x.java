package o4;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f47174b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47173a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47175c = new ArrayList();

    public x(View view) {
        this.f47174b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f47174b == xVar.f47174b && this.f47173a.equals(xVar.f47173a);
    }

    public final int hashCode() {
        return this.f47173a.hashCode() + (this.f47174b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbJ = d5.u.j("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbJ.append(this.f47174b);
        sbJ.append("\n");
        String strH = wi.d.h(sbJ.toString(), "    values:");
        HashMap map = this.f47173a;
        for (String str : map.keySet()) {
            strH = strH + "    " + str + ": " + map.get(str) + "\n";
        }
        return strH;
    }
}
