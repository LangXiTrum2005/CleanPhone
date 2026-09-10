package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.supplicat;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import restrictive.treadless;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH$ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R0\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020&8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R*\u0010-\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0014\u00101\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/ui/layout/gintrap;", "", "<init>", "()V", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Lrestrictive/treadless;", "", "layerBlock", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "timberyard", "", "<set-?>", "kowloon", "I", "premeiotic", "()I", "width", "arytenoidectomy", "overspeculate", "height", "Lmilliradian/monoploid;", "value", "monoploid", "J", "dent", "()J", "itchy", "(J)V", "measuredSize", "Lmilliradian/saneness;", "polloi", "cultivated", "coffeecake", "measurementConstraints", "molybdenite", "splinterproof", "apparentToRealOffset", "permissivist", "measuredWidth", "clubfoot", "measuredHeight", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class gintrap {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public long measuredSize = milliradian.polloi.attabal(0, 0);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public long measurementConstraints = PlaceableKt.f6732saneness;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public long apparentToRealOffset = milliradian.impassible.INSTANCE.attabal();

    /* JADX INFO: compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0012\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0017\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u0019\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/gintrap$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/layout/gintrap;", "", "beachfront", "(Landroidx/compose/ui/layout/gintrap;)V", "", "x", "y", "", "zIndex", "apical", "(Landroidx/compose/ui/layout/gintrap;IIF)V", "competently", "Lmilliradian/impassible;", X3.i.L, "taiyuan", "(Landroidx/compose/ui/layout/gintrap;JF)V", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "impassible", "(Landroidx/compose/ui/layout/gintrap;IIFLkotlin/jvm/functions/Function1;)V", "kowloon", "(Landroidx/compose/ui/layout/gintrap;JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "arytenoidectomy", "(Landroidx/compose/ui/layout/gintrap;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "", "attabal", "Z", "motionFrameOfReferencePlacement", "marial", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "wireman", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean motionFrameOfReferencePlacement;

        public static /* synthetic */ void cutely(attabal attabalVar, gintrap gintrapVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            attabalVar.taiyuan(gintrapVar, j, f);
        }

        public static /* synthetic */ void formularize(attabal attabalVar, gintrap gintrapVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            attabalVar.apical(gintrapVar, i, i2, f);
        }

        public static /* synthetic */ void impromptu(attabal attabalVar, gintrap gintrapVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            attabalVar.competently(gintrapVar, i, i2, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void triweekly(attabal attabalVar, gintrap gintrapVar, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.f6731attabal;
            }
            attabalVar.impassible(gintrapVar, i, i2, f2, function1);
        }

        public final void apical(gintrap gintrapVar, int i, int i2, float f) {
            long jAttabal = milliradian.triweekly.attabal(i, i2);
            if (wireman() == LayoutDirection.Ltr || marial() == 0) {
                beachfront(gintrapVar);
                gintrapVar.treadless(milliradian.impassible.competently(jAttabal, gintrapVar.apparentToRealOffset), f, null);
            } else {
                long jAttabal2 = milliradian.triweekly.attabal((marial() - gintrapVar.getWidth()) - milliradian.impassible.wireman(jAttabal), milliradian.impassible.marial(jAttabal));
                beachfront(gintrapVar);
                gintrapVar.treadless(milliradian.impassible.competently(jAttabal2, gintrapVar.apparentToRealOffset), f, null);
            }
        }

        public final void arytenoidectomy(gintrap gintrapVar, long j, GraphicsLayer graphicsLayer, float f) {
            beachfront(gintrapVar);
            gintrapVar.milliradian(milliradian.impassible.competently(j, gintrapVar.apparentToRealOffset), f, graphicsLayer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void beachfront(gintrap gintrapVar) {
            if (gintrapVar instanceof supplicat) {
                ((supplicat) gintrapVar).privatdozent(this.motionFrameOfReferencePlacement);
            }
        }

        public final void competently(gintrap gintrapVar, int i, int i2, float f) {
            long jAttabal = milliradian.triweekly.attabal(i, i2);
            beachfront(gintrapVar);
            gintrapVar.treadless(milliradian.impassible.competently(jAttabal, gintrapVar.apparentToRealOffset), f, null);
        }

        public final void impassible(gintrap gintrapVar, int i, int i2, float f, Function1<? super treadless, Unit> function1) {
            long jAttabal = milliradian.triweekly.attabal(i, i2);
            if (wireman() == LayoutDirection.Ltr || marial() == 0) {
                beachfront(gintrapVar);
                gintrapVar.treadless(milliradian.impassible.competently(jAttabal, gintrapVar.apparentToRealOffset), f, function1);
            } else {
                long jAttabal2 = milliradian.triweekly.attabal((marial() - gintrapVar.getWidth()) - milliradian.impassible.wireman(jAttabal), milliradian.impassible.marial(jAttabal));
                beachfront(gintrapVar);
                gintrapVar.treadless(milliradian.impassible.competently(jAttabal2, gintrapVar.apparentToRealOffset), f, function1);
            }
        }

        public final void kowloon(gintrap gintrapVar, long j, float f, Function1<? super treadless, Unit> function1) {
            beachfront(gintrapVar);
            gintrapVar.treadless(milliradian.impassible.competently(j, gintrapVar.apparentToRealOffset), f, function1);
        }

        public abstract int marial();

        public final void taiyuan(gintrap gintrapVar, long j, float f) {
            beachfront(gintrapVar);
            gintrapVar.treadless(milliradian.impassible.competently(j, gintrapVar.apparentToRealOffset), f, null);
        }

        public abstract LayoutDirection wireman();
    }

    public int clubfoot() {
        return milliradian.monoploid.beachfront(this.measuredSize);
    }

    public final void coffeecake(long j) {
        if (milliradian.saneness.wireman(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        timberyard();
    }

    /* JADX INFO: renamed from: cultivated, reason: from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: dent, reason: from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    public final void itchy(long j) {
        if (milliradian.monoploid.marial(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        timberyard();
    }

    public void milliradian(long position, float zIndex, GraphicsLayer layer) {
        treadless(position, zIndex, null);
    }

    /* JADX INFO: renamed from: overspeculate, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int permissivist() {
        return milliradian.monoploid.competently(this.measuredSize);
    }

    /* JADX INFO: renamed from: premeiotic, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: splinterproof, reason: from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final void timberyard() {
        this.width = p002kotlin.ranges.wireman.apical(milliradian.monoploid.competently(this.measuredSize), milliradian.saneness.cutely(this.measurementConstraints), milliradian.saneness.impromptu(this.measurementConstraints));
        this.height = p002kotlin.ranges.wireman.apical(milliradian.monoploid.beachfront(this.measuredSize), milliradian.saneness.taiyuan(this.measurementConstraints), milliradian.saneness.competently(this.measurementConstraints));
        this.apparentToRealOffset = milliradian.triweekly.attabal((this.width - milliradian.monoploid.competently(this.measuredSize)) / 2, (this.height - milliradian.monoploid.beachfront(this.measuredSize)) / 2);
    }

    public abstract void treadless(long position, float zIndex, Function1<? super treadless, Unit> layerBlock);
}
