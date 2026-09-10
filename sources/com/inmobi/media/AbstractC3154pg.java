package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3154pg {
    public static final ContentValues a(Rf rf) throws JSONException {
        Intrinsics.checkNotNullParameter(rf, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rf.b);
        contentValues.put("url", rf.a);
        Map map = rf.c;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(rf.d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, rf.e);
        contentValues.put("ack_required", String.valueOf(rf.f));
        contentValues.put("time_created", Long.valueOf(rf.i));
        contentValues.put("retry_count", Integer.valueOf(rf.g));
        contentValues.put("owner", rf.h);
        Long l = rf.j;
        contentValues.put("retryAfter", Long.valueOf(l != null ? l.longValue() : 0L));
        C2932gi c2932gi = rf.k;
        if (c2932gi != null) {
            String string = new JSONObject().put("plType", c2932gi.a.f).put("plId", c2932gi.a.a).put("adType", c2932gi.a.e).put("markupType", c2932gi.b).put("networkType", C3342x5.m()).put("creativeType", c2932gi.f).put("creativeId", c2932gi.g).put("isRewarded", c2932gi.h).put("adPosition", c2932gi.i).put("metadataBlob", c2932gi.d).put("impressionId", c2932gi.c).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public static final Rf a(ContentValues contentValues) throws JSONException {
        boolean z;
        C2932gi c2932gi;
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (true) {
            String str = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str = string;
            }
            linkedHashMap.put(next, str);
        }
        boolean z2 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z3 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str2 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        Intrinsics.beachfront(asString2);
        Intrinsics.beachfront(asString);
        Intrinsics.beachfront(asString3);
        Intrinsics.beachfront(asLong2);
        long jLongValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                String mAdType = jSONObject2.getString("adType");
                Intrinsics.checkNotNullExpressionValue(mAdType, "getString(...)");
                Intrinsics.checkNotNullParameter(mAdType, "mAdType");
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                z = z2;
                try {
                    long j = jSONObject2.getLong("plId");
                    try {
                        if (j != Long.MIN_VALUE) {
                            C3287v0 c3287v0 = new C3287v0(j, "", mAdType, null);
                            c3287v0.d = null;
                            c3287v0.c = null;
                            Intrinsics.checkNotNullParameter("", "<set-?>");
                            c3287v0.h = "";
                            Intrinsics.checkNotNullParameter("activity", "<set-?>");
                            c3287v0.i = "activity";
                            c3287v0.g = string2;
                            c3287v0.j = false;
                            c3287v0.k = null;
                            String string3 = jSONObject2.getString("markupType");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = jSONObject2.getString("impressionId");
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String strOptString = jSONObject2.optString("metadataBlob", "");
                            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                            String string5 = jSONObject2.getString("creativeType");
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            String string6 = jSONObject2.getString("creativeId");
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            c2932gi = new C2932gi(c3287v0, string3, string4, strOptString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                        } else {
                            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                        }
                    } catch (JSONException unused) {
                        c2932gi = null;
                    }
                } catch (JSONException unused2) {
                }
            } catch (JSONException unused3) {
                z = z2;
            }
            c2932gi = null;
        } else {
            z = z2;
            c2932gi = null;
        }
        return new Rf(asString2, asString, linkedHashMap, z, asString3, z3, iIntValue, str2, jLongValue, asLong, c2932gi);
    }
}
