package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.coffeecake;
import androidx.compose.ui.node.itchy;
import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u001d\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/node/itchy;", "Landroidx/compose/ui/draganddrop/wireman;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/saneness;", "Landroidx/compose/ui/draganddrop/beachfront;", "onDragAndDropStart", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "premeiotic", "()V", "startEvent", "", "underbelly", "(Landroidx/compose/ui/draganddrop/saneness;)Z", NotificationCompat.CATEGORY_EVENT, "wireman", "(Landroidx/compose/ui/draganddrop/saneness;)V", "graveside", "marial", "formularize", "cord", "grimness", "stratoscope", "Lkotlin/jvm/functions/Function1;", "", "trm", "Ljava/lang/Object;", "cutely", "()Ljava/lang/Object;", "traverseKey", "oilcan", "Landroidx/compose/ui/draganddrop/wireman;", "lastChildDragAndDropModifierNode", "yemenite", "Landroidx/compose/ui/draganddrop/beachfront;", "thisDragAndDropTarget", "sealless", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DragAndDropNode extends androidx.compose.ui.attabal.dern implements itchy, wireman {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public wireman lastChildDragAndDropModifierNode;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final Function1<saneness, beachfront> onDragAndDropStart;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final Object traverseKey = Companion.C0043attabal.f6387attabal;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public beachfront thisDragAndDropTarget;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final int f6381kattegat = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(Function1<? super saneness, ? extends beachfront> function1) {
        this.onDragAndDropStart = function1;
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public boolean cord(saneness event) {
        wireman wiremanVar = this.lastChildDragAndDropModifierNode;
        if (wiremanVar != null) {
            return wiremanVar.cord(event);
        }
        beachfront beachfrontVar = this.thisDragAndDropTarget;
        if (beachfrontVar != null) {
            return beachfrontVar.cord(event);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.itchy
    /* JADX INFO: renamed from: cutely, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public void formularize(saneness event) {
        beachfront beachfrontVar = this.thisDragAndDropTarget;
        if (beachfrontVar != null) {
            beachfrontVar.formularize(event);
        }
        wireman wiremanVar = this.lastChildDragAndDropModifierNode;
        if (wiremanVar != null) {
            wiremanVar.formularize(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public void graveside(saneness event) {
        beachfront beachfrontVar = this.thisDragAndDropTarget;
        if (beachfrontVar != null) {
            beachfrontVar.graveside(event);
            return;
        }
        wireman wiremanVar = this.lastChildDragAndDropModifierNode;
        if (wiremanVar != null) {
            wiremanVar.graveside(event);
        }
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public void grimness(final saneness event) {
        marial.beachfront(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getNode().getIsAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                beachfront beachfrontVar = dragAndDropNode.thisDragAndDropTarget;
                if (beachfrontVar != null) {
                    beachfrontVar.grimness(event);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public void marial(final saneness event) {
        itchy itchyVar;
        wireman wiremanVar;
        wireman wiremanVar2 = this.lastChildDragAndDropModifierNode;
        if (wiremanVar2 == null || !marial.wireman(wiremanVar2, impromptu.attabal(event))) {
            if (getNode().getIsAttached()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                coffeecake.attabal(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p002kotlin.jvm.functions.Function1
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                        DragAndDropNode dragAndDropNode2 = dragAndDropNode;
                        if (!androidx.compose.ui.node.beachfront.taiyuan(this).getDragAndDropManager().attabal(dragAndDropNode2) || !marial.wireman(dragAndDropNode2, impromptu.attabal(event))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        ref$ObjectRef.element = dragAndDropNode;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                itchyVar = (itchy) ref$ObjectRef.element;
            } else {
                itchyVar = null;
            }
            wiremanVar = (wireman) itchyVar;
        } else {
            wiremanVar = wiremanVar2;
        }
        if (wiremanVar != null && wiremanVar2 == null) {
            marial.marial(wiremanVar, event);
            beachfront beachfrontVar = this.thisDragAndDropTarget;
            if (beachfrontVar != null) {
                beachfrontVar.formularize(event);
            }
        } else if (wiremanVar == null && wiremanVar2 != null) {
            beachfront beachfrontVar2 = this.thisDragAndDropTarget;
            if (beachfrontVar2 != null) {
                marial.marial(beachfrontVar2, event);
            }
            wiremanVar2.formularize(event);
        } else if (!Intrinsics.wireman(wiremanVar, wiremanVar2)) {
            if (wiremanVar != null) {
                marial.marial(wiremanVar, event);
            }
            if (wiremanVar2 != null) {
                wiremanVar2.formularize(event);
            }
        } else if (wiremanVar != null) {
            wiremanVar.marial(event);
        } else {
            beachfront beachfrontVar3 = this.thisDragAndDropTarget;
            if (beachfrontVar3 != null) {
                beachfrontVar3.marial(event);
            }
        }
        this.lastChildDragAndDropModifierNode = wiremanVar;
    }

    @Override // androidx.compose.ui.attabal.dern
    public void premeiotic() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    public boolean underbelly(final saneness startEvent) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        marial.beachfront(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getIsAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                if (!(dragAndDropNode.thisDragAndDropTarget == null)) {
                    peridotite.attabal.saneness("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                dragAndDropNode.thisDragAndDropTarget = (beachfront) dragAndDropNode.onDragAndDropStart.invoke(startEvent);
                boolean z = dragAndDropNode.thisDragAndDropTarget != null;
                if (z) {
                    androidx.compose.ui.node.beachfront.taiyuan(this).getDragAndDropManager().saneness(dragAndDropNode);
                }
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                ref$BooleanRef2.element = ref$BooleanRef2.element || z;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
        });
        return ref$BooleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.beachfront
    public void wireman(saneness event) {
        beachfront beachfrontVar = this.thisDragAndDropTarget;
        if (beachfrontVar != null) {
            beachfrontVar.wireman(event);
            return;
        }
        wireman wiremanVar = this.lastChildDragAndDropModifierNode;
        if (wiremanVar != null) {
            wiremanVar.wireman(event);
        }
    }
}
