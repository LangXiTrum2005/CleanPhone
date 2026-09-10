package starveling;

import androidx.collection.seminary;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lstarveling/apical;", "", "<init>", "()V", "Landroidx/collection/gintrap;", "Lstarveling/adultoid;", "changes", "Landroidx/compose/ui/layout/competently;", "parentCoordinates", "Lstarveling/marial;", "internalPointerEvent", "", "isInBounds", "attabal", "(Landroidx/collection/gintrap;Landroidx/compose/ui/layout/competently;Lstarveling/marial;Z)Z", "beachfront", "marial", "(Lstarveling/marial;)Z", "", "wireman", "dern", "", "pointerIdValue", "Landroidx/collection/seminary;", "Lstarveling/cutely;", "hitNodes", "taiyuan", "(JLandroidx/collection/seminary;)V", "impromptu", "saneness", "(Lstarveling/marial;)V", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "competently", "()Landroidx/compose/runtime/collection/dern;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class apical {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f38075saneness = androidx.compose.runtime.collection.dern.f5875polloi;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Node> children = new androidx.compose.runtime.collection.dern<>(new Node[16], 0);

    public boolean attabal(androidx.collection.gintrap<PointerInputChange> changes, androidx.compose.ui.layout.competently parentCoordinates, marial internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.dern<Node> dernVar = this.children;
        int size = dernVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] cutelyVarArrApical = dernVar.apical();
        int i = 0;
        boolean z = false;
        do {
            z = cutelyVarArrApical[i].attabal(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i++;
        } while (i < size);
        return z;
    }

    public boolean beachfront(androidx.collection.gintrap<PointerInputChange> changes, androidx.compose.ui.layout.competently parentCoordinates, marial internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.dern<Node> dernVar = this.children;
        int size = dernVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] cutelyVarArrApical = dernVar.apical();
        int i = 0;
        boolean z = false;
        do {
            z = cutelyVarArrApical[i].beachfront(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i++;
        } while (i < size);
        return z;
    }

    public final androidx.compose.runtime.collection.dern<Node> competently() {
        return this.children;
    }

    public final void dern() {
        this.children.impromptu();
    }

    public final void impromptu() {
        int i = 0;
        while (i < this.children.getSize()) {
            Node cutelyVar = this.children.apical()[i];
            if (cutelyVar.getPointerInputFilter().getIsAttached()) {
                i++;
                cutelyVar.impromptu();
            } else {
                cutelyVar.wireman();
                this.children.molybdenite(i);
            }
        }
    }

    public boolean marial(marial internalPointerEvent) {
        androidx.compose.runtime.collection.dern<Node> dernVar = this.children;
        int size = dernVar.getSize();
        boolean z = false;
        if (size > 0) {
            Node[] cutelyVarArrApical = dernVar.apical();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = cutelyVarArrApical[i].marial(internalPointerEvent) || z2;
                i++;
            } while (i < size);
            z = z2;
        }
        saneness(internalPointerEvent);
        return z;
    }

    public void saneness(marial internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.apical()[size].getPointerIds().competently()) {
                this.children.molybdenite(size);
            }
        }
    }

    public void taiyuan(long pointerIdValue, seminary<Node> hitNodes) {
        androidx.compose.runtime.collection.dern<Node> dernVar = this.children;
        int size = dernVar.getSize();
        if (size > 0) {
            Node[] cutelyVarArrApical = dernVar.apical();
            int i = 0;
            do {
                cutelyVarArrApical[i].taiyuan(pointerIdValue, hitNodes);
                i++;
            } while (i < size);
        }
    }

    public void wireman() {
        androidx.compose.runtime.collection.dern<Node> dernVar = this.children;
        int size = dernVar.getSize();
        if (size > 0) {
            Node[] cutelyVarArrApical = dernVar.apical();
            int i = 0;
            do {
                cutelyVarArrApical[i].wireman();
                i++;
            } while (i < size);
        }
    }
}
