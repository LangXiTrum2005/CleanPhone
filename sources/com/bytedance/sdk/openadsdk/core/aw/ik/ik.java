package com.bytedance.sdk.openadsdk.core.aw.ik;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.saneness;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static boolean ka = false;
    private static SimpleDateFormat ri;
    private final Map<lr, String> ik;
    private final List<String> lr;

    public ik(List<String> list, wjv wjvVar) {
        int iLji;
        this.lr = list;
        HashMap map = new HashMap();
        this.ik = map;
        map.put(lr.CACHEBUSTING, ik());
        map.put(lr.TIMESTAMP, lr());
        map.put(lr.APPBUNDLE, nr.ri().getPackageName());
        lr lrVar = lr.PLAYERSTATE;
        map.put(lrVar, "");
        if (wjvVar != null && ((iLji = wjvVar.lji()) == 3 || iLji == 7 || iLji == 8)) {
            map.put(lrVar, saneness.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(lr.SERVERSIDE, "0");
    }

    private String ik() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String lr() {
        if (ri == null) {
            ri = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String str = ri.format(new Date());
        if (!ka) {
            return str;
        }
        int iFr = ig.fr();
        if (iFr < 0) {
            if (iFr <= -10) {
                return str + iFr;
            }
            return str + "-0" + (-iFr);
        }
        if (iFr < 10) {
            return str + "+0" + iFr;
        }
        return str + "+" + iFr;
    }

    public List<String> ri() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.lr) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (lr lrVar : lr.values()) {
                    String str = this.ik.get(lrVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = lrVar == lr.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(lrVar.name(), str) : strReplaceAll.replaceAll("\\[" + lrVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public ik lr(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.ik.put(lr.ASSETURI, str);
        }
        return this;
    }

    public ik ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar) {
        if (riVar != null) {
            this.ik.put(lr.ERRORCODE, riVar.ri());
        }
        return this;
    }

    public ik ri(long j) {
        if (j >= 0) {
            String strLr = lr(j);
            if (!TextUtils.isEmpty(strLr)) {
                this.ik.put(lr.CONTENTPLAYHEAD, strLr);
            }
        }
        return this;
    }

    private String lr(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }

    public ik ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.ik.put(lr.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }
}
