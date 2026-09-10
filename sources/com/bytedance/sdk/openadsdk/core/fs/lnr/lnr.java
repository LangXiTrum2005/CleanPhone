package com.bytedance.sdk.openadsdk.core.fs.lnr;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.vungle.ads.internal.Constants;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private static boolean mml = false;
    private static SimpleDateFormat qdl;
    private final Map<ud, String> lnr;
    private final List<String> ud;

    public lnr(List<String> list, ljh ljhVar) {
        int iVz;
        this.ud = list;
        HashMap map = new HashMap();
        this.lnr = map;
        map.put(ud.CACHEBUSTING, lnr());
        map.put(ud.TIMESTAMP, ud());
        map.put(ud.APPBUNDLE, yt.qdl().getPackageName());
        ud udVar = ud.PLAYERSTATE;
        map.put(udVar, "");
        if (ljhVar != null && ((iVz = ljhVar.vz()) == 3 || iVz == 7 || iVz == 8)) {
            map.put(udVar, Constants.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(ud.SERVERSIDE, "0");
    }

    private String lnr() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String ud() {
        if (qdl == null) {
            qdl = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String str = qdl.format(new Date());
        if (!mml) {
            return str;
        }
        int iUw = gy.uw();
        if (iUw >= 0) {
            return iUw < 10 ? a.m(str, "+0", iUw) : a.m(str, "+", iUw);
        }
        if (iUw > -10) {
            StringBuilder sbX = android.support.v4.media.a.x(str, "-0");
            sbX.append(-iUw);
            return sbX.toString();
        }
        return str + iUw;
    }

    public List<String> qdl() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.ud) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (ud udVar : ud.values()) {
                    String str = this.lnr.get(udVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = udVar == ud.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(udVar.name(), str) : strReplaceAll.replaceAll("\\[" + udVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public lnr qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar) {
        if (qdlVar != null) {
            this.lnr.put(ud.ERRORCODE, qdlVar.qdl());
        }
        return this;
    }

    public lnr qdl(long j) {
        if (j >= 0) {
            String strUd = ud(j);
            if (!TextUtils.isEmpty(strUd)) {
                this.lnr.put(ud.CONTENTPLAYHEAD, strUd);
            }
        }
        return this;
    }

    public lnr qdl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.lnr.put(ud.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    public lnr ud(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.lnr.put(ud.ASSETURI, str);
        }
        return this;
    }

    private String ud(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
