package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public final ByteString[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int[] f45151Y;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Options$Companion;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static void a(long j, Buffer buffer, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
            int i5;
            int i6;
            ArrayList arrayList3;
            long j2;
            int i7;
            int i8 = i2;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i3 >= i4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i9 = i3; i9 < i4; i9++) {
                if (((ByteString) arrayList4.get(i9)).h() < i8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i3);
            ByteString byteString2 = (ByteString) arrayList4.get(i4 - 1);
            if (i8 == byteString.h()) {
                int iIntValue = ((Number) arrayList5.get(i3)).intValue();
                int i10 = i3 + 1;
                ByteString byteString3 = (ByteString) arrayList4.get(i10);
                i5 = i10;
                i6 = iIntValue;
                byteString = byteString3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (byteString.m(i8) == byteString2.m(i8)) {
                int iMin = Math.min(byteString.h(), byteString2.h());
                int i11 = 0;
                for (int i12 = i8; i12 < iMin && byteString.m(i12) == byteString2.m(i12); i12++) {
                    i11++;
                }
                long j3 = 4;
                long j4 = (buffer.f45132Y / j3) + j + ((long) 2) + ((long) i11) + 1;
                buffer.c0(-i11);
                buffer.c0(i6);
                int i13 = i8 + i11;
                while (i8 < i13) {
                    buffer.c0(byteString.m(i8) & 255);
                    i8++;
                }
                if (i5 + 1 == i4) {
                    if (i13 != ((ByteString) arrayList4.get(i5)).h()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.c0(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.c0(((int) ((buffer2.f45132Y / j3) + j4)) * (-1));
                    a(j4, buffer2, i13, arrayList4, i5, i4, arrayList5);
                    buffer.g(buffer2);
                    return;
                }
            }
            int i14 = 1;
            for (int i15 = i5 + 1; i15 < i4; i15++) {
                if (((ByteString) arrayList4.get(i15 - 1)).m(i8) != ((ByteString) arrayList4.get(i15)).m(i8)) {
                    i14++;
                }
            }
            long j5 = 4;
            long j6 = (buffer.f45132Y / j5) + j + ((long) 2) + ((long) (i14 * 2));
            buffer.c0(i14);
            buffer.c0(i6);
            for (int i16 = i5; i16 < i4; i16++) {
                int iM = ((ByteString) arrayList4.get(i16)).m(i8);
                if (i16 == i5 || iM != ((ByteString) arrayList4.get(i16 - 1)).m(i8)) {
                    buffer.c0(iM & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            int i17 = i5;
            while (i17 < i4) {
                byte bM = ((ByteString) arrayList4.get(i17)).m(i8);
                int i18 = i17 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i4) {
                        i19 = i4;
                        break;
                    } else if (bM != ((ByteString) arrayList4.get(i19)).m(i8)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i18 == i19 && i8 + 1 == ((ByteString) arrayList4.get(i17)).h()) {
                    buffer.c0(((Number) arrayList5.get(i17)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i7 = i19;
                } else {
                    buffer.c0(((int) ((buffer3.f45132Y / j5) + j6)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i7 = i19;
                    a(j2, buffer3, i8 + 1, arrayList, i17, i7, arrayList3);
                    arrayList4 = arrayList;
                }
                j6 = j2;
                i17 = i7;
                arrayList5 = arrayList3;
            }
            buffer.g(buffer3);
        }

        public static Options b(ByteString... byteStringArr) {
            int i2 = 0;
            if (byteStringArr.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1});
            }
            ArrayList arrayListN = ArraysKt.N(byteStringArr);
            CollectionsKt.Z(arrayListN);
            ArrayList arrayList = new ArrayList(byteStringArr.length);
            for (ByteString byteString : byteStringArr) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            ArrayList arrayListL = CollectionsKt.L(Arrays.copyOf(numArr, numArr.length));
            int length = byteStringArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                arrayListL.set(CollectionsKt.l(arrayListN, byteStringArr[i3]), Integer.valueOf(i4));
                i3++;
                i4++;
            }
            if (((ByteString) arrayListN.get(0)).h() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i5 = 0;
            while (i5 < arrayListN.size()) {
                ByteString prefix = (ByteString) arrayListN.get(i5);
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < arrayListN.size()) {
                    ByteString byteString2 = (ByteString) arrayListN.get(i7);
                    byteString2.getClass();
                    Intrinsics.f(prefix, "prefix");
                    if (!byteString2.q(0, prefix, prefix.h())) {
                        break;
                    }
                    if (byteString2.h() == prefix.h()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString2).toString());
                    }
                    if (((Number) arrayListL.get(i7)).intValue() > ((Number) arrayListL.get(i5)).intValue()) {
                        arrayListN.remove(i7);
                        arrayListL.remove(i7);
                    } else {
                        i7++;
                    }
                }
                i5 = i6;
            }
            Buffer buffer = new Buffer();
            a(0L, buffer, 0, arrayListN, 0, arrayListN.size(), arrayListL);
            int[] iArr = new int[(int) (buffer.f45132Y / ((long) 4))];
            while (!buffer.exhausted()) {
                iArr[i2] = buffer.readInt();
                i2++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
            Intrinsics.e(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr);
        }
    }

    public Options(ByteString[] byteStringArr, int[] iArr) {
        this.X = byteStringArr;
        this.f45151Y = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.X[i2];
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int getZ() {
        return this.X.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
