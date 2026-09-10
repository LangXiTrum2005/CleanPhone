package p002kotlin;

import androidx.concurrent.futures.attabal;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.molybdenite;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001 B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b¨\u0006!"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpatroclinal/taiyuan;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "_value", "Ljava/lang/Object;", "final", "getFinal$annotations", "()V", "getValue", "value", "Companion", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SafePublicationLazyImpl<T> implements taiyuan<T>, Serializable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f29294kowloon = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;
    private final Object final;
    private volatile Function0<? extends T> initializer;

    public SafePublicationLazyImpl(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        molybdenite molybdeniteVar = molybdenite.f35093attabal;
        this._value = molybdeniteVar;
        this.final = molybdeniteVar;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // patroclinal.taiyuan
    public T getValue() {
        T t = (T) this._value;
        molybdenite molybdeniteVar = molybdenite.f35093attabal;
        if (t != molybdeniteVar) {
            return t;
        }
        Function0<? extends T> function0 = this.initializer;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (attabal.attabal(f29294kowloon, this, molybdeniteVar, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    @Override // patroclinal.taiyuan
    public boolean isInitialized() {
        return this._value != molybdenite.f35093attabal;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
