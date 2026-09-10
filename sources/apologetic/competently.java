package apologetic;

import glutethimide.arytenoidectomy;
import glutethimide.impromptu;
import glutethimide.kowloon;
import glutethimide.molybdenite;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently implements kowloon<URL, InputStream> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon<impromptu, InputStream> f14309attabal;

    /* JADX INFO: compiled from: UrlLoader.java */
    public static class attabal implements arytenoidectomy<URL, InputStream> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<URL, InputStream> wireman(molybdenite molybdeniteVar) {
            return new competently(molybdeniteVar.wireman(impromptu.class, InputStream.class));
        }
    }

    public competently(kowloon<impromptu, InputStream> kowloonVar) {
        this.f14309attabal = kowloonVar;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<InputStream> saneness(URL url, int i, int i2, maggot.wireman wiremanVar) {
        return this.f14309attabal.saneness(new impromptu(url), i, i2, wiremanVar);
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(URL url) {
        return true;
    }
}
