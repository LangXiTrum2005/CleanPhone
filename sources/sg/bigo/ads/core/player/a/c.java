package sg.bigo.ads.core.player.a;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.core.player.a.a.a f48746a;

    public c(sg.bigo.ads.common.h.a aVar) {
        this.f48773e = aVar;
        sg.bigo.ads.core.player.a.a.a aVar2 = new sg.bigo.ads.core.player.a.a.a(aVar);
        this.f48746a = aVar2;
        this.f48771b = aVar2;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public final void a(OutputStream outputStream, long j) throws j, IOException {
        byte[] bArr = new byte[Segment.SIZE];
        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache start thread=" + Thread.currentThread().getName());
        while (true) {
            int iA = a(bArr, j);
            if (iA == -1) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache end thread=" + Thread.currentThread().getName() + ",offset=" + j);
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, iA);
            j += (long) iA;
        }
    }
}
