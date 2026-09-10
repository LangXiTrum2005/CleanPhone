package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23103a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23104b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23105c;
    public static boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f23106e;
    public static JSONObject f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f23104b) {
            try {
                Objects.toString(f);
                Objects.toString(jSONObject);
                f = jSONObject;
                d = true;
                Context contextD = Uc.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    C6 c6A = B6.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f;
                    if (jSONObject2 == null) {
                        c6A.a("publisher_provided_unified_id");
                    } else {
                        C6.a(c6A, "publisher_provided_unified_id", String.valueOf(jSONObject2), false, 4, (Object) null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f23103a) {
            if (f23105c) {
                return f23106e;
            }
            f23105c = true;
            Context contextD = Uc.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                String string = B6.a(contextD, "unified_id_info_store").f22735a.getString("ufids", null);
                if (string != null) {
                    try {
                        f23106e = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    return f23106e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f23104b) {
            if (d) {
                Objects.toString(f);
                return f;
            }
            d = true;
            Context contextD = Uc.d();
            String string = null;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                string = B6.a(contextD, "unified_id_info_store").f22735a.getString("publisher_provided_unified_id", null);
            }
            try {
                f = new JSONObject(string);
            } catch (NullPointerException | JSONException unused) {
            }
            Objects.toString(f);
            return f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f23103a) {
            try {
                f23106e = jSONObject;
                f23105c = true;
                Context contextD = Uc.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    C6 c6A = B6.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f23106e;
                    if (jSONObject2 == null) {
                        c6A.a("ufids");
                    } else {
                        C6.a(c6A, "ufids", String.valueOf(jSONObject2), false, 4, (Object) null);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(contextD).edit();
                    JSONObject jSONObject3 = f23106e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
