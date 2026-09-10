package spring;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001e\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"E", "", "size", "", "wireman", "(I)[Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "offset", "length", "", "thisCollection", "", "cutely", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "taiyuan", "([Ljava/lang/Object;II)I", "", C3414a2.d, "", "impromptu", "([Ljava/lang/Object;IILjava/util/List;)Z", "newSize", "marial", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "", "beachfront", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "competently", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class saneness {
    public static final <E> void beachfront(E[] eArr, int i) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void competently(E[] eArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i < i2) {
            beachfront(eArr, i);
            i++;
        }
    }

    public static final <T> String cutely(T[] tArr, int i, int i2, Collection<? extends T> collection2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(X3.j.d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection2) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append(X3.j.e);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <T> boolean impromptu(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.wireman(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T[] marial(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <T> int taiyuan(T[] tArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i + i3];
            iHashCode = (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final <E> E[] wireman(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
