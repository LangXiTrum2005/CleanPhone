package adultoid;

import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.immediately;
import androidx.compose.runtime.polloi;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FixupList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Ladultoid/dern;", "Ladultoid/cutely;", "<init>", "()V", "", "wireman", "()Z", "", "attabal", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/compose/runtime/cig;", "slots", "Landroidx/compose/runtime/immediately;", "rememberManager", "Ladultoid/beachfront;", "errorContext", "dern", "(Landroidx/compose/runtime/wireman;Landroidx/compose/runtime/cig;Landroidx/compose/runtime/immediately;Ladultoid/beachfront;)V", "saneness", "Ladultoid/taiyuan;", "Ladultoid/taiyuan;", "operations", "pendingOperations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern extends cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final taiyuan operations = new taiyuan();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final taiyuan pendingOperations = new taiyuan();

    public final void attabal() {
        this.pendingOperations.attabal();
        this.operations.attabal();
    }

    public final void dern(androidx.compose.runtime.wireman<?> applier, SlotWriter slots, immediately rememberManager, beachfront errorContext) throws Throwable {
        if (!this.pendingOperations.beachfront()) {
            polloi.adultoid("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.wireman(applier, slots, rememberManager, errorContext);
    }

    public final void saneness() {
        if (!this.pendingOperations.competently()) {
            polloi.adultoid("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.impromptu(this.operations);
    }

    public final boolean wireman() {
        return this.operations.beachfront();
    }
}
