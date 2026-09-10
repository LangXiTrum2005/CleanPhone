package dumb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class formularize implements maggot.marial<Uri, Drawable> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final maggot.dern<Resources.Theme> f25376saneness = maggot.dern.marial("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f25377attabal;

    public formularize(Context context) {
        this.f25377attabal = context.getApplicationContext();
    }

    public final int beachfront(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int competently(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return beachfront(context, uri);
        }
        if (pathSegments.size() == 1) {
            return marial(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public endosteum.cutely<Drawable> attabal(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextWireman = wireman(uri, authority);
            int iCompetently = competently(contextWireman, uri);
            Resources.Theme theme = ((String) com.bumptech.glide.util.apical.wireman(authority)).equals(this.f25377attabal.getPackageName()) ? (Resources.Theme) wiremanVar.dern(f25376saneness) : null;
            return apical.wireman(theme == null ? taiyuan.saneness(this.f25377attabal, contextWireman, iCompetently) : taiyuan.attabal(this.f25377attabal, iCompetently, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public boolean saneness(Uri uri, maggot.wireman wiremanVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final int marial(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    public final Context wireman(Uri uri, String str) {
        if (str.equals(this.f25377attabal.getPackageName())) {
            return this.f25377attabal;
        }
        try {
            return this.f25377attabal.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f25377attabal.getPackageName())) {
                return this.f25377attabal;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }
}
