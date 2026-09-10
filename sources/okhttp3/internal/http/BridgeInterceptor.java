package okhttp3.internal.http;

import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.dc;
import com.smartdigimkt.o0.b;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.f(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> cookies) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (Object obj : cookies) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            Cookie cookie = (Cookie) obj;
            if (i2 > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name());
            sb.append(dc.T);
            sb.append(cookie.value());
            i2 = i3;
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody responseBodyBody;
        Intrinsics.f(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            MediaType contentType = requestBodyBody.getContentType();
            if (contentType != null) {
                builderNewBuilder.header("Content-Type", contentType.getMediaType());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", String.valueOf(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader("Content-Length");
            }
        }
        boolean z2 = true;
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", Util.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", b.f37292c);
        }
        if (request.header("Accept-Encoding") == null && request.header(Command.HTTP_HEADER_RANGE) == null) {
            builderNewBuilder.header("Accept-Encoding", b.d);
        } else {
            z2 = false;
        }
        List<Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!listLoadForRequest.isEmpty()) {
            builderNewBuilder.header("Cookie", cookieHeader(listLoadForRequest));
        }
        if (request.header(Command.HTTP_HEADER_USER_AGENT) == null) {
            builderNewBuilder.header(Command.HTTP_HEADER_USER_AGENT, "okhttp/4.12.0");
        }
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z2 && b.d.equalsIgnoreCase(Response.header$default(responseProceed, "Content-Encoding", null, 2, null)) && HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
            GzipSource gzipSource = new GzipSource(responseBodyBody.getDelegateSource());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            builderRequest.body(new RealResponseBody(Response.header$default(responseProceed, "Content-Type", null, 2, null), -1L, Okio.d(gzipSource)));
        }
        return builderRequest.build();
    }
}
