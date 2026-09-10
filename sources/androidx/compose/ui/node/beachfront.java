package androidx.compose.ui.node;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\t*\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000e\u001a\u00020\r*\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0001H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/attabal$dern;", "node", "", "dern", "(Landroidx/compose/runtime/collection/dern;Landroidx/compose/ui/attabal$dern;)V", "Landroidx/compose/ui/node/marial;", "Landroidx/compose/ui/node/saran;", "type", "", "marial", "(Landroidx/compose/ui/node/marial;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "competently", "(Landroidx/compose/ui/node/marial;I)Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "impromptu", "(Landroidx/compose/ui/node/marial;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/peridotite;", "taiyuan", "(Landroidx/compose/ui/node/marial;)Landroidx/compose/ui/node/peridotite;", "Landroidx/compose/ui/node/graveside;", "wireman", "(Landroidx/compose/ui/attabal$dern;)Landroidx/compose/ui/node/graveside;", "beachfront", "(Landroidx/compose/runtime/collection/dern;)Landroidx/compose/ui/attabal$dern;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class beachfront {
    public static final androidx.compose.ui.attabal.dern beachfront(androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.dern> dernVar) {
        if (dernVar == null || dernVar.triweekly()) {
            return null;
        }
        return dernVar.molybdenite(dernVar.getSize() - 1);
    }

    public static final NodeCoordinator competently(marial marialVar, int i) {
        NodeCoordinator coordinator = marialVar.getNode().getCoordinator();
        Intrinsics.beachfront(coordinator);
        if (coordinator.puffin() != marialVar || !privatdozent.taiyuan(i)) {
            return coordinator;
        }
        NodeCoordinator nodeCoordinatorCtenidium = coordinator.getWrapped();
        Intrinsics.beachfront(nodeCoordinatorCtenidium);
        return nodeCoordinatorCtenidium;
    }

    public static final void dern(androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.dern> dernVar, androidx.compose.ui.attabal.dern dernVar2) {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = impromptu(dernVar2).coffeecake();
        int iFormularize = dernVarCoffeecake.getSize();
        if (iFormularize > 0) {
            int i = iFormularize - 1;
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            do {
                dernVar.saneness(layoutNodeArrApical[i].getNodes().getHead());
                i--;
            } while (i >= 0);
        }
    }

    public static final LayoutNode impromptu(marial marialVar) {
        NodeCoordinator coordinator = marialVar.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        peridotite.attabal.dern("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final boolean marial(marial marialVar, int i) {
        return (marialVar.getNode().getAggregateChildKindSet() & i) != 0;
    }

    public static final peridotite taiyuan(marial marialVar) {
        peridotite peridotiteVarDent = impromptu(marialVar).getOwner();
        if (peridotiteVarDent != null) {
            return peridotiteVarDent;
        }
        peridotite.attabal.dern("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final graveside wireman(androidx.compose.ui.attabal.dern dernVar) {
        if ((saran.attabal(2) & dernVar.getKindSet()) != 0) {
            if (dernVar instanceof graveside) {
                return (graveside) dernVar;
            }
            if (dernVar instanceof competently) {
                androidx.compose.ui.attabal.dern dernVarUnderbelly = ((competently) dernVar).getDelegate();
                while (dernVarUnderbelly != 0) {
                    if (dernVarUnderbelly instanceof graveside) {
                        return (graveside) dernVarUnderbelly;
                    }
                    dernVarUnderbelly = (!(dernVarUnderbelly instanceof competently) || (saran.attabal(2) & dernVarUnderbelly.getKindSet()) == 0) ? dernVarUnderbelly.getChild() : ((competently) dernVarUnderbelly).getDelegate();
                }
            }
        }
        return null;
    }
}
