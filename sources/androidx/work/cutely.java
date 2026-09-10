package androidx.work;

import com.google.common.util.concurrent.adultoid;
import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "", "R"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class cutely implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ adultoid<Object> f14044arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.impassible<Object> f14045kowloon;

    public cutely(kotlinx.coroutines.impassible<Object> impassibleVar, adultoid<Object> adultoidVar) {
        this.f14045kowloon = impassibleVar;
        this.f14044arytenoidectomy = adultoidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14045kowloon.resumeWith(Result.m3351constructorimpl(this.f14044arytenoidectomy.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f14045kowloon.taiyuan(cause);
                return;
            }
            kotlinx.coroutines.impassible<Object> impassibleVar = this.f14045kowloon;
            Result.Companion companion = Result.INSTANCE;
            impassibleVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(cause)));
        }
    }
}
