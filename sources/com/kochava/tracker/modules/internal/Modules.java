package com.kochava.tracker.modules.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.module.internal.ModuleDetails;
import com.kochava.core.module.internal.ModuleDetailsApi;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes5.dex */
public final class Modules implements ModulesApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModuleDetailsApi f28251b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModuleDetails f28252c = null;
    public ModuleDetails d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModuleDetails f28253e = null;
    public ModuleDetails f = null;
    public ModuleDetails g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ModuleDetails f28254h = null;

    public Modules(Context context) {
        this.f28250a = context;
    }

    public static Object a(String str) {
        try {
            return Class.forName(str).getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final synchronized JsonArray b() {
        JsonArray jsonArrayG;
        try {
            jsonArrayG = JsonArray.g();
            ModuleDetailsApi moduleDetailsApi = this.f28251b;
            if (moduleDetailsApi != null) {
                jsonArrayG.f(moduleDetailsApi.toJson());
            }
            ModuleDetails moduleDetails = this.f28252c;
            if (moduleDetails != null) {
                jsonArrayG.f(moduleDetails.toJson());
            }
            ModuleDetails moduleDetails2 = this.d;
            if (moduleDetails2 != null) {
                jsonArrayG.f(moduleDetails2.toJson());
            }
            ModuleDetails moduleDetails3 = this.f28253e;
            if (moduleDetails3 != null) {
                jsonArrayG.f(moduleDetails3.toJson());
            }
            ModuleDetails moduleDetails4 = this.f;
            if (moduleDetails4 != null) {
                jsonArrayG.f(moduleDetails4.toJson());
            }
            ModuleDetails moduleDetails5 = this.g;
            if (moduleDetails5 != null) {
                jsonArrayG.f(moduleDetails5.toJson());
            }
            ModuleDetails moduleDetails6 = this.f28254h;
            if (moduleDetails6 != null) {
                jsonArrayG.f(moduleDetails6.toJson());
            }
        } catch (Throwable th) {
            throw th;
        }
        return jsonArrayG;
    }
}
