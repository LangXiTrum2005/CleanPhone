package androidx.compose.ui.node;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001cJ\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010$\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\u0005J\u001f\u0010'\u001a\u00020\t2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010\u0010J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b.\u0010\u0017J\u0017\u00100\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00108R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020*0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R$\u0010G\u001a\u00020B2\u0006\u0010C\u001a\u00020B8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R\u001e\u0010K\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010JR\u0016\u0010O\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0018\u0010S\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010QR\u0018\u0010U\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010QR\u0018\u0010W\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010QR\u0011\u0010Z\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/node/sealless;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "Lmilliradian/saneness;", "constraints", "", "marial", "(Landroidx/compose/ui/node/LayoutNode;Lmilliradian/saneness;)Z", "beachfront", "", "preprohormone", "saneness", "()V", "affectsLookahead", "relayoutNeeded", "gintrap", "(Landroidx/compose/ui/node/LayoutNode;ZZ)Z", "competently", "cord", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "node", "adultoid", "taiyuan", "molybdenite", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "kattegat", "(J)V", "forced", "stratoscope", "yemenite", "cuirassed", "oilcan", "trm", "Lkotlin/Function0;", "onLayout", "monoploid", "(Lkotlin/jvm/functions/Function0;)Z", "polloi", "Landroidx/compose/ui/node/peridotite$saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dovishness", "(Landroidx/compose/ui/node/peridotite$saneness;)V", "impromptu", "forceDispatch", "dern", "(Z)V", "graveside", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/impromptu;", "Landroidx/compose/ui/node/impromptu;", "relayoutNodes", "Z", "duringMeasureLayout", "wireman", "duringFullMeasureLayoutPass", "Landroidx/compose/ui/node/hydrovane;", "Landroidx/compose/ui/node/hydrovane;", "onPositionedDispatcher", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "onLayoutCompletedListeners", "", "<set-?>", "J", "arytenoidectomy", "()J", "measureIteration", "Landroidx/compose/ui/node/sealless$attabal;", "postponedMeasureRequests", "Lmilliradian/saneness;", "rootConstraints", "Landroidx/compose/ui/node/trm;", "cutely", "Landroidx/compose/ui/node/trm;", "consistencyChecker", "triweekly", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "canAffectParent", "apical", "canAffectParentInLookahead", "kowloon", "measureAffectsParentLookahead", "formularize", "()Z", "hasPendingMeasureOrLayout", "impassible", "hasPendingOnPositionedCallbacks", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode root;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<peridotite.saneness> onLayoutCompletedListeners;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public long measureIteration;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final trm consistencyChecker;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean duringMeasureLayout;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<attabal> postponedMeasureRequests;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final hydrovane onPositionedDispatcher;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final impromptu relayoutNodes;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public milliradian.saneness rootConstraints;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean duringFullMeasureLayoutPass;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/sealless$attabal;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "saneness", "Z", "dern", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final LayoutNode node;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final boolean isForced;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final boolean isLookahead;

        public attabal(LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f7049attabal;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7049attabal = iArr;
        }
    }

    public sealless(LayoutNode layoutNode) {
        this.root = layoutNode;
        peridotite.Companion companion = peridotite.INSTANCE;
        impromptu impromptuVar = new impromptu(companion.attabal());
        this.relayoutNodes = impromptuVar;
        this.onPositionedDispatcher = new hydrovane();
        this.onLayoutCompletedListeners = new androidx.compose.runtime.collection.dern<>(new peridotite.saneness[16], 0);
        this.measureIteration = 1L;
        androidx.compose.runtime.collection.dern<attabal> dernVar = new androidx.compose.runtime.collection.dern<>(new attabal[16], 0);
        this.postponedMeasureRequests = dernVar;
        this.consistencyChecker = companion.attabal() ? new trm(layoutNode, impromptuVar, dernVar.competently()) : null;
    }

    public static /* synthetic */ boolean rotuma(sealless seallessVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return seallessVar.gintrap(layoutNode, z, z2);
    }

    public static /* synthetic */ boolean sealless(sealless seallessVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return seallessVar.yemenite(layoutNode, z);
    }

    public static /* synthetic */ void wireman(sealless seallessVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        seallessVar.dern(z);
    }

    public final void adultoid(LayoutNode node, boolean affectsLookahead) {
        if (molybdenite(node, affectsLookahead) && this.relayoutNodes.marial(node, affectsLookahead)) {
            gintrap(node, affectsLookahead, false);
        }
    }

    public final boolean apical(LayoutNode layoutNode) {
        return layoutNode.seminary() && kowloon(layoutNode);
    }

    public final long arytenoidectomy() {
        if (!this.duringMeasureLayout) {
            peridotite.attabal.attabal("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean beachfront(LayoutNode layoutNode, milliradian.saneness constraints) {
        boolean zLampshade = constraints != null ? layoutNode.lampshade(constraints) : LayoutNode.libyan(layoutNode, null, 1, null);
        LayoutNode layoutNodePermissivist = layoutNode.permissivist();
        if (zLampshade && layoutNodePermissivist != null) {
            if (layoutNode.walach() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.fastrack(layoutNodePermissivist, false, false, false, 3, null);
                return zLampshade;
            }
            if (layoutNode.walach() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.licking(layoutNodePermissivist, false, 1, null);
            }
        }
        return zLampshade;
    }

    public final void competently() {
        if (this.postponedMeasureRequests.kowloon()) {
            androidx.compose.runtime.collection.dern<attabal> dernVar = this.postponedMeasureRequests;
            int size = dernVar.getSize();
            if (size > 0) {
                attabal[] attabalVarArrApical = dernVar.apical();
                int i = 0;
                do {
                    attabal attabalVar = attabalVarArrApical[i];
                    if (attabalVar.getNode().picketboat()) {
                        if (attabalVar.getIsLookahead()) {
                            LayoutNode.prefect(attabalVar.getNode(), attabalVar.getIsForced(), false, false, 2, null);
                        } else {
                            LayoutNode.fastrack(attabalVar.getNode(), attabalVar.getIsForced(), false, false, 2, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
            this.postponedMeasureRequests.impromptu();
        }
    }

    public final void cord(LayoutNode layoutNode, boolean affectsLookahead) {
        milliradian.saneness sanenessVar;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            sanenessVar = this.rootConstraints;
            Intrinsics.beachfront(sanenessVar);
        } else {
            sanenessVar = null;
        }
        if (affectsLookahead) {
            marial(layoutNode, sanenessVar);
        } else {
            beachfront(layoutNode, sanenessVar);
        }
    }

    public final boolean cuirassed(LayoutNode layoutNode, boolean forced) {
        int i = saneness.f7049attabal[layoutNode.merc().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.seminary() || layoutNode.polder()) && !forced) {
                trm trmVar = this.consistencyChecker;
                if (trmVar != null) {
                    trmVar.attabal();
                }
                return false;
            }
            layoutNode.herdbook();
            layoutNode.hardpan();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            LayoutNode layoutNodePermissivist = layoutNode.permissivist();
            if (Intrinsics.wireman(layoutNode.monroe(), Boolean.TRUE) && ((layoutNodePermissivist == null || !layoutNodePermissivist.seminary()) && (layoutNodePermissivist == null || !layoutNodePermissivist.polder()))) {
                this.relayoutNodes.dern(layoutNode, true);
            } else if (layoutNode.attabal() && ((layoutNodePermissivist == null || !layoutNodePermissivist.restrictive()) && (layoutNodePermissivist == null || !layoutNodePermissivist.starveling()))) {
                this.relayoutNodes.dern(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        trm trmVar2 = this.consistencyChecker;
        if (trmVar2 != null) {
            trmVar2.attabal();
        }
        return false;
    }

    public final boolean cutely(LayoutNode layoutNode) {
        return layoutNode.starveling() && triweekly(layoutNode);
    }

    public final void dern(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.marial(this.root);
        }
        this.onPositionedDispatcher.attabal();
    }

    public final void dovishness(peridotite.saneness listener) {
        this.onLayoutCompletedListeners.saneness(listener);
    }

    public final boolean formularize() {
        return this.relayoutNodes.impromptu();
    }

    public final boolean gintrap(LayoutNode layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        milliradian.saneness sanenessVar;
        boolean zMarial;
        LayoutNode layoutNodePermissivist;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.attabal() && !layoutNode.lightstruck() && !cutely(layoutNode) && !Intrinsics.wireman(layoutNode.monroe(), Boolean.TRUE) && !apical(layoutNode) && !layoutNode.molybdenite()) {
            return false;
        }
        if (layoutNode == this.root) {
            sanenessVar = this.rootConstraints;
            Intrinsics.beachfront(sanenessVar);
        } else {
            sanenessVar = null;
        }
        if (affectsLookahead) {
            zMarial = layoutNode.seminary() ? marial(layoutNode, sanenessVar) : false;
            if (relayoutNeeded && ((zMarial || layoutNode.polder()) && Intrinsics.wireman(layoutNode.monroe(), Boolean.TRUE))) {
                layoutNode.claque();
            }
        } else {
            boolean zBeachfront = layoutNode.starveling() ? beachfront(layoutNode, sanenessVar) : false;
            if (relayoutNeeded && layoutNode.restrictive() && (layoutNode == this.root || ((layoutNodePermissivist = layoutNode.permissivist()) != null && layoutNodePermissivist.attabal() && layoutNode.lightstruck()))) {
                if (layoutNode == this.root) {
                    layoutNode.attendance(0, 0);
                } else {
                    layoutNode.sakeen();
                }
                this.onPositionedDispatcher.wireman(layoutNode);
                trm trmVar = this.consistencyChecker;
                if (trmVar != null) {
                    trmVar.attabal();
                }
            }
            zMarial = zBeachfront;
        }
        competently();
        return zMarial;
    }

    public final void graveside(LayoutNode node) {
        this.relayoutNodes.taiyuan(node);
        this.onPositionedDispatcher.beachfront(node);
    }

    public final boolean impassible() {
        return this.onPositionedDispatcher.dern();
    }

    public final void impromptu(LayoutNode layoutNode, boolean affectsLookahead) {
        if (this.relayoutNodes.competently(affectsLookahead)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            peridotite.attabal.saneness("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (molybdenite(layoutNode, affectsLookahead)) {
            peridotite.attabal.attabal("node not yet measured");
        }
        taiyuan(layoutNode, affectsLookahead);
    }

    public final void kattegat(long constraints) {
        milliradian.saneness sanenessVar = this.rootConstraints;
        if (sanenessVar == null ? false : milliradian.saneness.wireman(sanenessVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            peridotite.attabal.attabal("updateRootConstraints called while measuring");
        }
        this.rootConstraints = milliradian.saneness.attabal(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.technofreak();
        }
        this.root.outmarry();
        impromptu impromptuVar = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        impromptuVar.dern(layoutNode, layoutNode.getLookaheadRoot() != null);
    }

    public final boolean kowloon(LayoutNode layoutNode) {
        androidx.compose.ui.node.attabal attabalVarTrm;
        AlignmentLines alignmentLinesSaneness;
        return layoutNode.peridotite() == LayoutNode.UsageByParent.InMeasureBlock || !((attabalVarTrm = layoutNode.getLayoutDelegate().trm()) == null || (alignmentLinesSaneness = attabalVarTrm.getAlignmentLines()) == null || !alignmentLinesSaneness.apical());
    }

    public final boolean marial(LayoutNode layoutNode, milliradian.saneness constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zAchondroplasia = constraints != null ? layoutNode.achondroplasia(constraints) : LayoutNode.unconsolidated(layoutNode, null, 1, null);
        LayoutNode layoutNodePermissivist = layoutNode.permissivist();
        if (zAchondroplasia && layoutNodePermissivist != null) {
            if (layoutNodePermissivist.getLookaheadRoot() == null) {
                LayoutNode.fastrack(layoutNodePermissivist, false, false, false, 3, null);
                return zAchondroplasia;
            }
            if (layoutNode.peridotite() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.prefect(layoutNodePermissivist, false, false, false, 3, null);
                return zAchondroplasia;
            }
            if (layoutNode.peridotite() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.basify(layoutNodePermissivist, false, 1, null);
            }
        }
        return zAchondroplasia;
    }

    public final boolean molybdenite(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.seminary() : layoutNode.starveling();
    }

    public final boolean monoploid(Function0<Unit> onLayout) throws Throwable {
        sealless seallessVar;
        Throwable th;
        boolean z;
        LayoutNode layoutNodeMarial;
        if (!this.root.picketboat()) {
            peridotite.attabal.attabal("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.attabal()) {
            peridotite.attabal.attabal("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            peridotite.attabal.attabal("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.impromptu()) {
                    impromptu impromptuVar = this.relayoutNodes;
                    z = false;
                    while (impromptuVar.impromptu()) {
                        boolean zWireman = impromptuVar.lookaheadSet.wireman();
                        boolean z3 = !zWireman;
                        if (zWireman) {
                            layoutNodeMarial = impromptuVar.set.marial();
                        } else {
                            try {
                                layoutNodeMarial = impromptuVar.lookaheadSet.marial();
                            } catch (Throwable th2) {
                                th = th2;
                                seallessVar = this;
                                seallessVar.duringMeasureLayout = false;
                                seallessVar.duringFullMeasureLayoutPass = false;
                                throw th;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeMarial;
                        seallessVar = this;
                        try {
                            boolean zRotuma = rotuma(seallessVar, layoutNode, z3, false, 4, null);
                            if (layoutNode == this.root && zRotuma) {
                                z = true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            seallessVar.duringMeasureLayout = false;
                            seallessVar.duringFullMeasureLayoutPass = false;
                            throw th;
                        }
                    }
                    seallessVar = this;
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    seallessVar = this;
                    z = false;
                }
                seallessVar.duringMeasureLayout = false;
                seallessVar.duringFullMeasureLayoutPass = false;
                trm trmVar = seallessVar.consistencyChecker;
                if (trmVar != null) {
                    trmVar.attabal();
                }
                z2 = z;
            } catch (Throwable th4) {
                th = th4;
                seallessVar = this;
            }
        }
        saneness();
        return z2;
    }

    public final boolean oilcan(LayoutNode layoutNode, boolean forced) {
        int i = saneness.f7049attabal[layoutNode.merc().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            trm trmVar = this.consistencyChecker;
            if (trmVar != null) {
                trmVar.attabal();
            }
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (!forced && layoutNode.attabal() == layoutNode.lightstruck() && (layoutNode.starveling() || layoutNode.restrictive())) {
            trm trmVar2 = this.consistencyChecker;
            if (trmVar2 != null) {
                trmVar2.attabal();
            }
            return false;
        }
        layoutNode.hardpan();
        if (!layoutNode.getIsDeactivated() && layoutNode.lightstruck()) {
            LayoutNode layoutNodePermissivist = layoutNode.permissivist();
            if ((layoutNodePermissivist == null || !layoutNodePermissivist.restrictive()) && (layoutNodePermissivist == null || !layoutNodePermissivist.starveling())) {
                this.relayoutNodes.dern(layoutNode, false);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final void polloi() {
        if (this.relayoutNodes.impromptu()) {
            if (!this.root.picketboat()) {
                peridotite.attabal.attabal("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.attabal()) {
                peridotite.attabal.attabal("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                peridotite.attabal.attabal("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.competently(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            cord(this.root, true);
                        } else {
                            preprohormone(this.root);
                        }
                    }
                    cord(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    trm trmVar = this.consistencyChecker;
                    if (trmVar != null) {
                        trmVar.attabal();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th;
                }
            }
        }
    }

    public final void preprohormone(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArrApical[i];
                if (triweekly(layoutNode2)) {
                    if (stratoscope.attabal(layoutNode2)) {
                        cord(layoutNode2, true);
                    } else {
                        preprohormone(layoutNode2);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public final void saneness() {
        androidx.compose.runtime.collection.dern<peridotite.saneness> dernVar = this.onLayoutCompletedListeners;
        int size = dernVar.getSize();
        if (size > 0) {
            peridotite.saneness[] sanenessVarArrApical = dernVar.apical();
            int i = 0;
            do {
                sanenessVarArrApical[i].wireman();
                i++;
            } while (i < size);
        }
        this.onLayoutCompletedListeners.impromptu();
    }

    public final boolean stratoscope(LayoutNode layoutNode, boolean forced) {
        LayoutNode layoutNodePermissivist;
        LayoutNode layoutNodePermissivist2;
        if (!(layoutNode.getLookaheadRoot() != null)) {
            peridotite.attabal.saneness("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = saneness.f7049attabal[layoutNode.merc().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.seminary() && !forced) {
                    return false;
                }
                layoutNode.technofreak();
                layoutNode.outmarry();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if ((Intrinsics.wireman(layoutNode.monroe(), Boolean.TRUE) || apical(layoutNode)) && ((layoutNodePermissivist = layoutNode.permissivist()) == null || !layoutNodePermissivist.seminary())) {
                    this.relayoutNodes.dern(layoutNode, true);
                } else if ((layoutNode.attabal() || cutely(layoutNode)) && ((layoutNodePermissivist2 = layoutNode.permissivist()) == null || !layoutNodePermissivist2.starveling())) {
                    this.relayoutNodes.dern(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.saneness(new attabal(layoutNode, true, forced));
            trm trmVar = this.consistencyChecker;
            if (trmVar != null) {
                trmVar.attabal();
            }
        }
        return false;
    }

    public final void taiyuan(LayoutNode layoutNode, boolean affectsLookahead) {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArrApical[i];
                if ((!affectsLookahead && triweekly(layoutNode2)) || (affectsLookahead && kowloon(layoutNode2))) {
                    if (stratoscope.attabal(layoutNode2) && !affectsLookahead) {
                        if (layoutNode2.seminary() && this.relayoutNodes.marial(layoutNode2, true)) {
                            gintrap(layoutNode2, true, false);
                        } else {
                            impromptu(layoutNode2, true);
                        }
                    }
                    adultoid(layoutNode2, affectsLookahead);
                    if (!molybdenite(layoutNode2, affectsLookahead)) {
                        taiyuan(layoutNode2, affectsLookahead);
                    }
                }
                i++;
            } while (i < size);
        }
        adultoid(layoutNode, affectsLookahead);
    }

    public final boolean triweekly(LayoutNode layoutNode) {
        return layoutNode.walach() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().polloi().getAlignmentLines().apical();
    }

    public final void trm(LayoutNode layoutNode) {
        this.onPositionedDispatcher.wireman(layoutNode);
    }

    public final boolean yemenite(LayoutNode layoutNode, boolean forced) {
        int i = saneness.f7049attabal[layoutNode.merc().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.starveling() && !forced) {
                    return false;
                }
                layoutNode.outmarry();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if (!layoutNode.attabal() && !cutely(layoutNode)) {
                    return false;
                }
                LayoutNode layoutNodePermissivist = layoutNode.permissivist();
                if (layoutNodePermissivist == null || !layoutNodePermissivist.starveling()) {
                    this.relayoutNodes.dern(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.saneness(new attabal(layoutNode, false, forced));
            trm trmVar = this.consistencyChecker;
            if (trmVar != null) {
                trmVar.attabal();
            }
        }
        return false;
    }
}
