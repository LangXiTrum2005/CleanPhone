package com.google.zxing.client.result;

import java.text.DateFormat;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarParsedResult extends ParsedResult {
    static {
        Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
        Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.b(sb, DateFormat.getDateTimeInstance(2, 2).format((Object) 0L));
        ParsedResult.b(sb, DateFormat.getDateTimeInstance(2, 2).format((Object) 0L));
        return sb.toString();
    }
}
