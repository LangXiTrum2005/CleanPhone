package sg.bigo.ads.common.o;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47356b;

    private d(Context context, long j) {
        this.f47355a = context;
        this.f47356b = j;
    }

    private synchronized sg.bigo.ads.common.a a() {
        f fVarA;
        e eVarA = a(this.f47355a);
        if (eVarA == null) {
            throw new b();
        }
        fVarA = eVarA.a(this.f47356b, TimeUnit.MILLISECONDS);
        if (fVarA == null) {
            eVarA.a();
            throw new b();
        }
        return new sg.bigo.ads.common.a(fVarA.a(), fVarA.b());
    }

    public static sg.bigo.ads.common.a a(Context context, long j) {
        try {
            return new d(context, j).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static e a(Context context) {
        e eVarA = e.a(context);
        if (eVarA.f47358a.isEmpty()) {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            try {
                eVarA.f47359b = true;
                boolean zBindService = context.bindService(intent, eVarA, 1);
                if (!zBindService) {
                    if (zBindService) {
                        return null;
                    }
                    eVarA.a();
                    return null;
                }
                if (!zBindService) {
                    eVarA.a();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                eVarA.a();
                throw th;
            }
        }
        return eVarA;
    }
}
