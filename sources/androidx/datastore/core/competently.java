package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/datastore/core/competently;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/Function2;", "Lwretchedly/dern;", "transform", "attabal", "(Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/dern;", "getData", "()Lkotlinx/coroutines/flow/dern;", "data", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface competently<T> {
    Object attabal(Function2<? super T, ? super wretchedly.dern<? super T>, ? extends Object> function2, wretchedly.dern<? super T> dernVar);

    kotlinx.coroutines.flow.dern<T> getData();
}
