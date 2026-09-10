package kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0016\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "hashCode", "", "toString", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnnotationConstructorCallerKt {
    public static final Object a(final Class annotationClass, final Map map, final List methods) {
        Intrinsics.f(annotationClass, "annotationClass");
        Intrinsics.f(methods, "methods");
        final Lazy lazyB = LazyKt.b(new Function0<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iHashCode;
                int iHashCode2 = 0;
                for (Map.Entry entry : map.entrySet()) {
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
        final Lazy lazyB2 = LazyKt.b(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(annotationClass.getCanonicalName());
                CollectionsKt.C(map.entrySet(), sb, ", ", "(", ")", AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1.X, 48);
                String string = sb.toString();
                Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        });
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new InvocationHandler(annotationClass, map, lazyB2, lazyB, methods) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class f43430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map f43431b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Lazy f43432c;
            public final Lazy d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final List f43433e;

            {
                this.f43430a = annotationClass;
                this.f43431b = map;
                this.f43432c = lazyB2;
                this.d = lazyB;
                this.f43433e = methods;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
                boolean zA;
                boolean z2;
                Class annotationClass2 = this.f43430a;
                Intrinsics.f(annotationClass2, "$annotationClass");
                Map map2 = this.f43431b;
                Lazy lazy = this.f43432c;
                Lazy lazy2 = this.d;
                List methods2 = this.f43433e;
                Intrinsics.f(methods2, "$methods");
                String name = method.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != -1776922004) {
                        if (iHashCode != 147696667) {
                            if (iHashCode == 1444986633 && name.equals("annotationType")) {
                                return annotationClass2;
                            }
                        } else if (name.equals("hashCode")) {
                            return Integer.valueOf(((Number) lazy2.getX()).intValue());
                        }
                    } else if (name.equals("toString")) {
                        return (String) lazy.getX();
                    }
                }
                boolean z3 = false;
                if (!Intrinsics.a(name, "equals") || objArr == null || objArr.length != 1) {
                    if (map2.containsKey(name)) {
                        return map2.get(name);
                    }
                    StringBuilder sb = new StringBuilder("Method is not supported: ");
                    sb.append(method);
                    sb.append(" (args: ");
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    sb.append(ArraysKt.M(objArr));
                    sb.append(')');
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                Object objK = ArraysKt.K(objArr);
                Annotation annotation = objK instanceof Annotation ? (Annotation) objK : null;
                if (Intrinsics.a(annotation != null ? JvmClassMappingKt.b(JvmClassMappingKt.a(annotation)) : null, annotationClass2)) {
                    List list = methods2;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                            Method method2 = (Method) it.next();
                            Object obj2 = map2.get(method2.getName());
                            Object objInvoke = method2.invoke(objK, new Object[0]);
                            if (obj2 instanceof boolean[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                            } else if (obj2 instanceof char[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                                zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                            } else if (obj2 instanceof byte[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                            } else if (obj2 instanceof short[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                            } else if (obj2 instanceof int[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                                zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                            } else if (obj2 instanceof float[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                            } else if (obj2 instanceof long[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                                zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                            } else if (obj2 instanceof double[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                            } else if (obj2 instanceof Object[]) {
                                Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                            } else {
                                zA = Intrinsics.a(obj2, objInvoke);
                            }
                            if (!zA) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    if (z2) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        });
        Intrinsics.d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }
}
