package okio;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipFileSystem extends FileSystem {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Path f45165e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f45166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileSystem f45167c;
    public final LinkedHashMap d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        String str = Path.f45153Y;
        f45165e = Path.Companion.a("/", false);
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, LinkedHashMap linkedHashMap) {
        this.f45166b = path;
        this.f45167c = fileSystem;
        this.d = linkedHashMap;
    }

    @Override // okio.FileSystem
    public final List a(Path child) {
        Intrinsics.f(child, "dir");
        Path path = f45165e;
        path.getClass();
        Intrinsics.f(child, "child");
        ZipEntry zipEntry = (ZipEntry) this.d.get(okio.internal.Path.b(path, child, true));
        if (zipEntry == null) {
            return null;
        }
        return CollectionsKt.i0(zipEntry.f);
    }

    @Override // okio.FileSystem
    public final FileMetadata b(Path path) throws Throwable {
        FileMetadata fileMetadataE;
        Throwable th;
        Intrinsics.f(path, "path");
        Path path2 = f45165e;
        path2.getClass();
        ZipEntry zipEntry = (ZipEntry) this.d.get(okio.internal.Path.b(path2, path, true));
        Throwable th2 = null;
        if (zipEntry == null) {
            return null;
        }
        boolean z2 = zipEntry.f45182b;
        FileMetadata fileMetadata = new FileMetadata(!z2, z2, null, z2 ? null : Long.valueOf(zipEntry.f45183c), null, zipEntry.d, null);
        long j = zipEntry.f45184e;
        if (j == -1) {
            return fileMetadata;
        }
        FileHandle fileHandleC = this.f45167c.c(this.f45166b);
        try {
            RealBufferedSource realBufferedSourceD = Okio.d(fileHandleC.n(j));
            try {
                fileMetadataE = ZipFilesKt.e(realBufferedSourceD, fileMetadata);
                Intrinsics.c(fileMetadataE);
                try {
                    realBufferedSourceD.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    realBufferedSourceD.close();
                } catch (Throwable th5) {
                    ExceptionsKt.a(th4, th5);
                }
                th = th4;
                fileMetadataE = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.c(fileMetadataE);
            try {
                fileHandleC.close();
            } catch (Throwable th6) {
                th2 = th6;
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.c(fileMetadataE);
            return fileMetadataE;
        } catch (Throwable th7) {
            if (fileHandleC != null) {
                try {
                    fileHandleC.close();
                } catch (Throwable th8) {
                    ExceptionsKt.a(th7, th8);
                }
            }
            fileMetadataE = null;
            th2 = th7;
        }
    }

    @Override // okio.FileSystem
    public final FileHandle c(Path path) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
