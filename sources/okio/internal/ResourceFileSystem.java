package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;
import okio.ZipFileSystem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFileSystem extends FileSystem {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Path f45178e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f45179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileSystem f45180c;
    public final Lazy d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final boolean a(Path path) {
            Path path2 = ResourceFileSystem.f45178e;
            path.getClass();
            ByteString byteString = Path.f45172a;
            ByteString byteStringT = path.X;
            int iO = ByteString.o(byteStringT, byteString);
            if (iO == -1) {
                iO = ByteString.o(byteStringT, Path.f45173b);
            }
            if (iO != -1) {
                byteStringT = ByteString.t(byteStringT, iO + 1, 0, 2);
            } else if (path.g() != null && byteStringT.h() == 2) {
                byteStringT = ByteString.e0;
            }
            return !StringsKt.p(byteStringT.v(), ".class", true);
        }
    }

    static {
        String str = Path.f45153Y;
        f45178e = Path.Companion.a("/", false);
    }

    public ResourceFileSystem(ClassLoader classLoader) {
        JvmSystemFileSystem systemFileSystem = FileSystem.f45144a;
        Intrinsics.f(systemFileSystem, "systemFileSystem");
        this.f45179b = classLoader;
        this.f45180c = systemFileSystem;
        this.d = LazyKt.b(new Function0<List<? extends Pair<? extends FileSystem, ? extends Path>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                FileSystem fileSystem;
                boolean z2;
                String str;
                int iY;
                Iterator it;
                Pair pair;
                Pair pair2;
                ResourceFileSystem resourceFileSystem = this.X;
                ClassLoader classLoader2 = resourceFileSystem.f45179b;
                Enumeration<URL> resources = classLoader2.getResources("");
                Intrinsics.e(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                Intrinsics.e(list, "list(this)");
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    fileSystem = resourceFileSystem.f45180c;
                    z2 = false;
                    str = "toString(...)";
                    if (!zHasNext) {
                        break;
                    }
                    URL url = (URL) it2.next();
                    Intrinsics.c(url);
                    if (Intrinsics.a(url.getProtocol(), d9.h.f24719b)) {
                        String str2 = Path.f45153Y;
                        String string = new File(url.toURI()).toString();
                        Intrinsics.e(string, "toString(...)");
                        pair2 = new Pair(fileSystem, Path.Companion.a(string, false));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader2.getResources("META-INF/MANIFEST.MF");
                Intrinsics.e(resources2, "getResources(...)");
                ArrayList list2 = Collections.list(resources2);
                Intrinsics.e(list2, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    URL url2 = (URL) it3.next();
                    Intrinsics.c(url2);
                    String string2 = url2.toString();
                    Intrinsics.e(string2, str);
                    if (StringsKt.M(string2, "jar:file:", z2) && (iY = StringsKt.y(6, "!", string2)) != -1) {
                        String str3 = Path.f45153Y;
                        String strSubstring = string2.substring(4, iY);
                        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string3 = new File(URI.create(strSubstring)).toString();
                        Intrinsics.e(string3, str);
                        Path pathA = Path.Companion.a(string3, z2);
                        ResourceFileSystem$toJarRoot$zip$1 resourceFileSystem$toJarRoot$zip$1 = ResourceFileSystem$toJarRoot$zip$1.X;
                        FileHandle fileHandleC = fileSystem.c(pathA);
                        try {
                            long jM = fileHandleC.m() - ((long) 22);
                            long j = 0;
                            if (jM < 0) {
                                throw new IOException("not a zip: size=" + fileHandleC.m());
                            }
                            long jMax = Math.max(jM - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                            while (true) {
                                RealBufferedSource realBufferedSourceD = Okio.d(fileHandleC.n(jM));
                                try {
                                    long j2 = j;
                                    if (realBufferedSourceD.readIntLe() == 101010256) {
                                        int shortLe = realBufferedSourceD.readShortLe() & 65535;
                                        int shortLe2 = realBufferedSourceD.readShortLe() & 65535;
                                        long shortLe3 = realBufferedSourceD.readShortLe() & 65535;
                                        it = it3;
                                        if (shortLe3 != (realBufferedSourceD.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        realBufferedSourceD.skip(4L);
                                        long intLe = ((long) realBufferedSourceD.readIntLe()) & 4294967295L;
                                        int shortLe4 = realBufferedSourceD.readShortLe() & 65535;
                                        EocdRecord eocdRecord = new EocdRecord(shortLe3, intLe, shortLe4);
                                        realBufferedSourceD.readUtf8(shortLe4);
                                        realBufferedSourceD.close();
                                        long j3 = jM - ((long) 20);
                                        if (j3 > j2) {
                                            RealBufferedSource realBufferedSourceD2 = Okio.d(fileHandleC.n(j3));
                                            try {
                                                if (realBufferedSourceD2.readIntLe() == 117853008) {
                                                    int intLe2 = realBufferedSourceD2.readIntLe();
                                                    long longLe = realBufferedSourceD2.readLongLe();
                                                    if (realBufferedSourceD2.readIntLe() != 1 || intLe2 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    RealBufferedSource realBufferedSourceD3 = Okio.d(fileHandleC.n(longLe));
                                                    try {
                                                        int intLe3 = realBufferedSourceD3.readIntLe();
                                                        if (intLe3 != 101075792) {
                                                            throw new IOException("bad zip: expected " + ZipFilesKt.b(101075792) + " but was " + ZipFilesKt.b(intLe3));
                                                        }
                                                        realBufferedSourceD3.skip(12L);
                                                        int intLe4 = realBufferedSourceD3.readIntLe();
                                                        int intLe5 = realBufferedSourceD3.readIntLe();
                                                        long longLe2 = realBufferedSourceD3.readLongLe();
                                                        if (longLe2 != realBufferedSourceD3.readLongLe() || intLe4 != 0 || intLe5 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        realBufferedSourceD3.skip(8L);
                                                        EocdRecord eocdRecord2 = new EocdRecord(longLe2, realBufferedSourceD3.readLongLe(), shortLe4);
                                                        realBufferedSourceD3.close();
                                                        eocdRecord = eocdRecord2;
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            CloseableKt.a(realBufferedSourceD3, th);
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                                realBufferedSourceD2.close();
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    CloseableKt.a(realBufferedSourceD2, th3);
                                                    throw th4;
                                                }
                                            }
                                        }
                                        EocdRecord eocdRecord3 = eocdRecord;
                                        long j4 = eocdRecord3.f45177b;
                                        ArrayList arrayList3 = new ArrayList();
                                        RealBufferedSource realBufferedSourceD4 = Okio.d(fileHandleC.n(j4));
                                        try {
                                            long j5 = eocdRecord3.f45176a;
                                            long j6 = j2;
                                            while (j6 < j5) {
                                                ZipEntry zipEntryC = ZipFilesKt.c(realBufferedSourceD4);
                                                long j7 = j4;
                                                if (zipEntryC.f45184e >= j7) {
                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                }
                                                if (((Boolean) resourceFileSystem$toJarRoot$zip$1.invoke(zipEntryC)).booleanValue()) {
                                                    arrayList3.add(zipEntryC);
                                                }
                                                j6++;
                                                j4 = j7;
                                            }
                                            realBufferedSourceD4.close();
                                            ZipFileSystem zipFileSystem = new ZipFileSystem(pathA, fileSystem, ZipFilesKt.a(arrayList3));
                                            fileHandleC.close();
                                            pair = new Pair(zipFileSystem, ResourceFileSystem.f45178e);
                                            break;
                                        } catch (Throwable th5) {
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                CloseableKt.a(realBufferedSourceD4, th5);
                                                throw th6;
                                            }
                                        }
                                        try {
                                            throw th;
                                        } catch (Throwable th7) {
                                            CloseableKt.a(fileHandleC, th);
                                            throw th7;
                                        }
                                    }
                                    Iterator it4 = it3;
                                    realBufferedSourceD.close();
                                    jM--;
                                    if (jM < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    it3 = it4;
                                    j = j2;
                                } catch (Throwable th8) {
                                    realBufferedSourceD.close();
                                    throw th8;
                                }
                            }
                        } catch (Throwable th9) {
                            throw th9;
                        }
                    } else {
                        it = it3;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    it3 = it;
                    str = str;
                    z2 = false;
                }
                return CollectionsKt.O(arrayList2, arrayList);
            }
        });
    }

    public static String d(Path child) throws EOFException {
        Path pathD;
        Path other = f45178e;
        other.getClass();
        Intrinsics.f(child, "child");
        Path pathB = Path.b(other, child, true);
        pathB.getClass();
        Intrinsics.f(other, "other");
        int iA = Path.a(pathB);
        ByteString byteString = pathB.X;
        Path path = iA == -1 ? null : new Path(byteString.s(0, iA));
        int iA2 = Path.a(other);
        ByteString byteString2 = other.X;
        if (!Intrinsics.a(path, iA2 != -1 ? new Path(byteString2.s(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + pathB + " and " + other).toString());
        }
        ArrayList arrayListA = pathB.a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i2 = 0;
        while (i2 < iMin && Intrinsics.a(arrayListA.get(i2), arrayListA2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && byteString.h() == byteString2.h()) {
            pathD = Path.Companion.a(mo.ono, false);
        } else {
            if (arrayListA2.subList(i2, arrayListA2.size()).indexOf(Path.f45175e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + pathB + " and " + other).toString());
            }
            Buffer buffer = new Buffer();
            ByteString byteStringC = Path.c(other);
            if (byteStringC == null && (byteStringC = Path.c(pathB)) == null) {
                byteStringC = Path.f(Path.f45153Y);
            }
            int size = arrayListA2.size();
            for (int i3 = i2; i3 < size; i3++) {
                buffer.K(Path.f45175e);
                buffer.K(byteStringC);
            }
            int size2 = arrayListA.size();
            while (i2 < size2) {
                buffer.K((ByteString) arrayListA.get(i2));
                buffer.K(byteStringC);
                i2++;
            }
            pathD = Path.d(buffer, false);
        }
        return pathD.X.v();
    }

    @Override // okio.FileSystem
    public final List a(Path dir) throws EOFException {
        Intrinsics.f(dir, "dir");
        String strD = d(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.d.getX()).iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            FileSystem fileSystem = (FileSystem) pair.X;
            Path base = (Path) pair.f43249Y;
            List listA = fileSystem.a(base.d(strD));
            if (listA != null) {
                ArrayList<Path> arrayList2 = new ArrayList();
                for (Object obj : listA) {
                    if (Companion.a((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.n(arrayList2, 10));
                for (Path path : arrayList2) {
                    Intrinsics.f(path, "<this>");
                    Intrinsics.f(base, "base");
                    arrayList3.add(f45178e.d(StringsKt.H(StringsKt.D(path.X.v(), base.X.v()), '\\', IOUtils.DIR_SEPARATOR_UNIX)));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt.g(arrayList, linkedHashSet);
                z2 = true;
            }
        }
        if (z2) {
            return CollectionsKt.i0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileMetadata b(Path path) throws EOFException {
        Intrinsics.f(path, "path");
        if (!Companion.a(path)) {
            return null;
        }
        String strD = d(path);
        for (Pair pair : (List) this.d.getX()) {
            FileMetadata fileMetadataB = ((FileSystem) pair.X).b(((Path) pair.f43249Y).d(strD));
            if (fileMetadataB != null) {
                return fileMetadataB;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileHandle c(Path path) throws EOFException, FileNotFoundException {
        if (!Companion.a(path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        String strD = d(path);
        for (Pair pair : (List) this.d.getX()) {
            try {
                return ((FileSystem) pair.X).c(((Path) pair.f43249Y).d(strD));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + path);
    }
}
