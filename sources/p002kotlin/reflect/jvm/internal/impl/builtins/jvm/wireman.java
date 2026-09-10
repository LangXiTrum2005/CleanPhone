package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import byname.dern;
import byname.saneness;
import java.util.Collection;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;

/* JADX INFO: compiled from: JavaToKotlinClassMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f29882attabal = new wireman();

    public static /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.wireman beachfront(wireman wiremanVar, dern dernVar, beachfront beachfrontVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return wiremanVar.marial(dernVar, beachfrontVar, num);
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman mutable) {
        Intrinsics.checkNotNullParameter(mutable, "mutable");
        dern dernVarKowloon = dern.f29852attabal.kowloon(marial.impassible(mutable));
        if (dernVarKowloon != null) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = DescriptorUtilsKt.cutely(mutable).kowloon(dernVarKowloon);
            Intrinsics.checkNotNullExpressionValue(wiremanVarKowloon, "getBuiltInClassByFqName(...)");
            return wiremanVarKowloon;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> competently(dern fqName, beachfront builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarBeachfront = beachfront(this, fqName, builtIns, null, 4, null);
        if (wiremanVarBeachfront == null) {
            return creditor.marial();
        }
        dern dernVarArytenoidectomy = dern.f29852attabal.arytenoidectomy(DescriptorUtilsKt.impassible(wiremanVarBeachfront));
        if (dernVarArytenoidectomy == null) {
            return privatdozent.wireman(wiremanVarBeachfront);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = builtIns.kowloon(dernVarArytenoidectomy);
        Intrinsics.checkNotNullExpressionValue(wiremanVarKowloon, "getBuiltInClassByFqName(...)");
        return adultoid.kowloon(wiremanVarBeachfront, wiremanVarKowloon);
    }

    public final boolean dern(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman mutable) {
        Intrinsics.checkNotNullParameter(mutable, "mutable");
        return dern.f29852attabal.apical(marial.impassible(mutable));
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman marial(dern fqName, beachfront builtIns, Integer num) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        saneness sanenessVarImpassible = (num == null || !Intrinsics.wireman(fqName, dern.f29852attabal.impromptu())) ? dern.f29852attabal.impassible(fqName) : competently.attabal(num.intValue());
        if (sanenessVarImpassible != null) {
            return builtIns.kowloon(sanenessVarImpassible.saneness());
        }
        return null;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        dern dernVarArytenoidectomy = dern.f29852attabal.arytenoidectomy(marial.impassible(readOnly));
        if (dernVarArytenoidectomy != null) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = DescriptorUtilsKt.cutely(readOnly).kowloon(dernVarArytenoidectomy);
            Intrinsics.checkNotNullExpressionValue(wiremanVarKowloon, "getBuiltInClassByFqName(...)");
            return wiremanVarKowloon;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean wireman(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        return dern.f29852attabal.formularize(marial.impassible(readOnly));
    }
}
