package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreInMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/taiyuan;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "Landroidx/datastore/core/graveside;", "newState", "dern", "(Landroidx/datastore/core/graveside;)Landroidx/datastore/core/graveside;", "Lkotlinx/coroutines/flow/formularize;", "attabal", "Lkotlinx/coroutines/flow/formularize;", "getCachedValue$annotations", "cachedValue", "()Landroidx/datastore/core/graveside;", "currentState", "Lkotlinx/coroutines/flow/dern;", "saneness", "()Lkotlinx/coroutines/flow/dern;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class taiyuan<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.flow.formularize<graveside<T>> cachedValue;

    public taiyuan() {
        gintrap gintrapVar = gintrap.f9571saneness;
        Intrinsics.competently(gintrapVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = kotlinx.coroutines.flow.gintrap.attabal(gintrapVar);
    }

    public final graveside<T> attabal() {
        return this.cachedValue.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final graveside<T> dern(graveside<T> newState) {
        graveside<T> value;
        graveside<T> gravesideVar;
        Intrinsics.checkNotNullParameter(newState, "newState");
        kotlinx.coroutines.flow.formularize<graveside<T>> formularizeVar = this.cachedValue;
        do {
            value = formularizeVar.getValue();
            gravesideVar = value;
            if (gravesideVar instanceof monoploid ? true : Intrinsics.wireman(gravesideVar, gintrap.f9571saneness)) {
                gravesideVar = newState;
            } else if (gravesideVar instanceof marial) {
                if (newState.getVersion() > gravesideVar.getVersion()) {
                    gravesideVar = newState;
                }
            } else if (!(gravesideVar instanceof apical)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!formularizeVar.wireman(value, gravesideVar));
        return gravesideVar;
    }

    public final kotlinx.coroutines.flow.dern<graveside<T>> saneness() {
        return this.cachedValue;
    }
}
