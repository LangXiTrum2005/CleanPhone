package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes attrs) {
        Path dir = (Path) obj;
        Intrinsics.f(dir, "dir");
        Intrinsics.f(attrs, "attrs");
        attrs.fileKey();
        throw null;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes attrs) {
        Path file = (Path) obj;
        Intrinsics.f(file, "file");
        Intrinsics.f(attrs, "attrs");
        throw null;
    }
}
