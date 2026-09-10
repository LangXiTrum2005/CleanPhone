package androidx.compose.runtime;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0004\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a#\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0004\u001a#\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001aK\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010!\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010#\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"", "", AgentOptions.ADDRESS, "polloi", "([II)I", "", "value", "", "rotuma", "([IIZ)V", "dovishness", "impassible", "graveside", "preprohormone", "([III)V", "kowloon", "gintrap", X3.i.W, "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "arytenoidectomy", "([IIIZZZII)V", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/saneness;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "triweekly", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/saneness;", "location", "molybdenite", "(Ljava/util/ArrayList;II)I", "monoploid", "adultoid", "()V", "", "attabal", "[J", "EmptyLongArray", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class tarboosh {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long[] f6308attabal = new long[0];

    public static final void adultoid() {
        throw new ConcurrentModificationException();
    }

    public static final void arytenoidectomy(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = i * 5;
        iArr[i5] = i2;
        iArr[i5 + 1] = ((z ? 1 : 0) << 30) | ((z2 ? 1 : 0) << 29) | ((z3 ? 1 : 0) << 28);
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = 0;
        iArr[i5 + 4] = i4;
    }

    public static final void dovishness(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 26) | (iArr[i2] & (-67108865));
    }

    public static final void gintrap(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    public static final int graveside(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final int impassible(int[] iArr, int i) {
        int i2 = i * 5;
        return i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 29);
    }

    public static final int kowloon(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int molybdenite(ArrayList<saneness> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iAttabal = arrayList.get(i4).getLocation();
            if (iAttabal < 0) {
                iAttabal += i2;
            }
            int iTaiyuan = Intrinsics.taiyuan(iAttabal, i);
            if (iTaiyuan < 0) {
                i3 = i4 + 1;
            } else {
                if (iTaiyuan <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int monoploid(ArrayList<saneness> arrayList, int i, int i2) {
        int iMolybdenite = molybdenite(arrayList, i, i2);
        return iMolybdenite >= 0 ? iMolybdenite : -(iMolybdenite + 1);
    }

    public static final int polloi(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final void preprohormone(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void rotuma(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 27) | (iArr[i2] & (-134217729));
    }

    public static final saneness triweekly(ArrayList<saneness> arrayList, int i, int i2) {
        int iMolybdenite = molybdenite(arrayList, i, i2);
        if (iMolybdenite >= 0) {
            return arrayList.get(iMolybdenite);
        }
        return null;
    }
}
