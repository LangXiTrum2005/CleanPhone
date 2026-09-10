package restrictive;

import android.graphics.Canvas;
import android.os.Build;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lrestrictive/hydrovane;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", a.j, "", "attabal", "(Landroid/graphics/Canvas;Z)V", "Ljava/lang/reflect/Method;", "saneness", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "dern", "inorderBarrierMethod", "wireman", "Z", "orderMethodsFetched", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hydrovane f36255attabal = new hydrovane();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static Method inorderBarrierMethod;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static Method reorderBarrierMethod;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static boolean orderMethodsFetched;

    public final void attabal(Canvas canvas, boolean enable) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            mathsort.f36273attabal.attabal(canvas, enable);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (enable) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    Intrinsics.beachfront(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (enable || (method = inorderBarrierMethod) == null) {
            return;
        }
        Intrinsics.beachfront(method);
        method.invoke(canvas, null);
    }
}
