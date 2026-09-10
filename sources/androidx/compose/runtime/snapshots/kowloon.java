package androidx.compose.runtime.snapshots;

import java.util.Arrays;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotId.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/kowloon;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", "", "attabal", "(J)V", "saneness", "()[J", "Landroidx/collection/kattegat;", "Landroidx/collection/kattegat;", "list", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.kattegat list;

    public kowloon(long[] jArr) {
        androidx.collection.kattegat kattegatVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            kattegatVar = new androidx.collection.kattegat(jArrCopyOf.length);
            kattegatVar.wireman(kattegatVar._size, jArrCopyOf);
        } else {
            kattegatVar = new androidx.collection.kattegat(0, 1, null);
        }
        this.list = kattegatVar;
    }

    public final void attabal(long id) {
        this.list.dern(id);
    }

    public final long[] saneness() {
        androidx.collection.kattegat kattegatVar = this.list;
        int i = kattegatVar._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = kattegatVar.content;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
