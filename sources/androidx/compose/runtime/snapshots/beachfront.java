package androidx.compose.runtime.snapshots;

import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001aR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/beachfront;", "Landroidx/compose/runtime/snapshots/formularize;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/formularize;)V", "sealless", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/beachfront;", "kowloon", "()V", "wireman", "Landroidx/compose/runtime/snapshots/polder;", "state", "", "yemenite", "(Landroidx/compose/runtime/snapshots/polder;)Ljava/lang/Void;", "snapshot", "oilcan", "(Landroidx/compose/runtime/snapshots/formularize;)Ljava/lang/Void;", "trm", "competently", "Lkotlin/jvm/functions/Function1;", "stratoscope", "()Lkotlin/jvm/functions/Function1;", "impromptu", "Landroidx/compose/runtime/snapshots/formularize;", "cuirassed", "()Landroidx/compose/runtime/snapshots/formularize;", "", "()Z", "readOnly", "apical", "writeObserver", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class beachfront extends formularize {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final formularize parent;

    public beachfront(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, formularize formularizeVar) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.parent = formularizeVar;
        formularizeVar.impassible(this);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public Function1<Object, Unit> apical() {
        return null;
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public final formularize getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public boolean impromptu() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: oilcan, reason: merged with bridge method [inline-methods] */
    public Void triweekly(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
    public beachfront rotuma(Function1<Object, Unit> readObserver) {
        Map<trm.saneness, trm.attabal> second;
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
        beachfront beachfrontVar = new beachfront(getSnapshotId(), getInvalid(), adultoid.starveling(readObserver, competently(), false, 4, null), getParent());
        if (marialVar != null) {
            trm.wireman.dern(marialVar, this, beachfrontVar, second);
        }
        return beachfrontVar;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: stratoscope, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> competently() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: trm, reason: merged with bridge method [inline-methods] */
    public Void impassible(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        if (getDisposed()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            saneness();
        }
        this.parent.triweekly(this);
        super.wireman();
        trm.wireman.marial(this);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: yemenite, reason: merged with bridge method [inline-methods] */
    public Void arytenoidectomy(polder state) {
        adultoid.coffeecake();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
    }
}
