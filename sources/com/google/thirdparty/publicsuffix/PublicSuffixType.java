package com.google.thirdparty.publicsuffix;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public enum PublicSuffixType {
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA),
    /* JADX INFO: Fake field, exist only in values array */
    REGISTRY('!', '?');

    public final char X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final char f21329Y;

    PublicSuffixType(char c2, char c3) {
        this.X = c2;
        this.f21329Y = c3;
    }
}
