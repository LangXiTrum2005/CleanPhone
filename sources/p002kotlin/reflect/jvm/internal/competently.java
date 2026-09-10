package p002kotlin.reflect.jvm.internal;

import byname.beachfront;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import foreshot.taiyuan;
import genesis.marial;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.load.java.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/competently;", "", "<init>", "()V", "", "attabal", "()Ljava/lang/String;", "saneness", "dern", "wireman", "Lkotlin/reflect/jvm/internal/competently$attabal;", "Lkotlin/reflect/jvm/internal/competently$saneness;", "Lkotlin/reflect/jvm/internal/competently$dern;", "Lkotlin/reflect/jvm/internal/competently$wireman;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class competently {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/competently$attabal;", "Lkotlin/reflect/jvm/internal/competently;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "attabal", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "saneness", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(Field field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            this.field = field;
        }

        @Override // p002kotlin.reflect.jvm.internal.competently
        /* JADX INFO: renamed from: attabal */
        public String getString() {
            StringBuilder sb = new StringBuilder();
            String name = this.field.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb.append(molybdenite.saneness(name));
            sb.append("()");
            Class<?> type = this.field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(ReflectClassUtilKt.saneness(type));
            return sb.toString();
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlin/reflect/jvm/internal/competently$dern;", "Lkotlin/reflect/jvm/internal/competently;", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", InAppPurchaseMetaData.KEY_SIGNATURE, "Lgenesis/dern;", "nameResolver", "Lgenesis/competently;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "attabal", "()Ljava/lang/String;", "dern", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "saneness", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "wireman", "Lgenesis/dern;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "marial", "Lgenesis/competently;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "beachfront", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final saran descriptor;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final String string;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final JvmProtoBuf.JvmPropertySignature signature;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final genesis.competently typeTable;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final ProtoBuf$Property proto;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final genesis.dern nameResolver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dern(saran descriptor, ProtoBuf$Property proto, JvmProtoBuf.JvmPropertySignature signature, genesis.dern nameResolver, genesis.competently typeTable) {
            String str;
            super(null);
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.descriptor = descriptor;
            this.proto = proto;
            this.signature = signature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (signature.hasGetter()) {
                str = nameResolver.getString(signature.getGetter().getName()) + nameResolver.getString(signature.getGetter().getDesc());
            } else {
                foreshot.wireman.attabal attabalVarWireman = taiyuan.wireman(taiyuan.f26288attabal, proto, nameResolver, typeTable, false, 8, null);
                if (attabalVarWireman == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String strWireman = attabalVarWireman.wireman();
                str = molybdenite.saneness(strWireman) + dern() + "()" + attabalVarWireman.marial();
            }
            this.string = str;
        }

        @Override // p002kotlin.reflect.jvm.internal.competently
        /* JADX INFO: renamed from: attabal, reason: from getter */
        public String getString() {
            return this.string;
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.signature;
        }

        /* JADX INFO: renamed from: competently, reason: from getter */
        public final genesis.competently getTypeTable() {
            return this.typeTable;
        }

        public final String dern() {
            String string;
            apical apicalVarSaneness = this.descriptor.saneness();
            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
            if (Intrinsics.wireman(this.descriptor.getVisibility(), polloi.f30217wireman) && (apicalVarSaneness instanceof DeserializedClassDescriptor)) {
                ProtoBuf$Class protoBuf$ClassLicking = ((DeserializedClassDescriptor) apicalVarSaneness).licking();
                GeneratedMessageLite.marial<ProtoBuf$Class, Integer> classModuleName = JvmProtoBuf.f31035taiyuan;
                Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                Integer num = (Integer) marial.attabal(protoBuf$ClassLicking, classModuleName);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = X3.i.Z;
                }
                return '$' + beachfront.saneness(string);
            }
            if (!Intrinsics.wireman(this.descriptor.getVisibility(), polloi.f30203attabal) || !(apicalVarSaneness instanceof sealless)) {
                return "";
            }
            saran saranVar = this.descriptor;
            Intrinsics.competently(saranVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman wiremanVarYemenite = ((p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.competently) saranVar).yemenite();
            if (!(wiremanVarYemenite instanceof p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical)) {
                return "";
            }
            p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical apicalVar = (p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical) wiremanVarYemenite;
            if (apicalVar.beachfront() == null) {
                return "";
            }
            return '$' + apicalVar.impromptu().dern();
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final ProtoBuf$Property getProto() {
            return this.proto;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final saran getDescriptor() {
            return this.descriptor;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final genesis.dern getNameResolver() {
            return this.nameResolver;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/competently$saneness;", "Lkotlin/reflect/jvm/internal/competently;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "attabal", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "saneness", "()Ljava/lang/reflect/Method;", "dern", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Method getterMethod;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(Method getterMethod, Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // p002kotlin.reflect.jvm.internal.competently
        /* JADX INFO: renamed from: attabal */
        public String getString() {
            return RuntimeTypeMapperKt.saneness(this.getterMethod);
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/competently$wireman;", "Lkotlin/reflect/jvm/internal/competently;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;", "getterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;)V", "", "attabal", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;", "saneness", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;", "dern", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class wireman extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final JvmFunctionSignature.dern getterSignature;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final JvmFunctionSignature.dern setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wireman(JvmFunctionSignature.dern getterSignature, JvmFunctionSignature.dern dernVar) {
            super(null);
            Intrinsics.checkNotNullParameter(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = dernVar;
        }

        @Override // p002kotlin.reflect.jvm.internal.competently
        /* JADX INFO: renamed from: attabal */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final JvmFunctionSignature.dern getSetterSignature() {
            return this.setterSignature;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final JvmFunctionSignature.dern getGetterSignature() {
            return this.getterSignature;
        }
    }

    public /* synthetic */ competently(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: attabal */
    public abstract String getString();

    public competently() {
    }
}
