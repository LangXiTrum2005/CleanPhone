package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Option f12708b = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, Option.f12365e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12709a;

    public ResourceDrawableDecoder(Context context) {
        this.f12709a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ Resource b(Object obj, int i2, int i3, Options options) {
        return c((Uri) obj, options);
    }

    public final Resource c(Uri uri, Options options) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f12709a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(a.k(uri, "Failed to obtain context or unrecognized Uri format for: "), e2);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(a.k(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(a.k(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(a.k(uri, "Unrecognized Uri format: "), e3);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) options.c(f12708b) : null;
        Drawable drawableA = theme == null ? DrawableDecoderCompat.a(context, contextCreatePackageContext, identifier, null) : DrawableDecoderCompat.a(context, context, identifier, theme);
        if (drawableA != null) {
            return new NonOwnedDrawableResource(drawableA);
        }
        return null;
    }
}
