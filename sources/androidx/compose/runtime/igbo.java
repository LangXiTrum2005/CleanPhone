package androidx.compose.runtime;

import com.ironsource.C3700q2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/igbo;", "N", "Landroidx/compose/runtime/wireman;", "applier", "", "offset", "<init>", "(Landroidx/compose/runtime/wireman;I)V", "node", "", "beachfront", "(Ljava/lang/Object;)V", "impromptu", "()V", "index", C3700q2.p, "dern", "(ILjava/lang/Object;)V", "marial", "count", "attabal", "(II)V", "from", "to", "saneness", "(III)V", "clear", "Landroidx/compose/runtime/wireman;", "I", "nesting", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class igbo<N> implements wireman<N> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final wireman<N> applier;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int nesting;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int offset;

    public igbo(wireman<N> wiremanVar, int i) {
        this.applier = wiremanVar;
        this.offset = i;
    }

    @Override // androidx.compose.runtime.wireman
    public void attabal(int index, int count) {
        this.applier.attabal(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // androidx.compose.runtime.wireman
    public void beachfront(N node) {
        this.nesting++;
        this.applier.beachfront(node);
    }

    @Override // androidx.compose.runtime.wireman
    public void clear() {
        polloi.adultoid("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.wireman
    public void dern(int index, N instance) {
        this.applier.dern(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.wireman
    public void impromptu() {
        if (!(this.nesting > 0)) {
            polloi.adultoid("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.impromptu();
    }

    @Override // androidx.compose.runtime.wireman
    public void marial(int index, N instance) {
        this.applier.marial(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.wireman
    public void saneness(int from, int to, int count) {
        int i = this.nesting == 0 ? this.offset : 0;
        this.applier.saneness(from + i, to + i, count);
    }
}
