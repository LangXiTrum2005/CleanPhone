package hydrovane;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import starveling.graveside;

/* JADX INFO: compiled from: PointerIdArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lhydrovane/attabal;", "", "<init>", "()V", "", "index", "Lstarveling/graveside;", "marial", "(I)J", "pointerId", "", "taiyuan", "(J)Z", "", "pointerIdValue", "impromptu", "cutely", "(I)Z", "competently", "()Z", "value", "attabal", "saneness", "", "apical", "(IJ)V", "dern", "wireman", "<set-?>", "I", "beachfront", "()I", "size", "", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long[] internalArray = new long[2];

    public final void apical(int index, long value) {
        long[] jArr = this.internalArray;
        if (index >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(index + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.internalArray = jArrCopyOf;
        }
        this.internalArray[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    public final boolean attabal(long value) {
        if (wireman(value)) {
            return false;
        }
        apical(this.size, value);
        return true;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean competently() {
        return this.size == 0;
    }

    public final boolean cutely(int index) {
        int i = this.size;
        if (index >= i) {
            return false;
        }
        int i2 = i - 1;
        while (index < i2) {
            long[] jArr = this.internalArray;
            int i3 = index + 1;
            jArr[index] = jArr[i3];
            index = i3;
        }
        this.size--;
        return true;
    }

    public final void dern() {
        this.size = 0;
    }

    public final boolean impromptu(long pointerIdValue) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (pointerIdValue == marial(i2)) {
                cutely(i2);
                return true;
            }
        }
        return false;
    }

    public final long marial(int index) {
        return graveside.attabal(this.internalArray[index]);
    }

    public final boolean saneness(long pointerId) {
        return attabal(pointerId);
    }

    public final boolean taiyuan(long pointerId) {
        return impromptu(pointerId);
    }

    public final boolean wireman(long pointerIdValue) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }
}
