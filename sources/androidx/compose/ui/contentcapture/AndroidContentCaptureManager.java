package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.arytenoidectomy;
import androidx.collection.kowloon;
import androidx.collection.sealless;
import androidx.collection.yemenite;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.peridotite;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.julian;
import androidx.compose.ui.platform.lightstruck;
import androidx.compose.ui.platform.monroe;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import clubfoot.TextLayoutResult;
import com.ironsource.Ie;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.supplicat;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0092\u0001\u0093\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u0004\u0018\u00010$*\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u001fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010\u001fJ\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u001fJ\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0000¢\u0006\u0004\bB\u0010\u001fJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\bC\u0010#J\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010\u001fJ\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010\u001fJ\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bF\u0010\u001fJ/\u0010N\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u000e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0KH\u0001¢\u0006\u0004\bN\u0010OJ'\u0010T\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u00002\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0QH\u0001¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010V\u001a\u0004\bW\u0010XR*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010e\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010\u001f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020$0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010jR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010mR\u0016\u0010q\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020 0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010}\u001a\u0004\b~\u0010\u007fR-\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138@@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0010\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010\u0017R\u0017\u0010\u0086\u0001\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010mR\u001d\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\r0f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010gR\u0018\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010tR\u0017\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\u00020r8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u0090\u0001\u0010\u001f\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/formularize;", "Landroidx/lifecycle/marial;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function0;", "Lsplinterproof/wireman;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/lightstruck;", "oldNode", "", "cord", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/lightstruck;)V", "rotuma", "Landroidx/collection/kowloon;", "Landroidx/compose/ui/platform/monroe;", "newSemanticsNodes", "beachfront", "(Landroidx/collection/kowloon;)V", "", "id", "", "newText", "preprohormone", "(ILjava/lang/String;)V", "yemenite", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "triweekly", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lsplinterproof/beachfront;", "stratoscope", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lsplinterproof/beachfront;", "virtualId", "viewStructure", "wireman", "(ILsplinterproof/beachfront;)V", "marial", "(I)V", "impassible", "node", "trm", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "oilcan", "sealless", "cuirassed", "apical", "competently", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/arytenoidectomy;", "owner", "onStart", "(Landroidx/lifecycle/arytenoidectomy;)V", "onStop", "saneness", "(Lwretchedly/dern;)Ljava/lang/Object;", "graveside", "molybdenite", "adultoid", "polloi", "kowloon", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "arytenoidectomy", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", Ie.n, "gintrap", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "cutely", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "monoploid", "Lsplinterproof/wireman;", "getContentCaptureSession$ui_release", "()Lsplinterproof/wireman;", "setContentCaptureSession$ui_release", "(Lsplinterproof/wireman;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "Landroidx/collection/yemenite;", "Landroidx/collection/yemenite;", "bufferedAppearedNodes", "Landroidx/collection/sealless;", "Landroidx/collection/sealless;", "bufferedDisappearedNodes", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "", "dovishness", "Z", "currentSemanticsNodesInvalidated", "Landroidx/collection/saneness;", "Landroidx/collection/saneness;", "subtreeChangedLayoutNodes", "Lkotlinx/coroutines/channels/wireman;", "Lkotlinx/coroutines/channels/wireman;", "boundsUpdateChannel", "Landroid/os/Handler;", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "Landroidx/collection/kowloon;", "taiyuan", "()Landroidx/collection/kowloon;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodes", "currentSemanticsNodesSnapshotTimestampMillis", "previousSemanticsNodes", "Landroidx/compose/ui/platform/lightstruck;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "formularize", "()Z", "isEnabled$ui_release$annotations", "isEnabled", "TranslateStatus", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidContentCaptureManager implements formularize, androidx.p001lifecycle.marial, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Function0<? extends splinterproof.wireman> onContentCaptureSession;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public long currentSemanticsNodesSnapshotTimestampMillis;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.saneness<LayoutNode> subtreeChangedLayoutNodes;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView view;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final sealless bufferedDisappearedNodes;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public splinterproof.wireman contentCaptureSession;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final yemenite<splinterproof.beachfront> bufferedAppearedNodes;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public lightstruck previousSemanticsRoot;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean currentSemanticsNodesInvalidated = true;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.channels.wireman<Unit> boundsUpdateChannel = kotlinx.coroutines.channels.competently.saneness(1, null, null, 6, null);

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public kowloon<monroe> currentSemanticsNodes = arytenoidectomy.attabal();

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public yemenite<lightstruck> previousSemanticsNodes = arytenoidectomy.saneness();

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.attabal
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.impromptu(this.f6377kowloon);
        }
    };

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "contentCaptureManager", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "", "dern", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;[J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", Ie.n, "wireman", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f6374attabal = new attabal();

        public static final void marial(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            f6374attabal.saneness(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0072  */
        public final void dern(AndroidContentCaptureManager contentCaptureManager, long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
            SemanticsNode semanticsNodeSaneness;
            String strWireman;
            for (long j : virtualIds) {
                monroe monroeVarDern = contentCaptureManager.taiyuan().dern((int) j);
                if (monroeVarDern != null && (semanticsNodeSaneness = monroeVarDern.getSemanticsNode()) != null) {
                    dern.attabal();
                    ViewTranslationRequest.Builder builderAttabal = saneness.attabal(contentCaptureManager.getView().getAutofillId(), semanticsNodeSaneness.getId());
                    List list = (List) SemanticsConfigurationKt.attabal(semanticsNodeSaneness.getUnmergedConfig(), SemanticsProperties.f7561attabal.cuirassed());
                    if (list != null && (strWireman = itchy.attabal.wireman(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderAttabal.setValue("android:text", TranslationRequestValue.forText(new androidx.compose.ui.text.attabal(strWireman, null, null, 6, null)));
                        requestsCollector.accept(builderAttabal.build());
                    }
                }
            }
        }

        public final void saneness(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            monroe monroeVarDern;
            SemanticsNode semanticsNodeSaneness;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            supplicat supplicatVarAttabal = technofreak.wireman.attabal(response);
            while (supplicatVarAttabal.hasNext()) {
                long jNextLong = supplicatVarAttabal.nextLong();
                ViewTranslationResponse viewTranslationResponseAttabal = impromptu.attabal(response.get(jNextLong));
                if (viewTranslationResponseAttabal != null && (value = viewTranslationResponseAttabal.getValue("android:text")) != null && (text = value.getText()) != null && (monroeVarDern = contentCaptureManager.taiyuan().dern((int) jNextLong)) != null && (semanticsNodeSaneness = monroeVarDern.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNodeSaneness.getUnmergedConfig(), androidx.compose.ui.semantics.cutely.f7617attabal.rotuma())) != null && (function1 = (Function1) accessibilityAction.attabal()) != null) {
                }
            }
        }

        public final void wireman(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.wireman(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                saneness(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.apical
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.attabal.marial(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends splinterproof.wireman> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.bufferedAppearedNodes = new yemenite<>(i, i2, defaultConstructorMarker);
        this.bufferedDisappearedNodes = new sealless(i, i2, defaultConstructorMarker);
        this.subtreeChangedLayoutNodes = new androidx.collection.saneness<>(i, i2, defaultConstructorMarker);
        this.previousSemanticsRoot = new lightstruck(androidComposeView.getSemanticsOwner().attabal(), arytenoidectomy.attabal());
    }

    public static final void impromptu(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.formularize()) {
            peridotite.saneness(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.cord(androidContentCaptureManager.view.getSemanticsOwner().attabal(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.rotuma(androidContentCaptureManager.view.getSemanticsOwner().attabal(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.beachfront(androidContentCaptureManager.taiyuan());
            androidContentCaptureManager.yemenite();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    public final void adultoid() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        cuirassed();
    }

    public final void apical() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        kowloon<monroe> kowloonVarTaiyuan = taiyuan();
        Object[] objArr = kowloonVarTaiyuan.values;
        long[] jArr = kowloonVarTaiyuan.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.apical apicalVarGintrap = ((monroe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.wireman(SemanticsConfigurationKt.attabal(apicalVarGintrap, SemanticsProperties.f7561attabal.kowloon()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVarGintrap, androidx.compose.ui.semantics.cutely.f7617attabal.preprohormone())) != null && (function1 = (Function1) accessibilityAction.attabal()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void arytenoidectomy(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        attabal.f6374attabal.dern(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void beachfront(kowloon<monroe> newSemanticsNodes) {
        int[] iArr = newSemanticsNodes.keys;
        long[] jArr = newSemanticsNodes.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        lightstruck lightstruckVarDern = this.previousSemanticsNodes.dern(i5);
                        monroe monroeVarDern = newSemanticsNodes.dern(i5);
                        SemanticsNode semanticsNodeSaneness = monroeVarDern != null ? monroeVarDern.getSemanticsNode() : null;
                        if (semanticsNodeSaneness == null) {
                            peridotite.attabal.dern("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (lightstruckVarDern == null) {
                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNodeSaneness.getUnmergedConfig().iterator();
                            while (it.hasNext()) {
                                SemanticsPropertyKey<?> key = it.next().getKey();
                                SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
                                if (Intrinsics.wireman(key, semanticsProperties.cuirassed())) {
                                    List list = (List) SemanticsConfigurationKt.attabal(semanticsNodeSaneness.getUnmergedConfig(), semanticsProperties.cuirassed());
                                    preprohormone(semanticsNodeSaneness.getId(), String.valueOf(list != null ? (androidx.compose.ui.text.attabal) CollectionsKt.firstOrNull(list) : null));
                                }
                            }
                        } else {
                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNodeSaneness.getUnmergedConfig().iterator();
                            while (it2.hasNext()) {
                                SemanticsPropertyKey<?> key2 = it2.next().getKey();
                                SemanticsProperties semanticsProperties2 = SemanticsProperties.f7561attabal;
                                if (Intrinsics.wireman(key2, semanticsProperties2.cuirassed())) {
                                    List list2 = (List) SemanticsConfigurationKt.attabal(lightstruckVarDern.getUnmergedConfig(), semanticsProperties2.cuirassed());
                                    androidx.compose.ui.text.attabal attabalVar = list2 != null ? (androidx.compose.ui.text.attabal) CollectionsKt.firstOrNull(list2) : null;
                                    int i6 = i2;
                                    List list3 = (List) SemanticsConfigurationKt.attabal(semanticsNodeSaneness.getUnmergedConfig(), semanticsProperties2.cuirassed());
                                    androidx.compose.ui.text.attabal attabalVar2 = list3 != null ? (androidx.compose.ui.text.attabal) CollectionsKt.firstOrNull(list3) : null;
                                    if (!Intrinsics.wireman(attabalVar, attabalVar2)) {
                                        preprohormone(semanticsNodeSaneness.getId(), String.valueOf(attabalVar2));
                                    }
                                    i2 = i6;
                                }
                            }
                        }
                    }
                    int i7 = i2;
                    j >>= i7;
                    i4++;
                    i2 = i7;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void competently() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        kowloon<monroe> kowloonVarTaiyuan = taiyuan();
        Object[] objArr = kowloonVarTaiyuan.values;
        long[] jArr = kowloonVarTaiyuan.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.apical apicalVarGintrap = ((monroe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfigurationKt.attabal(apicalVarGintrap, SemanticsProperties.f7561attabal.kowloon()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVarGintrap, androidx.compose.ui.semantics.cutely.f7617attabal.attabal())) != null && (function0 = (Function0) accessibilityAction.attabal()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[LOOP:1: B:15:0x0057->B:28:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a A[EDGE_INSN: B:46:0x009a->B:29:0x009a BREAK  A[LOOP:1: B:15:0x0057->B:28:0x0097], SYNTHETIC] */
    public final void cord(SemanticsNode newNode, lightstruck oldNode) {
        int i = 0;
        sealless seallessVar = new sealless(i, 1, null);
        List<SemanticsNode> listGraveside = newNode.graveside();
        int size = listGraveside.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = listGraveside.get(i2);
            if (taiyuan().attabal(semanticsNode.getId())) {
                if (!oldNode.getChildren().attabal(semanticsNode.getId())) {
                    triweekly(newNode.getLayoutNode());
                    return;
                }
                seallessVar.beachfront(semanticsNode.getId());
            }
        }
        sealless seallessVarAttabal = oldNode.getChildren();
        int[] iArr = seallessVarAttabal.elements;
        long[] jArr = seallessVarAttabal.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !seallessVar.attabal(iArr[(i3 << 3) + i5])) {
                            triweekly(newNode.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List<SemanticsNode> listGraveside2 = newNode.graveside();
        int size2 = listGraveside2.size();
        while (i < size2) {
            SemanticsNode semanticsNode2 = listGraveside2.get(i);
            if (taiyuan().attabal(semanticsNode2.getId())) {
                lightstruck lightstruckVarDern = this.previousSemanticsNodes.dern(semanticsNode2.getId());
                if (lightstruckVarDern == null) {
                    peridotite.attabal.dern("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                cord(semanticsNode2, lightstruckVarDern);
            }
            i++;
        }
    }

    public final void cuirassed() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        kowloon<monroe> kowloonVarTaiyuan = taiyuan();
        Object[] objArr = kowloonVarTaiyuan.values;
        long[] jArr = kowloonVarTaiyuan.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.apical apicalVarGintrap = ((monroe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.wireman(SemanticsConfigurationKt.attabal(apicalVarGintrap, SemanticsProperties.f7561attabal.kowloon()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVarGintrap, androidx.compose.ui.semantics.cutely.f7617attabal.preprohormone())) != null && (function1 = (Function1) accessibilityAction.attabal()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean formularize() {
        return formularize.INSTANCE.attabal() && this.contentCaptureSession != null;
    }

    public final void gintrap(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        attabal.f6374attabal.wireman(contentCaptureManager, response);
    }

    public final void graveside() {
        this.currentSemanticsNodesInvalidated = true;
        if (!formularize() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3 A[LOOP:3: B:39:0x00c4->B:49:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6 A[EDGE_INSN: B:61:0x00f6->B:50:0x00f6 BREAK  A[LOOP:3: B:39:0x00c4->B:49:0x00f3], SYNTHETIC] */
    public final void impassible() {
        char c;
        long j;
        long j2;
        splinterproof.wireman wiremanVar = this.contentCaptureSession;
        if (wiremanVar != null && Build.VERSION.SDK_INT >= 29) {
            char c2 = 7;
            if (this.bufferedAppearedNodes.competently()) {
                ArrayList arrayList = new ArrayList();
                yemenite<splinterproof.beachfront> yemeniteVar = this.bufferedAppearedNodes;
                Object[] objArr = yemeniteVar.values;
                long[] jArr = yemeniteVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    j = 128;
                    while (true) {
                        long j3 = jArr[i];
                        j2 = 255;
                        if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            int i3 = 0;
                            while (i3 < i2) {
                                if ((j3 & 255) < 128) {
                                    arrayList.add((splinterproof.beachfront) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
                                i3++;
                                c2 = c2;
                            }
                            c = c2;
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            c = c2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        c2 = c;
                    }
                } else {
                    c = 7;
                    j = 128;
                    j2 = 255;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((splinterproof.beachfront) arrayList.get(i4)).competently());
                }
                wiremanVar.wireman(arrayList2);
                this.bufferedAppearedNodes.taiyuan();
            } else {
                c = 7;
                j = 128;
                j2 = 255;
            }
            if (this.bufferedDisappearedNodes.dern()) {
                ArrayList arrayList3 = new ArrayList();
                sealless seallessVar = this.bufferedDisappearedNodes;
                int[] iArr = seallessVar.elements;
                long[] jArr2 = seallessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j2) < j) {
                                    arrayList3.add(Integer.valueOf(iArr[(i5 << 3) + i7]));
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i8)).intValue()));
                }
                wiremanVar.marial(CollectionsKt.sakeen(arrayList4));
                this.bufferedDisappearedNodes.impromptu();
            }
        }
    }

    public final void kowloon() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        competently();
    }

    public final void marial(int virtualId) {
        if (this.bufferedAppearedNodes.saneness(virtualId)) {
            this.bufferedAppearedNodes.arytenoidectomy(virtualId);
        } else {
            this.bufferedDisappearedNodes.beachfront(virtualId);
        }
    }

    public final void molybdenite(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (formularize()) {
            triweekly(layoutNode);
        }
    }

    public final void oilcan(SemanticsNode node) {
        if (formularize()) {
            marial(node.getId());
            List<SemanticsNode> listGraveside = node.graveside();
            int size = listGraveside.size();
            for (int i = 0; i < size; i++) {
                oilcan(listGraveside.get(i));
            }
        }
    }

    @Override // androidx.p001lifecycle.marial
    public void onStart(androidx.p001lifecycle.arytenoidectomy owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        trm(this.view.getSemanticsOwner().attabal());
        impassible();
    }

    @Override // androidx.p001lifecycle.marial
    public void onStop(androidx.p001lifecycle.arytenoidectomy owner) {
        oilcan(this.view.getSemanticsOwner().attabal());
        impassible();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void polloi() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        apical();
    }

    public final void preprohormone(int id, String newText) {
        splinterproof.wireman wiremanVar;
        if (Build.VERSION.SDK_INT >= 29 && (wiremanVar = this.contentCaptureSession) != null) {
            AutofillId autofillIdAttabal = wiremanVar.attabal(id);
            if (autofillIdAttabal != null) {
                wiremanVar.dern(autofillIdAttabal, newText);
            } else {
                peridotite.attabal.dern("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:13:0x0040->B:25:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[EDGE_INSN: B:44:0x0082->B:26:0x0082 BREAK  A[LOOP:1: B:13:0x0040->B:25:0x007f], SYNTHETIC] */
    public final void rotuma(SemanticsNode newNode, lightstruck oldNode) {
        List<SemanticsNode> listGraveside = newNode.graveside();
        int size = listGraveside.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = listGraveside.get(i);
            if (taiyuan().attabal(semanticsNode.getId()) && !oldNode.getChildren().attabal(semanticsNode.getId())) {
                trm(semanticsNode);
            }
        }
        yemenite<lightstruck> yemeniteVar = this.previousSemanticsNodes;
        int[] iArr = yemeniteVar.keys;
        long[] jArr = yemeniteVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i2 << 3) + i4];
                            if (!taiyuan().attabal(i5)) {
                                marial(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        List<SemanticsNode> listGraveside2 = newNode.graveside();
        int size2 = listGraveside2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            SemanticsNode semanticsNode2 = listGraveside2.get(i6);
            if (taiyuan().attabal(semanticsNode2.getId()) && this.previousSemanticsNodes.attabal(semanticsNode2.getId())) {
                lightstruck lightstruckVarDern = this.previousSemanticsNodes.dern(semanticsNode2.getId());
                if (lightstruckVarDern == null) {
                    peridotite.attabal.dern("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                rotuma(semanticsNode2, lightstruckVarDern);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (kotlinx.coroutines.splinterproof.attabal(r6, r0) == r1) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object saneness(wretchedly.dern<? super p002kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.beachfront r2 = (kotlinx.coroutines.channels.beachfront) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            p002kotlin.dern.saneness(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.beachfront r2 = (kotlinx.coroutines.channels.beachfront) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            p002kotlin.dern.saneness(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            p002kotlin.dern.saneness(r10)
            kotlinx.coroutines.channels.wireman<kotlin.Unit> r10 = r9.boundsUpdateChannel     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.channels.beachfront r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L35
            r0.label = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.attabal(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            goto L9a
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.formularize()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.impassible()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.checkingForSemanticsChanges     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.checkingForSemanticsChanges = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.handler     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            androidx.collection.saneness<androidx.compose.ui.node.LayoutNode> r10 = r5.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis     // Catch: java.lang.Throwable -> L35
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = kotlinx.coroutines.splinterproof.attabal(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
        L9a:
            return r1
        L9b:
            androidx.collection.saneness<androidx.compose.ui.node.LayoutNode> r10 = r5.subtreeChangedLayoutNodes
            r10.clear()
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            androidx.collection.saneness<androidx.compose.ui.node.LayoutNode> r0 = r5.subtreeChangedLayoutNodes
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.saneness(wretchedly.dern):java.lang.Object");
    }

    public final void sealless(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function2;
        androidx.compose.ui.semantics.apical apicalVarGintrap = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.attabal(apicalVarGintrap, SemanticsProperties.f7561attabal.kowloon());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.wireman(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVarGintrap, androidx.compose.ui.semantics.cutely.f7617attabal.preprohormone());
            if (accessibilityAction2 == null || (function2 = (Function1) accessibilityAction2.attabal()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !Intrinsics.wireman(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVarGintrap, androidx.compose.ui.semantics.cutely.f7617attabal.preprohormone())) == null || (function1 = (Function1) accessibilityAction.attabal()) == null) {
            return;
        }
    }

    public final splinterproof.beachfront stratoscope(SemanticsNode semanticsNode) {
        splinterproof.saneness sanenessVarAttabal;
        AutofillId autofillIdAttabal;
        String strTaiyuan;
        splinterproof.wireman wiremanVar = this.contentCaptureSession;
        if (wiremanVar == null || Build.VERSION.SDK_INT < 29 || (sanenessVarAttabal = splinterproof.marial.attabal(this.view)) == null) {
            return null;
        }
        SemanticsNode semanticsNodePolloi = semanticsNode.polloi();
        if (semanticsNodePolloi != null) {
            autofillIdAttabal = wiremanVar.attabal(semanticsNodePolloi.getId());
            if (autofillIdAttabal == null) {
                return null;
            }
        } else {
            autofillIdAttabal = sanenessVarAttabal.attabal();
        }
        splinterproof.beachfront beachfrontVarSaneness = wiremanVar.saneness(autofillIdAttabal, semanticsNode.getId());
        if (beachfrontVarSaneness == null) {
            return null;
        }
        androidx.compose.ui.semantics.apical apicalVarGintrap = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (apicalVarGintrap.marial(semanticsProperties.graveside())) {
            return null;
        }
        Bundle bundleAttabal = beachfrontVarSaneness.attabal();
        if (bundleAttabal != null) {
            bundleAttabal.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
        }
        String str = (String) SemanticsConfigurationKt.attabal(apicalVarGintrap, semanticsProperties.cord());
        if (str != null) {
            beachfrontVarSaneness.marial(semanticsNode.getId(), null, null, str);
        }
        List list = (List) SemanticsConfigurationKt.attabal(apicalVarGintrap, semanticsProperties.cuirassed());
        if (list != null) {
            beachfrontVarSaneness.saneness("android.widget.TextView");
            beachfrontVarSaneness.beachfront(itchy.attabal.wireman(list, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.text.attabal attabalVar = (androidx.compose.ui.text.attabal) SemanticsConfigurationKt.attabal(apicalVarGintrap, semanticsProperties.competently());
        if (attabalVar != null) {
            beachfrontVarSaneness.saneness("android.widget.EditText");
            beachfrontVarSaneness.beachfront(attabalVar);
        }
        List list2 = (List) SemanticsConfigurationKt.attabal(apicalVarGintrap, semanticsProperties.wireman());
        if (list2 != null) {
            beachfrontVarSaneness.dern(itchy.attabal.wireman(list2, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.semantics.impromptu impromptuVar = (androidx.compose.ui.semantics.impromptu) SemanticsConfigurationKt.attabal(apicalVarGintrap, semanticsProperties.dovishness());
        if (impromptuVar != null && (strTaiyuan = julian.taiyuan(impromptuVar.getValue())) != null) {
            beachfrontVarSaneness.saneness(strTaiyuan);
        }
        TextLayoutResult beachfrontVarMarial = julian.marial(apicalVarGintrap);
        if (beachfrontVarMarial != null) {
            beachfrontVarMarial.dern();
            throw null;
        }
        supplicat.taiyuan taiyuanVarImpromptu = semanticsNode.impromptu();
        beachfrontVarSaneness.wireman((int) taiyuanVarImpromptu.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), (int) taiyuanVarImpromptu.getTop(), 0, 0, (int) taiyuanVarImpromptu.cutely(), (int) taiyuanVarImpromptu.marial());
        return beachfrontVarSaneness;
    }

    public final kowloon<monroe> taiyuan() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = julian.saneness(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final void triweekly(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.triweekly(Unit.f29295attabal);
        }
    }

    public final void trm(SemanticsNode node) {
        if (formularize()) {
            sealless(node);
            wireman(node.getId(), stratoscope(node));
            List<SemanticsNode> listGraveside = node.graveside();
            int size = listGraveside.size();
            for (int i = 0; i < size; i++) {
                trm(listGraveside.get(i));
            }
        }
    }

    public final void wireman(int virtualId, splinterproof.beachfront viewStructure) {
        if (viewStructure == null) {
            return;
        }
        if (this.bufferedDisappearedNodes.attabal(virtualId)) {
            this.bufferedDisappearedNodes.monoploid(virtualId);
        } else {
            this.bufferedAppearedNodes.molybdenite(virtualId, viewStructure);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    public final void yemenite() {
        this.previousSemanticsNodes.taiyuan();
        kowloon<monroe> kowloonVarTaiyuan = taiyuan();
        int[] iArr = kowloonVarTaiyuan.keys;
        Object[] objArr = kowloonVarTaiyuan.values;
        long[] jArr = kowloonVarTaiyuan.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
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
                            int i4 = (i << 3) + i3;
                            this.previousSemanticsNodes.molybdenite(iArr[i4], new lightstruck(((monroe) objArr[i4]).getSemanticsNode(), taiyuan()));
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
        this.previousSemanticsRoot = new lightstruck(this.view.getSemanticsOwner().attabal(), taiyuan());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }
}
