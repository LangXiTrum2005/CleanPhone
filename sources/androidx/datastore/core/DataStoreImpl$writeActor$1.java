package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DataStoreImpl$writeActor$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ DataStoreImpl X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl dataStoreImpl) {
        super(1);
        this.X = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        DataStoreImpl dataStoreImpl = this.X;
        if (th != null) {
            dataStoreImpl.f4609h.b(new Final(th));
        }
        if (dataStoreImpl.j.isInitialized()) {
            ((StorageConnection) dataStoreImpl.j.getX()).close();
        }
        return Unit.f43263a;
    }
}
