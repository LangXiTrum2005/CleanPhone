package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: DataMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/datastore/core/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "migrate", "", "cleanUp", "(Lwretchedly/dern;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface beachfront<T> {
    Object cleanUp(wretchedly.dern<? super Unit> dernVar);

    Object migrate(T t, wretchedly.dern<? super T> dernVar);

    Object shouldMigrate(T t, wretchedly.dern<? super Boolean> dernVar);
}
