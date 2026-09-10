package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.List;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import qk.i0;
import zm.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b%\u0010'J!\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b(\u0010&J\u0015\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b*\u0010+J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b*\u0010,J\u001f\u0010-\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b-\u0010+J\u0015\u0010-\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b-\u0010,J\u001f\u0010/\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b2\u0010+J\u0015\u00102\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b2\u0010,J!\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010+J\u0015\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010,J\u001f\u00105\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b5\u00100J5\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u001062\u0006\u0010\u0019\u001a\u00020\u00042\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00028\u000007H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J?\u0010A\u001a\u00028\u0000\"\u0004\b\u0000\u001062\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00028\u000007H\u0087\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Lcom/applovin/shadow/okio/FileSystem;", "", "<init>", "()V", "Lcom/applovin/shadow/okio/Path;", "path", "canonicalize", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "Lcom/applovin/shadow/okio/FileMetadata;", TtmlNode.TAG_METADATA, "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "", "exists", "(Lcom/applovin/shadow/okio/Path;)Z", "dir", "", "list", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lzm/i;", "listRecursively", "(Lcom/applovin/shadow/okio/Path;Z)Lzm/i;", "(Lcom/applovin/shadow/okio/Path;)Lzm/i;", X3.i.f27782b, "Lcom/applovin/shadow/okio/FileHandle;", "openReadOnly", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lcom/applovin/shadow/okio/Path;ZZ)Lcom/applovin/shadow/okio/FileHandle;", "Lcom/applovin/shadow/okio/Source;", "source", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Sink;", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "Lwj/r;", "createDirectory", "(Lcom/applovin/shadow/okio/Path;Z)V", "(Lcom/applovin/shadow/okio/Path;)V", "createDirectories", "target", "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lcom/applovin/shadow/okio/BufferedSource;", "readerAction", "-read", "(Ljava/lang/Object;Ljk/b;)Ljava/lang/Object;", "read", "Lcom/applovin/shadow/okio/BufferedSink;", "writerAction", "-write", "(Ljava/lang/Object;ZLjk/b;)Ljava/lang/Object;", "write", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lcom/applovin/shadow/okio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lcom/applovin/shadow/okio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            n.f(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m149write$default(FileSystem fileSystem, Path file, boolean z10, b writerAction, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        n.f(file, "file");
        n.f(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z10));
        Throwable th2 = null;
        try {
            objInvoke = writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    i0.c(th4, th5);
                }
            }
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        n.c(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        n.e(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        n.e(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return INSTANCE.get(fileSystem);
    }

    public static /* synthetic */ i listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m150read(Path file, b readerAction) throws Throwable {
        T t10;
        n.f(file, "file");
        n.f(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th2 = null;
        try {
            t10 = (T) readerAction.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    i0.c(th4, th5);
                }
            }
            t10 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        n.c(t10);
        return t10;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m151write(Path file, boolean z10, b writerAction) throws Throwable {
        T t10;
        n.f(file, "file");
        n.f(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z10));
        Throwable th2 = null;
        try {
            t10 = (T) writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    i0.c(th4, th5);
                }
            }
            t10 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        n.c(t10);
        return t10;
    }

    public final Sink appendingSink(Path file) throws IOException {
        n.f(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path file, boolean mustExist) throws IOException;

    public abstract void atomicMove(Path source, Path target) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path source, Path target) throws IOException {
        n.f(source, "source");
        n.f(target, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir, boolean mustCreate) throws IOException {
        n.f(dir, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
    }

    public final void createDirectory(Path dir) throws IOException {
        n.f(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path dir, boolean mustCreate) throws IOException;

    public abstract void createSymlink(Path source, Path target) throws IOException;

    public final void delete(Path path) throws IOException {
        n.f(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean mustExist) throws IOException;

    public void deleteRecursively(Path fileOrDirectory, boolean mustExist) throws IOException {
        n.f(fileOrDirectory, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
    }

    public final boolean exists(Path path) throws IOException {
        n.f(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path dir) throws IOException;

    public abstract List<Path> listOrNull(Path dir);

    public i listRecursively(Path dir, boolean followSymlinks) {
        n.f(dir, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        n.f(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path file) throws IOException;

    public final FileHandle openReadWrite(Path file) throws IOException {
        n.f(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException;

    public final Sink sink(Path file) throws IOException {
        n.f(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path file, boolean mustCreate) throws IOException;

    public abstract Source source(Path file) throws IOException;

    public final void createDirectories(Path dir) throws IOException {
        n.f(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
        n.f(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final i listRecursively(Path dir) {
        n.f(dir, "dir");
        return listRecursively(dir, false);
    }
}
