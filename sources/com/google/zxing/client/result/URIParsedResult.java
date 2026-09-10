package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class URIParsedResult extends ParsedResult {
    static {
        Pattern.compile(":/*([^/@]+)@[^/]+");
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        return new StringBuilder(30).toString();
    }
}
