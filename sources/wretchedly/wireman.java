package wretchedly;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lwretchedly/dern;", "", "receiver", "completion", "", "attabal", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lwretchedly/dern;)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {
    public static final <R, T> void attabal(Function2<? super R, ? super dern<? super T>, ? extends Object> function2, R r, dern<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.dern(IntrinsicsKt__IntrinsicsJvmKt.attabal(function2, r, completion)).resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
    }
}
