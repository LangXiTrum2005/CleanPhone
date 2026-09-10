package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Store.java */
/* JADX INFO: loaded from: classes3.dex */
public class dent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f22634attabal;

    /* JADX INFO: compiled from: Store.java */
    public static class attabal {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final long f22635wireman = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f22636attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f22637dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f22638saneness;

        public attabal(String str, String str2, long j) {
            this.f22636attabal = str;
            this.f22638saneness = str2;
            this.f22637dern = j;
        }

        public static String attabal(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(X3.j.W, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                return null;
            }
        }

        public static attabal dern(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new attabal(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new attabal(jSONObject.getString("token"), jSONObject.getString(X3.j.W), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                e.toString();
                return null;
            }
        }

        public boolean saneness(String str) {
            return System.currentTimeMillis() > this.f22637dern + f22635wireman || !str.equals(this.f22638saneness);
        }
    }

    public dent(Context context) {
        this.f22634attabal = context.getSharedPreferences("com.google.android.gms.appid", 0);
        attabal(context, "com.google.android.gms.appid-no-backup");
    }

    public final void attabal(Context context, String str) {
        File file = new File(picketboat.saneness.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || marial()) {
                return;
            }
            dern();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public synchronized void beachfront(String str, String str2, String str3, String str4) {
        String strAttabal = attabal.attabal(str3, str4, System.currentTimeMillis());
        if (strAttabal == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f22634attabal.edit();
        editorEdit.putString(saneness(str, str2), strAttabal);
        editorEdit.commit();
    }

    public synchronized void dern() {
        this.f22634attabal.edit().clear().commit();
    }

    public synchronized boolean marial() {
        return this.f22634attabal.getAll().isEmpty();
    }

    public final String saneness(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized attabal wireman(String str, String str2) {
        return attabal.dern(this.f22634attabal.getString(saneness(str, str2), null));
    }
}
