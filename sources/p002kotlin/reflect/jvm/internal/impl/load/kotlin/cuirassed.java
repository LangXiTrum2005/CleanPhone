package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import byname.wireman;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.impassible;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.types.lerp;
import presbytery.apical;
import presbytery.competently;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cuirassed {
    public static final <T> T attabal(impassible<T> impassibleVar, T possiblyPrimitiveType, boolean z) {
        Intrinsics.checkNotNullParameter(impassibleVar, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z ? impassibleVar.saneness(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final <T> T saneness(lerp lerpVar, competently type, impassible<T> typeFactory, cord mode) {
        Intrinsics.checkNotNullParameter(lerpVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        apical apicalVarNosophobia = lerpVar.nosophobia(type);
        if (!lerpVar.triweekly(apicalVarNosophobia)) {
            return null;
        }
        PrimitiveType primitiveTypeItchy = lerpVar.itchy(apicalVarNosophobia);
        if (primitiveTypeItchy != null) {
            return (T) attabal(typeFactory, typeFactory.dern(primitiveTypeItchy), lerpVar.picketboat(type) || impassible.dern(lerpVar, type));
        }
        PrimitiveType primitiveTypeGrimness = lerpVar.grimness(apicalVarNosophobia);
        if (primitiveTypeGrimness != null) {
            return typeFactory.attabal('[' + JvmPrimitiveType.get(primitiveTypeGrimness).getDesc());
        }
        if (lerpVar.herdbook(apicalVarNosophobia)) {
            wireman wiremanVarCoi = lerpVar.coi(apicalVarNosophobia);
            saneness sanenessVarTriweekly = wiremanVarCoi != null ? dern.f29852attabal.triweekly(wiremanVarCoi) : null;
            if (sanenessVarTriweekly != null) {
                if (!mode.attabal()) {
                    List<dern.attabal> listTaiyuan = dern.f29852attabal.taiyuan();
                    if (!(listTaiyuan instanceof Collection) || !listTaiyuan.isEmpty()) {
                        Iterator<T> it = listTaiyuan.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.wireman(((dern.attabal) it.next()).wireman(), sanenessVarTriweekly)) {
                                return null;
                            }
                        }
                    }
                }
                String strBeachfront = iaido.wireman.saneness(sanenessVarTriweekly).beachfront();
                Intrinsics.checkNotNullExpressionValue(strBeachfront, "getInternalName(...)");
                return typeFactory.marial(strBeachfront);
            }
        }
        return null;
    }
}
