package okio;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ResourceFileSystem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/FileSystem;", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JvmSystemFileSystem f45144a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokio/FileSystem$Companion;", "", "Lokio/FileSystem;", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "Lokio/Path;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        JvmSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        f45144a = jvmSystemFileSystem;
        String str = Path.f45153Y;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.e(property, "getProperty(...)");
        Path.Companion.a(property, false);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.e(classLoader, "getClassLoader(...)");
        new ResourceFileSystem(classLoader);
    }

    public abstract List a(Path path);

    public abstract FileMetadata b(Path path);

    public abstract FileHandle c(Path path);
}
