package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class cl2 extends BroadcastReceiver {
    public final /* synthetic */ dl2 a = dl2.d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            dl2 dl2Var = this.a;
            dl2Var.a(true, dl2Var.c);
            this.a.b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            dl2 dl2Var2 = this.a;
            dl2Var2.a(false, dl2Var2.c);
            this.a.b = false;
        }
    }
}
