package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3123m2 extends T1 {
    public C3123m2() {
        super("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
        Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
        String asString2 = contentValues.getAsString("track_extras");
        HashMap map = new HashMap();
        if (asString2 != null) {
            try {
                map.putAll(a(new JSONObject(asString2)));
            } catch (JSONException | Exception unused) {
            }
        }
        Intrinsics.c(asInteger);
        int iIntValue = asInteger.intValue();
        Intrinsics.c(asString);
        Intrinsics.c(asBoolean);
        boolean zBooleanValue = asBoolean.booleanValue();
        Intrinsics.c(asBoolean2);
        boolean zBooleanValue2 = asBoolean2.booleanValue();
        Intrinsics.c(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        Intrinsics.c(asLong);
        long jLongValue = asLong.longValue();
        Intrinsics.c(asLong2);
        return new C3107l2(iIntValue, asString, map, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue());
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        C3107l2 click = (C3107l2) obj;
        Intrinsics.f(click, "click");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(click.f23758a));
        contentValues.put("url", click.f23759b);
        contentValues.put("pending_attempts", Integer.valueOf(click.f));
        contentValues.put("ts", Long.valueOf(click.g));
        contentValues.put("created_ts", Long.valueOf(click.f23762h));
        contentValues.put("follow_redirect", Boolean.valueOf(click.d));
        contentValues.put("ping_in_webview", Boolean.valueOf(click.f23761e));
        Map map = click.f23760c;
        if (map != null && !map.isEmpty()) {
            Map map2 = click.f23760c;
            Intrinsics.d(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            contentValues.put("track_extras", new JSONObject(map2).toString());
        }
        return contentValues;
    }

    public final ArrayList a(int i2, int i3) {
        if (T1.a(this, null, null, 63) == 0) {
            return new ArrayList();
        }
        ArrayList<C3107l2> arrayListA = T1.a(this, null, null, "ts", "ts < " + (System.currentTimeMillis() - ((long) i3)), "ts ASC ", -1 != i2 ? Integer.valueOf(i2) : null, 3);
        ArrayList arrayList = new ArrayList();
        for (C3107l2 c3107l2 : arrayListA) {
            if (c3107l2 != null) {
                arrayList.add(c3107l2);
            }
        }
        return arrayList;
    }

    public static HashMap a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.c(next);
            Object obj = jSONObject.get(next);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            map.put(next, (String) obj);
        }
        return map;
    }
}
