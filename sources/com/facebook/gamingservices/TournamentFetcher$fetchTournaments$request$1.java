package com.facebook.gamingservices;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.p004ironsource.qt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", qt.f26623n, "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class TournamentFetcher$fetchTournaments$request$1 implements GraphRequest.Callback {
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
        try {
            JSONObject jSONObject = graphResponse.f15952c;
            if (jSONObject == null) {
                new GraphAPIException("Failed to get response");
                throw null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray != null && jSONArray.length() >= 1) {
                Gson gsonA = new GsonBuilder().a();
                String string = jSONArray.toString();
                Intrinsics.e(string, "data.toString()");
                Object objC = gsonA.c(string, Tournament[].class);
                Intrinsics.e(objC, "gson.fromJson(dataString…<Tournament>::class.java)");
                ArraysKt.M((Object[]) objC);
                throw null;
            }
            new GraphAPIException(String.format(Locale.ROOT, "No tournament found", Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length()), 1}, 2)));
            throw null;
        } catch (JSONException unused) {
            throw null;
        }
    }
}
