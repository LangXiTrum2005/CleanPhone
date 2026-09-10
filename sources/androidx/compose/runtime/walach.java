package androidx.compose.runtime;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/walach;", "", "", "slotIndex", "nodeIndex", "nodeCount", "<init>", "(III)V", "attabal", "I", "dern", "()I", "beachfront", "(I)V", "saneness", "marial", "wireman", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class walach {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int slotIndex;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int nodeCount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int nodeIndex;

    public walach(int i, int i2, int i3) {
        this.slotIndex = i;
        this.nodeIndex = i2;
        this.nodeCount = i3;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final void beachfront(int i) {
        this.slotIndex = i;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void marial(int i) {
        this.nodeIndex = i;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final void wireman(int i) {
        this.nodeCount = i;
    }
}
