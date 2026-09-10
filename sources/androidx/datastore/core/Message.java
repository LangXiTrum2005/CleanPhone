package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/Message;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Message<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Read;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Read<T> extends Message<T> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Update;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Update<T> extends Message<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuspendLambda f4660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CompletableDeferred f4661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f4662c;
        public final CoroutineContext d;

        /* JADX WARN: Multi-variable type inference failed */
        public Update(Function2 function2, CompletableDeferred completableDeferred, State state, CoroutineContext callerContext) {
            Intrinsics.f(callerContext, "callerContext");
            this.f4660a = (SuspendLambda) function2;
            this.f4661b = completableDeferred;
            this.f4662c = state;
            this.d = callerContext;
        }
    }
}
