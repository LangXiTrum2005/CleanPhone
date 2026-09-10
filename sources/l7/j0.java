package l7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j2.n f45174d = new j2.n(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j0 f45175e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalBroadcastManager f45176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f45177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f45178c;

    public j0(LocalBroadcastManager localBroadcastManager, i0 i0Var) {
        this.f45176a = localBroadcastManager;
        this.f45177b = i0Var;
    }

    public final void a(h0 h0Var, boolean z10) {
        boolean zEquals;
        SharedPreferences sharedPreferences = this.f45177b.f45154a;
        h0 h0Var2 = this.f45178c;
        this.f45178c = h0Var;
        if (z10) {
            if (h0Var != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", h0Var.f45142a);
                    jSONObject.put("first_name", h0Var.f45143b);
                    jSONObject.put("middle_name", h0Var.f45144c);
                    jSONObject.put("last_name", h0Var.f45145d);
                    jSONObject.put("name", h0Var.f45146e);
                    Uri uri = h0Var.f45147f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = h0Var.f45148g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (h0Var2 == null) {
            zEquals = h0Var == null;
        } else {
            zEquals = h0Var2.equals(h0Var);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", h0Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", h0Var);
        this.f45176a.sendBroadcast(intent);
    }
}
