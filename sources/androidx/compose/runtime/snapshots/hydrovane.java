package androidx.compose.runtime.snapshots;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u00100R,\u00106\u001a\u00060(j\u0002`22\n\u00103\u001a\u00060(j\u0002`28V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010,\"\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u00103\u001a\u0002078P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010=R\u0014\u0010@\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u00100¨\u0006A"}, d2 = {"Landroidx/compose/runtime/snapshots/hydrovane;", "Landroidx/compose/runtime/snapshots/formularize;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/formularize;Lkotlin/jvm/functions/Function1;ZZ)V", "wireman", "()V", "Landroidx/compose/runtime/snapshots/polder;", "state", "arytenoidectomy", "(Landroidx/compose/runtime/snapshots/polder;)V", "readObserver", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "kowloon", "snapshot", "", "oilcan", "(Landroidx/compose/runtime/snapshots/formularize;)Ljava/lang/Void;", "yemenite", "competently", "Landroidx/compose/runtime/snapshots/formularize;", "impromptu", "Z", "taiyuan", "cutely", "Lkotlin/jvm/functions/Function1;", "stratoscope", "()Lkotlin/jvm/functions/Function1;", "sealless", "(Lkotlin/jvm/functions/Function1;)V", "apical", "writeObserver", "", "formularize", "J", "trm", "()J", "threadId", "impassible", "getRoot", "()Landroidx/compose/runtime/snapshots/formularize;", "root", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "setSnapshotId$runtime", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "beachfront", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "()Z", "readOnly", "cuirassed", "currentSnapshot", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hydrovane extends formularize {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final formularize parentSnapshot;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final long threadId;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final formularize root;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final boolean mergeParentObservers;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final boolean ownsParentSnapshot;

    public hydrovane(formularize formularizeVar, Function1<Object, Unit> function1, boolean z, boolean z2) {
        Function1<Object, Unit> function1Competently;
        super(adultoid.f6174saneness, SnapshotIdSet.INSTANCE.attabal(), null);
        this.parentSnapshot = formularizeVar;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = adultoid.creditor(function1, (formularizeVar == null || (function1Competently = formularizeVar.competently()) == null) ? adultoid.f6164apical.competently() : function1Competently, z);
        this.threadId = cuirassed.monoploid.attabal();
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public Function1<Object, Unit> apical() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void arytenoidectomy(polder state) {
        cuirassed().arytenoidectomy(state);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: beachfront */
    public SnapshotIdSet getInvalid() {
        return cuirassed().getInvalid();
    }

    public final formularize cuirassed() {
        formularize formularizeVar = this.parentSnapshot;
        return formularizeVar == null ? adultoid.f6164apical : formularizeVar;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public boolean impromptu() {
        return cuirassed().impromptu();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
        cuirassed().kowloon();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: oilcan, reason: merged with bridge method [inline-methods] */
    public Void impassible(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public formularize rotuma(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1Starveling = adultoid.starveling(readObserver, competently(), false, 4, null);
        return !this.mergeParentObservers ? adultoid.restrictive(cuirassed().rotuma(null), function1Starveling, true) : cuirassed().rotuma(function1Starveling);
    }

    public void sealless(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: stratoscope, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> competently() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: taiyuan */
    public long getSnapshotId() {
        return cuirassed().getSnapshotId();
    }

    /* JADX INFO: renamed from: trm, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        formularize formularizeVar;
        graveside(true);
        if (!this.ownsParentSnapshot || (formularizeVar = this.parentSnapshot) == null) {
            return;
        }
        formularizeVar.wireman();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: yemenite, reason: merged with bridge method [inline-methods] */
    public Void triweekly(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }
}
