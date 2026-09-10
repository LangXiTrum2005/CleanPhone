package org.chromium.net.apihelpers;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class InMemoryTransformCronetCallback<T> extends ImplicitFlowControlCallback {
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private final Set<CronetRequestCompletionListener<? super T>> mListeners = new LinkedHashSet();
    private WritableByteChannel mResponseBodyChannel;
    private ByteArrayOutputStream mResponseBodyStream;

    private static long getBodyLength(UrlResponseInfo urlResponseInfo) {
        List<String> list = urlResponseInfo.getAllHeaders().get(CONTENT_LENGTH_HEADER_NAME);
        if (list == null || list.size() != 1) {
            return -1L;
        }
        try {
            return Long.parseLong(list.get(0));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public ImplicitFlowControlCallback addCompletionListener(CronetRequestCompletionListener<? super T> cronetRequestCompletionListener) {
        this.mListeners.add(cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onBodyChunkRead(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        this.mResponseBodyChannel.write(byteBuffer);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onCanceled(UrlResponseInfo urlResponseInfo) {
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCanceled(urlResponseInfo);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onFailed(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onFailed(urlResponseInfo, cronetException);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onResponseStarted(UrlResponseInfo urlResponseInfo) {
        long bodyLength = getBodyLength(urlResponseInfo);
        if (bodyLength > 2147483639) {
            throw new IllegalArgumentException("The body is too large and wouldn't fit in a byte array!");
        }
        if (bodyLength >= 0) {
            this.mResponseBodyStream = new ByteArrayOutputStream((int) bodyLength);
        } else {
            this.mResponseBodyStream = new ByteArrayOutputStream();
        }
        this.mResponseBodyChannel = Channels.newChannel(this.mResponseBodyStream);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onSucceeded(UrlResponseInfo urlResponseInfo) {
        T tTransformBodyBytes = transformBodyBytes(urlResponseInfo, this.mResponseBodyStream.toByteArray());
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onSucceeded(urlResponseInfo, tTransformBodyBytes);
        }
    }

    public abstract T transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr);
}
