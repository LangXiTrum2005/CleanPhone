package com.applovin.shadow.okio.internal;

import an.h;
import an.p;
import com.applovin.impl.ca;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;
import wj.f;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020/2\u0006\u0010)\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020/2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00101J\u001f\u00106\u001a\u00020/2\u0006\u0010)\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R-\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/applovin/shadow/okio/internal/ResourceFileSystem;", "Lcom/applovin/shadow/okio/FileSystem;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLjava/lang/Object;)V", "Lcom/applovin/shadow/okio/Path;", "path", "canonicalizeInternal", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "", "toRelativePath", "(Lcom/applovin/shadow/okio/Path;)Ljava/lang/String;", "", "Lwj/f;", "toClasspathRoots", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "toFileRoot", "(Ljava/net/URL;)Lwj/f;", "toJarRoot", "canonicalize", "dir", "list", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "listOrNull", X3.i.f27782b, "Lcom/applovin/shadow/okio/FileHandle;", "openReadOnly", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lcom/applovin/shadow/okio/Path;ZZ)Lcom/applovin/shadow/okio/FileHandle;", "Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "Lcom/applovin/shadow/okio/Source;", "source", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "Lwj/r;", "createDirectory", "(Lcom/applovin/shadow/okio/Path;Z)V", "target", "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "delete", "createSymlink", "Ljava/lang/ClassLoader;", "Lcom/applovin/shadow/okio/FileSystem;", "roots$delegate", "Lwj/d;", "getRoots", "()Ljava/util/List;", "roots", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;

    /* JADX INFO: renamed from: roots$delegate, reason: from kotlin metadata */
    private final d roots;
    private final FileSystem systemFileSystem;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/applovin/shadow/okio/internal/ResourceFileSystem$Companion;", "", "<init>", "()V", "Lcom/applovin/shadow/okio/Path;", "path", "", "keepPath", "(Lcom/applovin/shadow/okio/Path;)Z", "base", "removeBase", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "ROOT", "Lcom/applovin/shadow/okio/Path;", "getROOT", "()Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !p.h0(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            n.f(path, "<this>");
            n.f(base, "base");
            return getROOT().resolve(p.m0(h.E0(path.toString(), base.toString()), '\\', '/'));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, g gVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<f> getRoots() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<f> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        n.e(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        n.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            n.c(url);
            f fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        n.e(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        n.e(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            n.c(url2);
            f jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return xj.n.B0(arrayList2, arrayList);
    }

    private final f toFileRoot(URL url) {
        if (n.a(url.getProtocol(), X3.i.f27782b)) {
            return new f(this.systemFileSystem, Path.Companion.get$default(Path.INSTANCE, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final f toJarRoot(URL url) {
        int iA0;
        String string = url.toString();
        n.e(string, "toString(...)");
        if (!p.p0(string, "jar:file:", false) || (iA0 = h.A0(string, "!", 6)) == -1) {
            return null;
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = string.substring(4, iA0);
        n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new f(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean mustExist) throws IOException {
        n.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        n.f(source, "source");
        n.f(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) {
        n.f(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean mustCreate) throws IOException {
        n.f(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        n.f(source, "source");
        n.f(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean mustExist) throws IOException {
        n.f(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        n.f(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (f fVar : getRoots()) {
            FileSystem fileSystem = (FileSystem) fVar.f53283a;
            Path path = (Path) fVar.f53284b;
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path));
                }
                t.a0(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return xj.n.N0(linkedHashSet);
        }
        throw new FileNotFoundException(ca.l(dir, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        n.f(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<f> it = getRoots().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            f next = it.next();
            FileSystem fileSystem = (FileSystem) next.f53283a;
            Path path = (Path) next.f53284b;
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                t.a0(arrayList, linkedHashSet);
                z10 = true;
            }
        }
        if (z10) {
            return xj.n.N0(linkedHashSet);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        n.f(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (f fVar : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) fVar.f53283a).metadataOrNull(((Path) fVar.f53284b).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        n.f(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(ca.l(file, "file not found: "));
        }
        String relativePath = toRelativePath(file);
        Iterator<f> it = getRoots().iterator();
        while (it.hasNext()) {
            f next = it.next();
            try {
                return ((FileSystem) next.f53283a).openReadOnly(((Path) next.f53284b).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(ca.l(file, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
        n.f(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean mustCreate) throws IOException {
        n.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws FileNotFoundException {
        Source source;
        n.f(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(ca.l(file, "file not found: "));
        }
        Path path = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(ca.l(file, "file not found: "));
        }
        return source;
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem systemFileSystem) {
        n.f(classLoader, "classLoader");
        n.f(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = b.u(new ResourceFileSystem$roots$2(this));
        if (z10) {
            getRoots().size();
        }
    }
}
