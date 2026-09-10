package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import merc.beachfront;
import milliradian.monoploid;
import milliradian.polloi;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import polder.creditor;
import restrictive.clubfoot;
import restrictive.dent;
import restrictive.overspeculate;
import restrictive.saran;
import restrictive.sealless;
import restrictive.sensatory;
import restrictive.starveling;
import restrictive.yemenite;
import supplicat.competently;
import supplicat.impassible;
import supplicat.impromptu;

/* JADX INFO: compiled from: GraphicsLayerV29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J;\u0010+\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<R\u001c\u0010\u001b\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00106R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR*\u0010Q\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\b5\u0010PR0\u0010Y\u001a\u00020R2\u0006\u0010K\u001a\u00020R8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR0\u0010_\u001a\u00020Z2\u0006\u0010K\u001a\u00020Z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b[\u00106\u001a\u0004\b\\\u00108\"\u0004\b]\u0010^R*\u0010b\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010M\u001a\u0004\ba\u0010O\"\u0004\bL\u0010PR*\u0010e\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010M\u001a\u0004\bc\u0010O\"\u0004\bd\u0010PR*\u0010i\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010M\u001a\u0004\bg\u0010O\"\u0004\bh\u0010PR*\u0010l\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010M\u001a\u0004\bk\u0010O\"\u0004\b:\u0010PR*\u0010o\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010M\u001a\u0004\bm\u0010O\"\u0004\bn\u0010PR0\u0010t\u001a\u00020p2\u0006\u0010K\u001a\u00020p8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bq\u00106\u001a\u0004\br\u00108\"\u0004\bs\u0010^R0\u0010x\u001a\u00020p2\u0006\u0010K\u001a\u00020p8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bu\u00106\u001a\u0004\bv\u00108\"\u0004\bw\u0010^R*\u0010z\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010M\u001a\u0004\by\u0010O\"\u0004\b`\u0010PR*\u0010{\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010M\u001a\u0004\bA\u0010O\"\u0004\bf\u0010PR*\u0010|\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010M\u001a\u0004\bG\u0010O\"\u0004\bu\u0010PR*\u0010}\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010M\u001a\u0004\bS\u0010O\"\u0004\b[\u0010PR+\u0010\u0080\u0001\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010H\u001a\u0004\bj\u0010\u0015\"\u0004\b~\u0010\u007fR\u0017\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010HR\u0017\u0010\u0082\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010HR3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010T\u001a\u0005\b\u0084\u0001\u0010V\"\u0005\b\u0085\u0001\u0010XR%\u0010\u0086\u0001\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b/\u0010H\u001a\u0005\b\u0086\u0001\u0010\u0015\"\u0005\b\u0087\u0001\u0010\u007fR6\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\t\u0010K\u001a\u0005\u0018\u00010\u0088\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b?\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R6\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00012\t\u0010K\u001a\u0005\u0018\u00010\u008e\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0083\u0001\u0010\u0091\u0001\"\u0005\bq\u0010\u0092\u0001R\u0015\u0010\u0093\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/dern;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "ownerId", "Lrestrictive/starveling;", "canvasHolder", "Lmerc/attabal;", "canvasDrawScope", "<init>", "(JLrestrictive/starveling;Lmerc/attabal;)V", "", "dern", "()V", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/layer/attabal;", "compositingStrategy", "starveling", "(Landroid/graphics/RenderNode;I)V", "peridotite", "", "hydrovane", "()Z", "walach", "", "x", "y", "Lmilliradian/monoploid;", "size", "yemenite", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "adultoid", "(Landroid/graphics/Outline;)V", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Lmerc/beachfront;", "block", "trm", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lrestrictive/creditor;", "canvas", "stratoscope", "(Lrestrictive/creditor;)V", "Landroid/graphics/Matrix;", "polder", "()Landroid/graphics/Matrix;", "marial", "saneness", "J", "getOwnerId", "()J", "Lrestrictive/starveling;", "wireman", "Lmerc/attabal;", "Landroid/graphics/RenderNode;", "renderNode", "Lsupplicat/impassible;", "beachfront", "Landroid/graphics/Paint;", "competently", "Landroid/graphics/Paint;", "layerPaint", "impromptu", "Landroid/graphics/Matrix;", "matrix", "taiyuan", "Z", "outlineIsProvided", "", "value", "cutely", "F", "attabal", "()F", "(F)V", "alpha", "Lrestrictive/saran;", "apical", "I", "triweekly", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Lsupplicat/competently;", "formularize", "getPivotOffset-F1C5BW0", "saran", "(J)V", "pivotOffset", "impassible", "monoploid", "scaleX", "cord", "graveside", "scaleY", "kowloon", "gintrap", "preprohormone", "translationX", "arytenoidectomy", "dovishness", "translationY", "creditor", "grimness", "shadowElevation", "Lrestrictive/overspeculate;", "polloi", "sealless", "supplicat", "ambientShadowColor", "molybdenite", "kattegat", "merc", "spotShadowColor", "rotuma", "rotationX", "rotationY", "rotationZ", "cameraDistance", "restrictive", "(Z)V", "clip", "clipToBounds", "clipToOutline", "cuirassed", "oilcan", "privatdozent", "isInvalidated", "seminary", "Lrestrictive/clubfoot;", "colorFilter", "Lrestrictive/clubfoot;", "()Lrestrictive/clubfoot;", "setColorFilter", "(Lrestrictive/clubfoot;)V", "Lrestrictive/sensatory;", "renderEffect", "Lrestrictive/sensatory;", "()Lrestrictive/sensatory;", "(Lrestrictive/sensatory;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int blendMode;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public Paint layerPaint;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public boolean clipToOutline;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public int compositingStrategy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public float alpha;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final starveling canvasHolder;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public long pivotOffset;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public float cameraDistance;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public float scaleX;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public Matrix matrix;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final RenderNode renderNode;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public long spotShadowColor;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public long ambientShadowColor;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public boolean clip;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long ownerId;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean outlineIsProvided;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public float scaleY;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal canvasDrawScope;

    public dern(long j, starveling starvelingVar, merc.attabal attabalVar) {
        this.ownerId = j;
        this.canvasHolder = starvelingVar;
        this.canvasDrawScope = attabalVar;
        RenderNode renderNodeAttabal = polder.dern.attabal("graphicsLayer");
        this.renderNode = renderNodeAttabal;
        this.size = impassible.INSTANCE.saneness();
        renderNodeAttabal.setClipToBounds(false);
        attabal.Companion companion = attabal.INSTANCE;
        starveling(renderNodeAttabal, companion.attabal());
        this.alpha = 1.0f;
        this.blendMode = saran.INSTANCE.stratoscope();
        this.pivotOffset = competently.INSTANCE.saneness();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        overspeculate.Companion companion2 = overspeculate.INSTANCE;
        this.ambientShadowColor = companion2.attabal();
        this.spotShadowColor = companion2.attabal();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.attabal();
        this.isInvalidated = true;
    }

    private final void dern() {
        boolean z = false;
        boolean z2 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z = true;
        }
        if (z2 != this.clipToBounds) {
            this.clipToBounds = z2;
            this.renderNode.setClipToBounds(z2);
        }
        if (z != this.clipToOutline) {
            this.clipToOutline = z;
            this.renderNode.setClipToOutline(z);
        }
    }

    private final boolean hydrovane() {
        if (attabal.beachfront(getCompositingStrategy(), attabal.INSTANCE.dern()) || walach()) {
            return true;
        }
        cuirassed();
        return false;
    }

    private final void peridotite() {
        if (hydrovane()) {
            starveling(this.renderNode, attabal.INSTANCE.dern());
        } else {
            starveling(this.renderNode, getCompositingStrategy());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void adultoid(Outline outline) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        dern();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: apical, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public clubfoot beachfront() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: competently, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: cord, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: creditor, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public sensatory cuirassed() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void cutely(float f) {
        this.scaleX = f;
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void formularize(float f) {
        this.cameraDistance = f;
        this.renderNode.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void graveside(float f) {
        this.scaleY = f;
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void grimness(float f) {
        this.shadowElevation = f;
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void impassible(float f) {
        this.rotationX = f;
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean impromptu() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void kowloon(float f) {
        this.rotationY = f;
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void marial() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void merc(long j) {
        this.spotShadowColor = j;
        this.renderNode.setSpotShadowColor(dent.wireman(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void molybdenite(float f) {
        this.rotationZ = f;
        this.renderNode.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: oilcan, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix polder() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void polloi(sensatory sensatoryVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            creditor.f35400attabal.attabal(this.renderNode, sensatoryVar);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void preprohormone(float f) {
        this.translationX = f;
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void privatdozent(int i) {
        this.compositingStrategy = i;
        peridotite();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void restrictive(boolean z) {
        this.clip = z;
        dern();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: rotuma, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void saneness(float f) {
        this.alpha = f;
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void saran(long j) {
        this.pivotOffset = j;
        if (impromptu.wireman(j)) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(competently.apical(j));
            this.renderNode.setPivotY(competently.formularize(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: sealless, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void seminary(boolean z) {
        this.isInvalidated = z;
    }

    public final void starveling(RenderNode renderNode, int i) {
        attabal.Companion companion = attabal.INSTANCE;
        if (attabal.beachfront(i, companion.dern())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (attabal.beachfront(i, companion.saneness())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void stratoscope(restrictive.creditor canvas) {
        sealless.dern(canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void supplicat(long j) {
        this.ambientShadowColor = j;
        this.renderNode.setAmbientShadowColor(dent.wireman(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void trm(milliradian.wireman density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super beachfront, Unit> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            starveling starvelingVar = this.canvasHolder;
            Canvas internalCanvas = starvelingVar.getAndroidCanvas().getInternalCanvas();
            starvelingVar.getAndroidCanvas().arytenoidectomy(recordingCanvasBeginRecording);
            yemenite androidCanvas = starvelingVar.getAndroidCanvas();
            merc.wireman drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.cutely(density);
            drawContext.marial(layoutDirection);
            drawContext.wireman(layer);
            drawContext.competently(this.size);
            drawContext.taiyuan(androidCanvas);
            block.invoke(this.canvasDrawScope);
            starvelingVar.getAndroidCanvas().arytenoidectomy(internalCanvas);
            this.renderNode.endRecording();
            seminary(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    public final boolean walach() {
        if (!saran.sealless(getBlendMode(), saran.INSTANCE.stratoscope())) {
            return true;
        }
        beachfront();
        return false;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void wireman(float f) {
        this.translationY = f;
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void yemenite(int x, int y, long size) {
        this.renderNode.setPosition(x, y, monoploid.competently(size) + x, monoploid.beachfront(size) + y);
        this.size = polloi.saneness(size);
    }

    public /* synthetic */ dern(long j, starveling starvelingVar, merc.attabal attabalVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? new starveling() : starvelingVar, (i & 4) != 0 ? new merc.attabal() : attabalVar);
    }
}
