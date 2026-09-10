package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import lyreflower.beachfront;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;

/* JADX INFO: compiled from: overridingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> attabal(Collection<? extends H> collection2, Function1<? super H, ? extends attabal> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection2.size() <= 1) {
            return collection2;
        }
        LinkedList linkedList = new LinkedList(collection2);
        beachfront beachfrontVarAttabal = beachfront.f33195monoploid.attabal();
        while (!linkedList.isEmpty()) {
            Object objLerp = CollectionsKt.lerp(linkedList);
            final beachfront beachfrontVarAttabal2 = beachfront.f33195monoploid.attabal();
            Collection<abortive.attabal> collectionArytenoidectomy = OverridingUtil.arytenoidectomy(objLerp, linkedList, descriptorByHandle, new Function1<H, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(H h) {
                    beachfront<H> beachfrontVar = beachfrontVarAttabal2;
                    Intrinsics.beachfront(h);
                    beachfrontVar.add(h);
                }
            });
            Intrinsics.checkNotNullExpressionValue(collectionArytenoidectomy, "extractMembersOverridableInBothWays(...)");
            if (collectionArytenoidectomy.size() == 1 && beachfrontVarAttabal2.isEmpty()) {
                Object objHardpan = CollectionsKt.hardpan(collectionArytenoidectomy);
                Intrinsics.checkNotNullExpressionValue(objHardpan, "single(...)");
                beachfrontVarAttabal.add(objHardpan);
            } else {
                abortive.attabal attabalVar = (Object) OverridingUtil.seminary(collectionArytenoidectomy, descriptorByHandle);
                Intrinsics.checkNotNullExpressionValue(attabalVar, "selectMostSpecificMember(...)");
                attabal attabalVarInvoke = descriptorByHandle.invoke(attabalVar);
                for (abortive.attabal attabalVar2 : collectionArytenoidectomy) {
                    Intrinsics.beachfront(attabalVar2);
                    if (!OverridingUtil.stratoscope(attabalVarInvoke, descriptorByHandle.invoke(attabalVar2))) {
                        beachfrontVarAttabal2.add(attabalVar2);
                    }
                }
                if (!beachfrontVarAttabal2.isEmpty()) {
                    beachfrontVarAttabal.addAll(beachfrontVarAttabal2);
                }
                beachfrontVarAttabal.add(attabalVar);
            }
        }
        return beachfrontVarAttabal;
    }
}
