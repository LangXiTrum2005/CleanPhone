package glutethimide;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class cord<Data> implements kowloon<Uri, Data> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<String> f27229saneness = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon<impromptu, Data> f27230attabal;

    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class attabal implements arytenoidectomy<Uri, InputStream> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, InputStream> wireman(molybdenite molybdeniteVar) {
            return new cord(molybdeniteVar.wireman(impromptu.class, InputStream.class));
        }
    }

    public cord(kowloon<impromptu, Data> kowloonVar) {
        this.f27230attabal = kowloonVar;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        return this.f27230attabal.saneness(new impromptu(uri.toString()), i, i2, wiremanVar);
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return f27229saneness.contains(uri.getScheme());
    }
}
