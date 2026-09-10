package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReflectSdkVersion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f43303a;

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
            f43303a = num2;
        }
    }

    public static boolean b(int i2) {
        Integer num = ReflectSdkVersion.f43303a;
        return num == null || num.intValue() >= i2;
    }
}
