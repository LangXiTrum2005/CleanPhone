package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.a.a;
import com.efs.sdk.base.core.util.c;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GlobalInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f395a = new ConcurrentHashMap();

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f395a.put(str, obj);
        }
    }

    public final Object b(String str, Object obj) {
        Object obj2 = this.f395a.get(str);
        return (obj2 != null || this.f395a.containsKey(str)) ? obj2 : obj;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap map = new HashMap(this.f395a);
        a.a();
        map.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        map.put("w_tm", Long.valueOf(a.b() / 1000));
        return map;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection kVSectionPut = kVSection.put("type", str).put("appid", this.f395a.get("appid")).put("wid", this.f395a.get("wid")).put("pid", this.f395a.get("pid")).put("pkg", this.f395a.get("pkg")).put("ver", this.f395a.get("ver")).put("vcode", this.f395a.get("vcode")).put("ps", this.f395a.get("ps")).put("stime", this.f395a.get("stime"));
        a.a();
        KVSection kVSectionPut2 = kVSectionPut.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        kVSectionPut2.put("w_tm", Long.valueOf(a.b() / 1000)).put("sdk_ver", this.f395a.get("sdk_ver"));
        String strValueOf = String.valueOf(b("uid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            kVSection.put("uid", strValueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", this.f395a.get("lang")).put("brand", this.f395a.get("brand")).put("model", this.f395a.get("model")).put("build_model", this.f395a.get("build_model")).put("rom", this.f395a.get("rom")).put("sdk", this.f395a.get("sdk")).put("dsp_h", this.f395a.get("dsp_h")).put("dsp_w", this.f395a.get("dsp_w")).put("tzone", this.f395a.get("tzone")).put("net", this.f395a.get("net")).put("fr", this.f395a.get("fr"));
        try {
            if (this.f395a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f395a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f395a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f395a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f395a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f395a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String strValueOf = String.valueOf(b("wid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        String strA = c.a(context);
        a("wid", strA);
        return strA;
    }
}
