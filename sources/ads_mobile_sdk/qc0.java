package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class qc0 extends ox0 {
    public final Context c;
    public final loun d;
    public final PackageManager e;
    public final taiyuan f;
    public final taiyuan g;
    public final taiyuan h;
    public final taiyuan i;
    public final taiyuan j;
    public final taiyuan k;
    public final taiyuan l;
    public final taiyuan m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(Context context, loun traceLogger) {
        super(no0.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.c = context;
        this.d = traceLogger;
        this.e = context.getPackageManager();
        this.f = p002kotlin.saneness.saneness(new jc0(this));
        this.g = p002kotlin.saneness.saneness(new nc0(this));
        this.h = p002kotlin.saneness.saneness(lc0.a);
        this.i = p002kotlin.saneness.saneness(new pc0(this));
        this.j = p002kotlin.saneness.saneness(new oc0(this));
        this.k = p002kotlin.saneness.saneness(new kc0(this));
        this.l = p002kotlin.saneness.saneness(new ic0(this));
        this.m = p002kotlin.saneness.saneness(new mc0(this));
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final boolean c() {
        if (Intrinsics.wireman(Environment.getExternalStorageState(), "mounted")) {
            return Build.VERSION.SDK_INT >= 30 || this.c.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return false;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        this.f.getValue();
        this.h.getValue();
        this.g.getValue();
        this.i.getValue();
        this.j.getValue();
        this.k.getValue();
        this.l.getValue();
        this.m.getValue();
        return new tn0(Unit.f29295attabal);
    }

    public static final ResolveInfo a(qc0 qc0Var, PackageManager packageManager) {
        qc0Var.getClass();
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
    }

    public final boolean a(Intent intent) {
        PackageManager packageManager = this.c.getPackageManager();
        if (packageManager != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                if (!listQueryIntentActivities.isEmpty()) {
                    return true;
                }
            } else {
                List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                if (!listQueryIntentActivities2.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
