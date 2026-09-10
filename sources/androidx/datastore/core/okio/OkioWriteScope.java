package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.WriteScope
    public final Object d(Object obj, ContinuationImpl continuationImpl) {
        OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        if (continuationImpl instanceof OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (OkioWriteScope$writeData$1) continuationImpl;
            int i2 = okioWriteScope$writeData$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, continuationImpl);
            }
        } else {
            okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, continuationImpl);
        }
        Object obj2 = okioWriteScope$writeData$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = okioWriteScope$writeData$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.b(obj2);
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
