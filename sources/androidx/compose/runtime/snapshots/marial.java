package androidx.compose.runtime.snapshots;

import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/marial;", "Landroidx/compose/runtime/snapshots/wireman;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/wireman;)V", "wireman", "()V", "Landroidx/compose/runtime/snapshots/impassible;", "trm", "()Landroidx/compose/runtime/snapshots/impassible;", "mathsort", "molybdenite", "Landroidx/compose/runtime/snapshots/wireman;", "getParent", "()Landroidx/compose/runtime/snapshots/wireman;", "", "graveside", "Z", "deactivated", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial extends wireman {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean deactivated;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final wireman parent;

    public marial(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2, wireman wiremanVar) {
        super(j, snapshotIdSet, function1, function2);
        this.parent = wiremanVar;
        wiremanVar.impassible(this);
    }

    public final void mathsort() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.triweekly(this);
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public impassible trm() throws Throwable {
        marial marialVar;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new impassible.attabal(this);
        }
        androidx.collection.saran<polder> saranVarYemenite = yemenite();
        long snapshotId = getSnapshotId();
        Map<grimness, ? extends grimness> mapDent = saranVarYemenite != null ? adultoid.dent(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (adultoid.privatdozent()) {
            try {
                adultoid.sensatory(this);
                try {
                    if (saranVarYemenite == null || saranVarYemenite.get_size() == 0) {
                        marialVar = this;
                        saneness();
                        Unit unit = Unit.f29295attabal;
                    } else {
                        marialVar = this;
                        impassible impassibleVarMerc = marialVar.merc(this.parent.getSnapshotId(), saranVarYemenite, mapDent, this.parent.getInvalid());
                        if (!Intrinsics.wireman(impassibleVarMerc, impassible.saneness.f6207attabal)) {
                            return impassibleVarMerc;
                        }
                        androidx.collection.saran<polder> saranVarYemenite2 = marialVar.parent.yemenite();
                        if (saranVarYemenite2 != null) {
                            saranVarYemenite2.taiyuan(saranVarYemenite);
                        } else {
                            marialVar.parent.starveling(saranVarYemenite);
                            starveling(null);
                        }
                    }
                    if (Intrinsics.cutely(marialVar.parent.getSnapshotId(), snapshotId) < 0) {
                        marialVar.parent.stratoscope();
                    }
                    wireman wiremanVar = marialVar.parent;
                    wiremanVar.adultoid(wiremanVar.getInvalid().taiyuan(snapshotId).impromptu(getPreviousIds()));
                    marialVar.parent.polder(snapshotId);
                    marialVar.parent.grimness(preprohormone());
                    marialVar.parent.seminary(getPreviousIds());
                    marialVar.parent.saran(getPreviousPinnedSnapshots());
                    Unit unit2 = Unit.f29295attabal;
                    creditor(true);
                    mathsort();
                    trm.wireman.wireman(this, saranVarYemenite);
                    return impassible.saneness.f6207attabal;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        if (getDisposed()) {
            return;
        }
        super.wireman();
        mathsort();
    }
}
