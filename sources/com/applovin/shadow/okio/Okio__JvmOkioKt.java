package com.applovin.shadow.okio;

import an.h;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\u0002\u0010\t\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a\u001d\u0010\u0002\u001a\u00020\u0001*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\u001f*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u00012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u001d\u0010$\u001a\u0019\u0010 \u001a\u00020\u001f*\u00020\u00052\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010%\u001a\u0019\u0010)\u001a\u00020&*\u00020&2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010,\u001a\u00020&*\u00020+¢\u0006\u0004\b,\u0010-\u001a%\u0010\u0002\u001a\u00020\u0001*\u00020.2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200¢\u0006\u0004\b\u0002\u00102\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020.2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200¢\u0006\u0004\b\u0006\u00103\"\u001c\u00106\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001c\u0010:\u001a\u00020\f*\u000608j\u0002`98@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ljava/io/OutputStream;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Ljava/io/OutputStream;)Lcom/applovin/shadow/okio/Sink;", "Ljava/io/InputStream;", "Lcom/applovin/shadow/okio/Source;", "source", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Source;", "Ljava/net/Socket;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/net/Socket;)Lcom/applovin/shadow/okio/Source;", "Ljava/io/File;", "", "append", "(Ljava/io/File;Z)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Sink;", "(Ljava/io/File;)Lcom/applovin/shadow/okio/Source;", "Ljavax/crypto/Cipher;", "cipher", "Lcom/applovin/shadow/okio/CipherSink;", "cipherSink", "(Lcom/applovin/shadow/okio/Sink;Ljavax/crypto/Cipher;)Lcom/applovin/shadow/okio/CipherSink;", "Lcom/applovin/shadow/okio/CipherSource;", "cipherSource", "(Lcom/applovin/shadow/okio/Source;Ljavax/crypto/Cipher;)Lcom/applovin/shadow/okio/CipherSource;", "Ljavax/crypto/Mac;", "mac", "Lcom/applovin/shadow/okio/HashingSink;", "hashingSink", "(Lcom/applovin/shadow/okio/Sink;Ljavax/crypto/Mac;)Lcom/applovin/shadow/okio/HashingSink;", "Lcom/applovin/shadow/okio/HashingSource;", "hashingSource", "(Lcom/applovin/shadow/okio/Source;Ljavax/crypto/Mac;)Lcom/applovin/shadow/okio/HashingSource;", "Ljava/security/MessageDigest;", "digest", "(Lcom/applovin/shadow/okio/Sink;Ljava/security/MessageDigest;)Lcom/applovin/shadow/okio/HashingSink;", "(Lcom/applovin/shadow/okio/Source;Ljava/security/MessageDigest;)Lcom/applovin/shadow/okio/HashingSource;", "Lcom/applovin/shadow/okio/FileSystem;", "Lcom/applovin/shadow/okio/Path;", "zipPath", "openZip", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileSystem;", "Ljava/lang/ClassLoader;", "asResourceFileSystem", "(Ljava/lang/ClassLoader;)Lcom/applovin/shadow/okio/FileSystem;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Llo/r;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Llo/t;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z", "com.applovin.shadow.okio"}, k = 5, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE, xs = "com/applovin/shadow/okio/Okio")
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("com.applovin.shadow.okio.Okio");

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        n.f(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        n.f(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        n.f(sink, "<this>");
        n.f(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        n.f(source, "<this>");
        n.f(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        n.f(sink, "<this>");
        n.f(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        n.f(source, "<this>");
        n.f(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        n.f(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? h.q0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        n.f(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Okio.sink(file, z10);
    }

    public static final Source source(InputStream inputStream) {
        n.f(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest digest) {
        n.f(sink, "<this>");
        n.f(digest, "digest");
        return new HashingSink(sink, digest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest digest) {
        n.f(source, "<this>");
        n.f(digest, "digest");
        return new HashingSource(source, digest);
    }

    public static final Sink sink(OutputStream outputStream) {
        n.f(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(Socket socket) throws IOException {
        n.f(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        n.e(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(Socket socket) throws IOException {
        n.f(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        n.e(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(File file) throws FileNotFoundException {
        n.f(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(File file, boolean z10) throws FileNotFoundException {
        n.f(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z10));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... options) throws IOException {
        n.f(path, "<this>");
        n.f(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        n.e(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... options) throws IOException {
        n.f(path, "<this>");
        n.f(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        n.e(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }
}
