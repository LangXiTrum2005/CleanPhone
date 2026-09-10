package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BW implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2874a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ BW(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.c = context;
        this.b = z;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2874a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            default:
                HS hs = (HS) obj;
                try {
                    Dialog dialog = ((D3) obj2).g;
                    Context context2 = dialog.getContext();
                    if (dialog.isShowing()) {
                        if (context2 == null || context2.isRestricted()) {
                            dialog.setCancelable(true);
                            dialog.setCanceledOnTouchOutside(true);
                        } else {
                            dialog.dismiss();
                        }
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (hs != null) {
                    hs.h(z);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ BW(D3 d3, HS hs, boolean z) {
        this.c = d3;
        this.d = hs;
        this.b = z;
    }
}
