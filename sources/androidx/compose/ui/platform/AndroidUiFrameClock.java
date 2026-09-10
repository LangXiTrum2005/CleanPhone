package androidx.compose.ui.platform;

import android.view.Choreographer;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/milliradian;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "R", "Lkotlin/Function1;", "", "onFrame", "formularize", "(Lkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "Landroid/view/Choreographer;", "wireman", "()Landroid/view/Choreographer;", "arytenoidectomy", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidUiFrameClock implements androidx.compose.runtime.milliradian {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final AndroidUiDispatcher dispatcher;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Choreographer choreographer;

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ AndroidUiFrameClock f7272arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.impassible<R> f7273kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f7274monoploid;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(kotlinx.coroutines.impassible<? super R> impassibleVar, AndroidUiFrameClock androidUiFrameClock, Function1<? super Long, ? extends R> function1) {
            this.f7273kowloon = impassibleVar;
            this.f7272arytenoidectomy = androidUiFrameClock;
            this.f7274monoploid = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM3351constructorimpl;
            wretchedly.dern dernVar = this.f7273kowloon;
            Function1<Long, R> function1 = this.f7274monoploid;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            dernVar.resumeWith(objM3351constructorimpl);
        }
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.milliradian.attabal.attabal(this, r, function2);
    }

    @Override // androidx.compose.runtime.milliradian
    public <R> Object formularize(Function1<? super Long, ? extends R> function1, wretchedly.dern<? super R> dernVar) {
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element element = dernVar.getContext().get(p002kotlin.coroutines.dern.INSTANCE);
            androidUiDispatcher = element instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) element : null;
        }
        kotlinx.coroutines.kowloon kowloonVar = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        final attabal attabalVar = new attabal(kowloonVar, this, function1);
        if (androidUiDispatcher == null || !Intrinsics.wireman(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(attabalVar);
            kowloonVar.beachfront(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    this.this$0.getChoreographer().removeFrameCallback(attabalVar);
                }
            });
        } else {
            androidUiDispatcher.claque(attabalVar);
            kowloonVar.beachfront(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    androidUiDispatcher.hardpan(attabalVar);
                }
            });
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) androidx.compose.runtime.milliradian.attabal.saneness(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return androidx.compose.runtime.milliradian.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return androidx.compose.runtime.milliradian.attabal.wireman(this, coroutineContext);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }
}
