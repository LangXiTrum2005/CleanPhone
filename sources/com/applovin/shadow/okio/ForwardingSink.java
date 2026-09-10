package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okio/ForwardingSink;", "Lcom/applovin/shadow/okio/Sink;", "delegate", "<init>", "(Llo/r;)V", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Lwj/r;", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "flush", "()V", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "-deprecated_delegate", "()Lcom/applovin/shadow/okio/Sink;", "Lcom/applovin/shadow/okio/Sink;", "()Llo/r;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink delegate) {
        n.f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final Sink getDelegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long byteCount) throws IOException {
        n.f(source, "source");
        this.delegate.write(source, byteCount);
    }
}
