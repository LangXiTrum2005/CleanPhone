package neuropteran;

import android.content.Context;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.concurrent.Executor;
import snarler.apical;
import snarler.formularize;

/* JADX INFO: compiled from: FirebaseRemoteConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final byte[] f33886triweekly = new byte[0];

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final ingathering.competently f33887apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f33888attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final snarler.marial f33889beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final snarler.marial f33890competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.wireman f33891cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dynein.attabal f33892dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final formularize f33893formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final haemocyte.wireman f33894impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ConfigFetchHandler f33895impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final snarler.marial f33896marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final iiion.beachfront f33897saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final apical f33898taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Executor f33899wireman;

    public marial(Context context, iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, dynein.attabal attabalVar, Executor executor, snarler.marial marialVar, snarler.marial marialVar2, snarler.marial marialVar3, ConfigFetchHandler configFetchHandler, apical apicalVar, com.google.firebase.remoteconfig.internal.wireman wiremanVar, formularize formularizeVar, haemocyte.wireman wiremanVar2) {
        this.f33888attabal = context;
        this.f33897saneness = beachfrontVar;
        this.f33887apical = competentlyVar;
        this.f33892dern = attabalVar;
        this.f33899wireman = executor;
        this.f33896marial = marialVar;
        this.f33889beachfront = marialVar2;
        this.f33890competently = marialVar3;
        this.f33895impromptu = configFetchHandler;
        this.f33898taiyuan = apicalVar;
        this.f33891cutely = wiremanVar;
        this.f33893formularize = formularizeVar;
        this.f33894impassible = wiremanVar2;
    }

    public void dern(boolean z) {
        this.f33893formularize.saneness(z);
    }

    public Task<Void> fetch() {
        return this.f33895impromptu.fetch().onSuccessTask(FirebaseExecutors.attabal(), new SuccessContinuation() { // from class: neuropteran.wireman
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    public haemocyte.wireman saneness() {
        return this.f33894impassible;
    }

    public void wireman() {
        this.f33889beachfront.wireman();
        this.f33890competently.wireman();
        this.f33896marial.wireman();
    }
}
