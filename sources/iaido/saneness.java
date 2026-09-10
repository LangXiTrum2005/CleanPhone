package iaido;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: inlineClassManglingRules.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {
    public static final boolean attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        return Intrinsics.wireman(DescriptorUtilsKt.formularize(wiremanVar), competently.f29660adultoid);
    }

    public static final boolean beachfront(CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar = descriptor instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.dern ? (p002kotlin.reflect.jvm.internal.impl.descriptors.dern) descriptor : null;
        if (dernVar == null || polloi.competently(dernVar.getVisibility())) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarDent = dernVar.dent();
        Intrinsics.checkNotNullExpressionValue(wiremanVarDent, "getConstructedClass(...)");
        if (beachfront.competently(wiremanVarDent) || p002kotlin.reflect.jvm.internal.impl.resolve.marial.kattegat(dernVar.dent())) {
            return false;
        }
        List<cultivated> listBeachfront = dernVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        List<cultivated> list = listBeachfront;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            oilcan type = ((cultivated) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (marial(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean dern(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return beachfront.competently(apicalVar) && !attabal((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVar);
    }

    public static final boolean marial(oilcan oilcanVar) {
        return wireman(oilcanVar) || saneness(oilcanVar, true);
    }

    public static final boolean saneness(oilcan oilcanVar, boolean z) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        clubfoot clubfootVar = beachfrontVarWireman instanceof clubfoot ? (clubfoot) beachfrontVarWireman : null;
        if (clubfootVar == null) {
            return false;
        }
        return (z || !beachfront.wireman(clubfootVar)) && marial(TypeUtilsKt.cutely(clubfootVar));
    }

    public static final boolean wireman(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return beachfrontVarWireman != null && ((beachfront.saneness(beachfrontVarWireman) && dern(beachfrontVarWireman)) || beachfront.taiyuan(oilcanVar));
    }
}
