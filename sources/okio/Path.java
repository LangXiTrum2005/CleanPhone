package okio;

import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Path;", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f45153Y;
    public final ByteString X;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Path$Companion;", "", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static Path a(String str, boolean z2) {
            Intrinsics.f(str, "<this>");
            ByteString byteString = okio.internal.Path.f45172a;
            Buffer buffer = new Buffer();
            buffer.s0(str);
            return okio.internal.Path.d(buffer, z2);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.e(separator, "separator");
        f45153Y = separator;
    }

    public Path(ByteString bytes) {
        Intrinsics.f(bytes, "bytes");
        this.X = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = okio.internal.Path.a(this);
        ByteString byteString = this.X;
        if (iA == -1) {
            iA = 0;
        } else if (iA < byteString.h() && byteString.m(iA) == 92) {
            iA++;
        }
        int iH = byteString.h();
        int i2 = iA;
        while (iA < iH) {
            if (byteString.m(iA) == 47 || byteString.m(iA) == 92) {
                arrayList.add(byteString.s(i2, iA));
                i2 = iA + 1;
            }
            iA++;
        }
        if (i2 < byteString.h()) {
            arrayList.add(byteString.s(i2, byteString.h()));
        }
        return arrayList;
    }

    public final Path b() {
        ByteString byteString = okio.internal.Path.d;
        ByteString byteString2 = this.X;
        if (Intrinsics.a(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = okio.internal.Path.f45172a;
        if (Intrinsics.a(byteString2, byteString3)) {
            return null;
        }
        ByteString prefix = okio.internal.Path.f45173b;
        if (Intrinsics.a(byteString2, prefix)) {
            return null;
        }
        ByteString suffix = okio.internal.Path.f45175e;
        byteString2.getClass();
        Intrinsics.f(suffix, "suffix");
        int iH = byteString2.h();
        byte[] bArr = suffix.data;
        if (byteString2.q(iH - bArr.length, suffix, bArr.length) && (byteString2.h() == 2 || byteString2.q(byteString2.h() - 3, byteString3, 1) || byteString2.q(byteString2.h() - 3, prefix, 1))) {
            return null;
        }
        int iO = ByteString.o(byteString2, byteString3);
        if (iO == -1) {
            iO = ByteString.o(byteString2, prefix);
        }
        if (iO == 2 && g() != null) {
            if (byteString2.h() == 3) {
                return null;
            }
            return new Path(ByteString.t(byteString2, 0, 3, 1));
        }
        if (iO == 1) {
            Intrinsics.f(prefix, "prefix");
            if (byteString2.q(0, prefix, prefix.h())) {
                return null;
            }
        }
        if (iO != -1 || g() == null) {
            if (iO == -1) {
                return new Path(byteString);
            }
            return iO == 0 ? new Path(ByteString.t(byteString2, 0, 1, 1)) : new Path(ByteString.t(byteString2, 0, iO, 1));
        }
        if (byteString2.h() == 2) {
            return null;
        }
        return new Path(ByteString.t(byteString2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Path path) {
        Path other = path;
        Intrinsics.f(other, "other");
        return this.X.compareTo(other.X);
    }

    public final Path d(String child) {
        Intrinsics.f(child, "child");
        Buffer buffer = new Buffer();
        buffer.s0(child);
        return okio.internal.Path.b(this, okio.internal.Path.d(buffer, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.a(((Path) obj).X, this.X);
    }

    public final File f() {
        return new File(this.X.v());
    }

    public final Character g() {
        ByteString byteString = okio.internal.Path.f45172a;
        ByteString byteString2 = this.X;
        if (ByteString.k(byteString2, byteString) != -1 || byteString2.h() < 2 || byteString2.m(1) != 58) {
            return null;
        }
        char cM = (char) byteString2.m(0);
        if (('a' > cM || cM >= '{') && ('A' > cM || cM >= '[')) {
            return null;
        }
        return Character.valueOf(cM);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return this.X.v();
    }
}
