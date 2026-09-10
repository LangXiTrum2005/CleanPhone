package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Vd extends AbstractC3204r4 {
    public Vd() {
        super("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        String asString3 = contentValues.getAsString("eventSource");
        String asString4 = contentValues.getAsString("ts");
        Intrinsics.e(asString4, "getAsString(...)");
        long j = Long.parseLong(asString4);
        Intrinsics.c(asString);
        Intrinsics.c(asString3);
        Wd wd = new Wd(asString, asString2, asString3);
        wd.f23248b = j;
        Integer asInteger = contentValues.getAsInteger("id");
        Intrinsics.e(asInteger, "getAsInteger(...)");
        wd.f23249c = asInteger.intValue();
        return wd;
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        Wd item = (Wd) obj;
        Intrinsics.f(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", item.f23247a);
        contentValues.put("payload", item.a());
        contentValues.put("eventSource", item.f23328e);
        contentValues.put("ts", String.valueOf(item.f23248b));
        return contentValues;
    }
}
