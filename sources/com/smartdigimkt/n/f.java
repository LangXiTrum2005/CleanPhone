package com.smartdigimkt.n;

import android.text.TextUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f36892a = new f();

    private f() {
    }

    public static f a() {
        return f36892a;
    }

    @Override // com.smartdigimkt.v4.b
    public void b(Object obj, String str) {
        String strN;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                strN = android.support.v4.media.a.n("javascript:window.OW.onSuccess(", bVar.g, ",'');");
            } else {
                strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.OW.onSuccess(", bVar.g, ",'", com.smartdigimkt.v4.d.a(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f36886a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(strN);
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
