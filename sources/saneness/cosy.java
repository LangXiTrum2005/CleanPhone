package saneness;

import androidx.webkit.PrefetchException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cosy implements http.saneness {
    @Override // http.saneness
    public final void onError(Throwable th) {
        PrefetchException error = (PrefetchException) th;
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // http.saneness
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
    }
}
