package s4;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f50126a;

    static {
        q dVar;
        try {
            dVar = new x((WebViewProviderFactoryBoundaryInterface) no.b.e(WebViewProviderFactoryBoundaryInterface.class, r9.b.i()), 5);
        } catch (ClassNotFoundException unused) {
            dVar = new d();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f50126a = dVar;
    }
}
