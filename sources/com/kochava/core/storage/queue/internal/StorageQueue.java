package com.kochava.core.storage.queue.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class StorageQueue implements StorageQueueApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskManagerApi f28065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28066c;
    public final List d = androidx.media3.extractor.text.ttml.a.u();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f28067e = false;

    class a implements Runnable {
        public final /* synthetic */ ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ StorageQueueChangedAction f28068Y;

        public a(StorageQueue storageQueue, ArrayList arrayList, StorageQueueChangedAction storageQueueChangedAction) {
            this.X = arrayList;
            this.f28068Y = storageQueueChangedAction;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((StorageQueueChangedListener) it.next()).a(this.f28068Y);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28069a;

        static {
            int[] iArr = new int[StorageQueueChangedAction.values().length];
            f28069a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28069a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28069a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28069a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28069a[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public StorageQueue(Context context, TaskManagerApi taskManagerApi, String str, int i2) {
        this.f28064a = context.getSharedPreferences(str, 0);
        this.f28065b = taskManagerApi;
        this.f28066c = i2;
        a();
    }

    public final void a() {
        int iF = f();
        SharedPreferences sharedPreferences = this.f28064a;
        if (iF <= 0) {
            sharedPreferences.edit().remove("write_index").remove("read_index").apply();
        }
        if (sharedPreferences.getLong("write_index", -1L) == -1) {
            sharedPreferences.edit().putLong("write_index", 0L).apply();
        }
        if (sharedPreferences.getLong("read_index", -1L) == -1) {
            sharedPreferences.edit().putLong("read_index", 0L).apply();
        }
        if (sharedPreferences.getLong("last_add_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_add_time_millis", 0L).apply();
        }
        if (sharedPreferences.getLong("last_update_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_update_time_millis", 0L).apply();
        }
        if (sharedPreferences.getLong("last_remove_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_remove_time_millis", 0L).apply();
        }
    }

    public final void b(StorageQueueChangedAction storageQueueChangedAction) {
        if (this.f28067e) {
            return;
        }
        int i2 = b.f28069a[storageQueueChangedAction.ordinal()];
        if (i2 == 1) {
            this.f28064a.edit().putLong("last_add_time_millis", System.currentTimeMillis()).apply();
        } else if (i2 == 2 || i2 == 3) {
            this.f28064a.edit().putLong("last_update_time_millis", System.currentTimeMillis()).apply();
        } else if (i2 == 4 || i2 == 5) {
            this.f28064a.edit().putLong("last_remove_time_millis", System.currentTimeMillis()).apply();
        }
        ArrayList arrayListQ = ObjectUtil.q(this.d);
        if (arrayListQ.isEmpty()) {
            return;
        }
        this.f28065b.b(new a(this, arrayListQ, storageQueueChangedAction));
    }

    public final synchronized boolean c(String str) {
        if (this.f28067e) {
            return false;
        }
        if (e()) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f28064a;
        long j = sharedPreferences.getLong("write_index", 0L);
        sharedPreferences.edit().putString(Long.toString(j), str).putLong("write_index", j + 1).apply();
        b(StorageQueueChangedAction.X);
        return true;
    }

    public final boolean d() {
        if (this.f28067e || f() <= 0) {
            return false;
        }
        long j = this.f28064a.getLong("read_index", 0L);
        if (!this.f28064a.contains(Long.toString(j))) {
            return false;
        }
        this.f28064a.edit().remove(Long.toString(j)).putLong("read_index", j + 1).apply();
        if (f() > 0) {
            return true;
        }
        a();
        return true;
    }

    public final synchronized boolean e() {
        if (this.f28066c <= 0) {
            return false;
        }
        return f() >= this.f28066c;
    }

    public final synchronized int f() {
        return Math.max(0, this.f28064a.getAll().size() - 5);
    }

    public final synchronized void g(String str) {
        if (this.f28067e) {
            return;
        }
        if (f() <= 0) {
            return;
        }
        long j = this.f28064a.getLong("read_index", 0L);
        if (this.f28064a.contains(Long.toString(j))) {
            this.f28064a.edit().putString(Long.toString(j), str).apply();
            b(StorageQueueChangedAction.Z);
        }
    }
}
