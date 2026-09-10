package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okio/NioSystemFileSystem;", "Lcom/applovin/shadow/okio/JvmSystemFileSystem;", "<init>", "()V", "Ljava/nio/file/attribute/FileTime;", "", "zeroToNull", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "Lcom/applovin/shadow/okio/Path;", "path", "Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "Ljava/nio/file/Path;", "nioPath", "(Ljava/nio/file/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "source", "target", "Lwj/r;", "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "createSymlink", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class NioSystemFileSystem extends JvmSystemFileSystem {
    private final Long zeroToNull(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        n.f(source, "source");
        n.f(target, "target");
        try {
            Files.move(source.toNioPath(), target.toNioPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        n.f(source, "source");
        n.f(target, "target");
        Files.createSymbolicLink(source.toNioPath(), target.toNioPath(), new FileAttribute[0]);
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        n.f(path, "path");
        return metadataOrNull(path.toNioPath());
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem
    public String toString() {
        return "NioSystemFileSystem";
    }

    public final FileMetadata metadataOrNull(java.nio.file.Path nioPath) {
        n.f(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            Path path = symbolicLink != null ? Path.Companion.get$default(Path.INSTANCE, symbolicLink, false, 1, (Object) null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lZeroToNull = fileTimeCreationTime != null ? zeroToNull(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lZeroToNull2 = fileTimeLastModifiedTime != null ? zeroToNull(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new FileMetadata(zIsRegularFile, zIsDirectory, path, lValueOf, lZeroToNull, lZeroToNull2, fileTimeLastAccessTime != null ? zeroToNull(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
