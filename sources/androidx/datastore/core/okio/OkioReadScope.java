package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkioReadScope<T> implements ReadScope<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(OkioReadScope okioReadScope, ContinuationImpl continuationImpl) throws Throwable {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        if (continuationImpl instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) continuationImpl;
            int i2 = okioReadScope$readData$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, continuationImpl);
            }
        } else {
            okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, continuationImpl);
        }
        Object obj = okioReadScope$readData$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = okioReadScope$readData$1.Z;
        Throwable th = null;
        if (i3 == 0) {
            ResultKt.b(obj);
            okioReadScope.getClass();
            throw null;
        }
        if (i3 == 1) {
            try {
                ResultKt.b(obj);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
            try {
                if (th != null) {
                    throw th;
                }
                Intrinsics.c(obj);
            } catch (FileNotFoundException unused) {
                throw null;
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.b(obj);
            } catch (Throwable th3) {
                obj = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.c(obj);
        }
        return obj;
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object a(Continuation continuation) {
        return f(this, (ContinuationImpl) continuation);
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        throw null;
    }
}
