package com.applovin.shadow.okhttp3;

import androidx.core.app.NotificationCompat;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/applovin/shadow/okhttp3/Interceptor;", "", "intercept", "Lcom/applovin/shadow/okhttp3/Response;", "chain", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "Chain", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/Call;", "connectTimeoutMillis", "", "connection", "Lcom/applovin/shadow/okhttp3/Connection;", "proceed", "Lcom/applovin/shadow/okhttp3/Response;", "request", "Lcom/applovin/shadow/okhttp3/Request;", "readTimeoutMillis", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "writeTimeoutMillis", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int timeout, TimeUnit unit);

        Chain withReadTimeout(int timeout, TimeUnit unit);

        Chain withWriteTimeout(int timeout, TimeUnit unit);

        int writeTimeoutMillis();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\nø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/Interceptor$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "Lcom/applovin/shadow/okhttp3/Response;", "block", "Lcom/applovin/shadow/okhttp3/Interceptor;", "invoke", "(Ljk/b;)Lcom/applovin/shadow/okhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final b block) {
            n.f(block, "block");
            return new Interceptor() { // from class: com.applovin.shadow.okhttp3.Interceptor$Companion$invoke$1
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    n.f(it, "it");
                    return (Response) block.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
