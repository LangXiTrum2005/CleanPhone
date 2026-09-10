package lyreflower;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: exceptionUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {
    public static final boolean attabal(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!Intrinsics.wireman(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException saneness(Throwable e) throws Throwable {
        Intrinsics.checkNotNullParameter(e, "e");
        throw e;
    }
}
