package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.creditor;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import androidx.compose.ui.node.starveling;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u0007\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/wireman;", "", "Landroidx/compose/ui/node/creditor;", "Landroidx/compose/ui/modifier/competently;", "Landroidx/compose/ui/attabal$dern;", "<init>", "()V", "", "molybdenite", "premeiotic", "Landroidx/compose/ui/focus/FocusProperties;", "picketboat", "()Landroidx/compose/ui/focus/FocusProperties;", "gusty", "claque", "monroe", "", "stratoscope", "Z", "isProcessingCustomExit", "trm", "isProcessingCustomEnter", "Landroidx/compose/ui/focus/FocusStateImpl;", "oilcan", "Landroidx/compose/ui/focus/FocusStateImpl;", "committedFocusState", "yemenite", "splinterproof", "()Z", "shouldAutoInvalidate", "value", "lightstruck", "()Landroidx/compose/ui/focus/FocusStateImpl;", "hardpan", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusState$annotations", "focusState", "Landroidx/compose/ui/layout/wireman;", "palmyra", "()Landroidx/compose/ui/layout/wireman;", "beyondBoundsLayoutParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusTargetNode extends androidx.compose.ui.attabal.dern implements androidx.compose.ui.node.wireman, androidx.compose.ui.node.marial, creditor, androidx.compose.ui.modifier.competently {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public FocusStateImpl committedFocusState;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public boolean isProcessingCustomExit;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public boolean isProcessingCustomEnter;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldAutoInvalidate;

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6436attabal;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6436attabal = iArr;
        }
    }

    public static final boolean achondroplasia(FocusTargetNode focusTargetNode) {
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
                                if (unconsolidated(focusTargetNode2)) {
                                    int i = attabal.f6436attabal[focusTargetNode2.lightstruck().ordinal()];
                                    if (i != 1 && i != 2) {
                                        if (i == 3) {
                                            return true;
                                        }
                                        if (i != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i2 = 0;
                                for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                    if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            dernVarBeachfront = dernVarUnderbelly;
                                        } else {
                                            if (dernVar == null) {
                                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar.saneness(dernVarUnderbelly);
                                        }
                                    }
                                }
                                if (i2 == 1) {
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
        return false;
    }

    public static final boolean julian(FocusTargetNode focusTargetNode) {
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            peridotite.attabal.saneness("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar, focusTargetNode.getNode());
        } else {
            dernVar.saneness(child);
        }
        while (dernVar.kowloon()) {
            androidx.compose.ui.attabal.dern dernVar2 = (androidx.compose.ui.attabal.dern) dernVar.molybdenite(dernVar.getSize() - 1);
            if ((dernVar2.getAggregateChildKindSet() & iAttabal) != 0) {
                for (androidx.compose.ui.attabal.dern child2 = dernVar2; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iAttabal) != 0) {
                        androidx.compose.ui.attabal.dern dernVarBeachfront = child2;
                        androidx.compose.runtime.collection.dern dernVar3 = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
                                if (unconsolidated(focusTargetNode2)) {
                                    int i = attabal.f6436attabal[focusTargetNode2.lightstruck().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return true;
                                    }
                                    if (i == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i2 = 0;
                                for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                    if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            dernVarBeachfront = dernVarUnderbelly;
                                        } else {
                                            if (dernVar3 == null) {
                                                dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar3.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar3.saneness(dernVarUnderbelly);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar3);
                        }
                    }
                }
            }
            androidx.compose.ui.node.beachfront.dern(dernVar, dernVar2);
        }
        return false;
    }

    public static final boolean unconsolidated(FocusTargetNode focusTargetNode) {
        return focusTargetNode.committedFocusState != null;
    }

    public final void claque() {
        FocusProperties focusProperties;
        if (this.committedFocusState == null) {
            monroe();
        }
        int i = attabal.f6436attabal[lightstruck().ordinal()];
        if (i == 1 || i == 2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            starveling.attabal(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ref$ObjectRef.element = this.picketboat();
                }
            });
            T t = ref$ObjectRef.element;
            if (t == 0) {
                Intrinsics.preprohormone("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            androidx.compose.ui.node.beachfront.taiyuan(this).getFocusOwner().kowloon(true);
        }
    }

    public final void gusty() {
        FocusStateImpl focusStateImplTaiyuan = graveside.wireman(this).taiyuan(this);
        if (focusStateImplTaiyuan != null) {
            this.committedFocusState = focusStateImplTaiyuan;
        } else {
            peridotite.attabal.dern("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    public void hardpan(FocusStateImpl focusStateImpl) {
        graveside.wireman(this).cutely(this, focusStateImpl);
    }

    public FocusStateImpl lightstruck() {
        FocusStateImpl focusStateImplTaiyuan;
        adultoid adultoidVarSaneness = graveside.saneness(this);
        if (adultoidVarSaneness != null && (focusStateImplTaiyuan = adultoidVarSaneness.taiyuan(this)) != null) {
            return focusStateImplTaiyuan;
        }
        FocusStateImpl focusStateImpl = this.committedFocusState;
        return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
    }

    @Override // androidx.compose.ui.node.creditor
    public void molybdenite() {
        FocusStateImpl focusStateImplLightstruck = lightstruck();
        claque();
        if (focusStateImplLightstruck != lightstruck()) {
            marial.dern(this);
        }
    }

    public final void monroe() {
        if (unconsolidated(this)) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        adultoid adultoidVarWireman = graveside.wireman(this);
        try {
            if (adultoidVarWireman.ongoingTransaction) {
                adultoidVarWireman.competently();
            }
            adultoidVarWireman.beachfront();
            hardpan((achondroplasia(this) && julian(this)) ? FocusStateImpl.ActiveParent : FocusStateImpl.Inactive);
            Unit unit = Unit.f29295attabal;
        } finally {
            adultoidVarWireman.impromptu();
        }
    }

    public final androidx.compose.ui.layout.wireman palmyra() {
        return (androidx.compose.ui.layout.wireman) triweekly(BeyondBoundsLayoutKt.attabal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final FocusProperties picketboat() {
        seminary nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int iAttabal = saran.attabal(2048);
        int iAttabal2 = saran.attabal(1024);
        androidx.compose.ui.attabal.dern node = getNode();
        int i = iAttabal | iAttabal2;
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern node2 = getNode();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(this);
        while (layoutNodeImpromptu != null) {
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iAttabal2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet() & iAttabal) != 0) {
                            androidx.compose.ui.attabal.dern dernVarBeachfront = node2;
                            androidx.compose.runtime.collection.dern dernVar = null;
                            while (dernVarBeachfront != 0) {
                                if (dernVarBeachfront instanceof impassible) {
                                    ((impassible) dernVarBeachfront).yemenite(focusPropertiesImpl);
                                } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                    androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate();
                                    int i2 = 0;
                                    dernVarBeachfront = dernVarBeachfront;
                                    while (dernVarUnderbelly != null) {
                                        if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                dernVarBeachfront = dernVarUnderbelly;
                                            } else {
                                                if (dernVar == null) {
                                                    dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                                }
                                                if (dernVarBeachfront != 0) {
                                                    dernVar.saneness(dernVarBeachfront);
                                                    dernVarBeachfront = 0;
                                                }
                                                dernVar.saneness(dernVarUnderbelly);
                                            }
                                        }
                                        dernVarUnderbelly = dernVarUnderbelly.getChild();
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
        return focusPropertiesImpl;
    }

    @Override // androidx.compose.ui.attabal.dern
    public void premeiotic() {
        int i = attabal.f6436attabal[lightstruck().ordinal()];
        if (i == 1 || i == 2) {
            androidx.compose.ui.node.beachfront.taiyuan(this).getFocusOwner().taiyuan(true, true, false, saneness.INSTANCE.dern());
            graveside.dern(this);
        } else if (i == 3) {
            adultoid adultoidVarWireman = graveside.wireman(this);
            try {
                if (adultoidVarWireman.ongoingTransaction) {
                    adultoidVarWireman.competently();
                }
                adultoidVarWireman.beachfront();
                hardpan(FocusStateImpl.Inactive);
                Unit unit = Unit.f29295attabal;
                adultoidVarWireman.impromptu();
            } catch (Throwable th) {
                adultoidVarWireman.impromptu();
                throw th;
            }
        }
        this.committedFocusState = null;
    }

    @Override // androidx.compose.ui.attabal.dern
    /* JADX INFO: renamed from: splinterproof, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }
}
