package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/privatdozent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/grimness;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Ldovishness/beachfront;", "set", "<init>", "(JLdovishness/beachfront;)V", "value", "", "dern", "(Landroidx/compose/runtime/snapshots/grimness;)V", "wireman", "()Landroidx/compose/runtime/snapshots/grimness;", "marial", "(J)Landroidx/compose/runtime/snapshots/grimness;", "Ldovishness/beachfront;", "apical", "()Ldovishness/beachfront;", "impassible", "(Ldovishness/beachfront;)V", "", "I", "cutely", "()I", "formularize", "(I)V", "modification", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class privatdozent<T> extends grimness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public dovishness.beachfront<? extends T> set;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int modification;

    public privatdozent(long j, dovishness.beachfront<? extends T> beachfrontVar) {
        super(j);
        this.set = beachfrontVar;
    }

    public final dovishness.beachfront<T> apical() {
        return this.set;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public void dern(grimness value) {
        synchronized (kattegat.f6209attabal) {
            Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.set = ((privatdozent) value).set;
            this.modification = ((privatdozent) value).modification;
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void formularize(int i) {
        this.modification = i;
    }

    public final void impassible(dovishness.beachfront<? extends T> beachfrontVar) {
        this.set = beachfrontVar;
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public grimness marial(long snapshotId) {
        return new privatdozent(snapshotId, this.set);
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public grimness wireman() {
        return new privatdozent(adultoid.grimness().getSnapshotId(), this.set);
    }
}
