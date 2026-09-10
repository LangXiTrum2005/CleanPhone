package m0;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f45683b;

    public c() {
        this.f45682a = 2;
        this.f45683b = LogSessionId.LOG_SESSION_ID_NONE;
    }

    @Override // m0.d
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.f45683b).setLinkUri(uri);
    }

    @Override // m0.f
    public ContentInfo b() {
        return (ContentInfo) this.f45683b;
    }

    @Override // m0.d
    public g build() {
        return new g(new c(((ContentInfo.Builder) this.f45683b).build()));
    }

    @Override // m0.f
    public int c() {
        return ((ContentInfo) this.f45683b).getSource();
    }

    @Override // m0.f
    public ClipData d() {
        return ((ContentInfo) this.f45683b).getClip();
    }

    @Override // m0.d
    public void e(int i10) {
        ((ContentInfo.Builder) this.f45683b).setFlags(i10);
    }

    @Override // m0.f
    public int f() {
        return ((ContentInfo) this.f45683b).getFlags();
    }

    public void g(LogSessionId logSessionId) {
        go.k.t(((LogSessionId) this.f45683b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.f45683b = logSessionId;
    }

    @Override // m0.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f45683b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f45682a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f45683b) + "}";
            default:
                return super.toString();
        }
    }

    public c(ContentInfo contentInfo) {
        this.f45682a = 1;
        contentInfo.getClass();
        this.f45683b = contentInfo;
    }

    public c(ClipData clipData, int i10) {
        this.f45682a = 0;
        this.f45683b = f0.c.b(clipData, i10);
    }
}
