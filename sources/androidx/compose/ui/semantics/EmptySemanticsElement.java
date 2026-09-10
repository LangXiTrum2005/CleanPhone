package androidx.compose.ui.semantics;

import androidx.compose.ui.node.kattegat;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/node/kattegat;", "Landroidx/compose/ui/semantics/marial;", "node", "<init>", "(Landroidx/compose/ui/semantics/marial;)V", "graveside", "()Landroidx/compose/ui/semantics/marial;", "", "adultoid", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "saneness", "Landroidx/compose/ui/semantics/marial;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmptySemanticsElement extends kattegat<marial> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final marial node;

    public EmptySemanticsElement(marial marialVar) {
        this.node = marialVar;
    }

    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: graveside, reason: from getter and merged with bridge method [inline-methods] */
    public marial polloi() {
        return this.node;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public void molybdenite(marial node) {
    }
}
