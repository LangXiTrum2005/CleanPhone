package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public final class GeoParsedResult extends ParsedResult {
    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append("0.0, 0.0");
        return sb.toString();
    }
}
