package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {
    public Function0 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile Object f43252Y;
    public final Object Z;

    public SynchronizedLazyImpl(Function0 initializer) {
        Intrinsics.f(initializer, "initializer");
        this.X = initializer;
        this.f43252Y = UNINITIALIZED_VALUE.f43260a;
        this.Z = this;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getX());
    }

    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: getValue */
    public final Object getX() {
        Object objInvoke;
        Object obj = this.f43252Y;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f43260a;
        if (obj != uninitialized_value) {
            return obj;
        }
        synchronized (this.Z) {
            objInvoke = this.f43252Y;
            if (objInvoke == uninitialized_value) {
                Function0 function0 = this.X;
                Intrinsics.c(function0);
                objInvoke = function0.invoke();
                this.f43252Y = objInvoke;
                this.X = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f43252Y != UNINITIALIZED_VALUE.f43260a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getX()) : "Lazy value not initialized yet.";
    }
}
