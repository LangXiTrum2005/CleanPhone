package okhttp3.internal.cache;

import duvetyn.apical;
import duvetyn.sealless;
import java.io.EOFException;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/cache/wireman;", "Lduvetyn/apical;", "Lduvetyn/sealless;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Lduvetyn/sealless;Lkotlin/jvm/functions/Function1;)V", "Lduvetyn/wireman;", "source", "", "byteCount", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "arytenoidectomy", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "", "monoploid", "Z", "hasErrors", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class wireman extends apical {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean hasErrors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wireman(sealless delegate, Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.onException = onException;
    }

    @Override // duvetyn.apical, duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // duvetyn.apical, duvetyn.sealless, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // duvetyn.apical, duvetyn.sealless
    public void supplicat(duvetyn.wireman source, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.supplicat(source, byteCount);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
