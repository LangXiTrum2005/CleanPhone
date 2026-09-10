package com.google.zxing.client.result;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsedResultType {
    public static final /* synthetic */ ParsedResultType[] X = {new ParsedResultType("ADDRESSBOOK", 0), new ParsedResultType("EMAIL_ADDRESS", 1), new ParsedResultType("PRODUCT", 2), new ParsedResultType("URI", 3), new ParsedResultType(AdPreferences.TYPE_TEXT, 4), new ParsedResultType("GEO", 5), new ParsedResultType("TEL", 6), new ParsedResultType("SMS", 7), new ParsedResultType("CALENDAR", 8), new ParsedResultType("WIFI", 9), new ParsedResultType("ISBN", 10), new ParsedResultType("VIN", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    ParsedResultType EF5;

    public static ParsedResultType valueOf(String str) {
        return (ParsedResultType) Enum.valueOf(ParsedResultType.class, str);
    }

    public static ParsedResultType[] values() {
        return (ParsedResultType[]) X.clone();
    }
}
