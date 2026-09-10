package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f23030d = p0.q(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f23032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f23033c;

    public h(Application application) {
        this.f23031a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f23032b = sharedPreferences;
        this.f23033c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String string;
        Set<String> stringSet = this.f23032b.getStringSet("stored_info", s0.f23188i);
        if (stringSet.isEmpty()) {
            stringSet = f23030d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f23031a;
            p pVarA = j0.a(application, str);
            if (pVarA == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences((String) pVarA.f23158a, 0).getAll().get((String) pVarA.f23159b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
