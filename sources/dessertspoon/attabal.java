package dessertspoon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.random.Random;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldessertspoon/attabal;", "", "<init>", "()V", "", "cause", "exception", "", "attabal", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "dern", "(Ljava/lang/Throwable;)Ljava/util/List;", "Lkotlin/random/Random;", "saneness", "()Lkotlin/random/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class attabal {

    /* JADX INFO: renamed from: dessertspoon.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Ldessertspoon/attabal$attabal;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "saneness", "Ljava/lang/reflect/Method;", "addSuppressed", "dern", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0587attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0587attabal f25225attabal = new C0587attabal();

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public static final Method getSuppressed;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final Method addSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.beachfront(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (Intrinsics.wireman(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.wireman(polloi.sensatory(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            addSuppressed = method2;
            for (Method method3 : methods) {
                if (Intrinsics.wireman(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            getSuppressed = method;
        }
    }

    public void attabal(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0587attabal.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public List<Throwable> dern(Throwable exception) {
        Object objInvoke;
        List<Throwable> listWireman;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0587attabal.getSuppressed;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listWireman = arytenoidectomy.wireman((Throwable[]) objInvoke)) == null) ? adultoid.formularize() : listWireman;
    }

    public Random saneness() {
        return new evaluating.saneness();
    }
}
