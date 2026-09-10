package coreopsis;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import igo.beachfront;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/android/gms/tasks/Task;", "attabal", "(Lcom/google/android/gms/tasks/Task;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "saneness", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: compiled from: Tasks.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ impassible<T> f24049attabal;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(impassible<? super T> impassibleVar) {
            this.f24049attabal = impassibleVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                dern dernVar = this.f24049attabal;
                Result.Companion companion = Result.INSTANCE;
                dernVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(exception)));
            } else {
                if (task.isCanceled()) {
                    impassible.attabal.attabal(this.f24049attabal, null, 1, null);
                    return;
                }
                dern dernVar2 = this.f24049attabal;
                Result.Companion companion2 = Result.INSTANCE;
                dernVar2.resumeWith(Result.m3351constructorimpl(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: coreopsis.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Tasks.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0571saneness implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f24050kowloon;

        public C0571saneness(CancellationTokenSource cancellationTokenSource) {
            this.f24050kowloon = cancellationTokenSource;
        }

        public final void attabal(Throwable th) {
            this.f24050kowloon.cancel();
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            attabal(th);
            return Unit.f29295attabal;
        }
    }

    public static final <T> Object attabal(Task<T> task, dern<? super T> dernVar) {
        return saneness(task, null, dernVar);
    }

    public static final <T> Object saneness(Task<T> task, CancellationTokenSource cancellationTokenSource, dern<? super T> dernVar) throws Exception {
        if (!task.isComplete()) {
            kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
            kowloonVar.kattegat();
            task.addOnCompleteListener(coreopsis.attabal.f24048kowloon, new attabal(kowloonVar));
            if (cancellationTokenSource != null) {
                kowloonVar.beachfront(new C0571saneness(cancellationTokenSource));
            }
            Object objCuirassed = kowloonVar.cuirassed();
            if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                beachfront.dern(dernVar);
            }
            return objCuirassed;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
