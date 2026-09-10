package androidx.compose.runtime.snapshots;

import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/taiyuan;", "Landroidx/compose/runtime/snapshots/formularize;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "kowloon", "()V", "wireman", "snapshot", "impassible", "(Landroidx/compose/runtime/snapshots/formularize;)V", "triweekly", "Landroidx/compose/runtime/snapshots/polder;", "state", "arytenoidectomy", "(Landroidx/compose/runtime/snapshots/polder;)V", "competently", "Lkotlin/jvm/functions/Function1;", "cuirassed", "()Lkotlin/jvm/functions/Function1;", "", "impromptu", "I", "snapshots", "", "()Z", "readOnly", "apical", "writeObserver", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class taiyuan extends formularize {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public int snapshots;

    public taiyuan(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public Function1<Object, Unit> apical() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void arytenoidectomy(polder state) {
        adultoid.coffeecake();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: cuirassed, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> competently() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void impassible(formularize snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public boolean impromptu() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public formularize rotuma(Function1<Object, Unit> readObserver) {
        Map<trm.saneness, trm.attabal> second;
        adultoid.sensatory(this);
        dovishness.marial marialVar = trm.wireman.f38993attabal;
        if (marialVar != null) {
            Pair<trm.attabal, Map<trm.saneness, trm.attabal>> pairBeachfront = trm.wireman.beachfront(marialVar, this, true, readObserver, null);
            trm.attabal first = pairBeachfront.getFirst();
            Function1<Object, Unit> function1Attabal = first.attabal();
            first.saneness();
            second = pairBeachfront.getSecond();
            readObserver = function1Attabal;
        } else {
            second = null;
        }
        beachfront beachfrontVar = new beachfront(getSnapshotId(), getInvalid(), adultoid.starveling(readObserver, competently(), false, 4, null), this);
        if (marialVar != null) {
            trm.wireman.dern(marialVar, this, beachfrontVar, second);
        }
        return beachfrontVar;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void triweekly(formularize snapshot) {
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i == 0) {
            saneness();
        }
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        if (getDisposed()) {
            return;
        }
        triweekly(this);
        super.wireman();
        trm.wireman.marial(this);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
    }
}
