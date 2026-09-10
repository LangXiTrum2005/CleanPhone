package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.sultanate, reason: from toString */
/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u001b\"\u0004\b\u001c\u0010\u0007R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/runtime/sultanate;", "Landroidx/compose/runtime/snapshots/seminary;", "Landroidx/compose/runtime/lotta;", "Landroidx/compose/runtime/snapshots/dovishness;", "", "value", "<init>", "(D)V", "Landroidx/compose/runtime/snapshots/grimness;", "", "impassible", "(Landroidx/compose/runtime/snapshots/grimness;)V", "previous", "current", "applied", "kowloon", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/grimness;)Landroidx/compose/runtime/snapshots/grimness;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/sultanate$attabal;", "arytenoidectomy", "Landroidx/compose/runtime/sultanate$attabal;", "next", "triweekly", "()Landroidx/compose/runtime/snapshots/grimness;", "firstStateRecord", "()D", "cutely", "doubleValue", "Landroidx/compose/runtime/tailoring;", "attabal", "()Landroidx/compose/runtime/tailoring;", "policy", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MutableDoubleState extends androidx.compose.runtime.snapshots.seminary implements lotta, androidx.compose.runtime.snapshots.dovishness<Double> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public attabal next;

    /* JADX INFO: renamed from: androidx.compose.runtime.sultanate$attabal */
    /* JADX INFO: compiled from: SnapshotDoubleState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/sultanate$attabal;", "Landroidx/compose/runtime/snapshots/grimness;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JD)V", "", "dern", "(Landroidx/compose/runtime/snapshots/grimness;)V", "wireman", "()Landroidx/compose/runtime/snapshots/grimness;", "marial", "(J)Landroidx/compose/runtime/snapshots/grimness;", "D", "cutely", "()D", "apical", "(D)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends androidx.compose.runtime.snapshots.grimness {
        private double value;

        public attabal(long j, double d) {
            super(j);
            this.value = d;
        }

        public final void apical(double d) {
            this.value = d;
        }

        /* JADX INFO: renamed from: cutely, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public void dern(androidx.compose.runtime.snapshots.grimness value) {
            Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((attabal) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public androidx.compose.runtime.snapshots.grimness marial(long snapshotId) {
            return new attabal(snapshotId, this.value);
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public androidx.compose.runtime.snapshots.grimness wireman() {
            return marial(getSnapshotId());
        }
    }

    public MutableDoubleState(double d) {
        androidx.compose.runtime.snapshots.formularize formularizeVarGrimness = androidx.compose.runtime.snapshots.adultoid.grimness();
        attabal attabalVar = new attabal(formularizeVarGrimness.getSnapshotId(), d);
        if (!(formularizeVarGrimness instanceof androidx.compose.runtime.snapshots.saneness)) {
            attabalVar.impromptu(new attabal(androidx.compose.runtime.snapshots.arytenoidectomy.dern(1), d));
        }
        this.next = attabalVar;
    }

    @Override // androidx.compose.runtime.lotta
    public double arytenoidectomy() {
        return ((attabal) androidx.compose.runtime.snapshots.adultoid.treadless(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.dovishness
    public tailoring<Double> attabal() {
        return liable.competently();
    }

    @Override // androidx.compose.runtime.lotta
    public void cutely(double d) {
        androidx.compose.runtime.snapshots.formularize formularizeVarDern;
        attabal attabalVar = (attabal) androidx.compose.runtime.snapshots.adultoid.polder(this.next);
        if (attabalVar.getValue() == d) {
            return;
        }
        attabal attabalVar2 = this.next;
        synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
            formularizeVarDern = androidx.compose.runtime.snapshots.formularize.INSTANCE.dern();
            ((attabal) androidx.compose.runtime.snapshots.adultoid.permissivist(attabalVar2, this, formularizeVarDern, attabalVar)).apical(d);
            Unit unit = Unit.f29295attabal;
        }
        androidx.compose.runtime.snapshots.adultoid.clubfoot(formularizeVarDern, this);
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public void impassible(androidx.compose.runtime.snapshots.grimness value) {
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (attabal) value;
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public androidx.compose.runtime.snapshots.grimness kowloon(androidx.compose.runtime.snapshots.grimness previous, androidx.compose.runtime.snapshots.grimness current, androidx.compose.runtime.snapshots.grimness applied) {
        Intrinsics.competently(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.competently(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((attabal) current).getValue() == ((attabal) applied).getValue()) {
            return current;
        }
        return null;
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((attabal) androidx.compose.runtime.snapshots.adultoid.polder(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public androidx.compose.runtime.snapshots.grimness triweekly() {
        return this.next;
    }
}
