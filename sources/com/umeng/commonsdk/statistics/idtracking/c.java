package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.ay;
import com.umeng.commonsdk.config.FieldManager;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2672a = ay.b().b(ay.l);
    public static final String b = "key_umeng_sp_honor_oaid";
    private static final String c = "honor_oaid";
    private Context d;

    public c(Context context) {
        super(c);
        this.d = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.d.getSharedPreferences(f2672a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
