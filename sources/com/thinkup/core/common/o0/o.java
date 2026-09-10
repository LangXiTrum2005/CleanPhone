package com.thinkup.core.common.o0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.network.adx.AdxTUInitManager;
import com.unity3d.services.core.fid.Constants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42132n = 2;
    public static final int o = -1;
    public static final int o0 = 3;
    private static volatile o om;
    private final String oo = "AdxSDKDetectManager";
    private final AtomicBoolean on = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.thinkup.core.common.o0.o$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ m m;
        final /* synthetic */ Activity o;

        private AnonymousClass1(Activity activity, m mVar) {
            this.o = activity;
            this.m = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String string = this.o.getResources().getString(o00.o(this.o, "adx_sdk_check_tips_title", k.f38992h));
                String string2 = this.o.getResources().getString(o00.o(this.o, "adx_sdk_check_tips_confirm", k.f38992h));
                Activity activity = this.o;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, o00.o(activity, "system_dialog", "style"));
                builder.setTitle(string).setMessage(this.m.m).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.thinkup.core.common.o0.o.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.thinkup.core.common.o0.o.1.2
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        o.this.on.set(true);
                    }
                });
                alertDialogCreate.show();
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
    }

    private o() {
    }

    public static o o() {
        if (om == null) {
            synchronized (o.class) {
                try {
                    if (om == null) {
                        om = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om;
    }

    public static m o(Context context) {
        try {
            try {
                Object objInvoke = AdxTUInitManager.class.getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                if (objInvoke != null && (objInvoke instanceof TUInitMediation)) {
                    try {
                        Class.forName(((TUInitMediation) objInvoke).getNetworkSDKClass());
                    } catch (Throwable th) {
                        String string = "There is a problem with the integrated TU SDK:Adx aar is missing";
                        if (context != null) {
                            string = context.getResources().getString(o00.o(context, "adx_sdk_check_tips_miss_sdk", k.f38992h));
                            try {
                                string = String.format(string, mo.o0m);
                            } catch (Throwable unused) {
                            }
                        }
                        return new m(2, string, th.getMessage());
                    }
                }
            } catch (Throwable th2) {
                String string2 = "There is a problem with the integrated TU SDK:Adx Adapter is missing";
                if (context != null) {
                    string2 = context.getResources().getString(o00.o(context, "adx_sdk_check_tips_miss_adapter", k.f38992h));
                    try {
                        string2 = String.format(string2, mo.o0m);
                    } catch (Throwable unused2) {
                    }
                }
                return new m(1, string2, th2.getMessage());
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static void o(Activity activity) {
        if (activity == null) {
            return;
        }
        o0n.m();
    }
}
