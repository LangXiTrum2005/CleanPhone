package com.bytedance.sdk.openadsdk.core.sLN.lk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lk {

    @NonNull
    private final Map<LD, String> LD;

    @NonNull
    private final List<String> Lxb;

    public lk(@NonNull List<String> list) {
        this.Lxb = list;
        HashMap map = new HashMap();
        this.LD = map;
        map.put(LD.CACHEBUSTING, LD());
    }

    @NonNull
    private String LD() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    public List<String> Lxb() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.Lxb) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (LD ld : LD.values()) {
                    String str = this.LD.get(ld);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = strReplaceAll.replaceAll("\\[" + ld.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    @NonNull
    private String LD(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }

    @NonNull
    public lk Lxb(@Nullable com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb) {
        if (lxb != null) {
            this.LD.put(LD.ERRORCODE, lxb.Lxb());
        }
        return this;
    }

    @NonNull
    public lk Lxb(@Nullable long j) {
        if (j >= 0) {
            String strLD = LD(j);
            if (!TextUtils.isEmpty(strLD)) {
                this.LD.put(LD.CONTENTPLAYHEAD, strLD);
            }
        }
        return this;
    }

    @NonNull
    public lk Lxb(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.LD.put(LD.ASSETURI, str);
        }
        return this;
    }
}
