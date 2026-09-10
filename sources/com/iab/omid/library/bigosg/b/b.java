package com.iab.omid.library.bigosg.b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f21653a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f21655c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21656e;
    private a f;

    public interface a {
        void a(boolean z2);
    }

    private b() {
    }

    public static b a() {
        return f21653a;
    }

    private void e() {
        this.f21655c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    b.this.a(true);
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    b.this.a(false);
                } else {
                    if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return;
                    }
                    b.this.a(false);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f21654b.registerReceiver(this.f21655c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f21654b;
        if (context == null || (broadcastReceiver = this.f21655c) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.f21655c = null;
    }

    private void g() {
        boolean z2 = !this.f21656e;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = com.iab.omid.library.bigosg.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z2);
        }
    }

    public void b() {
        e();
        this.d = true;
        g();
    }

    public void c() {
        f();
        this.d = false;
        this.f21656e = false;
        this.f = null;
    }

    public boolean d() {
        return !this.f21656e;
    }

    public void a(Context context) {
        this.f21654b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        if (this.f21656e != z2) {
            this.f21656e = z2;
            if (this.d) {
                g();
                a aVar = this.f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }
}
