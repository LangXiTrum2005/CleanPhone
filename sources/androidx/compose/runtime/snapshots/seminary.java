package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/seminary;", "Landroidx/compose/runtime/snapshots/polder;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/impromptu;", "reader", "", "adultoid", "(I)V", "", "graveside", "(I)Z", "Landroidx/compose/runtime/internal/AtomicInt;", "kowloon", "Landroidx/compose/runtime/internal/AtomicInt;", "readerKind", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class seminary implements polder {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final AtomicInt readerKind = new AtomicInt(0);

    public final void adultoid(int reader) {
        int iAttabal;
        do {
            iAttabal = impromptu.attabal(this.readerKind.get());
            if ((iAttabal & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iAttabal, impromptu.attabal(iAttabal | reader)));
    }

    public final boolean graveside(int reader) {
        return (reader & impromptu.attabal(this.readerKind.get())) != 0;
    }
}
