package p002kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.molybdenite;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpatroclinal/taiyuan;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "writeReplace", "()Ljava/lang/Object;", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "_value", "Ljava/lang/Object;", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SynchronizedLazyImpl<T> implements taiyuan<T>, Serializable {
    private volatile Object _value;
    private Function0<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(Function0<? extends T> initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = molybdenite.f35093attabal;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // patroclinal.taiyuan
    public T getValue() {
        T tInvoke;
        T t = (T) this._value;
        molybdenite molybdeniteVar = molybdenite.f35093attabal;
        if (t != molybdeniteVar) {
            return t;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == molybdeniteVar) {
                Function0<? extends T> function0 = this.initializer;
                Intrinsics.beachfront(function0);
                tInvoke = function0.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    @Override // patroclinal.taiyuan
    public boolean isInitialized() {
        return this._value != molybdenite.f35093attabal;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }
}
