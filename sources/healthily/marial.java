package healthily;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {
    public static final Class<?> attabal(ClassLoader classLoader, String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
