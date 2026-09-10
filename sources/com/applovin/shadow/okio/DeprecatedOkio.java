package com.applovin.shadow.okio;

import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\t\u0010\u0013J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0017J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u000e\u0010\u001aJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u000e\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\t\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0007¢\u0006\u0004\b\t\u0010#J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0007¢\u0006\u0004\b\u000e\u0010$¨\u0006%"}, d2 = {"Lcom/applovin/shadow/okio/-DeprecatedOkio;", "", "<init>", "()V", "Ljava/io/File;", X3.i.f27782b, "Lcom/applovin/shadow/okio/Sink;", "appendingSink", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Sink;", "sink", "Lcom/applovin/shadow/okio/BufferedSink;", "buffer", "(Lcom/applovin/shadow/okio/Sink;)Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Source;", "source", "Lcom/applovin/shadow/okio/BufferedSource;", "(Lcom/applovin/shadow/okio/Source;)Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/io/OutputStream;)Lcom/applovin/shadow/okio/Sink;", "Ljava/net/Socket;", "socket", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Source;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Source;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Source;", "blackhole", "()Lcom/applovin/shadow/okio/Sink;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Llo/r;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Llo/t;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final Sink appendingSink(File file) {
        n.f(file, "file");
        return Okio.appendingSink(file);
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final BufferedSink buffer(Sink sink) {
        n.f(sink, "sink");
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        n.f(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        n.f(file, "file");
        return Okio.source(file);
    }

    public final BufferedSource buffer(Source source) {
        n.f(source, "source");
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        n.f(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        n.f(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        n.f(path, "path");
        n.f(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Source source(java.nio.file.Path path, OpenOption... options) {
        n.f(path, "path");
        n.f(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Sink sink(Socket socket) {
        n.f(socket, "socket");
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        n.f(socket, "socket");
        return Okio.source(socket);
    }
}
