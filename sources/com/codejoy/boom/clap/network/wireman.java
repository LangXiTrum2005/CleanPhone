package com.codejoy.boom.clap.network;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Ie;
import kotlinx.coroutines.impassible;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.rotuma;

/* JADX INFO: compiled from: InternalUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aE\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lretrofit2/saneness;", "Lkotlinx/coroutines/impassible;", "continuation", "", "dern", "(Lretrofit2/saneness;Lkotlinx/coroutines/impassible;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lretrofit2/rotuma;", "success", "saneness", "(Lretrofit2/saneness;Lkotlinx/coroutines/impassible;Lkotlin/jvm/functions/Function1;)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InternalUtil.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/codejoy/boom/clap/network/wireman$attabal", "Lretrofit2/wireman;", "Lretrofit2/saneness;", NotificationCompat.CATEGORY_CALL, "Lretrofit2/rotuma;", Ie.n, "", "saneness", "(Lretrofit2/saneness;Lretrofit2/rotuma;)V", "", "t", "attabal", "(Lretrofit2/saneness;Ljava/lang/Throwable;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements retrofit2.wireman<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function1<rotuma<T>, Unit> f18574attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ impassible<?> f18575saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function1<? super rotuma<T>, Unit> function1, impassible<?> impassibleVar) {
            this.f18574attabal = function1;
            this.f18575saneness = impassibleVar;
        }

        @Override // retrofit2.wireman
        public void attabal(retrofit2.saneness<T> call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            impassible<?> impassibleVar = this.f18575saneness;
            Result.Companion companion = Result.INSTANCE;
            impassibleVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(t)));
        }

        @Override // retrofit2.wireman
        public void saneness(retrofit2.saneness<T> call, rotuma<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f18574attabal.invoke(response);
        }
    }

    public static final void dern(final retrofit2.saneness<?> sanenessVar, impassible<?> continuation) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        continuation.beachfront(new Function1() { // from class: com.codejoy.boom.clap.network.dern
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wireman.wireman(sanenessVar, (Throwable) obj);
            }
        });
    }

    public static final <T> void saneness(retrofit2.saneness<T> sanenessVar, impassible<?> continuation, Function1<? super rotuma<T>, Unit> success) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(success, "success");
        sanenessVar.arytenoidectomy(new attabal(success, continuation));
    }

    public static final Unit wireman(retrofit2.saneness sanenessVar, Throwable th) {
        try {
            sanenessVar.cancel();
        } catch (Exception unused) {
        }
        return Unit.f29295attabal;
    }
}
