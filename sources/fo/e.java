package fo;

import com.ironsource.C0265ba;
import com.ironsource.C0375hc;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f41228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f41229b;

    static {
        b bVar = new b(b.f41209i, "");
        lo.h hVar = b.f41206f;
        b bVar2 = new b(hVar, C0375hc.f28788a);
        b bVar3 = new b(hVar, C0375hc.f28789b);
        lo.h hVar2 = b.f41207g;
        b bVar4 = new b(hVar2, "/");
        b bVar5 = new b(hVar2, "/index.html");
        lo.h hVar3 = b.f41208h;
        b bVar6 = new b(hVar3, "http");
        b bVar7 = new b(hVar3, "https");
        lo.h hVar4 = b.f41205e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b(C0265ba.f28278m, ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b(DownloadModel.ETAG, ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b(ToolBar.REFRESH, ""), new b("retry-after", ""), new b(Hb.f26242a, ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f41228a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(bVarArr[i10].f41210a)) {
                linkedHashMap.put(bVarArr[i10].f41210a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.n.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f41229b = mapUnmodifiableMap;
    }

    public static void a(lo.h name) throws IOException {
        kotlin.jvm.internal.n.f(name, "name");
        int iD = name.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = name.i(i10);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.m()));
            }
        }
    }
}
