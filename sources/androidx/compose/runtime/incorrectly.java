package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Landroidx/compose/runtime/tailoring;", "policy", "Landroidx/compose/runtime/snapshots/dovishness;", "attabal", "(Ljava/lang/Object;Landroidx/compose/runtime/tailoring;)Landroidx/compose/runtime/snapshots/dovishness;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class incorrectly {
    public static final <T> androidx.compose.runtime.snapshots.dovishness<T> attabal(T t, tailoring<T> tailoringVar) {
        return new ParcelableSnapshotMutableState(t, tailoringVar);
    }
}
