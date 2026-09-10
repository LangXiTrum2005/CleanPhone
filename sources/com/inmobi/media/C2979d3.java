package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2979d3 extends T1 {
    public C2979d3() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        Intrinsics.e(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        Intrinsics.e(asLong, "getAsLong(...)");
        return new C3061i4(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        C3061i4 data = (C3061i4) obj;
        Intrinsics.f(data, "data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", data.f23688a);
        contentValues.put("timestamp", Long.valueOf(data.f23689b));
        return contentValues;
    }
}
