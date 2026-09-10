package p002kotlin.reflect.jvm.internal;

import foreshot.taiyuan;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.calls.dern;
import p002kotlin.reflect.jvm.internal.calls.impromptu;
import p002kotlin.reflect.jvm.internal.calls.wireman;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/dern;", "saneness", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;Z)Lkotlin/reflect/jvm/internal/calls/dern;", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "competently", "(Lkotlin/reflect/jvm/internal/impl/descriptors/saran;)Z", "", "beachfront", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class apical {
    public static final Object beachfront(KPropertyImpl.attabal<?, ?> attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        return attabalVar.oilcan().oilcan();
    }

    public static final boolean competently(saran saranVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = saranVar.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        if (!marial.rotuma(apicalVarSaneness)) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness2 = apicalVarSaneness.saneness();
        if (marial.trm(apicalVarSaneness2) || marial.graveside(apicalVarSaneness2)) {
            return (saranVar instanceof competently) && taiyuan.beachfront(((competently) saranVar).cultivated());
        }
        return true;
    }

    public static final wireman<Field> dern(KPropertyImpl.attabal<?, ?> attabalVar, boolean z, Field field) {
        if (competently(attabalVar.oilcan().trm()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                return attabalVar.stratoscope() ? new wireman.beachfront.attabal(field, beachfront(attabalVar)) : new wireman.beachfront.dern(field);
            }
            return attabalVar.stratoscope() ? new wireman.competently.attabal(field, marial(attabalVar), beachfront(attabalVar)) : new wireman.competently.dern(field, marial(attabalVar));
        }
        if (!wireman(attabalVar)) {
            return z ? new wireman.beachfront.marial(field) : new wireman.competently.marial(field, marial(attabalVar));
        }
        if (z) {
            return attabalVar.stratoscope() ? new wireman.beachfront.saneness(field) : new wireman.beachfront.C0665wireman(field);
        }
        return attabalVar.stratoscope() ? new wireman.competently.saneness(field, marial(attabalVar)) : new wireman.competently.C0666wireman(field, marial(attabalVar));
    }

    public static final boolean marial(KPropertyImpl.attabal<?, ?> attabalVar) {
        return !nosophobia.formularize(attabalVar.oilcan().trm().getType());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static final dern<?> saneness(KPropertyImpl.attabal<?, ?> attabalVar, boolean z) {
        JvmFunctionSignature.dern setterSignature;
        Method setterMethod;
        dern attabalVar2;
        JvmProtoBuf.JvmMethodSignature setter;
        dern dernVar;
        Method methodFormularize;
        if (KDeclarationContainerImpl.INSTANCE.attabal().matches(attabalVar.oilcan().getCom.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE java.lang.String())) {
            return p002kotlin.reflect.jvm.internal.calls.competently.f29587attabal;
        }
        competently competentlyVarBeachfront = arytenoidectomy.f29551attabal.beachfront(attabalVar.oilcan().trm());
        if (competentlyVarBeachfront instanceof competently.dern) {
            competently.dern dernVar2 = (competently.dern) competentlyVarBeachfront;
            JvmProtoBuf.JvmPropertySignature signature = dernVar2.getCom.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE java.lang.String();
            if (z) {
                if (signature.hasGetter()) {
                    setter = signature.getGetter();
                } else {
                    setter = null;
                }
            } else if (signature.hasSetter()) {
                setter = signature.getSetter();
            } else {
                setter = null;
            }
            Method methodMolybdenite = setter != null ? attabalVar.oilcan().getContainer().molybdenite(dernVar2.getNameResolver().getString(setter.getName()), dernVar2.getNameResolver().getString(setter.getDesc())) : null;
            if (methodMolybdenite != null) {
                if (!Modifier.isStatic(methodMolybdenite.getModifiers())) {
                    dernVar = attabalVar.stratoscope() ? new wireman.impromptu.attabal(methodMolybdenite, beachfront(attabalVar)) : new wireman.impromptu.marial(methodMolybdenite);
                } else if (wireman(attabalVar)) {
                    dernVar = attabalVar.stratoscope() ? new wireman.impromptu.saneness(methodMolybdenite) : new wireman.impromptu.beachfront(methodMolybdenite);
                } else {
                    dernVar = attabalVar.stratoscope() ? new wireman.impromptu.dern(methodMolybdenite, beachfront(attabalVar)) : new wireman.impromptu.competently(methodMolybdenite);
                }
                attabalVar2 = dernVar;
            } else if (beachfront.marial(attabalVar.oilcan().trm()) && Intrinsics.wireman(attabalVar.oilcan().trm().getVisibility(), polloi.f30217wireman)) {
                Class<?> clsPolloi = impromptu.polloi(attabalVar.oilcan().trm().saneness());
                if (clsPolloi == null || (methodFormularize = impromptu.formularize(clsPolloi, attabalVar.oilcan().trm())) == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + attabalVar.oilcan() + " should have a field");
                }
                attabalVar2 = attabalVar.stratoscope() ? new kotlin.reflect.jvm.internal.calls.beachfront.attabal(methodFormularize, beachfront(attabalVar)) : new kotlin.reflect.jvm.internal.calls.beachfront.saneness(methodFormularize);
            } else {
                Field fieldSupplicat = attabalVar.oilcan().supplicat();
                if (fieldSupplicat == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + attabalVar.oilcan());
                }
                attabalVar2 = dern(attabalVar, z, fieldSupplicat);
            }
        } else if (competentlyVarBeachfront instanceof competently.attabal) {
            attabalVar2 = dern(attabalVar, z, ((competently.attabal) competentlyVarBeachfront).getField());
        } else {
            if (!(competentlyVarBeachfront instanceof competently.saneness)) {
                if (!(competentlyVarBeachfront instanceof competently.wireman)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    setterSignature = ((competently.wireman) competentlyVarBeachfront).getGetterSignature();
                } else {
                    setterSignature = ((competently.wireman) competentlyVarBeachfront).getSetterSignature();
                    if (setterSignature == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + attabalVar.oilcan());
                    }
                }
                Method methodMolybdenite2 = attabalVar.oilcan().getContainer().molybdenite(setterSignature.dern(), setterSignature.saneness());
                if (methodMolybdenite2 != null) {
                    Modifier.isStatic(methodMolybdenite2.getModifiers());
                    return attabalVar.stratoscope() ? new wireman.impromptu.attabal(methodMolybdenite2, beachfront(attabalVar)) : new wireman.impromptu.marial(methodMolybdenite2);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + attabalVar.oilcan());
            }
            if (z) {
                setterMethod = ((competently.saneness) competentlyVarBeachfront).getGetterMethod();
            } else {
                competently.saneness sanenessVar = (competently.saneness) competentlyVarBeachfront;
                setterMethod = sanenessVar.getSetterMethod();
                if (setterMethod == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + sanenessVar.getGetterMethod());
                }
            }
            attabalVar2 = attabalVar.stratoscope() ? new wireman.impromptu.attabal(setterMethod, beachfront(attabalVar)) : new wireman.impromptu.marial(setterMethod);
        }
        return impromptu.taiyuan(attabalVar2, attabalVar.trm(), false, 2, null);
    }

    public static final boolean wireman(KPropertyImpl.attabal<?, ?> attabalVar) {
        return attabalVar.oilcan().trm().getAnnotations().restrictive(molybdenite.cutely());
    }
}
