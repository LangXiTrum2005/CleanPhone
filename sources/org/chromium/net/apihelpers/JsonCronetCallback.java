package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class JsonCronetCallback extends InMemoryTransformCronetCallback<JSONObject> {
    private static final StringCronetCallback STRING_CALLBACK = new StringCronetCallback() { // from class: org.chromium.net.apihelpers.JsonCronetCallback.1
        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
            throw new UnsupportedOperationException();
        }
    };

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public JsonCronetCallback addCompletionListener(CronetRequestCompletionListener<? super JSONObject> cronetRequestCompletionListener) {
        super.addCompletionListener((CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public JSONObject transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        try {
            return new JSONObject(STRING_CALLBACK.transformBodyBytes(urlResponseInfo, bArr));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Cannot parse the string as JSON!", e);
        }
    }
}
