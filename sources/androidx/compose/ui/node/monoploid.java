package androidx.compose.ui.node;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J'\u0010 \u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010+R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Landroidx/compose/ui/node/monoploid;", "", "", "initialCapacity", "<init>", "(I)V", "index", "saneness", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "", "impromptu", "(IIII)V", "x", "y", "size", "competently", "(III)V", "beachfront", "()I", "", "wireman", "()Z", "cutely", "()V", "start", TtmlNode.END, "elSize", "taiyuan", "marial", "(III)I", "i", "j", "apical", "(II)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "attabal", "(II)Z", "", "[I", "stack", "I", "lastIndex", "dern", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int[] stack;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int lastIndex;

    public monoploid(int i) {
        this.stack = new int[i];
    }

    public final void apical(int i, int j) {
        int[] iArr = this.stack;
        merc.taiyuan(iArr, i, j);
        merc.taiyuan(iArr, i + 1, j + 1);
        merc.taiyuan(iArr, i + 2, j + 2);
    }

    public final boolean attabal(int a, int b) {
        int[] iArr = this.stack;
        int i = iArr[a];
        int i2 = iArr[b];
        return i < i2 || (i == i2 && iArr[a + 1] <= iArr[b + 1]);
    }

    public final int beachfront() {
        int[] iArr = this.stack;
        int i = this.lastIndex - 1;
        this.lastIndex = i;
        return iArr[i];
    }

    public final void competently(int x, int y, int size) {
        int i = this.lastIndex;
        int i2 = i + 3;
        int[] iArr = this.stack;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i] = x + size;
        iArr2[i + 1] = y + size;
        iArr2[i + 2] = size;
        this.lastIndex = i2;
    }

    public final void cutely() {
        int i = this.lastIndex;
        if (!(i % 3 == 0)) {
            peridotite.attabal.saneness("Array size not a multiple of 3");
        }
        if (i > 3) {
            taiyuan(0, i - 3, 3);
        }
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final void impromptu(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i = this.lastIndex;
        int i2 = i + 4;
        int[] iArr = this.stack;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i] = oldStart;
        iArr2[i + 1] = oldEnd;
        iArr2[i + 2] = newStart;
        iArr2[i + 3] = newEnd;
        this.lastIndex = i2;
    }

    public final int marial(int start, int end, int elSize) {
        int i = start - elSize;
        while (start < end) {
            if (attabal(start, end)) {
                i += elSize;
                apical(i, start);
            }
            start += elSize;
        }
        int i2 = i + elSize;
        apical(i2, end);
        return i2;
    }

    public final int saneness(int index) {
        return this.stack[index];
    }

    public final void taiyuan(int start, int end, int elSize) {
        if (start < end) {
            int iMarial = marial(start, end, elSize);
            taiyuan(start, iMarial - elSize, elSize);
            taiyuan(iMarial + elSize, end, elSize);
        }
    }

    public final boolean wireman() {
        return this.lastIndex != 0;
    }
}
