package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    public final ProtoBuf.Class f0;
    public final BinaryVersion g0;
    public final SourceElement h0;
    public final ClassId i0;
    public final Modality j0;
    public final DelegatedDescriptorVisibility k0;
    public final ClassKind l0;
    public final DeserializationContext m0;
    public final MemberScopeImpl n0;
    public final DeserializedClassTypeConstructor o0;
    public final ScopesHolderForClass p0;
    public final EnumEntryClassDescriptors q0;
    public final DeclarationDescriptor r0;
    public final NullableLazyValue s0;
    public final NotNullLazyValue t0;
    public final NullableLazyValue u0;
    public final NotNullLazyValue v0;
    public final NullableLazyValue w0;
    public final ProtoContainer.Class x0;
    public final Annotations y0;

    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        public final KotlinTypeRefiner g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final NotNullLazyValue f44446h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final NotNullLazyValue f44447i;
        public final /* synthetic */ DeserializedClassDescriptor j;

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.j = deserializedClassDescriptor;
            DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
            ProtoBuf.Class r0 = deserializedClassDescriptor.f0;
            List list = r0.r0;
            Intrinsics.e(list, "classProto.functionList");
            List list2 = r0.s0;
            Intrinsics.e(list2, "classProto.propertyList");
            List list3 = r0.t0;
            Intrinsics.e(list3, "classProto.typeAliasList");
            List list4 = r0.l0;
            Intrinsics.e(list4, "classProto.nestedClassNameList");
            List list5 = list4;
            NameResolver nameResolver = deserializedClassDescriptor.m0.f44402b;
            final ArrayList arrayList = new ArrayList(CollectionsKt.n(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.b(nameResolver, ((Number) it.next()).intValue()));
            }
            super(deserializationContext, list, list2, list3, new Function0<List<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return arrayList;
                }
            });
            this.g = kotlinTypeRefiner;
            DeserializationComponents deserializationComponents = deserializationContext.f44401a;
            this.f44446h = deserializationComponents.f44391a.a(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.m;
                    MemberScope.f44348a.getClass();
                    return this.X.i(descriptorKindFilter, MemberScope.Companion.a());
                }
            });
            this.f44447i = deserializationComponents.f44391a.a(new Function0<Collection<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.X;
                    return deserializedClassMemberScope.g.e(deserializedClassMemberScope.j);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.f(name, "name");
            s(name, noLookupLocation);
            return super.b(name, noLookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection d(Name name, LookupLocation lookupLocation) {
            Intrinsics.f(name, "name");
            s(name, lookupLocation);
            return super.d(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final ClassifierDescriptor f(Name name, LookupLocation location) {
            ClassDescriptor classDescriptor;
            Intrinsics.f(name, "name");
            Intrinsics.f(location, "location");
            s(name, location);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.j.q0;
            return (enumEntryClassDescriptors == null || (classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.f44451b.invoke(name)) == null) ? super.f(name, location) : classDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
            Intrinsics.f(kindFilter, "kindFilter");
            return (Collection) this.f44446h.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void h(ArrayList arrayList, Function1 function1) {
            ?? arrayList2;
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.j.q0;
            if (enumEntryClassDescriptors != null) {
                Set<Name> setKeySet = enumEntryClassDescriptors.f44450a.keySet();
                arrayList2 = new ArrayList();
                for (Name name : setKeySet) {
                    Intrinsics.f(name, "name");
                    ClassDescriptor classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.f44451b.invoke(name);
                    if (classDescriptor != null) {
                        arrayList2.add(classDescriptor);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = EmptyList.X;
            }
            arrayList.addAll(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void j(ArrayList arrayList, Name name) {
            Intrinsics.f(name, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.f44447i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).n().d(name, NoLookupLocation.Z));
            }
            DeserializationContext deserializationContext = this.f44456b;
            arrayList.addAll(deserializationContext.f44401a.f44398n.a(name, this.j));
            ArrayList arrayList3 = new ArrayList(arrayList);
            deserializationContext.f44401a.q.a().h(name, arrayList2, arrayList3, this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void k(ArrayList arrayList, Name name) {
            Intrinsics.f(name, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.f44447i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).n().b(name, NoLookupLocation.Z));
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            this.f44456b.f44401a.q.a().h(name, arrayList2, arrayList3, this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final ClassId l(Name name) {
            Intrinsics.f(name, "name");
            return this.j.i0.d(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set n() {
            List listD = this.j.o0.d();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                Set setE = ((KotlinType) it.next()).n().e();
                if (setE == null) {
                    return null;
                }
                CollectionsKt.g(setE, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set o() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.j;
            List listD = deserializedClassDescriptor.o0.d();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                CollectionsKt.g(((KotlinType) it.next()).n().a(), linkedHashSet);
            }
            linkedHashSet.addAll(this.f44456b.f44401a.f44398n.e(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set p() {
            List listD = this.j.o0.d();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                CollectionsKt.g(((KotlinType) it.next()).n().c(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final boolean r(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            return this.f44456b.f44401a.o.b(this.j, deserializedSimpleFunctionDescriptor);
        }

        public final void s(Name name, LookupLocation location) {
            Intrinsics.f(name, "name");
            Intrinsics.f(location, "location");
            UtilsKt.a(this.f44456b.f44401a.f44396i, location, this.j, name);
        }
    }

    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NotNullLazyValue f44449c;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.m0.f44401a.f44391a);
            this.f44449c = DeserializedClassDescriptor.this.m0.f44401a.f44391a.a(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TypeParameterUtilsKt.b(deserializedClassDescriptor);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection g() {
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ProtoBuf.Class r1 = deserializedClassDescriptor.f0;
            DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
            TypeTable typeTable = deserializationContext.d;
            Intrinsics.f(r1, "<this>");
            List list = r1.i0;
            boolean zIsEmpty = list.isEmpty();
            ?? arrayList = list;
            if (zIsEmpty) {
                arrayList = 0;
            }
            if (arrayList == 0) {
                List supertypeIdList = r1.j0;
                Intrinsics.e(supertypeIdList, "supertypeIdList");
                List<Integer> list2 = supertypeIdList;
                arrayList = new ArrayList(CollectionsKt.n(list2, 10));
                for (Integer it : list2) {
                    Intrinsics.e(it, "it");
                    arrayList.add(typeTable.a(it.intValue()));
                }
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(deserializationContext.f44405h.g((ProtoBuf.Type) it2.next()));
            }
            ArrayList arrayListO = CollectionsKt.O(deserializationContext.f44401a.f44398n.d(deserializedClassDescriptor), arrayList2);
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList3 = new ArrayList();
            Iterator it3 = arrayListO.iterator();
            while (it3.hasNext()) {
                ClassifierDescriptor classifierDescriptorC = ((KotlinType) it3.next()).H0().c();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorC instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorC : null;
                if (mockClassDescriptor != null) {
                    arrayList3.add(mockClassDescriptor);
                }
            }
            if (!arrayList3.isEmpty()) {
                ErrorReporter errorReporter = deserializationContext.f44401a.f44395h;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.n(arrayList3, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList3) {
                    ClassId classIdF = DescriptorUtilsKt.f(mockClassDescriptor2);
                    arrayList4.add(classIdF != null ? classIdF.b().b() : mockClassDescriptor2.getName().b());
                }
                errorReporter.a(deserializedClassDescriptor, arrayList4);
            }
            return CollectionsKt.i0(arrayListO);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return (List) this.f44449c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker j() {
            return SupertypeLoopChecker.EMPTY.f43593a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* JADX INFO: renamed from: p */
        public final ClassDescriptor c() {
            return DeserializedClassDescriptor.this;
        }

        public final String toString() {
            String str = DeserializedClassDescriptor.this.getName().X;
            Intrinsics.e(str, "name.toString()");
            return str;
        }
    }

    public final class EnumEntryClassDescriptors {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f44450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MemoizedFunctionToNullable f44451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NotNullLazyValue f44452c;

        public EnumEntryClassDescriptors() {
            List list = DeserializedClassDescriptor.this.f0.u0;
            Intrinsics.e(list, "classProto.enumEntryList");
            List list2 = list;
            int iH = MapsKt.h(CollectionsKt.n(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (Object obj : list2) {
                linkedHashMap.put(NameResolverUtilKt.b(DeserializedClassDescriptor.this.m0.f44402b, ((ProtoBuf.EnumEntry) obj).e0), obj);
            }
            this.f44450a = linkedHashMap;
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.f44451b = deserializedClassDescriptor.m0.f44401a.f44391a.h(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Name name = (Name) obj2;
                    Intrinsics.f(name, "name");
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.X;
                    final ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) enumEntryClassDescriptors.f44450a.get(name);
                    if (enumEntry == null) {
                        return null;
                    }
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = deserializedClassDescriptor;
                    return EnumEntrySyntheticClassDescriptor.G0(deserializedClassDescriptor2.m0.f44401a.f44391a, deserializedClassDescriptor2, name, enumEntryClassDescriptors.f44452c, new DeserializedAnnotations(deserializedClassDescriptor2.m0.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            DeserializedClassDescriptor deserializedClassDescriptor3 = deserializedClassDescriptor2;
                            return CollectionsKt.i0(deserializedClassDescriptor3.m0.f44401a.f44394e.c(deserializedClassDescriptor3.x0, enumEntry));
                        }
                    }), SourceElement.f43591a);
                }
            });
            this.f44452c = DeserializedClassDescriptor.this.m0.f44401a.f44391a.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeserializationContext deserializationContext;
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.X;
                    enumEntryClassDescriptors.getClass();
                    HashSet hashSet = new HashSet();
                    DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                    Iterator it = deserializedClassDescriptor2.o0.d().iterator();
                    while (it.hasNext()) {
                        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(((KotlinType) it.next()).n(), null, 3)) {
                            if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                                hashSet.add(declarationDescriptor.getName());
                            }
                        }
                    }
                    ProtoBuf.Class r2 = deserializedClassDescriptor2.f0;
                    List list3 = r2.r0;
                    Intrinsics.e(list3, "classProto.functionList");
                    Iterator it2 = list3.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        deserializationContext = deserializedClassDescriptor2.m0;
                        if (!zHasNext) {
                            break;
                        }
                        hashSet.add(NameResolverUtilKt.b(deserializationContext.f44402b, ((ProtoBuf.Function) it2.next()).g0));
                    }
                    List list4 = r2.s0;
                    Intrinsics.e(list4, "classProto.propertyList");
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(NameResolverUtilKt.b(deserializationContext.f44402b, ((ProtoBuf.Property) it3.next()).g0));
                    }
                    return SetsKt.f(hashSet, hashSet);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement) {
        super(outerContext.f44401a.f44391a, NameResolverUtilKt.a(nameResolver, classProto.f0).i());
        Intrinsics.f(outerContext, "outerContext");
        Intrinsics.f(classProto, "classProto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(sourceElement, "sourceElement");
        this.f0 = classProto;
        this.g0 = binaryVersion;
        this.h0 = sourceElement;
        this.i0 = NameResolverUtilKt.a(nameResolver, classProto.f0);
        this.j0 = ProtoEnumFlags.a((ProtoBuf.Modality) Flags.f44111e.c(classProto.e0));
        this.k0 = ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(classProto.e0));
        ProtoBuf.Class.Kind kind = (ProtoBuf.Class.Kind) Flags.f.c(classProto.e0);
        int i2 = kind == null ? -1 : ProtoEnumFlags.WhenMappings.f44434b[kind.ordinal()];
        ClassKind classKind = ClassKind.X;
        ClassKind classKind2 = ClassKind.Z;
        switch (i2) {
            case 2:
                classKind = ClassKind.f43559Y;
                break;
            case 3:
                classKind = classKind2;
                break;
            case 4:
                classKind = ClassKind.e0;
                break;
            case 5:
                classKind = ClassKind.f0;
                break;
            case 6:
            case 7:
                classKind = ClassKind.g0;
                break;
        }
        this.l0 = classKind;
        List list = classProto.h0;
        Intrinsics.e(list, "classProto.typeParameterList");
        ProtoBuf.TypeTable typeTable = classProto.F0;
        Intrinsics.e(typeTable, "classProto.typeTable");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.f44126b;
        ProtoBuf.VersionRequirementTable versionRequirementTable2 = classProto.H0;
        Intrinsics.e(versionRequirementTable2, "classProto.versionRequirementTable");
        DeserializationContext deserializationContextA = outerContext.a(this, list, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable2), binaryVersion);
        this.m0 = deserializationContextA;
        DeserializationComponents deserializationComponents = deserializationContextA.f44401a;
        this.n0 = classKind == classKind2 ? new StaticScopeForKotlinEnum(deserializationComponents.f44391a, this) : MemberScope.Empty.f44351b;
        this.o0 = new DeserializedClassTypeConstructor();
        ScopesHolderForClass.Companion companion = ScopesHolderForClass.f43587e;
        LockBasedStorageManager storageManager = deserializationComponents.f44391a;
        KotlinTypeRefiner kotlinTypeRefinerForOwnerModule = deserializationComponents.q.b();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(1, this);
        companion.getClass();
        Intrinsics.f(storageManager, "storageManager");
        Intrinsics.f(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        this.p0 = new ScopesHolderForClass(this, storageManager, deserializedClassDescriptor$memberScopeHolder$1, kotlinTypeRefinerForOwnerModule);
        this.q0 = classKind == classKind2 ? new EnumEntryClassDescriptors() : null;
        DeclarationDescriptor declarationDescriptor = outerContext.f44403c;
        this.r0 = declarationDescriptor;
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f44391a;
        this.s0 = lockBasedStorageManager.b(new Function0<ClassConstructorDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object next;
                DeserializedClassDescriptor deserializedClassDescriptor = this.X;
                if (deserializedClassDescriptor.l0.d()) {
                    ClassConstructorDescriptorImpl classConstructorDescriptorImplJ = DescriptorFactory.j(deserializedClassDescriptor);
                    classConstructorDescriptorImplJ.O0(deserializedClassDescriptor.o());
                    return classConstructorDescriptorImplJ;
                }
                List list2 = deserializedClassDescriptor.f0.q0;
                Intrinsics.e(list2, "classProto.constructorList");
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (Flags.m.e(((ProtoBuf.Constructor) next).e0).booleanValue());
                ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
                if (constructor != null) {
                    return deserializedClassDescriptor.m0.f44406i.d(constructor, true);
                }
                return null;
            }
        });
        this.t0 = lockBasedStorageManager.a(new Function0<Collection<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.X;
                List list2 = deserializedClassDescriptor.f0.q0;
                Intrinsics.e(list2, "classProto.constructorList");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (Flags.m.e(((ProtoBuf.Constructor) obj).e0).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
                    if (!zHasNext) {
                        return CollectionsKt.O(deserializationContext.f44401a.f44398n.c(deserializedClassDescriptor), CollectionsKt.O(CollectionsKt.J(deserializedClassDescriptor.z()), arrayList2));
                    }
                    ProtoBuf.Constructor it2 = (ProtoBuf.Constructor) it.next();
                    MemberDeserializer memberDeserializer = deserializationContext.f44406i;
                    Intrinsics.e(it2, "it");
                    arrayList2.add(memberDeserializer.d(it2, false));
                }
            }
        });
        this.u0 = lockBasedStorageManager.b(new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.X;
                ProtoBuf.Class r1 = deserializedClassDescriptor.f0;
                if ((r1.Z & 4) != 4) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorF = deserializedClassDescriptor.G0().f(NameResolverUtilKt.b(deserializedClassDescriptor.m0.f44402b, r1.g0), NoLookupLocation.h0);
                if (classifierDescriptorF instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorF;
                }
                return null;
            }
        });
        this.v0 = lockBasedStorageManager.a(new Function0<Collection<? extends ClassDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Modality modality = Modality.f43574Y;
                EmptyList emptyList = EmptyList.X;
                DeserializedClassDescriptor deserializedClassDescriptor = this.X;
                if (deserializedClassDescriptor.j0 == modality) {
                    List<Integer> fqNames = deserializedClassDescriptor.f0.v0;
                    Intrinsics.e(fqNames, "fqNames");
                    if (!fqNames.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Integer index : fqNames) {
                            DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
                            DeserializationComponents deserializationComponents2 = deserializationContext.f44401a;
                            Intrinsics.e(index, "index");
                            ClassDescriptor classDescriptorB = deserializationComponents2.b(NameResolverUtilKt.a(deserializationContext.f44402b, index.intValue()));
                            if (classDescriptorB != null) {
                                arrayList.add(classDescriptorB);
                            }
                        }
                        return arrayList;
                    }
                    if (deserializedClassDescriptor.j0 == modality) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        DeclarationDescriptor declarationDescriptor2 = deserializedClassDescriptor.r0;
                        if (declarationDescriptor2 instanceof PackageFragmentDescriptor) {
                            CliSealedClassInheritorsProvider.a(deserializedClassDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptor2).n(), false);
                        }
                        MemberScope memberScopeN = deserializedClassDescriptor.N();
                        Intrinsics.e(memberScopeN, "sealedClass.unsubstitutedInnerClassesScope");
                        CliSealedClassInheritorsProvider.a(deserializedClassDescriptor, linkedHashSet, memberScopeN, true);
                        return CollectionsKt.c0(new CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1(), linkedHashSet);
                    }
                }
                return emptyList;
            }
        });
        this.w0 = lockBasedStorageManager.b(new Function0<ValueClassRepresentation<SimpleType>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$valueClassRepresentation$1
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object inlineClassRepresentation;
                SimpleTypeMarker simpleTypeMarker;
                ?? arrayList;
                DeserializedClassDescriptor deserializedClassDescriptor = this.X;
                if (deserializedClassDescriptor.isInline() || deserializedClassDescriptor.b0()) {
                    DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
                    NameResolver nameResolver2 = deserializationContext.f44402b;
                    DeserializedClassDescriptor$computeValueClassRepresentation$1 deserializedClassDescriptor$computeValueClassRepresentation$1 = new DeserializedClassDescriptor$computeValueClassRepresentation$1(1, deserializationContext.f44405h);
                    DeserializedClassDescriptor$computeValueClassRepresentation$2 deserializedClassDescriptor$computeValueClassRepresentation$2 = new DeserializedClassDescriptor$computeValueClassRepresentation$2(1, deserializedClassDescriptor);
                    ProtoBuf.Class r8 = deserializedClassDescriptor.f0;
                    Intrinsics.f(r8, "<this>");
                    Intrinsics.f(nameResolver2, "nameResolver");
                    TypeTable typeTable3 = deserializationContext.d;
                    if (r8.A0.size() > 0) {
                        List multiFieldValueClassUnderlyingNameList = r8.A0;
                        Intrinsics.e(multiFieldValueClassUnderlyingNameList, "multiFieldValueClassUnderlyingNameList");
                        List<Integer> list2 = multiFieldValueClassUnderlyingNameList;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
                        for (Integer it : list2) {
                            Intrinsics.e(it, "it");
                            arrayList2.add(NameResolverUtilKt.b(nameResolver2, it.intValue()));
                        }
                        Pair pair = new Pair(Integer.valueOf(r8.D0.size()), Integer.valueOf(r8.C0.size()));
                        if (pair.equals(new Pair(Integer.valueOf(arrayList2.size()), 0))) {
                            List multiFieldValueClassUnderlyingTypeIdList = r8.D0;
                            Intrinsics.e(multiFieldValueClassUnderlyingTypeIdList, "multiFieldValueClassUnderlyingTypeIdList");
                            List<Integer> list3 = multiFieldValueClassUnderlyingTypeIdList;
                            arrayList = new ArrayList(CollectionsKt.n(list3, 10));
                            for (Integer it2 : list3) {
                                Intrinsics.e(it2, "it");
                                arrayList.add(typeTable3.a(it2.intValue()));
                            }
                        } else {
                            if (!pair.equals(new Pair(0, Integer.valueOf(arrayList2.size())))) {
                                throw new IllegalStateException(("class " + NameResolverUtilKt.b(nameResolver2, r8.f0) + " has illegal multi-field value class representation").toString());
                            }
                            arrayList = r8.C0;
                        }
                        Intrinsics.e(arrayList, "when (typeIdCount to typ…epresentation\")\n        }");
                        Iterable iterable = (Iterable) arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(iterable, 10));
                        Iterator it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(deserializedClassDescriptor$computeValueClassRepresentation$1.invoke(it3.next()));
                        }
                        inlineClassRepresentation = new MultiFieldValueClassRepresentation(CollectionsKt.n0(arrayList2, arrayList3));
                    } else if ((r8.Z & 8) == 8) {
                        Name nameB = NameResolverUtilKt.b(nameResolver2, r8.x0);
                        int i3 = r8.Z;
                        ProtoBuf.Type typeA = (i3 & 16) == 16 ? r8.y0 : (i3 & 32) == 32 ? typeTable3.a(r8.z0) : null;
                        if ((typeA == null || (simpleTypeMarker = (SimpleTypeMarker) deserializedClassDescriptor$computeValueClassRepresentation$1.invoke(typeA)) == null) && (simpleTypeMarker = (SimpleTypeMarker) deserializedClassDescriptor$computeValueClassRepresentation$2.invoke(nameB)) == null) {
                            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.b(nameResolver2, r8.f0) + " with property " + nameB).toString());
                        }
                        inlineClassRepresentation = new InlineClassRepresentation(nameB, simpleTypeMarker);
                    } else {
                        inlineClassRepresentation = null;
                    }
                    if (inlineClassRepresentation != null) {
                        return inlineClassRepresentation;
                    }
                    if (!deserializedClassDescriptor.g0.a(1, 5, 1)) {
                        ClassConstructorDescriptor classConstructorDescriptorZ = deserializedClassDescriptor.z();
                        if (classConstructorDescriptorZ == null) {
                            throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
                        }
                        List listE = classConstructorDescriptorZ.e();
                        Intrinsics.e(listE, "constructor.valueParameters");
                        Name name = ((ValueParameterDescriptor) CollectionsKt.w(listE)).getName();
                        Intrinsics.e(name, "constructor.valueParameters.first().name");
                        SimpleType simpleTypeH0 = deserializedClassDescriptor.H0(name);
                        if (simpleTypeH0 != null) {
                            return new InlineClassRepresentation(name, simpleTypeH0);
                        }
                        throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
                    }
                }
                return null;
            }
        });
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptor : null;
        this.x0 = new ProtoContainer.Class(classProto, deserializationContextA.f44402b, deserializationContextA.d, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.x0 : null);
        this.y0 = !Flags.f44110c.e(classProto.e0).booleanValue() ? Annotations.Companion.f43614a : new NonEmptyDeserializedAnnotations(lockBasedStorageManager, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.X;
                return CollectionsKt.i0(deserializedClassDescriptor2.m0.f44401a.f44394e.a(deserializedClassDescriptor2.x0));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean D0() {
        return Flags.f44112h.e(this.f0.e0).booleanValue();
    }

    public final DeserializedClassMemberScope G0() {
        return (DeserializedClassMemberScope) this.p0.a(this.m0.f44401a.q.b());
    }

    public final SimpleType H0(Name name) {
        Iterator it = G0().b(name, NoLookupLocation.h0).iterator();
        boolean z2 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z2) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((PropertyDescriptor) next).J() == null) {
                if (!z2) {
                    z2 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation O() {
        return (ValueClassRepresentation) this.w0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final List S() {
        DeserializationContext deserializationContext = this.m0;
        TypeTable typeTable = deserializationContext.d;
        ProtoBuf.Class r2 = this.f0;
        Intrinsics.f(r2, "<this>");
        List list = r2.n0;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List contextReceiverTypeIdList = r2.o0;
            Intrinsics.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list2 = contextReceiverTypeIdList;
            arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            for (Integer it : list2) {
                Intrinsics.e(it, "it");
                arrayList.add(typeTable.a(it.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ReceiverParameterDescriptorImpl(E0(), new ContextClassReceiver(this, deserializationContext.f44405h.g((ProtoBuf.Type) it2.next()), null), Annotations.Companion.f43614a));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean T() {
        return Flags.f.c(this.f0.e0) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean W() {
        return Flags.f44114l.e(this.f0.e0).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean b0() {
        return Flags.k.e(this.f0.e0).booleanValue() && this.g0.a(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope c0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.p0.a(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        return this.r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return Flags.j.e(this.f0.e0).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        return this.h0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope f0() {
        return this.n0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor g0() {
        return (ClassDescriptor) this.u0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind getKind() {
        return this.l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        return this.k0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        return this.o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection i() {
        return (Collection) this.t0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return Flags.f44113i.e(this.f0.e0).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        if (!Flags.k.e(this.f0.e0).booleanValue()) {
            return false;
        }
        BinaryVersion binaryVersion = this.g0;
        int i2 = binaryVersion.f44099b;
        if (i2 >= 1) {
            if (i2 > 1) {
                return false;
            }
            int i3 = binaryVersion.f44100c;
            if (i3 >= 4 && (i3 > 4 || binaryVersion.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        return this.m0.f44405h.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        return this.j0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(d0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection u() {
        return (Collection) this.v0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return Flags.g.e(this.f0.e0).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return (ClassConstructorDescriptor) this.s0.invoke();
    }
}
