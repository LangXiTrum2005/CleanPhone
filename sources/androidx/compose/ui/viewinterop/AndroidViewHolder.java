package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.competently;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.mathsort;
import androidx.compose.ui.node.peridotite;
import androidx.core.view.kattegat;
import androidx.core.view.sealless;
import androidx.p001lifecycle.C0828overspeculate;
import androidx.p001lifecycle.arytenoidectomy;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import inrooted.impassible;
import inrooted.taiyuan;
import milliradian.rotuma;
import milliradian.wireman;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import supplicat.impromptu;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 Â\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ã\u0001J\u0015\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eJ7\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\fH\u0014¢\u0006\u0004\b%\u0010\u000eJ%\u0010+\u001a\u0004\u0018\u00010*2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0010H\u0014¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\u00162\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u0010:J/\u0010=\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0010H\u0016¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010DJG\u0010J\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\u0006\u0010I\u001a\u00020&H\u0016¢\u0006\u0004\bJ\u0010KJ?\u0010J\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010LJ7\u0010O\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u00102\u0006\u0010I\u001a\u00020&2\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\bO\u0010PJ/\u0010T\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00052\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020Q2\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bT\u0010UJ'\u0010V\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00052\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0016H\u0016¢\u0006\u0004\bX\u0010:R\u0017\u0010\\\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\bR\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R6\u0010i\u001a\b\u0012\u0004\u0012\u00020\f0a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\f0a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR6\u0010q\u001a\b\u0012\u0004\u0012\u00020\f0a2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\f0a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR6\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0a2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\f0a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010d\u001a\u0004\bs\u0010f\"\u0004\bt\u0010hR*\u0010}\u001a\u00020v2\u0006\u0010b\u001a\u00020v8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R6\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\f\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R3\u0010\u008d\u0001\u001a\u00030\u0086\u00012\u0007\u0010b\u001a\u00030\u0086\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R8\u0010\u0091\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0080\u0001\u001a\u0006\b\u008f\u0001\u0010\u0082\u0001\"\u0006\b\u0090\u0001\u0010\u0084\u0001R7\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0092\u00012\t\u0010b\u001a\u0005\u0018\u00010\u0092\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R7\u0010¡\u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010b\u001a\u0005\u0018\u00010\u009a\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\f0a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¢\u0001\u0010dR\u001c\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\f0a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010dR7\u0010©\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u0080\u0001\u001a\u0006\b§\u0001\u0010\u0082\u0001\"\u0006\b¨\u0001\u0010\u0084\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0019\u0010®\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010°\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u00ad\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¶\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010kR\u001d\u0010¼\u0001\u001a\u00030·\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0016\u0010½\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010:R\u0018\u0010Á\u0001\u001a\u00030¾\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001¨\u0006Ä\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/sealless;", "Landroidx/compose/runtime/competently;", "Landroidx/compose/ui/node/mathsort;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "dern", "()V", "saneness", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "competently", "", "changed", "l", "t", "r", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "marial", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", TtmlNode.TAG_REGION, "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "kowloon", "Landroid/view/View;", "getView", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/node/peridotite;", "arytenoidectomy", "Landroidx/compose/ui/node/peridotite;", "owner", "Lkotlin/Function0;", "value", "monoploid", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "polloi", "Z", "hasUpdateBlock", "<set-?>", "molybdenite", "getReset", "setReset", "reset", "graveside", "getRelease", "setRelease", "release", "Landroidx/compose/ui/attabal;", "adultoid", "Landroidx/compose/ui/attabal;", "getModifier", "()Landroidx/compose/ui/attabal;", "setModifier", "(Landroidx/compose/ui/attabal;)V", "modifier", "Lkotlin/Function1;", "dovishness", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Lmilliradian/wireman;", "gintrap", "Lmilliradian/wireman;", "getDensity", "()Lmilliradian/wireman;", "setDensity", "(Lmilliradian/wireman;)V", "density", "rotuma", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/arytenoidectomy;", "preprohormone", "Landroidx/lifecycle/arytenoidectomy;", "getLifecycleOwner", "()Landroidx/lifecycle/arytenoidectomy;", "setLifecycleOwner", "(Landroidx/lifecycle/arytenoidectomy;)V", "lifecycleOwner", "Linrooted/taiyuan;", "cord", "Linrooted/taiyuan;", "getSavedStateRegistryOwner", "()Linrooted/taiyuan;", "setSavedStateRegistryOwner", "(Linrooted/taiyuan;)V", "savedStateRegistryOwner", "cuirassed", "runUpdate", "stratoscope", "runInvalidate", "trm", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "oilcan", "[I", "yemenite", "I", "lastWidthMeasureSpec", "sealless", "lastHeightMeasureSpec", "Landroidx/core/view/kattegat;", "kattegat", "Landroidx/core/view/kattegat;", "nestedScrollingParentHelper", "supplicat", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "restrictive", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "merc", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements sealless, competently, mathsort {

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final int f7917polder = 8;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final Function1<AndroidViewHolder, Unit> f7918seminary = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal modifier;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final peridotite owner;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public taiyuan savedStateRegistryOwner;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> runUpdate;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public Function1<? super androidx.compose.ui.attabal, Unit> onModifierChanged;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public wireman density;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> release;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final kattegat nestedScrollingParentHelper;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> reset;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> update;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final int[] location;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean hasUpdateBlock;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public arytenoidectomy lifecycleOwner;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public Function1<? super wireman, Unit> onDensityChanged;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> runInvalidate;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public boolean isDrawing;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public int lastWidthMeasureSpec;

    public static final void beachfront(Function0 function0) {
        function0.invoke();
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            peridotite.attabal.saneness("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    public final void competently() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // androidx.compose.runtime.competently
    public void dern() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final wireman getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final arytenoidectomy getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final androidx.compose.ui.attabal getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.attabal();
    }

    public final Function1<wireman, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<androidx.compose.ui.attabal, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final taiyuan getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        marial();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    public final void marial() {
        if (!this.isDrawing) {
            this.layoutNode.czestochowa();
            return;
        }
        View view = this.view;
        final Function0<Unit> function0 = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.attabal
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.beachfront(function0);
            }
        });
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        marial();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().attabal(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        rotuma.attabal(dern.marial(velocityX), dern.marial(velocityY));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        rotuma.attabal(dern.marial(velocityX), dern.marial(velocityY));
        throw null;
    }

    @Override // androidx.core.view.yemenite
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            impromptu.attabal(dern.wireman(dx), dern.wireman(dy));
            dern.beachfront(type);
            throw null;
        }
    }

    @Override // androidx.core.view.sealless
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            impromptu.attabal(dern.wireman(dxConsumed), dern.wireman(dyConsumed));
            impromptu.attabal(dern.wireman(dxUnconsumed), dern.wireman(dyUnconsumed));
            dern.beachfront(type);
            throw null;
        }
    }

    @Override // androidx.core.view.yemenite
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.dern(child, target, axes, type);
    }

    @Override // androidx.core.view.yemenite
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.yemenite
    public void onStopNestedScroll(View target, int type) {
        this.nestedScrollingParentHelper.wireman(target, type);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // androidx.compose.runtime.competently
    public void saneness() {
        this.release.invoke();
    }

    public final void setDensity(wireman wiremanVar) {
        if (wiremanVar != this.density) {
            this.density = wiremanVar;
            Function1<? super wireman, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(wiremanVar);
            }
        }
    }

    public final void setLifecycleOwner(arytenoidectomy arytenoidectomyVar) {
        if (arytenoidectomyVar != this.lifecycleOwner) {
            this.lifecycleOwner = arytenoidectomyVar;
            C0828overspeculate.saneness(this, arytenoidectomyVar);
        }
    }

    public final void setModifier(androidx.compose.ui.attabal attabalVar) {
        if (attabalVar != this.modifier) {
            this.modifier = attabalVar;
            Function1<? super androidx.compose.ui.attabal, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(attabalVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super wireman, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super androidx.compose.ui.attabal, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(taiyuan taiyuanVar) {
        if (taiyuanVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = taiyuanVar;
            impassible.saneness(this, taiyuanVar);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.yemenite
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            impromptu.attabal(dern.wireman(dxConsumed), dern.wireman(dyConsumed));
            impromptu.attabal(dern.wireman(dxUnconsumed), dern.wireman(dyUnconsumed));
            dern.beachfront(type);
            throw null;
        }
    }
}
