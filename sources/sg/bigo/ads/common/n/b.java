package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47324a;

    public b(String str, Looper looper) {
        super(looper);
        this.f47324a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("HandlerEx ("), this.f47324a, ") {}");
    }
}
