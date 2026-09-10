package b6;

import com.applovin.impl.ca;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import gj.f;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import wi.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5493b;

    public /* synthetic */ a(f fVar, j jVar) {
        this.f5492a = 5;
        this.f5493b = jVar;
    }

    public void a(int i10) {
        this.f5493b.a(Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f5492a) {
            case 3:
                n.f(task, "task");
                boolean zIsSuccessful = task.isSuccessful();
                j jVar = this.f5493b;
                if (!zIsSuccessful) {
                    jVar.a(Boolean.FALSE);
                } else {
                    jVar.a(Boolean.TRUE);
                }
                break;
            case 4:
                n.f(task, "it");
                this.f5493b.a(null);
                break;
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                j jVar2 = this.f5493b;
                if (!zIsSuccessful2) {
                    Exception exception = task.getException();
                    String message = exception != null ? exception.getMessage() : null;
                    HashMap mapN = ca.n("code", "unknown");
                    if (exception != null) {
                        mapN.put("message", exception.getMessage());
                    } else {
                        mapN.put("message", "An unknown error has occurred.");
                    }
                    jVar2.b("firebase_messaging", message, mapN);
                } else {
                    jVar2.a(task.getResult());
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        n.f(it, "it");
        this.f5493b.a(null);
    }

    public /* synthetic */ a(j jVar, int i10) {
        this.f5492a = i10;
        this.f5493b = jVar;
    }
}
