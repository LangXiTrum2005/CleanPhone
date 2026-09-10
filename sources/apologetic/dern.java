package apologetic;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import glutethimide.arytenoidectomy;
import glutethimide.kowloon;
import glutethimide.molybdenite;
import java.io.InputStream;

/* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements kowloon<Uri, InputStream> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f14310attabal;

    /* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
    public static class attabal implements arytenoidectomy<Uri, InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f14311attabal;

        public attabal(Context context) {
            this.f14311attabal = context;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, InputStream> wireman(molybdenite molybdeniteVar) {
            return new dern(this.f14311attabal);
        }
    }

    public dern(Context context) {
        this.f14310attabal = context.getApplicationContext();
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<InputStream> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        if (beclomethasone.saneness.marial(i, i2) && marial(wiremanVar)) {
            return new kowloon.attabal<>(new leafed.saneness(uri), beclomethasone.dern.competently(this.f14310attabal, uri));
        }
        return null;
    }

    public final boolean marial(maggot.wireman wiremanVar) {
        Long l = (Long) wiremanVar.dern(VideoDecoder.f17822wireman);
        return l != null && l.longValue() == -1;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return beclomethasone.saneness.wireman(uri);
    }
}
