package okio.internal;

import android.support.v4.media.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.FileMetadata;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipFilesKt {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = Path.f45153Y;
        Path pathA = Path.Companion.a("/", false);
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair(pathA, new ZipEntry(pathA)));
        for (ZipEntry zipEntry : CollectionsKt.c0(new ZipFilesKt$buildIndex$$inlined$sortedBy$1(), arrayList)) {
            if (((ZipEntry) linkedHashMapL.put(zipEntry.f45181a, zipEntry)) == null) {
                while (true) {
                    Path path = zipEntry.f45181a;
                    Path pathB = path.b();
                    if (pathB == null) {
                        break;
                    }
                    ZipEntry zipEntry2 = (ZipEntry) linkedHashMapL.get(pathB);
                    if (zipEntry2 != null) {
                        zipEntry2.f.add(path);
                        break;
                    }
                    ZipEntry zipEntry3 = new ZipEntry(pathB);
                    linkedHashMapL.put(pathB, zipEntry3);
                    zipEntry3.f.add(path);
                    zipEntry = zipEntry3;
                }
            }
        }
        return linkedHashMapL;
    }

    public static final String b(int i2) {
        CharsKt.b(16);
        String string = Integer.toString(i2, 16);
        Intrinsics.e(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final ZipEntry c(final RealBufferedSource realBufferedSource) throws IOException {
        Long lValueOf;
        int intLe = realBufferedSource.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(intLe));
        }
        realBufferedSource.skip(4L);
        short shortLe = realBufferedSource.readShortLe();
        int i2 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i2));
        }
        int shortLe2 = realBufferedSource.readShortLe() & 65535;
        short shortLe3 = realBufferedSource.readShortLe();
        int i3 = shortLe3 & 65535;
        short shortLe4 = realBufferedSource.readShortLe();
        int i4 = shortLe4 & 65535;
        if (i3 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, shortLe4 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (shortLe3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l2 = lValueOf;
        realBufferedSource.readIntLe();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.X = ((long) realBufferedSource.readIntLe()) & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.X = ((long) realBufferedSource.readIntLe()) & 4294967295L;
        int shortLe5 = realBufferedSource.readShortLe() & 65535;
        int shortLe6 = realBufferedSource.readShortLe() & 65535;
        int shortLe7 = realBufferedSource.readShortLe() & 65535;
        realBufferedSource.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.X = ((long) realBufferedSource.readIntLe()) & 4294967295L;
        String utf8 = realBufferedSource.readUtf8(shortLe5);
        if (StringsKt.m(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = longRef2.X == 4294967295L ? 8 : 0L;
        if (longRef.X == 4294967295L) {
            j += (long) 8;
        }
        if (longRef3.X == 4294967295L) {
            j += (long) 8;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        d(realBufferedSource, shortLe6, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt$readEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (booleanRef2.X) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef2.X = true;
                    if (jLongValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref.LongRef longRef4 = longRef2;
                    long longLe = longRef4.X;
                    RealBufferedSource realBufferedSource2 = realBufferedSource;
                    if (longLe == 4294967295L) {
                        longLe = realBufferedSource2.readLongLe();
                    }
                    longRef4.X = longLe;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.X = longRef5.X == 4294967295L ? realBufferedSource2.readLongLe() : 0L;
                    Ref.LongRef longRef6 = longRef3;
                    longRef6.X = longRef6.X == 4294967295L ? realBufferedSource2.readLongLe() : 0L;
                }
                return Unit.f43263a;
            }
        });
        if (j > 0 && !booleanRef.X) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String utf9 = realBufferedSource.readUtf8(shortLe7);
        String str = Path.f45153Y;
        return new ZipEntry(Path.Companion.a("/", false).d(utf8), StringsKt.p(utf8, "/", false), utf9, longRef.X, longRef2.X, shortLe2, l2, longRef3.X);
    }

    public static final void d(RealBufferedSource realBufferedSource, int i2, Function2 function2) throws IOException {
        long j = i2;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = realBufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) realBufferedSource.readShortLe()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            realBufferedSource.require(shortLe2);
            Buffer buffer = realBufferedSource.f45156Y;
            long j3 = buffer.f45132Y;
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long j4 = (buffer.f45132Y + shortLe2) - j3;
            if (j4 < 0) {
                throw new IOException(a.h(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                buffer.skip(j4);
            }
            j = j2 - shortLe2;
        }
    }

    public static final FileMetadata e(final RealBufferedSource realBufferedSource, FileMetadata fileMetadata) throws IOException {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.X = fileMetadata != null ? fileMetadata.f : null;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int intLe = realBufferedSource.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(intLe));
        }
        realBufferedSource.skip(2L);
        short shortLe = realBufferedSource.readShortLe();
        int i2 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i2));
        }
        realBufferedSource.skip(18L);
        long shortLe2 = ((long) realBufferedSource.readShortLe()) & 65535;
        int shortLe3 = realBufferedSource.readShortLe() & 65535;
        realBufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            realBufferedSource.skip(shortLe3);
            return null;
        }
        d(realBufferedSource, shortLe3, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    RealBufferedSource realBufferedSource2 = realBufferedSource;
                    byte b2 = realBufferedSource2.readByte();
                    boolean z2 = (b2 & 1) == 1;
                    boolean z3 = (b2 & 2) == 2;
                    boolean z4 = (b2 & 4) == 4;
                    long j = z2 ? 5L : 1L;
                    if (z3) {
                        j += 4;
                    }
                    if (z4) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z2) {
                        objectRef.X = Long.valueOf(((long) realBufferedSource2.readIntLe()) * 1000);
                    }
                    if (z3) {
                        objectRef2.X = Long.valueOf(((long) realBufferedSource2.readIntLe()) * 1000);
                    }
                    if (z4) {
                        objectRef3.X = Long.valueOf(((long) realBufferedSource2.readIntLe()) * 1000);
                    }
                }
                return Unit.f43263a;
            }
        });
        return new FileMetadata(fileMetadata.f45139a, fileMetadata.f45140b, null, fileMetadata.d, (Long) objectRef3.X, (Long) objectRef.X, (Long) objectRef2.X);
    }
}
