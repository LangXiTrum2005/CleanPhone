package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* JADX INFO: loaded from: classes6.dex */
public class ei implements TypeParser<Long> {
    @Override // com.startapp.json.TypeParser
    public final Long parse(Class<Long> cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(vi.e((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
