package shent;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lshent/wireman;", "Ljava/util/logging/Handler;", "<init>", "()V", "Ljava/util/logging/LogRecord;", "record", "", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "close", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman extends Handler {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f37619attabal = new wireman();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        dern dernVar = dern.f37604attabal;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iSaneness = marial.saneness(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        dernVar.attabal(loggerName, iSaneness, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
