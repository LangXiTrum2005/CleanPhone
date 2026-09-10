package k6;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f44393b;

    public /* synthetic */ z(r rVar, int i10) {
        this.f44392a = i10;
        this.f44393b = rVar;
    }

    @Override // k6.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f44392a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        Uri uriFromFile;
        switch (this.f44392a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                r rVar = this.f44393b;
                if (rVar.a(uriFromFile)) {
                    return rVar.b(uriFromFile, i10, i11, iVar);
                }
                return null;
            default:
                return this.f44393b.b(new h((URL) obj), i10, i11, iVar);
        }
    }
}
