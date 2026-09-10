package androidx.collection;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Landroidx/collection/kattegat;", "Landroidx/collection/molybdenite;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "dern", "(J)Z", "index", "", "elements", "wireman", "(I[J)Z", "capacity", "", "marial", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class kattegat extends molybdenite {
    public kattegat(int i) {
        super(i, null);
    }

    public final boolean dern(long element) {
        marial(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final void marial(int capacity) {
        long[] jArr = this.content;
        if (jArr.length < capacity) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(capacity, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final boolean wireman(int index, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            molybdenite.wireman.dern("");
        }
        if (elements.length == 0) {
            return false;
        }
        marial(this._size + elements.length);
        long[] jArr = this.content;
        int i = this._size;
        if (index != i) {
            p002kotlin.collections.arytenoidectomy.impromptu(jArr, jArr, elements.length + index, index, i);
        }
        p002kotlin.collections.arytenoidectomy.impassible(elements, jArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public /* synthetic */ kattegat(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
