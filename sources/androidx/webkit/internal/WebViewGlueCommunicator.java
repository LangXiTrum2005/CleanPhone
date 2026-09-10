package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class WebViewGlueCommunicator {

    public static class LAZY_COMPAT_CONVERTER_HOLDER {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebkitToCompatConverter f8590a = new WebkitToCompatConverter(LAZY_FACTORY_HOLDER.f8591a.getWebkitToCompatConverter());
    }

    public static class LAZY_FACTORY_HOLDER {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebViewProviderFactory f8591a;

        static {
            WebViewProviderFactory incompatibleApkWebViewProviderFactory;
            try {
                incompatibleApkWebViewProviderFactory = new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewProviderFactoryBoundaryInterface.class, WebViewGlueCommunicator.a()));
            } catch (ClassNotFoundException unused) {
                incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
            f8591a = incompatibleApkWebViewProviderFactory;
        }
    }

    public static InvocationHandler a() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static WebViewProviderFactory b() {
        return LAZY_FACTORY_HOLDER.f8591a;
    }
}
