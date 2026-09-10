package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.Path;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b1\b\u0001\u0018\u0000 J2\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010:\u001a\u0004\b9\u0010=\"\u0004\b>\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010:\u001a\u0004\b?\u0010=\"\u0004\b@\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bA\u0010=\"\u0004\bB\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010:\u001a\u0004\bC\u0010=\"\u0004\bD\u0010\u001bR*\u0010L\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010=R\u0014\u0010P\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010=R$\u0010R\u001a\u0004\u0018\u00010Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010]\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010`\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R$\u0010c\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\R$\u0010e\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010Z\"\u0004\b<\u0010\\R$\u0010h\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\R$\u0010k\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010=\"\u0004\bj\u0010\u001bR$\u0010n\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010=\"\u0004\bm\u0010\u001bR$\u0010q\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R$\u0010t\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010Z\"\u0004\bs\u0010\\R$\u0010w\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010Z\"\u0004\bv\u0010\\R$\u0010z\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010Z\"\u0004\by\u0010\\R$\u0010}\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010Z\"\u0004\b|\u0010\\R%\u0010\u0080\u0001\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b~\u0010Z\"\u0004\b\u007f\u0010\\R'\u0010\u0083\u0001\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010I\"\u0005\b\u0082\u0001\u0010KR%\u0010\u0084\u0001\u001a\u00020X2\u0006\u0010E\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010Z\"\u0004\b6\u0010\\R-\u0010\u0087\u0001\u001a\u0002082\u0006\u0010E\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010=\"\u0005\b\u0086\u0001\u0010\u001bR\u0015\u0010\u0088\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/platform/treadless;", "Landroidx/compose/ui/platform/peridotite;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "polder", "()V", "Landroid/view/RenderNode;", "renderNode", "creditor", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "adultoid", "(Landroid/graphics/Outline;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "", "apical", "(IIII)Z", "offset", "stratoscope", "(I)V", "arytenoidectomy", "Lrestrictive/starveling;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Lrestrictive/creditor;", "drawBlock", "merc", "(Lrestrictive/starveling;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "cuirassed", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "competently", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "cord", "(Z)Z", "marial", "attabal", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "saneness", "Landroid/view/RenderNode;", "Lrestrictive/permissivist;", "dern", "I", "internalCompositingStrategy", "wireman", "()I", "grimness", "gintrap", "privatdozent", "beachfront", "saran", "trm", "seminary", "value", "impromptu", "Z", "dovishness", "()Z", "taiyuan", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "Lrestrictive/sensatory;", "renderEffect", "Lrestrictive/sensatory;", "getRenderEffect", "()Lrestrictive/sensatory;", "polloi", "(Lrestrictive/sensatory;)V", "", "getScaleX", "()F", "cutely", "(F)V", "scaleX", "getScaleY", "graveside", "scaleY", "getTranslationX", "preprohormone", "translationX", "getTranslationY", "translationY", "restrictive", "triweekly", "elevation", "getAmbientShadowColor", "sealless", "ambientShadowColor", "getSpotShadowColor", "supplicat", "spotShadowColor", "getRotationZ", "molybdenite", "rotationZ", "getRotationX", "impassible", "rotationX", "getRotationY", "kowloon", "rotationY", "getCameraDistance", "formularize", "cameraDistance", "getPivotX", "oilcan", "pivotX", "getPivotY", "yemenite", "pivotY", "rotuma", "kattegat", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "monoploid", "compositingStrategy", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class treadless implements peridotite {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static boolean f7506apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int right;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int bottom;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int internalCompositingStrategy;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int top;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final RenderNode renderNode;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int left;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final int f7507cutely = 8;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static boolean f7508formularize = true;

    public treadless(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = restrictive.permissivist.INSTANCE.attabal();
        if (f7508formularize) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            creditor(renderNodeCreate);
            polder();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f7508formularize = false;
        }
        if (f7506apical) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void adultoid(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean apical(int left, int top, int right, int bottom) {
        grimness(left);
        privatdozent(top);
        saran(right);
        seminary(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void arytenoidectomy(int offset) {
        privatdozent(getTop() + offset);
        seminary(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public float attabal() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void competently(Canvas canvas) {
        Intrinsics.competently(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean cord(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    public final void creditor(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            picketboat picketboatVar = picketboat.f7484attabal;
            picketboatVar.dern(renderNode, picketboatVar.attabal(renderNode));
            picketboatVar.wireman(renderNode, picketboatVar.saneness(renderNode));
        }
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
    /* JADX INFO: renamed from: dern, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void formularize(float f) {
        this.renderNode.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void graveside(float f) {
        this.renderNode.setScaleY(f);
    }

    public void grimness(int i) {
        this.left = i;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void impassible(float f) {
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public boolean impromptu() {
        return this.renderNode.isValid();
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
        polder();
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void merc(restrictive.starveling canvasHolder, Path clipPath, Function1<? super restrictive.creditor, Unit> drawBlock) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().arytenoidectomy((Canvas) displayListCanvasStart);
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
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void molybdenite(float f) {
        this.renderNode.setRotation(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void monoploid(int i) {
        restrictive.permissivist.Companion companion = restrictive.permissivist.INSTANCE;
        if (restrictive.permissivist.beachfront(i, companion.dern())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (restrictive.permissivist.beachfront(i, companion.saneness())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void oilcan(float f) {
        this.renderNode.setPivotX(f);
    }

    public final void polder() {
        gusty.f7437attabal.attabal(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void preprohormone(float f) {
        this.renderNode.setTranslationX(f);
    }

    public void privatdozent(int i) {
        this.top = i;
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

    public void saran(int i) {
        this.right = i;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void sealless(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            picketboat.f7484attabal.dern(this.renderNode, i);
        }
    }

    public void seminary(int i) {
        this.bottom = i;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void stratoscope(int offset) {
        grimness(getLeft() + offset);
        saran(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void supplicat(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            picketboat.f7484attabal.wireman(this.renderNode, i);
        }
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void taiyuan(boolean z) {
        this.clipToBounds = z;
        this.renderNode.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void triweekly(float f) {
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    /* JADX INFO: renamed from: trm, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void wireman(float f) {
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void yemenite(float f) {
        this.renderNode.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.peridotite
    public void polloi(restrictive.sensatory sensatoryVar) {
    }
}
