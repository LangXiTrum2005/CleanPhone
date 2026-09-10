package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import supplicat.MutableRect;

/* JADX INFO: compiled from: GraphicsLayerOwnerLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ!\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010%J\"\u0010*\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J9\u00100\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u0010%J\u000f\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b3\u0010%J\u0015\u00105\u001a\u000204H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0004\u0018\u000104H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u0010%J\u0017\u00109\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b9\u0010:R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010;R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010=R,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010I\u001a\u0002048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010K\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bJ\u0010HR$\u0010P\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bM\u0010E\"\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0012\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001c\u0010b\u001a\u00020`8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\ba\u0010CR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010ER \u0010u\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u000b0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/walach;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Lrestrictive/milliradian;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lrestrictive/creditor;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lrestrictive/milliradian;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Lrestrictive/underbelly;", "scope", "beachfront", "(Lrestrictive/underbelly;)V", "Lsupplicat/competently;", X3.i.L, "", "marial", "(J)Z", "Lmilliradian/impassible;", "impromptu", "(J)V", "Lmilliradian/monoploid;", "size", "wireman", "canvas", "parentLayer", "attabal", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "taiyuan", "()V", "invalidate", "destroy", "point", "inverse", "saneness", "(JZ)J", "Lsupplicat/marial;", "rect", "competently", "(Lsupplicat/marial;Z)V", "dern", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "kowloon", "monoploid", "Lrestrictive/lerp;", "impassible", "()[F", "formularize", "arytenoidectomy", "apical", "(Lrestrictive/creditor;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lrestrictive/milliradian;", "Landroidx/compose/ui/platform/AndroidComposeView;", "polloi", "Lkotlin/jvm/functions/Function2;", "molybdenite", "Lkotlin/jvm/functions/Function0;", "graveside", "J", "adultoid", "Z", "isDestroyed", "dovishness", "[F", "matrixCache", "gintrap", "inverseMatrixCache", "value", "rotuma", "triweekly", "(Z)V", "isDirty", "Lmilliradian/wireman;", "preprohormone", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "cord", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lmerc/attabal;", "cuirassed", "Lmerc/attabal;", "", "stratoscope", "I", "mutatedFields", "Lrestrictive/picketboat;", "trm", "transformOrigin", "Landroidx/compose/ui/graphics/dern;", "oilcan", "Landroidx/compose/ui/graphics/dern;", "outline", "Landroidx/compose/ui/graphics/Path;", "yemenite", "Landroidx/compose/ui/graphics/Path;", "tmpPath", "Lrestrictive/lotta;", "sealless", "Lrestrictive/lotta;", "softwareLayerPaint", "kattegat", "drawnWithEnabledZ", "Lkotlin/Function1;", "Lmerc/beachfront;", "supplicat", "Lkotlin/jvm/functions/Function1;", "recordLambda", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GraphicsLayerOwnerLayer implements androidx.compose.ui.node.walach {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean isDestroyed;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final restrictive.milliradian context;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public float[] inverseMatrixCache;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public boolean drawnWithEnabledZ;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public GraphicsLayer graphicsLayer;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> invalidateParentLayer;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.graphics.dern outline;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public boolean isDirty;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public restrictive.lotta softwareLayerPaint;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public int mutatedFields;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public Path tmpPath;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public long size = milliradian.polloi.attabal(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final float[] matrixCache = restrictive.lerp.dern(null, 1, null);

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman density = milliradian.beachfront.saneness(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal scope = new merc.attabal();

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public long transformOrigin = restrictive.picketboat.INSTANCE.attabal();

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final Function1<merc.beachfront, Unit> recordLambda = new Function1<merc.beachfront, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(merc.beachfront beachfrontVar) {
            invoke2(beachfrontVar);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(merc.beachfront beachfrontVar) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            restrictive.creditor creditorVarBeachfront = beachfrontVar.getDrawContext().beachfront();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(creditorVarBeachfront, beachfrontVar.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, restrictive.milliradian milliradianVar, AndroidComposeView androidComposeView, Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = milliradianVar;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    public final void apical(restrictive.creditor canvas) {
        if (this.graphicsLayer.impromptu()) {
            androidx.compose.ui.graphics.dern dernVarApical = this.graphicsLayer.apical();
            if (dernVarApical instanceof androidx.compose.ui.graphics.dern.saneness) {
                restrictive.creditor.saneness(canvas, ((androidx.compose.ui.graphics.dern.saneness) dernVarApical).saneness(), 0, 2, null);
                return;
            }
            if (!(dernVarApical instanceof androidx.compose.ui.graphics.dern.C0046dern)) {
                if (dernVarApical instanceof androidx.compose.ui.graphics.dern.attabal) {
                    restrictive.creditor.attabal(canvas, ((androidx.compose.ui.graphics.dern.attabal) dernVarApical).getPath(), 0, 2, null);
                    return;
                }
                return;
            }
            Path pathAttabal = this.tmpPath;
            if (pathAttabal == null) {
                pathAttabal = androidx.compose.ui.graphics.saneness.attabal();
                this.tmpPath = pathAttabal;
            }
            pathAttabal.reset();
            Path.wireman(pathAttabal, ((androidx.compose.ui.graphics.dern.C0046dern) dernVarApical).getRoundRect(), null, 2, null);
            restrictive.creditor.attabal(canvas, pathAttabal, 0, 2, null);
        }
    }

    public final void arytenoidectomy() {
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        long jSaneness = supplicat.impromptu.wireman(graphicsLayer.getPivotOffset()) ? supplicat.triweekly.saneness(milliradian.polloi.saneness(this.size)) : graphicsLayer.getPivotOffset();
        restrictive.lerp.impromptu(this.matrixCache);
        float[] fArr = this.matrixCache;
        float[] fArrDern = restrictive.lerp.dern(null, 1, null);
        restrictive.lerp.monoploid(fArrDern, -supplicat.competently.apical(jSaneness), -supplicat.competently.formularize(jSaneness), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        restrictive.lerp.triweekly(fArr, fArrDern);
        float[] fArr2 = this.matrixCache;
        float[] fArrDern2 = restrictive.lerp.dern(null, 1, null);
        restrictive.lerp.monoploid(fArrDern2, graphicsLayer.adultoid(), graphicsLayer.dovishness(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        restrictive.lerp.taiyuan(fArrDern2, graphicsLayer.impassible());
        restrictive.lerp.cutely(fArrDern2, graphicsLayer.triweekly());
        restrictive.lerp.apical(fArrDern2, graphicsLayer.kowloon());
        restrictive.lerp.impassible(fArrDern2, graphicsLayer.arytenoidectomy(), graphicsLayer.monoploid(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        restrictive.lerp.triweekly(fArr2, fArrDern2);
        float[] fArr3 = this.matrixCache;
        float[] fArrDern3 = restrictive.lerp.dern(null, 1, null);
        restrictive.lerp.monoploid(fArrDern3, supplicat.competently.apical(jSaneness), supplicat.competently.formularize(jSaneness), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        restrictive.lerp.triweekly(fArr3, fArrDern3);
    }

    @Override // androidx.compose.ui.node.walach
    public void attabal(restrictive.creditor canvas, GraphicsLayer parentLayer) {
        Canvas canvasDern = restrictive.sealless.dern(canvas);
        if (canvasDern.isHardwareAccelerated()) {
            taiyuan();
            this.drawnWithEnabledZ = this.graphicsLayer.polloi() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            merc.wireman drawContext = this.scope.getDrawContext();
            drawContext.taiyuan(canvas);
            drawContext.wireman(parentLayer);
            polder.saneness.attabal(this.scope, this.graphicsLayer);
            return;
        }
        float fWireman = milliradian.impassible.wireman(this.graphicsLayer.getTopLeft());
        float fMarial = milliradian.impassible.marial(this.graphicsLayer.getTopLeft());
        float fCompetently = fWireman + milliradian.monoploid.competently(this.size);
        float fBeachfront = fMarial + milliradian.monoploid.beachfront(this.size);
        if (this.graphicsLayer.beachfront() < 1.0f) {
            restrictive.lotta lottaVarAttabal = this.softwareLayerPaint;
            if (lottaVarAttabal == null) {
                lottaVarAttabal = restrictive.seminary.attabal();
                this.softwareLayerPaint = lottaVarAttabal;
            }
            lottaVarAttabal.saneness(this.graphicsLayer.beachfront());
            canvasDern.saveLayer(fWireman, fMarial, fCompetently, fBeachfront, lottaVarAttabal.getInternalPaint());
        } else {
            canvas.formularize();
        }
        canvas.competently(fWireman, fMarial);
        canvas.triweekly(impassible());
        if (this.graphicsLayer.impromptu()) {
            apical(canvas);
        }
        Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.impromptu();
    }

    @Override // androidx.compose.ui.node.walach
    public void beachfront(restrictive.underbelly scope) {
        boolean z;
        int iSaneness;
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.peridotite(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.mathsort(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.sealless(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.permissivist(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.cultivated(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.splinterproof(scope.getShadowElevation());
            if (scope.getShadowElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.kattegat(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.clubfoot(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.hydrovane(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.creditor(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.starveling(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.supplicat(scope.getCameraDistance());
        }
        if (i != 0) {
            if (restrictive.picketboat.dern(this.transformOrigin, restrictive.picketboat.INSTANCE.attabal())) {
                this.graphicsLayer.seminary(supplicat.competently.INSTANCE.saneness());
            } else {
                this.graphicsLayer.seminary(supplicat.impromptu.attabal(restrictive.picketboat.wireman(this.transformOrigin) * milliradian.monoploid.competently(this.size), restrictive.picketboat.marial(this.transformOrigin) * milliradian.monoploid.beachfront(this.size)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.restrictive(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            scope.triweekly();
            graphicsLayer.privatdozent(null);
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            restrictive.permissivist.Companion companion = restrictive.permissivist.INSTANCE;
            if (restrictive.permissivist.beachfront(compositingStrategy, companion.attabal())) {
                iSaneness = androidx.compose.ui.graphics.layer.attabal.INSTANCE.attabal();
            } else if (restrictive.permissivist.beachfront(compositingStrategy, companion.dern())) {
                iSaneness = androidx.compose.ui.graphics.layer.attabal.INSTANCE.dern();
            } else {
                if (!restrictive.permissivist.beachfront(compositingStrategy, companion.saneness())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iSaneness = androidx.compose.ui.graphics.layer.attabal.INSTANCE.saneness();
            }
            graphicsLayer2.merc(iSaneness);
        }
        if (Intrinsics.wireman(this.outline, scope.getOutline())) {
            z = false;
        } else {
            this.outline = scope.getOutline();
            monoploid();
            z = true;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z) {
            kowloon();
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void competently(MutableRect rect, boolean inverse) {
        if (!inverse) {
            restrictive.lerp.competently(impassible(), rect);
            return;
        }
        float[] fArrFormularize = formularize();
        if (fArrFormularize == null) {
            rect.competently(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            restrictive.lerp.competently(fArrFormularize, rect);
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void dern(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        restrictive.milliradian milliradianVar = this.context;
        if (milliradianVar == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.getIsReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = milliradianVar.attabal();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.transformOrigin = restrictive.picketboat.INSTANCE.attabal();
        this.drawnWithEnabledZ = false;
        this.size = milliradian.polloi.attabal(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.walach
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        triweekly(false);
        restrictive.milliradian milliradianVar = this.context;
        if (milliradianVar != null) {
            milliradianVar.saneness(this.graphicsLayer);
            this.ownerView.unconsolidated(this);
        }
    }

    public final float[] formularize() {
        float[] fArrImpassible = impassible();
        float[] fArrDern = this.inverseMatrixCache;
        if (fArrDern == null) {
            fArrDern = restrictive.lerp.dern(null, 1, null);
            this.inverseMatrixCache = fArrDern;
        }
        if (dent.attabal(fArrImpassible, fArrDern)) {
            return fArrDern;
        }
        return null;
    }

    public final float[] impassible() {
        arytenoidectomy();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.walach
    public void impromptu(long position) {
        this.graphicsLayer.dent(position);
        kowloon();
    }

    @Override // androidx.compose.ui.node.walach
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        triweekly(true);
    }

    public final void kowloon() {
        if (Build.VERSION.SDK_INT >= 26) {
            sakeen.f7491attabal.attabal(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.walach
    public boolean marial(long position) {
        float fApical = supplicat.competently.apical(position);
        float fFormularize = supplicat.competently.formularize(position);
        if (this.graphicsLayer.impromptu()) {
            return achondroplasia.dern(this.graphicsLayer.apical(), fApical, fFormularize, null, null, 24, null);
        }
        return true;
    }

    public final void monoploid() {
        Function0<Unit> function0;
        androidx.compose.ui.graphics.dern dernVar = this.outline;
        if (dernVar == null) {
            return;
        }
        polder.saneness.saneness(this.graphicsLayer, dernVar);
        if (!(dernVar instanceof androidx.compose.ui.graphics.dern.attabal) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.walach
    public long saneness(long point, boolean inverse) {
        if (!inverse) {
            return restrictive.lerp.beachfront(impassible(), point);
        }
        float[] fArrFormularize = formularize();
        return fArrFormularize != null ? restrictive.lerp.beachfront(fArrFormularize, point) : supplicat.competently.INSTANCE.attabal();
    }

    @Override // androidx.compose.ui.node.walach
    public void taiyuan() {
        if (this.isDirty) {
            if (!restrictive.picketboat.dern(this.transformOrigin, restrictive.picketboat.INSTANCE.attabal()) && !milliradian.monoploid.marial(this.graphicsLayer.getSize(), this.size)) {
                this.graphicsLayer.seminary(supplicat.impromptu.attabal(restrictive.picketboat.wireman(this.transformOrigin) * milliradian.monoploid.competently(this.size), restrictive.picketboat.marial(this.transformOrigin) * milliradian.monoploid.beachfront(this.size)));
            }
            this.graphicsLayer.cuirassed(this.density, this.layoutDirection, this.size, this.recordLambda);
            triweekly(false);
        }
    }

    public final void triweekly(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.wostteth(this, z);
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void wireman(long size) {
        if (milliradian.monoploid.marial(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }
}
