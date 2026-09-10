package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "msg", "Landroidx/datastore/core/Message$Update;", "ex", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DataStoreImpl$writeActor$2 extends Lambda implements Function2<Message.Update<Object>, Throwable, Unit> {
    public static final DataStoreImpl$writeActor$2 X = new DataStoreImpl$writeActor$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Message.Update msg = (Message.Update) obj;
        Throwable cancellationException = (Throwable) obj2;
        Intrinsics.f(msg, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f4661b.j(cancellationException);
        return Unit.f43263a;
    }
}
