package ae;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import cc.a2;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.concurrent.ExecutionException;
import l7.i0;
import zc.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements r, q7.m, xi.c, SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3488b;

    public /* synthetic */ a(int i10, String str, Object obj) {
        this.f3487a = i10;
        this.f3488b = str;
    }

    @Override // q7.m
    public void c(boolean z10) {
        String str = this.f3488b;
        if (z10) {
            try {
                w7.a aVar = new w7.a(str);
                if ((aVar.f52992b == null || aVar.f52993c == null) ? false : true) {
                    a2.P(aVar.f52991a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // ae.r
    public Object d() {
        switch (this.f3487a) {
            case 0:
                throw new com.google.gson.h(this.f3488b);
            case 1:
                throw new com.google.gson.h(this.f3488b);
            default:
                throw new com.google.gson.h(this.f3488b);
        }
    }

    @Override // xi.c
    public void e(Object obj) {
        if (!(obj instanceof List)) {
            String channelName = this.f3488b;
            kotlin.jvm.internal.n.f(channelName, "channelName");
            Throwable thA = wj.h.a(t9.e.c(new nj.e("channel-error", defpackage.e.o("Unable to establish connection on channel: '", channelName, "'."), "")));
            if (thA != null) {
                Log.e("QuickActionsAndroid", "Failed to handle launch action: " + thA.getMessage());
                return;
            }
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            Throwable thA2 = wj.h.a(wj.r.f53297a);
            if (thA2 != null) {
                Log.e("QuickActionsAndroid", "Failed to handle launch action: " + thA2.getMessage());
                return;
            }
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
        Throwable thA3 = wj.h.a(t9.e.c(new nj.e((String) obj2, (String) obj3, (String) list.get(2))));
        if (thA3 != null) {
            Log.e("QuickActionsAndroid", "Failed to handle launch action: " + thA3.getMessage());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws ExecutionException {
        switch (this.f3487a) {
            case 7:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str = (String) task.getResult();
                if (!TextUtils.isEmpty(str)) {
                    String str2 = this.f3488b;
                    if (str.endsWith(str2)) {
                        return str2;
                    }
                }
                throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
            default:
                return !task.isSuccessful() ? Tasks.forException(nf.j(task)) : Tasks.forResult(new Pair((String) task.getResult(), this.f3488b));
        }
    }

    public /* synthetic */ a(String str, int i10) {
        this.f3487a = i10;
        this.f3488b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = this.f3487a;
        String str = this.f3488b;
        z zVar = (z) obj;
        switch (i10) {
            case 5:
                i0 i0Var = FirebaseMessaging.f24672n;
                zVar.getClass();
                Task taskA = zVar.a(new zc.w("S", str));
                zVar.c();
                return taskA;
            default:
                i0 i0Var2 = FirebaseMessaging.f24672n;
                zVar.getClass();
                Task taskA2 = zVar.a(new zc.w("U", str));
                zVar.c();
                return taskA2;
        }
    }
}
