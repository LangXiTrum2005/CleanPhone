package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class PK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f3546a = new Handler(Looper.getMainLooper());
    public static final Charset b = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static int b(C4568sM c4568sM) {
        int iLastIndexOf;
        if (c4568sM.f() == 200) {
            String strE = c4568sM.e("Content-Length");
            if (TextUtils.isEmpty(strE)) {
                return -1;
            }
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        if (c4568sM.f() != 206) {
            return -1;
        }
        String strE2 = c4568sM.e(HttpResponseHeader.ContentRange);
        if (TextUtils.isEmpty(strE2) || (iLastIndexOf = strE2.lastIndexOf("/")) < 0 || iLastIndexOf >= strE2.length() - 1) {
            return -1;
        }
        String strSubstring = strE2.substring(iLastIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            return -1;
        }
        try {
            return Integer.parseInt(strSubstring);
        } catch (NumberFormatException unused2) {
            return -1;
        }
    }

    public static KK c(C4568sM c4568sM, Vo0 vo0, String str, int i) {
        String string;
        String str2;
        String string2;
        KK kkA = vo0.a(i, str);
        if (kkA != null) {
            return kkA;
        }
        int iB = b(c4568sM);
        String strE = c4568sM.e("Content-Type");
        if (iB <= 0 || TextUtils.isEmpty(strE)) {
            return kkA;
        }
        C4472rE c4472rE = (C4472rE) c4568sM.c;
        String string3 = "";
        if (c4472rE != null) {
            str2 = c4472rE.f4923a;
            HashMap map = c4472rE.b;
            if (map == null || map.size() == 0) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(": ");
                    sb.append(entry.getValue());
                    sb.append("\r\n");
                }
                string = sb.toString();
            }
        } else {
            string = "";
            str2 = string;
        }
        List list = (List) c4568sM.b;
        if (list == null || list.size() == 0) {
            string2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                IW iw = (IW) list.get(i2);
                if (iw != null) {
                    sb2.append(iw.f3220a);
                    sb2.append(": ");
                    sb2.append(iw.b);
                    sb2.append("\r\n");
                }
                i3++;
                i2 = 0;
            }
            string2 = sb2.toString();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestUrl", str2);
            jSONObject.put("requestHeaders", string);
            jSONObject.put("responseHeaders", string2);
            string3 = jSONObject.toString();
        } catch (Throwable unused) {
        }
        KK kk = new KK(iB, i, str, strE, string3);
        Map map2 = (Map) vo0.f3895a.get(i);
        if (map2 != null) {
            map2.put(str, kk);
        }
        vo0.c.execute(new RunnableC3252dN(4, vo0, kk));
        return kk;
    }

    public static String d(KK kk, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb.append(kk.b);
        sb.append("\r\n");
        int i2 = kk.c;
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(i2);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(i2 - 1);
            sb.append("/");
            sb.append(i2);
            sb.append("\r\nContent-Length: ");
            sb.append(i2 - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String string = sb.toString();
        No0 no0 = AbstractC4648tE.f5026a;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    public static String e(C4568sM c4568sM, int i) {
        int iB;
        if (((IeN) c4568sM.d).lk() < 200 || ((IeN) c4568sM.d).lk() >= 300) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        IeN ieN = (IeN) c4568sM.d;
        String string = "http/1.1";
        sb.append(((ieN == null || ieN.OY() == null) ? "http/1.1" : ((IeN) c4568sM.d).OY().toString()).toUpperCase());
        sb.append(' ');
        sb.append(c4568sM.f());
        sb.append(' ');
        sb.append(c4568sM.r());
        sb.append("\r\n");
        if (AbstractC4648tE.c) {
            IeN ieN2 = (IeN) c4568sM.d;
            if (ieN2 != null && ieN2.OY() != null) {
                string = ((IeN) c4568sM.d).OY().toString();
            }
            string.toUpperCase();
            c4568sM.f();
            c4568sM.r();
        }
        List listI = i((List) c4568sM.b);
        if (listI != null) {
            int size = listI.size();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                IW iw = (IW) listI.get(i2);
                if (iw != null) {
                    String str = iw.f3220a;
                    sb.append(str);
                    sb.append(": ");
                    String str2 = iw.b;
                    sb.append(str2);
                    sb.append("\r\n");
                    if (HttpResponseHeader.ContentRange.equalsIgnoreCase(str) || (HttpResponseHeader.AcceptRanges.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
            if (z) {
                iB = b(c4568sM);
                if (iB > 0) {
                    sb.append("Content-Range: bytes ");
                    sb.append(Math.max(i, 0));
                    sb.append("-");
                    AbstractC3888ke0.t(sb, iB - 1, "/", iB, "\r\n");
                }
            }
        } else {
            iB = b(c4568sM);
            if (iB > 0) {
                sb.append("Content-Range: bytes ");
                sb.append(Math.max(i, 0));
                sb.append("-");
                AbstractC3888ke0.t(sb, iB - 1, "/", iB, "\r\n");
            }
        }
        sb.append("Connection: close\r\n\r\n");
        String string2 = sb.toString();
        No0 no0 = AbstractC4648tE.f5026a;
        return string2;
    }

    public static String f(C4568sM c4568sM, boolean z, boolean z2) {
        String strE;
        if (((IeN) c4568sM.d).lk() < 200 || ((IeN) c4568sM.d).lk() >= 300) {
            if (AbstractC4648tE.c) {
                c4568sM.f();
            }
            return "response code: " + c4568sM.f();
        }
        String strE2 = c4568sM.e("Content-Type");
        if (strE2 == null || !(strE2.startsWith("video/") || "application/octet-stream".equals(strE2) || "binary/octet-stream".equals(strE2))) {
            if (AbstractC4648tE.c) {
                "Content-Type: ".concat(String.valueOf(strE2));
            }
            return "Content-Type: ".concat(String.valueOf(strE2));
        }
        int iB = b(c4568sM);
        if (iB <= 0) {
            if (AbstractC4648tE.c) {
                "Content-Length: ".concat(String.valueOf(iB));
            }
            return "Content-Length: ".concat(String.valueOf(iB));
        }
        if (z && ((strE = c4568sM.e(HttpResponseHeader.AcceptRanges)) == null || !strE.contains("bytes"))) {
            if (AbstractC4648tE.c) {
                "Accept-Ranges: ".concat(String.valueOf(strE));
            }
            return "Accept-Ranges: ".concat(String.valueOf(strE));
        }
        if (!z2 || c4568sM.g() != null) {
            return null;
        }
        No0 no0 = AbstractC4648tE.f5026a;
        return "response body null";
    }

    public static ArrayList g(Map map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(new IW((String) entry.getKey(), (String) entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static ArrayList h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static List i(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (AbstractC4648tE.c) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IW iw = (IW) it.next();
            if (!HttpRequestHeader.Host.equals(iw.f3220a)) {
                String str = iw.f3220a;
                if ("Keep-Alive".equals(str) || "Connection".equals(str) || "Proxy-Connection".equals(str)) {
                }
            }
            arrayList.add(iw);
        }
        list.removeAll(arrayList);
        if (AbstractC4648tE.c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
        return list;
    }

    public static void j(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void k(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }
}
