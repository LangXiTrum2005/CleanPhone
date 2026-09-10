package a5;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        n.f(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            n.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue();
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        n.f(sidecarDeviceState, "sidecarDeviceState");
        int iA = a(sidecarDeviceState);
        if (iA < 0 || iA > 4) {
            return 0;
        }
        return iA;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        v vVar = v.f53866a;
        n.f(info, "info");
        try {
            try {
                List list = info.displayFeatures;
                return list == null ? vVar : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
            n.d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            return (List) objInvoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i10) {
        try {
            try {
                sidecarDeviceState.posture = i10;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }
}
