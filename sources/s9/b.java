package s9;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.auth.c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50219b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 5);
        this.f50219b = obj;
    }

    public static a x1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 5);
    }

    public static Object y1(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f50219b;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
        }
        c0.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
