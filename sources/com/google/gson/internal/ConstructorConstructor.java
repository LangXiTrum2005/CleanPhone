package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ConstructorConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21212c;

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$10, reason: invalid class name */
    class AnonymousClass10 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new TreeSet();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$11, reason: invalid class name */
    class AnonymousClass11 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$12, reason: invalid class name */
    class AnonymousClass12 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$13, reason: invalid class name */
    class AnonymousClass13 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$14, reason: invalid class name */
    class AnonymousClass14 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$15, reason: invalid class name */
    class AnonymousClass15 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$16, reason: invalid class name */
    class AnonymousClass16 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new TreeMap();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$17, reason: invalid class name */
    class AnonymousClass17 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ConstructorConstructor$18, reason: invalid class name */
    class AnonymousClass18 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object construct() {
            return new LinkedTreeMap(true);
        }
    }

    public ConstructorConstructor(Map map, boolean z2, List list) {
        this.f21210a = map;
        this.f21211b = z2;
        this.f21212c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    public final ObjectConstructor b(TypeToken typeToken) {
        ObjectConstructor<Object> objectConstructor;
        ObjectConstructor<Object> objectConstructor2;
        final String str;
        final Type type = typeToken.getType();
        final Class rawType = typeToken.getRawType();
        Map map = this.f21210a;
        final InstanceCreator instanceCreator = (InstanceCreator) map.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.1
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator.a();
                }
            };
        }
        final InstanceCreator instanceCreator2 = (InstanceCreator) map.get(rawType);
        if (instanceCreator2 != null) {
            return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.2
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator2.a();
                }
            };
        }
        ObjectConstructor anonymousClass18 = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            objectConstructor = new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.5
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return EnumSet.noneOf((Class) type3);
                    }
                    throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                }
            };
        } else {
            objectConstructor = rawType == EnumMap.class ? new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.6
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        throw new JsonIOException("Invalid EnumMap type: " + type2.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return new EnumMap((Class) type3);
                    }
                    throw new JsonIOException("Invalid EnumMap type: " + type2.toString());
                }
            } : null;
        }
        if (objectConstructor != null) {
            return objectConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResultB = ReflectionAccessFilterHelper.b(rawType, this.f21212c);
        boolean zIsAbstract = Modifier.isAbstract(rawType.getModifiers());
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilter.FilterResult.X;
        if (zIsAbstract) {
            objectConstructor2 = null;
        } else {
            try {
                final Constructor declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                if (filterResultB != filterResult && (!ReflectionAccessFilterHelper.AccessChecker.f21236a.a(null, declaredConstructor) || (filterResultB == ReflectionAccessFilter.FilterResult.e0 && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    final String str2 = "Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                    objectConstructor2 = new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.7
                        @Override // com.google.gson.internal.ObjectConstructor
                        public final Object construct() {
                            throw new JsonIOException(str2);
                        }
                    };
                } else if (filterResultB == filterResult) {
                    ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f21312a;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e2) {
                        str = "Failed making constructor '" + ReflectionHelper.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage();
                    }
                    if (str != null) {
                        objectConstructor2 = new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.8
                            @Override // com.google.gson.internal.ObjectConstructor
                            public final Object construct() {
                                throw new JsonIOException(str);
                            }
                        };
                    } else {
                        objectConstructor2 = new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.9
                            @Override // com.google.gson.internal.ObjectConstructor
                            public final Object construct() {
                                Constructor constructor = declaredConstructor;
                                try {
                                    return constructor.newInstance(new Object[0]);
                                } catch (IllegalAccessException e3) {
                                    ReflectionHelper.RecordHelper recordHelper2 = ReflectionHelper.f21312a;
                                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                                } catch (InstantiationException e4) {
                                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e4);
                                } catch (InvocationTargetException e5) {
                                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e5.getCause());
                                }
                            }
                        };
                    }
                } else {
                    objectConstructor2 = new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.9
                        @Override // com.google.gson.internal.ObjectConstructor
                        public final Object construct() {
                            Constructor constructor = declaredConstructor;
                            try {
                                return constructor.newInstance(new Object[0]);
                            } catch (IllegalAccessException e3) {
                                ReflectionHelper.RecordHelper recordHelper2 = ReflectionHelper.f21312a;
                                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                            } catch (InstantiationException e4) {
                                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e4);
                            } catch (InvocationTargetException e5) {
                                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e5.getCause());
                            }
                        }
                    };
                }
            } catch (NoSuchMethodException unused) {
                objectConstructor2 = null;
            }
        }
        if (objectConstructor2 != null) {
            return objectConstructor2;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                anonymousClass18 = new AnonymousClass10();
            } else if (Set.class.isAssignableFrom(rawType)) {
                anonymousClass18 = new AnonymousClass11();
            } else {
                anonymousClass18 = Queue.class.isAssignableFrom(rawType) ? new AnonymousClass12() : new AnonymousClass13();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                anonymousClass18 = new AnonymousClass14();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                anonymousClass18 = new AnonymousClass15();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                anonymousClass18 = new AnonymousClass16();
            } else {
                anonymousClass18 = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new AnonymousClass18() : new AnonymousClass17();
            }
        }
        if (anonymousClass18 != null) {
            return anonymousClass18;
        }
        final String strA = a(rawType);
        if (strA != null) {
            return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.3
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    throw new JsonIOException(strA);
                }
            };
        }
        if (filterResultB != filterResult) {
            final String str3 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
            return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.4
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    throw new JsonIOException(str3);
                }
            };
        }
        if (this.f21211b) {
            return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.19
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    Class cls = rawType;
                    try {
                        return UnsafeAllocator.f21239a.a(cls);
                    } catch (Exception e3) {
                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e3);
                    }
                }
            };
        }
        final String str4 = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        return new ObjectConstructor<Object>() { // from class: com.google.gson.internal.ConstructorConstructor.20
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object construct() {
                throw new JsonIOException(str4);
            }
        };
    }

    public final String toString() {
        return this.f21210a.toString();
    }
}
