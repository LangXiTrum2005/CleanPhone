package com.applovin.shadow.okhttp3.internal.ws;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.InflaterSource;
import com.applovin.shadow.okio.Source;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "Lwj/r;", "inflate", "(Lcom/applovin/shadow/okio/Buffer;)V", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "Z", "deflatedBytes", "Lcom/applovin/shadow/okio/Buffer;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lcom/applovin/shadow/okio/InflaterSource;", "inflaterSource", "Lcom/applovin/shadow/okio/InflaterSource;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MessageInflater implements Closeable {
    private final Buffer deflatedBytes;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource((Source) buffer, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(Buffer buffer) throws IOException {
        n.f(buffer, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.writeAll(buffer);
        this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long size = this.deflatedBytes.size() + this.inflater.getBytesRead();
        do {
            this.inflaterSource.readOrInflate(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < size);
    }
}
