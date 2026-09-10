package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public FieldDescriptorImpl A0;
    public final Modality j0;
    public DescriptorVisibility k0;
    public Collection l0;
    public final PropertyDescriptor m0;
    public final CallableMemberDescriptor.Kind n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public List t0;
    public ReceiverParameterDescriptor u0;
    public ReceiverParameterDescriptorImpl v0;
    public ArrayList w0;
    public PropertyGetterDescriptorImpl x0;
    public PropertySetterDescriptorImpl y0;
    public FieldDescriptorImpl z0;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DeclarationDescriptor f43656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Modality f43657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DescriptorVisibility f43658c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CallableMemberDescriptor.Kind f43659e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ReceiverParameterDescriptor f43660h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Name f43661i;
        public final KotlinType j;
        public PropertyDescriptor d = null;
        public TypeSubstitution f = TypeSubstitution.f44548a;
        public boolean g = true;

        public CopyConfiguration() {
            this.f43656a = PropertyDescriptorImpl.this.d();
            this.f43657b = PropertyDescriptorImpl.this.q();
            this.f43658c = PropertyDescriptorImpl.this.getVisibility();
            this.f43659e = PropertyDescriptorImpl.this.getKind();
            this.f43660h = PropertyDescriptorImpl.this.u0;
            this.f43661i = PropertyDescriptorImpl.this.getName();
            this.j = PropertyDescriptorImpl.this.getType();
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 5 && i2 != 7 && i2 != 9 && i2 != 11 && i2 != 19 && i2 != 13 && i2 != 14 && i2 != 16 && i2 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor] */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r16v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor] */
        /* JADX WARN: Type inference failed for: r16v5 */
        /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22, types: [kotlin.reflect.jvm.internal.impl.types.KotlinType] */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v15, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r4v20 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl] */
        public final PropertyDescriptorImpl b() {
            AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor;
            ?? propertyGetterDescriptorImpl;
            ?? propertySetterDescriptorImpl;
            TypeSubstitutor typeSubstitutor;
            ?? r2;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2;
            KotlinType kotlinTypeI;
            PropertyDescriptorImpl propertyDescriptorImpl = PropertyDescriptorImpl.this;
            propertyDescriptorImpl.getClass();
            DeclarationDescriptor declarationDescriptor = this.f43656a;
            Modality modality = this.f43657b;
            DescriptorVisibility descriptorVisibility = this.f43658c;
            PropertyDescriptor propertyDescriptor = this.d;
            CallableMemberDescriptor.Kind kind = this.f43659e;
            SourceElement sourceElement = SourceElement.f43591a;
            ?? J0 = propertyDescriptorImpl.J0(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, this.f43661i);
            List typeParameters = propertyDescriptorImpl.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            TypeSubstitutor typeSubstitutorB = DescriptorSubstitutor.b(typeParameters, this.f, J0, arrayList);
            Variance variance = Variance.OUT_VARIANCE;
            KotlinType kotlinType = this.j;
            KotlinType kotlinTypeI2 = typeSubstitutorB.i(kotlinType, variance);
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl3 = null;
            if (kotlinTypeI2 != null) {
                Variance variance2 = Variance.IN_VARIANCE;
                KotlinType kotlinTypeI3 = typeSubstitutorB.i(kotlinType, variance2);
                if (kotlinTypeI3 != null) {
                    J0.L0(kotlinTypeI3);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor = this.f43660h;
                if (receiverParameterDescriptor != null) {
                    AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptorB = receiverParameterDescriptor.b(typeSubstitutorB);
                    abstractReceiverParameterDescriptor = abstractReceiverParameterDescriptorB != null ? abstractReceiverParameterDescriptorB : null;
                }
                ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl4 = propertyDescriptorImpl.v0;
                ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl5 = (receiverParameterDescriptorImpl4 == null || (kotlinTypeI = typeSubstitutorB.i(receiverParameterDescriptorImpl4.getType(), variance2)) == null) ? null : new ReceiverParameterDescriptorImpl(J0, new ExtensionReceiver(J0, kotlinTypeI, receiverParameterDescriptorImpl4.getValue()), receiverParameterDescriptorImpl4.getAnnotations());
                ArrayList arrayList2 = new ArrayList();
                for (Iterator it = propertyDescriptorImpl.t0.iterator(); it.hasNext(); it = it) {
                    ReceiverParameterDescriptor receiverParameterDescriptor2 = (ReceiverParameterDescriptor) it.next();
                    KotlinType kotlinTypeI4 = typeSubstitutorB.i(receiverParameterDescriptor2.getType(), variance2);
                    if (kotlinTypeI4 == null) {
                        receiverParameterDescriptorImpl = receiverParameterDescriptorImpl3;
                        receiverParameterDescriptorImpl2 = receiverParameterDescriptorImpl;
                    } else {
                        receiverParameterDescriptorImpl2 = receiverParameterDescriptorImpl3;
                        receiverParameterDescriptorImpl = new ReceiverParameterDescriptorImpl(J0, new ContextReceiver(J0, kotlinTypeI4, ((ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).a(), receiverParameterDescriptor2.getValue()), receiverParameterDescriptor2.getAnnotations());
                    }
                    if (receiverParameterDescriptorImpl != null) {
                        arrayList2.add(receiverParameterDescriptorImpl);
                    }
                    variance2 = variance2;
                    receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl2;
                }
                ?? r18 = receiverParameterDescriptorImpl3;
                J0.M0(kotlinTypeI2, arrayList, abstractReceiverParameterDescriptor, receiverParameterDescriptorImpl5, arrayList2);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = propertyDescriptorImpl.x0;
                CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.f43557Y;
                if (propertyGetterDescriptorImpl2 == null) {
                    propertyGetterDescriptorImpl = r18;
                } else {
                    Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
                    Modality modality2 = this.f43657b;
                    DescriptorVisibility visibility = propertyDescriptorImpl.x0.getVisibility();
                    if (this.f43659e == kind2 && DescriptorVisibilities.e(visibility.d())) {
                        visibility = DescriptorVisibilities.f43565h;
                    }
                    DescriptorVisibility descriptorVisibility2 = visibility;
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyDescriptorImpl.x0;
                    boolean z2 = propertyGetterDescriptorImpl3.f0;
                    CallableMemberDescriptor.Kind kind3 = this.f43659e;
                    PropertyDescriptor propertyDescriptor2 = this.d;
                    propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(J0, annotations, modality2, descriptorVisibility2, z2, propertyGetterDescriptorImpl3.g0, propertyGetterDescriptorImpl3.j0, kind3, propertyDescriptor2 == null ? r18 : propertyDescriptor2.getGetter(), sourceElement);
                }
                if (propertyGetterDescriptorImpl != 0) {
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl4 = propertyDescriptorImpl.x0;
                    KotlinType kotlinType2 = propertyGetterDescriptorImpl4.n0;
                    propertyGetterDescriptorImpl.m0 = propertyGetterDescriptorImpl4.l0() != null ? propertyGetterDescriptorImpl4.l0().b(typeSubstitutorB) : r18;
                    propertyGetterDescriptorImpl.I0(kotlinType2 != null ? typeSubstitutorB.i(kotlinType2, variance) : r18);
                }
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = propertyDescriptorImpl.y0;
                if (propertySetterDescriptorImpl2 == null) {
                    propertySetterDescriptorImpl = r18;
                } else {
                    Annotations annotations2 = propertySetterDescriptorImpl2.getAnnotations();
                    Modality modality3 = this.f43657b;
                    DescriptorVisibility visibility2 = propertyDescriptorImpl.y0.getVisibility();
                    if (this.f43659e == kind2 && DescriptorVisibilities.e(visibility2.d())) {
                        visibility2 = DescriptorVisibilities.f43565h;
                    }
                    DescriptorVisibility descriptorVisibility3 = visibility2;
                    PropertySetterDescriptorImpl propertySetterDescriptorImpl3 = propertyDescriptorImpl.y0;
                    boolean z3 = propertySetterDescriptorImpl3.f0;
                    boolean z4 = propertySetterDescriptorImpl3.g0;
                    boolean z5 = propertySetterDescriptorImpl3.j0;
                    CallableMemberDescriptor.Kind kind4 = this.f43659e;
                    PropertyDescriptor propertyDescriptor3 = this.d;
                    propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(J0, annotations2, modality3, descriptorVisibility3, z3, z4, z5, kind4, propertyDescriptor3 == null ? r18 : propertyDescriptor3.getSetter(), sourceElement);
                }
                if (propertySetterDescriptorImpl != 0) {
                    typeSubstitutor = typeSubstitutorB;
                    List listI0 = FunctionDescriptorImpl.I0(propertySetterDescriptorImpl, propertyDescriptorImpl.y0.e(), typeSubstitutor, false, false, null);
                    if (listI0 == null) {
                        listI0 = Collections.singletonList(PropertySetterDescriptorImpl.H0(propertySetterDescriptorImpl, DescriptorUtilsKt.e(this.f43656a).m(), ((ValueParameterDescriptor) propertyDescriptorImpl.y0.e().get(0)).getAnnotations()));
                    }
                    if (listI0.size() != 1) {
                        throw new IllegalStateException();
                    }
                    PropertySetterDescriptorImpl propertySetterDescriptorImpl4 = propertyDescriptorImpl.y0;
                    if (propertySetterDescriptorImpl4 == null) {
                        PropertyDescriptorImpl.Z(31);
                        throw r18;
                    }
                    propertySetterDescriptorImpl.m0 = propertySetterDescriptorImpl4.l0() != null ? propertySetterDescriptorImpl4.l0().b(typeSubstitutor) : r18;
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) listI0.get(0);
                    if (valueParameterDescriptor == null) {
                        PropertySetterDescriptorImpl.Z(6);
                        throw r18;
                    }
                    propertySetterDescriptorImpl.n0 = valueParameterDescriptor;
                } else {
                    typeSubstitutor = typeSubstitutorB;
                }
                FieldDescriptorImpl fieldDescriptorImpl = propertyDescriptorImpl.z0;
                ?? fieldDescriptorImpl2 = fieldDescriptorImpl == null ? r18 : new FieldDescriptorImpl(fieldDescriptorImpl.getAnnotations(), J0);
                FieldDescriptorImpl fieldDescriptorImpl3 = propertyDescriptorImpl.A0;
                J0.K0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl2, fieldDescriptorImpl3 == null ? r18 : new FieldDescriptorImpl(fieldDescriptorImpl3.getAnnotations(), J0));
                if (this.g) {
                    SmartSet smartSet = new SmartSet();
                    Iterator it2 = propertyDescriptorImpl.l().iterator();
                    while (it2.hasNext()) {
                        smartSet.add(((PropertyDescriptor) it2.next()).b(typeSubstitutor));
                    }
                    J0.l0 = smartSet;
                }
                if (propertyDescriptorImpl.isConst() && (r2 = propertyDescriptorImpl.i0) != 0) {
                    J0.G0(propertyDescriptorImpl.h0, r2);
                }
                return J0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z2, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, z2, sourceElement);
        if (declarationDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations == null) {
            Z(1);
            throw null;
        }
        if (modality == null) {
            Z(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(3);
            throw null;
        }
        if (name == null) {
            Z(4);
            throw null;
        }
        if (kind == null) {
            Z(5);
            throw null;
        }
        if (sourceElement == null) {
            Z(6);
            throw null;
        }
        this.l0 = null;
        this.t0 = Collections.EMPTY_LIST;
        this.j0 = modality;
        this.k0 = descriptorVisibility;
        this.m0 = propertyDescriptor == null ? this : propertyDescriptor;
        this.n0 = kind;
        this.o0 = z3;
        this.p0 = z4;
        this.q0 = z5;
        this.r0 = z6;
        this.s0 = z7;
    }

    public static PropertyDescriptorImpl I0(ClassDescriptor classDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, boolean z2, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        if (classDescriptor == null) {
            Z(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(10);
            throw null;
        }
        if (name == null) {
            Z(11);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(classDescriptor, null, annotations$Companion$EMPTY$1, modality, descriptorVisibility, z2, name, kind, sourceElement, false, false, false, false, false);
        }
        Z(13);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void Z(int i2) {
        String str;
        int i3;
        if (i2 != 28 && i2 != 38 && i2 != 39 && i2 != 41 && i2 != 42) {
            switch (i2) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 28 && i2 != 38 && i2 != 39 && i2 != 41 && i2 != 42) {
            switch (i2) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i2 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i2 == 38) {
            objArr[1] = "getOriginal";
        } else if (i2 == 39) {
            objArr[1] = "getKind";
        } else if (i2 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 != 42) {
            switch (i2) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 28 && i2 != 38 && i2 != 39 && i2 != 41 && i2 != 42) {
            switch (i2) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor G() {
        return this.u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptorImpl C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f43557Y;
        CopyConfiguration copyConfiguration = new CopyConfiguration();
        if (classDescriptor == null) {
            CopyConfiguration.a(0);
            throw null;
        }
        copyConfiguration.f43656a = classDescriptor;
        copyConfiguration.d = null;
        copyConfiguration.f43657b = modality;
        if (delegatedDescriptorVisibility == null) {
            CopyConfiguration.a(8);
            throw null;
        }
        copyConfiguration.f43658c = delegatedDescriptorVisibility;
        copyConfiguration.f43659e = kind;
        copyConfiguration.g = false;
        PropertyDescriptorImpl propertyDescriptorImplB = copyConfiguration.b();
        if (propertyDescriptorImplB != null) {
            return propertyDescriptorImplB;
        }
        Z(42);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor J() {
        return this.v0;
    }

    public PropertyDescriptorImpl J0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name) {
        SourceElement sourceElement = SourceElement.f43591a;
        if (declarationDescriptor == null) {
            Z(32);
            throw null;
        }
        if (modality == null) {
            Z(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(34);
            throw null;
        }
        if (kind == null) {
            Z(35);
            throw null;
        }
        if (name == null) {
            Z(36);
            throw null;
        }
        Annotations annotations = getAnnotations();
        boolean zIsConst = isConst();
        boolean zIsExternal = isExternal();
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, this.g0, name, kind, sourceElement, this.o0, zIsConst, this.q0, zIsExternal, this.s0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor K() {
        return this.A0;
    }

    public final void K0(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptorImpl propertySetterDescriptorImpl, FieldDescriptorImpl fieldDescriptorImpl, FieldDescriptorImpl fieldDescriptorImpl2) {
        this.x0 = propertyGetterDescriptorImpl;
        this.y0 = propertySetterDescriptorImpl;
        this.z0 = fieldDescriptorImpl;
        this.A0 = fieldDescriptorImpl2;
    }

    public void L0(KotlinType kotlinType) {
    }

    public final void M0(KotlinType kotlinType, List list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, List list2) {
        if (kotlinType == null) {
            Z(17);
            throw null;
        }
        if (list == null) {
            Z(18);
            throw null;
        }
        if (list2 == null) {
            Z(19);
            throw null;
        }
        this.f0 = kotlinType;
        this.w0 = new ArrayList(list);
        this.v0 = receiverParameterDescriptorImpl;
        this.u0 = receiverParameterDescriptor;
        this.t0 = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return this.q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertyGetterDescriptorImpl getGetter() {
        return this.x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.n0;
        if (kind != null) {
            return kind;
        }
        Z(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        KotlinType type = getType();
        if (type != null) {
            return type;
        }
        Z(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertySetterDescriptor getSetter() {
        return this.y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List getTypeParameters() {
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.k0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        Z(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection l() {
        Collection collection = this.l0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        Z(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Object n0(CallableDescriptor.UserDataKey userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        Modality modality = this.j0;
        if (modality != null) {
            return modality;
        }
        Z(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor q0() {
        return this.z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List r0() {
        List list = this.t0;
        if (list != null) {
            return list;
        }
        Z(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final ArrayList s() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.x0;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.y0;
        if (propertySetterDescriptorImpl != null) {
            arrayList.add(propertySetterDescriptorImpl);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean s0() {
        return this.o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.g(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public final boolean x() {
        return this.s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void x0(Collection collection) {
        if (collection != null) {
            this.l0 = collection;
        } else {
            Z(40);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final PropertyDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            if (typeSubstitutor.f44551a.e()) {
                return this;
            }
            CopyConfiguration copyConfiguration = new CopyConfiguration();
            TypeSubstitution typeSubstitutionF = typeSubstitutor.f();
            if (typeSubstitutionF != null) {
                copyConfiguration.f = typeSubstitutionF;
                copyConfiguration.d = y0();
                return copyConfiguration.b();
            }
            CopyConfiguration.a(15);
            throw null;
        }
        Z(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final PropertyDescriptor y0() {
        PropertyDescriptor propertyDescriptor = this.m0;
        PropertyDescriptor propertyDescriptorY0 = propertyDescriptor == this ? this : propertyDescriptor.y0();
        if (propertyDescriptorY0 != null) {
            return propertyDescriptorY0;
        }
        Z(38);
        throw null;
    }
}
