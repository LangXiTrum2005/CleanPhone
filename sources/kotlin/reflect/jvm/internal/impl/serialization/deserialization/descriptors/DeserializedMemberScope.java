package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializationContext f44456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Implementation f44457c;
    public final NotNullLazyValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NullableLazyValue f44458e;

    public interface Implementation {
        Set a();

        Collection b(Name name, NoLookupLocation noLookupLocation);

        Set c();

        void d(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1);

        Set e();

        Collection f(Name name, NoLookupLocation noLookupLocation);

        TypeAliasDescriptor g(Name name);
    }

    public final class NoReorderImplementation implements Implementation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f44459a;

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            f44459a = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "allProperties", "getAllProperties()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(NoReorderImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set a() {
            return (Set) StorageKt.a(null, f44459a[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Collection collection;
            Intrinsics.f(name, "name");
            return (c().contains(name) && (collection = (Collection) ((Map) StorageKt.a(null, f44459a[7])).get(name)) != null) ? collection : EmptyList.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set c() {
            return (Set) StorageKt.a(null, f44459a[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void d(ArrayList arrayList, DescriptorKindFilter kindFilter, Function1 function1) {
            Intrinsics.f(kindFilter, "kindFilter");
            boolean zA = kindFilter.a(DescriptorKindFilter.j);
            KProperty[] kPropertyArr = f44459a;
            if (zA) {
                for (Object obj : (List) StorageKt.a(null, kPropertyArr[4])) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.e(name, "it.name");
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (kindFilter.a(DescriptorKindFilter.f44334i)) {
                for (Object obj2 : (List) StorageKt.a(null, kPropertyArr[3])) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.e(name2, "it.name");
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set e() {
            new LinkedHashSet();
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection f(Name name, NoLookupLocation noLookupLocation) {
            Collection collection;
            Intrinsics.f(name, "name");
            return (a().contains(name) && (collection = (Collection) ((Map) StorageKt.a(null, f44459a[6])).get(name)) != null) ? collection : EmptyList.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor g(Name name) {
            Intrinsics.f(name, "name");
            return (TypeAliasDescriptor) ((Map) StorageKt.a(null, f44459a[5])).get(name);
        }
    }

    public final class OptimizedImplementation implements Implementation {
        public static final /* synthetic */ KProperty[] j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f44460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f44461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f44462c;
        public final MemoizedFunctionToNotNull d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MemoizedFunctionToNotNull f44463e;
        public final MemoizedFunctionToNullable f;
        public final NotNullLazyValue g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final NotNullLazyValue f44464h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ DeserializedMemberScope f44465i;

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            j = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List functionList, List propertyList, List typeAliasList) {
            Intrinsics.f(functionList, "functionList");
            Intrinsics.f(propertyList, "propertyList");
            Intrinsics.f(typeAliasList, "typeAliasList");
            this.f44465i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name nameB = NameResolverUtilKt.b(deserializedMemberScope.f44456b.f44402b, ((ProtoBuf.Function) ((MessageLite) obj)).g0);
                Object arrayList = linkedHashMap.get(nameB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nameB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f44460a = h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f44465i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name nameB2 = NameResolverUtilKt.b(deserializedMemberScope2.f44456b.f44402b, ((ProtoBuf.Property) ((MessageLite) obj2)).g0);
                Object arrayList2 = linkedHashMap2.get(nameB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(nameB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f44461b = h(linkedHashMap2);
            this.f44465i.f44456b.f44401a.f44393c.getClass();
            DeserializedMemberScope deserializedMemberScope3 = this.f44465i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : typeAliasList) {
                Name nameB3 = NameResolverUtilKt.b(deserializedMemberScope3.f44456b.f44402b, ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).f0);
                Object arrayList3 = linkedHashMap3.get(nameB3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(nameB3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.f44462c = h(linkedHashMap3);
            this.d = this.f44465i.f44456b.f44401a.f44391a.g(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functions$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Name it = (Name) obj4;
                    Intrinsics.f(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.X;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.f44460a;
                    Parser PARSER = ProtoBuf.Function.w0;
                    Intrinsics.e(PARSER, "PARSER");
                    byte[] bArr = (byte[]) linkedHashMap4.get(it);
                    DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.f44465i;
                    Collection<ProtoBuf.Function> collectionV = bArr != null ? SequencesKt.v(SequencesKt.k(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1((AbstractParser) PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope4))) : EmptyList.X;
                    ArrayList arrayList4 = new ArrayList(collectionV.size());
                    for (ProtoBuf.Function it2 : collectionV) {
                        MemberDeserializer memberDeserializer = deserializedMemberScope4.f44456b.f44406i;
                        Intrinsics.e(it2, "it");
                        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptorE = memberDeserializer.e(it2);
                        if (!deserializedMemberScope4.r(deserializedSimpleFunctionDescriptorE)) {
                            deserializedSimpleFunctionDescriptorE = null;
                        }
                        if (deserializedSimpleFunctionDescriptorE != null) {
                            arrayList4.add(deserializedSimpleFunctionDescriptorE);
                        }
                    }
                    deserializedMemberScope4.j(arrayList4, it);
                    return CollectionsKt.b(arrayList4);
                }
            });
            this.f44463e = this.f44465i.f44456b.f44401a.f44391a.g(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$properties$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Name it = (Name) obj4;
                    Intrinsics.f(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.X;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.f44461b;
                    Parser PARSER = ProtoBuf.Property.w0;
                    Intrinsics.e(PARSER, "PARSER");
                    byte[] bArr = (byte[]) linkedHashMap4.get(it);
                    DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.f44465i;
                    Collection<ProtoBuf.Property> collectionV = bArr != null ? SequencesKt.v(SequencesKt.k(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1((AbstractParser) PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope4))) : EmptyList.X;
                    ArrayList arrayList4 = new ArrayList(collectionV.size());
                    for (ProtoBuf.Property it2 : collectionV) {
                        MemberDeserializer memberDeserializer = deserializedMemberScope4.f44456b.f44406i;
                        Intrinsics.e(it2, "it");
                        arrayList4.add(memberDeserializer.f(it2));
                    }
                    deserializedMemberScope4.k(arrayList4, it);
                    return CollectionsKt.b(arrayList4);
                }
            });
            this.f = this.f44465i.f44456b.f44401a.f44391a.h(new Function1<Name, TypeAliasDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    DeserializationContext deserializationContext;
                    ProtoBuf.Type underlyingType;
                    ProtoBuf.Type expandedType;
                    Name it = (Name) obj4;
                    Intrinsics.f(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.X;
                    byte[] bArr = (byte[]) optimizedImplementation.f44462c.get(it);
                    if (bArr == null) {
                        return null;
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.f44465i;
                    ProtoBuf.TypeAlias proto = (ProtoBuf.TypeAlias) ((AbstractParser) ProtoBuf.TypeAlias.q0).c(byteArrayInputStream, deserializedMemberScope4.f44456b.f44401a.f44399p);
                    if (proto == null) {
                        return null;
                    }
                    MemberDeserializer memberDeserializer = deserializedMemberScope4.f44456b.f44406i;
                    memberDeserializer.getClass();
                    Intrinsics.f(proto, "proto");
                    List list = proto.l0;
                    Intrinsics.e(list, "proto.annotationList");
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.CollectionsKt.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        deserializationContext = memberDeserializer.f44415a;
                        if (!zHasNext) {
                            break;
                        }
                        ProtoBuf.Annotation it3 = (ProtoBuf.Annotation) it2.next();
                        Intrinsics.e(it3, "it");
                        arrayList4.add(memberDeserializer.f44416b.a(it3, deserializationContext.f44402b));
                    }
                    Annotations annotationsA = Annotations.Companion.a(arrayList4);
                    DelegatedDescriptorVisibility delegatedDescriptorVisibilityA = ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(proto.e0));
                    LockBasedStorageManager lockBasedStorageManager = deserializationContext.f44401a.f44391a;
                    Name nameB4 = NameResolverUtilKt.b(deserializationContext.f44402b, proto.f0);
                    TypeTable typeTable = deserializationContext.d;
                    DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(lockBasedStorageManager, deserializationContext.f44403c, annotationsA, nameB4, delegatedDescriptorVisibilityA, proto, deserializationContext.f44402b, typeTable, deserializationContext.f44404e, deserializationContext.g);
                    List list3 = proto.g0;
                    Intrinsics.e(list3, "proto.typeParameterList");
                    TypeDeserializer typeDeserializer = deserializationContext.a(deserializedTypeAliasDescriptor, list3, deserializationContext.f44402b, deserializationContext.d, deserializationContext.f44404e, deserializationContext.f).f44405h;
                    List listB = typeDeserializer.b();
                    int i2 = proto.Z;
                    if ((i2 & 4) == 4) {
                        underlyingType = proto.h0;
                        Intrinsics.e(underlyingType, "underlyingType");
                    } else {
                        if ((i2 & 8) != 8) {
                            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                        }
                        underlyingType = typeTable.a(proto.i0);
                    }
                    SimpleType simpleTypeD = typeDeserializer.d(underlyingType, false);
                    int i3 = proto.Z;
                    if ((i3 & 16) == 16) {
                        expandedType = proto.j0;
                        Intrinsics.e(expandedType, "expandedType");
                    } else {
                        if ((i3 & 32) != 32) {
                            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                        }
                        expandedType = typeTable.a(proto.k0);
                    }
                    deserializedTypeAliasDescriptor.H0(listB, simpleTypeD, typeDeserializer.d(expandedType, false));
                    return deserializedTypeAliasDescriptor;
                }
            });
            final DeserializedMemberScope deserializedMemberScope4 = this.f44465i;
            this.g = deserializedMemberScope4.f44456b.f44401a.f44391a.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SetsKt.f(this.X.f44460a.keySet(), deserializedMemberScope4.o());
                }
            });
            final DeserializedMemberScope deserializedMemberScope5 = this.f44465i;
            this.f44464h = deserializedMemberScope5.f44456b.f44401a.f44391a.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SetsKt.f(this.X.f44461b.keySet(), deserializedMemberScope5.p());
                }
            });
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.n(iterable, 10));
                for (AbstractMessageLite abstractMessageLite : iterable) {
                    int serializedSize = abstractMessageLite.getSerializedSize();
                    int iF = CodedOutputStream.f(serializedSize) + serializedSize;
                    if (iF > 4096) {
                        iF = 4096;
                    }
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(byteArrayOutputStream, iF);
                    codedOutputStreamJ.v(serializedSize);
                    abstractMessageLite.b(codedOutputStreamJ);
                    codedOutputStreamJ.i();
                    arrayList.add(Unit.f43263a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set a() {
            return (Set) StorageKt.a(this.g, j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.f(name, "name");
            return !c().contains(name) ? EmptyList.X : (Collection) this.f44463e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set c() {
            return (Set) StorageKt.a(this.f44464h, j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void d(ArrayList arrayList, DescriptorKindFilter kindFilter, Function1 function1) {
            NoLookupLocation noLookupLocation = NoLookupLocation.e0;
            Intrinsics.f(kindFilter, "kindFilter");
            boolean zA = kindFilter.a(DescriptorKindFilter.j);
            MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.X;
            if (zA) {
                Set<Name> setC = c();
                ArrayList arrayList2 = new ArrayList();
                for (Name name : setC) {
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList2.addAll(b(name, noLookupLocation));
                    }
                }
                kotlin.collections.CollectionsKt.a0(arrayList2, nameAndTypeMemberComparator);
                arrayList.addAll(arrayList2);
            }
            if (kindFilter.a(DescriptorKindFilter.f44334i)) {
                Set<Name> setA = a();
                ArrayList arrayList3 = new ArrayList();
                for (Name name2 : setA) {
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList3.addAll(f(name2, noLookupLocation));
                    }
                }
                kotlin.collections.CollectionsKt.a0(arrayList3, nameAndTypeMemberComparator);
                arrayList.addAll(arrayList3);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set e() {
            return this.f44462c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection f(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.f(name, "name");
            return !a().contains(name) ? EmptyList.X : (Collection) this.d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor g(Name name) {
            Intrinsics.f(name, "name");
            return (TypeAliasDescriptor) this.f.invoke(name);
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public DeserializedMemberScope(DeserializationContext c2, List functionList, List propertyList, List typeAliasList, final Function0 function0) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(functionList, "functionList");
        Intrinsics.f(propertyList, "propertyList");
        Intrinsics.f(typeAliasList, "typeAliasList");
        this.f44456b = c2;
        DeserializationComponents deserializationComponents = c2.f44401a;
        deserializationComponents.f44393c.getClass();
        this.f44457c = new OptimizedImplementation(this, functionList, propertyList, typeAliasList);
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f44391a;
        this.d = lockBasedStorageManager.a(new Function0<Set<? extends Name>>(function0) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            public final /* synthetic */ Lambda X;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.X = (Lambda) function0;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kotlin.collections.CollectionsKt.l0((Iterable) this.X.invoke());
            }
        });
        this.f44458e = lockBasedStorageManager.b(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classifierNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedMemberScope deserializedMemberScope = this.X;
                Set setN = deserializedMemberScope.n();
                if (setN == null) {
                    return null;
                }
                return SetsKt.f(SetsKt.f(deserializedMemberScope.m(), deserializedMemberScope.f44457c.e()), setN);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.f44457c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return this.f44457c.b(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.f44457c.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        return this.f44457c.f(name, (NoLookupLocation) lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        KProperty p2 = f[1];
        NullableLazyValue nullableLazyValue = this.f44458e;
        Intrinsics.f(nullableLazyValue, "<this>");
        Intrinsics.f(p2, "p");
        return (Set) nullableLazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        if (q(name)) {
            return this.f44456b.f44401a.b(l(name));
        }
        Implementation implementation = this.f44457c;
        if (implementation.e().contains(name)) {
            return implementation.g(name);
        }
        return null;
    }

    public abstract void h(ArrayList arrayList, Function1 function1);

    public final Collection i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(DescriptorKindFilter.f)) {
            h(arrayList, function1);
        }
        Implementation implementation = this.f44457c;
        implementation.d(arrayList, kindFilter, function1);
        if (kindFilter.a(DescriptorKindFilter.f44335l)) {
            for (Name name : m()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.a(arrayList, this.f44456b.f44401a.b(l(name)));
                }
            }
        }
        if (kindFilter.a(DescriptorKindFilter.g)) {
            for (Name name2 : implementation.e()) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    CollectionsKt.a(arrayList, implementation.g(name2));
                }
            }
        }
        return CollectionsKt.b(arrayList);
    }

    public void j(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
    }

    public void k(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
    }

    public abstract ClassId l(Name name);

    public final Set m() {
        return (Set) StorageKt.a(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(Name name) {
        Intrinsics.f(name, "name");
        return m().contains(name);
    }

    public boolean r(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
        return true;
    }
}
