package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/applovin/shadow/okio/InputStreamSource;", "Lcom/applovin/shadow/okio/Source;", "Ljava/io/InputStream;", "input", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "<init>", "(Ljava/io/InputStream;Llo/v;)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "()Lcom/applovin/shadow/okio/Timeout;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Ljava/io/InputStream;", "Lcom/applovin/shadow/okio/Timeout;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(InputStream input, Timeout timeout) {
        n.f(input, "input");
        n.f(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long byteCount) throws IOException {
        n.f(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i10 != -1) {
                segmentWritableSegment$okio.limit += i10;
                long j10 = i10;
                sink.setSize$okio(sink.size() + j10);
                return j10;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            sink.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e10) {
            if (Okio.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // com.applovin.shadow.okio.Source
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public Timeout getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
