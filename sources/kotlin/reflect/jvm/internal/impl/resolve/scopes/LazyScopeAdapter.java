package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue f44347b;

    public LazyScopeAdapter(StorageManager storageManager, final Function0 function0) {
        Intrinsics.f(storageManager, "storageManager");
        this.f44347b = storageManager.a(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$lazyScope$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MemberScope memberScope = (MemberScope) function0.invoke();
                return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).h() : memberScope;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public final MemberScope i() {
        return (MemberScope) this.f44347b.invoke();
    }
}
