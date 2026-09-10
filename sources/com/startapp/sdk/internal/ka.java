package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ka implements TypeParser<int[][]> {
    @Override // com.startapp.json.TypeParser
    public final int[][] parse(Class<int[][]> cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            WeakHashMap weakHashMap = vi.f41589a;
            if (str != null) {
                try {
                    return vi.f(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
