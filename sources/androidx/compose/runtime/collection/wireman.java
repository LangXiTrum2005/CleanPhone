package androidx.compose.runtime.collection;

import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\b\u001a\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"", "", "index", "", "attabal", "(Ljava/util/List;I)V", "size", "dern", "(II)V", "fromIndex", "toIndex", "saneness", "(Ljava/util/List;II)V", "marial", "wireman", "(I)V", "beachfront", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wireman {
    public static final void attabal(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            dern(i, size);
        }
    }

    private static final void beachfront(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    private static final void dern(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void marial(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void saneness(List<?> list, int i, int i2) {
        if (i > i2) {
            beachfront(i, i2);
        }
        if (i < 0) {
            wireman(i);
        }
        if (i2 > list.size()) {
            marial(i2, list.size());
        }
    }

    private static final void wireman(int i) {
        throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
    }
}
