package androidx.compose.ui.scrollcapture;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.runtime.treadless;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.UnityAdsConstants;
import java.util.function.Consumer;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import milliradian.kowloon;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import restrictive.creditor;
import restrictive.czestochowa;
import restrictive.sealless;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lmilliradian/kowloon;", "viewportBoundsInWindow", "Lkotlinx/coroutines/saran;", "coroutineScope", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Lmilliradian/kowloon;Lkotlinx/coroutines/saran;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$attabal;)V", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Landroid/view/ScrollCaptureSession;", "session", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "captureArea", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "marial", "(Landroid/view/ScrollCaptureSession;Lmilliradian/kowloon;Lwretchedly/dern;)Ljava/lang/Object;", "attabal", "Landroidx/compose/ui/semantics/SemanticsNode;", "saneness", "Lmilliradian/kowloon;", "dern", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$attabal;", "wireman", "Lkotlinx/coroutines/saran;", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "scrollTracker", "", "beachfront", "I", "requestCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final SemanticsNode node;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int requestCount;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final attabal listener;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final RelativeScroller scrollTracker;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final kowloon viewportBoundsInWindow;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final saran coroutineScope;

    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$attabal;", "", "", "attabal", "()V", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface attabal {
        void attabal();

        void saneness();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
    @igo.wireman(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {Opcodes.ARRAYLENGTH}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.$onReady = runnable;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                RelativeScroller relativeScroller = ComposeScrollCaptureCallback.this.scrollTracker;
                this.label = 1;
                if (relativeScroller.competently(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            ComposeScrollCaptureCallback.this.listener.saneness();
            this.$onReady.run();
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
    @igo.wireman(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {116}, m = "invokeSuspend")
    public static final class C08271 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08271(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, wretchedly.dern<? super C08271> dernVar) {
            super(2, dernVar);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return ComposeScrollCaptureCallback.this.new C08271(this.$session, this.$captureArea, this.$onComplete, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                kowloon kowloonVarWireman = czestochowa.wireman(this.$captureArea);
                this.label = 1;
                obj = composeScrollCaptureCallback.marial(scrollCaptureSession, kowloonVarWireman, this);
                if (obj == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            this.$onComplete.accept(czestochowa.attabal((kowloon) obj));
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((C08271) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @igo.wireman(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {129, 132}, m = "onScrollCaptureImageRequest")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(wretchedly.dern<? super AnonymousClass2> dernVar) {
            super(dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.this.marial(null, null, this);
        }
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, kowloon kowloonVar, saran saranVar, attabal attabalVar) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = kowloonVar;
        this.listener = attabalVar;
        this.coroutineScope = privatdozent.impromptu(saranVar, marial.f7543kowloon);
        this.scrollTracker = new RelativeScroller(kowloonVar.marial(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object marial(ScrollCaptureSession scrollCaptureSession, kowloon kowloonVar, wretchedly.dern<? super kowloon> dernVar) {
        AnonymousClass2 anonymousClass2;
        int top;
        int bottom;
        ComposeScrollCaptureCallback composeScrollCaptureCallback;
        kowloon kowloonVar2;
        int i;
        ComposeScrollCaptureCallback composeScrollCaptureCallback2;
        ScrollCaptureSession scrollCaptureSession2;
        int i2;
        int iDern;
        int iDern2;
        kowloon kowloonVarDern;
        NodeCoordinator nodeCoordinatorMarial;
        Canvas canvasLockHardwareCanvas;
        if (dernVar instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) dernVar;
            int i3 = anonymousClass2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(dernVar);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(dernVar);
        }
        Object obj = anonymousClass2.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            p002kotlin.dern.saneness(obj);
            top = kowloonVar.getTop();
            bottom = kowloonVar.getBottom();
            RelativeScroller relativeScroller = this.scrollTracker;
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = scrollCaptureSession;
            anonymousClass2.L$2 = kowloonVar;
            anonymousClass2.I$0 = top;
            anonymousClass2.I$1 = bottom;
            anonymousClass2.label = 1;
            if (relativeScroller.beachfront(top, bottom, anonymousClass2) != objBeachfront) {
                composeScrollCaptureCallback = this;
            }
            return objBeachfront;
        }
        if (i4 == 1) {
            int i5 = anonymousClass2.I$1;
            int i6 = anonymousClass2.I$0;
            kowloon kowloonVar3 = (kowloon) anonymousClass2.L$2;
            ScrollCaptureSession scrollCaptureSessionAttabal = androidx.compose.ui.scrollcapture.attabal.attabal(anonymousClass2.L$1);
            composeScrollCaptureCallback = (ComposeScrollCaptureCallback) anonymousClass2.L$0;
            p002kotlin.dern.saneness(obj);
            top = i6;
            kowloonVar = kowloonVar3;
            bottom = i5;
            scrollCaptureSession = scrollCaptureSessionAttabal;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = anonymousClass2.I$1;
            i = anonymousClass2.I$0;
            kowloonVar2 = (kowloon) anonymousClass2.L$2;
            ScrollCaptureSession scrollCaptureSessionAttabal2 = androidx.compose.ui.scrollcapture.attabal.attabal(anonymousClass2.L$1);
            composeScrollCaptureCallback2 = (ComposeScrollCaptureCallback) anonymousClass2.L$0;
            p002kotlin.dern.saneness(obj);
            scrollCaptureSession2 = scrollCaptureSessionAttabal2;
        }
        iDern = composeScrollCaptureCallback2.scrollTracker.dern(i);
        iDern2 = composeScrollCaptureCallback2.scrollTracker.dern(i2);
        kowloonVarDern = kowloon.dern(kowloonVar2, 0, iDern, 0, iDern2, 5, null);
        if (iDern == iDern2) {
            return kowloon.INSTANCE.attabal();
        }
        nodeCoordinatorMarial = composeScrollCaptureCallback2.node.marial();
        if (nodeCoordinatorMarial != null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            creditor creditorVarAttabal = sealless.attabal(canvasLockHardwareCanvas);
            creditorVarAttabal.competently(-kowloonVarDern.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), -kowloonVarDern.getTop());
            nodeCoordinatorMarial.fastrack(creditorVarAttabal, null);
            return kowloonVarDern.apical(0, pastie.dern.wireman(composeScrollCaptureCallback2.scrollTracker.getScrollAmount()));
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        AnonymousClass3 anonymousClass3 = new Function1<Long, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest.3
            public final void invoke(long j) {
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.f29295attabal;
            }
        };
        anonymousClass2.L$0 = composeScrollCaptureCallback;
        anonymousClass2.L$1 = scrollCaptureSession;
        anonymousClass2.L$2 = kowloonVar;
        anonymousClass2.I$0 = top;
        anonymousClass2.I$1 = bottom;
        anonymousClass2.label = 2;
        if (treadless.saneness(anonymousClass3, anonymousClass2) != objBeachfront) {
            kowloonVar2 = kowloonVar;
            i = top;
            composeScrollCaptureCallback2 = composeScrollCaptureCallback;
            scrollCaptureSession2 = scrollCaptureSession;
            i2 = bottom;
            iDern = composeScrollCaptureCallback2.scrollTracker.dern(i);
            iDern2 = composeScrollCaptureCallback2.scrollTracker.dern(i2);
            kowloonVarDern = kowloon.dern(kowloonVar2, 0, iDern, 0, iDern2, 5, null);
            if (iDern == iDern2) {
                return kowloon.INSTANCE.attabal();
            }
            nodeCoordinatorMarial = composeScrollCaptureCallback2.node.marial();
            if (nodeCoordinatorMarial != null) {
                throw new IllegalStateException("Could not find coordinator for semantics node.");
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            creditor creditorVarAttabal2 = sealless.attabal(canvasLockHardwareCanvas);
            creditorVarAttabal2.competently(-kowloonVarDern.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), -kowloonVarDern.getTop());
            nodeCoordinatorMarial.fastrack(creditorVarAttabal2, null);
            return kowloonVarDern.apical(0, pastie.dern.wireman(composeScrollCaptureCallback2.scrollTracker.getScrollAmount()));
        }
        return objBeachfront;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        kotlinx.coroutines.cutely.wireman(this.coroutineScope, dhss.f32190kowloon, null, new AnonymousClass1(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        ComposeScrollCaptureCallback_androidKt.dern(this.coroutineScope, signal, new C08271(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(czestochowa.attabal(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.wireman();
        this.requestCount = 0;
        this.listener.attabal();
        onReady.run();
    }
}
