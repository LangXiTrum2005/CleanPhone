package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.premeiotic;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.timberyard;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010 \u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00102R\u0014\u0010H\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u00102R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0017\u0010T\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0011\u0010[\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bZ\u0010OR\u0014\u0010]\u001a\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010OR\u0014\u0010_\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0011\u0010a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b`\u00108R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/attabal$dern;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/apical;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/attabal$dern;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/apical;)V", "mergedConfig", "", "stratoscope", "(Landroidx/compose/ui/semantics/apical;)V", "", "list", "includeDeactivatedNodes", "wireman", "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V", "", "beachfront", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "saneness", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/impromptu;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/monoploid;", "properties", "dern", "(Landroidx/compose/ui/semantics/impromptu;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "includeFakeNodes", "trm", "(ZZ)Ljava/util/List;", "includeReplacedSemantics", "formularize", "(ZZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "marial", "()Landroidx/compose/ui/node/NodeCoordinator;", "attabal", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/attabal$dern;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/attabal$dern;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "monoploid", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/apical;", "gintrap", "()Landroidx/compose/ui/semantics/apical;", "rotuma", "setFake$ui_release", "(Z)V", "isFake", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", "", "competently", "I", "kowloon", "()I", "id", "preprohormone", "isMergingSemanticsOfDescendants", "cuirassed", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/taiyuan;", "arytenoidectomy", "()Landroidx/compose/ui/layout/taiyuan;", "layoutInfo", "Lsupplicat/taiyuan;", "dovishness", "()Lsupplicat/taiyuan;", "touchBoundsInRoot", "Lmilliradian/monoploid;", "adultoid", "()J", "size", "taiyuan", "boundsInRoot", "Lsupplicat/competently;", "molybdenite", "positionInRoot", "cutely", "boundsInWindow", "impromptu", "boundsInParent", "cord", "isTransparent", "triweekly", "config", "apical", "()Ljava/util/List;", "children", "graveside", "replacedChildren", "polloi", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsNode {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal.dern outerSemanticsNode;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public SemanticsNode fakeNodeParent;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean isFake;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean mergingEnabled;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final apical unmergedConfig;

    /* JADX INFO: compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$attabal", "Landroidx/compose/ui/node/premeiotic;", "Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/semantics/monoploid;", "", "polder", "(Landroidx/compose/ui/semantics/monoploid;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends androidx.compose.ui.attabal.dern implements premeiotic {

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public final /* synthetic */ Function1<monoploid, Unit> f7557stratoscope;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function1<? super monoploid, Unit> function1) {
            this.f7557stratoscope = function1;
        }

        @Override // androidx.compose.ui.node.premeiotic
        public void polder(monoploid monoploidVar) {
            this.f7557stratoscope.invoke(monoploidVar);
        }
    }

    public SemanticsNode(androidx.compose.ui.attabal.dern dernVar, boolean z, LayoutNode layoutNode, apical apicalVar) {
        this.outerSemanticsNode = dernVar;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = apicalVar;
        this.id = layoutNode.getSemanticsId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List competently(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.beachfront(list);
    }

    public static /* synthetic */ List impassible(SemanticsNode semanticsNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.formularize(z, z2, z3);
    }

    public static /* synthetic */ List oilcan(SemanticsNode semanticsNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.trm(z, z2);
    }

    public final long adultoid() {
        NodeCoordinator nodeCoordinatorMarial = marial();
        return nodeCoordinatorMarial != null ? nodeCoordinatorMarial.triweekly() : milliradian.monoploid.INSTANCE.attabal();
    }

    public final List<SemanticsNode> apical() {
        return impassible(this, false, false, false, 7, null);
    }

    public final androidx.compose.ui.layout.taiyuan arytenoidectomy() {
        return this.layoutNode;
    }

    public final SemanticsNode attabal() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final List<SemanticsNode> beachfront(List<SemanticsNode> list) {
        List listOilcan = oilcan(this, false, false, 3, null);
        int size = listOilcan.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) listOilcan.get(i);
            if (semanticsNode.preprohormone()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.beachfront(list);
            }
        }
        return list;
    }

    public final boolean cord() {
        NodeCoordinator nodeCoordinatorMarial = marial();
        if (nodeCoordinatorMarial != null) {
            return nodeCoordinatorMarial.likeable();
        }
        return false;
    }

    public final boolean cuirassed() {
        return !this.isFake && graveside().isEmpty() && triweekly.beachfront(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                apical apicalVarPreprohormone = layoutNode.preprohormone();
                boolean z = false;
                if (apicalVarPreprohormone != null && apicalVarPreprohormone.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) == null;
    }

    public final supplicat.taiyuan cutely() {
        supplicat.taiyuan taiyuanVarDern;
        NodeCoordinator nodeCoordinatorMarial = marial();
        if (nodeCoordinatorMarial != null) {
            if (!nodeCoordinatorMarial.impassible()) {
                nodeCoordinatorMarial = null;
            }
            if (nodeCoordinatorMarial != null && (taiyuanVarDern = androidx.compose.ui.layout.impromptu.dern(nodeCoordinatorMarial)) != null) {
                return taiyuanVarDern;
            }
        }
        return supplicat.taiyuan.INSTANCE.attabal();
    }

    public final SemanticsNode dern(impromptu role, Function1<? super monoploid, Unit> properties) {
        apical apicalVar = new apical();
        apicalVar.monoploid(false);
        apicalVar.arytenoidectomy(false);
        properties.invoke(apicalVar);
        SemanticsNode semanticsNode = new SemanticsNode(new attabal(properties), false, new LayoutNode(true, role != null ? triweekly.taiyuan(this) : triweekly.marial(this)), apicalVar);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    public final supplicat.taiyuan dovishness() {
        androidx.compose.ui.node.marial marialVarCompetently;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (marialVarCompetently = triweekly.competently(this.layoutNode)) == null) {
            marialVarCompetently = this.outerSemanticsNode;
        }
        return timberyard.dern(marialVarCompetently.getNode(), timberyard.attabal(this.unmergedConfig));
    }

    public final List<SemanticsNode> formularize(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) {
            return preprohormone() ? competently(this, null, 1, null) : trm(includeFakeNodes, includeDeactivatedNodes);
        }
        return adultoid.formularize();
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final apical getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public final List<SemanticsNode> graveside() {
        return impassible(this, false, true, false, 4, null);
    }

    public final supplicat.taiyuan impromptu() {
        androidx.compose.ui.layout.competently competentlyVarSensatory;
        SemanticsNode semanticsNodePolloi = polloi();
        if (semanticsNodePolloi == null) {
            return supplicat.taiyuan.INSTANCE.attabal();
        }
        NodeCoordinator nodeCoordinatorMarial = marial();
        if (nodeCoordinatorMarial != null) {
            if (!nodeCoordinatorMarial.impassible()) {
                nodeCoordinatorMarial = null;
            }
            if (nodeCoordinatorMarial != null && (competentlyVarSensatory = nodeCoordinatorMarial.sensatory()) != null) {
                return androidx.compose.ui.layout.competently.beachfront(androidx.compose.ui.node.beachfront.competently(semanticsNodePolloi.outerSemanticsNode, saran.attabal(8)), competentlyVarSensatory, false, 2, null);
            }
        }
        return supplicat.taiyuan.INSTANCE.attabal();
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final NodeCoordinator marial() {
        if (this.isFake) {
            SemanticsNode semanticsNodePolloi = polloi();
            if (semanticsNodePolloi != null) {
                return semanticsNodePolloi.marial();
            }
            return null;
        }
        androidx.compose.ui.node.marial marialVarCompetently = triweekly.competently(this.layoutNode);
        if (marialVarCompetently == null) {
            marialVarCompetently = this.outerSemanticsNode;
        }
        return androidx.compose.ui.node.beachfront.competently(marialVarCompetently, saran.attabal(8));
    }

    public final long molybdenite() {
        NodeCoordinator nodeCoordinatorMarial = marial();
        if (nodeCoordinatorMarial != null) {
            if (!nodeCoordinatorMarial.impassible()) {
                nodeCoordinatorMarial = null;
            }
            if (nodeCoordinatorMarial != null) {
                return androidx.compose.ui.layout.impromptu.marial(nodeCoordinatorMarial);
            }
        }
        return supplicat.competently.INSTANCE.dern();
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final SemanticsNode polloi() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeBeachfront = this.mergingEnabled ? triweekly.beachfront(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                apical apicalVarPreprohormone = layoutNode.preprohormone();
                boolean z = false;
                if (apicalVarPreprohormone != null && apicalVarPreprohormone.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) : null;
        if (layoutNodeBeachfront == null) {
            layoutNodeBeachfront = triweekly.beachfront(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.getNodes().monoploid(saran.attabal(8)));
                }
            });
        }
        if (layoutNodeBeachfront == null) {
            return null;
        }
        return triweekly.attabal(layoutNodeBeachfront, this.mergingEnabled);
    }

    public final boolean preprohormone() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    /* JADX INFO: renamed from: rotuma, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final void saneness(List<SemanticsNode> unmergedChildren) {
        final impromptu impromptuVarImpromptu = triweekly.impromptu(this);
        if (impromptuVarImpromptu != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(dern(impromptuVarImpromptu, new Function1<monoploid, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(monoploid monoploidVar) {
                    invoke2(monoploidVar);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(monoploid monoploidVar) {
                    arytenoidectomy.wireman(monoploidVar, impromptuVarImpromptu.getValue());
                }
            }));
        }
        apical apicalVar = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (apicalVar.marial(semanticsProperties.wireman()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.attabal(this.unmergedConfig, semanticsProperties.wireman());
            final String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str != null) {
                unmergedChildren.add(0, dern(null, new Function1<monoploid, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(monoploid monoploidVar) {
                        invoke2(monoploidVar);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(monoploid monoploidVar) {
                        arytenoidectomy.dern(monoploidVar, str);
                    }
                }));
            }
        }
    }

    public final void stratoscope(apical mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listOilcan = oilcan(this, false, false, 3, null);
        int size = listOilcan.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) listOilcan.get(i);
            if (!semanticsNode.preprohormone()) {
                mergedConfig.kowloon(semanticsNode.unmergedConfig);
                semanticsNode.stratoscope(mergedConfig);
            }
        }
    }

    public final supplicat.taiyuan taiyuan() {
        supplicat.taiyuan taiyuanVarSaneness;
        NodeCoordinator nodeCoordinatorMarial = marial();
        if (nodeCoordinatorMarial != null) {
            if (!nodeCoordinatorMarial.impassible()) {
                nodeCoordinatorMarial = null;
            }
            if (nodeCoordinatorMarial != null && (taiyuanVarSaneness = androidx.compose.ui.layout.impromptu.saneness(nodeCoordinatorMarial)) != null) {
                return taiyuanVarSaneness;
            }
        }
        return supplicat.taiyuan.INSTANCE.attabal();
    }

    public final apical triweekly() {
        if (!preprohormone()) {
            return this.unmergedConfig;
        }
        apical apicalVarCompetently = this.unmergedConfig.competently();
        stratoscope(apicalVarCompetently);
        return apicalVarCompetently;
    }

    public final List<SemanticsNode> trm(boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList();
        wireman(this.layoutNode, arrayList, includeDeactivatedNodes);
        if (includeFakeNodes) {
            saneness(arrayList);
        }
        return arrayList;
    }

    public final void wireman(LayoutNode layoutNode, List<SemanticsNode> list, boolean z) {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarItchy = layoutNode.itchy();
        int size = dernVarItchy.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarItchy.apical();
            int i = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArrApical[i];
                if (layoutNode2.picketboat() && (z || !layoutNode2.getIsDeactivated())) {
                    if (layoutNode2.getNodes().monoploid(saran.attabal(8))) {
                        list.add(triweekly.attabal(layoutNode2, this.mergingEnabled));
                    } else {
                        wireman(layoutNode2, list, z);
                    }
                }
                i++;
            } while (i < size);
        }
    }
}
