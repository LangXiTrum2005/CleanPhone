package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.claque;
import androidx.compose.ui.platform.homozygous;
import androidx.compose.ui.platform.outmarry;
import androidx.compose.ui.platform.unconsolidated;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0003\u0017\u0096\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010#\u001a\u00020\"2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\b0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010\u000eJ\u001d\u0010)\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH&¢\u0006\u0004\b+\u0010&J\u0017\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020,H&¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010R\u001a\u00020N8gX§\u0004¢\u0006\f\u0012\u0004\bQ\u0010&\u001a\u0004\bO\u0010PR\u001c\u0010W\u001a\u0004\u0018\u00010S8gX§\u0004¢\u0006\f\u0012\u0004\bV\u0010&\u001a\u0004\bT\u0010UR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u001a\u0010t\u001a\u00020p8&X§\u0004¢\u0006\f\u0012\u0004\bs\u0010&\u001a\u0004\bq\u0010rR\u0014\u0010x\u001a\u00020u8&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R&\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010}\u001a\u00020\u00048&@gX¦\u000e¢\u0006\r\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010\u0018R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0097\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/peridotite;", "Lstarveling/yemenite;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "", "polloi", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "wireman", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "competently", "(Landroidx/compose/ui/node/LayoutNode;)V", "node", "arytenoidectomy", "molybdenite", "Lsupplicat/competently;", "localPosition", "beachfront", "(J)J", "sendPointerUpdate", "attabal", "(Z)V", "taiyuan", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "Lkotlin/Function2;", "Lrestrictive/creditor;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Landroidx/compose/ui/node/walach;", "kowloon", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Landroidx/compose/ui/node/walach;", "rotuma", "()V", "impromptu", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "adultoid", "(Lkotlin/jvm/functions/Function0;)V", "gintrap", "Landroidx/compose/ui/node/peridotite$saneness;", "impassible", "(Landroidx/compose/ui/node/peridotite$saneness;)V", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/cord;", "getSharedDrawScope", "()Landroidx/compose/ui/node/cord;", "sharedDrawScope", "Lgrimness/attabal;", "getHapticFeedBack", "()Lgrimness/attabal;", "hapticFeedBack", "Lsaran/saneness;", "getInputModeManager", "()Lsaran/saneness;", "inputModeManager", "Landroidx/compose/ui/platform/hydrovane;", "getClipboardManager", "()Landroidx/compose/ui/platform/hydrovane;", "clipboardManager", "Landroidx/compose/ui/platform/impromptu;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/impromptu;", "accessibilityManager", "Lrestrictive/milliradian;", "getGraphicsContext", "()Lrestrictive/milliradian;", "graphicsContext", "Landroidx/compose/ui/platform/claque;", "getTextToolbar", "()Landroidx/compose/ui/platform/claque;", "textToolbar", "Lsealless/preprohormone;", "getAutofillTree", "()Lsealless/preprohormone;", "getAutofillTree$annotations", "autofillTree", "Lsealless/impromptu;", "getAutofill", "()Lsealless/impromptu;", "getAutofill$annotations", "autofill", "Lmilliradian/wireman;", "getDensity", "()Lmilliradian/wireman;", "density", "Landroidx/compose/ui/text/input/oilcan;", "getTextInputService", "()Landroidx/compose/ui/text/input/oilcan;", "textInputService", "Landroidx/compose/ui/platform/unconsolidated;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/unconsolidated;", "softwareKeyboardController", "Lstarveling/polloi;", "getPointerIconService", "()Lstarveling/polloi;", "pointerIconService", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/homozygous;", "getWindowInfo", "()Landroidx/compose/ui/platform/homozygous;", "windowInfo", "Landroidx/compose/ui/text/font/impromptu$saneness;", "getFontLoader", "()Landroidx/compose/ui/text/font/impromptu$saneness;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/taiyuan$saneness;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/taiyuan$saneness;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/outmarry;", "getViewConfiguration", "()Landroidx/compose/ui/platform/outmarry;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/layout/gintrap$attabal;", "getPlacementScope", "()Landroidx/compose/ui/layout/gintrap$attabal;", "placementScope", "Landroidx/compose/ui/draganddrop/dern;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/dern;", "dragAndDropManager", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface peridotite extends starveling.yemenite {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7016attabal;

    /* JADX INFO: renamed from: androidx.compose.ui.node.peridotite$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/peridotite$attabal;", "", "<init>", "()V", "", "saneness", "Z", "attabal", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f7016attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static boolean enableExtraAssertions;

        public final boolean attabal() {
            return enableExtraAssertions;
        }
    }

    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/peridotite$saneness;", "", "", "wireman", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness {
        void wireman();
    }

    static /* synthetic */ void cutely(peridotite peridotiteVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        peridotiteVar.taiyuan(layoutNode, z);
    }

    static /* synthetic */ walach formularize(peridotite peridotiteVar, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        return peridotiteVar.kowloon(function2, function0, graphicsLayer);
    }

    static /* synthetic */ void marial(peridotite peridotiteVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        peridotiteVar.wireman(layoutNode, z, z2);
    }

    static /* synthetic */ void preprohormone(peridotite peridotiteVar, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        peridotiteVar.polloi(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void saneness(peridotite peridotiteVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        peridotiteVar.attabal(z);
    }

    void adultoid(Function0<Unit> listener);

    void arytenoidectomy(LayoutNode node);

    void attabal(boolean sendPointerUpdate);

    long beachfront(long localPosition);

    void competently(LayoutNode layoutNode);

    androidx.compose.ui.platform.impromptu getAccessibilityManager();

    sealless.impromptu getAutofill();

    sealless.preprohormone getAutofillTree();

    androidx.compose.ui.platform.hydrovane getClipboardManager();

    milliradian.wireman getDensity();

    androidx.compose.ui.draganddrop.dern getDragAndDropManager();

    FocusOwner getFocusOwner();

    androidx.compose.ui.text.font.taiyuan.saneness getFontFamilyResolver();

    androidx.compose.ui.text.font.impromptu.saneness getFontLoader();

    restrictive.milliradian getGraphicsContext();

    grimness.attabal getHapticFeedBack();

    saran.saneness getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    default androidx.compose.ui.layout.gintrap.attabal getPlacementScope() {
        return PlaceableKt.saneness(this);
    }

    starveling.polloi getPointerIconService();

    LayoutNode getRoot();

    cord getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    unconsolidated getSoftwareKeyboardController();

    androidx.compose.ui.text.input.oilcan getTextInputService();

    claque getTextToolbar();

    outmarry getViewConfiguration();

    homozygous getWindowInfo();

    void gintrap();

    void impassible(saneness listener);

    void impromptu(LayoutNode layoutNode);

    walach kowloon(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer);

    void molybdenite(LayoutNode node);

    void polloi(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void rotuma();

    void setShowLayoutBounds(boolean z);

    void taiyuan(LayoutNode layoutNode, boolean affectsLookahead);

    void wireman(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);
}
