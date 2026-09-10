package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;

/* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class polloi implements wireman {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final attabal f30148kowloon = new attabal(null);

    /* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope attabal(wireman wiremanVar, itchy typeSubstitution, beachfront kotlinTypeRefiner) {
            MemberScope memberScopeTimberyard;
            Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            polloi polloiVar = wiremanVar instanceof polloi ? (polloi) wiremanVar : null;
            if (polloiVar != null && (memberScopeTimberyard = polloiVar.timberyard(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScopeTimberyard;
            }
            MemberScope memberScopeCoi = wiremanVar.coi(typeSubstitution);
            Intrinsics.checkNotNullExpressionValue(memberScopeCoi, "getMemberScope(...)");
            return memberScopeCoi;
        }

        public final MemberScope saneness(wireman wiremanVar, beachfront kotlinTypeRefiner) {
            MemberScope memberScopeItchy;
            Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            polloi polloiVar = wiremanVar instanceof polloi ? (polloi) wiremanVar : null;
            if (polloiVar != null && (memberScopeItchy = polloiVar.itchy(kotlinTypeRefiner)) != null) {
                return memberScopeItchy;
            }
            MemberScope memberScopeWalach = wiremanVar.walach();
            Intrinsics.checkNotNullExpressionValue(memberScopeWalach, "getUnsubstitutedMemberScope(...)");
            return memberScopeWalach;
        }

        public attabal() {
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public /* bridge */ /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront attabal() {
        return attabal();
    }

    public abstract MemberScope itchy(beachfront beachfrontVar);

    public abstract MemberScope timberyard(itchy itchyVar, beachfront beachfrontVar);

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public /* bridge */ /* synthetic */ apical attabal() {
        return attabal();
    }
}
