package p002kotlin.reflect.jvm.internal.impl.util;

import byname.marial;
import byname.saneness;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.monoploid;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import snook.competently;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OperatorChecks extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final OperatorChecks f31832attabal = new OperatorChecks();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final List<Checks> f31833saneness;

    static {
        marial marialVar = kowloon.f31859apical;
        cutely.saneness sanenessVar = cutely.saneness.f31854saneness;
        Checks checks = new Checks(marialVar, new beachfront[]{sanenessVar, new arytenoidectomy.attabal(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(kowloon.f31872formularize, new beachfront[]{sanenessVar, new arytenoidectomy.attabal(2)}, new Function1<dovishness, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            @Override // p002kotlin.jvm.functions.Function1
            public final String invoke(dovishness $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                List<cultivated> listBeachfront = $receiver.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                cultivated cultivatedVar = (cultivated) CollectionsKt.picketboat(listBeachfront);
                boolean z = false;
                if (cultivatedVar != null && !DescriptorUtilsKt.dern(cultivatedVar) && cultivatedVar.wostteth() == null) {
                    z = true;
                }
                OperatorChecks operatorChecks = OperatorChecks.f31832attabal;
                if (z) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        });
        marial marialVar2 = kowloon.f31895saneness;
        formularize formularizeVar = formularize.f31855attabal;
        arytenoidectomy.attabal attabalVar = new arytenoidectomy.attabal(2);
        taiyuan taiyuanVar = taiyuan.f31910attabal;
        Checks checks3 = new Checks(marialVar2, new beachfront[]{sanenessVar, formularizeVar, attabalVar, taiyuanVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(kowloon.f31870dern, new beachfront[]{sanenessVar, formularizeVar, new arytenoidectomy.attabal(3), taiyuanVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(kowloon.f31907wireman, new beachfront[]{sanenessVar, formularizeVar, new arytenoidectomy.saneness(2), taiyuanVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(kowloon.f31903taiyuan, new beachfront[]{sanenessVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        marial marialVar3 = kowloon.f31878impromptu;
        arytenoidectomy.wireman wiremanVar = arytenoidectomy.wireman.f31846saneness;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f31836dern;
        Checks checks7 = new Checks(marialVar3, new beachfront[]{sanenessVar, wiremanVar, formularizeVar, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null);
        marial marialVar4 = kowloon.f31868cutely;
        arytenoidectomy.dern dernVar = arytenoidectomy.dern.f31844saneness;
        f31833saneness = adultoid.kowloon(checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(marialVar4, new beachfront[]{sanenessVar, dernVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31877impassible, new beachfront[]{sanenessVar, dernVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31904triweekly, new beachfront[]{sanenessVar, dernVar, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31893restrictive, new beachfront[]{sanenessVar, wiremanVar, formularizeVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31883merc, new beachfront[]{sanenessVar, wiremanVar, formularizeVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31881marial, new beachfront[]{cutely.attabal.f31853saneness}, new Function1<dovishness, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2
            public static final boolean attabal(apical apicalVar) {
                return (apicalVar instanceof wireman) && beachfront.cultivated((wireman) apicalVar);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0050  */
            /* JADX WARN: Code duplicated, block: B:17:0x0052  */
            @Override // p002kotlin.jvm.functions.Function1
            public final String invoke(dovishness $receiver) {
                boolean z;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                OperatorChecks operatorChecks = OperatorChecks.f31832attabal;
                apical apicalVarSaneness = $receiver.saneness();
                Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
                if (attabal(apicalVarSaneness)) {
                    z = true;
                } else {
                    Collection<? extends dovishness> collectionWireman = $receiver.wireman();
                    Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
                    Collection<? extends dovishness> collection2 = collectionWireman;
                    if (!collection2.isEmpty()) {
                        Iterator<T> it = collection2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                apical apicalVarSaneness2 = ((dovishness) it.next()).saneness();
                                Intrinsics.checkNotNullExpressionValue(apicalVarSaneness2, "getContainingDeclaration(...)");
                                if (attabal(apicalVarSaneness2)) {
                                }
                            } else if (monoploid.dern($receiver)) {
                                z = false;
                            }
                            z = true;
                        }
                    } else if (monoploid.dern($receiver)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("must override ''equals()'' in Any");
                apical apicalVarSaneness3 = $receiver.saneness();
                Intrinsics.checkNotNullExpressionValue(apicalVarSaneness3, "getContainingDeclaration(...)");
                if (p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.competently(apicalVarSaneness3)) {
                    DescriptorRenderer descriptorRenderer = DescriptorRenderer.f31204taiyuan;
                    apical apicalVarSaneness4 = $receiver.saneness();
                    Intrinsics.competently(apicalVarSaneness4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    merc mercVarImpassible = ((wireman) apicalVarSaneness4).impassible();
                    Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + descriptorRenderer.adultoid(TypeUtilsKt.preprohormone(mercVarImpassible)) + "): Boolean''");
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }), new Checks(kowloon.f31864competently, new beachfront[]{sanenessVar, ReturnsCheck.ReturnsInt.f31837dern, wiremanVar, formularizeVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31906walach, new beachfront[]{sanenessVar, wiremanVar, formularizeVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31876hydrovane, new beachfront[]{sanenessVar, dernVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(adultoid.kowloon(kowloon.f31894rotuma, kowloon.f31891preprohormone), new beachfront[]{sanenessVar}, new Function1<dovishness, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            @Override // p002kotlin.jvm.functions.Function1
            public final String invoke(dovishness $receiver) {
                boolean zPolloi;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                starveling starvelingVarKattegat = $receiver.kattegat();
                if (starvelingVarKattegat == null) {
                    starvelingVarKattegat = $receiver.polder();
                }
                OperatorChecks operatorChecks = OperatorChecks.f31832attabal;
                boolean z = false;
                if (starvelingVarKattegat != null) {
                    oilcan returnType = $receiver.getReturnType();
                    if (returnType != null) {
                        oilcan type = starvelingVarKattegat.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        zPolloi = TypeUtilsKt.polloi(returnType, type);
                    } else {
                        zPolloi = false;
                    }
                    if (zPolloi || operatorChecks.wireman($receiver, starvelingVarKattegat)) {
                        z = true;
                    }
                }
                if (z) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            }
        }), new Checks(kowloon.f31899splinterproof, new beachfront[]{sanenessVar, ReturnsCheck.ReturnsUnit.f31838dern, wiremanVar, formularizeVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(kowloon.f31860arytenoidectomy, new beachfront[]{sanenessVar, dernVar}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.saneness
    public List<Checks> saneness() {
        return f31833saneness;
    }

    public final boolean wireman(dovishness dovishnessVar, starveling starvelingVar) {
        saneness sanenessVarApical;
        oilcan returnType;
        competently value = starvelingVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (!(value instanceof snook.marial)) {
            return false;
        }
        wireman wiremanVarArytenoidectomy = ((snook.marial) value).arytenoidectomy();
        if (!wiremanVarArytenoidectomy.coffeecake() || (sanenessVarApical = DescriptorUtilsKt.apical(wiremanVarArytenoidectomy)) == null) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarSaneness = FindClassInModuleKt.saneness(DescriptorUtilsKt.arytenoidectomy(wiremanVarArytenoidectomy), sanenessVarApical);
        overspeculate overspeculateVar = beachfrontVarSaneness instanceof overspeculate ? (overspeculate) beachfrontVarSaneness : null;
        if (overspeculateVar == null || (returnType = dovishnessVar.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.polloi(returnType, overspeculateVar.trm());
    }
}
