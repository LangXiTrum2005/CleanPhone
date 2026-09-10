package com.squareup.picasso;

import android.net.NetworkInfo;
import android.support.v4.media.a;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i2, int i3) {
            super(a.h(i2, "HTTP "));
            this.code = i2;
            this.networkPolicy = i3;
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static okhttp3.Request createRequest(Request request, int i2) {
        CacheControl cacheControlBuild;
        if (i2 == 0) {
            cacheControlBuild = null;
        } else if (NetworkPolicy.isOfflineOnly(i2)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i2)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i2)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        okhttp3.Request.Builder builderUrl = new okhttp3.Request.Builder().url(request.uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        return builderUrl.build();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i2) throws IOException {
        Response responseLoad = this.downloader.load(createRequest(request, i2));
        ResponseBody responseBodyBody = responseLoad.body();
        if (!responseLoad.isSuccessful()) {
            responseBodyBody.close();
            throw new ResponseException(responseLoad.code(), request.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = responseLoad.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && responseBodyBody.getContentLength() == 0) {
            responseBodyBody.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseBodyBody.getContentLength() > 0) {
            this.stats.dispatchDownloadFinished(responseBodyBody.getContentLength());
        }
        return new RequestHandler.Result(responseBodyBody.getBodySource(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z2, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }
}
