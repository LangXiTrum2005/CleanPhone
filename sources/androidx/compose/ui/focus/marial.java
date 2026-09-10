package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FocusEventModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/focus/wireman;", "", "saneness", "(Landroidx/compose/ui/focus/wireman;)V", "Landroidx/compose/ui/focus/molybdenite;", "attabal", "(Landroidx/compose/ui/focus/wireman;)Landroidx/compose/ui/focus/molybdenite;", "Landroidx/compose/ui/focus/FocusTargetNode;", "dern", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class marial {

    /* JADX INFO: compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6451attabal;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6451attabal = iArr;
        }
    }

    public static final molybdenite attabal(wireman wiremanVar) {
        int iAttabal = saran.attabal(1024);
        androidx.compose.ui.attabal.dern node = wiremanVar.getNode();
        androidx.compose.runtime.collection.dern dernVar = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                FocusStateImpl focusStateImplLightstruck = ((FocusTargetNode) node).lightstruck();
                int i = attabal.f6451attabal[focusStateImplLightstruck.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return focusStateImplLightstruck;
                }
            } else if ((node.getKindSet() & iAttabal) != 0 && (node instanceof androidx.compose.ui.node.competently)) {
                int i2 = 0;
                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iAttabal) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = delegate;
                        } else {
                            if (dernVar == null) {
                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                            }
                            if (node != null) {
                                dernVar.saneness(node);
                                node = null;
                            }
                            dernVar.saneness(delegate);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            node = androidx.compose.ui.node.beachfront.beachfront(dernVar);
        }
        if (!wiremanVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = wiremanVar.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, wiremanVar.getNode());
        } else {
            dernVar2.saneness(child);
        }
        while (dernVar2.kowloon()) {
            androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar2.molybdenite(dernVar2.getSize() - 1);
            if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                androidx.compose.ui.node.beachfront.dern(dernVar2, dernVarBeachfront);
            } else {
                while (dernVarBeachfront != null) {
                    if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                        androidx.compose.runtime.collection.dern dernVar3 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                FocusStateImpl focusStateImplLightstruck2 = ((FocusTargetNode) dernVarBeachfront).lightstruck();
                                int i3 = attabal.f6451attabal[focusStateImplLightstruck2.ordinal()];
                                if (i3 == 1 || i3 == 2 || i3 == 3) {
                                    return focusStateImplLightstruck2;
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i4 = 0;
                                for (androidx.compose.ui.attabal.dern delegate2 = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iAttabal) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            dernVarBeachfront = delegate2;
                                        } else {
                                            if (dernVar3 == null) {
                                                dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar3.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar3.saneness(delegate2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar3);
                        }
                        break;
                    }
                    dernVarBeachfront = dernVarBeachfront.getChild();
                }
            }
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    public static final void dern(FocusTargetNode focusTargetNode) {
        seminary nodes;
        int iAttabal = saran.attabal(4096);
        int iAttabal2 = saran.attabal(1024);
        androidx.compose.ui.attabal.dern node = focusTargetNode.getNode();
        int i = iAttabal | iAttabal2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern node2 = focusTargetNode.getNode();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
        while (layoutNodeImpromptu != null) {
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iAttabal2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & iAttabal) != 0) {
                            androidx.compose.ui.attabal.dern dernVarBeachfront = node2;
                            androidx.compose.runtime.collection.dern dernVar = null;
                            while (dernVarBeachfront != 0) {
                                if (dernVarBeachfront instanceof wireman) {
                                    wireman wiremanVar = (wireman) dernVarBeachfront;
                                    wiremanVar.taiyuan(attabal(wiremanVar));
                                } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                    androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate();
                                    int i2 = 0;
                                    dernVarBeachfront = dernVarBeachfront;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iAttabal) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                dernVarBeachfront = delegate;
                                            } else {
                                                if (dernVar == null) {
                                                    dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                                }
                                                if (dernVarBeachfront != 0) {
                                                    dernVar.saneness(dernVarBeachfront);
                                                    dernVarBeachfront = 0;
                                                }
                                                dernVar.saneness(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        dernVarBeachfront = dernVarBeachfront;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
            node2 = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final void saneness(wireman wiremanVar) {
        androidx.compose.ui.node.beachfront.taiyuan(wiremanVar).getFocusOwner().attabal(wiremanVar);
    }
}
