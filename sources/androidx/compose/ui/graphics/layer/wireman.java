package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.LayoutDirection;
import merc.beachfront;
import milliradian.monoploid;
import milliradian.polloi;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import polder.mathsort;
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

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009d\u00012\u00020\u0001:\u00017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J;\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000e0*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010AR\u001c\u0010G\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010S\u001a\u0004\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010=R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u00109R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010a\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010^\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0016\u0010g\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010^R\u001a\u0010j\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u00109\u001a\u0004\bi\u0010;R0\u0010p\u001a\u00020k2\u0006\u0010l\u001a\u00020k8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bm\u0010Z\u001a\u0004\b\\\u0010n\"\u0004\bo\u0010\u0010R0\u0010\r\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010Z\u001a\u0004\bq\u0010n\"\u0004\br\u0010\u0010R*\u0010y\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\b7\u0010xR\u0016\u0010{\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010^R2\u0010\u0081\u0001\u001a\u00020|2\u0006\u0010l\u001a\u00020|8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\b}\u00109\u001a\u0004\b~\u0010;\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0083\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0082\u0001\u0010u\u001a\u0004\bd\u0010w\"\u0004\bT\u0010xR-\u0010\u0085\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0084\u0001\u0010u\u001a\u0005\b\u0084\u0001\u0010w\"\u0004\bm\u0010xR-\u0010\u0087\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0086\u0001\u0010u\u001a\u0004\bz\u0010w\"\u0005\b\u0082\u0001\u0010xR+\u0010\u0088\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010u\u001a\u0004\bt\u0010w\"\u0004\b<\u0010xR-\u0010\u008b\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b-\u0010u\u001a\u0005\b\u0089\u0001\u0010w\"\u0005\b\u008a\u0001\u0010xR6\u0010\u008f\u0001\u001a\u00030\u008c\u00012\u0007\u0010l\u001a\u00030\u008c\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\bq\u00109\u001a\u0005\b\u008d\u0001\u0010;\"\u0006\b\u008e\u0001\u0010\u0080\u0001R6\u0010\u0092\u0001\u001a\u00030\u008c\u00012\u0007\u0010l\u001a\u00030\u008c\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b\u001e\u00109\u001a\u0005\b\u0090\u0001\u0010;\"\u0006\b\u0091\u0001\u0010\u0080\u0001R,\u0010\u0093\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u008d\u0001\u0010u\u001a\u0004\b}\u0010w\"\u0004\b[\u0010xR,\u0010\u0094\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0090\u0001\u0010u\u001a\u0004\bI\u0010w\"\u0004\b]\u0010xR,\u0010\u0095\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u008e\u0001\u0010u\u001a\u0004\bQ\u0010w\"\u0004\bh\u0010xR6\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\t\u0010l\u001a\u0005\u0018\u00010\u0096\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\bE\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R%\u0010\u009c\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020s8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010w\"\u0004\bY\u0010xR&\u0010\u009e\u0001\u001a\u00020\u00132\u0006\u0010l\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b`\u0010\u0015\"\u0005\b\u009d\u0001\u0010cR6\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010l\u001a\u0005\u0018\u00010\u009f\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b\u0086\u0001\u0010¢\u0001\"\u0005\bf\u0010£\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/wireman;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Lrestrictive/starveling;", "canvasHolder", "Lmerc/attabal;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLrestrictive/starveling;Lmerc/attabal;)V", "Landroidx/compose/ui/graphics/layer/attabal;", "compositingStrategy", "", "dern", "(I)V", "mathsort", "()V", "", "hydrovane", "()Z", "walach", "starveling", "peridotite", "", "x", "y", "Lmilliradian/monoploid;", "size", "yemenite", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "adultoid", "(Landroid/graphics/Outline;)V", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Lmerc/beachfront;", "block", "trm", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lrestrictive/creditor;", "canvas", "stratoscope", "(Lrestrictive/creditor;)V", "Landroid/graphics/Matrix;", "polder", "()Landroid/graphics/Matrix;", "marial", "saneness", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "J", "getOwnerId", "()J", "wireman", "Lrestrictive/starveling;", "getCanvasHolder", "()Lrestrictive/starveling;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "beachfront", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "competently", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "impromptu", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "taiyuan", "Landroid/graphics/Picture;", "picture", "cutely", "Lmerc/attabal;", "pictureDrawScope", "apical", "pictureCanvasHolder", "formularize", "I", "impassible", "triweekly", "kowloon", "Z", "clipBoundsInvalidated", "arytenoidectomy", "isInvalidated", "seminary", "(Z)V", "monoploid", "outlineIsProvided", "polloi", "clipToBounds", "molybdenite", "getLayerId", "layerId", "Lrestrictive/saran;", "value", "graveside", "()I", "setBlendMode-s9anfk8", "blendMode", "oilcan", "privatdozent", "", "dovishness", "F", "attabal", "()F", "(F)V", "alpha", "gintrap", "shouldManuallySetCenterPivot", "Lsupplicat/competently;", "rotuma", "getPivotOffset-F1C5BW0", "saran", "(J)V", "pivotOffset", "preprohormone", "scaleX", "cord", "scaleY", "cuirassed", "translationX", "translationY", "creditor", "grimness", "shadowElevation", "Lrestrictive/overspeculate;", "sealless", "supplicat", "ambientShadowColor", "kattegat", "merc", "spotShadowColor", "rotationX", "rotationY", "rotationZ", "Lrestrictive/clubfoot;", "colorFilter", "Lrestrictive/clubfoot;", "()Lrestrictive/clubfoot;", "setColorFilter", "(Lrestrictive/clubfoot;)V", "cameraDistance", "restrictive", "clip", "Lrestrictive/sensatory;", "renderEffect", "Lrestrictive/sensatory;", "()Lrestrictive/sensatory;", "(Lrestrictive/sensatory;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public int compositingStrategy;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final starveling pictureCanvasHolder;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Resources resources;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Rect clipRect;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public float scaleY;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal pictureDrawScope;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final long ownerId;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public float alpha;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public int x;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int blendMode;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public int y;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public Paint layerPaint;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public boolean clipBoundsInvalidated;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final ViewLayer viewLayer;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean outlineIsProvided;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public long ambientShadowColor;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public float scaleX;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public long pivotOffset;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final DrawChildContainer layerContainer;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final Picture picture;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final starveling canvasHolder;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public long spotShadowColor;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final boolean f6677merc = !polder.starveling.f35409attabal.attabal();

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final Canvas f6678polder = new attabal();

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/layer/wireman$attabal", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends Canvas {
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public wireman(DrawChildContainer drawChildContainer, long j, starveling starvelingVar, merc.attabal attabalVar) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j;
        this.canvasHolder = starvelingVar;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, starvelingVar, attabalVar);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z = f6677merc;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new merc.attabal() : null;
        this.pictureCanvasHolder = z ? new starveling() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = monoploid.INSTANCE.attabal();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = saran.INSTANCE.stratoscope();
        this.compositingStrategy = androidx.compose.ui.graphics.layer.attabal.INSTANCE.attabal();
        this.alpha = 1.0f;
        this.pivotOffset = competently.INSTANCE.dern();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        overspeculate.Companion companion = overspeculate.INSTANCE;
        this.ambientShadowColor = companion.attabal();
        this.spotShadowColor = companion.attabal();
    }

    private final boolean hydrovane() {
        return androidx.compose.ui.graphics.layer.attabal.beachfront(getCompositingStrategy(), androidx.compose.ui.graphics.layer.attabal.INSTANCE.dern()) || walach();
    }

    private final void mathsort() {
        if (hydrovane()) {
            dern(androidx.compose.ui.graphics.layer.attabal.INSTANCE.dern());
        } else {
            dern(getCompositingStrategy());
        }
    }

    private final boolean walach() {
        if (!saran.sealless(getBlendMode(), saran.INSTANCE.stratoscope())) {
            return true;
        }
        beachfront();
        return false;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void adultoid(Outline outline) {
        boolean zDern = this.viewLayer.dern(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zDern) {
            return;
        }
        this.viewLayer.invalidate();
        starveling();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: apical */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: arytenoidectomy */
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
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
        this.viewLayer.setScaleX(f);
    }

    public final void dern(int compositingStrategy) {
        ViewLayer viewLayer = this.viewLayer;
        androidx.compose.ui.graphics.layer.attabal.Companion companion = androidx.compose.ui.graphics.layer.attabal.INSTANCE;
        boolean z = true;
        if (androidx.compose.ui.graphics.layer.attabal.beachfront(compositingStrategy, companion.dern())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (androidx.compose.ui.graphics.layer.attabal.beachfront(compositingStrategy, companion.saneness())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void formularize(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void graveside(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void grimness(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void impassible(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void kowloon(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void marial() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void merc(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j;
            mathsort.f35402attabal.dern(this.viewLayer, dent.wireman(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void molybdenite(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
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
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix polder() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void polloi(sensatory sensatoryVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            polder.overspeculate.f35404attabal.attabal(this.viewLayer, sensatoryVar);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void preprohormone(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void privatdozent(int i) {
        this.compositingStrategy = i;
        mathsort();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void restrictive(boolean z) {
        boolean z2 = false;
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z && this.outlineIsProvided) {
            z2 = true;
        }
        viewLayer.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: rotuma, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void saneness(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void saran(long j) {
        this.pivotOffset = j;
        if (!impromptu.wireman(j)) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(competently.apical(j));
            this.viewLayer.setPivotY(competently.formularize(j));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mathsort.f35402attabal.attabal(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(monoploid.competently(this.size) / 2.0f);
            this.viewLayer.setPivotY(monoploid.beachfront(this.size) / 2.0f);
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

    public final void starveling() {
        try {
            starveling starvelingVar = this.canvasHolder;
            Canvas canvas = f6678polder;
            Canvas internalCanvas = starvelingVar.getAndroidCanvas().getInternalCanvas();
            starvelingVar.getAndroidCanvas().arytenoidectomy(canvas);
            yemenite androidCanvas = starvelingVar.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.attabal(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            starvelingVar.getAndroidCanvas().arytenoidectomy(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void stratoscope(creditor canvas) {
        peridotite();
        Canvas canvasDern = sealless.dern(canvas);
        if (canvasDern.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.attabal(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasDern.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void supplicat(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j;
            mathsort.f35402attabal.saneness(this.viewLayer, dent.wireman(j));
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
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            starveling();
            Picture picture = this.picture;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(monoploid.competently(this.size), monoploid.beachfront(this.size));
                try {
                    starveling starvelingVar = this.pictureCanvasHolder;
                    if (starvelingVar != null) {
                        Canvas internalCanvas = starvelingVar.getAndroidCanvas().getInternalCanvas();
                        starvelingVar.getAndroidCanvas().arytenoidectomy(canvasBeginRecording);
                        yemenite androidCanvas = starvelingVar.getAndroidCanvas();
                        merc.attabal attabalVar = this.pictureDrawScope;
                        if (attabalVar != null) {
                            long jSaneness = polloi.saneness(this.size);
                            merc.attabal.DrawParams drawParams = attabalVar.getDrawParams();
                            milliradian.wireman density2 = drawParams.getDensity();
                            LayoutDirection layoutDirectionSaneness = drawParams.saneness();
                            creditor canvas = drawParams.getCanvas();
                            long jWireman = drawParams.wireman();
                            merc.attabal.DrawParams drawParams2 = attabalVar.getDrawParams();
                            drawParams2.cutely(density);
                            drawParams2.apical(layoutDirection);
                            drawParams2.taiyuan(androidCanvas);
                            drawParams2.formularize(jSaneness);
                            androidCanvas.formularize();
                            block.invoke(attabalVar);
                            androidCanvas.impromptu();
                            merc.attabal.DrawParams drawParams3 = attabalVar.getDrawParams();
                            drawParams3.cutely(density2);
                            drawParams3.apical(layoutDirectionSaneness);
                            drawParams3.taiyuan(canvas);
                            drawParams3.formularize(jWireman);
                        }
                        starvelingVar.getAndroidCanvas().arytenoidectomy(internalCanvas);
                        Unit unit = Unit.f29295attabal;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void wireman(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void yemenite(int x, int y, long size) {
        if (monoploid.marial(this.size, size)) {
            int i = this.x;
            if (i != x) {
                this.viewLayer.offsetLeftAndRight(x - i);
            }
            int i2 = this.y;
            if (i2 != y) {
                this.viewLayer.offsetTopAndBottom(y - i2);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            this.viewLayer.layout(x, y, monoploid.competently(size) + x, monoploid.beachfront(size) + y);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(monoploid.competently(size) / 2.0f);
                this.viewLayer.setPivotY(monoploid.beachfront(size) / 2.0f);
            }
        }
        this.x = x;
        this.y = y;
    }

    public /* synthetic */ wireman(DrawChildContainer drawChildContainer, long j, starveling starvelingVar, merc.attabal attabalVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j, (i & 4) != 0 ? new starveling() : starvelingVar, (i & 8) != 0 ? new merc.attabal() : attabalVar);
    }
}
