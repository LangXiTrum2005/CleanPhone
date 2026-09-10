package androidx.compose.ui.node;

import androidx.compose.ui.layout.PlaceableKt;
import com.ironsource.X3;
import com.ironsource.Y3;
import java.lang.ref.WeakReference;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH ¢\u0006\u0004\b\u001e\u0010\u0005J\u0013\u0010 \u001a\u00020\n*\u00020\u001fH\u0004¢\u0006\u0004\b \u0010!J]\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a0$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u0017\u0010H\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR:\u0010R\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010]\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u00108R\u0014\u0010`\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010m\u001a\u0002048VX\u0096\u0004¢\u0006\f\u0012\u0004\bl\u0010\u0005\u001a\u0004\bk\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/gintrap;", "", "Landroidx/compose/ui/node/supplicat;", "<init>", "()V", "Landroidx/compose/ui/layout/cord;", "ruler", "empress", "(Landroidx/compose/ui/layout/cord;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "monroe", "(Landroidx/compose/ui/layout/cord;)V", "Landroidx/compose/ui/node/clubfoot;", "placeableResult", "lotta", "(Landroidx/compose/ui/node/clubfoot;)V", "Landroidx/collection/saran;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/WeakReference;", "layoutNodes", "hardpan", "(Landroidx/collection/saran;)V", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "coi", "(Landroidx/compose/ui/layout/attabal;)I", "nosophobia", "herdbook", "Landroidx/compose/ui/node/NodeCoordinator;", "lightstruck", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/cuirassed;", "rulers", "Landroidx/compose/ui/layout/gintrap$attabal;", "placementBlock", "Landroidx/compose/ui/layout/arytenoidectomy;", "polder", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/arytenoidectomy;", "result", "sayid", "(Landroidx/compose/ui/layout/arytenoidectomy;)V", "graveside", "Landroidx/compose/ui/layout/cuirassed;", "_rulerScope", "", "adultoid", "Z", "achondroplasia", "()Z", "privatdozent", "(Z)V", "isPlacedUnderMotionFrameOfReference", "dovishness", "claque", "outmarry", "isShallowPlacing", "gintrap", "unconsolidated", "technofreak", "isPlacingForAlignment", "rotuma", "Landroidx/compose/ui/layout/gintrap$attabal;", "gusty", "()Landroidx/compose/ui/layout/gintrap$attabal;", "placementScope", "Landroidx/collection/merc;", "preprohormone", "Landroidx/collection/merc;", "rulerValues", "cord", "rulerValuesCache", "Landroidx/collection/grimness;", "cuirassed", "Landroidx/collection/grimness;", "rulerReaders", "Lmilliradian/impassible;", "picketboat", "()J", X3.i.L, "czestochowa", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "igbo", "parent", "underbelly", "hasMeasureResult", "preterite", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/competently;", "sensatory", "()Landroidx/compose/ui/layout/competently;", Y3.f, "palmyra", "()Landroidx/compose/ui/layout/cuirassed;", "rulerScope", "wostteth", "()Landroidx/compose/ui/layout/arytenoidectomy;", "measureResult", "julian", "isLookingAhead$annotations", "isLookingAhead", "stratoscope", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LookaheadCapablePlaceable extends androidx.compose.ui.layout.gintrap implements androidx.compose.ui.layout.monoploid, supplicat {

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final Function1<PlaceableResult, Unit> f6923trm = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.oilcan()) {
                placeableResult.getPlaceable().lotta(placeableResult);
            }
        }
    };

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.merc<androidx.compose.ui.layout.cord> rulerValuesCache;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.grimness<androidx.compose.ui.layout.cord, androidx.collection.saran<WeakReference<LayoutNode>>> rulerReaders;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean isShallowPlacing;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public boolean isPlacingForAlignment;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.cuirassed _rulerScope;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.merc<androidx.compose.ui.layout.cord> rulerValues;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.layout.gintrap.attabal placementScope = PlaceableKt.attabal(this);

    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/ui/node/LookaheadCapablePlaceable$dern", "Landroidx/compose/ui/layout/cuirassed;", "", "getDensity", "()F", "density", "kattegat", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern implements androidx.compose.ui.layout.cuirassed {
        public dern() {
        }

        @Override // milliradian.wireman
        public float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // milliradian.apical
        /* JADX INFO: renamed from: kattegat */
        public float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }
    }

    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/node/LookaheadCapablePlaceable$saneness", "Landroidx/compose/ui/layout/arytenoidectomy;", "", "dern", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/attabal;", "saneness", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/cuirassed;", "wireman", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements androidx.compose.ui.layout.arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f6933attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ LookaheadCapablePlaceable f6934beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Map<androidx.compose.ui.layout.attabal, Integer> f6935dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Function1<androidx.compose.ui.layout.gintrap.attabal, Unit> f6936marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f6937saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ Function1<androidx.compose.ui.layout.cuirassed, Unit> f6938wireman;

        /* JADX WARN: Multi-variable type inference failed */
        public saneness(int i, int i2, Map<androidx.compose.ui.layout.attabal, Integer> map, Function1<? super androidx.compose.ui.layout.cuirassed, Unit> function1, Function1<? super androidx.compose.ui.layout.gintrap.attabal, Unit> function2, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
            this.f6933attabal = i;
            this.f6937saneness = i2;
            this.f6935dern = map;
            this.f6938wireman = function1;
            this.f6936marial = function2;
            this.f6934beachfront = lookaheadCapablePlaceable;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public void dern() {
            this.f6936marial.invoke(this.f6934beachfront.getPlacementScope());
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getHeight() {
            return this.f6937saneness;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getWidth() {
            return this.f6933attabal;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Map<androidx.compose.ui.layout.attabal, Integer> saneness() {
            return this.f6935dern;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Function1<androidx.compose.ui.layout.cuirassed, Unit> wireman() {
            return this.f6938wireman;
        }
    }

    /* JADX INFO: renamed from: achondroplasia, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: claque, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final int coi(androidx.compose.ui.layout.attabal alignmentLine) {
        int iNosophobia;
        if (underbelly() && (iNosophobia = nosophobia(alignmentLine)) != Integer.MIN_VALUE) {
            return iNosophobia + milliradian.impassible.marial(getApparentToRealOffset());
        }
        return Integer.MIN_VALUE;
    }

    public abstract LookaheadCapablePlaceable czestochowa();

    public final LookaheadCapablePlaceable empress(androidx.compose.ui.layout.cord ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            androidx.collection.merc<androidx.compose.ui.layout.cord> mercVar = lookaheadCapablePlaceable.rulerValues;
            if (mercVar != null && mercVar.attabal(ruler)) {
                return lookaheadCapablePlaceable;
            }
            LookaheadCapablePlaceable lookaheadCapablePlaceableIgbo = lookaheadCapablePlaceable.igbo();
            if (lookaheadCapablePlaceableIgbo == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableIgbo;
        }
    }

    /* JADX INFO: renamed from: gusty, reason: from getter */
    public final androidx.compose.ui.layout.gintrap.attabal getPlacementScope() {
        return this.placementScope;
    }

    public final void hardpan(androidx.collection.saran<WeakReference<LayoutNode>> layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (julian()) {
                            layoutNode.immediately(false);
                        } else {
                            layoutNode.osteal(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void herdbook();

    public abstract LookaheadCapablePlaceable igbo();

    public boolean julian() {
        return false;
    }

    public final void lightstruck(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLinesSaneness;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.wireman(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.stupefactive().saneness().impassible();
            return;
        }
        attabal attabalVarFormularize = nodeCoordinator.stupefactive().formularize();
        if (attabalVarFormularize == null || (alignmentLinesSaneness = attabalVarFormularize.saneness()) == null) {
            return;
        }
        alignmentLinesSaneness.impassible();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0164 A[LOOP:4: B:67:0x012a->B:81:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0167 A[EDGE_INSN: B:97:0x0167->B:82:0x0167 BREAK  A[LOOP:4: B:67:0x012a->B:81:0x0164], SYNTHETIC] */
    public final void lotta(final PlaceableResult placeableResult) {
        long j;
        long j2;
        LookaheadCapablePlaceable lookaheadCapablePlaceableIgbo;
        long j3;
        androidx.collection.saran<WeakReference<LayoutNode>> saranVarMonoploid;
        OwnerSnapshotObserver snapshotObserver;
        char c;
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<androidx.compose.ui.layout.cuirassed, Unit> function1Wireman = placeableResult.getResult().wireman();
        androidx.collection.grimness<androidx.compose.ui.layout.cord, androidx.collection.saran<WeakReference<LayoutNode>>> grimnessVar = this.rulerReaders;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i = 0;
        if (function1Wireman == null) {
            if (grimnessVar != null) {
                Object[] objArr = grimnessVar.values;
                long[] jArr = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j5 = jArr[i2];
                        if ((((~j5) << c2) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j5 & 255) < 128) {
                                    hardpan((androidx.collection.saran) objArr[(i2 << 3) + i4]);
                                }
                                j5 >>= 8;
                                i4++;
                                c2 = c2;
                            }
                            c = c2;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            c = c2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        c2 = c;
                    }
                }
                grimnessVar.taiyuan();
                return;
            }
            return;
        }
        long j6 = 128;
        androidx.collection.merc<androidx.compose.ui.layout.cord> mercVar = this.rulerValuesCache;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i5 = 1;
        if (mercVar == null) {
            mercVar = new androidx.collection.merc<>(i, i5, defaultConstructorMarker);
            this.rulerValuesCache = mercVar;
        }
        androidx.collection.merc<androidx.compose.ui.layout.cord> mercVar2 = this.rulerValues;
        if (mercVar2 == null) {
            mercVar2 = new androidx.collection.merc<>(i, i5, defaultConstructorMarker);
            this.rulerValues = mercVar2;
        }
        mercVar.arytenoidectomy(mercVar2);
        mercVar2.taiyuan();
        peridotite owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.taiyuan(placeableResult, f6923trm, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    Function1<androidx.compose.ui.layout.cuirassed, Unit> function1Wireman2 = placeableResult.getResult().wireman();
                    if (function1Wireman2 != null) {
                        function1Wireman2.invoke(this.palmyra());
                    }
                }
            });
        }
        if (grimnessVar != null) {
            Object[] objArr2 = mercVar.keys;
            float[] fArr = mercVar.values;
            long[] jArr2 = mercVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j7 = jArr2[i6];
                    j = j4;
                    if ((((~j7) << 7) & j7 & j) != j) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        int i8 = i;
                        while (i8 < i7) {
                            if ((j7 & 255) < j6) {
                                int i9 = (i6 << 3) + i8;
                                androidx.compose.ui.layout.cord cordVar = (androidx.compose.ui.layout.cord) objArr2[i9];
                                j3 = j6;
                                if (mercVar2.marial(cordVar, Float.NaN) != fArr[i9] && (saranVarMonoploid = grimnessVar.monoploid(cordVar)) != null) {
                                    hardpan(saranVarMonoploid);
                                }
                            } else {
                                j3 = j6;
                            }
                            j7 >>= 8;
                            i8++;
                            j6 = j3;
                        }
                        j2 = j6;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        j2 = j6;
                    }
                    if (i6 == length2) {
                        break;
                    }
                    i6++;
                    j4 = j;
                    j6 = j2;
                    i = 0;
                }
            } else {
                j = -9187201950435737472L;
                j2 = 128;
            }
        } else {
            j = -9187201950435737472L;
            j2 = 128;
        }
        Object[] objArr3 = mercVar2.keys;
        long[] jArr3 = mercVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i10 = 0;
            while (true) {
                long j8 = jArr3[i10];
                if ((((~j8) << 7) & j8 & j) == j) {
                    if (i10 != length3) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length3)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j8 & 255) < j2) {
                            androidx.compose.ui.layout.cord cordVar2 = (androidx.compose.ui.layout.cord) objArr3[(i10 << 3) + i12];
                            if (!mercVar.attabal(cordVar2) && (lookaheadCapablePlaceableIgbo = igbo()) != null) {
                                lookaheadCapablePlaceableIgbo.monroe(cordVar2);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length3) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        mercVar.taiyuan();
    }

    public final void monroe(androidx.compose.ui.layout.cord ruler) {
        androidx.collection.grimness<androidx.compose.ui.layout.cord, androidx.collection.saran<WeakReference<LayoutNode>>> grimnessVar = empress(ruler).rulerReaders;
        androidx.collection.saran<WeakReference<LayoutNode>> saranVarMonoploid = grimnessVar != null ? grimnessVar.monoploid(ruler) : null;
        if (saranVarMonoploid != null) {
            hardpan(saranVarMonoploid);
        }
    }

    public abstract int nosophobia(androidx.compose.ui.layout.attabal alignmentLine);

    public final void outmarry(boolean z) {
        this.isShallowPlacing = z;
    }

    public final androidx.compose.ui.layout.cuirassed palmyra() {
        androidx.compose.ui.layout.cuirassed cuirassedVar = this._rulerScope;
        return cuirassedVar == null ? new dern() : cuirassedVar;
    }

    /* JADX INFO: renamed from: picketboat */
    public abstract long getPosition();

    @Override // androidx.compose.ui.layout.monoploid
    public androidx.compose.ui.layout.arytenoidectomy polder(int width, int height, Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines, Function1<? super androidx.compose.ui.layout.cuirassed, Unit> rulers, Function1<? super androidx.compose.ui.layout.gintrap.attabal, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            peridotite.attabal.saneness("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new saneness(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* JADX INFO: renamed from: preterite */
    public abstract LayoutNode getLayoutNode();

    @Override // androidx.compose.ui.node.supplicat
    public void privatdozent(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[LOOP:0: B:10:0x001a->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054 A[EDGE_INSN: B:29:0x0054->B:21:0x0054 BREAK  A[LOOP:0: B:10:0x001a->B:20:0x0051], SYNTHETIC] */
    public final void sayid(androidx.compose.ui.layout.arytenoidectomy result) {
        if (result != null) {
            lotta(new PlaceableResult(result, this));
            return;
        }
        androidx.collection.grimness<androidx.compose.ui.layout.cord, androidx.collection.saran<WeakReference<LayoutNode>>> grimnessVar = this.rulerReaders;
        if (grimnessVar != null) {
            Object[] objArr = grimnessVar.values;
            long[] jArr = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                hardpan((androidx.collection.saran) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        androidx.collection.grimness<androidx.compose.ui.layout.cord, androidx.collection.saran<WeakReference<LayoutNode>>> grimnessVar2 = this.rulerReaders;
        if (grimnessVar2 != null) {
            grimnessVar2.taiyuan();
        }
        androidx.collection.merc<androidx.compose.ui.layout.cord> mercVar = this.rulerValues;
        if (mercVar != null) {
            mercVar.taiyuan();
        }
    }

    public abstract androidx.compose.ui.layout.competently sensatory();

    public final void technofreak(boolean z) {
        this.isPlacingForAlignment = z;
    }

    /* JADX INFO: renamed from: unconsolidated, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    public abstract boolean underbelly();

    public abstract androidx.compose.ui.layout.arytenoidectomy wostteth();
}
