package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: loaded from: classes7.dex */
public interface PackagePartProvider {
    void a(String str);

    public static final class Empty implements PackagePartProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f44013a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public final void a(String str) {
        }
    }
}
