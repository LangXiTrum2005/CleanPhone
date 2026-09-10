package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/dern;", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/competently;", "Lsupplicat/impassible;", "Lkotlin/Function1;", "Lmerc/beachfront;", "", "", "startDrag", "<init>", "(Ltetrahedral/triweekly;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/DragEvent;", NotificationCompat.CATEGORY_EVENT, "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Landroidx/compose/ui/draganddrop/wireman;", "node", "saneness", "(Landroidx/compose/ui/draganddrop/wireman;)V", "attabal", "(Landroidx/compose/ui/draganddrop/wireman;)Z", "Ltetrahedral/triweekly;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "rootDragAndDropNode", "Landroidx/collection/saneness;", "dern", "Landroidx/collection/saneness;", "interestedNodes", "Landroidx/compose/ui/attabal;", "wireman", "Landroidx/compose/ui/attabal;", "()Landroidx/compose/ui/attabal;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, androidx.compose.ui.draganddrop.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final tetrahedral.triweekly<androidx.compose.ui.draganddrop.competently, supplicat.impassible, Function1<? super merc.beachfront, Unit>, Boolean> startDrag;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(new Function1<androidx.compose.ui.draganddrop.saneness, androidx.compose.ui.draganddrop.beachfront>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // p002kotlin.jvm.functions.Function1
        public final androidx.compose.ui.draganddrop.beachfront invoke(androidx.compose.ui.draganddrop.saneness sanenessVar) {
            return null;
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.saneness<androidx.compose.ui.draganddrop.wireman> interestedNodes = new androidx.collection.saneness<>(0, 1, null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal modifier = new androidx.compose.ui.node.kattegat<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.kattegat
        /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
        public DragAndDropNode polloi() {
            return this.f7306saneness.rootDragAndDropNode;
        }

        public int hashCode() {
            return this.f7306saneness.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.kattegat
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public void molybdenite(DragAndDropNode node) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(tetrahedral.triweekly<? super androidx.compose.ui.draganddrop.competently, ? super supplicat.impassible, ? super Function1<? super merc.beachfront, Unit>, Boolean> triweeklyVar) {
        this.startDrag = triweeklyVar;
    }

    @Override // androidx.compose.ui.draganddrop.dern
    public boolean attabal(androidx.compose.ui.draganddrop.wireman node) {
        return this.interestedNodes.contains(node);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        androidx.compose.ui.draganddrop.saneness sanenessVar = new androidx.compose.ui.draganddrop.saneness(event);
        switch (event.getAction()) {
            case 1:
                boolean zUnderbelly = this.rootDragAndDropNode.underbelly(sanenessVar);
                Iterator<androidx.compose.ui.draganddrop.wireman> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().wireman(sanenessVar);
                }
                return zUnderbelly;
            case 2:
                this.rootDragAndDropNode.marial(sanenessVar);
                return false;
            case 3:
                return this.rootDragAndDropNode.cord(sanenessVar);
            case 4:
                this.rootDragAndDropNode.grimness(sanenessVar);
                return false;
            case 5:
                this.rootDragAndDropNode.graveside(sanenessVar);
                return false;
            case 6:
                this.rootDragAndDropNode.formularize(sanenessVar);
                return false;
            default:
                return false;
        }
    }

    @Override // androidx.compose.ui.draganddrop.dern
    public void saneness(androidx.compose.ui.draganddrop.wireman node) {
        this.interestedNodes.add(node);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public androidx.compose.ui.attabal getModifier() {
        return this.modifier;
    }
}
