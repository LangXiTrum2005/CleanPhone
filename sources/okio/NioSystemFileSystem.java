package okio;

import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NioSystemFileSystem extends JvmSystemFileSystem {
    public static Long d(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public FileMetadata b(Path path) {
        Path pathA;
        Intrinsics.f(path, "path");
        java.nio.file.Path path2 = Paths.get(path.X.v(), new String[0]);
        Intrinsics.e(path2, "get(...)");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path2) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = Path.f45153Y;
                pathA = Path.Companion.a(symbolicLink.toString(), false);
            } else {
                pathA = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lD = fileTimeCreationTime != null ? d(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lD2 = fileTimeLastModifiedTime != null ? d(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new FileMetadata(zIsRegularFile, zIsDirectory, pathA, lValueOf, lD, lD2, fileTimeLastAccessTime != null ? d(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.JvmSystemFileSystem
    public String toString() {
        return "NioSystemFileSystem";
    }
}
