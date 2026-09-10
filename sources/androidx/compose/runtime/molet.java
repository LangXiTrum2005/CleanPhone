package androidx.compose.runtime;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/molet;", "Landroidx/compose/runtime/tailoring;", "", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "saneness", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class molet implements tailoring<Object> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molet f6092attabal = new molet();

    @Override // androidx.compose.runtime.tailoring
    public boolean saneness(Object a, Object b) {
        return a == b;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
