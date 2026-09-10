package complexometry;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcomplexometry/kowloon;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/net/Uri;", "uri", "", "scale", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V", "attabal", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "saneness", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "dern", "D", "getScale", "()D", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Drawable drawable;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final double scale;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Uri uri;

    public kowloon(Drawable drawable, Uri uri, double d) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.drawable = drawable;
        this.uri = uri;
        this.scale = d;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }
}
