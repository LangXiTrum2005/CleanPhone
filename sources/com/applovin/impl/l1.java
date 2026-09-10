package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8340c;

    public l1(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f8338a = JsonUtils.getString(jSONObject, "name", "");
        this.f8339b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f8340c = q7.a(list);
        } else {
            this.f8340c = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f8339b;
    }

    public String b() {
        return this.f8338a;
    }

    public boolean c() {
        return this.f8340c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || q7.a(str2, str) != 1) {
            return str3 == null || q7.a(str3, str) != -1;
        }
        return false;
    }
}
