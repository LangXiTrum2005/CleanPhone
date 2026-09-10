package p6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import e6.h;
import e6.i;
import e6.k;
import g6.a0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f48259b = new h("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, h.f39143e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48260a;

    public c(Context context) {
        this.f48260a = context.getApplicationContext();
    }

    @Override // e6.k
    public final /* bridge */ /* synthetic */ a0 a(Object obj, int i10, int i11, i iVar) {
        return c((Uri) obj, iVar);
    }

    @Override // e6.k
    public final boolean b(Object obj, i iVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final a0 c(Uri uri, i iVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f48260a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
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
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) iVar.c(f48259b) : null;
        Drawable drawableV = theme == null ? x7.a.v(context, contextCreatePackageContext, identifier, null) : x7.a.v(context, context, identifier, theme);
        if (drawableV != null) {
            return new b(drawableV, 0);
        }
        return null;
    }
}
