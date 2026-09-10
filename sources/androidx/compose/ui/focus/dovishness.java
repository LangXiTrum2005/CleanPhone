package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/saneness;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "attabal", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "Lsupplicat/taiyuan;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "marial", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lsupplicat/taiyuan;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "wireman", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lsupplicat/taiyuan;", "saneness", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "dern", "competently", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "beachfront", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6446attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f6447saneness;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6446attabal = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f6447saneness = iArr2;
        }
    }

    public static final FocusRequester attabal(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties focusPropertiesPicketboat = focusTargetNode.picketboat();
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.marial())) {
            return focusPropertiesPicketboat.getNext();
        }
        if (saneness.formularize(i, companion.beachfront())) {
            return focusPropertiesPicketboat.getPrevious();
        }
        if (saneness.formularize(i, companion.impromptu())) {
            return focusPropertiesPicketboat.getUp();
        }
        if (saneness.formularize(i, companion.attabal())) {
            return focusPropertiesPicketboat.getDown();
        }
        if (saneness.formularize(i, companion.wireman())) {
            int i2 = attabal.f6446attabal[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = focusPropertiesPicketboat.getStart();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = focusPropertiesPicketboat.getEnd();
            }
            focusRequester = start != FocusRequester.INSTANCE.saneness() ? start : null;
            return focusRequester == null ? focusPropertiesPicketboat.getLeft() : focusRequester;
        }
        if (!saneness.formularize(i, companion.competently())) {
            if (saneness.formularize(i, companion.saneness())) {
                return focusPropertiesPicketboat.formularize().invoke(saneness.taiyuan(i));
            }
            if (saneness.formularize(i, companion.dern())) {
                return focusPropertiesPicketboat.impromptu().invoke(saneness.taiyuan(i));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i3 = attabal.f6446attabal[layoutDirection.ordinal()];
        if (i3 == 1) {
            end = focusPropertiesPicketboat.getEnd();
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            end = focusPropertiesPicketboat.getStart();
        }
        focusRequester = end != FocusRequester.INSTANCE.saneness() ? end : null;
        return focusRequester == null ? focusPropertiesPicketboat.getRight() : focusRequester;
    }

    public static final FocusTargetNode beachfront(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
        }
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar, focusTargetNode.getNode());
        } else {
            dernVar.saneness(child);
        }
        while (dernVar.kowloon()) {
            androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar.molybdenite(dernVar.getSize() - 1);
            if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                androidx.compose.ui.node.beachfront.dern(dernVar, dernVarBeachfront);
            } else {
                while (dernVarBeachfront != null) {
                    if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                        androidx.compose.runtime.collection.dern dernVar2 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
                                if (focusTargetNode2.getNode().getIsAttached()) {
                                    int i = attabal.f6447saneness[focusTargetNode2.lightstruck().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode2;
                                    }
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i2 = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                        }
                        break;
                    }
                    dernVarBeachfront = dernVarBeachfront.getChild();
                }
            }
        }
        return null;
    }

    public static final boolean competently(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.attabal() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.picketboat()) ? false : true;
    }

    public static final FocusTargetNode dern(FocusTargetNode focusTargetNode) {
        seminary nodes;
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
        while (layoutNodeImpromptu != null) {
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        androidx.compose.ui.attabal.dern dernVarBeachfront = parent;
                        androidx.compose.runtime.collection.dern dernVar = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
                                if (focusTargetNode2.picketboat().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar == null) {
                                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar.saneness(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
            parent = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final Boolean marial(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, supplicat.taiyuan taiyuanVar, Function1<? super FocusTargetNode, Boolean> function1) {
        int iCompetently;
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.marial()) ? true : saneness.formularize(i, companion.beachfront())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.beachfront(focusTargetNode, i, function1));
        }
        if (saneness.formularize(i, companion.wireman()) ? true : saneness.formularize(i, companion.competently()) ? true : saneness.formularize(i, companion.impromptu()) ? true : saneness.formularize(i, companion.attabal())) {
            return TwoDimensionalFocusSearchKt.graveside(focusTargetNode, i, taiyuanVar, function1);
        }
        if (!saneness.formularize(i, companion.saneness())) {
            if (saneness.formularize(i, companion.dern())) {
                FocusTargetNode focusTargetNodeSaneness = saneness(focusTargetNode);
                FocusTargetNode focusTargetNodeDern = focusTargetNodeSaneness != null ? dern(focusTargetNodeSaneness) : null;
                return Boolean.valueOf((focusTargetNodeDern == null || Intrinsics.wireman(focusTargetNodeDern, focusTargetNode)) ? false : function1.invoke(focusTargetNodeDern).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) saneness.triweekly(i))).toString());
        }
        int i2 = attabal.f6446attabal[layoutDirection.ordinal()];
        if (i2 == 1) {
            iCompetently = companion.competently();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iCompetently = companion.wireman();
        }
        FocusTargetNode focusTargetNodeSaneness2 = saneness(focusTargetNode);
        if (focusTargetNodeSaneness2 != null) {
            return TwoDimensionalFocusSearchKt.graveside(focusTargetNodeSaneness2, iCompetently, taiyuanVar, function1);
        }
        return null;
    }

    public static final FocusTargetNode saneness(FocusTargetNode focusTargetNode) {
        int i = attabal.f6447saneness[focusTargetNode.lightstruck().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int iAttabal = saran.attabal(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
                if (child == null) {
                    androidx.compose.ui.node.beachfront.dern(dernVar, focusTargetNode.getNode());
                } else {
                    dernVar.saneness(child);
                }
                while (dernVar.kowloon()) {
                    androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar.molybdenite(dernVar.getSize() - 1);
                    if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                        androidx.compose.ui.node.beachfront.dern(dernVar, dernVarBeachfront);
                    } else {
                        while (dernVarBeachfront != null) {
                            if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                                androidx.compose.runtime.collection.dern dernVar2 = null;
                                while (dernVarBeachfront != null) {
                                    if (dernVarBeachfront instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNodeSaneness = saneness((FocusTargetNode) dernVarBeachfront);
                                        if (focusTargetNodeSaneness != null) {
                                            return focusTargetNodeSaneness;
                                        }
                                    } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iAttabal) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
                                        }
                                    }
                                    dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                                }
                                break;
                            }
                            dernVarBeachfront = dernVarBeachfront.getChild();
                        }
                    }
                }
                return null;
            }
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    public static final supplicat.taiyuan wireman(FocusTargetNode focusTargetNode) {
        supplicat.taiyuan taiyuanVarStratoscope;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        return (coordinator == null || (taiyuanVarStratoscope = androidx.compose.ui.layout.impromptu.wireman(coordinator).stratoscope(coordinator, false)) == null) ? supplicat.taiyuan.INSTANCE.attabal() : taiyuanVarStratoscope;
    }
}
