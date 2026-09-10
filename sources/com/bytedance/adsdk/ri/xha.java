package com.bytedance.adsdk.ri;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Number ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberRi = ri(objArr[0]);
        int iRi = ri(objArr[1], 0);
        boolean zRi = ri(objArr[2], false);
        if (numberRi == null) {
            return null;
        }
        return ri(numberRi, iRi, zRi);
    }

    public Number ri(Number number, int i, boolean z) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || attabal.attabal(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }

    private Number ri(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int ri(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    private boolean ri(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
    }
}
