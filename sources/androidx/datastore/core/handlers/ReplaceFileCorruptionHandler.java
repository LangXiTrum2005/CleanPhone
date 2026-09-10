package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/CorruptionHandler;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f4698a;

    public ReplaceFileCorruptionHandler(Function1 function1) {
        this.f4698a = function1;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public final Object a(CorruptionException corruptionException) {
        return this.f4698a.invoke(corruptionException);
    }
}
