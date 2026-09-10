package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/runtime/snapshots/merc;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/grimness;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Ldovishness/marial;", "list", "<init>", "(JLdovishness/marial;)V", "value", "", "dern", "(Landroidx/compose/runtime/snapshots/grimness;)V", "wireman", "()Landroidx/compose/runtime/snapshots/grimness;", "marial", "(J)Landroidx/compose/runtime/snapshots/grimness;", "Ldovishness/marial;", "cutely", "()Ldovishness/marial;", "impassible", "(Ldovishness/marial;)V", "", "I", "apical", "()I", "triweekly", "(I)V", "modification", "formularize", "kowloon", "structuralChange", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class merc<T> extends grimness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public dovishness.marial<? extends T> list;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int structuralChange;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int modification;

    public merc(long j, dovishness.marial<? extends T> marialVar) {
        super(j);
        this.list = marialVar;
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    public final dovishness.marial<T> cutely() {
        return this.list;
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public void dern(grimness value) {
        synchronized (cord.f6180attabal) {
            Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.list = ((merc) value).list;
            this.modification = ((merc) value).modification;
            this.structuralChange = ((merc) value).structuralChange;
            Unit unit = Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getStructuralChange() {
        return this.structuralChange;
    }

    public final void impassible(dovishness.marial<? extends T> marialVar) {
        this.list = marialVar;
    }

    public final void kowloon(int i) {
        this.structuralChange = i;
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public grimness marial(long snapshotId) {
        return new merc(snapshotId, this.list);
    }

    public final void triweekly(int i) {
        this.modification = i;
    }

    @Override // androidx.compose.runtime.snapshots.grimness
    public grimness wireman() {
        return marial(adultoid.grimness().getSnapshotId());
    }
}
