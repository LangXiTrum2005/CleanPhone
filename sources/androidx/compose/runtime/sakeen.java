package androidx.compose.runtime;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/sakeen;", "Landroidx/compose/runtime/puffin;", "parent", "", "index", "<init>", "(Landroidx/compose/runtime/puffin;I)V", "attabal", "Landroidx/compose/runtime/puffin;", "getParent", "()Landroidx/compose/runtime/puffin;", "saneness", "I", "getIndex", "()I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class sakeen extends puffin {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final puffin parent;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int index;

    public sakeen(puffin puffinVar, int i) {
        super(null);
        this.parent = puffinVar;
        this.index = i;
    }
}
