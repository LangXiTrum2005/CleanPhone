package libyan;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.wireman;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: compiled from: ReplaceFileCorruptionHandler.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Llibyan/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/wireman;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "attabal", "(Landroidx/datastore/core/CorruptionException;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness<T> implements wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(Function1<? super CorruptionException, ? extends T> produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.wireman
    public Object attabal(CorruptionException corruptionException, dern<? super T> dernVar) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
