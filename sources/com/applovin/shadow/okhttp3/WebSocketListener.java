package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J)\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/applovin/shadow/okhttp3/WebSocketListener;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/WebSocket;", "webSocket", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "Lwj/r;", "onOpen", "(Lcom/applovin/shadow/okhttp3/WebSocket;Lcom/applovin/shadow/okhttp3/Response;)V", "", "text", "onMessage", "(Lcom/applovin/shadow/okhttp3/WebSocket;Ljava/lang/String;)V", "Lcom/applovin/shadow/okio/ByteString;", "bytes", "(Lcom/applovin/shadow/okhttp3/WebSocket;Lcom/applovin/shadow/okio/ByteString;)V", "", "code", "reason", "onClosing", "(Lcom/applovin/shadow/okhttp3/WebSocket;ILjava/lang/String;)V", "onClosed", "", "t", "onFailure", "(Lcom/applovin/shadow/okhttp3/WebSocket;Ljava/lang/Throwable;Lcom/applovin/shadow/okhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int code, String reason) {
        n.f(webSocket, "webSocket");
        n.f(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int code, String reason) {
        n.f(webSocket, "webSocket");
        n.f(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        n.f(webSocket, "webSocket");
        n.f(t10, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        n.f(webSocket, "webSocket");
        n.f(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        n.f(webSocket, "webSocket");
        n.f(response, "response");
    }

    public void onMessage(WebSocket webSocket, String text) {
        n.f(webSocket, "webSocket");
        n.f(text, "text");
    }
}
