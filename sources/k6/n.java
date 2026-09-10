package k6;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44366b;

    public n(Context context, int i10) {
        this.f44365a = i10;
        switch (i10) {
            case 1:
                this.f44366b = context.getApplicationContext();
                break;
            case 2:
                this.f44366b = context.getApplicationContext();
                break;
            default:
                this.f44366b = context;
                break;
        }
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        switch (this.f44365a) {
            case 0:
                return android.support.v4.media.session.a.y((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return android.support.v4.media.session.a.y(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return android.support.v4.media.session.a.y(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        Long l;
        switch (this.f44365a) {
            case 0:
                Uri uri = (Uri) obj;
                return new q(new z6.d(uri), new m(0, this.f44366b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    return null;
                }
                z6.d dVar = new z6.d(uri2);
                Context context = this.f44366b;
                return new q(dVar, f6.b.e(context, uri2, new f6.a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384 || (l = (Long) iVar.c(n6.e0.f46578d)) == null || l.longValue() != -1) {
                    return null;
                }
                z6.d dVar2 = new z6.d(uri3);
                Context context2 = this.f44366b;
                return new q(dVar2, f6.b.e(context2, uri3, new f6.a(context2.getContentResolver(), 1)));
        }
    }
}
