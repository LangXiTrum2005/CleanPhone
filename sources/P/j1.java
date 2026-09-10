package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f47696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f47697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f47698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f47699d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f47696a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f47697b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f47698c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f47699d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
