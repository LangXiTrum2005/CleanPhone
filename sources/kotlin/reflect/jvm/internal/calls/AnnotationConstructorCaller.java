package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnnotationConstructorCaller implements Caller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CallMode f43426c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f43427e;
    public final ArrayList f;
    public final ArrayList g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallMode {
        public static final CallMode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CallMode f43428Y;
        public static final /* synthetic */ CallMode[] Z;

        static {
            CallMode callMode = new CallMode("CALL_BY_NAME", 0);
            X = callMode;
            CallMode callMode2 = new CallMode("POSITIONAL_CALL", 1);
            f43428Y = callMode2;
            Z = new CallMode[]{callMode, callMode2};
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) Z.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Origin {
        public static final Origin X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Origin f43429Y;
        public static final /* synthetic */ Origin[] Z;

        static {
            Origin origin = new Origin("JAVA", 0);
            X = origin;
            Origin origin2 = new Origin("KOTLIN", 1);
            f43429Y = origin2;
            Z = new Origin[]{origin, origin2};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) Z.clone();
        }
    }

    public AnnotationConstructorCaller(Class jClass, ArrayList arrayList, CallMode callMode, Origin origin, List methods) {
        Intrinsics.f(jClass, "jClass");
        Intrinsics.f(methods, "methods");
        this.f43424a = jClass;
        this.f43425b = arrayList;
        this.f43426c = callMode;
        this.d = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f43427e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            Intrinsics.e(it3, "it");
            List list3 = ReflectClassUtilKt.f43693a;
            Class<?> cls = (Class) ReflectClassUtilKt.f43695c.get(it3);
            if (cls != null) {
                it3 = cls;
            }
            arrayList3.add(it3);
        }
        this.f = arrayList3;
        List list4 = this.d;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.n(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Method) it4.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.f43426c == CallMode.f43428Y && origin == Origin.X && !CollectionsKt.K(this.f43425b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public final List getD() {
        return this.f43427e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Member getF43435a() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[LOOP:1: B:24:0x0065->B:25:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0056, please report this as an issue */
    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] args) {
        Class cls;
        Object[] objArr;
        ArrayList arrayList;
        int i2;
        String strK;
        Intrinsics.f(args, "args");
        Caller.DefaultImpls.a(this, args);
        ArrayList arrayList2 = new ArrayList(args.length);
        int length = args.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList3 = this.f43425b;
            if (i3 >= length) {
                return AnnotationConstructorCallerKt.a(this.f43424a, MapsKt.p(CollectionsKt.n0(arrayList3, arrayList2)), this.d);
            }
            Object array = args[i3];
            int i5 = i4 + 1;
            ArrayList arrayList4 = this.f;
            if (array != null) {
                cls = (Class) arrayList4.get(i4);
                if (array instanceof Class) {
                    if (array instanceof KClass) {
                        array = JvmClassMappingKt.b((KClass) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (!(objArr instanceof Class[])) {
                            array = null;
                        } else if (objArr instanceof KClass[]) {
                            Intrinsics.d(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            KClass[] kClassArr = (KClass[]) array;
                            arrayList = new ArrayList(kClassArr.length);
                            while (i2 < r14) {
                                arrayList.add(JvmClassMappingKt.b(kClass));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                } else {
                    array = null;
                }
            } else if (this.f43426c == CallMode.X) {
                array = this.g.get(i4);
            } else {
                cls = (Class) arrayList4.get(i4);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof KClass) {
                        array = JvmClassMappingKt.b((KClass) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (!(objArr instanceof Class[])) {
                            array = null;
                        } else if (objArr instanceof KClass[]) {
                            Intrinsics.d(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            KClass[] kClassArr2 = (KClass[]) array;
                            arrayList = new ArrayList(kClassArr2.length);
                            for (KClass kClass : kClassArr2) {
                                arrayList.add(JvmClassMappingKt.b(kClass));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList3.get(i4);
                Class cls2 = (Class) arrayList4.get(i4);
                KClass kClassB = Intrinsics.a(cls2, Class.class) ? Reflection.f43333a.b(KClass.class) : (cls2.isArray() && Intrinsics.a(cls2.getComponentType(), Class.class)) ? Reflection.f43333a.b(KClass[].class) : JvmClassMappingKt.e(cls2);
                if (Intrinsics.a(kClassB.k(), Reflection.f43333a.b(Object[].class).k())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(kClassB.k());
                    sb.append('<');
                    Class<?> componentType = JvmClassMappingKt.b(kClassB).getComponentType();
                    Intrinsics.e(componentType, "kotlinClass.java.componentType");
                    sb.append(JvmClassMappingKt.e(componentType).k());
                    sb.append('>');
                    strK = sb.toString();
                } else {
                    strK = kClassB.k();
                }
                throw new IllegalArgumentException("Argument #" + i4 + ' ' + str + " is not of the required type " + strK);
            }
            arrayList2.add(array);
            i3++;
            i4 = i5;
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getReturnType */
    public final Type getF43436b() {
        return this.f43424a;
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode) {
        Origin origin = Origin.f43429Y;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, callMode, origin, arrayList2);
    }
}
