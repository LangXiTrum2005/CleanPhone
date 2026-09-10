package girt;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.DispatchException;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function2;
import pigboat.impromptu;
import wretchedly.dern;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lwretchedly/dern;", "", "receiver", "completion", "", "saneness", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lwretchedly/dern;)V", "fatalCompletion", "dern", "(Lwretchedly/dern;Lwretchedly/dern;)V", "", "e", "attabal", "(Lwretchedly/dern;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class attabal {
    public static final void attabal(dern<?> dernVar, Throwable th) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        dernVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(th)));
        throw th;
    }

    public static final void dern(dern<? super Unit> dernVar, dern<?> dernVar2) throws Throwable {
        try {
            dern dernVarDern = IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar);
            Result.Companion companion = Result.INSTANCE;
            impromptu.saneness(dernVarDern, Result.m3351constructorimpl(Unit.f29295attabal));
        } catch (Throwable th) {
            attabal(dernVar2, th);
        }
    }

    public static final <R, T> void saneness(Function2<? super R, ? super dern<? super T>, ? extends Object> function2, R r, dern<? super T> dernVar) {
        try {
            dern dernVarDern = IntrinsicsKt__IntrinsicsJvmKt.dern(IntrinsicsKt__IntrinsicsJvmKt.attabal(function2, r, dernVar));
            Result.Companion companion = Result.INSTANCE;
            impromptu.saneness(dernVarDern, Result.m3351constructorimpl(Unit.f29295attabal));
        } catch (Throwable th) {
            attabal(dernVar, th);
        }
    }
}
