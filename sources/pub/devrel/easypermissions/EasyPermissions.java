package pub.devrel.easypermissions;

import android.content.Context;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* JADX INFO: loaded from: classes7.dex */
public class EasyPermissions {

    public interface PermissionCallbacks extends ActivityCompat.OnRequestPermissionsResultCallback {
        void a(int i2, ArrayList arrayList);

        void b(List list);
    }

    public interface RationaleCallbacks {
        void a();

        void b();
    }

    public static void a(int i2, String[] strArr, int[] iArr, Object... objArr) {
        boolean zIsInstance;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            if (iArr[i3] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof PermissionCallbacks)) {
                ((PermissionCallbacks) obj).a(i2, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof PermissionCallbacks)) {
                ((PermissionCallbacks) obj).b(arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                Class<?> superclass = obj.getClass();
                if (obj.getClass().getSimpleName().endsWith("_")) {
                    try {
                        zIsInstance = Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
                    } catch (ClassNotFoundException unused) {
                        zIsInstance = false;
                    }
                } else {
                    zIsInstance = false;
                }
                if (zIsInstance) {
                    superclass = superclass.getSuperclass();
                }
                while (superclass != null) {
                    for (Method method : superclass.getDeclaredMethods()) {
                        AfterPermissionGranted afterPermissionGranted = (AfterPermissionGranted) method.getAnnotation(AfterPermissionGranted.class);
                        if (afterPermissionGranted != null && afterPermissionGranted.value() == i2) {
                            if (method.getParameterTypes().length > 0) {
                                throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                            }
                            try {
                                if (!method.isAccessible()) {
                                    method.setAccessible(true);
                                }
                                method.invoke(obj, new Object[0]);
                            } catch (IllegalAccessException e2) {
                                Log.e("EasyPermissions", "runDefaultMethod:IllegalAccessException", e2);
                            } catch (InvocationTargetException e3) {
                                Log.e("EasyPermissions", "runDefaultMethod:InvocationTargetException", e3);
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }
        }
    }

    public static void b(BaseAct baseAct, String str, int i2, String... strArr) {
        boolean z2;
        PermissionRequest.Builder builder = new PermissionRequest.Builder(baseAct, i2, strArr);
        builder.d = str;
        PermissionHelper permissionHelper = builder.f45304a;
        if (str == null) {
            builder.d = permissionHelper.b().getString(com.charging.screenshow.battery.animations.themes.R.string.rationale_ask);
        }
        if (builder.f45307e == null) {
            builder.f45307e = permissionHelper.b().getString(android.R.string.ok);
        }
        if (builder.f == null) {
            builder.f = permissionHelper.b().getString(android.R.string.cancel);
        }
        String str2 = builder.d;
        String str3 = builder.f45307e;
        String str4 = builder.f;
        PermissionHelper permissionHelper2 = builder.f45304a;
        PermissionRequest permissionRequest = new PermissionRequest(permissionHelper2, builder.f45306c, builder.f45305b, str2, str3, str4);
        Context contextB = permissionHelper2.b();
        String[] strArr2 = permissionRequest.f45301b;
        String[] strArr3 = (String[]) strArr2.clone();
        if (contextB == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        int length = strArr3.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z2 = true;
                break;
            } else {
                if (ContextCompat.checkSelfPermission(contextB, strArr3[i4]) != 0) {
                    z2 = false;
                    break;
                }
                i4++;
            }
        }
        if (z2) {
            Object obj = permissionHelper2.f45315a;
            String[] strArr4 = (String[]) strArr2.clone();
            int[] iArr = new int[strArr4.length];
            for (int i5 = 0; i5 < strArr4.length; i5++) {
                iArr[i5] = 0;
            }
            a(permissionRequest.f45302c, strArr4, iArr, obj);
            return;
        }
        String[] strArr5 = (String[]) strArr2.clone();
        int length2 = strArr5.length;
        while (true) {
            int i6 = permissionRequest.f45302c;
            if (i3 >= length2) {
                permissionHelper2.a(i6, strArr5);
                return;
            } else {
                if (permissionHelper2.e(strArr5[i3])) {
                    permissionHelper2.f(permissionRequest.d, permissionRequest.f45303e, permissionRequest.f, permissionRequest.g, i6, strArr5);
                    return;
                }
                i3++;
            }
        }
    }
}
