package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import g4.d;
import java.util.HashMap;
import v9.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4981a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4982b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4983c = new d(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4984d = new f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4984d;
    }
}
