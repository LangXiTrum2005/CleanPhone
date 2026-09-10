package okio;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ForwardingFileSystem extends FileSystem {
    @Override // okio.FileSystem
    public final List a(Path dir) {
        Intrinsics.f(dir, "dir");
        throw null;
    }

    @Override // okio.FileSystem
    public final FileMetadata b(Path path) {
        Intrinsics.f(path, "path");
        throw null;
    }

    @Override // okio.FileSystem
    public final FileHandle c(Path path) {
        throw null;
    }

    public final String toString() {
        return Reflection.f43333a.b(getClass()).l() + "(null)";
    }
}
