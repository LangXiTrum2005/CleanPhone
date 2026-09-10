package org.chromium.net.apihelpers;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImplicitFlowControlCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY = 32768;

    public abstract void onBodyChunkRead(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception;

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        onCanceled(urlResponseInfo);
    }

    public abstract void onCanceled(UrlResponseInfo urlResponseInfo);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        onFailed(urlResponseInfo, cronetException);
    }

    public abstract void onFailed(UrlResponseInfo urlResponseInfo, CronetException cronetException);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        onBodyChunkRead(urlResponseInfo, byteBuffer);
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        if (shouldFollowRedirect(urlResponseInfo, str)) {
            urlRequest.followRedirect();
        } else {
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        onResponseStarted(urlResponseInfo);
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    public abstract void onResponseStarted(UrlResponseInfo urlResponseInfo) throws Exception;

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        onSucceeded(urlResponseInfo);
    }

    public abstract void onSucceeded(UrlResponseInfo urlResponseInfo);

    public abstract boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception;
}
