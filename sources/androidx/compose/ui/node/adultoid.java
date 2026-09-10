package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.lotta;
import restrictive.sayid;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002KLB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b&\u0010'R*\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00105\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R.\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/node/adultoid;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/graveside;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/graveside;)V", "", "inrooted", "()V", "tarboosh", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/gintrap;", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "nosophobia", "(Landroidx/compose/ui/layout/attabal;)I", "Lrestrictive/creditor;", "canvas", "graphicsLayer", "murrine", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "value", "lerp", "Landroidx/compose/ui/node/graveside;", "sulfarsenide", "()Landroidx/compose/ui/node/graveside;", "wittig", "(Landroidx/compose/ui/node/graveside;)V", "layoutModifierNode", "Lmilliradian/saneness;", "aristocrat", "()Lmilliradian/saneness;", "iconoclasm", "(Lmilliradian/saneness;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/yemenite;", "<set-?>", "lotta", "Landroidx/compose/ui/node/yemenite;", "vir", "()Landroidx/compose/ui/node/yemenite;", "premed", "(Landroidx/compose/ui/node/yemenite;)V", "lookaheadDelegate", "Landroidx/compose/ui/layout/dern;", "sayid", "Landroidx/compose/ui/layout/dern;", "approachMeasureScope", "Landroidx/compose/ui/attabal$dern;", "puffin", "()Landroidx/compose/ui/attabal$dern;", "tail", "dispope", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "empress", "attabal", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class adultoid extends NodeCoordinator {

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public static final lotta f6984coi;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name and from kotlin metadata */
    public graveside layoutModifierNode;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name and from kotlin metadata */
    public yemenite lookaheadDelegate;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name and from kotlin metadata */
    public milliradian.saneness lookaheadConstraints;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.dern approachMeasureScope;

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000fR\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/ui/node/adultoid$dern", "Landroidx/compose/ui/layout/arytenoidectomy;", "", "dern", "()V", "", "saneness", "I", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/attabal;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/cuirassed;", "wireman", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern implements androidx.compose.ui.layout.arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.arytenoidectomy f6990attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int width;

        public dern(androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar, adultoid adultoidVar) {
            this.f6990attabal = arytenoidectomyVar;
            yemenite lookaheadDelegate = adultoidVar.getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            this.width = lookaheadDelegate.getWidth();
            yemenite lookaheadDelegate2 = adultoidVar.getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getHeight();
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public void dern() {
            this.f6990attabal.dern();
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Map<androidx.compose.ui.layout.attabal, Integer> saneness() {
            return this.f6990attabal.saneness();
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Function1<androidx.compose.ui.layout.cuirassed, Unit> wireman() {
            return this.f6990attabal.wireman();
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/adultoid$saneness;", "Landroidx/compose/ui/node/yemenite;", "<init>", "(Landroidx/compose/ui/node/adultoid;)V", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/gintrap;", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "nosophobia", "(Landroidx/compose/ui/layout/attabal;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class saneness extends yemenite {
        public saneness() {
            super(adultoid.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int nosophobia(androidx.compose.ui.layout.attabal alignmentLine) {
            int iSaneness = dovishness.saneness(this, alignmentLine);
            attendance().put(alignmentLine, Integer.valueOf(iSaneness));
            return iSaneness;
        }

        @Override // androidx.compose.ui.layout.triweekly
        public androidx.compose.ui.layout.gintrap sealless(long constraints) {
            adultoid adultoidVar = adultoid.this;
            coffeecake(constraints);
            adultoidVar.iconoclasm(milliradian.saneness.attabal(constraints));
            graveside layoutModifierNode = adultoidVar.getLayoutModifierNode();
            yemenite lookaheadDelegate = adultoidVar.dispope().getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            osteal(layoutModifierNode.attabal(this, lookaheadDelegate, constraints));
            return this;
        }
    }

    static {
        lotta lottaVarAttabal = restrictive.seminary.attabal();
        lottaVarAttabal.formularize(restrictive.overspeculate.INSTANCE.saneness());
        lottaVarAttabal.gintrap(1.0f);
        lottaVarAttabal.dovishness(sayid.INSTANCE.saneness());
        f6984coi = lottaVarAttabal;
    }

    public adultoid(LayoutNode layoutNode, graveside gravesideVar) {
        super(layoutNode);
        this.layoutModifierNode = gravesideVar;
        androidx.compose.ui.layout.dern dernVar = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new saneness() : null;
        if ((gravesideVar.getNode().getKindSet() & saran.attabal(512)) != 0) {
            Intrinsics.competently(gravesideVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            dernVar = new androidx.compose.ui.layout.dern(this, (ApproachLayoutModifierNode) gravesideVar);
        }
        this.approachMeasureScope = dernVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    private final void inrooted() {
        boolean z;
        if (getIsShallowPlacing()) {
            return;
        }
        nomenclative();
        androidx.compose.ui.layout.dern dernVar = this.approachMeasureScope;
        if (dernVar != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeSaneness = dernVar.getApproachNode();
            androidx.compose.ui.layout.gintrap.attabal placementScope = getPlacementScope();
            yemenite lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            if (approachLayoutModifierNodeSaneness.saran(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) || dernVar.getApproachMeasureRequired()) {
                z = false;
            } else {
                long jTriweekly = triweekly();
                yemenite lookaheadDelegate2 = getLookaheadDelegate();
                if (milliradian.monoploid.wireman(jTriweekly, lookaheadDelegate2 != null ? milliradian.monoploid.saneness(lookaheadDelegate2.molet()) : null)) {
                    long jTriweekly2 = dispope().triweekly();
                    yemenite lookaheadDelegate3 = dispope().getLookaheadDelegate();
                    if (milliradian.monoploid.wireman(jTriweekly2, lookaheadDelegate3 != null ? milliradian.monoploid.saneness(lookaheadDelegate3.molet()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            dispope().nattier(z);
        }
        wostteth().dern();
        dispope().nattier(false);
    }

    /* JADX INFO: renamed from: aristocrat, reason: from getter */
    public final milliradian.saneness getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    public final NodeCoordinator dispope() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.beachfront(wrapped);
        return wrapped;
    }

    public final void iconoclasm(milliradian.saneness sanenessVar) {
        this.lookaheadConstraints = sanenessVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.gintrap
    public void milliradian(long position, float zIndex, GraphicsLayer layer) {
        super.milliradian(position, zIndex, layer);
        inrooted();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void murrine(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        dispope().fastrack(canvas, graphicsLayer);
        if (cuirassed.saneness(getLayoutNode()).getShowLayoutBounds()) {
            cosy(canvas, f6984coi);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int nosophobia(androidx.compose.ui.layout.attabal alignmentLine) {
        yemenite lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.mastfed(alignmentLine) : dovishness.saneness(this, alignmentLine);
    }

    public void premed(yemenite yemeniteVar) {
        this.lookaheadDelegate = yemeniteVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public androidx.compose.ui.attabal.dern puffin() {
        return this.layoutModifierNode.getNode();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    @Override // androidx.compose.ui.layout.triweekly
    public androidx.compose.ui.layout.gintrap sealless(long constraints) {
        androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVarAttabal;
        boolean z;
        if (getForceMeasureWithLookaheadConstraints()) {
            milliradian.saneness sanenessVar = this.lookaheadConstraints;
            if (sanenessVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            constraints = sanenessVar.getValue();
        }
        coffeecake(constraints);
        androidx.compose.ui.layout.dern dernVar = this.approachMeasureScope;
        if (dernVar != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeSaneness = dernVar.getApproachNode();
            dernVar.beachfront(approachLayoutModifierNodeSaneness.stratoscope(dernVar.marial()) || !milliradian.saneness.dern(constraints, getLookaheadConstraints()));
            if (!dernVar.getApproachMeasureRequired()) {
                dispope().balance(true);
            }
            arytenoidectomyVarAttabal = approachLayoutModifierNodeSaneness.gintrap(dernVar, dispope(), constraints);
            dispope().balance(false);
            int width = arytenoidectomyVarAttabal.getWidth();
            yemenite lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            if (width == lookaheadDelegate.getWidth()) {
                int height = arytenoidectomyVarAttabal.getHeight();
                yemenite lookaheadDelegate2 = getLookaheadDelegate();
                Intrinsics.beachfront(lookaheadDelegate2);
                z = height == lookaheadDelegate2.getHeight();
            }
            if (!dernVar.getApproachMeasureRequired()) {
                long jTriweekly = dispope().triweekly();
                yemenite lookaheadDelegate3 = dispope().getLookaheadDelegate();
                if (milliradian.monoploid.wireman(jTriweekly, lookaheadDelegate3 != null ? milliradian.monoploid.saneness(lookaheadDelegate3.molet()) : null) && !z) {
                    arytenoidectomyVarAttabal = new dern(arytenoidectomyVarAttabal, this);
                }
            }
        } else {
            arytenoidectomyVarAttabal = getLayoutModifierNode().attabal(this, dispope(), constraints);
        }
        bavaria(arytenoidectomyVarAttabal);
        livable();
        return this;
    }

    /* JADX INFO: renamed from: sulfarsenide, reason: from getter */
    public final graveside getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void tarboosh() {
        if (getLookaheadDelegate() == null) {
            premed(new saneness());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.gintrap
    public void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
        super.treadless(position, zIndex, layerBlock);
        inrooted();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: vir, reason: from getter */
    public yemenite getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final void wittig(graveside gravesideVar) {
        if (!Intrinsics.wireman(gravesideVar, this.layoutModifierNode)) {
            androidx.compose.ui.attabal.dern node = gravesideVar.getNode();
            if ((node.getKindSet() & saran.attabal(512)) != 0) {
                Intrinsics.competently(gravesideVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) gravesideVar;
                androidx.compose.ui.layout.dern dernVar = this.approachMeasureScope;
                if (dernVar != null) {
                    dernVar.cutely(approachLayoutModifierNode);
                } else {
                    dernVar = new androidx.compose.ui.layout.dern(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = dernVar;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = gravesideVar;
    }
}
