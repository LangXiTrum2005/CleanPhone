package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import androidx.collection.mathsort;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import merc.beachfront;
import merc.marial;
import milliradian.monoploid;
import milliradian.polloi;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import polder.kattegat;
import polder.restrictive;
import polder.sealless;
import polder.starveling;
import polder.supplicat;
import polder.yemenite;
import restrictive.clubfoot;
import restrictive.creditor;
import restrictive.lotta;
import restrictive.overspeculate;
import restrictive.saran;
import restrictive.seminary;
import restrictive.sensatory;
import supplicat.competently;
import supplicat.formularize;
import supplicat.impassible;
import supplicat.taiyuan;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0001\u0012B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0010J<\u0010,\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0)ø\u0001\u0000¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0000¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u0010J\u0015\u00105\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J.\u0010;\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u0002072\b\b\u0002\u0010\u000b\u001a\u0002082\b\b\u0002\u0010:\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010<J$\u0010=\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u0002072\b\b\u0002\u0010\u000b\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b=\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010BR\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010M\u001a\u0002078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010R\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010]\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010IR\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR$\u0010n\u001a\u00020G2\u0006\u0010j\u001a\u00020G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010I\u001a\u0004\bl\u0010mR0\u0010\t\u001a\u00020\b2\u0006\u0010o\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bp\u0010L\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR0\u0010\u000b\u001a\u00020\n2\u0006\u0010o\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bu\u0010L\u001a\u0004\bu\u0010r\"\u0004\bv\u0010tR0\u0010x\u001a\u0002072\u0006\u0010o\u001a\u0002078\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bq\u0010L\u001a\u0004\bZ\u0010r\"\u0004\bw\u0010tR*\u0010}\u001a\u00020y2\u0006\u0010o\u001a\u00020y8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bT\u0010z\"\u0004\b{\u0010|R&\u0010\u0081\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\r\u001a\u0004\bH\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R.\u0010\u0084\u0001\u001a\u00030\u0082\u00012\u0007\u0010o\u001a\u00030\u0082\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\r\u001a\u0004\bK\u0010z\"\u0005\b\u0083\u0001\u0010|R.\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010o\u001a\u0005\u0018\u00010\u0085\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bP\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R'\u0010\u008b\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\bg\u0010~\"\u0006\b\u008a\u0001\u0010\u0080\u0001R'\u0010\u008d\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\bk\u0010~\"\u0006\b\u008c\u0001\u0010\u0080\u0001R(\u0010\u0090\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008e\u0001\u0010~\"\u0006\b\u008f\u0001\u0010\u0080\u0001R(\u0010\u0093\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0091\u0001\u0010~\"\u0006\b\u0092\u0001\u0010\u0080\u0001R'\u0010\u0095\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\bp\u0010~\"\u0006\b\u0094\u0001\u0010\u0080\u0001R'\u0010\u0097\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\b\\\u0010~\"\u0006\b\u0096\u0001\u0010\u0080\u0001R'\u0010\u0099\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\b_\u0010~\"\u0006\b\u0098\u0001\u0010\u0080\u0001R'\u0010\u009b\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\bc\u0010~\"\u0006\b\u009a\u0001\u0010\u0080\u0001R(\u0010\u009e\u0001\u001a\u0002092\u0006\u0010o\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u009c\u0001\u0010~\"\u0006\b\u009d\u0001\u0010\u0080\u0001R.\u0010¢\u0001\u001a\u00020G2\u0006\u0010o\u001a\u00020G8F@FX\u0086\u000e¢\u0006\u0015\u0012\u0005\b¡\u0001\u0010\u0010\u001a\u0004\bN\u0010m\"\u0006\b\u009f\u0001\u0010 \u0001R/\u0010¨\u0001\u001a\u0005\u0018\u00010£\u00012\t\u0010o\u001a\u0005\u0018\u00010£\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0013\u0010ª\u0001\u001a\u00020S8F¢\u0006\u0007\u001a\u0005\bW\u0010©\u0001R/\u0010®\u0001\u001a\u00030«\u00012\u0007\u0010o\u001a\u00030«\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010r\"\u0005\b\u00ad\u0001\u0010tR/\u0010±\u0001\u001a\u00030«\u00012\u0007\u0010o\u001a\u00030«\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b¯\u0001\u0010r\"\u0005\b°\u0001\u0010t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006²\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "Lpolder/yemenite;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Lpolder/yemenite;)V", "Lmilliradian/impassible;", "topLeft", "Lmilliradian/monoploid;", "size", "", "grimness", "(JJ)V", "stratoscope", "()V", "graphicsLayer", "attabal", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "premeiotic", "(Landroid/graphics/Canvas;)V", "trm", "preprohormone", "cord", "saneness", "Landroidx/compose/ui/graphics/Path;", "path", "Landroid/graphics/Outline;", "timberyard", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "rotuma", "()Landroid/graphics/Outline;", "dern", "yemenite", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Lmerc/beachfront;", "block", "cuirassed", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "Lrestrictive/creditor;", "canvas", "parentLayer", "marial", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "oilcan", "wireman", "polder", "(Landroidx/compose/ui/graphics/Path;)V", "Lsupplicat/competently;", "Lsupplicat/impassible;", "", "cornerRadius", "walach", "(JJF)V", "saran", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Lmilliradian/wireman;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/jvm/functions/Function1;", "drawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "beachfront", "Z", "outlineDirty", "competently", "J", "roundRectOutlineTopLeft", "impromptu", "roundRectOutlineSize", "taiyuan", "F", "roundRectCornerRadius", "Landroidx/compose/ui/graphics/dern;", "cutely", "Landroidx/compose/ui/graphics/dern;", "internalOutline", "apical", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "formularize", "roundRectClipPath", "impassible", "usePathForClip", "Lrestrictive/lotta;", "triweekly", "Lrestrictive/lotta;", "softwareLayerPaint", "", "kowloon", "I", "parentLayerUsages", "Lpolder/attabal;", "arytenoidectomy", "Lpolder/attabal;", "childDependenciesTracker", "<set-?>", "monoploid", "gintrap", "()Z", "isReleased", "value", "polloi", "graveside", "()J", "dent", "(J)V", "molybdenite", "overspeculate", "seminary", "pivotOffset", "Landroidx/compose/ui/graphics/layer/attabal;", "()I", "merc", "(I)V", "compositingStrategy", "()F", "sealless", "(F)V", "alpha", "Lrestrictive/saran;", "setBlendMode-s9anfk8", "blendMode", "Lrestrictive/clubfoot;", "()Lrestrictive/clubfoot;", "setColorFilter", "(Lrestrictive/clubfoot;)V", "colorFilter", "peridotite", "scaleX", "mathsort", "scaleY", "adultoid", "permissivist", "translationX", "dovishness", "cultivated", "translationY", "splinterproof", "shadowElevation", "creditor", "rotationX", "starveling", "rotationY", "hydrovane", "rotationZ", "getCameraDistance", "supplicat", "cameraDistance", "restrictive", "(Z)V", "getClip$annotations", "clip", "Lrestrictive/sensatory;", "getRenderEffect", "()Lrestrictive/sensatory;", "privatdozent", "(Lrestrictive/sensatory;)V", "renderEffect", "()Landroidx/compose/ui/graphics/dern;", "outline", "Lrestrictive/overspeculate;", "getAmbientShadowColor-0d7_KjU", "kattegat", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "clubfoot", "spotShadowColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GraphicsLayer {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final sealless f6578dovishness;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public Path outlinePath;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final polder.attabal childDependenciesTracker;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final GraphicsLayerImpl impl;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public long roundRectOutlineTopLeft;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.graphics.dern internalOutline;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public Path roundRectClipPath;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public long pivotOffset;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public boolean usePathForClip;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public long roundRectOutlineSize;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int parentLayerUsages;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Outline androidOutline;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean isReleased;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public long topLeft;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public float roundRectCornerRadius;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public lotta softwareLayerPaint;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman density = marial.attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function1<? super beachfront, Unit> drawBlock = new Function1<beachfront, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(beachfront beachfrontVar) {
            invoke2(beachfrontVar);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(beachfront beachfrontVar) {
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean outlineDirty = true;

    static {
        sealless seallessVar;
        if (Build.VERSION.SDK_INT >= 28) {
            seallessVar = restrictive.f35406attabal;
        } else {
            seallessVar = starveling.f35409attabal.attabal() ? supplicat.f35410attabal : kattegat.f35401attabal;
        }
        f6578dovishness = seallessVar;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, yemenite yemeniteVar) {
        this.impl = graphicsLayerImpl;
        competently.Companion companion = competently.INSTANCE;
        this.roundRectOutlineTopLeft = companion.dern();
        this.roundRectOutlineSize = impassible.INSTANCE.attabal();
        this.childDependenciesTracker = new polder.attabal();
        graphicsLayerImpl.restrictive(false);
        this.topLeft = milliradian.impassible.INSTANCE.attabal();
        this.size = monoploid.INSTANCE.attabal();
        this.pivotOffset = companion.saneness();
    }

    public final float adultoid() {
        return this.impl.getTranslationX();
    }

    public final androidx.compose.ui.graphics.dern apical() {
        androidx.compose.ui.graphics.dern dernVar = this.internalOutline;
        Path path = this.outlinePath;
        if (dernVar != null) {
            return dernVar;
        }
        if (path != null) {
            androidx.compose.ui.graphics.dern.attabal attabalVar = new androidx.compose.ui.graphics.dern.attabal(path);
            this.internalOutline = attabalVar;
            return attabalVar;
        }
        long jSaneness = polloi.saneness(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != 9205357640488583168L) {
            jSaneness = j2;
        }
        float fApical = competently.apical(j);
        float fFormularize = competently.formularize(j);
        float fCompetently = fApical + impassible.competently(jSaneness);
        float fBeachfront = fFormularize + impassible.beachfront(jSaneness);
        float f = this.roundRectCornerRadius;
        androidx.compose.ui.graphics.dern c0046dern = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new androidx.compose.ui.graphics.dern.C0046dern(formularize.saneness(fApical, fFormularize, fCompetently, fBeachfront, supplicat.saneness.saneness(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null))) : new androidx.compose.ui.graphics.dern.saneness(new taiyuan(fApical, fFormularize, fCompetently, fBeachfront));
        this.internalOutline = c0046dern;
        return c0046dern;
    }

    public final float arytenoidectomy() {
        return this.impl.getScaleX();
    }

    public final void attabal(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.taiyuan(graphicsLayer)) {
            graphicsLayer.preprohormone();
        }
    }

    public final float beachfront() {
        return this.impl.getAlpha();
    }

    public final void clubfoot(long j) {
        if (overspeculate.formularize(j, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.merc(j);
    }

    public final int competently() {
        return this.impl.getBlendMode();
    }

    public final void cord() {
        this.parentLayerUsages--;
        dern();
    }

    public final void creditor(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.impassible(f);
    }

    public final void cuirassed(milliradian.wireman density, LayoutDirection layoutDirection, long size, Function1<? super beachfront, Unit> block) {
        overspeculate(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.seminary(true);
        stratoscope();
    }

    public final void cultivated(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.wireman(f);
    }

    public final int cutely() {
        return this.impl.getCompositingStrategy();
    }

    public final void dent(long j) {
        if (milliradian.impassible.dern(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        grimness(j, this.size);
    }

    public final void dern() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            wireman();
        }
    }

    public final float dovishness() {
        return this.impl.getTranslationY();
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final void grimness(long topLeft, long size) {
        this.impl.yemenite(milliradian.impassible.wireman(topLeft), milliradian.impassible.marial(topLeft), size);
    }

    public final void hydrovane(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.molybdenite(f);
    }

    public final float impassible() {
        return this.impl.getRotationX();
    }

    public final boolean impromptu() {
        return this.impl.getClip();
    }

    public final void kattegat(long j) {
        if (overspeculate.formularize(j, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.supplicat(j);
    }

    public final float kowloon() {
        return this.impl.getRotationZ();
    }

    public final void marial(creditor canvas, GraphicsLayer parentLayer) {
        if (this.isReleased) {
            return;
        }
        trm();
        saneness();
        boolean z = true;
        boolean z2 = polloi() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            canvas.apical();
        }
        Canvas canvasDern = restrictive.sealless.dern(canvas);
        boolean zIsHardwareAccelerated = canvasDern.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasDern.save();
            premeiotic(canvasDern);
        }
        if (!this.usePathForClip && (zIsHardwareAccelerated || !impromptu())) {
            z = false;
        }
        if (z) {
            canvas.formularize();
            androidx.compose.ui.graphics.dern dernVarApical = apical();
            if (dernVarApical instanceof androidx.compose.ui.graphics.dern.saneness) {
                creditor.saneness(canvas, dernVarApical.getRect(), 0, 2, null);
            } else if (dernVarApical instanceof androidx.compose.ui.graphics.dern.C0046dern) {
                Path pathAttabal = this.roundRectClipPath;
                if (pathAttabal != null) {
                    pathAttabal.dern();
                } else {
                    pathAttabal = androidx.compose.ui.graphics.saneness.attabal();
                    this.roundRectClipPath = pathAttabal;
                }
                Path.wireman(pathAttabal, ((androidx.compose.ui.graphics.dern.C0046dern) dernVarApical).getRoundRect(), null, 2, null);
                creditor.attabal(canvas, pathAttabal, 0, 2, null);
            } else if (dernVarApical instanceof androidx.compose.ui.graphics.dern.attabal) {
                creditor.attabal(canvas, ((androidx.compose.ui.graphics.dern.attabal) dernVarApical).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.attabal(this);
        }
        this.impl.stratoscope(canvas);
        if (z) {
            canvas.impromptu();
        }
        if (z2) {
            canvas.impassible();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasDern.restore();
    }

    public final void mathsort(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.graveside(f);
    }

    public final void merc(int i) {
        if (attabal.beachfront(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.privatdozent(i);
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final float monoploid() {
        return this.impl.getScaleY();
    }

    public final void oilcan() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        dern();
    }

    public final void overspeculate(long j) {
        if (monoploid.marial(this.size, j)) {
            return;
        }
        this.size = j;
        grimness(this.topLeft, j);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            saneness();
        }
    }

    public final void peridotite(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.cutely(f);
    }

    public final void permissivist(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.preprohormone(f);
    }

    public final void polder(Path path) {
        yemenite();
        this.outlinePath = path;
        saneness();
    }

    public final float polloi() {
        return this.impl.getShadowElevation();
    }

    public final void premeiotic(Canvas androidCanvas) {
        Canvas canvas;
        float fWireman = milliradian.impassible.wireman(this.topLeft);
        float fMarial = milliradian.impassible.marial(this.topLeft);
        float fWireman2 = milliradian.impassible.wireman(this.topLeft) + monoploid.competently(this.size);
        float fMarial2 = milliradian.impassible.marial(this.topLeft) + monoploid.beachfront(this.size);
        float fBeachfront = beachfront();
        taiyuan();
        int iCompetently = competently();
        if (fBeachfront < 1.0f || !saran.sealless(iCompetently, saran.INSTANCE.stratoscope()) || attabal.beachfront(cutely(), attabal.INSTANCE.dern())) {
            lotta lottaVarAttabal = this.softwareLayerPaint;
            if (lottaVarAttabal == null) {
                lottaVarAttabal = seminary.attabal();
                this.softwareLayerPaint = lottaVarAttabal;
            }
            lottaVarAttabal.saneness(fBeachfront);
            lottaVarAttabal.marial(iCompetently);
            lottaVarAttabal.competently(null);
            canvas = androidCanvas;
            canvas.saveLayer(fWireman, fMarial, fWireman2, fMarial2, lottaVarAttabal.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fWireman, fMarial);
        canvas.concat(this.impl.polder());
    }

    public final void preprohormone() {
        this.parentLayerUsages++;
    }

    public final void privatdozent(sensatory sensatoryVar) {
        this.impl.cuirassed();
        if (Intrinsics.wireman(null, sensatoryVar)) {
            return;
        }
        this.impl.polloi(sensatoryVar);
    }

    public final void restrictive(boolean z) {
        if (this.impl.getClip() != z) {
            this.impl.restrictive(z);
            this.outlineDirty = true;
            saneness();
        }
    }

    public final Outline rotuma() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    public final void saneness() {
        if (this.outlineDirty) {
            if (impromptu() || polloi() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Path path = this.outlinePath;
                if (path != null) {
                    Outline outlineTimberyard = timberyard(path);
                    outlineTimberyard.setAlpha(beachfront());
                    this.impl.adultoid(outlineTimberyard);
                } else {
                    Outline outlineRotuma = rotuma();
                    long jSaneness = polloi.saneness(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    if (j2 != 9205357640488583168L) {
                        jSaneness = j2;
                    }
                    outlineRotuma.setRoundRect(Math.round(competently.apical(j)), Math.round(competently.formularize(j)), Math.round(competently.apical(j) + impassible.competently(jSaneness)), Math.round(competently.formularize(j) + impassible.beachfront(jSaneness)), this.roundRectCornerRadius);
                    outlineRotuma.setAlpha(beachfront());
                    this.impl.adultoid(outlineRotuma);
                }
            } else {
                this.impl.adultoid(null);
            }
        }
        this.outlineDirty = false;
    }

    public final void saran(long topLeft, long size) {
        walach(topLeft, size, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void sealless(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.saneness(f);
    }

    public final void seminary(long j) {
        if (competently.taiyuan(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.saran(j);
    }

    public final void splinterproof(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.grimness(f);
        this.impl.restrictive(impromptu() || f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.outlineDirty = true;
        saneness();
    }

    public final void starveling(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.kowloon(f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005a->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:20:0x005a->B:30:0x0091], SYNTHETIC] */
    public final void stratoscope() {
        polder.attabal attabalVar = this.childDependenciesTracker;
        attabalVar.oldDependency = attabalVar.dependency;
        androidx.collection.saran saranVar = attabalVar.dependenciesSet;
        if (saranVar != null && saranVar.marial()) {
            androidx.collection.saran saranVarAttabal = attabalVar.oldDependenciesSet;
            if (saranVarAttabal == null) {
                saranVarAttabal = mathsort.attabal();
                attabalVar.oldDependenciesSet = saranVarAttabal;
            }
            saranVarAttabal.taiyuan(saranVar);
            saranVar.impassible();
        }
        attabalVar.trackingInProgress = true;
        this.impl.trm(this.density, this.layoutDirection, this, this.drawBlock);
        attabalVar.trackingInProgress = false;
        GraphicsLayer graphicsLayer = attabalVar.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.cord();
        }
        androidx.collection.saran saranVar2 = attabalVar.oldDependenciesSet;
        if (saranVar2 == null || !saranVar2.marial()) {
            return;
        }
        Object[] objArr = saranVar2.elements;
        long[] jArr = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
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
                            ((GraphicsLayer) objArr[(i << 3) + i3]).cord();
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
        saranVar2.impassible();
    }

    public final void supplicat(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.formularize(f);
    }

    public final clubfoot taiyuan() {
        this.impl.beachfront();
        return null;
    }

    public final Outline timberyard(Path path) {
        Outline outlineRotuma = rotuma();
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || path.attabal()) {
            if (i > 30) {
                polder.seminary.f35408attabal.attabal(outlineRotuma, path);
            } else {
                if (!(path instanceof androidx.compose.ui.graphics.attabal)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineRotuma.setConvexPath(((androidx.compose.ui.graphics.attabal) path).getInternalPath());
            }
            this.usePathForClip = !outlineRotuma.canClip();
        } else {
            Outline outline = this.androidOutline;
            if (outline != null) {
                outline.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.seminary(true);
        }
        this.outlinePath = path;
        return outlineRotuma;
    }

    public final float triweekly() {
        return this.impl.getRotationY();
    }

    public final void trm() {
        if (this.impl.impromptu()) {
            return;
        }
        try {
            stratoscope();
        } catch (Throwable unused) {
        }
    }

    public final void walach(long topLeft, long size, float cornerRadius) {
        if (competently.taiyuan(this.roundRectOutlineTopLeft, topLeft) && impassible.marial(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        yemenite();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        saneness();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void wireman() {
        polder.attabal attabalVar = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = attabalVar.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.cord();
            attabalVar.dependency = null;
        }
        androidx.collection.saran saranVar = attabalVar.dependenciesSet;
        if (saranVar != null) {
            Object[] objArr = saranVar.elements;
            long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
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
                                ((GraphicsLayer) objArr[(i << 3) + i3]).cord();
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
            saranVar.impassible();
        }
        this.impl.marial();
    }

    public final void yemenite() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = impassible.INSTANCE.attabal();
        this.roundRectOutlineTopLeft = competently.INSTANCE.dern();
        this.roundRectCornerRadius = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }
}
