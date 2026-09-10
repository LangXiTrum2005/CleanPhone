package duvetyn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001f\u001a\u00020\u000e*\u00060\u001bj\u0002`\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljava/io/OutputStream;", "Lduvetyn/sealless;", "marial", "(Ljava/io/OutputStream;)Lduvetyn/sealless;", "Ljava/io/InputStream;", "Lduvetyn/supplicat;", "taiyuan", "(Ljava/io/InputStream;)Lduvetyn/supplicat;", "Ljava/net/Socket;", "beachfront", "(Ljava/net/Socket;)Lduvetyn/sealless;", "cutely", "(Ljava/net/Socket;)Lduvetyn/supplicat;", "Ljava/io/File;", "", AgentOptions.APPEND, "wireman", "(Ljava/io/File;Z)Lduvetyn/sealless;", "saneness", "(Ljava/io/File;)Lduvetyn/sealless;", "impromptu", "(Ljava/io/File;)Lduvetyn/supplicat;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "attabal", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "dern", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
public final /* synthetic */ class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Logger f25409attabal = Logger.getLogger("okio.Okio");

    public static final sealless beachfront(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        kattegat kattegatVar = new kattegat(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return kattegatVar.cord(new sink(outputStream, kattegatVar));
    }

    public static /* synthetic */ sealless competently(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return adultoid.beachfront(file, z);
    }

    public static final supplicat cutely(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        kattegat kattegatVar = new kattegat(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return kattegatVar.cuirassed(new source(inputStream, kattegatVar));
    }

    public static final boolean dern(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.overspeculate(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final supplicat impromptu(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new source(new FileInputStream(file), restrictive.f25446marial);
    }

    public static final sealless marial(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new sink(outputStream, new restrictive());
    }

    public static final sealless saneness(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return adultoid.competently(new FileOutputStream(file, true));
    }

    public static final supplicat taiyuan(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new source(inputStream, new restrictive());
    }

    public static final sealless wireman(File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return adultoid.competently(new FileOutputStream(file, z));
    }
}
