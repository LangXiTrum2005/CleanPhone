package haemocyte;

import buttstock.beachfront;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import snarler.marial;

/* JADX INFO: compiled from: RolloutsStateSubscriptionsHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f27461attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Executor f27462dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f27463saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Set<beachfront> f27464wireman = Collections.newSetFromMap(new ConcurrentHashMap());

    public wireman(marial marialVar, attabal attabalVar, Executor executor) {
        this.f27461attabal = marialVar;
        this.f27463saneness = attabalVar;
        this.f27462dern = executor;
    }

    public static /* synthetic */ void attabal(wireman wiremanVar, Task task, final beachfront beachfrontVar, com.google.firebase.remoteconfig.internal.saneness sanenessVar) {
        wiremanVar.getClass();
        try {
            com.google.firebase.remoteconfig.internal.saneness sanenessVar2 = (com.google.firebase.remoteconfig.internal.saneness) task.getResult();
            if (sanenessVar2 != null) {
                final buttstock.marial marialVarSaneness = wiremanVar.f27463saneness.saneness(sanenessVar2);
                wiremanVar.f27462dern.execute(new Runnable() { // from class: haemocyte.dern
                    @Override // java.lang.Runnable
                    public final void run() {
                        beachfrontVar.attabal(marialVarSaneness);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    public void dern(final beachfront beachfrontVar) {
        this.f27464wireman.add(beachfrontVar);
        final Task<com.google.firebase.remoteconfig.internal.saneness> taskWireman = this.f27461attabal.wireman();
        taskWireman.addOnSuccessListener(this.f27462dern, new OnSuccessListener() { // from class: haemocyte.saneness
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                wireman.attabal(this.f27458attabal, taskWireman, beachfrontVar, (com.google.firebase.remoteconfig.internal.saneness) obj);
            }
        });
    }
}
