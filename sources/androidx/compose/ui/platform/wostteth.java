package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00109R\u0014\u0010\r\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0014\u0010>\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00109R\u0014\u0010@\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00109R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR$\u0010M\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR$\u0010P\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR$\u0010S\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR$\u0010V\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u00109\"\u0004\bU\u0010\u0015R$\u0010Y\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u00109\"\u0004\bX\u0010\u0015R$\u0010\\\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR$\u0010_\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR$\u0010b\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010D\"\u0004\ba\u0010FR$\u0010e\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010D\"\u0004\bd\u0010FR$\u0010h\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010D\"\u0004\bg\u0010FR$\u0010k\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010D\"\u0004\bj\u0010FR$\u0010p\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010s\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010m\"\u0004\br\u0010oR$\u0010t\u001a\u00020A2\u0006\u0010B\u001a\u00020A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010D\"\u0004\b2\u0010FR(\u0010z\u001a\u0004\u0018\u00010u2\b\u0010B\u001a\u0004\u0018\u00010u8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010}\u001a\u0002052\u0006\u0010B\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b{\u00109\"\u0004\b|\u0010\u0015R\u0014\u0010\u007f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010m\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/ui/platform/wostteth;", "Landroidx/compose/ui/platform/peridotite;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/graphics/Outline;", "outline", "", "adultoid", "(Landroid/graphics/Outline;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "", "apical", "(IIII)Z", "offset", "stratoscope", "(I)V", "arytenoidectomy", "Lrestrictive/starveling;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Lrestrictive/creditor;", "drawBlock", "merc", "(Lrestrictive/starveling;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "cuirassed", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "competently", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "cord", "(Z)Z", "marial", "()V", "attabal", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "saneness", "Landroid/graphics/RenderNode;", "renderNode", "Lrestrictive/permissivist;", "dern", "I", "internalCompositingStrategy", "()I", "gintrap", "beachfront", "trm", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "cutely", "(F)V", "scaleX", "getScaleY", "graveside", "scaleY", "getTranslationX", "preprohormone", "translationX", "getTranslationY", "wireman", "translationY", "restrictive", "triweekly", "elevation", "getAmbientShadowColor", "sealless", "ambientShadowColor", "getSpotShadowColor", "supplicat", "spotShadowColor", "getRotationZ", "molybdenite", "rotationZ", "getRotationX", "impassible", "rotationX", "getRotationY", "kowloon", "rotationY", "getCameraDistance", "formularize", "cameraDistance", "getPivotX", "oilcan", "pivotX", "getPivotY", "yemenite", "pivotY", "rotuma", "()Z", "kattegat", "(Z)V", "clipToOutline", "dovishness", "taiyuan", "clipToBounds", "alpha", "Lrestrictive/sensatory;", "getRenderEffect", "()Lrestrictive/sensatory;", "polloi", "(Lrestrictive/sensatory;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "monoploid", "compositingStrategy", "impromptu", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wostteth implements peridotite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final RenderNode renderNode = polder.dern.attabal("Compose");

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int internalCompositingStrategy = restrictive.permissivist.INSTANCE.attabal();

    public wostteth(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void adultoid(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean apical(int left, int top, int right, int bottom) {
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void arytenoidectomy(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public float attabal() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: beachfront */
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void competently(Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean cord(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void cuirassed(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void cutely(float f) {
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: dern */
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: dovishness */
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void formularize(float f) {
        this.renderNode.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: gintrap */
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void graveside(float f) {
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void impassible(float f) {
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean impromptu() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void kattegat(boolean z) {
        this.renderNode.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void kowloon(float f) {
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void marial() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void merc(restrictive.starveling canvasHolder, Path clipPath, Function1<? super restrictive.creditor, Unit> drawBlock) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().arytenoidectomy(recordingCanvasBeginRecording);
        restrictive.yemenite androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.formularize();
            restrictive.creditor.attabal(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.impromptu();
        }
        canvasHolder.getAndroidCanvas().arytenoidectomy(internalCanvas);
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void molybdenite(float f) {
        this.renderNode.setRotationZ(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void monoploid(int i) {
        RenderNode renderNode = this.renderNode;
        restrictive.permissivist.Companion companion = restrictive.permissivist.INSTANCE;
        if (restrictive.permissivist.beachfront(i, companion.dern())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (restrictive.permissivist.beachfront(i, companion.saneness())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void oilcan(float f) {
        this.renderNode.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void polloi(restrictive.sensatory sensatoryVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            igbo.f7438attabal.attabal(this.renderNode, sensatoryVar);
        }
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void preprohormone(float f) {
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public float restrictive() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean rotuma() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void saneness(float f) {
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void sealless(int i) {
        this.renderNode.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void stratoscope(int offset) {
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void supplicat(int i) {
        this.renderNode.setSpotShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void taiyuan(boolean z) {
        this.renderNode.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void triweekly(float f) {
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: trm */
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void wireman(float f) {
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void yemenite(float f) {
        this.renderNode.setPivotY(f);
    }
}
