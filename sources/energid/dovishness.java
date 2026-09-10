package energid;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: WebViewGlueCommunicator.java */
/* JADX INFO: loaded from: classes.dex */
public class dovishness {

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final trm f25846attabal = new trm(dovishness.wireman().getWebkitToCompatConverter());
    }

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma f25847attabal = dovishness.attabal();
    }

    public static rotuma attabal() {
        try {
            return new preprohormone((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, saneness()));
        } catch (ClassNotFoundException unused) {
            return new taiyuan();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object beachfront() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static trm dern() {
        return attabal.f25846attabal;
    }

    public static ClassLoader marial() {
        return Build.VERSION.SDK_INT >= 28 ? competently.attabal() : beachfront().getClass().getClassLoader();
    }

    public static InvocationHandler saneness() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, marial()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static rotuma wireman() {
        return saneness.f25847attabal;
    }
}
