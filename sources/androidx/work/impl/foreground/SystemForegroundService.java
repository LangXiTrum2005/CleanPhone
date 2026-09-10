package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.y;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.m0;
import d5.o;
import e5.l;
import g9.k;
import java.util.UUID;
import l5.b;
import n5.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5038f = o.i("SystemFgService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f5039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f5041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NotificationManager f5042e;

    public final void a() {
        this.f5039b = new Handler(Looper.getMainLooper());
        this.f5042e = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f5041d = bVar;
        if (bVar.f45046i != null) {
            o.g().f(b.f45037j, "A callback already exists.", new Throwable[0]);
        } else {
            bVar.f45046i = this;
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5041d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f5040c;
        String str = f5038f;
        if (z10) {
            o.g().h(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5041d.g();
            a();
            this.f5040c = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f5041d;
        l lVar = bVar.f45038a;
        String str2 = b.f45037j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            o.g().h(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = lVar.f39111c;
            ((k) bVar.f45039b).k(new m0(bVar, workDatabase, stringExtra, 21));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            o.g().h(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            lVar.getClass();
            lVar.f39112d.k(new a(lVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        o.g().h(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = bVar.f45046i;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f5040c = true;
        o.g().e(str, "All commands completed.", new Throwable[0]);
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }
}
