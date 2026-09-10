package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/attabal$saneness;", "element", "", "beachfront", "(Landroidx/compose/ui/attabal$saneness;)I", "Landroidx/compose/ui/attabal$dern;", "node", "competently", "(Landroidx/compose/ui/attabal$dern;)I", "", "wireman", "(Landroidx/compose/ui/attabal$dern;)V", "attabal", "marial", "remainingSet", "phase", "saneness", "(Landroidx/compose/ui/attabal$dern;II)V", "selfKindSet", "dern", "Landroidx/compose/ui/focus/impassible;", "cutely", "(Landroidx/compose/ui/focus/impassible;)V", "", "apical", "(Landroidx/compose/ui/focus/impassible;)Z", "impromptu", "Landroidx/collection/polder;", "", "Landroidx/collection/polder;", "classToKindSetMap", "Landroidx/compose/ui/node/saran;", "taiyuan", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final androidx.collection.polder<Object> f7030attabal = androidx.collection.starveling.saneness();

    public static final boolean apical(androidx.compose.ui.focus.impassible impassibleVar) {
        saneness sanenessVar = saneness.f7034attabal;
        sanenessVar.saneness();
        impassibleVar.yemenite(sanenessVar);
        return sanenessVar.attabal();
    }

    public static final void attabal(androidx.compose.ui.attabal.dern dernVar) {
        if (!dernVar.getIsAttached()) {
            peridotite.attabal.saneness("autoInvalidateInsertedNode called on unattached node");
        }
        saneness(dernVar, -1, 1);
    }

    public static final int beachfront(androidx.compose.ui.attabal.saneness sanenessVar) {
        int iAttabal = saran.attabal(1);
        if (sanenessVar instanceof androidx.compose.ui.layout.cutely) {
            iAttabal |= saran.attabal(2);
        }
        if (sanenessVar instanceof kattegat.wireman) {
            iAttabal |= saran.attabal(4);
        }
        if (sanenessVar instanceof androidx.compose.ui.semantics.formularize) {
            iAttabal |= saran.attabal(8);
        }
        if (sanenessVar instanceof starveling.stratoscope) {
            iAttabal |= saran.attabal(16);
        }
        if ((sanenessVar instanceof androidx.compose.ui.modifier.wireman) || (sanenessVar instanceof androidx.compose.ui.modifier.taiyuan)) {
            iAttabal |= saran.attabal(32);
        }
        if (sanenessVar instanceof androidx.compose.ui.focus.dern) {
            iAttabal |= saran.attabal(4096);
        }
        if (sanenessVar instanceof androidx.compose.ui.focus.cutely) {
            iAttabal |= saran.attabal(2048);
        }
        if (sanenessVar instanceof androidx.compose.ui.layout.polloi) {
            iAttabal |= saran.attabal(256);
        }
        if (sanenessVar instanceof androidx.compose.ui.layout.dovishness) {
            iAttabal |= saran.attabal(64);
        }
        return ((sanenessVar instanceof androidx.compose.ui.layout.molybdenite) || (sanenessVar instanceof androidx.compose.ui.layout.graveside)) ? saran.attabal(128) | iAttabal : iAttabal;
    }

    public static final int competently(androidx.compose.ui.attabal.dern dernVar) {
        if (dernVar.getKindSet() != 0) {
            return dernVar.getKindSet();
        }
        androidx.collection.polder<Object> polderVar = f7030attabal;
        Object objSaneness = yemenite.attabal.saneness(dernVar);
        int iDern = polderVar.dern(objSaneness);
        if (iDern >= 0) {
            return polderVar.values[iDern];
        }
        int iAttabal = saran.attabal(1);
        if (dernVar instanceof graveside) {
            iAttabal |= saran.attabal(2);
        }
        if (dernVar instanceof apical) {
            iAttabal |= saran.attabal(4);
        }
        if (dernVar instanceof premeiotic) {
            iAttabal |= saran.attabal(8);
        }
        if (dernVar instanceof dent) {
            iAttabal |= saran.attabal(16);
        }
        if (dernVar instanceof androidx.compose.ui.modifier.competently) {
            iAttabal |= saran.attabal(32);
        }
        if (dernVar instanceof splinterproof) {
            iAttabal |= saran.attabal(64);
        }
        if (dernVar instanceof molybdenite) {
            iAttabal |= saran.attabal(128);
        }
        if (dernVar instanceof impassible) {
            iAttabal |= saran.attabal(256);
        }
        if (dernVar instanceof ApproachLayoutModifierNode) {
            iAttabal |= saran.attabal(512);
        }
        if (dernVar instanceof FocusTargetNode) {
            iAttabal |= saran.attabal(1024);
        }
        if (dernVar instanceof androidx.compose.ui.focus.impassible) {
            iAttabal |= saran.attabal(2048);
        }
        if (dernVar instanceof androidx.compose.ui.focus.wireman) {
            iAttabal |= saran.attabal(4096);
        }
        if (dernVar instanceof privatdozent.marial) {
            iAttabal |= saran.attabal(8192);
        }
        if (dernVar instanceof walach.attabal) {
            iAttabal |= saran.attabal(16384);
        }
        if (dernVar instanceof wireman) {
            iAttabal |= saran.attabal(32768);
        }
        if (dernVar instanceof privatdozent.impromptu) {
            iAttabal |= saran.attabal(131072);
        }
        if (dernVar instanceof itchy) {
            iAttabal |= saran.attabal(Opcodes.ASM4);
        }
        polderVar.graveside(objSaneness, iAttabal);
        return iAttabal;
    }

    public static final void cutely(androidx.compose.ui.focus.impassible impassibleVar) {
        int iAttabal = saran.attabal(1024);
        if (!impassibleVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = impassibleVar.getNode().getChild();
        if (child == null) {
            beachfront.dern(dernVar, impassibleVar.getNode());
        } else {
            dernVar.saneness(child);
        }
        while (dernVar.kowloon()) {
            androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar.molybdenite(dernVar.getSize() - 1);
            if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                beachfront.dern(dernVar, dernVarBeachfront);
            } else {
                while (dernVarBeachfront != null) {
                    if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                        androidx.compose.runtime.collection.dern dernVar2 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                androidx.compose.ui.focus.graveside.dern((FocusTargetNode) dernVarBeachfront);
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar2 == null) {
                                                dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar2.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar2.saneness(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            dernVarBeachfront = beachfront.beachfront(dernVar2);
                        }
                        break;
                    }
                    dernVarBeachfront = dernVarBeachfront.getChild();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void dern(androidx.compose.ui.attabal.dern dernVar, int i, int i2) {
        if (i2 != 0 || dernVar.getShouldAutoInvalidate()) {
            if ((saran.attabal(2) & i) != 0 && (dernVar instanceof graveside)) {
                gintrap.saneness((graveside) dernVar);
                if (i2 == 2) {
                    beachfront.competently(dernVar, saran.attabal(2)).hypokinesis();
                }
            }
            if ((saran.attabal(128) & i) != 0 && (dernVar instanceof molybdenite) && i2 != 2) {
                beachfront.impromptu(dernVar).underbelly();
            }
            if ((saran.attabal(256) & i) != 0 && (dernVar instanceof impassible) && i2 != 2) {
                beachfront.impromptu(dernVar).preterite();
            }
            if ((saran.attabal(4) & i) != 0 && (dernVar instanceof apical)) {
                formularize.attabal((apical) dernVar);
            }
            if ((saran.attabal(8) & i) != 0 && (dernVar instanceof premeiotic)) {
                timberyard.saneness((premeiotic) dernVar);
            }
            if ((saran.attabal(64) & i) != 0 && (dernVar instanceof splinterproof)) {
                overspeculate.attabal((splinterproof) dernVar);
            }
            if ((saran.attabal(1024) & i) != 0 && (dernVar instanceof FocusTargetNode) && i2 != 2) {
                androidx.compose.ui.focus.graveside.dern((FocusTargetNode) dernVar);
            }
            if ((saran.attabal(2048) & i) != 0 && (dernVar instanceof androidx.compose.ui.focus.impassible)) {
                androidx.compose.ui.focus.impassible impassibleVar = (androidx.compose.ui.focus.impassible) dernVar;
                if (apical(impassibleVar)) {
                    if (i2 == 2) {
                        cutely(impassibleVar);
                    } else {
                        androidx.compose.ui.focus.triweekly.attabal(impassibleVar);
                    }
                }
            }
            if ((i & saran.attabal(4096)) == 0 || !(dernVar instanceof androidx.compose.ui.focus.wireman)) {
                return;
            }
            androidx.compose.ui.focus.marial.saneness((androidx.compose.ui.focus.wireman) dernVar);
        }
    }

    public static final int impromptu(androidx.compose.ui.attabal.dern dernVar) {
        if (!(dernVar instanceof competently)) {
            return competently(dernVar);
        }
        competently competentlyVar = (competently) dernVar;
        int selfKindSet = competentlyVar.getSelfKindSet();
        for (androidx.compose.ui.attabal.dern delegate = competentlyVar.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            selfKindSet |= impromptu(delegate);
        }
        return selfKindSet;
    }

    public static final void marial(androidx.compose.ui.attabal.dern dernVar) {
        if (!dernVar.getIsAttached()) {
            peridotite.attabal.saneness("autoInvalidateUpdatedNode called on unattached node");
        }
        saneness(dernVar, -1, 0);
    }

    public static final void saneness(androidx.compose.ui.attabal.dern dernVar, int i, int i2) {
        if (!(dernVar instanceof competently)) {
            dern(dernVar, i & dernVar.getKindSet(), i2);
            return;
        }
        competently competentlyVar = (competently) dernVar;
        dern(dernVar, competentlyVar.getSelfKindSet() & i, i2);
        int i3 = (~competentlyVar.getSelfKindSet()) & i;
        for (androidx.compose.ui.attabal.dern delegate = competentlyVar.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            saneness(delegate, i3, i2);
        }
    }

    public static final boolean taiyuan(int i) {
        return (i & saran.attabal(128)) != 0;
    }

    public static final void wireman(androidx.compose.ui.attabal.dern dernVar) {
        if (!dernVar.getIsAttached()) {
            peridotite.attabal.saneness("autoInvalidateRemovedNode called on unattached node");
        }
        saneness(dernVar, -1, 2);
    }
}
