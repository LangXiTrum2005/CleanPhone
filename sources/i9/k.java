package i9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.u6;
import com.ironsource.B5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f42943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f42943b = dVar;
        this.f42942a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i11 = e.f42928a;
        d dVar = this.f42943b;
        Context context = this.f42942a;
        int iC = dVar.c(context, i11);
        int i12 = h.f42935e;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = dVar.b(context, iC, B5.f25703q);
            dVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
