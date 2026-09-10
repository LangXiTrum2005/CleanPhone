package androidx.compose.runtime;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/saneness;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/cosy;", "slots", "wireman", "(Landroidx/compose/runtime/cosy;)I", "Landroidx/compose/runtime/cig;", "writer", "marial", "(Landroidx/compose/runtime/cig;)I", "", "toString", "()Ljava/lang/String;", "attabal", "I", "()I", "dern", "location", "", "saneness", "()Z", "valid", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int location;

    public saneness(int i) {
        this.location = i;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final void dern(int i) {
        this.location = i;
    }

    public final int marial(SlotWriter writer) {
        return writer.trm(this);
    }

    public final boolean saneness() {
        return this.location != Integer.MIN_VALUE;
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }

    public final int wireman(cosy slots) {
        return slots.wireman(this);
    }
}
