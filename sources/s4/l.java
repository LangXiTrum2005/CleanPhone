package s4;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, String str2, int i10) {
        super(str, str2, 2);
        this.f50114e = i10;
    }

    @Override // s4.b
    public final boolean a() {
        switch (this.f50114e) {
            case 0:
                if (!super.a()) {
                    return false;
                }
                WeakHashMap weakHashMap = r4.g.f49404a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
            case 1:
                if (!super.a() || !a.a.x("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = r4.g.f49404a;
                if (m.f50117c.a()) {
                    return o.f50126a.getStatics().isMultiProcessEnabled();
                }
                throw m.a();
            default:
                if (a.a.x("MULTI_PROFILE")) {
                    return super.a();
                }
                return false;
        }
    }
}
