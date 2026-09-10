package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0015\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\t\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\t\u001a\u00020\u00172\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00028\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#\u001a-\u0010$\u001a\u00020!*\u00020\u00052\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%\u001a-\u0010'\u001a\u00020!*\u00020\u00142\u0006\u0010 \u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(\u001a.\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010 \u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010.\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b.\u0010/\u001a\u001c\u00100\u001a\u00020\u0005*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00020!\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b2\u00103\u001a;\u00107\u001a\u00020!\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`5¢\u0006\u0004\b7\u00108\u001aO\u00109\u001a\u00020!\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`52\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "wireman", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "dern", "([I)Ljava/util/List;", "destination", "destinationOffset", "startIndex", "endIndex", "taiyuan", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "marial", "([B[BIII)[B", "competently", "([I[IIII)[I", "", "impromptu", "([J[JIII)[J", "", "beachfront", "([F[FIII)[F", "fromIndex", "toIndex", "arytenoidectomy", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "kowloon", "([BII)[B", "element", "", "molybdenite", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "monoploid", "([IIII)V", "", "polloi", "([JJII)V", "cord", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "rotuma", "([II)[I", "elements", "gintrap", "([B[B)[B", "preprohormone", "([I[I)[I", "cuirassed", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "stratoscope", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "trm", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class arytenoidectomy extends kowloon {

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/collections/arytenoidectomy$attabal", "Lkotlin/collections/wireman;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "wireman", "(I)Z", "index", "marial", "(I)Ljava/lang/Integer;", "beachfront", "(I)I", "competently", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends wireman<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ int[] f29300kowloon;

        public attabal(int[] iArr) {
            this.f29300kowloon = iArr;
        }

        public int beachfront(int element) {
            return polloi.clubfoot(this.f29300kowloon, element);
        }

        public int competently(int element) {
            return polloi.lotta(this.f29300kowloon, element);
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return wireman(((Number) obj).intValue());
            }
            return false;
        }

        @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
        /* JADX INFO: renamed from: getSize */
        public int get_size() {
            return this.f29300kowloon.length;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return beachfront(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f29300kowloon.length == 0;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return competently(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f29300kowloon[index]);
        }

        public boolean wireman(int element) {
            return polloi.restrictive(this.f29300kowloon, element);
        }
    }

    public static /* synthetic */ void adultoid(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        polloi(jArr, j, i, i2);
    }

    public static /* synthetic */ float[] apical(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return beachfront(fArr, fArr2, i, i2, i3);
    }

    public static <T> T[] arytenoidectomy(T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        triweekly.saneness(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final float[] beachfront(float[] fArr, float[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i2, destination, i, i3 - i2);
        return destination;
    }

    public static int[] competently(int[] iArr, int[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
        return destination;
    }

    public static <T> T[] cord(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        Intrinsics.beachfront(tArr2);
        return tArr2;
    }

    public static final <T> void cuirassed(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ byte[] cutely(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return marial(bArr, bArr2, i, i2, i3);
    }

    public static List<Integer> dern(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new attabal(iArr);
    }

    public static /* synthetic */ void dovishness(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        molybdenite(objArr, obj, i, i2);
    }

    public static /* synthetic */ int[] formularize(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return competently(iArr, iArr2, i, i2, i3);
    }

    public static byte[] gintrap(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.beachfront(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void graveside(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        monoploid(iArr, i, i2, i3);
    }

    public static /* synthetic */ long[] impassible(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return impromptu(jArr, jArr2, i, i2, i3);
    }

    public static long[] impromptu(long[] jArr, long[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
        return destination;
    }

    public static byte[] kowloon(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        triweekly.saneness(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static byte[] marial(byte[] bArr, byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
        return destination;
    }

    public static <T> void molybdenite(T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static final void monoploid(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final void polloi(long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    public static int[] preprohormone(int[] iArr, int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.beachfront(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] rotuma(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        Intrinsics.beachfront(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final <T> void stratoscope(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> T[] taiyuan(T[] tArr, T[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i2, destination, i, i3 - i2);
        return destination;
    }

    public static /* synthetic */ Object[] triweekly(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return taiyuan(objArr, objArr2, i, i2, i3);
    }

    public static <T> void trm(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    public static <T> List<T> wireman(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listAttabal = molybdenite.attabal(tArr);
        Intrinsics.checkNotNullExpressionValue(listAttabal, "asList(...)");
        return listAttabal;
    }
}
