package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.a4;
import com.thinkup.core.common.n.mo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    public static final /* synthetic */ int f = 0;
    public final DescriptorRendererOptionsImpl d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f44241e = LazyKt.b(new Function0<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
            public static final AnonymousClass1 X = new AnonymousClass1(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
                Intrinsics.f(withOptions, "$this$withOptions");
                withOptions.k(SetsKt.f(withOptions.g(), CollectionsKt.I(StandardNames.FqNames.f43504p, StandardNames.FqNames.q)));
                return Unit.f43263a;
            }
        }

        {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v3 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws IllegalAccessException {
            String str;
            AnonymousClass1 anonymousClass1 = AnonymousClass1.X;
            DescriptorRendererImpl descriptorRendererImpl = this.X;
            descriptorRendererImpl.getClass();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
            Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
            Intrinsics.e(declaredFields, "this::class.java.declaredFields");
            int length = declaredFields.length;
            ?? r7 = 0;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(descriptorRendererOptionsImpl);
                    ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                    if (observableProperty != null) {
                        String name = field.getName();
                        Intrinsics.e(name, "field.name");
                        StringsKt.M(name, "is", r7);
                        KClass kClassB = Reflection.f43333a.b(DescriptorRendererOptionsImpl.class);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder("get");
                        String name3 = field.getName();
                        Intrinsics.e(name3, "field.name");
                        if (name3.length() > 0) {
                            str = name3;
                            char upperCase = Character.toUpperCase(name3.charAt(r7));
                            String strSubstring = name3.substring(1);
                            Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                            str = upperCase + strSubstring;
                        }
                        str = name3;
                        sb.append(str);
                        field.set(descriptorRendererOptionsImpl2, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(observableProperty.getValue(descriptorRendererOptionsImpl, new PropertyReference1Impl(kClassB, name2, sb.toString())), descriptorRendererOptionsImpl2));
                    }
                }
                i2++;
                r7 = 0;
            }
            anonymousClass1.invoke(descriptorRendererOptionsImpl2);
            descriptorRendererOptionsImpl2.f44256a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
        }
    });

    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object a(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.V(lazyPackageViewDescriptorImpl.e0, "package", sb);
            if (descriptorRendererImpl.d.p()) {
                sb.append(" in context of ");
                descriptorRendererImpl.R(lazyPackageViewDescriptorImpl.Z, sb, false);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.z(sb, abstractTypeAliasDescriptor, null);
            DelegatedDescriptorVisibility delegatedDescriptorVisibility = abstractTypeAliasDescriptor.f0;
            Intrinsics.e(delegatedDescriptorVisibility, "typeAlias.visibility");
            descriptorRendererImpl.k0(delegatedDescriptorVisibility, sb);
            descriptorRendererImpl.M(abstractTypeAliasDescriptor, sb);
            sb.append(descriptorRendererImpl.K("typealias"));
            sb.append(" ");
            descriptorRendererImpl.R(abstractTypeAliasDescriptor, sb, true);
            descriptorRendererImpl.f0(abstractTypeAliasDescriptor.p(), sb, false);
            descriptorRendererImpl.B(abstractTypeAliasDescriptor, sb);
            sb.append(" = ");
            sb.append(descriptorRendererImpl.a0(((DeserializedTypeAliasDescriptor) abstractTypeAliasDescriptor).m0()));
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object c(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj) {
            ClassConstructorDescriptor classConstructorDescriptorZ;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            int i2 = DescriptorRendererImpl.f;
            final DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            boolean z2 = moduleAwareClassDescriptor.getKind() == ClassKind.e0;
            if (!descriptorRendererImpl.s()) {
                descriptorRendererImpl.z(sb, moduleAwareClassDescriptor, null);
                List listS = moduleAwareClassDescriptor.S();
                Intrinsics.e(listS, "klass.contextReceivers");
                descriptorRendererImpl.D(sb, listS);
                if (!z2) {
                    DescriptorVisibility visibility = moduleAwareClassDescriptor.getVisibility();
                    Intrinsics.e(visibility, "klass.visibility");
                    descriptorRendererImpl.k0(visibility, sb);
                }
                if ((moduleAwareClassDescriptor.getKind() != ClassKind.f43559Y || moduleAwareClassDescriptor.q() != Modality.e0) && (!moduleAwareClassDescriptor.getKind().d() || moduleAwareClassDescriptor.q() != Modality.X)) {
                    Modality modalityQ = moduleAwareClassDescriptor.q();
                    Intrinsics.e(modalityQ, "klass.modality");
                    descriptorRendererImpl.N(modalityQ, sb, DescriptorRendererImpl.w(moduleAwareClassDescriptor));
                }
                descriptorRendererImpl.M(moduleAwareClassDescriptor, sb);
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.INNER) && moduleAwareClassDescriptor.w(), "inner");
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.DATA) && moduleAwareClassDescriptor.D0(), "data");
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.INLINE) && moduleAwareClassDescriptor.isInline(), "inline");
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.VALUE) && moduleAwareClassDescriptor.b0(), "value");
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.FUN) && moduleAwareClassDescriptor.W(), "fun");
                if (moduleAwareClassDescriptor instanceof TypeAliasDescriptor) {
                    str = "typealias";
                } else if (moduleAwareClassDescriptor.T()) {
                    str = "companion object";
                } else {
                    int iOrdinal = moduleAwareClassDescriptor.getKind().ordinal();
                    if (iOrdinal == 0) {
                        str = "class";
                    } else if (iOrdinal == 1) {
                        str = "interface";
                    } else if (iOrdinal == 2) {
                        str = "enum class";
                    } else if (iOrdinal == 3) {
                        str = "enum entry";
                    } else if (iOrdinal == 4) {
                        str = "annotation class";
                    } else {
                        if (iOrdinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "object";
                    }
                }
                sb.append(descriptorRendererImpl.K(str));
            }
            boolean zL = DescriptorUtils.l(moduleAwareClassDescriptor);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            if (zL) {
                if (((Boolean) descriptorRendererOptionsImpl.f44247F.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[30])).booleanValue()) {
                    if (descriptorRendererImpl.s()) {
                        sb.append("companion object");
                    }
                    DescriptorRendererImpl.Z(sb);
                    DeclarationDescriptor declarationDescriptorD = moduleAwareClassDescriptor.d();
                    if (declarationDescriptorD != null) {
                        sb.append("of ");
                        Name name = declarationDescriptorD.getName();
                        Intrinsics.e(name, "containingDeclaration.name");
                        sb.append(descriptorRendererImpl.Q(name, false));
                    }
                }
                if (descriptorRendererImpl.v() || !Intrinsics.a(moduleAwareClassDescriptor.getName(), SpecialNames.f44174b)) {
                    if (!descriptorRendererImpl.s()) {
                        DescriptorRendererImpl.Z(sb);
                    }
                    Name name2 = moduleAwareClassDescriptor.getName();
                    Intrinsics.e(name2, "descriptor.name");
                    sb.append(descriptorRendererImpl.Q(name2, true));
                }
            } else {
                if (!descriptorRendererImpl.s()) {
                    DescriptorRendererImpl.Z(sb);
                }
                descriptorRendererImpl.R(moduleAwareClassDescriptor, sb, true);
            }
            if (!z2) {
                List listP = moduleAwareClassDescriptor.p();
                Intrinsics.e(listP, "klass.declaredTypeParameters");
                descriptorRendererImpl.f0(listP, sb, false);
                descriptorRendererImpl.B(moduleAwareClassDescriptor, sb);
                if (!moduleAwareClassDescriptor.getKind().d()) {
                    if (((Boolean) descriptorRendererOptionsImpl.f44261i.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[7])).booleanValue() && (classConstructorDescriptorZ = moduleAwareClassDescriptor.z()) != null) {
                        sb.append(" ");
                        descriptorRendererImpl.z(sb, classConstructorDescriptorZ, null);
                        DescriptorVisibility visibility2 = classConstructorDescriptorZ.getVisibility();
                        Intrinsics.e(visibility2, "primaryConstructor.visibility");
                        descriptorRendererImpl.k0(visibility2, sb);
                        sb.append(descriptorRendererImpl.K("constructor"));
                        List listE = classConstructorDescriptorZ.e();
                        Intrinsics.e(listE, "primaryConstructor.valueParameters");
                        descriptorRendererImpl.j0(listE, classConstructorDescriptorZ.Y(), sb);
                    }
                }
                if (!((Boolean) descriptorRendererOptionsImpl.f44266w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[21])).booleanValue() && !KotlinBuiltIns.D(moduleAwareClassDescriptor.o())) {
                    Collection collectionD = moduleAwareClassDescriptor.h().d();
                    Intrinsics.e(collectionD, "klass.typeConstructor.supertypes");
                    if (!collectionD.isEmpty() && (collectionD.size() != 1 || !KotlinBuiltIns.w((KotlinType) collectionD.iterator().next()))) {
                        DescriptorRendererImpl.Z(sb);
                        sb.append(": ");
                        CollectionsKt.C(collectionD, sb, ", ", null, null, new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                KotlinType it = (KotlinType) obj2;
                                Intrinsics.e(it, "it");
                                return descriptorRendererImpl.a0(it);
                            }
                        }, 60);
                    }
                }
                descriptorRendererImpl.l0(sb, listP);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object d(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.R(moduleDescriptorImpl, (StringBuilder) obj, true);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object e(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj) {
            o(propertySetterDescriptorImpl, (StringBuilder) obj, "setter");
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object f(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj) {
            o(propertyGetterDescriptorImpl, (StringBuilder) obj, "getter");
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object g(PropertyDescriptorImpl descriptor, Object obj) {
            Intrinsics.f(descriptor, "descriptor");
            DescriptorRendererImpl.p(DescriptorRendererImpl.this, descriptor, (StringBuilder) obj);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object h(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj) {
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.i0(valueParameterDescriptorImpl, true, (StringBuilder) obj, true);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object i(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.V(packageFragmentDescriptorImpl.f0, "package-fragment", sb);
            if (descriptorRendererImpl.d.p()) {
                sb.append(" in ");
                descriptorRendererImpl.R(packageFragmentDescriptorImpl.d(), sb, false);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object j(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj) {
            ((StringBuilder) obj).append(abstractReceiverParameterDescriptor.getName());
            return Unit.f43263a;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0048  */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object k(ClassConstructorDescriptorImpl classConstructorDescriptorImpl, Object obj) {
            boolean z2;
            ClassConstructorDescriptor classConstructorDescriptorZ;
            StringBuilder sb = (StringBuilder) obj;
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.z(sb, classConstructorDescriptorImpl, null);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
            if (((Boolean) descriptorRendererOptionsImpl.o.getValue(descriptorRendererOptionsImpl, kPropertyArr[13])).booleanValue() || classConstructorDescriptorImpl.V().q() != Modality.f43574Y) {
                DescriptorVisibility visibility = classConstructorDescriptorImpl.getVisibility();
                Intrinsics.e(visibility, "constructor.visibility");
                if (descriptorRendererImpl.k0(visibility, sb)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            descriptorRendererImpl.L(sb, classConstructorDescriptorImpl);
            boolean zBooleanValue = ((Boolean) descriptorRendererOptionsImpl.O.getValue(descriptorRendererOptionsImpl, kPropertyArr[39])).booleanValue();
            boolean z3 = classConstructorDescriptorImpl.F0;
            boolean z4 = zBooleanValue || !z3 || z2;
            if (z4) {
                sb.append(descriptorRendererImpl.K("constructor"));
            }
            ClassDescriptor classDescriptorQ0 = classConstructorDescriptorImpl.d();
            Intrinsics.e(classDescriptorQ0, "constructor.containingDeclaration");
            if (((Boolean) descriptorRendererOptionsImpl.f44267z.getValue(descriptorRendererOptionsImpl, kPropertyArr[24])).booleanValue()) {
                if (z4) {
                    sb.append(" ");
                }
                descriptorRendererImpl.R(classDescriptorQ0, sb, true);
                descriptorRendererImpl.f0(classConstructorDescriptorImpl.getTypeParameters(), sb, false);
            }
            List listE = classConstructorDescriptorImpl.e();
            Intrinsics.e(listE, "constructor.valueParameters");
            descriptorRendererImpl.j0(listE, classConstructorDescriptorImpl.Y(), sb);
            if (((Boolean) descriptorRendererOptionsImpl.q.getValue(descriptorRendererOptionsImpl, kPropertyArr[15])).booleanValue() && !z3 && (classConstructorDescriptorZ = classDescriptorQ0.z()) != null) {
                List listE2 = classConstructorDescriptorZ.e();
                Intrinsics.e(listE2, "primaryConstructor.valueParameters");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listE2) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj2;
                    if (!valueParameterDescriptor.u0() && valueParameterDescriptor.o0() == null) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb.append(" : ");
                    sb.append(descriptorRendererImpl.K("this"));
                    sb.append(CollectionsKt.D(arrayList, ", ", "(", ")", DescriptorRendererImpl$renderConstructor$1.X, 24));
                }
            }
            if (((Boolean) descriptorRendererOptionsImpl.f44267z.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
                descriptorRendererImpl.l0(sb, classConstructorDescriptorImpl.getTypeParameters());
            }
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* bridge */ /* synthetic */ Object l(FunctionDescriptor functionDescriptor, Object obj) {
            n(functionDescriptor, (StringBuilder) obj);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj) {
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.d0(abstractTypeParameterDescriptor, (StringBuilder) obj, true);
            return Unit.f43263a;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:59:0x01b3  */
        public final void n(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            String strA0;
            boolean z2;
            int i2 = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            boolean zS = descriptorRendererImpl.s();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            if (!zS) {
                KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
                if (!((Boolean) descriptorRendererOptionsImpl.g.getValue(descriptorRendererOptionsImpl, kPropertyArr[5])).booleanValue()) {
                    descriptorRendererImpl.z(sb, functionDescriptor, null);
                    List listR0 = functionDescriptor.r0();
                    Intrinsics.e(listR0, "function.contextReceiverParameters");
                    descriptorRendererImpl.D(sb, listR0);
                    DescriptorVisibility visibility = functionDescriptor.getVisibility();
                    Intrinsics.e(visibility, "function.visibility");
                    descriptorRendererImpl.k0(visibility, sb);
                    descriptorRendererImpl.O(sb, functionDescriptor);
                    if (((Boolean) descriptorRendererOptionsImpl.f44253R.getValue(descriptorRendererOptionsImpl, kPropertyArr[42])).booleanValue()) {
                        descriptorRendererImpl.M(functionDescriptor, sb);
                    }
                    descriptorRendererImpl.U(sb, functionDescriptor);
                    if (((Boolean) descriptorRendererOptionsImpl.f44253R.getValue(descriptorRendererOptionsImpl, kPropertyArr[42])).booleanValue()) {
                        boolean z3 = false;
                        if (functionDescriptor.isOperator()) {
                            Collection collectionL = functionDescriptor.l();
                            Intrinsics.e(collectionL, "functionDescriptor.overriddenDescriptors");
                            Collection collection = collectionL;
                            if (!collection.isEmpty()) {
                                Iterator it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((FunctionDescriptor) it.next()).isOperator()) {
                                            if (!((Boolean) descriptorRendererOptionsImpl.f44250N.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                                z2 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (functionDescriptor.isInfix()) {
                            Collection collectionL2 = functionDescriptor.l();
                            Intrinsics.e(collectionL2, "functionDescriptor.overriddenDescriptors");
                            Collection collection2 = collectionL2;
                            if (!collection2.isEmpty()) {
                                Iterator it2 = collection2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((FunctionDescriptor) it2.next()).isInfix()) {
                                            if (!((Boolean) descriptorRendererOptionsImpl.f44250N.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    break;
                                }
                            }
                            z3 = true;
                            break;
                        }
                        descriptorRendererImpl.P(sb, functionDescriptor.y(), "tailrec");
                        descriptorRendererImpl.P(sb, functionDescriptor.isSuspend(), "suspend");
                        descriptorRendererImpl.P(sb, functionDescriptor.isInline(), "inline");
                        descriptorRendererImpl.P(sb, z3, "infix");
                        descriptorRendererImpl.P(sb, z2, "operator");
                    } else {
                        descriptorRendererImpl.P(sb, functionDescriptor.isSuspend(), "suspend");
                    }
                    descriptorRendererImpl.L(sb, functionDescriptor);
                    if (descriptorRendererImpl.v()) {
                        if (functionDescriptor.w0()) {
                            sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (functionDescriptor.z0()) {
                            sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                sb.append(descriptorRendererImpl.K("fun"));
                sb.append(" ");
                List typeParameters = functionDescriptor.getTypeParameters();
                Intrinsics.e(typeParameters, "function.typeParameters");
                descriptorRendererImpl.f0(typeParameters, sb, true);
                descriptorRendererImpl.X(sb, functionDescriptor);
            }
            descriptorRendererImpl.R(functionDescriptor, sb, true);
            List listE = functionDescriptor.e();
            Intrinsics.e(listE, "function.valueParameters");
            descriptorRendererImpl.j0(listE, functionDescriptor.Y(), sb);
            descriptorRendererImpl.Y(sb, functionDescriptor);
            KotlinType returnType = functionDescriptor.getReturnType();
            KProperty[] kPropertyArr2 = DescriptorRendererOptionsImpl.W;
            if (!((Boolean) descriptorRendererOptionsImpl.f44262l.getValue(descriptorRendererOptionsImpl, kPropertyArr2[10])).booleanValue()) {
                if (((Boolean) descriptorRendererOptionsImpl.k.getValue(descriptorRendererOptionsImpl, kPropertyArr2[9])).booleanValue() || returnType == null) {
                    sb.append(": ");
                    if (returnType == null) {
                        strA0 = "[NULL]";
                    } else {
                        strA0 = descriptorRendererImpl.a0(returnType);
                    }
                    sb.append(strA0);
                } else {
                    Name name = KotlinBuiltIns.f;
                    if (!KotlinBuiltIns.C(returnType, StandardNames.FqNames.d)) {
                        sb.append(": ");
                        if (returnType == null) {
                            strA0 = "[NULL]";
                        } else {
                            strA0 = descriptorRendererImpl.a0(returnType);
                        }
                        sb.append(strA0);
                    }
                }
            }
            List typeParameters2 = functionDescriptor.getTypeParameters();
            Intrinsics.e(typeParameters2, "function.typeParameters");
            descriptorRendererImpl.l0(sb, typeParameters2);
        }

        public final void o(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            int iOrdinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.G.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[31])).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return;
                }
                n(propertyAccessorDescriptor, sb);
            } else {
                descriptorRendererImpl.M(propertyAccessorDescriptor, sb);
                sb.append(str.concat(" for "));
                PropertyDescriptor propertyDescriptorP = propertyAccessorDescriptor.P();
                Intrinsics.e(propertyDescriptorP, "descriptor.correspondingProperty");
                DescriptorRendererImpl.p(descriptorRendererImpl, propertyDescriptorP, sb);
            }
        }
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.d = descriptorRendererOptionsImpl;
    }

    public static void Z(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean m0(KotlinType kotlinType) {
        if (!FunctionTypesKt.h(kotlinType)) {
            return false;
        }
        List listF0 = kotlinType.F0();
        if ((listF0 instanceof Collection) && listF0.isEmpty()) {
            return true;
        }
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public static final void p(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (!descriptorRendererImpl.s()) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
            if (!((Boolean) descriptorRendererOptionsImpl.g.getValue(descriptorRendererOptionsImpl, kPropertyArr[5])).booleanValue()) {
                if (descriptorRendererImpl.r().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.z(sb, propertyDescriptor, null);
                    FieldDescriptor fieldDescriptorQ0 = propertyDescriptor.q0();
                    if (fieldDescriptorQ0 != null) {
                        descriptorRendererImpl.z(sb, fieldDescriptorQ0, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor fieldDescriptorK = propertyDescriptor.K();
                    if (fieldDescriptorK != null) {
                        descriptorRendererImpl.z(sb, fieldDescriptorK, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.G.getValue(descriptorRendererOptionsImpl, kPropertyArr[31])) == PropertyAccessorRenderingPolicy.f44273Y) {
                        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.z(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.z(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List listE = setter.e();
                            Intrinsics.e(listE, "setter.valueParameters");
                            ValueParameterDescriptor it = (ValueParameterDescriptor) CollectionsKt.W(listE);
                            Intrinsics.e(it, "it");
                            descriptorRendererImpl.z(sb, it, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                List listR0 = propertyDescriptor.r0();
                Intrinsics.e(listR0, "property.contextReceiverParameters");
                descriptorRendererImpl.D(sb, listR0);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.e(visibility, "property.visibility");
                descriptorRendererImpl.k0(visibility, sb);
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.M(propertyDescriptor, sb);
                descriptorRendererImpl.O(sb, propertyDescriptor);
                descriptorRendererImpl.U(sb, propertyDescriptor);
                descriptorRendererImpl.P(sb, descriptorRendererImpl.r().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.s0(), "lateinit");
                descriptorRendererImpl.L(sb, propertyDescriptor);
            }
            descriptorRendererImpl.h0(propertyDescriptor, sb, false);
            List typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.e(typeParameters, "property.typeParameters");
            descriptorRendererImpl.f0(typeParameters, sb, true);
            descriptorRendererImpl.X(sb, propertyDescriptor);
        }
        descriptorRendererImpl.R(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.e(type, "property.type");
        sb.append(descriptorRendererImpl.a0(type));
        descriptorRendererImpl.Y(sb, propertyDescriptor);
        descriptorRendererImpl.J(propertyDescriptor, sb);
        List typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.e(typeParameters2, "property.typeParameters");
        descriptorRendererImpl.l0(sb, typeParameters2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[RETURN] */
    public static Modality w(MemberDescriptor memberDescriptor) {
        boolean z2 = memberDescriptor instanceof ClassDescriptor;
        Modality modality = Modality.e0;
        ClassKind classKind = ClassKind.f43559Y;
        Modality modality2 = Modality.X;
        if (z2) {
            if (((ClassDescriptor) memberDescriptor).getKind() == classKind) {
                return modality;
            }
            return modality2;
        }
        DeclarationDescriptor declarationDescriptorD = memberDescriptor.d();
        ClassDescriptor classDescriptor = declarationDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorD : null;
        if (classDescriptor != null && (memberDescriptor instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            Collection collectionL = callableMemberDescriptor.l();
            Intrinsics.e(collectionL, "this.overriddenDescriptors");
            boolean zIsEmpty = collectionL.isEmpty();
            Modality modality3 = Modality.Z;
            if (zIsEmpty || classDescriptor.q() == modality2) {
                if (classDescriptor.getKind() == classKind && !Intrinsics.a(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f43561a)) {
                    if (callableMemberDescriptor.q() == modality) {
                        return modality;
                    }
                }
            }
            return modality3;
        }
        return modality2;
    }

    public final void B(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List listP = classifierDescriptorWithTypeParameters.p();
        Intrinsics.e(listP, "classifier.declaredTypeParameters");
        List parameters = classifierDescriptorWithTypeParameters.h().getParameters();
        Intrinsics.e(parameters, "classifier.typeConstructor.parameters");
        if (v() && classifierDescriptorWithTypeParameters.w() && parameters.size() > listP.size()) {
            sb.append(" /*captured type parameters: ");
            e0(sb, parameters.subList(listP.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String C(ConstantValue constantValue) {
        if (constantValue instanceof ArrayValue) {
            return CollectionsKt.D((Iterable) ((ArrayValue) constantValue).f44302a, ", ", "{", "}", new Function1<ConstantValue<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstant$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ConstantValue it = (ConstantValue) obj;
                    Intrinsics.f(it, "it");
                    int i2 = DescriptorRendererImpl.f;
                    return this.X.C(it);
                }
            }, 24);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.D(y((AnnotationDescriptor) ((AnnotationValue) constantValue).f44302a, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value = (KClassValue.Value) ((KClassValue) constantValue).f44302a;
        if (value instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value).f44309a + "::class";
        }
        if (!(value instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
        String strB = normalClass.f44310a.f44300a.b().b();
        ClassLiteralValue classLiteralValue = normalClass.f44310a;
        for (int i2 = 0; i2 < classLiteralValue.f44301b; i2++) {
            strB = a.i('>', "kotlin.Array<", strB);
        }
        return android.support.v4.media.a.m(strB, "::class");
    }

    public final void D(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) it.next();
            z(sb, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.e(type, "contextReceiver.type");
            sb.append(H(type));
            if (i2 == CollectionsKt.A(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    public final void E(StringBuilder sb, SimpleType simpleType) {
        z(sb, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType simpleType2 = definitelyNotNullType != null ? definitelyNotNullType.f44501Y : null;
        if (KotlinTypeKt.a(simpleType)) {
            boolean z2 = simpleType instanceof ErrorType;
            boolean z3 = z2 && ((ErrorType) simpleType).e0.f44589Y;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (z3) {
                if (((Boolean) descriptorRendererOptionsImpl.T.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[45])).booleanValue()) {
                    ErrorUtils errorUtils = ErrorUtils.f44590a;
                    if (z2) {
                        boolean z4 = ((ErrorType) simpleType).e0.f44589Y;
                    }
                    TypeConstructor typeConstructorH0 = simpleType.H0();
                    Intrinsics.d(typeConstructorH0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb.append(F(((ErrorTypeConstructor) typeConstructorH0).f44587b[0]));
                } else {
                    if (z2) {
                        if (((Boolean) descriptorRendererOptionsImpl.f44255V.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[47])).booleanValue()) {
                            sb.append(simpleType.H0().toString());
                        } else {
                            sb.append(((ErrorType) simpleType).i0);
                        }
                    } else {
                        sb.append(simpleType.H0().toString());
                    }
                    sb.append(b0(simpleType.F0()));
                }
            } else {
                if (z2) {
                    if (((Boolean) descriptorRendererOptionsImpl.f44255V.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[47])).booleanValue()) {
                        sb.append(((ErrorType) simpleType).i0);
                    } else {
                        sb.append(simpleType.H0().toString());
                    }
                } else {
                    sb.append(simpleType.H0().toString());
                }
                sb.append(b0(simpleType.F0()));
            }
        } else {
            if ((simpleType instanceof StubTypeForBuilderInference) || (simpleType2 instanceof StubTypeForBuilderInference)) {
                throw null;
            }
            TypeConstructor typeConstructorH1 = simpleType.H0();
            ClassifierDescriptor classifierDescriptorC = simpleType.H0().c();
            PossiblyInnerType possiblyInnerTypeA = TypeParameterUtilsKt.a(simpleType, classifierDescriptorC instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC : null, 0);
            if (possiblyInnerTypeA == null) {
                sb.append(c0(typeConstructorH1));
                sb.append(b0(simpleType.F0()));
            } else {
                W(sb, possiblyInnerTypeA);
            }
        }
        if (simpleType.I0()) {
            sb.append("?");
        }
        if (simpleType instanceof DefinitelyNotNullType) {
            sb.append(" & Any");
        }
    }

    public final String F(String str) {
        int iOrdinal = t().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return android.support.v4.media.a.n("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String G(String lowerRendered, String upperRendered, KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.f(lowerRendered, "lowerRendered");
        Intrinsics.f(upperRendered, "upperRendered");
        if (RenderingUtilsKt.d(lowerRendered, upperRendered)) {
            return StringsKt.M(upperRendered, "(", false) ? android.support.v4.media.a.n("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.f44257b;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        String strT = StringsKt.T(((ClassifierNamePolicy) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[0])).a(kotlinBuiltIns.i(StandardNames.FqNames.f43482B), this), "Collection");
        String strC = RenderingUtilsKt.c(lowerRendered, strT.concat("Mutable"), upperRendered, strT, strT.concat("(Mutable)"));
        if (strC != null) {
            return strC;
        }
        String strC2 = RenderingUtilsKt.c(lowerRendered, strT.concat("MutableMap.MutableEntry"), upperRendered, strT.concat("Map.Entry"), strT.concat("(Mutable)Map.(Mutable)Entry"));
        if (strC2 != null) {
            return strC2;
        }
        ClassifierNamePolicy classifierNamePolicy = (ClassifierNamePolicy) descriptorRendererOptionsImpl.f44257b.getValue(descriptorRendererOptionsImpl, kPropertyArr[0]);
        ClassDescriptor classDescriptorJ = kotlinBuiltIns.j("Array");
        Intrinsics.e(classDescriptorJ, "builtIns.array");
        String strT2 = StringsKt.T(classifierNamePolicy.a(classDescriptorJ, this), "Array");
        String strC3 = RenderingUtilsKt.c(lowerRendered, strT2.concat(q("Array<")), upperRendered, strT2.concat(q("Array<out ")), strT2.concat(q("Array<(out) ")));
        if (strC3 != null) {
            return strC3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String H(KotlinType kotlinType) {
        String strA0 = a0(kotlinType);
        return ((!m0(kotlinType) || TypeUtils.e(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strA0 : a.i(')', "(", strA0);
    }

    public final String I(FqNameUnsafe fqNameUnsafe) {
        List listE = fqNameUnsafe.e();
        Intrinsics.e(listE, "fqName.pathSegments()");
        return q(RenderingUtilsKt.b(listE));
    }

    public final void J(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue constantValueH0;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (!((Boolean) descriptorRendererOptionsImpl.f44265u.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[19])).booleanValue() || (constantValueH0 = variableDescriptor.h0()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(q(C(constantValueH0)));
    }

    public final String K(String str) {
        int iOrdinal = t().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (!((Boolean) descriptorRendererOptionsImpl.f44254U.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[46])).booleanValue()) {
                return android.support.v4.media.a.n("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void L(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (r().contains(DescriptorRendererModifier.MEMBER_KIND) && v() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.X) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.c(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    public final void M(MemberDescriptor memberDescriptor, StringBuilder sb) {
        P(sb, memberDescriptor.isExternal(), a4.f24256e);
        boolean z2 = false;
        P(sb, r().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.d0(), "expect");
        if (r().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.R()) {
            z2 = true;
        }
        P(sb, z2, "actual");
    }

    public final void N(Modality modality, StringBuilder sb, Modality modality2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.f44264p.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[14])).booleanValue() || modality != modality2) {
            P(sb, r().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.c(modality.name()));
        }
    }

    public final void O(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (DescriptorUtils.s(callableMemberDescriptor) && callableMemberDescriptor.q() == Modality.X) {
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f44244A.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[25])) == OverrideRenderingPolicy.X && callableMemberDescriptor.q() == Modality.Z && !callableMemberDescriptor.l().isEmpty()) {
            return;
        }
        Modality modalityQ = callableMemberDescriptor.q();
        Intrinsics.e(modalityQ, "callable.modality");
        N(modalityQ, sb, w(callableMemberDescriptor));
    }

    public final void P(StringBuilder sb, boolean z2, String str) {
        if (z2) {
            sb.append(K(str));
            sb.append(" ");
        }
    }

    public final String Q(Name name, boolean z2) {
        String strQ = q(RenderingUtilsKt.a(name));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (((Boolean) descriptorRendererOptionsImpl.f44254U.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[46])).booleanValue() && t() == RenderingFormat.f44274Y && z2) ? android.support.v4.media.a.n("<b>", strQ, "</b>") : strQ;
    }

    public final void R(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z2) {
        Name name = declarationDescriptor.getName();
        Intrinsics.e(name, "descriptor.name");
        sb.append(Q(name, z2));
    }

    public final void S(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        AbbreviatedType abbreviatedType = unwrappedTypeK0 instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeK0 : null;
        if (abbreviatedType == null) {
            T(sb, kotlinType);
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        boolean zBooleanValue = ((Boolean) descriptorRendererOptionsImpl.f44252Q.getValue(descriptorRendererOptionsImpl, kPropertyArr[41])).booleanValue();
        SimpleType simpleType = abbreviatedType.f44487Y;
        if (zBooleanValue) {
            T(sb, simpleType);
            return;
        }
        T(sb, abbreviatedType.Z);
        if (((Boolean) descriptorRendererOptionsImpl.f44251P.getValue(descriptorRendererOptionsImpl, kPropertyArr[40])).booleanValue()) {
            RenderingFormat renderingFormatT = t();
            RenderingFormat renderingFormat = RenderingFormat.f44274Y;
            if (renderingFormatT == renderingFormat) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            T(sb, simpleType);
            sb.append(" */");
            if (t() == renderingFormat) {
                sb.append("</i></font>");
            }
        }
    }

    public final void T(StringBuilder sb, KotlinType kotlinType) {
        Name nameC;
        String strQ;
        boolean z2 = kotlinType instanceof WrappedType;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (z2 && descriptorRendererOptionsImpl.p() && !((WrappedType) kotlinType).M0()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrappedTypeK0).P0(this, this));
            return;
        }
        if (unwrappedTypeK0 instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeK0;
            if (simpleType.equals(TypeUtils.f44556b) || simpleType.H0() == TypeUtils.f44555a.f44585Y) {
                sb.append("???");
                return;
            }
            TypeConstructor typeConstructorH0 = simpleType.H0();
            if ((typeConstructorH0 instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) typeConstructorH0).f44586a == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
                if (!((Boolean) descriptorRendererOptionsImpl.t.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[18])).booleanValue()) {
                    sb.append("???");
                    return;
                }
                TypeConstructor typeConstructorH1 = simpleType.H0();
                Intrinsics.d(typeConstructorH1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(F(((ErrorTypeConstructor) typeConstructorH1).f44587b[0]));
                return;
            }
            if (KotlinTypeKt.a(simpleType)) {
                E(sb, simpleType);
                return;
            }
            if (!m0(simpleType)) {
                E(sb, simpleType);
                return;
            }
            int length = sb.length();
            ((DescriptorRendererImpl) this.f44241e.getX()).z(sb, simpleType, null);
            boolean z3 = sb.length() != length;
            KotlinType kotlinTypeF = FunctionTypesKt.f(simpleType);
            List listD = FunctionTypesKt.d(simpleType);
            if (!listD.isEmpty()) {
                sb.append("context(");
                Iterator it = listD.subList(0, CollectionsKt.A(listD)).iterator();
                while (it.hasNext()) {
                    S(sb, (KotlinType) it.next());
                    sb.append(", ");
                }
                S(sb, (KotlinType) CollectionsKt.F(listD));
                sb.append(") ");
            }
            boolean zI = FunctionTypesKt.i(simpleType);
            boolean zI0 = simpleType.I0();
            boolean z4 = zI0 || (z3 && kotlinTypeF != null);
            if (z4) {
                if (zI) {
                    sb.insert(length, '(');
                } else {
                    if (z3) {
                        CharsKt.c(StringsKt.x(sb));
                        if (sb.charAt(StringsKt.t(sb) - 1) != ')') {
                            sb.insert(StringsKt.t(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            P(sb, zI, "suspend");
            if (kotlinTypeF != null) {
                boolean z5 = (m0(kotlinTypeF) && !kotlinTypeF.I0()) || FunctionTypesKt.i(kotlinTypeF) || !kotlinTypeF.getAnnotations().isEmpty() || (kotlinTypeF instanceof DefinitelyNotNullType);
                if (z5) {
                    sb.append("(");
                }
                S(sb, kotlinTypeF);
                if (z5) {
                    sb.append(")");
                }
                sb.append(mo.ono);
            }
            sb.append("(");
            if (!FunctionTypesKt.h(simpleType) || simpleType.getAnnotations().b(StandardNames.FqNames.f43504p) == null || simpleType.F0().size() > 1) {
                int i2 = 0;
                for (TypeProjection typeProjection : FunctionTypesKt.g(simpleType)) {
                    int i3 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) descriptorRendererOptionsImpl.S.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[43])).booleanValue()) {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.e(type, "typeProjection.type");
                        nameC = FunctionTypesKt.c(type);
                    } else {
                        nameC = null;
                    }
                    if (nameC != null) {
                        sb.append(Q(nameC, false));
                        sb.append(": ");
                    }
                    sb.append(g0(typeProjection));
                    i2 = i3;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = t().ordinal();
            if (iOrdinal == 0) {
                strQ = q("->");
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                strQ = "&rarr;";
            }
            sb.append(strQ);
            sb.append(" ");
            FunctionTypesKt.h(simpleType);
            KotlinType type2 = ((TypeProjection) CollectionsKt.F(simpleType.F0())).getType();
            Intrinsics.e(type2, "arguments.last().type");
            S(sb, type2);
            if (z4) {
                sb.append(")");
            }
            if (zI0) {
                sb.append("?");
            }
        }
    }

    public final void U(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (r().contains(DescriptorRendererModifier.OVERRIDE) && !callableMemberDescriptor.l().isEmpty()) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f44244A.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[25])) != OverrideRenderingPolicy.f44271Y) {
                P(sb, true, "override");
                if (v()) {
                    sb.append("/*");
                    sb.append(callableMemberDescriptor.l().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void V(FqName fqName, String str, StringBuilder sb) {
        sb.append(K(str));
        FqNameUnsafe fqNameUnsafeI = fqName.i();
        Intrinsics.e(fqNameUnsafeI, "fqName.toUnsafe()");
        String strI = I(fqNameUnsafeI);
        if (strI.length() > 0) {
            sb.append(" ");
            sb.append(strI);
        }
    }

    public final void W(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerType2 = possiblyInnerType.f43586c;
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = possiblyInnerType.f43584a;
        if (possiblyInnerType2 != null) {
            W(sb, possiblyInnerType2);
            sb.append('.');
            Name name = classifierDescriptorWithTypeParameters.getName();
            Intrinsics.e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(Q(name, false));
        } else {
            TypeConstructor typeConstructorH = classifierDescriptorWithTypeParameters.h();
            Intrinsics.e(typeConstructorH, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(c0(typeConstructorH));
        }
        sb.append(b0(possiblyInnerType.f43585b));
    }

    public final void X(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorJ = callableMemberDescriptor.J();
        if (receiverParameterDescriptorJ != null) {
            z(sb, receiverParameterDescriptorJ, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptorJ.getType();
            Intrinsics.e(type, "receiver.type");
            sb.append(H(type));
            sb.append(mo.ono);
        }
    }

    public final void Y(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorJ;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.f44246E.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[29])).booleanValue() && (receiverParameterDescriptorJ = callableMemberDescriptor.J()) != null) {
            sb.append(" on ");
            KotlinType type = receiverParameterDescriptorJ.getType();
            Intrinsics.e(type, "receiver.type");
            sb.append(a0(type));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void a() {
        this.d.a();
    }

    public final String a0(KotlinType type) {
        Intrinsics.f(type, "type");
        StringBuilder sb = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        S(sb, (KotlinType) ((Function1) descriptorRendererOptionsImpl.x.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[22])).invoke(type));
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void b() {
        this.d.b();
    }

    public final String b0(List typeArguments) {
        Intrinsics.f(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(q("<"));
        CollectionsKt.C(typeArguments, sb, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        sb.append(q(">"));
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void c(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.d.c(parameterNameRenderingPolicy);
    }

    public final String c0(TypeConstructor typeConstructor) {
        Intrinsics.f(typeConstructor, "typeConstructor");
        ClassifierDescriptor klass = typeConstructor.c();
        if (klass instanceof TypeParameterDescriptor ? true : klass instanceof ClassDescriptor ? true : klass instanceof TypeAliasDescriptor) {
            Intrinsics.f(klass, "klass");
            if (ErrorUtils.f(klass)) {
                return klass.h().toString();
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            return ((ClassifierNamePolicy) descriptorRendererOptionsImpl.f44257b.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[0])).a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).g(DescriptorRendererImpl$renderTypeConstructor$1.X) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void d() {
        this.d.d();
    }

    public final void d0(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z2) {
        if (z2) {
            sb.append(q("<"));
        }
        if (v()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.g());
            sb.append("*/ ");
        }
        P(sb, typeParameterDescriptor.t(), "reified");
        String str = typeParameterDescriptor.j().X;
        boolean z3 = true;
        P(sb, str.length() > 0, str);
        z(sb, typeParameterDescriptor, null);
        R(typeParameterDescriptor, sb, z2);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z2) || size == 1) {
            KotlinType kotlinType = (KotlinType) typeParameterDescriptor.getUpperBounds().iterator().next();
            if (kotlinType == null) {
                KotlinBuiltIns.a(141);
                throw null;
            }
            if (!KotlinBuiltIns.w(kotlinType) || !kotlinType.I0()) {
                sb.append(" : ");
                sb.append(a0(kotlinType));
            }
        } else if (z2) {
            for (KotlinType kotlinType2 : typeParameterDescriptor.getUpperBounds()) {
                if (kotlinType2 == null) {
                    KotlinBuiltIns.a(141);
                    throw null;
                }
                if (!KotlinBuiltIns.w(kotlinType2) || !kotlinType2.I0()) {
                    if (z3) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(a0(kotlinType2));
                    z3 = false;
                }
            }
        }
        if (z2) {
            sb.append(q(">"));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void e() {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
        this.d.e();
    }

    public final void e0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0((TypeParameterDescriptor) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void f() {
        this.d.f();
    }

    public final void f0(List list, StringBuilder sb, boolean z2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.v.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[20])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(q("<"));
        e0(sb, list);
        sb.append(q(">"));
        if (z2) {
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final Set g() {
        return this.d.g();
    }

    public final String g0(TypeProjection typeProjection) {
        Intrinsics.f(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        CollectionsKt.C(CollectionsKt.H(typeProjection), sb, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void h() {
        this.d.h();
    }

    public final void h0(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z2) {
        if (z2 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(K(variableDescriptor.I() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void i() {
        this.d.i();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final void i0(ValueParameterDescriptor valueParameterDescriptor, boolean z2, StringBuilder sb, boolean z3) {
        boolean z4;
        if (z3) {
            sb.append(K("value-parameter"));
            sb.append(" ");
        }
        if (v()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.g());
            sb.append("*/ ");
        }
        z(sb, valueParameterDescriptor, null);
        P(sb, valueParameterDescriptor.k0(), "crossinline");
        P(sb, valueParameterDescriptor.i0(), "noinline");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        boolean z5 = false;
        if (((Boolean) descriptorRendererOptionsImpl.r.getValue(descriptorRendererOptionsImpl, kPropertyArr[16])).booleanValue()) {
            CallableDescriptor callableDescriptorD = valueParameterDescriptor.d();
            ClassConstructorDescriptor classConstructorDescriptor = callableDescriptorD instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableDescriptorD : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.U()) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (z4) {
            P(sb, ((Boolean) descriptorRendererOptionsImpl.s.getValue(descriptorRendererOptionsImpl, kPropertyArr[17])).booleanValue(), "actual");
        }
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.e(type, "variable.type");
        KotlinType kotlinTypeO0 = valueParameterDescriptor.o0();
        KotlinType kotlinType = kotlinTypeO0 == null ? type : kotlinTypeO0;
        P(sb, kotlinTypeO0 != null, "vararg");
        if (z4 || (z3 && !s())) {
            h0(valueParameterDescriptor, sb, z4);
        }
        if (z2) {
            R(valueParameterDescriptor, sb, z3);
            sb.append(": ");
        }
        sb.append(a0(kotlinType));
        J(valueParameterDescriptor, sb);
        if (v() && kotlinTypeO0 != null) {
            sb.append(" /*");
            sb.append(a0(type));
            sb.append("*/");
        }
        if (((Function1) descriptorRendererOptionsImpl.y.getValue(descriptorRendererOptionsImpl, kPropertyArr[23])) != null) {
            if (descriptorRendererOptionsImpl.p() ? valueParameterDescriptor.u0() : DescriptorUtilsKt.a(valueParameterDescriptor)) {
                z5 = true;
            }
        }
        if (z5) {
            StringBuilder sb2 = new StringBuilder(" = ");
            Function1 function1 = (Function1) descriptorRendererOptionsImpl.y.getValue(descriptorRendererOptionsImpl, kPropertyArr[23]);
            Intrinsics.c(function1);
            sb2.append((String) function1.invoke(valueParameterDescriptor));
            sb.append(sb2.toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void j(Set set) {
        Intrinsics.f(set, "<set-?>");
        this.d.j(set);
    }

    public final void j0(Collection collection, boolean z2, StringBuilder sb) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        int iOrdinal = ((ParameterNameRenderingPolicy) descriptorRendererOptionsImpl.D.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[28])).ordinal();
        boolean z3 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z2) {
            }
            z3 = false;
        }
        int size = collection.size();
        u().a(sb);
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
            u().b(valueParameterDescriptor, sb);
            i0(valueParameterDescriptor, z3, sb, false);
            u().c(valueParameterDescriptor, i2, size, sb);
            i2++;
        }
        u().d(sb);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void k(LinkedHashSet linkedHashSet) {
        this.d.k(linkedHashSet);
    }

    public final boolean k0(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!r().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        if (((Boolean) descriptorRendererOptionsImpl.f44263n.getValue(descriptorRendererOptionsImpl, kPropertyArr[12])).booleanValue()) {
            descriptorVisibility = descriptorVisibility.d();
        }
        if (!((Boolean) descriptorRendererOptionsImpl.o.getValue(descriptorRendererOptionsImpl, kPropertyArr[13])).booleanValue() && descriptorVisibility.equals(DescriptorVisibilities.k)) {
            return false;
        }
        sb.append(K(descriptorVisibility.b()));
        sb.append(" ");
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void l(ClassifierNamePolicy classifierNamePolicy) {
        this.d.l(classifierNamePolicy);
    }

    public final void l0(StringBuilder sb, List list) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.v.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.e(upperBounds, "typeParameter.upperBounds");
            for (KotlinType it2 : CollectionsKt.r(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.e(name, "typeParameter.name");
                sb2.append(Q(name, false));
                sb2.append(" : ");
                Intrinsics.e(it2, "it");
                sb2.append(a0(it2));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(K("where"));
        sb.append(" ");
        CollectionsKt.C(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void m() {
        this.d.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void n() {
        this.d.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void o() {
        this.d.o();
    }

    public final String q(String str) {
        return t().b(str);
    }

    public final Set r() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (Set) descriptorRendererOptionsImpl.f44259e.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[3]);
    }

    public final boolean s() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return ((Boolean) descriptorRendererOptionsImpl.f.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[4])).booleanValue();
    }

    public final RenderingFormat t() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (RenderingFormat) descriptorRendererOptionsImpl.C.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[27]);
    }

    public final DescriptorRenderer.ValueParametersHandler u() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (DescriptorRenderer.ValueParametersHandler) descriptorRendererOptionsImpl.f44245B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[26]);
    }

    public final boolean v() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return ((Boolean) descriptorRendererOptionsImpl.j.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[8])).booleanValue();
    }

    public final String x(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorD;
        Intrinsics.f(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.v(new RenderDeclarationDescriptorVisitor(), sb);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.f44258c;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        if (((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[1])).booleanValue() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (declarationDescriptorD = declarationDescriptor.d()) != null && !(declarationDescriptorD instanceof ModuleDescriptor)) {
            sb.append(" ");
            String strN = "defined in";
            int iOrdinal = t().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                strN = android.support.v4.media.a.n("<i>", "defined in", "</i>");
            }
            sb.append(strN);
            sb.append(" ");
            FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(declarationDescriptorD);
            Intrinsics.e(fqNameUnsafeG, "getFqName(containingDeclaration)");
            sb.append(fqNameUnsafeG.f44168a.isEmpty() ? "root package" : I(fqNameUnsafeG));
            if (((Boolean) descriptorRendererOptionsImpl.d.getValue(descriptorRendererOptionsImpl, kPropertyArr[2])).booleanValue() && (declarationDescriptorD instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                ((DeclarationDescriptorWithSource) declarationDescriptor).f().getClass();
            }
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String y(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) {
        ClassConstructorDescriptor classConstructorDescriptorZ;
        List listE;
        Intrinsics.f(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.X + AbstractJsonLexerKt.COLON);
        }
        KotlinType type = annotation.getType();
        sb.append(a0(type));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        KProperty kProperty = kPropertyArr[37];
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.M;
        if (((AnnotationArgumentsRenderingPolicy) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kProperty)).X) {
            Map mapA = annotation.a();
            List list = null;
            ClassDescriptor classDescriptorD = ((Boolean) descriptorRendererOptionsImpl.H.getValue(descriptorRendererOptionsImpl, kPropertyArr[32])).booleanValue() ? DescriptorUtilsKt.d(annotation) : null;
            if (classDescriptorD != null && (classConstructorDescriptorZ = classDescriptorD.z()) != null && (listE = classConstructorDescriptorZ.e()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listE) {
                    if (((ValueParameterDescriptor) obj).u0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = EmptyList.X;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Name it2 = (Name) obj2;
                Intrinsics.e(it2, "it");
                if (!mapA.containsKey(it2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((Name) it3.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapA.entrySet();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.n(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                Name name = (Name) entry.getKey();
                ConstantValue constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.b());
                sb2.append(" = ");
                sb2.append(!list.contains(name) ? C(constantValue) : "...");
                arrayList5.add(sb2.toString());
            }
            List listB0 = CollectionsKt.b0(CollectionsKt.O(arrayList5, arrayList4));
            if (((AnnotationArgumentsRenderingPolicy) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[37])).f44233Y || !listB0.isEmpty()) {
                CollectionsKt.C(listB0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (v() && (KotlinTypeKt.a(type) || (type.H0().c() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void z(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (r().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            boolean z2 = annotated instanceof KotlinType;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            Set setG = z2 ? descriptorRendererOptionsImpl.g() : (Set) descriptorRendererOptionsImpl.f44249J.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[34]);
            Function1 function1 = (Function1) descriptorRendererOptionsImpl.L.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[36]);
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.o(setG, annotationDescriptor.c()) && !Intrinsics.a(annotationDescriptor.c(), StandardNames.FqNames.r) && (function1 == null || ((Boolean) function1.invoke(annotationDescriptor)).booleanValue())) {
                    sb.append(y(annotationDescriptor, annotationUseSiteTarget));
                    if (((Boolean) descriptorRendererOptionsImpl.f44248I.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[33])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
