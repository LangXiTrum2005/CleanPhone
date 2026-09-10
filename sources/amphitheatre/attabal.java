package amphitheatre;

import duvetyn.beachfront;
import java.io.IOException;
import okhttp3.molybdenite;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Lamphitheatre/attabal;", "", "Lduvetyn/beachfront;", "source", "<init>", "(Lduvetyn/beachfront;)V", "", "saneness", "()Ljava/lang/String;", "Lokhttp3/molybdenite;", "attabal", "()Lokhttp3/molybdenite;", "Lduvetyn/beachfront;", "getSource", "()Lduvetyn/beachfront;", "", "J", "headerLimit", "dern", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final beachfront source;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long headerLimit;

    public attabal(beachfront source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.headerLimit = 262144L;
    }

    public final molybdenite attabal() throws IOException {
        molybdenite.attabal attabalVar = new molybdenite.attabal();
        while (true) {
            String strSaneness = saneness();
            if (strSaneness.length() == 0) {
                return attabalVar.marial();
            }
            attabalVar.dern(strSaneness);
        }
    }

    public final String saneness() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
