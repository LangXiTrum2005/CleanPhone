package dragline;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ldragline/attabal;", "Ldessertspoon/attabal;", "<init>", "()V", "", "version", "", "wireman", "(I)Z", "", "cause", "exception", "", "attabal", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "dern", "(Ljava/lang/Throwable;)Ljava/util/List;", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class attabal extends dessertspoon.attabal {

    /* JADX INFO: renamed from: dragline.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldragline/attabal$attabal;", "", "<init>", "()V", "", "saneness", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0591attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0591attabal f25368attabal = new C0591attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final Integer sdkVersion;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    private final boolean wireman(int version) {
        Integer num = C0591attabal.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // dessertspoon.attabal
    public void attabal(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (wireman(19)) {
            cause.addSuppressed(exception);
        } else {
            super.attabal(cause, exception);
        }
    }

    @Override // dessertspoon.attabal
    public List<Throwable> dern(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!wireman(19)) {
            return super.dern(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return arytenoidectomy.wireman(suppressed);
    }
}
