package p;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f47721a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f47721a = declaredField;
    }
}
