package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public final class VINParsedResult extends ParsedResult {
    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("null null null\n");
        sb.append("0 \u0000 null\n");
        return sb.toString();
    }
}
