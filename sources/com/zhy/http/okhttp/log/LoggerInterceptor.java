package com.zhy.http.okhttp.log;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
public class LoggerInterceptor implements Interceptor {
    public static boolean a(MediaType mediaType) {
        if (mediaType.type() != null && mediaType.type().equals("text")) {
            return true;
        }
        if (mediaType.subtype() != null) {
            return mediaType.subtype().equals("json") || mediaType.subtype().equals("xml") || mediaType.subtype().equals("html") || mediaType.subtype().equals("webviewhtml");
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        MediaType contentType;
        String utf8;
        Request request = chain.request();
        try {
            String url = request.url().getUrl();
            Headers headers = request.headers();
            Log.e(null, "========request'log=======");
            Log.e(null, "method : " + request.method());
            Log.e(null, "url : " + url);
            if (headers != null && headers.size() > 0) {
                Log.e(null, "headers : " + headers.toString());
            }
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null && (contentType = requestBodyBody.getContentType()) != null) {
                Log.e(null, "requestBody's contentType : " + contentType.getMediaType());
                if (a(contentType)) {
                    try {
                        Request requestBuild = request.newBuilder().build();
                        Buffer buffer = new Buffer();
                        requestBuild.body().writeTo(buffer);
                        utf8 = buffer.readUtf8();
                    } catch (IOException unused) {
                        utf8 = "something error when show requestBody.";
                    }
                    Log.e(null, "requestBody's content : ".concat(utf8));
                } else {
                    Log.e(null, "requestBody's content :  maybe [file part] , too large too print , ignored!");
                }
            }
            Log.e(null, "========request'log=======end");
        } catch (Exception unused2) {
        }
        Response responseProceed = chain.proceed(request);
        try {
            Log.e(null, "========response'log=======");
            Response responseBuild = responseProceed.newBuilder().build();
            Log.e(null, "url : " + responseBuild.request().url());
            Log.e(null, "code : " + responseBuild.code());
            Log.e(null, "protocol : " + responseBuild.protocol());
            if (!TextUtils.isEmpty(responseBuild.message())) {
                Log.e(null, "message : " + responseBuild.message());
            }
            Log.e(null, "========response'log=======end");
        } catch (Exception unused3) {
        }
        return responseProceed;
    }
}
