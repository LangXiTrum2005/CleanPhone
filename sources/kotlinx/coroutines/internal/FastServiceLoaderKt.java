package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FastServiceLoaderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45032a = 0;

    static {
        Object objA;
        try {
            objA = Class.forName("android.os.Build");
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        boolean z2 = objA instanceof Result.Failure;
    }
}
