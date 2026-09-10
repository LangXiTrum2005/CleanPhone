package okio.internal;

import android.support.v4.media.a;
import com.thinkup.core.common.n.mo;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteString f45172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f45173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteString f45174c;
    public static final ByteString d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f45175e;

    static {
        ByteString byteString = ByteString.e0;
        f45172a = ByteString.Companion.c("/");
        f45173b = ByteString.Companion.c("\\");
        f45174c = ByteString.Companion.c("/\\");
        d = ByteString.Companion.c(mo.ono);
        f45175e = ByteString.Companion.c("..");
    }

    public static final int a(okio.Path path) {
        if (path.X.h() != 0) {
            ByteString byteString = path.X;
            if (byteString.m(0) != 47) {
                if (byteString.m(0) == 92) {
                    if (byteString.h() > 2 && byteString.m(1) == 92) {
                        ByteString other = f45173b;
                        Intrinsics.f(other, "other");
                        int iJ = byteString.j(other.data, 2);
                        return iJ == -1 ? byteString.h() : iJ;
                    }
                } else if (byteString.h() > 2 && byteString.m(1) == 58 && byteString.m(2) == 92) {
                    char cM = (char) byteString.m(0);
                    if ('a' <= cM && cM < '{') {
                        return 3;
                    }
                    if ('A' <= cM && cM < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final okio.Path b(okio.Path path, okio.Path child, boolean z2) {
        Intrinsics.f(path, "<this>");
        Intrinsics.f(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        ByteString byteStringC = c(path);
        if (byteStringC == null && (byteStringC = c(child)) == null) {
            byteStringC = f(okio.Path.f45153Y);
        }
        Buffer buffer = new Buffer();
        buffer.K(path.X);
        if (buffer.f45132Y > 0) {
            buffer.K(byteStringC);
        }
        buffer.K(child.X);
        return d(buffer, z2);
    }

    public static final ByteString c(okio.Path path) {
        ByteString byteString = path.X;
        ByteString byteString2 = f45172a;
        if (ByteString.k(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = f45173b;
        if (ByteString.k(path.X, byteString3) != -1) {
            return byteString3;
        }
        return null;
    }

    public static final okio.Path d(Buffer buffer, boolean z2) throws EOFException {
        long j;
        ByteString byteString;
        ByteString byteString2;
        char cR;
        ByteString byteString3;
        ByteString byteString4;
        Buffer buffer2 = new Buffer();
        ByteString byteStringE = null;
        int i2 = 0;
        while (true) {
            j = 0;
            if (!buffer.f(0L, f45172a)) {
                byteString = f45173b;
                if (!buffer.f(0L, byteString)) {
                    break;
                }
            }
            byte b2 = buffer.readByte();
            if (byteStringE == null) {
                byteStringE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && Intrinsics.a(byteStringE, byteString);
        ByteString byteString5 = f45174c;
        if (z3) {
            Intrinsics.c(byteStringE);
            buffer2.K(byteStringE);
            buffer2.K(byteStringE);
        } else if (i2 > 0) {
            Intrinsics.c(byteStringE);
            buffer2.K(byteStringE);
        } else {
            long jT = buffer.t(byteString5);
            if (byteStringE == null) {
                byteStringE = jT == -1 ? f(okio.Path.f45153Y) : e(buffer.r(jT));
            }
            if (Intrinsics.a(byteStringE, byteString)) {
                byteString2 = byteStringE;
                if (buffer.f45132Y >= 2 && buffer.r(1L) == 58 && (('a' <= (cR = (char) buffer.r(0L)) && cR < '{') || ('A' <= cR && cR < '['))) {
                    if (jT == 2) {
                        buffer2.write(buffer, 3L);
                    } else {
                        buffer2.write(buffer, 2L);
                    }
                }
            } else {
                byteString2 = byteStringE;
            }
            byteStringE = byteString2;
        }
        boolean z4 = buffer2.f45132Y > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zExhausted = buffer.exhausted();
            byteString3 = d;
            if (zExhausted) {
                break;
            }
            long j2 = j;
            long jT2 = buffer.t(byteString5);
            if (jT2 == -1) {
                byteString4 = buffer.readByteString(buffer.f45132Y);
            } else {
                byteString4 = buffer.readByteString(jT2);
                buffer.readByte();
            }
            ByteString byteString6 = f45175e;
            if (Intrinsics.a(byteString4, byteString6)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (!z2 || (!z4 && (arrayList.isEmpty() || Intrinsics.a(CollectionsKt.F(arrayList), byteString6)))) {
                        arrayList.add(byteString4);
                    } else if ((!z3 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(CollectionsKt.A(arrayList));
                    }
                }
            } else if (!Intrinsics.a(byteString4, byteString3) && !Intrinsics.a(byteString4, ByteString.e0)) {
                arrayList.add(byteString4);
            }
            j = j2;
        }
        long j3 = j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                buffer2.K(byteStringE);
            }
            buffer2.K((ByteString) arrayList.get(i3));
        }
        if (buffer2.f45132Y == j3) {
            buffer2.K(byteString3);
        }
        return new okio.Path(buffer2.readByteString(buffer2.f45132Y));
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return f45172a;
        }
        if (b2 == 92) {
            return f45173b;
        }
        throw new IllegalArgumentException(a.h(b2, "not a directory separator: "));
    }

    public static final ByteString f(String str) {
        if (Intrinsics.a(str, "/")) {
            return f45172a;
        }
        if (Intrinsics.a(str, "\\")) {
            return f45173b;
        }
        throw new IllegalArgumentException(a.C("not a directory separator: ", str));
    }
}
