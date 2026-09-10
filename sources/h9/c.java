package h9;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.lifecycle.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f42255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f42256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f42257j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f42259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a7.b f42260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f42261d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f42263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f42264g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.i f42258a = new x.i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f42262e = new Messenger(new l(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f42259b = context;
        this.f42260c = new a7.b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new q9.a("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f42261d = scheduledThreadPoolExecutor;
    }

    public final void a(Bundle bundle, String str) {
        x.i iVar = this.f42258a;
        synchronized (iVar) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) iVar.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                sb2.append("Missing callback for ");
                sb2.append(str);
                Log.w("Rpc", sb2.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    public final Task b(Bundle bundle) {
        String string;
        Context context;
        synchronized (c.class) {
            int i10 = f42255h;
            f42255h = i10 + 1;
            string = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        x.i iVar = this.f42258a;
        synchronized (iVar) {
            iVar.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f42260c.e() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.f42259b;
        synchronized (c.class) {
            try {
                if (f42256i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f42256i = PendingIntent.getBroadcast(context2, 0, intent2, y9.e.f54352a);
                }
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, f42256i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        intent.putExtra("kid", q4.a.j(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f42262e);
        if (this.f42263f != null || this.f42264g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f42263f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f42264g.f42265a.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f42260c.e() == 2) {
                    context = this.f42259b;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                } else {
                    this.f42259b.startService(intent);
                }
            }
        } else if (this.f42260c.e() == 2) {
            context = this.f42259b;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.f42259b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(a7.g.f3425b, new g9.k(this, string, this.f42261d.schedule(new a0(taskCompletionSource, 22), 30L, TimeUnit.SECONDS), 19));
        return taskCompletionSource.getTask();
    }
}
