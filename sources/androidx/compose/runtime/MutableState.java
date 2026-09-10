package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.decarock, reason: from toString */
/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/decarock;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/seminary;", "Landroidx/compose/runtime/snapshots/dovishness;", "value", "Landroidx/compose/runtime/tailoring;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/tailoring;)V", "Landroidx/compose/runtime/snapshots/grimness;", "", "impassible", "(Landroidx/compose/runtime/snapshots/grimness;)V", "previous", "current", "applied", "kowloon", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/grimness;)Landroidx/compose/runtime/snapshots/grimness;", "", "toString", "()Ljava/lang/String;", "arytenoidectomy", "Landroidx/compose/runtime/tailoring;", "attabal", "()Landroidx/compose/runtime/tailoring;", "Landroidx/compose/runtime/decarock$attabal;", "monoploid", "Landroidx/compose/runtime/decarock$attabal;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "triweekly", "()Landroidx/compose/runtime/snapshots/grimness;", "firstStateRecord", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MutableState<T> extends androidx.compose.runtime.snapshots.seminary implements androidx.compose.runtime.snapshots.dovishness<T> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final tailoring<T> policy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public attabal<T> next;

    /* JADX INFO: renamed from: androidx.compose.runtime.decarock$attabal */
    /* JADX INFO: compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/decarock$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/grimness;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "myValue", "<init>", "(JLjava/lang/Object;)V", "value", "", "dern", "(Landroidx/compose/runtime/snapshots/grimness;)V", "cutely", "()Landroidx/compose/runtime/decarock$attabal;", "apical", "(J)Landroidx/compose/runtime/decarock$attabal;", "Ljava/lang/Object;", "formularize", "()Ljava/lang/Object;", "impassible", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<T> extends androidx.compose.runtime.snapshots.grimness {
        private T value;

        public attabal(long j, T t) {
            super(j);
            this.value = t;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
        public attabal<T> marial(long snapshotId) {
            return new attabal<>(androidx.compose.runtime.snapshots.adultoid.grimness().getSnapshotId(), this.value);
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public attabal<T> wireman() {
            return new attabal<>(androidx.compose.runtime.snapshots.adultoid.grimness().getSnapshotId(), this.value);
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public void dern(androidx.compose.runtime.snapshots.grimness value) {
            Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((attabal) value).value;
        }

        public final T formularize() {
            return this.value;
        }

        public final void impassible(T t) {
            this.value = t;
        }
    }

    public MutableState(T t, tailoring<T> tailoringVar) {
        this.policy = tailoringVar;
        androidx.compose.runtime.snapshots.formularize formularizeVarGrimness = androidx.compose.runtime.snapshots.adultoid.grimness();
        attabal<T> attabalVar = new attabal<>(formularizeVarGrimness.getSnapshotId(), t);
        if (!(formularizeVarGrimness instanceof androidx.compose.runtime.snapshots.saneness)) {
            attabalVar.impromptu(new attabal(androidx.compose.runtime.snapshots.arytenoidectomy.dern(1), t));
        }
        this.next = attabalVar;
    }

    @Override // androidx.compose.runtime.snapshots.dovishness
    public tailoring<T> attabal() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.czestochowa
    public T getValue() {
        return (T) ((attabal) androidx.compose.runtime.snapshots.adultoid.treadless(this.next, this)).formularize();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public void impassible(androidx.compose.runtime.snapshots.grimness value) {
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (attabal) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.polder
    public androidx.compose.runtime.snapshots.grimness kowloon(androidx.compose.runtime.snapshots.grimness previous, androidx.compose.runtime.snapshots.grimness current, androidx.compose.runtime.snapshots.grimness applied) {
        Intrinsics.competently(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        attabal attabalVar = (attabal) previous;
        Intrinsics.competently(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        attabal attabalVar2 = (attabal) current;
        Intrinsics.competently(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        attabal attabalVar3 = (attabal) applied;
        if (attabal().saneness(attabalVar2.formularize(), attabalVar3.formularize())) {
            return current;
        }
        Object objAttabal = attabal().attabal(attabalVar.formularize(), attabalVar2.formularize(), attabalVar3.formularize());
        if (objAttabal == null) {
            return null;
        }
        attabal attabalVarMarial = attabalVar3.marial(attabalVar3.getSnapshotId());
        attabalVarMarial.impassible(objAttabal);
        return attabalVarMarial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.czestochowa
    public void setValue(T t) {
        androidx.compose.runtime.snapshots.formularize formularizeVarDern;
        attabal attabalVar = (attabal) androidx.compose.runtime.snapshots.adultoid.polder(this.next);
        if (attabal().saneness(attabalVar.formularize(), t)) {
            return;
        }
        attabal<T> attabalVar2 = this.next;
        synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
            formularizeVarDern = androidx.compose.runtime.snapshots.formularize.INSTANCE.dern();
            ((attabal) androidx.compose.runtime.snapshots.adultoid.permissivist(attabalVar2, this, formularizeVarDern, attabalVar)).impassible(t);
            Unit unit = Unit.f29295attabal;
        }
        androidx.compose.runtime.snapshots.adultoid.clubfoot(formularizeVarDern, this);
    }

    public String toString() {
        return "MutableState(value=" + ((attabal) androidx.compose.runtime.snapshots.adultoid.polder(this.next)).formularize() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    /* JADX INFO: renamed from: triweekly */
    public androidx.compose.runtime.snapshots.grimness getFirstStateRecord() {
        return this.next;
    }
}
