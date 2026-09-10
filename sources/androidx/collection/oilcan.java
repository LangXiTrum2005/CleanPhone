package androidx.collection;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/collection/oilcan;", "Landroidx/collection/impassible;", "", "initialCapacity", "<init>", "(I)V", "element", "", "impromptu", "(I)Z", "index", "", "elements", "taiyuan", "(I[I)Z", "capacity", "", "cutely", "apical", "formularize", "(I)I", "start", TtmlNode.END, "impassible", "(II)V", "triweekly", "(II)I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class oilcan extends impassible {
    public oilcan(int i) {
        super(i, null);
    }

    public final boolean apical(int element) {
        int iWireman = wireman(element);
        if (iWireman < 0) {
            return false;
        }
        formularize(iWireman);
        return true;
    }

    public final void cutely(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final int formularize(int index) {
        if (index < 0 || index >= this._size) {
            molybdenite.wireman.dern("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        int i2 = this._size;
        if (index != i2 - 1) {
            p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, index, index + 1, i2);
        }
        this._size--;
        return i;
    }

    public final void impassible(int start, int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            molybdenite.wireman.dern("Index must be between 0 and size");
        }
        if (end < start) {
            molybdenite.wireman.attabal("The end index must be < start index");
        }
        if (end != start) {
            int i2 = this._size;
            if (end < i2) {
                int[] iArr = this.content;
                p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, start, end, i2);
            }
            this._size -= end - start;
        }
    }

    public final boolean impromptu(int element) {
        cutely(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        iArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean taiyuan(int index, int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            molybdenite.wireman.dern("");
        }
        if (elements.length == 0) {
            return false;
        }
        cutely(this._size + elements.length);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, elements.length + index, index, i);
        }
        p002kotlin.collections.arytenoidectomy.formularize(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final int triweekly(int index, int element) {
        if (index < 0 || index >= this._size) {
            molybdenite.wireman.dern("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    public /* synthetic */ oilcan(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
