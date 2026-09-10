package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lasosan/impassible;", "serializer", "actualSerializer", "", "classDiscriminator", "", "marial", "(Lasosan/impassible;Lasosan/impassible;Ljava/lang/String;)V", "Lbristol/impassible;", "kind", "saneness", "(Lbristol/impassible;)V", "Lbristol/beachfront;", "Lcutwater/attabal;", "json", "dern", "(Lbristol/beachfront;Lcutwater/attabal;)Ljava/lang/String;", "serialName", "Lcutwater/impromptu;", "element", "", "wireman", "(Ljava/lang/String;Lcutwater/impromptu;)Ljava/lang/Void;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class grimness {

    /* JADX INFO: compiled from: Polymorphic.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = Opcodes.ARETURN)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f32508attabal;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32508attabal = iArr;
        }
    }

    public static final String dern(bristol.beachfront beachfrontVar, cutwater.attabal json) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : beachfrontVar.getAnnotations()) {
            if (annotation instanceof cutwater.marial) {
                return ((cutwater.marial) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final void marial(asosan.impassible<?> impassibleVar, asosan.impassible<?> impassibleVar2, String str) {
        if ((impassibleVar instanceof asosan.cutely) && vinyl.overspeculate.attabal(impassibleVar2.getDescriptor()).contains(str)) {
            String serialName = ((asosan.cutely) impassibleVar).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + impassibleVar2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void saneness(bristol.impassible kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof bristol.impassible.saneness) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bristol.marial) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bristol.wireman) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final Void wireman(String str, cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + p002kotlin.jvm.internal.polloi.saneness(element.getClass()).taiyuan() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }
}
