package gj;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f41922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f41923c;

    public /* synthetic */ d(f fVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f41921a = 2;
        this.f41922b = map;
        this.f41923c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41921a) {
            case 0:
                Map map = this.f41922b;
                TaskCompletionSource taskCompletionSource = this.f41923c;
                try {
                    FirebaseMessaging firebaseMessagingD = FirebaseMessaging.d();
                    Object obj = map.get("topic");
                    Objects.requireNonNull(obj);
                    Tasks.await(firebaseMessagingD.f24683i.onSuccessTask(new ae.a((String) obj, 6)));
                    taskCompletionSource.setResult(null);
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
                break;
            case 1:
                Map map2 = this.f41922b;
                TaskCompletionSource taskCompletionSource2 = this.f41923c;
                try {
                    FirebaseMessaging firebaseMessagingD2 = FirebaseMessaging.d();
                    Object obj2 = map2.get("enabled");
                    Objects.requireNonNull(obj2);
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    firebaseMessagingD2.getClass();
                    mb.g gVarE = mb.g.e();
                    gVarE.a();
                    gVarE.f45928a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", zBooleanValue).apply();
                    go.k.V(firebaseMessagingD2.f24676b, firebaseMessagingD2.f24677c, firebaseMessagingD2.k());
                    taskCompletionSource2.setResult(null);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
                break;
            case 2:
                Map map3 = this.f41922b;
                TaskCompletionSource taskCompletionSource3 = this.f41923c;
                try {
                    FirebaseMessaging firebaseMessagingD3 = FirebaseMessaging.d();
                    Object obj3 = map3.get("enabled");
                    Objects.requireNonNull(obj3);
                    firebaseMessagingD3.j(((Boolean) obj3).booleanValue());
                    dd.f fVar = new dd.f();
                    fVar.put("isAutoInitEnabled", Boolean.valueOf(firebaseMessagingD3.f24680f.c()));
                    taskCompletionSource3.setResult(fVar);
                } catch (Exception e12) {
                    taskCompletionSource3.setException(e12);
                    return;
                }
                break;
            case 3:
                Map map4 = this.f41922b;
                TaskCompletionSource taskCompletionSource4 = this.f41923c;
                try {
                    FirebaseMessaging firebaseMessagingD4 = FirebaseMessaging.d();
                    Object obj4 = map4.get("topic");
                    Objects.requireNonNull(obj4);
                    Tasks.await(firebaseMessagingD4.f24683i.onSuccessTask(new ae.a((String) obj4, 5)));
                    taskCompletionSource4.setResult(null);
                } catch (Exception e13) {
                    taskCompletionSource4.setException(e13);
                    return;
                }
                break;
            default:
                Map map5 = this.f41922b;
                TaskCompletionSource taskCompletionSource5 = this.f41923c;
                try {
                    FirebaseMessaging.d().i(android.support.v4.media.session.a.s(map5));
                    taskCompletionSource5.setResult(null);
                } catch (Exception e14) {
                    taskCompletionSource5.setException(e14);
                }
                break;
        }
    }

    public /* synthetic */ d(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f41921a = i10;
        this.f41922b = map;
        this.f41923c = taskCompletionSource;
    }
}
