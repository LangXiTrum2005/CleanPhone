package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3941lA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4183nz[] f4638a;
    public static final Map b;

    static {
        C4183nz c4183nz = new C4183nz(C4183nz.i, "");
        C3971lc c3971lc = C4183nz.f;
        C4183nz c4183nz2 = new C4183nz(c3971lc, "GET");
        C4183nz c4183nz3 = new C4183nz(c3971lc, "POST");
        C3971lc c3971lc2 = C4183nz.g;
        C4183nz c4183nz4 = new C4183nz(c3971lc2, "/");
        C4183nz c4183nz5 = new C4183nz(c3971lc2, "/index.html");
        C3971lc c3971lc3 = C4183nz.h;
        C4183nz c4183nz6 = new C4183nz(c3971lc3, ProxyConfig.MATCH_HTTP);
        C4183nz c4183nz7 = new C4183nz(c3971lc3, "https");
        C3971lc c3971lc4 = C4183nz.e;
        int i = 0;
        C4183nz[] c4183nzArr = {c4183nz, c4183nz2, c4183nz3, c4183nz4, c4183nz5, c4183nz6, c4183nz7, new C4183nz(c3971lc4, "200"), new C4183nz(c3971lc4, "204"), new C4183nz(c3971lc4, "206"), new C4183nz(c3971lc4, "304"), new C4183nz(c3971lc4, "400"), new C4183nz(c3971lc4, "404"), new C4183nz(c3971lc4, "500"), new C4183nz("accept-charset", ""), new C4183nz("accept-encoding", "gzip, deflate"), new C4183nz("accept-language", ""), new C4183nz("accept-ranges", ""), new C4183nz("accept", ""), new C4183nz("access-control-allow-origin", ""), new C4183nz("age", ""), new C4183nz("allow", ""), new C4183nz("authorization", ""), new C4183nz("cache-control", ""), new C4183nz("content-disposition", ""), new C4183nz("content-encoding", ""), new C4183nz("content-language", ""), new C4183nz("content-length", ""), new C4183nz("content-location", ""), new C4183nz("content-range", ""), new C4183nz("content-type", ""), new C4183nz("cookie", ""), new C4183nz("date", ""), new C4183nz(DownloadModel.ETAG, ""), new C4183nz("expect", ""), new C4183nz("expires", ""), new C4183nz(TypedValues.TransitionType.S_FROM, ""), new C4183nz("host", ""), new C4183nz("if-match", ""), new C4183nz("if-modified-since", ""), new C4183nz("if-none-match", ""), new C4183nz("if-range", ""), new C4183nz("if-unmodified-since", ""), new C4183nz("last-modified", ""), new C4183nz("link", ""), new C4183nz("location", ""), new C4183nz("max-forwards", ""), new C4183nz("proxy-authenticate", ""), new C4183nz("proxy-authorization", ""), new C4183nz("range", ""), new C4183nz("referer", ""), new C4183nz(ToolBar.REFRESH, ""), new C4183nz("retry-after", ""), new C4183nz("server", ""), new C4183nz("set-cookie", ""), new C4183nz("strict-transport-security", ""), new C4183nz("transfer-encoding", ""), new C4183nz("user-agent", ""), new C4183nz("vary", ""), new C4183nz("via", ""), new C4183nz("www-authenticate", "")};
        f4638a = c4183nzArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            int i2 = i + 1;
            if (!linkedHashMap.containsKey(c4183nzArr[i].f4769a)) {
                linkedHashMap.put(c4183nzArr[i].f4769a, Integer.valueOf(i));
            }
            i = i2;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2995aW.p(mapUnmodifiableMap, "unmodifiableMap(result)");
        b = mapUnmodifiableMap;
    }

    public static void a(C3971lc c3971lc) {
        AbstractC2995aW.q(c3971lc, "name");
        int iC = c3971lc.c();
        int i = 0;
        while (i < iC) {
            int i2 = i + 1;
            byte bF = c3971lc.f(i);
            if (65 <= bF && bF <= 90) {
                throw new IOException(AbstractC2995aW.v0(c3971lc.j(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i = i2;
        }
    }
}
