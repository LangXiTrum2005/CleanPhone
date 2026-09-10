package com.inmobi.media;

import android.content.ContentValues;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3398zb {
    public static final ContentValues a(C3174qb c3174qb) {
        Intrinsics.checkNotNullParameter(c3174qb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3174qb.a);
        contentValues.put("saveTimestamp", Long.valueOf(c3174qb.b));
        contentValues.put("retryCount", Integer.valueOf(c3174qb.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3174qb.d));
        contentValues.put("checkpoints", Integer.valueOf(c3174qb.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3174qb.e ? 1 : 0));
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x005a  */
    public static final C3174qb a(ContentValues contentValues) {
        boolean z;
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        if (asInteger3 != null) {
            z = asInteger3.intValue() == 1;
        }
        return new C3174qb(asString, jLongValue, iIntValue, jLongValue2, z, iIntValue2);
    }
}
