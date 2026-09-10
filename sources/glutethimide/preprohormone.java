package glutethimide;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.ironsource.X3;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class preprohormone<Data> implements kowloon<Uri, Data> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<String> f27281saneness = Collections.unmodifiableSet(new HashSet(Arrays.asList(X3.i.b, "content", "android.resource")));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern<Data> f27282attabal;

    /* JADX INFO: compiled from: UriLoader.java */
    public static final class attabal implements arytenoidectomy<Uri, AssetFileDescriptor>, dern<AssetFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f27283attabal;

        public attabal(ContentResolver contentResolver) {
            this.f27283attabal = contentResolver;
        }

        @Override // glutethimide.preprohormone.dern
        public com.bumptech.glide.load.data.wireman<AssetFileDescriptor> attabal(Uri uri) {
            return new com.bumptech.glide.load.data.attabal(this.f27283attabal, uri);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new preprohormone(this);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public interface dern<Data> {
        com.bumptech.glide.load.data.wireman<Data> attabal(Uri uri);
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class saneness implements arytenoidectomy<Uri, ParcelFileDescriptor>, dern<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f27284attabal;

        public saneness(ContentResolver contentResolver) {
            this.f27284attabal = contentResolver;
        }

        @Override // glutethimide.preprohormone.dern
        public com.bumptech.glide.load.data.wireman<ParcelFileDescriptor> attabal(Uri uri) {
            return new com.bumptech.glide.load.data.taiyuan(this.f27284attabal, uri);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, ParcelFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new preprohormone(this);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class wireman implements arytenoidectomy<Uri, InputStream>, dern<InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f27285attabal;

        public wireman(ContentResolver contentResolver) {
            this.f27285attabal = contentResolver;
        }

        @Override // glutethimide.preprohormone.dern
        public com.bumptech.glide.load.data.wireman<InputStream> attabal(Uri uri) {
            return new com.bumptech.glide.load.data.triweekly(this.f27285attabal, uri);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, InputStream> wireman(molybdenite molybdeniteVar) {
            return new preprohormone(this);
        }
    }

    public preprohormone(dern<Data> dernVar) {
        this.f27282attabal = dernVar;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(uri), this.f27282attabal.attabal(uri));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return f27281saneness.contains(uri.getScheme());
    }
}
