package com.google.zxing.client.result;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        return AbstractJsonLexerKt.NULL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ((ExpandedProductParsedResult) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
