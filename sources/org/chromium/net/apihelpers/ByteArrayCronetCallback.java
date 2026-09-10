package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ByteArrayCronetCallback extends InMemoryTransformCronetCallback<byte[]> {
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public final byte[] transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public ByteArrayCronetCallback addCompletionListener(CronetRequestCompletionListener<? super byte[]> cronetRequestCompletionListener) {
        super.addCompletionListener((CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }
}
