package duvetyn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NioSystemFileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lduvetyn/graveside;", "Lduvetyn/molybdenite;", "<init>", "()V", "Lduvetyn/cord;", "path", "Lduvetyn/taiyuan;", "impromptu", "(Lduvetyn/cord;)Lduvetyn/taiyuan;", "Ljava/nio/file/Path;", "nioPath", "kowloon", "(Ljava/nio/file/Path;)Lduvetyn/taiyuan;", "source", "target", "", "attabal", "(Lduvetyn/cord;Lduvetyn/cord;)V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/file/attribute/FileTime;", "", "arytenoidectomy", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class graveside extends molybdenite {
    public final Long arytenoidectomy(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // duvetyn.molybdenite, duvetyn.cutely
    public void attabal(cord source, cord target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.arytenoidectomy(), target.arytenoidectomy(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // duvetyn.molybdenite, duvetyn.cutely
    public taiyuan impromptu(cord path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return kowloon(path.arytenoidectomy());
    }

    public final taiyuan kowloon(Path nioPath) {
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) com.applovin.shadow.okio.graveside.attabal(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            cord cordVarBeachfront = symbolicLink != null ? cord.Companion.beachfront(cord.INSTANCE, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lArytenoidectomy = fileTimeCreationTime != null ? arytenoidectomy(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lArytenoidectomy2 = fileTimeLastModifiedTime != null ? arytenoidectomy(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new taiyuan(zIsRegularFile, zIsDirectory, cordVarBeachfront, lValueOf, lArytenoidectomy, lArytenoidectomy2, fileTimeLastAccessTime != null ? arytenoidectomy(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // duvetyn.molybdenite
    public String toString() {
        return "NioSystemFileSystem";
    }
}
