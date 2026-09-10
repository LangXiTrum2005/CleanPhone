package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.measurement.AppMeasurement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class R5 extends AbstractC3204r4 {
    public R5() {
        super(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        String asString5 = contentValues.getAsString("ts");
        Intrinsics.e(asString5, "getAsString(...)");
        long j = Long.parseLong(asString5);
        Intrinsics.c(asString);
        Intrinsics.c(asString3);
        Intrinsics.c(asString2);
        T5 t5 = new T5(asString, asString3, asString2, asString4);
        t5.f23248b = j;
        Integer asInteger = contentValues.getAsInteger("id");
        Intrinsics.e(asInteger, "getAsInteger(...)");
        t5.f23249c = asInteger.intValue();
        return t5;
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        T5 item = (T5) obj;
        Intrinsics.f(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", item.f23200e);
        contentValues.put("componentType", item.f);
        contentValues.put("eventType", item.f23247a);
        contentValues.put("payload", item.a());
        contentValues.put("ts", String.valueOf(item.f23248b));
        return contentValues;
    }
}
