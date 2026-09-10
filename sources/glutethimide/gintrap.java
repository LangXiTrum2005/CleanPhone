package glutethimide;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class gintrap<Data> implements kowloon<String, Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon<Uri, Data> f27237attabal;

    /* JADX INFO: compiled from: StringLoader.java */
    public static final class attabal implements arytenoidectomy<String, AssetFileDescriptor> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<String, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new gintrap(molybdeniteVar.wireman(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class dern implements arytenoidectomy<String, InputStream> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<String, InputStream> wireman(molybdenite molybdeniteVar) {
            return new gintrap(molybdeniteVar.wireman(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class saneness implements arytenoidectomy<String, ParcelFileDescriptor> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<String, ParcelFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new gintrap(molybdeniteVar.wireman(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public gintrap(kowloon<Uri, Data> kowloonVar) {
        this.f27237attabal = kowloonVar;
    }

    public static Uri beachfront(String str) {
        return Uri.fromFile(new File(str));
    }

    public static Uri marial(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return beachfront(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? beachfront(str) : uri;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(String str, int i, int i2, maggot.wireman wiremanVar) {
        Uri uriMarial = marial(str);
        if (uriMarial == null || !this.f27237attabal.attabal(uriMarial)) {
            return null;
        }
        return this.f27237attabal.saneness(uriMarial, i, i2, wiremanVar);
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(String str) {
        return true;
    }
}
