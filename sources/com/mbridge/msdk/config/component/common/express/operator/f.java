package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f31906b = Arrays.asList("==", "!=", ">=", "<=", ">", "<");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31907a;

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31907a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        final int i10 = 0;
        BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction = null;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        str.getClass();
        final int i11 = 5;
        final int i12 = 4;
        final int i13 = 3;
        final int i14 = 2;
        final int i15 = 1;
        switch (str) {
            case "<":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i11) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
            case ">":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i12) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
            case "!=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i13) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
            case "<=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i14) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
            case "==":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i15) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
            case ">=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i10) {
                            case 0:
                                return f.c(comparable, comparable2);
                            case 1:
                                return f.a(comparable, comparable2);
                            case 2:
                                return f.d(comparable, comparable2);
                            case 3:
                                return f.b(comparable, comparable2);
                            case 4:
                                return f.e(comparable, comparable2);
                            default:
                                return f.f(comparable, comparable2);
                        }
                    }
                };
                break;
        }
        return biFunction == null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f31906b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.equals(comparable2));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2, BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction) {
        Object objValueOf;
        Object objValueOf2;
        if (obj != null && obj2 != null) {
            if (obj.getClass().equals(obj2.getClass())) {
                objValueOf = obj;
                objValueOf2 = obj2;
            } else {
                Object[] objArrA = a(obj, obj2);
                if (objArrA != null) {
                    objValueOf = objArrA[0];
                    objValueOf2 = objArrA[1];
                } else {
                    q0.b("ComparisonOperator", "Type conversion failed for comparison: " + obj.getClass().getSimpleName() + " vs " + obj2.getClass().getSimpleName());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
            if ((objValueOf instanceof Comparable) && (objValueOf2 instanceof Comparable)) {
                try {
                    objValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
                    objValueOf2 = Integer.valueOf(Integer.parseInt(String.valueOf(obj2)));
                } catch (Exception unused) {
                }
                try {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(biFunction.apply((Comparable) objValueOf, (Comparable) objValueOf2));
                } catch (Exception e10) {
                    q0.b("ComparisonOperator", e10.getMessage(), e10);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(obj, obj2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(!comparable.equals(comparable2));
    }

    private Number b(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            if (str.contains(".")) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private Boolean a(Object obj, Object obj2, String str) {
        str.getClass();
        if (str.equals("!=")) {
            return Boolean.valueOf(obj != obj2);
        }
        if (str.equals("==")) {
            return Boolean.valueOf(obj == obj2);
        }
        return null;
    }

    private Boolean a(Comparable<Object> comparable, Comparable<Object> comparable2, String str) {
        str.getClass();
        switch (str) {
            case "<":
                return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
            case ">":
                return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
            case "!=":
                return Boolean.valueOf(comparable.compareTo(comparable2) != 0);
            case "<=":
                return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
            case "==":
                return Boolean.valueOf(comparable.compareTo(comparable2) == 0);
            case ">=":
                return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
            default:
                return null;
        }
    }

    private Object[] a(Object obj, Object obj2) {
        try {
            if (a(obj) && a(obj2)) {
                return a((Number) obj, (Number) obj2);
            }
            if (a(obj) && (obj2 instanceof String)) {
                Number number = (Number) obj;
                Number numberB = b((String) obj2);
                if (numberB != null) {
                    return a(number, numberB);
                }
                return null;
            }
            if ((obj instanceof String) && a(obj2)) {
                Number numberB2 = b((String) obj);
                Number number2 = (Number) obj2;
                if (numberB2 != null) {
                    return a(numberB2, number2);
                }
                return null;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof String)) {
                Boolean bool = (Boolean) obj;
                Boolean boolA = a((String) obj2);
                if (boolA != null) {
                    return new Object[]{bool, boolA};
                }
                return null;
            }
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return null;
            }
            Boolean boolA2 = a((String) obj);
            Boolean bool2 = (Boolean) obj2;
            if (boolA2 != null) {
                return new Object[]{boolA2, bool2};
            }
            return null;
        } catch (Exception e10) {
            q0.b("ComparisonOperator", "Type conversion error: " + e10.getMessage(), e10);
            return null;
        }
    }

    private boolean a(Object obj) {
        return obj instanceof Number;
    }

    private Boolean a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.toLowerCase().trim();
        if (!com.ironsource.mediationsdk.metadata.a.f29610g.equals(strTrim) && !"1".equals(strTrim) && !"yes".equals(strTrim)) {
            if ("false".equals(strTrim) || "0".equals(strTrim) || "no".equals(strTrim)) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    private Object[] a(Number number, Number number2) {
        if (a(number) && a(number2)) {
            return new Object[]{Long.valueOf(number.longValue()), Long.valueOf(number2.longValue())};
        }
        return new Object[]{Double.valueOf(number.doubleValue()), Double.valueOf(number2.doubleValue())};
    }

    private boolean a(Number number) {
        return (number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte);
    }
}
