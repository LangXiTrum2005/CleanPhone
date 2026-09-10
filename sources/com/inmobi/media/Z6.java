package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Z6 extends T1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5 f23399b;

    public Z6() {
        super("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        boolean z2;
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("filename");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        if (asInteger3 != null) {
            z2 = asInteger3.intValue() == 1;
        }
        boolean z3 = z2;
        Intrinsics.c(asString);
        Intrinsics.c(asLong);
        long jLongValue = asLong.longValue();
        Intrinsics.c(asInteger);
        int iIntValue = asInteger.intValue();
        Intrinsics.c(asLong2);
        long jLongValue2 = asLong2.longValue();
        Intrinsics.c(asInteger2);
        return new Y6(asString, jLongValue, iIntValue, jLongValue2, z3, asInteger2.intValue());
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        Y6 item = (Y6) obj;
        Intrinsics.f(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", item.f23367a);
        contentValues.put("saveTimestamp", Long.valueOf(item.f23368b));
        contentValues.put("retryCount", Integer.valueOf(item.f23369c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(item.d));
        contentValues.put("checkpoints", Integer.valueOf(item.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(item.f23370e ? 1 : 0));
        return contentValues;
    }

    public final void a(Y6 data) {
        Intrinsics.f(data, "data");
        a("filename=\"" + data.f23367a + AbstractJsonLexerKt.STRING, null);
    }

    public final void b(Y6 data) {
        Intrinsics.f(data, "data");
        b(data, androidx.media3.extractor.text.ttml.a.p(new StringBuilder("filename=\""), data.f23367a, AbstractJsonLexerKt.STRING), null);
        if (this.f23399b != null) {
            C5.a();
        }
    }
}
