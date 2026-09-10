package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f31921b = Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("841"), com.mbridge.msdk.config.component.common.util.c.c("842"), com.mbridge.msdk.config.component.common.util.c.c("843"), com.mbridge.msdk.config.component.common.util.c.c("844"), com.mbridge.msdk.config.component.common.util.c.c("845"), com.mbridge.msdk.config.component.common.util.c.c("846"), com.mbridge.msdk.config.component.common.util.c.c("847"), com.mbridge.msdk.config.component.common.util.c.c("848"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31922a;

    public n(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31922a = cVar;
    }

    private Object a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            return Double.valueOf(d10);
        }
        return d10 == Math.floor(d10) ? Integer.valueOf((int) d10) : Double.valueOf(b(d10));
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008c A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00da A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0103 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0108 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0114 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0121 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012f A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013c A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0141 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0166 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x016b A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        double dDoubleValue;
        double dDoubleValue2;
        Object obj2;
        Object obj3;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            dDoubleValue = obj instanceof Number ? ((Number) obj).doubleValue() : 0.0d;
            try {
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    dDoubleValue = Double.parseDouble(obj.toString());
                }
                if (list == null || list.isEmpty()) {
                    dDoubleValue2 = 0.0d;
                    obj3 = null;
                } else {
                    obj3 = list.get(0);
                    try {
                        dDoubleValue2 = obj3 instanceof Number ? ((Number) obj3).doubleValue() : 0.0d;
                        try {
                            if ((obj3 instanceof String) && !TextUtils.isEmpty(obj3.toString())) {
                                dDoubleValue2 = Double.parseDouble(obj3.toString());
                            }
                        } catch (Exception e10) {
                            obj2 = obj3;
                            e = e10;
                            q0.b("MathOperator", e.getMessage(), e);
                            obj3 = obj2;
                        }
                    } catch (Exception e11) {
                        obj2 = obj3;
                        e = e11;
                        dDoubleValue2 = 0.0d;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                dDoubleValue2 = 0.0d;
                obj2 = null;
                q0.b("MathOperator", e.getMessage(), e);
                obj3 = obj2;
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("841"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.abs(dDoubleValue)));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("842"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.ceil(dDoubleValue)));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("843"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.floor(dDoubleValue)));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("844"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.round(dDoubleValue)));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("845"))) {
                    return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.pow(dDoubleValue, dDoubleValue2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("846"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.sqrt(dDoubleValue)));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("847"))) {
                    return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.atan2(dDoubleValue, dDoubleValue2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
                }
                if (dDoubleValue2 > 0.0d) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf((int) (Math.random() * ((double) ((int) Math.floor(dDoubleValue2))))));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        } catch (Exception e13) {
            e = e13;
            dDoubleValue = 0.0d;
            dDoubleValue2 = 0.0d;
        }
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("841"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.abs(dDoubleValue)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("842"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.ceil(dDoubleValue)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("843"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.floor(dDoubleValue)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("844"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.round(dDoubleValue)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("845"))) {
                if (obj3 != null) {
                }
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("846"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.sqrt(dDoubleValue)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("847"))) {
                if (obj3 != null) {
                }
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            if (dDoubleValue2 > 0.0d) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf((int) (Math.random() * ((double) ((int) Math.floor(dDoubleValue2))))));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e14) {
            q0.b("MathOperator", e14.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a(str)) {
            return b(str, obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("841")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("842")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("843")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("844")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("845")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("846")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("847")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"));
    }
}
