package p002kotlin.reflect.jvm.internal;

import byname.dern;
import kurbash.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: typeOfImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkurbash/arytenoidectomy;", "type", "attabal", "(Lkurbash/arytenoidectomy;)Lkurbash/arytenoidectomy;", "Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "saneness", "(Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;)Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class monoploid {
    public static final arytenoidectomy attabal(arytenoidectomy type) {
        Intrinsics.checkNotNullParameter(type, "type");
        oilcan type2 = ((KTypeImpl) type).getType();
        if (!(type2 instanceof merc)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        beachfront beachfrontVarWireman = type2.setterwort().wireman();
        wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
        if (wiremanVar != null) {
            merc mercVar = (merc) type2;
            permissivist permissivistVarImpromptu = saneness(wiremanVar).impromptu();
            Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
            return new KTypeImpl(KotlinTypeFactory.apical(mercVar, null, permissivistVarImpromptu, null, false, 26, null), null, 2, null);
        }
        throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
    }

    public static final wireman saneness(wireman wiremanVar) {
        dern dernVarArytenoidectomy = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal.arytenoidectomy(DescriptorUtilsKt.impassible(wiremanVar));
        if (dernVarArytenoidectomy != null) {
            wireman wiremanVarKowloon = DescriptorUtilsKt.cutely(wiremanVar).kowloon(dernVarArytenoidectomy);
            Intrinsics.checkNotNullExpressionValue(wiremanVarKowloon, "getBuiltInClassByFqName(...)");
            return wiremanVarKowloon;
        }
        throw new IllegalArgumentException("Not a readonly collection: " + wiremanVar);
    }
}
