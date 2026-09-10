package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WeightedChoice implements Serializable {
    private static final long serialVersionUID = 8011948312180032586L;
    private final String[] keys;
    private final int[] weights;

    public static class Parser implements TypeParser<WeightedChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public WeightedChoice parse(Class<WeightedChoice> cls, Object obj) {
            if (obj instanceof String) {
                return new WeightedChoice(new String[]{(String) obj}, new int[]{1});
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            String[] strArr = new String[length];
            int[] iArr = new int[length];
            Iterator<String> itKeys = jSONObject.keys();
            int i2 = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                strArr[i2] = next;
                iArr[i2] = jSONObject.optInt(next, 0);
                i2++;
            }
            return new WeightedChoice(strArr, iArr);
        }
    }

    public WeightedChoice(String[] strArr, int[] iArr) {
        this.keys = strArr;
        this.weights = iArr;
    }

    public final String a() {
        int[] iArr = this.weights;
        WeakHashMap weakHashMap = vi.f41589a;
        int length = iArr.length;
        si siVar = vi.f41592e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > 0) {
                i2 += i5;
                i3++;
                iArr2[i3] = i2 - 1;
                iArr3[i3] = i4;
            }
        }
        for (int i6 = i3 + 1; i6 < length; i6++) {
            iArr2[i6] = ((i2 + i6) - i3) - 1;
            iArr3[i6] = -1;
        }
        siVar.getClass();
        Random random = vi.d;
        if (random == null) {
            random = new Random();
            vi.d = random;
        }
        int iBinarySearch = Arrays.binarySearch(iArr2, random.nextInt(i2));
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        }
        int i7 = iArr3[iBinarySearch];
        if (i7 < 0) {
            return null;
        }
        String[] strArr = this.keys;
        if (i7 < strArr.length) {
            return strArr[i7];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WeightedChoice weightedChoice = (WeightedChoice) obj;
            if (Arrays.equals(this.keys, weightedChoice.keys) && Arrays.equals(this.weights, weightedChoice.weights)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.keys, this.weights};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
