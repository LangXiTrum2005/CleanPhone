package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import androidx.compose.ui.node.starveling;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "cutely", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "Landroidx/compose/ui/focus/saneness;", "focusDirection", "apical", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", "taiyuan", "forced", "refreshFocusEvents", "dern", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "wireman", "attabal", "childNode", "formularize", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "impassible", "triweekly", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/CustomDestinationResult;", "impromptu", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "marial", "beachfront", "competently", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6437attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f6438saneness;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6437attabal = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f6438saneness = iArr2;
        }
    }

    public static final Boolean apical(final FocusTargetNode focusTargetNode, int i) {
        Boolean boolValueOf;
        adultoid adultoidVarWireman = graveside.wireman(focusTargetNode);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (focusTargetNode.getNode().getIsAttached()) {
                    marial.dern(focusTargetNode);
                }
            }
        };
        try {
            if (adultoidVarWireman.ongoingTransaction) {
                adultoidVarWireman.competently();
            }
            adultoidVarWireman.beachfront();
            adultoidVarWireman.cancellationListener.saneness(function0);
            int i2 = attabal.f6437attabal[impromptu(focusTargetNode, i).ordinal()];
            if (i2 == 1) {
                boolValueOf = Boolean.valueOf(taiyuan(focusTargetNode));
            } else if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            adultoidVarWireman.impromptu();
            return boolValueOf;
        } catch (Throwable th) {
            adultoidVarWireman.impromptu();
            throw th;
        }
    }

    public static final boolean attabal(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode focusTargetNodeBeachfront = dovishness.beachfront(focusTargetNode);
        if (focusTargetNodeBeachfront != null) {
            return dern(focusTargetNodeBeachfront, z, z2);
        }
        return true;
    }

    public static final CustomDestinationResult beachfront(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.picketboat().formularize().invoke(saneness.taiyuan(i));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.saneness()) {
                    if (focusRequesterInvoke == companion.attabal()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.wireman() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult competently(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.picketboat().impromptu().invoke(saneness.taiyuan(i));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.saneness()) {
                    if (focusRequesterInvoke == companion.attabal()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.wireman() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final boolean cutely(FocusTargetNode focusTargetNode) {
        Boolean boolApical = apical(focusTargetNode, saneness.INSTANCE.saneness());
        if (boolApical != null) {
            return boolApical.booleanValue();
        }
        return false;
    }

    public static final boolean dern(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        if (i == 1) {
            focusTargetNode.hardpan(FocusStateImpl.Inactive);
            if (z2) {
                marial.dern(focusTargetNode);
            }
            return true;
        }
        if (i == 2) {
            if (z) {
                focusTargetNode.hardpan(FocusStateImpl.Inactive);
                if (z2) {
                    marial.dern(focusTargetNode);
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!attabal(focusTargetNode, z, z2)) {
            return false;
        }
        focusTargetNode.hardpan(FocusStateImpl.Inactive);
        if (z2) {
            marial.dern(focusTargetNode);
        }
        return true;
    }

    public static final boolean formularize(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.attabal.dern dernVar;
        androidx.compose.ui.attabal.dern dernVarBeachfront;
        seminary nodes;
        seminary nodes2;
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode2);
        loop0: while (true) {
            dernVar = null;
            if (layoutNodeImpromptu == null) {
                dernVarBeachfront = null;
                break;
            }
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        dernVarBeachfront = parent;
                        androidx.compose.runtime.collection.dern dernVar2 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
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
            parent = (layoutNodeImpromptu == null || (nodes2 = layoutNodeImpromptu.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.wireman(dernVarBeachfront, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i2 = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        if (i2 == 1) {
            boolean zWireman = wireman(focusTargetNode2);
            if (zWireman) {
                focusTargetNode.hardpan(FocusStateImpl.ActiveParent);
            }
            return zWireman;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iAttabal2 = saran.attabal(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.attabal.dern parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeImpromptu2 = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
                loop4: while (layoutNodeImpromptu2 != null) {
                    if ((layoutNodeImpromptu2.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iAttabal2) != 0) {
                                androidx.compose.ui.attabal.dern dernVarBeachfront2 = parent2;
                                androidx.compose.runtime.collection.dern dernVar3 = null;
                                while (dernVarBeachfront2 != null) {
                                    if (dernVarBeachfront2 instanceof FocusTargetNode) {
                                        dernVar = dernVarBeachfront2;
                                        break loop4;
                                    }
                                    if ((dernVarBeachfront2.getKindSet() & iAttabal2) != 0 && (dernVarBeachfront2 instanceof androidx.compose.ui.node.competently)) {
                                        int i3 = 0;
                                        for (androidx.compose.ui.attabal.dern delegate2 = ((androidx.compose.ui.node.competently) dernVarBeachfront2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iAttabal2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    dernVarBeachfront2 = delegate2;
                                                } else {
                                                    if (dernVar3 == null) {
                                                        dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                                    }
                                                    if (dernVarBeachfront2 != null) {
                                                        dernVar3.saneness(dernVarBeachfront2);
                                                        dernVarBeachfront2 = null;
                                                    }
                                                    dernVar3.saneness(delegate2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    dernVarBeachfront2 = androidx.compose.ui.node.beachfront.beachfront(dernVar3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeImpromptu2 = layoutNodeImpromptu2.permissivist();
                    parent2 = (layoutNodeImpromptu2 == null || (nodes = layoutNodeImpromptu2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) dernVar;
                if (focusTargetNode3 == null && impassible(focusTargetNode)) {
                    boolean zWireman2 = wireman(focusTargetNode2);
                    if (zWireman2) {
                        focusTargetNode.hardpan(FocusStateImpl.ActiveParent);
                    }
                    return zWireman2;
                }
                if (focusTargetNode3 == null || !formularize(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zFormularize = formularize(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.lightstruck() != FocusStateImpl.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zFormularize) {
                    marial.dern(focusTargetNode3);
                }
                return zFormularize;
            }
            triweekly(focusTargetNode);
            if (saneness(focusTargetNode, false, false, 3, null) && wireman(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean impassible(FocusTargetNode focusTargetNode) {
        return androidx.compose.ui.node.beachfront.taiyuan(focusTargetNode).getFocusOwner().impassible(null, null);
    }

    public static final CustomDestinationResult impromptu(FocusTargetNode focusTargetNode, int i) {
        androidx.compose.ui.attabal.dern dernVarBeachfront;
        seminary nodes;
        int i2 = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return marial(triweekly(focusTargetNode), i);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeImpromptu == null) {
                dernVarBeachfront = null;
                break;
            }
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        dernVarBeachfront = parent;
                        androidx.compose.runtime.collection.dern dernVar = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i3 = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = attabal.f6438saneness[focusTargetNode2.lightstruck().ordinal()];
        if (i4 == 1) {
            return beachfront(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return impromptu(focusTargetNode2, i);
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultImpromptu = impromptu(focusTargetNode2, i);
        CustomDestinationResult customDestinationResult = customDestinationResultImpromptu != CustomDestinationResult.None ? customDestinationResultImpromptu : null;
        return customDestinationResult == null ? beachfront(focusTargetNode2, i) : customDestinationResult;
    }

    public static final CustomDestinationResult marial(FocusTargetNode focusTargetNode, int i) {
        int i2 = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                CustomDestinationResult customDestinationResultMarial = marial(triweekly(focusTargetNode), i);
                if (customDestinationResultMarial == CustomDestinationResult.None) {
                    customDestinationResultMarial = null;
                }
                return customDestinationResultMarial == null ? competently(focusTargetNode, i) : customDestinationResultMarial;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    public static /* synthetic */ boolean saneness(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return attabal(focusTargetNode, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    public static final boolean taiyuan(FocusTargetNode focusTargetNode) {
        seminary nodes;
        int i = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        boolean zFormularize = true;
        if (i != 1 && i != 2) {
            androidx.compose.ui.attabal.dern dernVar = null;
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iAttabal = saran.attabal(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.attabal.dern parent = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
                loop0: while (layoutNodeImpromptu != null) {
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
                            }
                            parent = parent.getParent();
                        }
                    }
                    layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
                    parent = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVar;
                if (focusTargetNode2 != null) {
                    FocusStateImpl focusStateImplLightstruck = focusTargetNode2.lightstruck();
                    zFormularize = formularize(focusTargetNode2, focusTargetNode);
                    if (zFormularize && focusStateImplLightstruck != focusTargetNode2.lightstruck()) {
                        marial.dern(focusTargetNode2);
                    }
                } else if (!impassible(focusTargetNode) || !wireman(focusTargetNode)) {
                    zFormularize = false;
                }
            } else if (!saneness(focusTargetNode, false, false, 3, null) || !wireman(focusTargetNode)) {
                zFormularize = false;
            }
        }
        if (zFormularize) {
            marial.dern(focusTargetNode);
        }
        return zFormularize;
    }

    public static final FocusTargetNode triweekly(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeBeachfront = dovishness.beachfront(focusTargetNode);
        if (focusTargetNodeBeachfront != null) {
            return focusTargetNodeBeachfront;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    public static final boolean wireman(final FocusTargetNode focusTargetNode) {
        starveling.attabal(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetNode.picketboat();
            }
        });
        int i = attabal.f6438saneness[focusTargetNode.lightstruck().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetNode.hardpan(FocusStateImpl.Active);
        return true;
    }
}
