package duvetyn;

import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lduvetyn/formularize;", "Lduvetyn/supplicat;", "delegate", "<init>", "(Lduvetyn/supplicat;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lduvetyn/supplicat;", "Lduvetyn/supplicat;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class formularize implements supplicat {
    private final supplicat delegate;

    public formularize(supplicat delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @patroclinal.wireman
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final supplicat getDelegate() {
        return this.delegate;
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final supplicat delegate() {
        return this.delegate;
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, byteCount);
    }

    @Override // duvetyn.supplicat
    public restrictive timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
