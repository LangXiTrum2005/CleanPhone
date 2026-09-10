package saneness;

import ads_mobile_sdk.ag0;
import ads_mobile_sdk.k41;
import ads_mobile_sdk.nn0;
import ads_mobile_sdk.on0;
import ads_mobile_sdk.pn0;
import ads_mobile_sdk.qn0;
import ads_mobile_sdk.rn0;
import ads_mobile_sdk.sn0;
import ads_mobile_sdk.un0;
import ads_mobile_sdk.vn0;
import ads_mobile_sdk.wn0;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class metairie {
    public static String attabal(nn0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.a() == k41.INTERNAL_ERROR) {
            return ag0.b.a();
        }
        if (error instanceof vn0) {
            vn0 vn0Var = (vn0) error;
            return "WebView HTTP error " + vn0Var.d() + ": " + vn0Var.c() + " on url: " + vn0Var.e();
        }
        if (error instanceof wn0) {
            return ag0.e.a();
        }
        if (error instanceof rn0) {
            return ((rn0) error).c();
        }
        if (error instanceof on0) {
            on0 on0Var = (on0) error;
            String strD = on0Var.d();
            return strD == null ? on0Var.c().toString() : strD;
        }
        if (error instanceof qn0) {
            return ((qn0) error).c().toString();
        }
        if (error instanceof pn0) {
            return error.toString();
        }
        if (error instanceof sn0) {
            return ((sn0) error).c();
        }
        if (error instanceof un0) {
            return ((un0) error).c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
