package glutethimide;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: ResourceUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class adultoid<DataT> implements kowloon<Uri, DataT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f27198attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon<Integer, DataT> f27199saneness;

    /* JADX INFO: compiled from: ResourceUriLoader.java */
    public static final class attabal implements arytenoidectomy<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27200attabal;

        public attabal(Context context) {
            this.f27200attabal = context;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new adultoid(this.f27200attabal, molybdeniteVar.wireman(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceUriLoader.java */
    public static final class saneness implements arytenoidectomy<Uri, InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27201attabal;

        public saneness(Context context) {
            this.f27201attabal = context;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, InputStream> wireman(molybdenite molybdeniteVar) {
            return new adultoid(this.f27201attabal, molybdeniteVar.wireman(Integer.class, InputStream.class));
        }
    }

    public adultoid(Context context, kowloon<Integer, DataT> kowloonVar) {
        this.f27198attabal = context.getApplicationContext();
        this.f27199saneness = kowloonVar;
    }

    public static arytenoidectomy<Uri, InputStream> beachfront(Context context) {
        return new saneness(context);
    }

    public static arytenoidectomy<Uri, AssetFileDescriptor> marial(Context context) {
        return new attabal(context);
    }

    public final kowloon.attabal<DataT> competently(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 != 0) {
                return this.f27199saneness.saneness(Integer.valueOf(i3), i, i2, wiremanVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                uri.toString();
            }
            return null;
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<DataT> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return competently(uri, i, i2, wiremanVar);
        }
        if (pathSegments.size() == 2) {
            return impromptu(uri, i, i2, wiremanVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    public final kowloon.attabal<DataT> impromptu(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        int identifier = this.f27198attabal.getResources().getIdentifier(pathSegments.get(1), str, this.f27198attabal.getPackageName());
        if (identifier != 0) {
            return this.f27199saneness.saneness(Integer.valueOf(identifier), i, i2, wiremanVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f27198attabal.getPackageName().equals(uri.getAuthority());
    }
}
