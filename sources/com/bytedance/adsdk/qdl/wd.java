package com.bytedance.adsdk.qdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wd implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Number qdl(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberQdl = qdl(objArr[0]);
        int iQdl = qdl(objArr[1], 0);
        boolean zQdl = qdl(objArr[2], false);
        if (numberQdl == null) {
            return null;
        }
        return qdl(numberQdl, iQdl, zQdl);
    }

    public Number qdl(Number number, int i2, boolean z2) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i2, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z2 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        if (iMax != 0) {
            if ((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).scale() > 0) {
                return Double.valueOf(scale.doubleValue());
            }
        }
        return Long.valueOf(scale.longValue());
    }

    private Number qdl(Object obj) {
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

    private int qdl(Object obj, int i2) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    private boolean qdl(Object obj, boolean z2) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z2;
    }
}
