package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import merc.beachfront;
import merc.marial;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import polder.merc;
import restrictive.creditor;
import restrictive.starveling;
import restrictive.yemenite;
import supplicat.triweekly;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b)\b\u0000\u0018\u0000 K2\u00020\u0001:\u00017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010:\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010B\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u00109R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Lrestrictive/starveling;", "canvasHolder", "Lmerc/attabal;", "canvasDrawScope", "<init>", "(Landroid/view/View;Lrestrictive/starveling;Lmerc/attabal;)V", "Landroid/graphics/Outline;", "outline", "", "dern", "(Landroid/graphics/Outline;)Z", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "Lmerc/beachfront;", "", "drawBlock", "setDrawParams", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "onLayout", "(ZIIII)V", "forceLayout", "kowloon", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "arytenoidectomy", "Lrestrictive/starveling;", "getCanvasHolder", "()Lrestrictive/starveling;", "monoploid", "Lmerc/attabal;", "polloi", "Z", "saneness", "setInvalidated", "(Z)V", "isInvalidated", "molybdenite", "Landroid/graphics/Outline;", "layerOutline", "value", "graveside", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "adultoid", "Lmilliradian/wireman;", "dovishness", "Landroidx/compose/ui/unit/LayoutDirection;", "gintrap", "Lkotlin/jvm/functions/Function1;", "rotuma", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "preprohormone", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman density;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final starveling canvasHolder;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public Function1<? super beachfront, Unit> drawBlock;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final View ownerView;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Outline layerOutline;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal canvasDrawScope;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public GraphicsLayer parentLayer;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final ViewOutlineProvider f6602cord = new attabal();

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/layer/ViewLayer$attabal", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public ViewLayer(View view, starveling starvelingVar, merc.attabal attabalVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = starvelingVar;
        this.canvasDrawScope = attabalVar;
        setOutlineProvider(f6602cord);
        this.canUseCompositingLayer = true;
        this.density = marial.attabal();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.INSTANCE.attabal();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final boolean dern(Outline outline) {
        this.layerOutline = outline;
        return merc.f35403attabal.attabal(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        starveling starvelingVar = this.canvasHolder;
        Canvas canvasKowloon = starvelingVar.getAndroidCanvas().getInternalCanvas();
        starvelingVar.getAndroidCanvas().arytenoidectomy(canvas);
        yemenite yemeniteVarAttabal = starvelingVar.getAndroidCanvas();
        merc.attabal attabalVar = this.canvasDrawScope;
        milliradian.wireman wiremanVar = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        long jAttabal = triweekly.attabal(getWidth(), getHeight());
        GraphicsLayer graphicsLayer = this.parentLayer;
        Function1<? super beachfront, Unit> function1 = this.drawBlock;
        milliradian.wireman density = attabalVar.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = attabalVar.getDrawContext().getLayoutDirection();
        creditor creditorVarBeachfront = attabalVar.getDrawContext().beachfront();
        long jDern = attabalVar.getDrawContext().dern();
        GraphicsLayer graphicsLayerImpromptu = attabalVar.getDrawContext().getGraphicsLayer();
        merc.wireman wiremanVarMerc = attabalVar.getDrawContext();
        wiremanVarMerc.cutely(wiremanVar);
        wiremanVarMerc.marial(layoutDirection);
        wiremanVarMerc.taiyuan(yemeniteVarAttabal);
        wiremanVarMerc.competently(jAttabal);
        wiremanVarMerc.wireman(graphicsLayer);
        yemeniteVarAttabal.formularize();
        try {
            function1.invoke(attabalVar);
            yemeniteVarAttabal.impromptu();
            merc.wireman wiremanVarMerc2 = attabalVar.getDrawContext();
            wiremanVarMerc2.cutely(density);
            wiremanVarMerc2.marial(layoutDirection2);
            wiremanVarMerc2.taiyuan(creditorVarBeachfront);
            wiremanVarMerc2.competently(jDern);
            wiremanVarMerc2.wireman(graphicsLayerImpromptu);
            starvelingVar.getAndroidCanvas().arytenoidectomy(canvasKowloon);
            this.isInvalidated = false;
        } catch (Throwable th) {
            yemeniteVarAttabal.impromptu();
            merc.wireman wiremanVarMerc3 = attabalVar.getDrawContext();
            wiremanVarMerc3.cutely(density);
            wiremanVarMerc3.marial(layoutDirection2);
            wiremanVarMerc3.taiyuan(creditorVarBeachfront);
            wiremanVarMerc3.competently(jDern);
            wiremanVarMerc3.wireman(graphicsLayerImpromptu);
            throw th;
        }
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final starveling getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(milliradian.wireman density, LayoutDirection layoutDirection, GraphicsLayer parentLayer, Function1<? super beachfront, Unit> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
