package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import supplicat.MutableRect;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001\"B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ!\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u000fJ\"\u0010(\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010-J9\u0010.\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R,\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010?\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010G\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/walach;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lrestrictive/creditor;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "formularize", "()V", "Lrestrictive/underbelly;", "scope", "beachfront", "(Lrestrictive/underbelly;)V", "Lsupplicat/competently;", X3.i.L, "", "marial", "(J)Z", "Lmilliradian/monoploid;", "size", "wireman", "(J)V", "Lmilliradian/impassible;", "impromptu", "invalidate", "canvas", "parentLayer", "attabal", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "taiyuan", "destroy", "point", "inverse", "saneness", "(JZ)J", "Lsupplicat/marial;", "rect", "competently", "(Lsupplicat/marial;Z)V", "dern", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "cutely", "(Lrestrictive/creditor;)V", "kowloon", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "arytenoidectomy", "Lkotlin/jvm/functions/Function2;", "monoploid", "Lkotlin/jvm/functions/Function0;", "value", "polloi", "Z", "apical", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/milliradian;", "molybdenite", "Landroidx/compose/ui/platform/milliradian;", "outlineResolver", "graveside", "isDestroyed", "adultoid", "drawnWithZ", "Lrestrictive/lotta;", "dovishness", "Lrestrictive/lotta;", "softwareLayerPaint", "Landroidx/compose/ui/platform/cultivated;", "Landroidx/compose/ui/platform/peridotite;", "gintrap", "Landroidx/compose/ui/platform/cultivated;", "matrixCache", "Lrestrictive/starveling;", "rotuma", "Lrestrictive/starveling;", "canvasHolder", "Lrestrictive/picketboat;", "preprohormone", "J", "transformOrigin", "cord", "Landroidx/compose/ui/platform/peridotite;", "renderNode", "", "cuirassed", "I", "mutatedFields", "stratoscope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RenderNodeLayer implements androidx.compose.ui.node.walach {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean drawnWithZ;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final peridotite renderNode;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public int mutatedFields;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public restrictive.lotta softwareLayerPaint;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean isDestroyed;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> invalidateParentLayer;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean isDirty;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f7336trm = 8;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final Function2<peridotite, Matrix, Unit> f7334oilcan = new Function2<peridotite, Matrix, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(peridotite peridotiteVar, Matrix matrix) {
            invoke2(peridotiteVar, matrix);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(peridotite peridotiteVar, Matrix matrix) {
            peridotiteVar.cuirassed(matrix);
        }
    };

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final milliradian outlineResolver = new milliradian();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final cultivated<peridotite> matrixCache = new cultivated<>(f7334oilcan);

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final restrictive.starveling canvasHolder = new restrictive.starveling();

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public long transformOrigin = restrictive.picketboat.INSTANCE.attabal();

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        peridotite wosttethVar = Build.VERSION.SDK_INT >= 29 ? new wostteth(androidComposeView) : new treadless(androidComposeView);
        wosttethVar.cord(true);
        wosttethVar.taiyuan(false);
        this.renderNode = wosttethVar;
    }

    private final void apical(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.wostteth(this, z);
        }
    }

    private final void formularize() {
        if (Build.VERSION.SDK_INT >= 26) {
            sakeen.f7491attabal.attabal(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void attabal(restrictive.creditor canvas, GraphicsLayer parentLayer) {
        Canvas canvasDern = restrictive.sealless.dern(canvas);
        if (canvasDern.isHardwareAccelerated()) {
            taiyuan();
            boolean z = this.renderNode.restrictive() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.drawnWithZ = z;
            if (z) {
                canvas.apical();
            }
            this.renderNode.competently(canvasDern);
            if (this.drawnWithZ) {
                canvas.impassible();
                return;
            }
            return;
        }
        float fDern = this.renderNode.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        float fGintrap = this.renderNode.getTop();
        float fBeachfront = this.renderNode.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        float fTrm = this.renderNode.getBottom();
        if (this.renderNode.attabal() < 1.0f) {
            restrictive.lotta lottaVarAttabal = this.softwareLayerPaint;
            if (lottaVarAttabal == null) {
                lottaVarAttabal = restrictive.seminary.attabal();
                this.softwareLayerPaint = lottaVarAttabal;
            }
            lottaVarAttabal.saneness(this.renderNode.attabal());
            canvasDern.saveLayer(fDern, fGintrap, fBeachfront, fTrm, lottaVarAttabal.getInternalPaint());
        } else {
            canvas.formularize();
        }
        canvas.competently(fDern, fGintrap);
        canvas.triweekly(this.matrixCache.saneness(this.renderNode));
        cutely(canvas);
        Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.impromptu();
        apical(false);
    }

    @Override // androidx.compose.ui.node.walach
    public void beachfront(restrictive.underbelly scope) {
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z = false;
        boolean z2 = this.renderNode.rotuma() && !this.outlineResolver.marial();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.cutely(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.graveside(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.saneness(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.preprohormone(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.wireman(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.triweekly(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.sealless(restrictive.dent.wireman(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.supplicat(restrictive.dent.wireman(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.molybdenite(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.impassible(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.kowloon(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.formularize(scope.getCameraDistance());
        }
        if (i != 0) {
            this.renderNode.oilcan(restrictive.picketboat.wireman(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.yemenite(restrictive.picketboat.marial(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z3 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.beachfront.attabal();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.kattegat(z3);
            this.renderNode.taiyuan(scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.beachfront.attabal());
        }
        if ((131072 & mutatedFields) != 0) {
            peridotite peridotiteVar = this.renderNode;
            scope.triweekly();
            peridotiteVar.polloi(null);
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.monoploid(scope.getCompositingStrategy());
        }
        boolean zImpromptu = this.outlineResolver.impromptu(scope.getOutline(), scope.getAlpha(), z3, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.adultoid(this.outlineResolver.saneness());
        }
        if (z3 && !this.outlineResolver.marial()) {
            z = true;
        }
        if (z2 != z || (z && zImpromptu)) {
            invalidate();
        } else {
            formularize();
        }
        if (!this.drawnWithZ && this.renderNode.restrictive() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.dern();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.walach
    public void competently(MutableRect rect, boolean inverse) {
        if (!inverse) {
            restrictive.lerp.competently(this.matrixCache.saneness(this.renderNode), rect);
            return;
        }
        float[] fArrAttabal = this.matrixCache.attabal(this.renderNode);
        if (fArrAttabal == null) {
            rect.competently(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            restrictive.lerp.competently(fArrAttabal, rect);
        }
    }

    public final void cutely(restrictive.creditor canvas) {
        if (this.renderNode.rotuma() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.attabal(canvas);
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void dern(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        apical(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = restrictive.picketboat.INSTANCE.attabal();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.walach
    public void destroy() {
        if (this.renderNode.impromptu()) {
            this.renderNode.marial();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        apical(false);
        this.ownerView.claque();
        this.ownerView.unconsolidated(this);
    }

    @Override // androidx.compose.ui.node.walach
    public void impromptu(long position) {
        int iDern = this.renderNode.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        int iGintrap = this.renderNode.getTop();
        int iWireman = milliradian.impassible.wireman(position);
        int iMarial = milliradian.impassible.marial(position);
        if (iDern == iWireman && iGintrap == iMarial) {
            return;
        }
        if (iDern != iWireman) {
            this.renderNode.stratoscope(iWireman - iDern);
        }
        if (iGintrap != iMarial) {
            this.renderNode.arytenoidectomy(iMarial - iGintrap);
        }
        formularize();
        this.matrixCache.dern();
    }

    @Override // androidx.compose.ui.node.walach
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        apical(true);
    }

    @Override // androidx.compose.ui.node.walach
    public boolean marial(long position) {
        float fApical = supplicat.competently.apical(position);
        float fFormularize = supplicat.competently.formularize(position);
        if (this.renderNode.getClipToBounds()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fApical && fApical < ((float) this.renderNode.getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fFormularize && fFormularize < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.rotuma()) {
            return this.outlineResolver.beachfront(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.walach
    public long saneness(long point, boolean inverse) {
        if (!inverse) {
            return restrictive.lerp.beachfront(this.matrixCache.saneness(this.renderNode), point);
        }
        float[] fArrAttabal = this.matrixCache.attabal(this.renderNode);
        return fArrAttabal != null ? restrictive.lerp.beachfront(fArrAttabal, point) : supplicat.competently.INSTANCE.attabal();
    }

    @Override // androidx.compose.ui.node.walach
    public void taiyuan() {
        if (this.isDirty || !this.renderNode.impromptu()) {
            Path pathWireman = (!this.renderNode.rotuma() || this.outlineResolver.marial()) ? null : this.outlineResolver.wireman();
            final Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
            if (function2 != null) {
                this.renderNode.merc(this.canvasHolder, pathWireman, new Function1<restrictive.creditor, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(restrictive.creditor creditorVar) {
                        invoke2(creditorVar);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(restrictive.creditor creditorVar) {
                        function2.invoke(creditorVar, null);
                    }
                });
            }
            apical(false);
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void wireman(long size) {
        int iCompetently = milliradian.monoploid.competently(size);
        int iBeachfront = milliradian.monoploid.beachfront(size);
        this.renderNode.oilcan(restrictive.picketboat.wireman(this.transformOrigin) * iCompetently);
        this.renderNode.yemenite(restrictive.picketboat.marial(this.transformOrigin) * iBeachfront);
        peridotite peridotiteVar = this.renderNode;
        if (peridotiteVar.apical(peridotiteVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), this.renderNode.getTop(), this.renderNode.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() + iCompetently, this.renderNode.getTop() + iBeachfront)) {
            this.renderNode.adultoid(this.outlineResolver.saneness());
            invalidate();
            this.matrixCache.dern();
        }
    }
}
