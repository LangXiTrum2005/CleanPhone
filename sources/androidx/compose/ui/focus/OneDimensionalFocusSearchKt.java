package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/saneness;", "direction", "Lkotlin/Function1;", "", "onFound", "beachfront", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "dern", "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", "saneness", "focusedItem", "wireman", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "taiyuan", "impromptu", "competently", "marial", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OneDimensionalFocusSearchKt {

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6439attabal;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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
            f6439attabal = iArr;
        }
    }

    public static final boolean beachfront(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.marial())) {
            return dern(focusTargetNode, function1);
        }
        if (saneness.formularize(i, companion.beachfront())) {
            return saneness(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    public static final boolean competently(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new FocusTargetNode[16], 0);
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, focusTargetNode.getNode());
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
                                dernVar.saneness((FocusTargetNode) dernVarBeachfront);
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar3 == null) {
                                                dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar3.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar3.saneness(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        dernVar.preprohormone(gintrap.f6449kowloon);
        int size = dernVar.getSize();
        if (size > 0) {
            int i2 = size - 1;
            Object[] objArrApical = dernVar.apical();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrApical[i2];
                if (dovishness.competently(focusTargetNode2) && saneness(focusTargetNode2, function1)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    public static final boolean dern(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i = attabal.f6439attabal[focusTargetNode.lightstruck().ordinal()];
        if (i == 1) {
            FocusTargetNode focusTargetNodeBeachfront = dovishness.beachfront(focusTargetNode);
            if (focusTargetNodeBeachfront != null) {
                return dern(focusTargetNodeBeachfront, function1) || wireman(focusTargetNode, focusTargetNodeBeachfront, saneness.INSTANCE.marial(), function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i == 2 || i == 3) {
            return impromptu(focusTargetNode, function1);
        }
        if (i == 4) {
            return focusTargetNode.picketboat().getCanFocus() ? function1.invoke(focusTargetNode).booleanValue() : impromptu(focusTargetNode, function1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean impromptu(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new FocusTargetNode[16], 0);
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, focusTargetNode.getNode());
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
                                dernVar.saneness((FocusTargetNode) dernVarBeachfront);
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar3 == null) {
                                                dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar3.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar3.saneness(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        dernVar.preprohormone(gintrap.f6449kowloon);
        int size = dernVar.getSize();
        if (size > 0) {
            Object[] objArrApical = dernVar.apical();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrApical[i2];
                if (dovishness.competently(focusTargetNode2) && dern(focusTargetNode2, function1)) {
                    return true;
                }
                i2++;
            } while (i2 < size);
        }
        return false;
    }

    public static final boolean marial(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.attabal.dern dernVar;
        seminary nodes;
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
        loop0: while (true) {
            dernVar = null;
            if (layoutNodeImpromptu == null) {
                break;
            }
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        androidx.compose.ui.attabal.dern dernVarBeachfront = parent;
                        androidx.compose.runtime.collection.dern dernVar2 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                dernVar = dernVarBeachfront;
                                break loop0;
                            }
                            if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
            parent = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
        }
        return dernVar == null;
    }

    public static final boolean saneness(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusStateImpl focusStateImplLightstruck = focusTargetNode.lightstruck();
        int[] iArr = attabal.f6439attabal;
        int i = iArr[focusStateImplLightstruck.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return competently(focusTargetNode, function1);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!competently(focusTargetNode, function1)) {
                if (!(focusTargetNode.picketboat().getCanFocus() ? function1.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeBeachfront = dovishness.beachfront(focusTargetNode);
        if (focusTargetNodeBeachfront == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i2 = iArr[focusTargetNodeBeachfront.lightstruck().ordinal()];
        if (i2 == 1) {
            return saneness(focusTargetNodeBeachfront, function1) || wireman(focusTargetNode, focusTargetNodeBeachfront, saneness.INSTANCE.beachfront(), function1) || (focusTargetNodeBeachfront.picketboat().getCanFocus() && function1.invoke(focusTargetNodeBeachfront).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return wireman(focusTargetNode, focusTargetNodeBeachfront, saneness.INSTANCE.beachfront(), function1);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean taiyuan(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (focusTargetNode.lightstruck() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new FocusTargetNode[16], 0);
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, focusTargetNode.getNode());
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
                                dernVar.saneness((FocusTargetNode) dernVarBeachfront);
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i2 = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar3 == null) {
                                                dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar3.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar3.saneness(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
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
        dernVar.preprohormone(gintrap.f6449kowloon);
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.marial())) {
            IntRange intRange = new IntRange(0, dernVar.getSize() - 1);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) dernVar.apical()[first];
                        if (dovishness.competently(focusTargetNode3) && dern(focusTargetNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.wireman(dernVar.apical()[first], focusTargetNode2)) {
                        z = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!saneness.formularize(i, companion.beachfront())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            IntRange intRange2 = new IntRange(0, dernVar.getSize() - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) dernVar.apical()[last2];
                        if (dovishness.competently(focusTargetNode4) && saneness(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.wireman(dernVar.apical()[last2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (saneness.formularize(i, saneness.INSTANCE.marial()) || !focusTargetNode.picketboat().getCanFocus() || marial(focusTargetNode)) {
            return false;
        }
        return function1.invoke(focusTargetNode).booleanValue();
    }

    public static final boolean wireman(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (taiyuan(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.attabal.attabal(focusTargetNode, i, new Function1<androidx.compose.ui.layout.wireman.attabal, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(androidx.compose.ui.layout.wireman.attabal attabalVar) {
                boolean zTaiyuan = OneDimensionalFocusSearchKt.taiyuan(focusTargetNode, focusTargetNode2, i, function1);
                Boolean boolValueOf = Boolean.valueOf(zTaiyuan);
                if (zTaiyuan || !attabalVar.attabal()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
