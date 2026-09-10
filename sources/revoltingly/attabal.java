package revoltingly;

import p002kotlin.Metadata;
import p002kotlin.random.Random;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lrevoltingly/attabal;", "Ldragline/attabal;", "<init>", "()V", "Lkotlin/random/Random;", "saneness", "()Lkotlin/random/Random;", "", "version", "", "wireman", "(I)Z", "attabal", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class attabal extends dragline.attabal {

    /* JADX INFO: renamed from: revoltingly.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrevoltingly/attabal$attabal;", "", "<init>", "()V", "", "saneness", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0788attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0788attabal f36727attabal = new C0788attabal();

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

    @Override // dessertspoon.attabal
    public Random saneness() {
        return wireman(34) ? new dispatchbox.attabal() : super.saneness();
    }

    public final boolean wireman(int version) {
        Integer num = C0788attabal.sdkVersion;
        return num == null || num.intValue() >= version;
    }
}
