package p002kotlin.reflect.jvm.internal;

import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/attabal;", "attabal", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/jvm/internal/attabal;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class saneness {
    static {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        if (Result.m3357isSuccessimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = Boolean.TRUE;
        }
        Object objM3351constructorimpl2 = Result.m3351constructorimpl(objM3351constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl2)) {
            objM3351constructorimpl2 = bool;
        }
        ((Boolean) objM3351constructorimpl2).getClass();
    }

    public static final <V> attabal<V> attabal(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new dern(compute);
    }
}
