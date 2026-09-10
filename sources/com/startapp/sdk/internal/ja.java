package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class ja implements TypeParser<int[]> {
    @Override // com.startapp.json.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int i2;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        int[] iArr = null;
        if (obj instanceof String) {
            WeakHashMap weakHashMap = vi.f41589a;
            String[] strArrSplit = ((String) obj).split(",");
            int length = strArrSplit.length;
            int[] iArr2 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    iArr2[i3] = Integer.parseInt(strArrSplit[i3].trim());
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return iArr2;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            int length2 = jSONArray.length();
            iArr = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                Object objOpt = jSONArray.opt(i4);
                if (objOpt instanceof Number) {
                    iArr[i4] = ((Number) objOpt).intValue();
                } else if (objOpt instanceof String) {
                    String str = (String) objOpt;
                    WeakHashMap weakHashMap2 = vi.f41589a;
                    if (str != null) {
                        try {
                            i2 = Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 0;
                    }
                    iArr[i4] = i2;
                }
            }
        }
        return iArr;
    }
}
