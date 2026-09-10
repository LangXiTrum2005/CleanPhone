package kotlin.reflect.jvm.internal;

import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class JvmPropertySignature {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JavaField extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f43379a;

        public JavaField(Field field) {
            Intrinsics.f(field, "field");
            this.f43379a = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: a */
        public final String getF() {
            StringBuilder sb = new StringBuilder();
            Field field = this.f43379a;
            String name = field.getName();
            Intrinsics.e(name, "field.name");
            sb.append(JvmAbi.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            Intrinsics.e(type, "field.type");
            sb.append(ReflectClassUtilKt.b(type));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43381b;

        public JavaMethodProperty(Method getterMethod, Method method) {
            Intrinsics.f(getterMethod, "getterMethod");
            this.f43380a = getterMethod;
            this.f43381b = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: a */
        public final String getF() {
            return RuntimeTypeMapperKt.a(this.f43380a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", InAppPurchaseMetaData.KEY_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PropertyDescriptor f43382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProtoBuf.Property f43383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JvmProtoBuf.JvmPropertySignature f43384c;
        public final NameResolver d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TypeTable f43385e;
        public final String f;

        public KotlinProperty(PropertyDescriptor propertyDescriptor, ProtoBuf.Property proto, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, NameResolver nameResolver, TypeTable typeTable) {
            String string;
            JvmPackagePartSource jvmPackagePartSource;
            String string2;
            Intrinsics.f(proto, "proto");
            Intrinsics.f(nameResolver, "nameResolver");
            Intrinsics.f(typeTable, "typeTable");
            this.f43382a = propertyDescriptor;
            this.f43383b = proto;
            this.f43384c = jvmPropertySignature;
            this.d = nameResolver;
            this.f43385e = typeTable;
            if ((jvmPropertySignature.f44140Y & 4) == 4) {
                string2 = nameResolver.getString(jvmPropertySignature.f0.Z).concat(nameResolver.getString(jvmPropertySignature.f0.e0));
            } else {
                JvmMemberSignature.Field fieldB = JvmProtoBufUtil.b(proto, nameResolver, typeTable, true);
                if (fieldB == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + propertyDescriptor);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(JvmAbi.a(fieldB.f44150a));
                DeclarationDescriptor declarationDescriptorD = propertyDescriptor.d();
                Intrinsics.e(declarationDescriptorD, "descriptor.containingDeclaration");
                if (Intrinsics.a(propertyDescriptor.getVisibility(), DescriptorVisibilities.d) && (declarationDescriptorD instanceof DeserializedClassDescriptor)) {
                    GeneratedMessageLite.GeneratedExtension classModuleName = JvmProtoBuf.f44133i;
                    Intrinsics.e(classModuleName, "classModuleName");
                    Integer num = (Integer) ProtoBufUtilKt.a(((DeserializedClassDescriptor) declarationDescriptorD).f0, classModuleName);
                    string = "$".concat(NameUtils.f44172a.c("_", num != null ? nameResolver.getString(num.intValue()) : d9.h.Z));
                } else if (!Intrinsics.a(propertyDescriptor.getVisibility(), DescriptorVisibilities.f43561a) || !(declarationDescriptorD instanceof PackageFragmentDescriptor) || (jvmPackagePartSource = ((DeserializedPropertyDescriptor) propertyDescriptor).F0) == null || jvmPackagePartSource.f43999c == null) {
                    string = "";
                } else {
                    StringBuilder sb2 = new StringBuilder("$");
                    String strE = jvmPackagePartSource.f43998b.e();
                    Intrinsics.e(strE, "className.internalName");
                    sb2.append(Name.g(StringsKt.Q(IOUtils.DIR_SEPARATOR_UNIX, strE, strE)).b());
                    string = sb2.toString();
                }
                sb.append(string);
                sb.append("()");
                sb.append(fieldB.f44151b);
                string2 = sb.toString();
            }
            this.f = string2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF() {
            return this.f;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JvmFunctionSignature.KotlinFunction f43386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JvmFunctionSignature.KotlinFunction f43387b;

        public MappedKotlinProperty(JvmFunctionSignature.KotlinFunction kotlinFunction, JvmFunctionSignature.KotlinFunction kotlinFunction2) {
            this.f43386a = kotlinFunction;
            this.f43387b = kotlinFunction2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: a */
        public final String getF() {
            return this.f43386a.f43378b;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF();
}
