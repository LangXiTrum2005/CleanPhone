package gj;

import android.app.Activity;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.HashMap;
import xi.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ac.a f41938b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41937a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41939c = false;

    public final void a(Activity activity, ac.a aVar, a4.a aVar2) {
        if (activity == null) {
            ((TaskCompletionSource) aVar2.f3382b).setException(new Exception("Unable to detect current Android Activity."));
            return;
        }
        synchronized (this.f41937a) {
            if (this.f41939c) {
                ((TaskCompletionSource) aVar2.f3382b).setException(new Exception("A request for permissions is already running, please wait for it to finish before doing another request."));
                return;
            }
            this.f41939c = true;
            this.f41938b = aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.POST_NOTIFICATIONS");
            b0.b.i(activity, (String[]) arrayList.toArray(new String[0]), PsExtractor.VIDEO_STREAM_MASK);
        }
    }

    @Override // xi.t
    public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        ac.a aVar;
        synchronized (this.f41937a) {
            if (this.f41939c && i10 == 240 && (aVar = this.f41938b) != null) {
                this.f41938b = null;
                this.f41939c = false;
                boolean z10 = iArr.length > 0 && iArr[0] == 0;
                f fVar = (f) aVar.f3453c;
                HashMap map = (HashMap) aVar.f3454d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) aVar.f3452b;
                a.a.f3311a.getSharedPreferences("io.flutter.plugins.firebase.messaging.permissions", 0).edit().putBoolean("notification_permission_requested", true).apply();
                map.put("authorizationStatus", Integer.valueOf(z10 ? 1 : fVar.b()));
                taskCompletionSource.setResult(map);
                return true;
            }
            return false;
        }
    }
}
