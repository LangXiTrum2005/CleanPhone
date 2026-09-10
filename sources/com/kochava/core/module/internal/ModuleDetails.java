package com.kochava.core.module.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.ReflectionUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.core.util.internal.TimeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleDetails implements ModuleDetailsApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28034c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f28035e;
    public final List f;

    public ModuleDetails(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f28032a = true;
        this.f28033b = str;
        this.f28034c = str2;
        this.d = str3;
        this.f28035e = arrayList;
        this.f = arrayList2;
    }

    public static ModuleDetails a(Context context, String str) {
        if (!ReflectionUtil.b(str)) {
            return new ModuleDetails();
        }
        try {
            Class<?> cls = Class.forName(str);
            String strN = ObjectUtil.n(ReflectionUtil.a(cls, "SDK_MODULE_NAME"));
            String str2 = strN != null ? strN : "";
            String strN2 = ObjectUtil.n(ReflectionUtil.a(cls, "SDK_VERSION"));
            String str3 = strN2 != null ? strN2 : "";
            String strA = TimeUtil.a(new Date(ObjectUtil.m(0L, ReflectionUtil.a(cls, "SDK_BUILD_TIME_MILLIS")).longValue()));
            JsonArrayApi jsonArrayApiI = ObjectUtil.i(ReflectionUtil.a(cls, "SDK_PERMISSIONS"));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jsonArrayApiI.length(); i2++) {
                JsonObjectApi jsonObjectApiB = jsonArrayApiI.b(i2);
                if (jsonObjectApiB != null) {
                    arrayList.add(new ModuleDetailsPermission(jsonObjectApiB.getString("name", ""), context.getPackageManager().checkPermission(jsonObjectApiB.getString("path", ""), context.getPackageName()) == 0));
                }
            }
            JsonArrayApi jsonArrayApiI2 = ObjectUtil.i(ReflectionUtil.a(cls, "SDK_DEPENDENCIES"));
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < jsonArrayApiI2.length(); i3++) {
                JsonObjectApi jsonObjectApiB2 = jsonArrayApiI2.b(i3);
                if (jsonObjectApiB2 != null) {
                    arrayList2.add(new ModuleDetailsDependency(jsonObjectApiB2.getString("name", ""), ReflectionUtil.b(jsonObjectApiB2.getString("path", ""))));
                }
            }
            if (!str2.isEmpty() && !str3.isEmpty() && !strA.isEmpty()) {
                return new ModuleDetails(str2, str3, strA, arrayList, arrayList2);
            }
            return new ModuleDetails();
        } catch (Throwable unused) {
            return new ModuleDetails();
        }
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsApi
    public final boolean isValid() {
        return this.f28032a;
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        String str = this.f28033b;
        if (!TextUtil.b(str)) {
            jsonObjectW.g("name", str);
        }
        String str2 = this.f28034c;
        if (!TextUtil.b(str2)) {
            jsonObjectW.g("version", str2);
        }
        String str3 = this.d;
        if (!TextUtil.b(str3)) {
            jsonObjectW.g("buildDate", str3);
        }
        JsonArray jsonArrayG = JsonArray.g();
        for (ModuleDetailsPermissionApi moduleDetailsPermissionApi : this.f28035e) {
            if (moduleDetailsPermissionApi.a()) {
                String name = moduleDetailsPermissionApi.getName();
                synchronized (jsonArrayG) {
                    jsonArrayG.e(name);
                }
            }
        }
        if (jsonArrayG.length() > 0) {
            jsonObjectW.A("permissions", jsonArrayG);
        }
        JsonArray jsonArrayG2 = JsonArray.g();
        for (ModuleDetailsDependencyApi moduleDetailsDependencyApi : this.f) {
            if (moduleDetailsDependencyApi.a()) {
                String name2 = moduleDetailsDependencyApi.getName();
                synchronized (jsonArrayG2) {
                    jsonArrayG2.e(name2);
                }
            }
        }
        if (jsonArrayG2.length() > 0) {
            jsonObjectW.A("dependencies", jsonArrayG2);
        }
        return jsonObjectW;
    }

    public ModuleDetails() {
        this.f28032a = false;
        this.f28033b = "";
        this.f28034c = "";
        this.d = "";
        List list = Collections.EMPTY_LIST;
        this.f28035e = list;
        this.f = list;
    }
}
