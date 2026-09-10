package okhttp3;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/impassible;", "", "Lokhttp3/graveside;", "url", "", "Lokhttp3/formularize;", "cookies", "", "saneness", "(Lokhttp3/graveside;Ljava/util/List;)V", "attabal", "(Lokhttp3/graveside;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f34283attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final impassible f34282saneness = new Companion.C0760attabal();

    /* JADX INFO: renamed from: okhttp3.impassible$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CookieJar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/impassible$attabal;", "", "<init>", "()V", "Lokhttp3/impassible;", "NO_COOKIES", "Lokhttp3/impassible;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f34283attabal = new Companion();

        /* JADX INFO: renamed from: okhttp3.impassible$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CookieJar.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/impassible$attabal$attabal;", "Lokhttp3/impassible;", "<init>", "()V", "Lokhttp3/graveside;", "url", "", "Lokhttp3/formularize;", "cookies", "", "saneness", "(Lokhttp3/graveside;Ljava/util/List;)V", "attabal", "(Lokhttp3/graveside;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0760attabal implements impassible {
            @Override // okhttp3.impassible
            public List<formularize> attabal(graveside url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return p002kotlin.collections.adultoid.formularize();
            }

            @Override // okhttp3.impassible
            public void saneness(graveside url, List<formularize> cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }
    }

    List<formularize> attabal(graveside url);

    void saneness(graveside url, List<formularize> cookies);
}
