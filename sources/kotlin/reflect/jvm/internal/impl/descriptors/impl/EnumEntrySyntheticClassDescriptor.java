package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    public final ClassTypeConstructorImpl h0;
    public final MemberScope i0;
    public final NotNullLazyValue j0;
    public final Annotations k0;

    public class EnumEntryScope extends MemberScopeImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MemoizedFunctionToNotNull f43634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MemoizedFunctionToNotNull f43635c;
        public final NotNullLazyValue d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EnumEntrySyntheticClassDescriptor f43636e;

        public EnumEntryScope(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, LockBasedStorageManager lockBasedStorageManager) {
            if (lockBasedStorageManager == null) {
                h(0);
                throw null;
            }
            this.f43636e = enumEntrySyntheticClassDescriptor;
            this.f43634b = lockBasedStorageManager.g(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Name name = (Name) obj;
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    if (name != null) {
                        return enumEntryScope.j(name, enumEntryScope.i().d(name, NoLookupLocation.g0));
                    }
                    enumEntryScope.getClass();
                    EnumEntryScope.h(8);
                    throw null;
                }
            });
            this.f43635c = lockBasedStorageManager.g(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Name name = (Name) obj;
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    if (name != null) {
                        return enumEntryScope.j(name, enumEntryScope.i().b(name, NoLookupLocation.g0));
                    }
                    enumEntryScope.getClass();
                    EnumEntryScope.h(4);
                    throw null;
                }
            });
            this.d = lockBasedStorageManager.a(new Function0<Collection<DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    enumEntryScope.getClass();
                    HashSet hashSet = new HashSet();
                    for (Name name : (Set) enumEntryScope.f43636e.j0.invoke()) {
                        NoLookupLocation noLookupLocation = NoLookupLocation.g0;
                        hashSet.addAll(enumEntryScope.d(name, noLookupLocation));
                        hashSet.addAll(enumEntryScope.b(name, noLookupLocation));
                    }
                    return hashSet;
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        public static /* synthetic */ void h(int i2) {
            String str;
            int i3;
            if (i2 != 3 && i2 != 7 && i2 != 9 && i2 != 12) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i2 != 3 && i2 != 7 && i2 != 9 && i2 != 12) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i3 = 2;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
            } else {
                i3 = 2;
            }
            Object[] objArr = new Object[i3];
            switch (i2) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i2 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i2 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i2 != 12) {
                switch (i2) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i2 != 3 && i2 != 7 && i2 != 9 && i2 != 12) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set a() {
            Set set = (Set) this.f43636e.j0.invoke();
            if (set != null) {
                return set;
            }
            h(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            if (name == null) {
                h(1);
                throw null;
            }
            Collection collection = (Collection) this.f43635c.invoke(name);
            if (collection != null) {
                return collection;
            }
            h(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set c() {
            Set set = (Set) this.f43636e.j0.invoke();
            if (set != null) {
                return set;
            }
            h(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection d(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                h(5);
                throw null;
            }
            Collection collection = (Collection) this.f43634b.invoke(name);
            if (collection != null) {
                return collection;
            }
            h(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set e() {
            Set set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection g(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
            if (descriptorKindFilter == null) {
                h(13);
                throw null;
            }
            Collection collection = (Collection) this.d.invoke();
            if (collection != null) {
                return collection;
            }
            h(15);
            throw null;
        }

        public final MemberScope i() {
            MemberScope memberScopeN = ((KotlinType) ((AbstractTypeConstructor) this.f43636e.h()).d().iterator().next()).n();
            if (memberScopeN != null) {
                return memberScopeN;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(Name name, Collection collection) {
            if (name == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f44284c.h(name, collection, Collections.EMPTY_SET, this.f43636e, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.4
                public static /* synthetic */ void d(int i2) {
                    Object[] objArr = new Object[3];
                    if (i2 == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i2 != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i2 == 1 || i2 == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public final void a(CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        d(0);
                        throw null;
                    }
                    OverridingUtil.r(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor2 != null) {
                        return;
                    }
                    d(2);
                    throw null;
                }
            });
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntrySyntheticClassDescriptor(LockBasedStorageManager lockBasedStorageManager, ClassDescriptor classDescriptor, SimpleType simpleType, Name name, NotNullLazyValue notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        super(lockBasedStorageManager, classDescriptor, name, sourceElement);
        if (lockBasedStorageManager == null) {
            y0(6);
            throw null;
        }
        if (classDescriptor == null) {
            y0(7);
            throw null;
        }
        if (simpleType == null) {
            y0(8);
            throw null;
        }
        if (name == null) {
            y0(9);
            throw null;
        }
        if (notNullLazyValue == null) {
            y0(10);
            throw null;
        }
        if (sourceElement == null) {
            y0(12);
            throw null;
        }
        this.k0 = annotations;
        this.h0 = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(simpleType), lockBasedStorageManager);
        this.i0 = new EnumEntryScope(this, lockBasedStorageManager);
        this.j0 = notNullLazyValue;
    }

    public static EnumEntrySyntheticClassDescriptor G0(LockBasedStorageManager lockBasedStorageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        if (lockBasedStorageManager == null) {
            y0(0);
            throw null;
        }
        if (classDescriptor == null) {
            y0(1);
            throw null;
        }
        if (name == null) {
            y0(2);
            throw null;
        }
        if (notNullLazyValue == null) {
            y0(3);
            throw null;
        }
        if (sourceElement != null) {
            return new EnumEntrySyntheticClassDescriptor(lockBasedStorageManager, classDescriptor, classDescriptor.o(), name, notNullLazyValue, annotations, sourceElement);
        }
        y0(5);
        throw null;
    }

    public static /* synthetic */ void y0(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i2) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation O() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean T() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean b0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope c0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            y0(13);
            throw null;
        }
        MemberScope memberScope = this.i0;
        if (memberScope != null) {
            return memberScope;
        }
        y0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope f0() {
        return MemberScope.Empty.f44351b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor g0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        Annotations annotations = this.k0;
        if (annotations != null) {
            return annotations;
        }
        y0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind getKind() {
        return ClassKind.e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f43564e;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        y0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.h0;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        y0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection i() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        return Modality.X;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection u() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return null;
    }
}
