package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import saneness.sakeen;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class m63 extends BroadcastReceiver implements sakeen, ventriculoatrial {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    public m63(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // saneness.sakeen
    public final void a(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // saneness.sakeen
    public final void b(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    public final synchronized void c() {
        this.c = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            c();
        }
    }

    @Override // saneness.sakeen
    public final void a(HashMap map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    public final /* synthetic */ Void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.a.registerReceiver(this, intentFilter);
        return null;
    }

    @Override // saneness.ventriculoatrial
    public final adultoid a() {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.peevy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37246kowloon.b();
            }
        }, this.b);
    }
}
