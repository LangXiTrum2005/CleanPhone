package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import merc.beachfront;
import milliradian.monoploid;
import milliradian.polloi;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import polder.privatdozent;
import restrictive.clubfoot;
import restrictive.creditor;
import restrictive.dent;
import restrictive.overspeculate;
import restrictive.saran;
import restrictive.sealless;
import restrictive.sensatory;
import restrictive.starveling;
import restrictive.yemenite;
import supplicat.competently;
import supplicat.impromptu;

/* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 P2\u00020\u0001:\u0001[B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J;\u0010/\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010AR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010;R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR0\u0010\r\u001a\u00020\f2\u0006\u0010M\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0010R0\u0010W\u001a\u00020S2\u0006\u0010M\u001a\u00020S8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010\u0010R*\u0010^\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b:\u0010]R\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010KR0\u0010e\u001a\u00020a2\u0006\u0010M\u001a\u00020a8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bb\u0010=\"\u0004\bc\u0010dR*\u0010h\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010\\\"\u0004\bN\u0010]R*\u0010l\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010Z\u001a\u0004\bj\u0010\\\"\u0004\bk\u0010]R*\u0010o\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010Z\u001a\u0004\bm\u0010\\\"\u0004\bn\u0010]R*\u0010r\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010Z\u001a\u0004\bq\u0010\\\"\u0004\b?\u0010]R*\u0010v\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010Z\u001a\u0004\bt\u0010\\\"\u0004\bu\u0010]R0\u0010z\u001a\u00020w2\u0006\u0010M\u001a\u00020w8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bk\u0010;\u001a\u0004\bx\u0010=\"\u0004\by\u0010dR0\u0010}\u001a\u00020w2\u0006\u0010M\u001a\u00020w8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010;\u001a\u0004\b{\u0010=\"\u0004\b|\u0010dR*\u0010\u007f\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010Z\u001a\u0004\b~\u0010\\\"\u0004\b_\u0010]R+\u0010\u0080\u0001\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010Z\u001a\u0004\bD\u0010\\\"\u0004\bf\u0010]R+\u0010\u0081\u0001\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b~\u0010Z\u001a\u0004\bJ\u0010\\\"\u0004\bs\u0010]R+\u0010\u0082\u0001\u001a\u00020X2\u0006\u0010M\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010Z\u001a\u0004\bT\u0010\\\"\u0004\bY\u0010]R-\u0010\u0085\u0001\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\bj\u0010K\u001a\u0004\bi\u0010\u0013\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010KR\u0017\u0010\u0088\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR&\u0010\u0089\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\b/\u0010K\u001a\u0005\b\u0089\u0001\u0010\u0013\"\u0006\b\u008a\u0001\u0010\u0084\u0001R6\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\u0010M\u001a\u0005\u0018\u00010\u008b\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\bB\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0086\u0001\u0010\u0094\u0001\"\u0005\bp\u0010\u0095\u0001R\u0015\u0010\u0096\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/saneness;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroid/view/View;", "ownerView", "", "ownerId", "Lrestrictive/starveling;", "canvasHolder", "Lmerc/attabal;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLrestrictive/starveling;Lmerc/attabal;)V", "Landroidx/compose/ui/graphics/layer/attabal;", "compositingStrategy", "", "starveling", "(I)V", "", "walach", "()Z", "peridotite", "()V", "dern", "Landroid/view/RenderNode;", "renderNode", "mathsort", "(Landroid/view/RenderNode;)V", "", "x", "y", "Lmilliradian/monoploid;", "size", "yemenite", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "adultoid", "(Landroid/graphics/Outline;)V", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Lmerc/beachfront;", "block", "trm", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lrestrictive/creditor;", "canvas", "stratoscope", "(Lrestrictive/creditor;)V", "Landroid/graphics/Matrix;", "polder", "()Landroid/graphics/Matrix;", "marial", "hydrovane", "saneness", "J", "getOwnerId", "()J", "Lrestrictive/starveling;", "wireman", "Lmerc/attabal;", "Landroid/view/RenderNode;", "beachfront", "Landroid/graphics/Paint;", "competently", "Landroid/graphics/Paint;", "layerPaint", "impromptu", "Landroid/graphics/Matrix;", "matrix", "taiyuan", "Z", "outlineIsProvided", "value", "cutely", "I", "oilcan", "()I", "privatdozent", "Lrestrictive/saran;", "apical", "triweekly", "setBlendMode-s9anfk8", "blendMode", "", "formularize", "F", "attabal", "()F", "(F)V", "alpha", "impassible", "shouldManuallySetCenterPivot", "Lsupplicat/competently;", "getPivotOffset-F1C5BW0", "saran", "(J)V", "pivotOffset", "kowloon", "monoploid", "scaleX", "arytenoidectomy", "cord", "graveside", "scaleY", "gintrap", "preprohormone", "translationX", "polloi", "dovishness", "translationY", "molybdenite", "creditor", "grimness", "shadowElevation", "Lrestrictive/overspeculate;", "sealless", "supplicat", "ambientShadowColor", "kattegat", "merc", "spotShadowColor", "rotuma", "rotationX", "rotationY", "rotationZ", "cameraDistance", "restrictive", "(Z)V", "clip", "cuirassed", "clipToBounds", "clipToOutline", "isInvalidated", "seminary", "Lrestrictive/clubfoot;", "colorFilter", "Lrestrictive/clubfoot;", "()Lrestrictive/clubfoot;", "setColorFilter", "(Lrestrictive/clubfoot;)V", "Lrestrictive/sensatory;", "renderEffect", "Lrestrictive/sensatory;", "()Lrestrictive/sensatory;", "(Lrestrictive/sensatory;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final AtomicBoolean f6646sealless = new AtomicBoolean(true);

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static boolean f6647yemenite;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public long spotShadowColor;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int blendMode;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public float scaleY;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public Paint layerPaint;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public boolean clip;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public int compositingStrategy;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final starveling canvasHolder;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public float alpha;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public long ambientShadowColor;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public Matrix matrix;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public float scaleX;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final RenderNode renderNode;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public float cameraDistance;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long ownerId;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public boolean clipToOutline;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean outlineIsProvided;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public long pivotOffset;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal canvasDrawScope;

    public saneness(View view, long j, starveling starvelingVar, merc.attabal attabalVar) {
        this.ownerId = j;
        this.canvasHolder = starvelingVar;
        this.canvasDrawScope = attabalVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        this.size = monoploid.INSTANCE.attabal();
        if (f6646sealless.getAndSet(false)) {
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
            mathsort(renderNodeCreate);
            hydrovane();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f6647yemenite) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        attabal.Companion companion = attabal.INSTANCE;
        starveling(companion.attabal());
        this.compositingStrategy = companion.attabal();
        this.blendMode = saran.INSTANCE.stratoscope();
        this.alpha = 1.0f;
        this.pivotOffset = competently.INSTANCE.saneness();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        overspeculate.Companion companion2 = overspeculate.INSTANCE;
        this.ambientShadowColor = companion2.attabal();
        this.spotShadowColor = companion2.attabal();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
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

    public final void dern() {
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

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void formularize(float f) {
        this.cameraDistance = f;
        this.renderNode.setCameraDistance(-f);
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

    public final void hydrovane() {
        polder.saran.f35407attabal.attabal(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void impassible(float f) {
        this.rotationX = f;
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean impromptu() {
        return this.renderNode.isValid();
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
        hydrovane();
    }

    public final void mathsort(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            privatdozent privatdozentVar = privatdozent.f35405attabal;
            privatdozentVar.dern(renderNode, privatdozentVar.attabal(renderNode));
            privatdozentVar.wireman(renderNode, privatdozentVar.saneness(renderNode));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void merc(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j;
            privatdozent.f35405attabal.wireman(this.renderNode, dent.wireman(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void molybdenite(float f) {
        this.rotationZ = f;
        this.renderNode.setRotation(f);
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

    public final void peridotite() {
        if (walach()) {
            starveling(attabal.INSTANCE.dern());
        } else {
            starveling(getCompositingStrategy());
        }
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(monoploid.competently(this.size) / 2.0f);
            this.renderNode.setPivotY(monoploid.beachfront(this.size) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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

    public final void starveling(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        attabal.Companion companion = attabal.INSTANCE;
        if (attabal.beachfront(compositingStrategy, companion.dern())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (attabal.beachfront(compositingStrategy, companion.saneness())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void stratoscope(creditor canvas) {
        DisplayListCanvas displayListCanvasDern = sealless.dern(canvas);
        Intrinsics.competently(displayListCanvasDern, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasDern.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void supplicat(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j;
            privatdozent.f35405attabal.dern(this.renderNode, dent.wireman(j));
        }
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
        Canvas canvasStart = this.renderNode.start(monoploid.competently(this.size), monoploid.beachfront(this.size));
        try {
            starveling starvelingVar = this.canvasHolder;
            Canvas internalCanvas = starvelingVar.getAndroidCanvas().getInternalCanvas();
            starvelingVar.getAndroidCanvas().arytenoidectomy(canvasStart);
            yemenite androidCanvas = starvelingVar.getAndroidCanvas();
            merc.attabal attabalVar = this.canvasDrawScope;
            long jSaneness = polloi.saneness(this.size);
            milliradian.wireman density2 = attabalVar.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = attabalVar.getDrawContext().getLayoutDirection();
            creditor creditorVarBeachfront = attabalVar.getDrawContext().beachfront();
            long jDern = attabalVar.getDrawContext().dern();
            GraphicsLayer graphicsLayer = attabalVar.getDrawContext().getGraphicsLayer();
            merc.wireman drawContext = attabalVar.getDrawContext();
            drawContext.cutely(density);
            drawContext.marial(layoutDirection);
            drawContext.taiyuan(androidCanvas);
            drawContext.competently(jSaneness);
            drawContext.wireman(layer);
            androidCanvas.formularize();
            try {
                block.invoke(attabalVar);
                androidCanvas.impromptu();
                merc.wireman drawContext2 = attabalVar.getDrawContext();
                drawContext2.cutely(density2);
                drawContext2.marial(layoutDirection2);
                drawContext2.taiyuan(creditorVarBeachfront);
                drawContext2.competently(jDern);
                drawContext2.wireman(graphicsLayer);
                starvelingVar.getAndroidCanvas().arytenoidectomy(internalCanvas);
                this.renderNode.end(canvasStart);
                seminary(false);
            } catch (Throwable th) {
                androidCanvas.impromptu();
                merc.wireman drawContext3 = attabalVar.getDrawContext();
                drawContext3.cutely(density2);
                drawContext3.marial(layoutDirection2);
                drawContext3.taiyuan(creditorVarBeachfront);
                drawContext3.competently(jDern);
                drawContext3.wireman(graphicsLayer);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
        }
    }

    public final boolean walach() {
        if (attabal.beachfront(getCompositingStrategy(), attabal.INSTANCE.dern()) || !saran.sealless(getBlendMode(), saran.INSTANCE.stratoscope())) {
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
        this.renderNode.setLeftTopRightBottom(x, y, monoploid.competently(size) + x, monoploid.beachfront(size) + y);
        if (monoploid.marial(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(monoploid.competently(size) / 2.0f);
            this.renderNode.setPivotY(monoploid.beachfront(size) / 2.0f);
        }
        this.size = size;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void polloi(sensatory sensatoryVar) {
    }

    public /* synthetic */ saneness(View view, long j, starveling starvelingVar, merc.attabal attabalVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j, (i & 4) != 0 ? new starveling() : starvelingVar, (i & 8) != 0 ? new merc.attabal() : attabalVar);
    }
}
