package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.lotta;
import restrictive.sayid;

/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010$J:\u0010.\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\bR \u00107\u001a\u0002018\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010\b\u001a\u0004\b4\u00105R.\u0010?\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/arytenoidectomy;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "tarboosh", "()V", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/gintrap;", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "nosophobia", "(Landroidx/compose/ui/layout/attabal;)I", "Lrestrictive/creditor;", "canvas", "graphicsLayer", "murrine", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "hitTestSource", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "", "isTouchEvent", "isInLayer", "harlequinade", "(Landroidx/compose/ui/node/NodeCoordinator$wireman;JLandroidx/compose/ui/node/triweekly;ZZ)V", "sulfarsenide", "Landroidx/compose/ui/node/treadless;", "lerp", "Landroidx/compose/ui/node/treadless;", "garter", "()Landroidx/compose/ui/node/treadless;", "getTail$annotations", "tail", "Landroidx/compose/ui/node/yemenite;", "<set-?>", "Landroidx/compose/ui/node/yemenite;", "vir", "()Landroidx/compose/ui/node/yemenite;", "aristocrat", "(Landroidx/compose/ui/node/yemenite;)V", "lookaheadDelegate", "lotta", "attabal", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class arytenoidectomy extends NodeCoordinator {

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public static final lotta f6995sayid;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name and from kotlin metadata */
    public final treadless tail;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name and from kotlin metadata */
    public yemenite lookaheadDelegate;

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/arytenoidectomy$saneness;", "Landroidx/compose/ui/node/yemenite;", "<init>", "(Landroidx/compose/ui/node/arytenoidectomy;)V", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/gintrap;", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "nosophobia", "(Landroidx/compose/ui/layout/attabal;)I", "", "sakeen", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class saneness extends yemenite {
        public saneness() {
            super(arytenoidectomy.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int nosophobia(androidx.compose.ui.layout.attabal alignmentLine) {
            Integer num = setterwort().wireman().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            attendance().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.yemenite
        public void sakeen() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = getLayoutNode().grimness();
            Intrinsics.beachfront(lookaheadPassDelegateGrimness);
            lookaheadPassDelegateGrimness.achondroplasia();
        }

        @Override // androidx.compose.ui.layout.triweekly
        public androidx.compose.ui.layout.gintrap sealless(long constraints) {
            coffeecake(constraints);
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = getLayoutNode().coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = layoutNodeArrApical[i].grimness();
                    Intrinsics.beachfront(lookaheadPassDelegateGrimness);
                    lookaheadPassDelegateGrimness.technofreak(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < size);
            }
            osteal(getLayoutNode().getMeasurePolicy().attabal(this, getLayoutNode().dovishness(), constraints));
            return this;
        }
    }

    static {
        lotta lottaVarAttabal = restrictive.seminary.attabal();
        lottaVarAttabal.formularize(restrictive.overspeculate.INSTANCE.dern());
        lottaVarAttabal.gintrap(1.0f);
        lottaVarAttabal.dovishness(sayid.INSTANCE.saneness());
        f6995sayid = lottaVarAttabal;
    }

    public arytenoidectomy(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new treadless();
        puffin().sensatory(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new saneness() : null;
    }

    public void aristocrat(yemenite yemeniteVar) {
        this.lookaheadDelegate = yemeniteVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: garter, reason: from getter and merged with bridge method [inline-methods] */
    public treadless puffin() {
        return this.tail;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public void harlequinade(NodeCoordinator.wireman hitTestSource, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z;
        boolean z2 = false;
        if (hitTestSource.wireman(getLayoutNode())) {
            if (eyepiece(pointerPosition)) {
                z = isInLayer;
            } else {
                if (isTouchEvent) {
                    float fMicrochemistry = microchemistry(pointerPosition, twybill());
                    if (!Float.isInfinite(fMicrochemistry) && !Float.isNaN(fMicrochemistry)) {
                        z = false;
                    }
                }
                z = isInLayer;
            }
            z2 = true;
        } else {
            z = isInLayer;
        }
        if (z2) {
            int i = hitTestResult.hitDepth;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarItchy = getLayoutNode().itchy();
            int size = dernVarItchy.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarItchy.apical();
                int i2 = size - 1;
                do {
                    LayoutNode layoutNode = layoutNodeArrApical[i2];
                    if (layoutNode.attabal()) {
                        hitTestSource.dern(layoutNode, pointerPosition, hitTestResult, isTouchEvent, z);
                        if (!hitTestResult.kowloon()) {
                            i2--;
                        } else {
                            if (!hitTestResult.getShouldSharePointerInputWithSibling()) {
                                break;
                            }
                            hitTestResult.saneness();
                            i2--;
                        }
                    } else {
                        i2--;
                    }
                } while (i2 >= 0);
            }
            hitTestResult.hitDepth = i;
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.gintrap
    public void milliradian(long position, float zIndex, GraphicsLayer layer) {
        super.milliradian(position, zIndex, layer);
        sulfarsenide();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void murrine(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        peridotite peridotiteVarSaneness = cuirassed.saneness(getLayoutNode());
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarItchy = getLayoutNode().itchy();
        int size = dernVarItchy.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarItchy.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                if (layoutNode.attabal()) {
                    layoutNode.polloi(canvas, graphicsLayer);
                }
                i++;
            } while (i < size);
        }
        if (peridotiteVarSaneness.getShowLayoutBounds()) {
            cosy(canvas, f6995sayid);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int nosophobia(androidx.compose.ui.layout.attabal alignmentLine) {
        yemenite lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.nosophobia(alignmentLine);
        }
        Integer num = stupefactive().wireman().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.triweekly
    public androidx.compose.ui.layout.gintrap sealless(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            yemenite lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            constraints = lookaheadDelegate.homozygous();
        }
        coffeecake(constraints);
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = getLayoutNode().coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                layoutNodeArrApical[i].creditor().attendance(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
        }
        bavaria(getLayoutNode().getMeasurePolicy().attabal(this, getLayoutNode().gintrap(), constraints));
        livable();
        return this;
    }

    public final void sulfarsenide() {
        if (getIsShallowPlacing()) {
            return;
        }
        nomenclative();
        getLayoutNode().creditor().technofreak();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void tarboosh() {
        if (getLookaheadDelegate() == null) {
            aristocrat(new saneness());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.gintrap
    public void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
        super.treadless(position, zIndex, layerBlock);
        sulfarsenide();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: vir, reason: from getter */
    public yemenite getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }
}
