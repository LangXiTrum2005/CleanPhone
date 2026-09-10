package p002kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.ads.RequestConfiguration;
import gibeonite.attabal;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt___CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0016\u0010\u0016\u001a\u00020\u0005\"\b\b\u0000\u0010\r*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "apical", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "cutely", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "wireman", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnnotationConstructorCallerKt {
    public static final Object apical(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof wireman) {
            obj = attabal.saneness((wireman) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof wireman[]) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                wireman[] wiremanVarArr = (wireman[]) obj;
                ArrayList arrayList = new ArrayList(wiremanVarArr.length);
                for (wireman wiremanVar : wiremanVarArr) {
                    arrayList.add(attabal.saneness(wiremanVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    public static final <T> boolean beachfront(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zWireman;
        boolean z;
        wireman wiremanVarAttabal;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (Intrinsics.wireman((annotation == null || (wiremanVarAttabal = attabal.attabal(annotation)) == null) ? null : attabal.saneness(wiremanVarAttabal), cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = true;
            } else {
                for (Method method : list2) {
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zWireman = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zWireman = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zWireman = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zWireman = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zWireman = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zWireman = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zWireman = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zWireman = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zWireman = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zWireman = Intrinsics.wireman(obj2, objInvoke);
                    }
                    if (!zWireman) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final int competently(taiyuan<Integer> taiyuanVar) {
        return taiyuanVar.getValue().intValue();
    }

    public static final Void cutely(int i, String str, Class<?> cls) {
        wireman wiremanVarSaneness;
        String strImpromptu;
        if (Intrinsics.wireman(cls, Class.class)) {
            wiremanVarSaneness = polloi.saneness(wireman.class);
        } else {
            wiremanVarSaneness = (cls.isArray() && Intrinsics.wireman(cls.getComponentType(), Class.class)) ? polloi.saneness(wireman[].class) : attabal.marial(cls);
        }
        if (Intrinsics.wireman(wiremanVarSaneness.impromptu(), polloi.saneness(Object[].class).impromptu())) {
            StringBuilder sb = new StringBuilder();
            sb.append(wiremanVarSaneness.impromptu());
            sb.append('<');
            Class<?> componentType = attabal.saneness(wiremanVarSaneness).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            sb.append(attabal.marial(componentType).impromptu());
            sb.append('>');
            strImpromptu = sb.toString();
        } else {
            strImpromptu = wiremanVarSaneness.impromptu();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + strImpromptu);
    }

    public static final String impromptu(taiyuan<String> taiyuanVar) {
        return taiyuanVar.getValue();
    }

    public static /* synthetic */ Object marial(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(dovishness.gintrap(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return wireman(cls, map, list);
    }

    public static final Object taiyuan(Class annotationClass, Map values, taiyuan toString$delegate, taiyuan hashCode$delegate, List methods, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(annotationClass, "$annotationClass");
        Intrinsics.checkNotNullParameter(values, "$values");
        Intrinsics.checkNotNullParameter(toString$delegate, "$toString$delegate");
        Intrinsics.checkNotNullParameter(hashCode$delegate, "$hashCode$delegate");
        Intrinsics.checkNotNullParameter(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(competently(hashCode$delegate));
                }
            } else if (name.equals("toString")) {
                return impromptu(toString$delegate);
            }
        }
        if (Intrinsics.wireman(name, "equals") && objArr != null && objArr.length == 1) {
            Intrinsics.beachfront(objArr);
            return Boolean.valueOf(beachfront(annotationClass, methods, values, p002kotlin.collections.polloi.czestochowa(objArr)));
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(p002kotlin.collections.polloi.unconsolidated(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public static final <T> T wireman(final Class<T> annotationClass, final Map<String, ? extends Object> values, List<Method> methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        taiyuan taiyuanVarSaneness = saneness.saneness(new Function0<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Integer invoke() {
                int iHashCode;
                Iterator<T> it = values.entrySet().iterator();
                int iHashCode2 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            }
        });
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new attabal(annotationClass, values, saneness.saneness(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final String invoke() throws IOException {
                Class<T> cls = annotationClass;
                Map<String, Object> map = values;
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(cls.getCanonicalName());
                CollectionsKt___CollectionsKt.czestochowa(map.entrySet(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                        return invoke2((Map.Entry<String, ? extends Object>) entry);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final CharSequence invoke2(Map.Entry<String, ? extends Object> entry) {
                        String string;
                        Intrinsics.checkNotNullParameter(entry, "entry");
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof boolean[]) {
                            string = Arrays.toString((boolean[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof char[]) {
                            string = Arrays.toString((char[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof byte[]) {
                            string = Arrays.toString((byte[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof short[]) {
                            string = Arrays.toString((short[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof int[]) {
                            string = Arrays.toString((int[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof float[]) {
                            string = Arrays.toString((float[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof long[]) {
                            string = Arrays.toString((long[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof double[]) {
                            string = Arrays.toString((double[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else if (value instanceof Object[]) {
                            string = Arrays.toString((Object[]) value);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        } else {
                            string = value.toString();
                        }
                        return key + '=' + string;
                    }
                });
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }), taiyuanVarSaneness, methods));
        Intrinsics.competently(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }
}
