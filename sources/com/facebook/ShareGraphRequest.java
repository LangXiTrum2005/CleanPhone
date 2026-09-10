package com.facebook;

import android.net.Uri;
import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ShareGraphRequest {

    /* JADX INFO: renamed from: com.facebook.ShareGraphRequest$1, reason: invalid class name */
    final class AnonymousClass1 implements OpenGraphJSONUtility.PhotoJSONProcessor {
        @Override // com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor
        public final JSONObject a(SharePhoto sharePhoto) {
            Uri uri = sharePhoto.Z;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uri.toString());
                return jSONObject;
            } catch (Exception e2) {
                throw new FacebookException("Unable to attach images", e2);
            }
        }
    }
}
