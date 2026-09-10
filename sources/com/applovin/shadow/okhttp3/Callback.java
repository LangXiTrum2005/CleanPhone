package com.applovin.shadow.okhttp3;

import androidx.core.app.NotificationCompat;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okhttp3/Callback;", "", "Lcom/applovin/shadow/okhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Ljava/io/IOException;", "e", "Lwj/r;", "onFailure", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/io/IOException;)V", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "onResponse", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface Callback {
    void onFailure(Call call, IOException e10);

    void onResponse(Call call, Response response) throws IOException;
}
