package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorEquivalenceForOverrides {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final DescriptorEquivalenceForOverrides f31282attabal = new DescriptorEquivalenceForOverrides();

    public static /* synthetic */ boolean competently(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, apical apicalVar, apical apicalVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.beachfront(apicalVar, apicalVar2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean cutely(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, clubfoot clubfootVar, clubfoot clubfootVar2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function2<apical, apical, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
                @Override // p002kotlin.jvm.functions.Function2
                public final Boolean invoke(apical apicalVar, apical apicalVar2) {
                    return Boolean.FALSE;
                }
            };
        }
        return descriptorEquivalenceForOverrides.taiyuan(clubfootVar, clubfootVar2, z, function2);
    }

    public static /* synthetic */ boolean dern(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, attabal attabalVar, attabal attabalVar2, boolean z, boolean z2, boolean z3, beachfront beachfrontVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.saneness(attabalVar, attabalVar2, z, z4, z3, beachfrontVar);
    }

    public static final boolean wireman(boolean z, final attabal a, final attabal b, permissivist c1, permissivist c2) {
        Intrinsics.checkNotNullParameter(a, "$a");
        Intrinsics.checkNotNullParameter(b, "$b");
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        if (Intrinsics.wireman(c1, c2)) {
            return true;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = c1.wireman();
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman2 = c2.wireman();
        if ((beachfrontVarWireman instanceof clubfoot) && (beachfrontVarWireman2 instanceof clubfoot)) {
            return f31282attabal.taiyuan((clubfoot) beachfrontVarWireman, (clubfoot) beachfrontVarWireman2, z, new Function2<apical, apical, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public final Boolean invoke(apical apicalVar, apical apicalVar2) {
                    return Boolean.valueOf(Intrinsics.wireman(apicalVar, a) && Intrinsics.wireman(apicalVar2, b));
                }
            });
        }
        return false;
    }

    public final boolean apical(apical apicalVar, apical apicalVar2, Function2<? super apical, ? super apical, Boolean> function2, boolean z) {
        apical apicalVarSaneness = apicalVar.saneness();
        apical apicalVarSaneness2 = apicalVar2.saneness();
        return ((apicalVarSaneness instanceof CallableMemberDescriptor) || (apicalVarSaneness2 instanceof CallableMemberDescriptor)) ? function2.invoke(apicalVarSaneness, apicalVarSaneness2).booleanValue() : competently(this, apicalVarSaneness, apicalVarSaneness2, z, false, 8, null);
    }

    public final boolean beachfront(apical apicalVar, apical apicalVar2, boolean z, boolean z2) {
        if ((apicalVar instanceof wireman) && (apicalVar2 instanceof wireman)) {
            return marial((wireman) apicalVar, (wireman) apicalVar2);
        }
        if ((apicalVar instanceof clubfoot) && (apicalVar2 instanceof clubfoot)) {
            return cutely(this, (clubfoot) apicalVar, (clubfoot) apicalVar2, z, null, 8, null);
        }
        if ((apicalVar instanceof attabal) && (apicalVar2 instanceof attabal)) {
            return dern(this, (attabal) apicalVar, (attabal) apicalVar2, z, z2, false, beachfront.attabal.f31721attabal, 16, null);
        }
        return ((apicalVar instanceof sealless) && (apicalVar2 instanceof sealless)) ? Intrinsics.wireman(((sealless) apicalVar).marial(), ((sealless) apicalVar2).marial()) : Intrinsics.wireman(apicalVar, apicalVar2);
    }

    public final walach formularize(attabal attabalVar) {
        while (attabalVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) attabalVar;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor.wireman();
            Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
            attabalVar = (CallableMemberDescriptor) CollectionsKt.technofreak(collectionWireman);
            if (attabalVar == null) {
                return null;
            }
        }
        return attabalVar.competently();
    }

    public final boolean impromptu(clubfoot a, clubfoot b, boolean z) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return cutely(this, a, b, z, null, 8, null);
    }

    public final boolean marial(wireman wiremanVar, wireman wiremanVar2) {
        return Intrinsics.wireman(wiremanVar.impromptu(), wiremanVar2.impromptu());
    }

    public final boolean saneness(attabal a, attabal b, boolean z, boolean z2, boolean z3, beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.wireman(a, b)) {
            return true;
        }
        if (!Intrinsics.wireman(a.getName(), b.getName())) {
            return false;
        }
        if (z2 && (a instanceof cord) && (b instanceof cord) && ((cord) a).coffeecake() != ((cord) b).coffeecake()) {
            return false;
        }
        if ((Intrinsics.wireman(a.saneness(), b.saneness()) && (!z || !Intrinsics.wireman(formularize(a), formularize(b)))) || marial.yemenite(a) || marial.yemenite(b) || !apical(a, b, new Function2<apical, apical, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
            @Override // p002kotlin.jvm.functions.Function2
            public final Boolean invoke(apical apicalVar, apical apicalVar2) {
                return Boolean.FALSE;
            }
        }, z)) {
            return false;
        }
        OverridingUtil overridingUtilTaiyuan = OverridingUtil.taiyuan(kotlinTypeRefiner, new dern(z, a, b));
        Intrinsics.checkNotNullExpressionValue(overridingUtilTaiyuan, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result resultDern = overridingUtilTaiyuan.yemenite(a, b, null, !z3).dern();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultDern == result && overridingUtilTaiyuan.yemenite(b, a, null, z3 ^ true).dern() == result;
    }

    public final boolean taiyuan(clubfoot a, clubfoot b, boolean z, Function2<? super apical, ? super apical, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.wireman(a, b)) {
            return true;
        }
        return !Intrinsics.wireman(a.saneness(), b.saneness()) && apical(a, b, equivalentCallables, z) && a.getIndex() == b.getIndex();
    }
}
