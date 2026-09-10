package okio;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    public static void e(Path path) {
        path.X.v();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final List a(Path dir) {
        Intrinsics.f(dir, "dir");
        e(dir);
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final FileMetadata b(Path path) {
        Intrinsics.f(path, "path");
        e(path);
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final FileHandle c(Path path) throws FileNotFoundException {
        try {
            e(path);
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public final String toString() {
        throw null;
    }
}
