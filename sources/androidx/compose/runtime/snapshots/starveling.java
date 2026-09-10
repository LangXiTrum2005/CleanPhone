package androidx.compose.runtime.snapshots;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104R,\u0010:\u001a\u000601j\u0002`62\n\u00107\u001a\u000601j\u0002`68V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b(\u00109R$\u0010?\u001a\u00020;2\u0006\u00107\u001a\u00020;8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b'\u0010>R4\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010J\u001a\u00020F2\u0006\u00107\u001a\u00020F8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\b.\u0010IR\u0014\u0010M\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Landroidx/compose/runtime/snapshots/starveling;", "Landroidx/compose/runtime/snapshots/wireman;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/wireman;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "wireman", "()V", "Landroidx/compose/runtime/snapshots/impassible;", "trm", "()Landroidx/compose/runtime/snapshots/impassible;", "Landroidx/compose/runtime/snapshots/polder;", "state", "arytenoidectomy", "(Landroidx/compose/runtime/snapshots/polder;)V", "readObserver", "Landroidx/compose/runtime/snapshots/formularize;", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "writeObserver", "hydrovane", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/wireman;", "kowloon", "snapshot", "", "overspeculate", "(Landroidx/compose/runtime/snapshots/formularize;)Ljava/lang/Void;", "clubfoot", "molybdenite", "Landroidx/compose/runtime/snapshots/wireman;", "graveside", "Z", "adultoid", "dovishness", "Lkotlin/jvm/functions/Function1;", "supplicat", "()Lkotlin/jvm/functions/Function1;", "dent", "(Lkotlin/jvm/functions/Function1;)V", "gintrap", "apical", "permissivist", "", "J", "splinterproof", "()J", "threadId", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "taiyuan", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "beachfront", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/saran;", "yemenite", "()Landroidx/collection/saran;", "starveling", "(Landroidx/collection/saran;)V", "modified", "", "cutely", "()I", "(I)V", "writeCount", "impromptu", "()Z", "readOnly", "mathsort", "()Landroidx/compose/runtime/snapshots/wireman;", "currentSnapshot", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class starveling extends wireman {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final boolean ownsParentSnapshot;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final boolean mergeParentObservers;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final wireman parentSnapshot;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final long threadId;

    public starveling(wireman wiremanVar, Function1<Object, Unit> function1, Function1<Object, Unit> function2, boolean z, boolean z2) {
        Function1<Object, Unit> function1Apical;
        Function1<Object, Unit> function1Competently;
        super(adultoid.f6174saneness, SnapshotIdSet.INSTANCE.attabal(), adultoid.creditor(function1, (wiremanVar == null || (function1Competently = wiremanVar.competently()) == null) ? adultoid.f6164apical.competently() : function1Competently, z), adultoid.walach(function2, (wiremanVar == null || (function1Apical = wiremanVar.apical()) == null) ? adultoid.f6164apical.apical() : function1Apical));
        this.parentSnapshot = wiremanVar;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = super.competently();
        this.writeObserver = super.apical();
        this.threadId = cuirassed.monoploid.attabal();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void adultoid(SnapshotIdSet snapshotIdSet) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public Function1<Object, Unit> apical() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void arytenoidectomy(polder state) {
        mathsort().arytenoidectomy(state);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: beachfront */
    public SnapshotIdSet getInvalid() {
        return mathsort().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: clubfoot, reason: merged with bridge method [inline-methods] */
    public Void triweekly(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: cutely */
    public int getWriteCount() {
        return mathsort().getWriteCount();
    }

    public void dent(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void dovishness(long j) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void gintrap(int i) {
        mathsort().gintrap(i);
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public wireman hydrovane(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1Starveling = adultoid.starveling(readObserver, competently(), false, 4, null);
        Function1<Object, Unit> function1Walach = adultoid.walach(writeObserver, apical());
        return !this.mergeParentObservers ? new starveling(mathsort().hydrovane(null, function1Walach), function1Starveling, function1Walach, false, true) : mathsort().hydrovane(function1Starveling, function1Walach);
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public boolean impromptu() {
        return mathsort().impromptu();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
        mathsort().kowloon();
    }

    public final wireman mathsort() {
        wireman wiremanVar = this.parentSnapshot;
        return wiremanVar == null ? adultoid.f6164apical : wiremanVar;
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: overspeculate, reason: merged with bridge method [inline-methods] */
    public Void impassible(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    public void permissivist(Function1<Object, Unit> function1) {
        this.writeObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public formularize rotuma(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1Starveling = adultoid.starveling(readObserver, competently(), false, 4, null);
        return !this.mergeParentObservers ? adultoid.restrictive(mathsort().rotuma(null), function1Starveling, true) : mathsort().rotuma(function1Starveling);
    }

    /* JADX INFO: renamed from: splinterproof, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public void starveling(androidx.collection.saran<polder> saranVar) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: supplicat, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> competently() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: taiyuan */
    public long getSnapshotId() {
        return mathsort().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public impassible trm() {
        return mathsort().trm();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        wireman wiremanVar;
        graveside(true);
        if (!this.ownsParentSnapshot || (wiremanVar = this.parentSnapshot) == null) {
            return;
        }
        wiremanVar.wireman();
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public androidx.collection.saran<polder> yemenite() {
        return mathsort().yemenite();
    }
}
