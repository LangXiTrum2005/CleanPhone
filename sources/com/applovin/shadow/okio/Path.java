package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u000b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010/\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u00100R\u0013\u00103\u001a\u0004\u0018\u0001028G¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0011\u00106\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u00100R\u0011\u00107\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b7\u0010(R\u0013\u00108\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010;\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b:\u00109¨\u0006="}, d2 = {"Lcom/applovin/shadow/okio/Path;", "", "Lcom/applovin/shadow/okio/ByteString;", "bytes", "<init>", "(Llo/h;)V", "", "child", "resolve", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/Path;", TtmlNode.TAG_DIV, "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/Path;", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "", "normalize", "(Ljava/lang/String;Z)Lcom/applovin/shadow/okio/Path;", "(Lcom/applovin/shadow/okio/ByteString;Z)Lcom/applovin/shadow/okio/Path;", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Path;", "other", "relativeTo", "normalized", "()Lcom/applovin/shadow/okio/Path;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "toNioPath", "()Ljava/nio/file/Path;", "", "compareTo", "(Lcom/applovin/shadow/okio/Path;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Lcom/applovin/shadow/okio/ByteString;", "getBytes$okio", "()Llo/h;", "", "getSegments", "()Ljava/util/List;", "segments", "getSegmentsBytes", "segmentsBytes", "isAbsolute", "()Z", "isRelative", "", "volumeLetter", "()Ljava/lang/Character;", "name", "isRoot", "nameBytes", "parent", "()Ljava/lang/Object;", "getRoot", "root", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lcom/applovin/shadow/okio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        public final Path get(File file) {
            n.f(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        public final Path get(String str) {
            n.f(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        public final Path get(java.nio.file.Path path) {
            n.f(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public final Path get(String str, boolean z10) {
            n.f(str, "<this>");
            return com.applovin.shadow.okio.internal.Path.commonToPath(str, z10);
        }

        public final Path get(File file, boolean z10) {
            n.f(file, "<this>");
            String string = file.toString();
            n.e(string, "toString(...)");
            return get(string, z10);
        }

        public final Path get(java.nio.file.Path path, boolean z10) {
            n.f(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        n.e(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(ByteString bytes) {
        n.f(bytes, "bytes");
        this.bytes = bytes;
    }

    public static final Path get(File file) {
        return INSTANCE.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    public boolean equals(Object other) {
        return (other instanceof Path) && n.a(((Path) other).getBytes(), getBytes());
    }

    /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    public final Path getRoot() {
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes().substring(0, iRootLength));
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes().size()) {
            arrayList.add(getBytes().substring(i10, getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes().size()) {
            arrayList.add(getBytes().substring(i10, getBytes().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == getBytes().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes(), indexOfLastSlash + 1, 0, 2, null);
        }
        return (volumeLetter() == null || getBytes().size() != 2) ? getBytes() : ByteString.EMPTY;
    }

    public final Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    public final Path parent() {
        if (n.a(getBytes(), com.applovin.shadow.okio.internal.Path.DOT) || n.a(getBytes(), com.applovin.shadow.okio.internal.Path.SLASH) || n.a(getBytes(), com.applovin.shadow.okio.internal.Path.BACKSLASH) || com.applovin.shadow.okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash == 2 && volumeLetter() != null) {
            if (getBytes().size() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(getBytes(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && getBytes().startsWith(com.applovin.shadow.okio.internal.Path.BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || volumeLetter() == null) {
            if (indexOfLastSlash == -1) {
                return new Path(com.applovin.shadow.okio.internal.Path.DOT);
            }
            return indexOfLastSlash == 0 ? new Path(ByteString.substring$default(getBytes(), 0, 1, 1, null)) : new Path(ByteString.substring$default(getBytes(), 0, indexOfLastSlash, 1, null));
        }
        if (getBytes().size() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(getBytes(), 0, 2, 1, null));
    }

    public final Path relativeTo(Path other) {
        n.f(other, "other");
        if (!n.a(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && n.a(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes().size() == other.getBytes().size()) {
            return Companion.get$default(INSTANCE, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(com.applovin.shadow.okio.internal.Path.DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = com.applovin.shadow.okio.internal.Path.getSlash(other);
        if (slash == null && (slash = com.applovin.shadow.okio.internal.Path.getSlash(this)) == null) {
            slash = com.applovin.shadow.okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(com.applovin.shadow.okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return com.applovin.shadow.okio.internal.Path.toPath(buffer, false);
    }

    public final Path resolve(Path child) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        n.e(path, "get(...)");
        return path;
    }

    public String toString() {
        return getBytes().utf8();
    }

    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes(), com.applovin.shadow.okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c4 = (char) getBytes().getByte(0);
        if (('a' > c4 || c4 >= '{') && ('A' > c4 || c4 >= '[')) {
            return null;
        }
        return Character.valueOf(c4);
    }

    public static final Path get(File file, boolean z10) {
        return INSTANCE.get(file, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Path other) {
        n.f(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    public final Path resolve(Path child, boolean normalize) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, normalize);
    }

    public static final Path get(String str) {
        return INSTANCE.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    public final Path resolve(String child) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    public static final Path get(String str, boolean z10) {
        return INSTANCE.get(str, z10);
    }

    public static final Path get(java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    public final Path resolve(ByteString child) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    public static final Path get(java.nio.file.Path path, boolean z10) {
        return INSTANCE.get(path, z10);
    }

    public final Path resolve(String child, boolean normalize) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), normalize);
    }

    public final Path resolve(ByteString child, boolean normalize) {
        n.f(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), normalize);
    }
}
