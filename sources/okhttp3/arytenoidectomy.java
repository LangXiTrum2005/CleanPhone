package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lokhttp3/arytenoidectomy;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f34138attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final arytenoidectomy f34137saneness = new Companion.C0755attabal();

    /* JADX INFO: renamed from: okhttp3.arytenoidectomy$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/arytenoidectomy$attabal;", "", "<init>", "()V", "Lokhttp3/arytenoidectomy;", "SYSTEM", "Lokhttp3/arytenoidectomy;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f34138attabal = new Companion();

        /* JADX INFO: renamed from: okhttp3.arytenoidectomy$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dns.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/arytenoidectomy$attabal$attabal;", "Lokhttp3/arytenoidectomy;", "<init>", "()V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0755attabal implements arytenoidectomy {
            @Override // okhttp3.arytenoidectomy
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return p002kotlin.collections.polloi.unconsolidated(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.arytenoidectomy("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }

    List<InetAddress> lookup(String hostname) throws UnknownHostException;
}
