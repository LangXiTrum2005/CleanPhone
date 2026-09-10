package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: LazyScopeAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyScopeAdapter extends attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impromptu<MemberScope> f31363saneness;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter(Function0<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal
    public MemberScope taiyuan() {
        return this.f31363saneness.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(formularize NO_LOCKS, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.f31625marial;
            Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, function0);
    }

    public LazyScopeAdapter(formularize storageManager, final Function0<? extends MemberScope> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.f31363saneness = storageManager.dern(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$lazyScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                MemberScope memberScopeInvoke = getScope.invoke();
                return memberScopeInvoke instanceof attabal ? ((attabal) memberScopeInvoke).impromptu() : memberScopeInvoke;
            }
        });
    }
}
