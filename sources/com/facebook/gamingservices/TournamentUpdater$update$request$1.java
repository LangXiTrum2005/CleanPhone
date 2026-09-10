package com.facebook.gamingservices;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.qt;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", qt.f26623n, "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class TournamentUpdater$update$request$1 implements GraphRequest.Callback {
    @Override // com.facebook.GraphRequest.Callback
    public final void a(GraphResponse graphResponse) {
        FacebookRequestError facebookRequestError = graphResponse.d;
        if (facebookRequestError != null) {
            if (facebookRequestError.f15913Y != null) {
                throw null;
            }
            new GraphAPIException("Graph API Error");
            throw null;
        }
        JSONObject jSONObject = graphResponse.f15952c;
        String strOptString = jSONObject != null ? jSONObject.optString("success") : null;
        if (strOptString == null || strOptString.length() == 0) {
            new GraphAPIException("Graph API Error");
            throw null;
        }
        strOptString.equals(a.g);
        throw null;
    }
}
