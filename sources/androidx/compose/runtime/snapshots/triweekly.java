package androidx.compose.runtime.snapshots;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010R$\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010#\u001a\u00060 j\u0002`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010\u0011\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/triweekly;", "", "<init>", "()V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", BuildConfig.FLAVOR, "marial", "(J)J", "value", "", "attabal", "(J)I", "handle", "", "beachfront", "(I)V", "index", "impromptu", "competently", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "taiyuan", "(II)V", "atLeast", "dern", "saneness", "()I", "wireman", "I", "getSize", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "[J", "values", "", "[I", "handles", "firstFreeHandle", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int firstFreeHandle;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int[] handles;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long[] values = arytenoidectomy.saneness(16);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int[] index = new int[16];

    public triweekly() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.handles = iArr;
    }

    public final int attabal(long value) {
        dern(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int iSaneness = saneness();
        this.values[i] = value;
        this.index[i] = iSaneness;
        this.handles[iSaneness] = i;
        impromptu(i);
        return iSaneness;
    }

    public final void beachfront(int handle) {
        int i = this.handles[handle];
        taiyuan(i, this.size - 1);
        this.size--;
        impromptu(i);
        competently(i);
        wireman(handle);
    }

    public final void competently(int index) {
        long[] jArr = this.values;
        int i = this.size >> 1;
        while (index < i) {
            int i2 = (index + 1) << 1;
            int i3 = i2 - 1;
            if (i2 >= this.size || Intrinsics.cutely(jArr[i2], jArr[i3]) >= 0) {
                if (Intrinsics.cutely(jArr[i3], jArr[index]) >= 0) {
                    return;
                }
                taiyuan(i3, index);
                index = i3;
            } else {
                if (Intrinsics.cutely(jArr[i2], jArr[index]) >= 0) {
                    return;
                }
                taiyuan(i2, index);
                index = i2;
            }
        }
    }

    public final void dern(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i = length * 2;
        long[] jArrSaneness = arytenoidectomy.saneness(i);
        int[] iArr = new int[i];
        p002kotlin.collections.arytenoidectomy.impassible(this.values, jArrSaneness, 0, 0, 0, 12, null);
        p002kotlin.collections.arytenoidectomy.formularize(this.index, iArr, 0, 0, 0, 14, null);
        this.values = jArrSaneness;
        this.index = iArr;
    }

    public final void impromptu(int index) {
        long[] jArr = this.values;
        long j = jArr[index];
        while (index > 0) {
            int i = ((index + 1) >> 1) - 1;
            if (Intrinsics.cutely(jArr[i], j) <= 0) {
                return;
            }
            taiyuan(i, index);
            index = i;
        }
    }

    public final long marial(long j) {
        return this.size > 0 ? this.values[0] : j;
    }

    public final int saneness() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            p002kotlin.collections.arytenoidectomy.formularize(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i4 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i4];
        return i4;
    }

    public final void taiyuan(int a, int b) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[a];
        jArr[a] = jArr[b];
        jArr[b] = j;
        int i = iArr[a];
        int i2 = iArr[b];
        iArr[a] = i2;
        iArr[b] = i;
        iArr2[i2] = a;
        iArr2[i] = b;
    }

    public final void wireman(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }
}
