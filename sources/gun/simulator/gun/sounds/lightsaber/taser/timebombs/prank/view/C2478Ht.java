package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2478Ht {
    public static final Object c = new Object();
    public static ServiceConnectionC3201cm0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3190a;
    public final N5 b = new N5(20);

    public C2478Ht(Context context) {
        this.f3190a = context;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        ServiceConnectionC3201cm0 serviceConnectionC3201cm0;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ServiceConnectionC3201cm0(context);
                }
                serviceConnectionC3201cm0 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return serviceConnectionC3201cm0.b(intent).continueWith(new N5(22), new C2953a0(4));
        }
        if (C3844k50.i().l(context)) {
            Aj0.b(context, serviceConnectionC3201cm0, intent);
        } else {
            serviceConnectionC3201cm0.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        Context context = this.f3190a;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        GJ gj = new GJ(2, context, intent);
        N5 n5 = this.b;
        return Tasks.call(n5, gj).continueWithTask(n5, new C2809Un(context, z2, intent));
    }
}
