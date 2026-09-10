package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import supplicat.MutableRect;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002:@BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J!\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0012J7\u00103\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u0012J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u0012J\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\u0012J\"\u0010:\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010?J9\u0010@\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010UR*\u0010[\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bO\u0010\u001a\"\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010RR\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010RR\u001a\u0010p\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010w\u001a\u0004\u0018\u00010t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010oR$\u0010\u007f\u001a\u00020z2\u0006\u0010W\u001a\u00020z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/walach;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Lrestrictive/creditor;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "adultoid", "()V", "graveside", "Lrestrictive/underbelly;", "scope", "beachfront", "(Lrestrictive/underbelly;)V", "", "hasOverlappingRendering", "()Z", "Lsupplicat/competently;", X3.i.L, "marial", "(J)Z", "Lmilliradian/monoploid;", "size", "wireman", "(J)V", "Lmilliradian/impassible;", "impromptu", "canvas", "parentLayer", "attabal", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "changed", "", "l", "t", "r", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "onLayout", "(ZIIII)V", "destroy", "taiyuan", "forceLayout", "point", "inverse", "saneness", "(JZ)J", "Lsupplicat/marial;", "rect", "competently", "(Lsupplicat/marial;Z)V", "dern", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "kowloon", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "arytenoidectomy", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "monoploid", "Lkotlin/jvm/functions/Function2;", "polloi", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/milliradian;", "molybdenite", "Landroidx/compose/ui/platform/milliradian;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "dovishness", "setInvalidated", "(Z)V", "isInvalidated", "gintrap", "drawnWithZ", "Lrestrictive/starveling;", "rotuma", "Lrestrictive/starveling;", "canvasHolder", "Landroidx/compose/ui/platform/cultivated;", "preprohormone", "Landroidx/compose/ui/platform/cultivated;", "matrixCache", "Lrestrictive/picketboat;", "cord", "J", "mTransformOrigin", "cuirassed", "mHasOverlappingRendering", "", "stratoscope", "getLayerId", "()J", "layerId", "trm", "I", "mutatedFields", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "oilcan", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLayer extends View implements androidx.compose.ui.node.walach {

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static boolean f7356merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static boolean f7358polder;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public static Field f7359restrictive;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static Method f7361supplicat;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public Rect clipBoundsCache;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final DrawChildContainer container;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public long mTransformOrigin;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean mHasOverlappingRendering;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public boolean drawnWithZ;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final milliradian outlineResolver;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> invalidateParentLayer;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final cultivated<View> matrixCache;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final restrictive.starveling canvasHolder;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public int mutatedFields;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final int f7362yemenite = 8;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final Function2<View, Matrix, Unit> f7360sealless = new Function2<View, Matrix, Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            invoke2(view, matrix);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final ViewOutlineProvider f7355kattegat = new attabal();

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/ViewLayer$attabal", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.competently(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineSaneness = ((ViewLayer) view).outlineResolver.saneness();
            Intrinsics.beachfront(outlineSaneness);
            outline.set(outlineSaneness);
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$dern;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "attabal", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f7378attabal = new dern();

        public static final long attabal(View view) {
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$saneness;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "wireman", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "attabal", "()Z", "shouldUseDispatchDraw", "saneness", "dern", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean attabal() {
            return ViewLayer.f7356merc;
        }

        public final void dern(boolean z) {
            ViewLayer.f7358polder = z;
        }

        public final boolean saneness() {
            return ViewLayer.f7358polder;
        }

        public final void wireman(View view) {
            try {
                if (!attabal()) {
                    ViewLayer.f7356merc = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f7361supplicat = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.f7359restrictive = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f7361supplicat = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f7359restrictive = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f7361supplicat;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f7359restrictive;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f7359restrictive;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f7361supplicat;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                dern(true);
            }
        }

        public Companion() {
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new milliradian();
        this.canvasHolder = new restrictive.starveling();
        this.matrixCache = new cultivated<>(f7360sealless);
        this.mTransformOrigin = restrictive.picketboat.INSTANCE.attabal();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.marial()) {
            return null;
        }
        return this.outlineResolver.wireman();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.wostteth(this, z);
        }
    }

    public final void adultoid() {
        setOutlineProvider(this.outlineResolver.saneness() != null ? f7355kattegat : null);
    }

    @Override // androidx.compose.ui.node.walach
    public void attabal(restrictive.creditor canvas, GraphicsLayer parentLayer) {
        boolean z = getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.drawnWithZ = z;
        if (z) {
            canvas.apical();
        }
        this.container.attabal(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.impassible();
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void beachfront(restrictive.underbelly scope) {
        Function0<Unit> function0;
        int iFormularize = scope.getMutatedFields() | this.mutatedFields;
        if ((iFormularize & 4096) != 0) {
            long jKowloon = scope.getTransformOrigin();
            this.mTransformOrigin = jKowloon;
            setPivotX(restrictive.picketboat.wireman(jKowloon) * getWidth());
            setPivotY(restrictive.picketboat.marial(this.mTransformOrigin) * getHeight());
        }
        if ((iFormularize & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((iFormularize & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((iFormularize & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((iFormularize & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((iFormularize & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((iFormularize & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((iFormularize & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((iFormularize & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((iFormularize & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((iFormularize & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.beachfront.attabal();
        if ((iFormularize & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.beachfront.attabal();
            graveside();
            setClipToOutline(z3);
        }
        boolean zImpromptu = this.outlineResolver.impromptu(scope.getOutline(), scope.getAlpha(), z3, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            adultoid();
        }
        boolean z4 = getManualClipPath() != null;
        if (z2 != z4 || (z4 && zImpromptu)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((iFormularize & 7963) != 0) {
            this.matrixCache.dern();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if ((iFormularize & 64) != 0) {
                dhss.f7431attabal.attabal(this, restrictive.dent.wireman(scope.getAmbientShadowColor()));
            }
            if ((iFormularize & 128) != 0) {
                dhss.f7431attabal.saneness(this, restrictive.dent.wireman(scope.getSpotShadowColor()));
            }
        }
        if (i >= 31 && (131072 & iFormularize) != 0) {
            vesuvio vesuvioVar = vesuvio.f7519attabal;
            scope.triweekly();
            vesuvioVar.attabal(this, null);
        }
        if ((iFormularize & 32768) != 0) {
            int iMarial = scope.getCompositingStrategy();
            restrictive.permissivist.Companion companion = restrictive.permissivist.INSTANCE;
            if (restrictive.permissivist.beachfront(iMarial, companion.dern())) {
                setLayerType(2, null);
            } else {
                if (restrictive.permissivist.beachfront(iMarial, companion.saneness())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.mHasOverlappingRendering = z;
            }
            z = true;
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.walach
    public void competently(MutableRect rect, boolean inverse) {
        if (!inverse) {
            restrictive.lerp.competently(this.matrixCache.saneness(this), rect);
            return;
        }
        float[] fArrAttabal = this.matrixCache.attabal(this);
        if (fArrAttabal != null) {
            restrictive.lerp.competently(fArrAttabal, rect);
        } else {
            rect.competently(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // androidx.compose.ui.node.walach
    public void dern(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = restrictive.picketboat.INSTANCE.attabal();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.walach
    public void destroy() {
        setInvalidated(false);
        this.ownerView.claque();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.unconsolidated(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        restrictive.starveling starvelingVar = this.canvasHolder;
        Canvas canvasKowloon = starvelingVar.getAndroidCanvas().getInternalCanvas();
        starvelingVar.getAndroidCanvas().arytenoidectomy(canvas);
        restrictive.yemenite yemeniteVarAttabal = starvelingVar.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            yemeniteVarAttabal.formularize();
            this.outlineResolver.attabal(yemeniteVarAttabal);
            z = true;
        }
        Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(yemeniteVarAttabal, null);
        }
        if (z) {
            yemeniteVarAttabal.impromptu();
        }
        starvelingVar.getAndroidCanvas().arytenoidectomy(canvasKowloon);
        setInvalidated(false);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return dern.attabal(this.ownerView);
        }
        return -1L;
    }

    public final void graveside() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.beachfront(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // androidx.compose.ui.node.walach
    public void impromptu(long position) {
        int iWireman = milliradian.impassible.wireman(position);
        if (iWireman != getLeft()) {
            offsetLeftAndRight(iWireman - getLeft());
            this.matrixCache.dern();
        }
        int iMarial = milliradian.impassible.marial(position);
        if (iMarial != getTop()) {
            offsetTopAndBottom(iMarial - getTop());
            this.matrixCache.dern();
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.walach
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.walach
    public boolean marial(long position) {
        float fApical = supplicat.competently.apical(position);
        float fFormularize = supplicat.competently.formularize(position);
        if (this.clipToBounds) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fApical && fApical < ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fFormularize && fFormularize < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.beachfront(position);
        }
        return true;
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.walach
    public long saneness(long point, boolean inverse) {
        if (!inverse) {
            return restrictive.lerp.beachfront(this.matrixCache.saneness(this), point);
        }
        float[] fArrAttabal = this.matrixCache.attabal(this);
        return fArrAttabal != null ? restrictive.lerp.beachfront(fArrAttabal, point) : supplicat.competently.INSTANCE.attabal();
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.walach
    public void taiyuan() {
        if (!this.isInvalidated || f7358polder) {
            return;
        }
        INSTANCE.wireman(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.walach
    public void wireman(long size) {
        int iCompetently = milliradian.monoploid.competently(size);
        int iBeachfront = milliradian.monoploid.beachfront(size);
        if (iCompetently == getWidth() && iBeachfront == getHeight()) {
            return;
        }
        setPivotX(restrictive.picketboat.wireman(this.mTransformOrigin) * iCompetently);
        setPivotY(restrictive.picketboat.marial(this.mTransformOrigin) * iBeachfront);
        adultoid();
        layout(getLeft(), getTop(), getLeft() + iCompetently, getTop() + iBeachfront);
        graveside();
        this.matrixCache.dern();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
