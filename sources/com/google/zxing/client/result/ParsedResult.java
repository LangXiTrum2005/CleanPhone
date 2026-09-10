package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ParsedResult {
    public static void b(StringBuilder sb, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
