package l5;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.q;
import d5.h;
import d5.o;
import defpackage.e;
import e5.l;
import g5.g;
import g9.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l1.d;
import m5.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i5.b, e5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f45037j = o.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5.a f45039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45040c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f45042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f45043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f45044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i5.c f45045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SystemForegroundService f45046i;

    public b(Context context) {
        l lVarB = l.b(context);
        this.f45038a = lVarB;
        k kVar = lVarB.f39112d;
        this.f45039b = kVar;
        this.f45041d = null;
        this.f45042e = new LinkedHashMap();
        this.f45044g = new HashSet();
        this.f45043f = new HashMap();
        this.f45045h = new i5.c(context, kVar, this);
        lVarB.f39114f.a(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f38694a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f38695b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f38696c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f38694a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f38695b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f38696c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // i5.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.g().e(f45037j, e.n("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f45038a;
            lVar.f39112d.k(new n5.k(lVar, str, true));
        }
    }

    public final void d(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o oVarG = o.g();
        StringBuilder sb2 = new StringBuilder("Notifying with (id: ");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType: ");
        oVarG.e(f45037j, d.i(sb2, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f45046i == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f45042e;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f45041d)) {
            this.f45041d = stringExtra;
            SystemForegroundService systemForegroundService = this.f45046i;
            systemForegroundService.f5039b.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f45046i;
        systemForegroundService2.f5039b.post(new g(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i10 |= ((h) ((Map.Entry) it.next()).getValue()).f38695b;
            }
            h hVar2 = (h) linkedHashMap.get(this.f45041d);
            if (hVar2 != null) {
                SystemForegroundService systemForegroundService3 = this.f45046i;
                systemForegroundService3.f5039b.post(new c(systemForegroundService3, hVar2.f38694a, hVar2.f38696c, i10));
            }
        }
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f45040c) {
            try {
                i iVar = (i) this.f45043f.remove(str);
                if (iVar != null ? this.f45044g.remove(iVar) : false) {
                    this.f45045h.b(this.f45044g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar = (h) this.f45042e.remove(str);
        if (str.equals(this.f45041d) && this.f45042e.size() > 0) {
            Iterator it = this.f45042e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f45041d = (String) entry.getKey();
            if (this.f45046i != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.f45046i;
                systemForegroundService.f5039b.post(new c(systemForegroundService, hVar2.f38694a, hVar2.f38696c, hVar2.f38695b));
                SystemForegroundService systemForegroundService2 = this.f45046i;
                systemForegroundService2.f5039b.post(new q(hVar2.f38694a, 8, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f45046i;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        o oVarG = o.g();
        String str2 = f45037j;
        int i10 = hVar.f38694a;
        int i11 = hVar.f38695b;
        StringBuilder sb2 = new StringBuilder("Removing Notification (id: ");
        sb2.append(i10);
        sb2.append(", workSpecId: ");
        sb2.append(str);
        sb2.append(" ,notificationType: ");
        oVarG.e(str2, d.i(sb2, i11, ")"), new Throwable[0]);
        systemForegroundService3.f5039b.post(new q(hVar.f38694a, 8, systemForegroundService3));
    }

    public final void g() {
        this.f45046i = null;
        synchronized (this.f45040c) {
            this.f45045h.c();
        }
        this.f45038a.f39114f.d(this);
    }

    @Override // i5.b
    public final void f(List list) {
    }
}
