package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f4463a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f4464b;

    static {
        y1 y1Var = null;
        try {
            y1Var = (y1) o4.n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4464b = y1Var;
    }

    public static final void a(ArrayList views, int i10) {
        kotlin.jvm.internal.n.f(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
