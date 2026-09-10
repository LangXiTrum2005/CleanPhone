package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Pa extends T1 {
    public Pa() {
        super("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) throws JSONException {
        C3053hc c3053hc;
        String str;
        String str2;
        String str3;
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.e(itKeys, "keys(...)");
        while (true) {
            String str4 = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            Intrinsics.c(next);
            String string = jSONObject.getString(next);
            if (string != null) {
                str4 = string;
            }
            linkedHashMap.put(next, str4);
        }
        boolean z2 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z3 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger == null ? 0 : asInteger.intValue();
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str5 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        Intrinsics.c(asString2);
        Intrinsics.c(asString);
        Intrinsics.c(asString3);
        Intrinsics.c(asLong2);
        long jLongValue = asLong2.longValue();
        String asString5 = contentValues.getAsString("telemetry_metadata");
        if (asString5 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(asString5);
                str = asString3;
                try {
                    String string2 = jSONObject2.getString("adType");
                    Intrinsics.e(string2, "getString(...)");
                    str2 = asString2;
                    str3 = asString;
                    try {
                        Z zA = new X(string2).a(jSONObject2.getLong("plId")).a();
                        String string3 = jSONObject2.getString("markupType");
                        Intrinsics.e(string3, "getString(...)");
                        String strOptString = jSONObject2.optString("metadataBlob", "");
                        Intrinsics.e(strOptString, "optString(...)");
                        String string4 = jSONObject2.getString("creativeType");
                        Intrinsics.e(string4, "getString(...)");
                        String string5 = jSONObject2.getString("creativeId");
                        Intrinsics.e(string5, "getString(...)");
                        c3053hc = new C3053hc(zA, string3, strOptString, 0, string4, string5, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null);
                    } catch (JSONException unused) {
                        c3053hc = null;
                    }
                } catch (JSONException unused2) {
                    str2 = asString2;
                    str3 = asString;
                }
            } catch (JSONException unused3) {
                str = asString3;
            }
        } else {
            str = asString3;
            str2 = asString2;
            str3 = asString;
            c3053hc = null;
        }
        return new C3338za(str2, str3, linkedHashMap, z2, str, z3, iIntValue, str5, jLongValue, asLong, c3053hc);
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) throws JSONException {
        C3338za item = (C3338za) obj;
        Intrinsics.f(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", item.f24160b);
        contentValues.put("url", item.f24159a);
        Map map = item.f24161c;
        Intrinsics.f(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(item.d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, item.f24162e);
        contentValues.put("ack_required", String.valueOf(item.f));
        contentValues.put("time_created", Long.valueOf(item.f24164i));
        contentValues.put("retry_count", Integer.valueOf(item.g));
        contentValues.put("owner", item.f24163h);
        Long l2 = item.j;
        contentValues.put("retryAfter", Long.valueOf(l2 != null ? l2.longValue() : 0L));
        C3053hc c3053hc = item.k;
        if (c3053hc != null) {
            String string = new JSONObject().put("plType", c3053hc.f23664a.m()).put("plId", c3053hc.f23664a.l()).put("adType", c3053hc.f23664a.b()).put("markupType", c3053hc.f23665b).put("networkType", L3.q()).put("creativeType", c3053hc.f23667e).put("creativeId", c3053hc.f).put("isRewarded", c3053hc.g).put("adPosition", c3053hc.f23668h).put("metadataBlob", c3053hc.f23666c).toString();
            Intrinsics.e(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public final ArrayList a(Integer num) {
        return T1.a(this, "priority = ? AND retry_count >= ? AND retryAfter <= ?", new String[]{"high", "1", String.valueOf(System.currentTimeMillis())}, null, null, "time_created ASC", num, 12);
    }

    public final C3338za a(String priority) {
        Intrinsics.f(priority, "priority");
        C3338za c3338za = (C3338za) CollectionsKt.y(T1.a(this, "priority = ?", new String[]{priority}, null, null, "time_created ASC", 1, 12));
        if (c3338za == null) {
            return null;
        }
        a("id = ?", new String[]{c3338za.f24160b});
        return c3338za;
    }
}
