package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* JADX INFO: loaded from: classes6.dex */
public class mi implements TypeParser<Double> {
    @Override // com.startapp.json.TypeParser
    public final Double parse(Class<Double> cls, Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(Boolean.TRUE.equals(obj) ? 1.0d : 0.0d);
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
            }
        }
        return Double.valueOf(0.0d);
    }
}
