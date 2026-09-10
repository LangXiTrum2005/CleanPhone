package androidx.collection;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001a\u0082\u0001\u0001 ¨\u0006!"}, d2 = {"Landroidx/collection/molybdenite;", "", "", "initialCapacity", "<init>", "(I)V", "", "separator", "prefix", "postfix", "limit", "truncated", "", "attabal", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[J", "getContent$annotations", "()V", "content", "saneness", "I", "get_size$annotations", "_size", "Landroidx/collection/kattegat;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long[] content;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ molybdenite(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ String saneness(molybdenite molybdeniteVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return molybdeniteVar.attabal(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final String attabal(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(j);
        }
        sb.append(postfix);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public boolean equals(Object other) {
        if (other instanceof molybdenite) {
            molybdenite molybdeniteVar = (molybdenite) other;
            int i = molybdeniteVar._size;
            int i2 = this._size;
            if (i == i2) {
                long[] jArr = this.content;
                long[] jArr2 = molybdeniteVar.content;
                IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, i2);
                int first = intRangeMonoploid.getFirst();
                int last = intRangeMonoploid.getLast();
                if (first > last) {
                    return true;
                }
                while (jArr[first] == jArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return saneness(this, null, X3.j.d, X3.j.e, 0, null, 25, null);
    }

    public molybdenite(int i) {
        this.content = i == 0 ? dovishness.attabal() : new long[i];
    }
}
