package com.startapp.sdk.adsbase;

/* JADX INFO: loaded from: classes6.dex */
enum SimpleTokenUtils$TokenType {
    T1("token"),
    T2("token2"),
    UNDEFINED("");

    private final String text;

    SimpleTokenUtils$TokenType(String str) {
        this.text = str;
    }

    public static SimpleTokenUtils$TokenType a(String str) {
        SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = T1;
        if (simpleTokenUtils$TokenType.text.equals(str)) {
            return simpleTokenUtils$TokenType;
        }
        SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = T2;
        return simpleTokenUtils$TokenType2.text.equals(str) ? simpleTokenUtils$TokenType2 : UNDEFINED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.text;
    }
}
