package snarler;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: ConfigRealtimeHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<neuropteran.dern> f37661attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final marial f37662beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Context f37663competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final ScheduledExecutorService f37664cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConfigFetchHandler f37665dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f37666impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ingathering.competently f37667marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.dern f37668saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.wireman f37669taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final iiion.beachfront f37670wireman;

    public formularize(iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, ConfigFetchHandler configFetchHandler, marial marialVar, Context context, String str, com.google.firebase.remoteconfig.internal.wireman wiremanVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f37661attabal = linkedHashSet;
        this.f37668saneness = new com.google.firebase.remoteconfig.internal.dern(beachfrontVar, competentlyVar, configFetchHandler, marialVar, context, str, linkedHashSet, wiremanVar, scheduledExecutorService);
        this.f37670wireman = beachfrontVar;
        this.f37665dern = configFetchHandler;
        this.f37667marial = competentlyVar;
        this.f37662beachfront = marialVar;
        this.f37663competently = context;
        this.f37666impromptu = str;
        this.f37669taiyuan = wiremanVar;
        this.f37664cutely = scheduledExecutorService;
    }

    public final synchronized void attabal() {
        if (!this.f37661attabal.isEmpty()) {
            this.f37668saneness.cuirassed();
        }
    }

    public synchronized void saneness(boolean z) {
        this.f37668saneness.rotuma(z);
        if (!z) {
            attabal();
        }
    }
}
