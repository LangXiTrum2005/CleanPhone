package sg.bigo.ads.core.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;

/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f48573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sg.bigo.ads.core.h.c f48574b;
    boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0871b f48575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f48576i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f48577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0871b f48578b;

        public a(b bVar, C0871b c0871b) {
            this.f48577a = bVar;
            this.f48578b = c0871b;
        }

        @JavascriptInterface
        public final void onCustomJSEventCallback(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", android.support.v4.media.a.o("onCustomJSEventCallback, eventType: ", str, ", eventJson: ", str2));
            sg.bigo.ads.core.h.c customWebChromeClient = this.f48577a.getCustomWebChromeClient();
            if (customWebChromeClient != null) {
                customWebChromeClient.a(this.f48577a, str, str2);
            }
        }

        @JavascriptInterface
        public final void webCollect(String str) {
            String string;
            C0871b c0871b = this.f48578b;
            if (c0871b.f48579a == null) {
                c0871b.f48579a = new ArrayList();
            }
            if (!str.contains("notify") || str.startsWith(d9.i.d)) {
                string = str;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                    string = jSONObject.toString();
                } catch (Exception unused) {
                    string = str;
                }
            }
            c0871b.f48579a.add(string);
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "webCollect: ".concat(str));
        }

        @JavascriptInterface
        public final void webStat(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", android.support.v4.media.a.o("statUniversalInfo, eventId: ", str, ", msgJson: ", str2));
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.h.b$b, reason: collision with other inner class name */
    public static class C0871b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<String> f48579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<String> f48580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f48581c;
        public Boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f48582e = -1;
        public long f = -1;
        public long g = -1;

        public final boolean a(String str) {
            List<String> list = this.f48580b;
            if (str != null && list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f48584b;

        private c() {
        }

        public final Boolean a() {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Try to check not blank by bit");
            if (this.f48584b != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Has result for checking not blank by bit");
                return this.f48584b;
            }
            b bVar = b.this;
            if (bVar.j) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "WebView is destroyed stop checking not blank by bit");
                return null;
            }
            int width = bVar.getWidth();
            int height = b.this.getHeight();
            if (width > 0 && height > 0) {
                try {
                    int[] iArr = new int[width * height];
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(width, height, Bitmap.Config.RGB_565);
                    if (bitmapA == null) {
                        return null;
                    }
                    b.this.draw(new Canvas(bitmapA));
                    bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapA.recycle();
                    this.f48584b = Boolean.valueOf(!a(iArr));
                    sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "The result of current banner checking not blank by bit: " + this.f48584b);
                    return this.f48584b;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public /* synthetic */ c(b bVar, byte b2) {
            this();
        }

        private static boolean a(int[] iArr) {
            if (iArr.length <= 0) {
                return false;
            }
            int length = iArr.length;
            int i2 = length - 1;
            int i3 = 0;
            while (true) {
                int i4 = length / 2;
                if (i3 >= i4 || i2 < i4) {
                    return true;
                }
                if (iArr[i3] != iArr[i2]) {
                    return false;
                }
                i3++;
                i2--;
            }
        }
    }

    public b(Context context) {
        super(context);
        this.g = false;
        C0871b c0871b = new C0871b();
        this.f48575h = c0871b;
        a aVar = new a(this, c0871b);
        this.f48573a = aVar;
        addJavascriptInterface(aVar, "bigossp");
    }

    public final void a(int i2, WebResourceRequest webResourceRequest, int i3, CharSequence charSequence) {
        if (webResourceRequest != null) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "dispatchResourceError, type: ", ", url: ");
            sbU.append(webResourceRequest.getUrl());
            sbU.append(", errorCode: ");
            sbU.append(i3);
            sbU.append(", desc: ");
            sbU.append((Object) charSequence);
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", sbU.toString());
            C0871b c0871b = this.f48575h;
            String strValueOf = String.valueOf(webResourceRequest.getUrl());
            if (c0871b.f48580b == null) {
                c0871b.f48580b = new ArrayList();
            }
            c0871b.f48580b.add(strValueOf);
        }
    }

    public sg.bigo.ads.core.h.c getCustomWebChromeClient() {
        return this.f48574b;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f48574b = webChromeClient instanceof sg.bigo.ads.core.h.c ? (sg.bigo.ads.core.h.c) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }

    public static void a(C0871b c0871b) {
        List<String> list;
        long jElapsedRealtime;
        JSONObject jSONObjectOptJSONObject;
        if (!i.f46986a.n().a(0) || (list = c0871b.f48579a) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (str.startsWith(d9.i.d)) {
                sb.append(str.substring(1, str.length() - 1));
                sb.append(",");
            }
            sb.append(str);
            sb.append(",");
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(d9.i.d + sb.substring(0, sb.length() - 1) + d9.i.f24752e);
            int length = jSONArray2.length();
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("type");
                    if ("render_start".equals(strOptString)) {
                        jSONObject = jSONObjectOptJSONObject2;
                    }
                    if ("render".equals(strOptString) && jSONObject2 == null) {
                        jSONObject2 = jSONObjectOptJSONObject2;
                    }
                    if (!"mayError".equals(strOptString) || ((jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) != null && c0871b.a(jSONObjectOptJSONObject.optString("url")))) {
                        jSONArray.put(jSONObjectOptJSONObject2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sg.bigo.ads.core.d.b.a(3002, 10113, jSONArray.toString());
            }
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    c0871b.f48581c = Boolean.TRUE;
                    jElapsedRealtime = jSONObject2.optLong(BidResponsed.KEY_CUR);
                } else {
                    c0871b.f48581c = Boolean.FALSE;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                c0871b.f48582e = jElapsedRealtime;
            }
        } catch (Exception unused) {
        }
    }
}
