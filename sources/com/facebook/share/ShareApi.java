package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.CollectionMapper;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareApi {

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$1, reason: invalid class name */
    class AnonymousClass1 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            if (jSONObject != null) {
                jSONObject.optString("id");
            }
            ShareInternalUtility.g(graphResponse);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$10, reason: invalid class name */
    class AnonymousClass10 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            FacebookRequestError facebookRequestError = graphResponse.d;
            if (facebookRequestError != null) {
                String strA = facebookRequestError.a();
                new FacebookGraphResponseException(graphResponse, strA != null ? strA : "Error staging Open Graph object.");
                throw null;
            }
            JSONObject jSONObject = graphResponse.f15952c;
            if (jSONObject == null) {
                new FacebookGraphResponseException(graphResponse, "Error staging Open Graph object.");
                throw null;
            }
            if (jSONObject.optString("id") != null) {
                throw null;
            }
            new FacebookGraphResponseException(graphResponse, "Error staging Open Graph object.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$11, reason: invalid class name */
    class AnonymousClass11 implements CollectionMapper.OnMapperCompleteListener {
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$12, reason: invalid class name */
    class AnonymousClass12 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            FacebookRequestError facebookRequestError = graphResponse.d;
            if (facebookRequestError != null) {
                String strA = facebookRequestError.a();
                new FacebookGraphResponseException(graphResponse, strA != null ? strA : "Error staging photo.");
                throw null;
            }
            JSONObject jSONObject = graphResponse.f15952c;
            if (jSONObject == null) {
                new FacebookException("Error staging photo.");
                throw null;
            }
            String strOptString = jSONObject.optString("uri");
            if (strOptString == null) {
                new FacebookException("Error staging photo.");
                throw null;
            }
            try {
                new JSONObject().put("url", strOptString);
                throw null;
            } catch (JSONException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                new FacebookException(localizedMessage != null ? localizedMessage : "Error staging photo.");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$2, reason: invalid class name */
    class AnonymousClass2 implements CollectionMapper.OnMapperCompleteListener {
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$3, reason: invalid class name */
    class AnonymousClass3 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            if (graphResponse.f15952c != null) {
                throw null;
            }
            graphResponse.d.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$4, reason: invalid class name */
    class AnonymousClass4 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            if (jSONObject != null) {
                jSONObject.optString("id");
            }
            ShareInternalUtility.g(graphResponse);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$5, reason: invalid class name */
    class AnonymousClass5 implements CollectionMapper.Collection<Integer> {

        /* JADX INFO: renamed from: com.facebook.share.ShareApi$5$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<Integer> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Integer next() {
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$6, reason: invalid class name */
    class AnonymousClass6 implements CollectionMapper.OnMapperCompleteListener {
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$7, reason: invalid class name */
    class AnonymousClass7 implements CollectionMapper.ValueMapper {
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$8, reason: invalid class name */
    class AnonymousClass8 implements CollectionMapper.Collection<String> {
    }

    /* JADX INFO: renamed from: com.facebook.share.ShareApi$9, reason: invalid class name */
    class AnonymousClass9 implements CollectionMapper.Collection<String> {
    }
}
