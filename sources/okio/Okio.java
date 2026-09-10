package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class Okio {
    public static final Sink a(File file) {
        Logger logger = Okio__JvmOkioKt.f45150a;
        Intrinsics.f(file, "<this>");
        return new OutputStreamSink(new FileOutputStream(file, true), new Timeout());
    }

    public static final Sink b() {
        return new BlackholeSink();
    }

    public static final RealBufferedSink c(Sink sink) {
        Intrinsics.f(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    public static final RealBufferedSource d(Source source) {
        Intrinsics.f(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final boolean e(AssertionError assertionError) {
        Logger logger = Okio__JvmOkioKt.f45150a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.l(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final Sink f(Socket socket) throws IOException {
        Logger logger = Okio__JvmOkioKt.f45150a;
        Intrinsics.f(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.e(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static Sink g(File file) {
        Logger logger = Okio__JvmOkioKt.f45150a;
        return new OutputStreamSink(new FileOutputStream(file, false), new Timeout());
    }

    public static final Source h(File file) {
        Logger logger = Okio__JvmOkioKt.f45150a;
        Intrinsics.f(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Source i(InputStream inputStream) {
        Logger logger = Okio__JvmOkioKt.f45150a;
        Intrinsics.f(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Source j(Socket socket) throws IOException {
        Logger logger = Okio__JvmOkioKt.f45150a;
        Intrinsics.f(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.e(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }
}
