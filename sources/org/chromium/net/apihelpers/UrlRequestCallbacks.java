package org.chromium.net.apihelpers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class UrlRequestCallbacks {

    public static class CallbackAndResponseFuturePair<ResponseBodyT, CallbackT extends InMemoryTransformCronetCallback<ResponseBodyT>> {
        private final CallbackT mCallback;
        private final Future<CronetResponse<ResponseBodyT>> mFuture;

        public CallbackAndResponseFuturePair(Future<CronetResponse<ResponseBodyT>> future, CallbackT callbackt) {
            this.mFuture = future;
            this.mCallback = callbackt;
        }

        public CallbackT getCallback() {
            return this.mCallback;
        }

        public Future<CronetResponse<ResponseBodyT>> getFuture() {
            return this.mFuture;
        }
    }

    private UrlRequestCallbacks() {
    }

    private static <T> Future<CronetResponse<T>> addResponseFutureListener(InMemoryTransformCronetCallback<T> inMemoryTransformCronetCallback) {
        final CompletableFuture completableFuture = new CompletableFuture();
        inMemoryTransformCronetCallback.addCompletionListener(new CronetRequestCompletionListener<T>() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4
            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onCanceled(UrlResponseInfo urlResponseInfo) {
                completableFuture.completeExceptionally(new CronetException("The request was canceled!", null) { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4.1
                });
            }

            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onFailed(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                completableFuture.completeExceptionally(cronetException);
            }

            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onSucceeded(UrlResponseInfo urlResponseInfo, T t) {
                completableFuture.complete(new CronetResponse(urlResponseInfo, t));
            }
        });
        return completableFuture;
    }

    public static ByteArrayCronetCallback forByteArrayBody(RedirectHandler redirectHandler, CronetRequestCompletionListener<byte[]> cronetRequestCompletionListener) {
        return newByteArrayCallback(redirectHandler).addCompletionListener((CronetRequestCompletionListener<? super byte[]>) cronetRequestCompletionListener);
    }

    public static JsonCronetCallback forJsonBody(RedirectHandler redirectHandler, CronetRequestCompletionListener<JSONObject> cronetRequestCompletionListener) {
        return newJsonCallback(redirectHandler).addCompletionListener((CronetRequestCompletionListener<? super JSONObject>) cronetRequestCompletionListener);
    }

    public static StringCronetCallback forStringBody(RedirectHandler redirectHandler, CronetRequestCompletionListener<String> cronetRequestCompletionListener) {
        return newStringCallback(redirectHandler).addCompletionListener((CronetRequestCompletionListener<? super String>) cronetRequestCompletionListener);
    }

    private static ByteArrayCronetCallback newByteArrayCallback(final RedirectHandler redirectHandler) {
        return new ByteArrayCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.1
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception {
                return redirectHandler.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    private static JsonCronetCallback newJsonCallback(final RedirectHandler redirectHandler) {
        return new JsonCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.3
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception {
                return redirectHandler.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    private static StringCronetCallback newStringCallback(final RedirectHandler redirectHandler) {
        return new StringCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.2
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception {
                return redirectHandler.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    public static CallbackAndResponseFuturePair<byte[], ByteArrayCronetCallback> forByteArrayBody(RedirectHandler redirectHandler) {
        ByteArrayCronetCallback byteArrayCronetCallbackNewByteArrayCallback = newByteArrayCallback(redirectHandler);
        return new CallbackAndResponseFuturePair<>(addResponseFutureListener(byteArrayCronetCallbackNewByteArrayCallback), byteArrayCronetCallbackNewByteArrayCallback);
    }

    public static CallbackAndResponseFuturePair<JSONObject, JsonCronetCallback> forJsonBody(RedirectHandler redirectHandler) {
        JsonCronetCallback jsonCronetCallbackNewJsonCallback = newJsonCallback(redirectHandler);
        return new CallbackAndResponseFuturePair<>(addResponseFutureListener(jsonCronetCallbackNewJsonCallback), jsonCronetCallbackNewJsonCallback);
    }

    public static CallbackAndResponseFuturePair<String, StringCronetCallback> forStringBody(RedirectHandler redirectHandler) {
        StringCronetCallback stringCronetCallbackNewStringCallback = newStringCallback(redirectHandler);
        return new CallbackAndResponseFuturePair<>(addResponseFutureListener(stringCronetCallbackNewStringCallback), stringCronetCallbackNewStringCallback);
    }
}
