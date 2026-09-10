package com.kochava.core.storage.prefs.internal;

import android.content.SharedPreferences;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class StoragePrefs implements StoragePrefsApi, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskManagerApi f28061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28062c = androidx.media3.extractor.text.ttml.a.u();
    public volatile boolean d = false;

    class a implements Runnable {
        public final /* synthetic */ ArrayList X;

        public a(ArrayList arrayList, String str) {
            this.X = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (StoragePrefs.this.d) {
                return;
            }
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((StoragePrefsChangedListener) it.next()).a();
            }
        }
    }

    public StoragePrefs(SharedPreferences sharedPreferences, TaskManagerApi taskManagerApi) {
        this.f28060a = sharedPreferences;
        this.f28061b = taskManagerApi;
    }

    public final synchronized Boolean a(String str, Boolean bool) {
        return ObjectUtil.f(this.f28060a.getAll().get(str), bool);
    }

    public final synchronized Integer b(String str) {
        Integer num;
        synchronized (this) {
            Integer numH = ObjectUtil.h(this.f28060a.getAll().get(str));
            num = numH != null ? numH : 0;
        }
        return num;
    }

    public final synchronized JsonObjectApi c(String str, boolean z2) {
        String strN;
        strN = ObjectUtil.n(this.f28060a.getAll().get(str));
        if (strN == null) {
            strN = null;
        }
        return ObjectUtil.l(strN, z2);
    }

    public final synchronized Long d(String str, Long l2) {
        return ObjectUtil.m(l2, this.f28060a.getAll().get(str));
    }

    public final synchronized String e(String str, String str2) {
        String strN = ObjectUtil.n(this.f28060a.getAll().get(str));
        if (strN != null) {
            str2 = strN;
        }
        return str2;
    }

    public final synchronized void f(String str) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().remove(str).apply();
    }

    public final synchronized void g(String str, boolean z2) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().putBoolean(str, z2).apply();
    }

    public final synchronized void h(String str, int i2) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().putInt(str, i2).apply();
    }

    public final synchronized void i(String str, JsonObjectApi jsonObjectApi) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().putString(str, jsonObjectApi.toString()).apply();
    }

    public final synchronized void j(String str, long j) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().putLong(str, j).apply();
    }

    public final synchronized void k(String str, String str2) {
        if (this.d) {
            return;
        }
        this.f28060a.edit().putString(str, str2).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final synchronized void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.d) {
            return;
        }
        ArrayList arrayListQ = ObjectUtil.q(this.f28062c);
        if (arrayListQ.isEmpty()) {
            return;
        }
        this.f28061b.b(new a(arrayListQ, str));
    }
}
