package retrocession;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: compiled from: Uploader.java */
/* JADX INFO: loaded from: classes2.dex */
public class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f36411attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final cocoon.attabal f36412beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final bramley.attabal f36413competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.wireman f36414dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final bramley.attabal f36415impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Executor f36416marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final vaporizer.wireman f36417saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.dern f36418taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final adultoid f36419wireman;

    @Inject
    public kowloon(Context context, vaporizer.wireman wiremanVar, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar2, adultoid adultoidVar, Executor executor, cocoon.attabal attabalVar, bramley.attabal attabalVar2, bramley.attabal attabalVar3, com.google.android.datatransport.runtime.scheduling.persistence.dern dernVar) {
        this.f36411attabal = context;
        this.f36417saneness = wiremanVar;
        this.f36414dern = wiremanVar2;
        this.f36419wireman = adultoidVar;
        this.f36416marial = executor;
        this.f36412beachfront = attabalVar;
        this.f36413competently = attabalVar2;
        this.f36415impromptu = attabalVar3;
        this.f36418taiyuan = dernVar;
    }

    public static /* synthetic */ Object beachfront(kowloon kowloonVar, lehua.arytenoidectomy arytenoidectomyVar, int i) {
        kowloonVar.f36419wireman.attabal(arytenoidectomyVar, i + 1);
        return null;
    }

    public static /* synthetic */ Object competently(kowloon kowloonVar, lehua.arytenoidectomy arytenoidectomyVar, long j) {
        kowloonVar.f36414dern.graveside(arytenoidectomyVar, kowloonVar.f36413competently.attabal() + j);
        return null;
    }

    public static /* synthetic */ Object dern(kowloon kowloonVar) {
        kowloonVar.f36418taiyuan.attabal();
        return null;
    }

    public static /* synthetic */ Object impromptu(kowloon kowloonVar, Map map) {
        kowloonVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            kowloonVar.f36418taiyuan.marial(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ Object marial(kowloon kowloonVar, Iterable iterable) {
        kowloonVar.f36414dern.taiyuan(iterable);
        return null;
    }

    public static /* synthetic */ Object saneness(kowloon kowloonVar, Iterable iterable, lehua.arytenoidectomy arytenoidectomyVar, long j) {
        kowloonVar.f36414dern.hydrovane(iterable);
        kowloonVar.f36414dern.graveside(arytenoidectomyVar, kowloonVar.f36413competently.attabal() + j);
        return null;
    }

    public static /* synthetic */ void taiyuan(final kowloon kowloonVar, final lehua.arytenoidectomy arytenoidectomyVar, final int i, Runnable runnable) {
        kowloonVar.getClass();
        try {
            cocoon.attabal attabalVar = kowloonVar.f36412beachfront;
            final com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar = kowloonVar.f36414dern;
            Objects.requireNonNull(wiremanVar);
            attabalVar.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.beachfront
                @Override // cocoon.attabal.InterfaceC0142attabal
                public final Object execute() {
                    return Integer.valueOf(wiremanVar.competently());
                }
            });
            if (kowloonVar.apical()) {
                kowloonVar.formularize(arytenoidectomyVar, i);
            } else {
                kowloonVar.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.competently
                    @Override // cocoon.attabal.InterfaceC0142attabal
                    public final Object execute() {
                        return kowloon.beachfront(this.f36393attabal, arytenoidectomyVar, i);
                    }
                });
            }
        } catch (SynchronizationException unused) {
            kowloonVar.f36419wireman.attabal(arytenoidectomyVar, i + 1);
        } finally {
            runnable.run();
        }
    }

    public boolean apical() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f36411attabal.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public lehua.taiyuan cutely(vaporizer.apical apicalVar) {
        cocoon.attabal attabalVar = this.f36412beachfront;
        final com.google.android.datatransport.runtime.scheduling.persistence.dern dernVar = this.f36418taiyuan;
        Objects.requireNonNull(dernVar);
        return apicalVar.saneness(lehua.taiyuan.attabal().taiyuan(this.f36413competently.attabal()).kowloon(this.f36415impromptu.attabal()).triweekly("GDT_CLIENT_METRICS").impromptu(new lehua.impromptu(staphylococcal.dern.saneness("proto"), ((nucleosidase.attabal) attabalVar.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.marial
            @Override // cocoon.attabal.InterfaceC0142attabal
            public final Object execute() {
                return dernVar.dern();
            }
        })).beachfront())).wireman());
    }

    public BackendResponse formularize(final lehua.arytenoidectomy arytenoidectomyVar, int i) {
        BackendResponse backendResponseAttabal;
        vaporizer.apical apicalVar = this.f36417saneness.get(arytenoidectomyVar.saneness());
        BackendResponse backendResponseMarial = BackendResponse.marial(0L);
        final long j = 0;
        while (((Boolean) this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.impromptu
            @Override // cocoon.attabal.InterfaceC0142attabal
            public final Object execute() {
                return Boolean.valueOf(this.f36409attabal.f36414dern.wireman(arytenoidectomyVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.taiyuan
                @Override // cocoon.attabal.InterfaceC0142attabal
                public final Object execute() {
                    return this.f36430attabal.f36414dern.sealless(arytenoidectomyVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseMarial;
            }
            if (apicalVar == null) {
                unliveable.attabal.saneness("Uploader", "Unknown backend for %s, deleting event batch for it...", arytenoidectomyVar);
                backendResponseAttabal = BackendResponse.attabal();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.apical) it.next()).saneness());
                }
                if (arytenoidectomyVar.marial()) {
                    arrayList.add(cutely(apicalVar));
                }
                backendResponseAttabal = apicalVar.attabal(vaporizer.marial.attabal().saneness(arrayList).dern(arytenoidectomyVar.dern()).attabal());
            }
            backendResponseMarial = backendResponseAttabal;
            if (backendResponseMarial.dern() == BackendResponse.Status.TRANSIENT_ERROR) {
                final lehua.arytenoidectomy arytenoidectomyVar2 = arytenoidectomyVar;
                this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.cutely
                    @Override // cocoon.attabal.InterfaceC0142attabal
                    public final Object execute() {
                        return kowloon.saneness(this.f36396attabal, iterable, arytenoidectomyVar2, j);
                    }
                });
                this.f36419wireman.saneness(arytenoidectomyVar2, i + 1, true);
                return backendResponseMarial;
            }
            lehua.arytenoidectomy arytenoidectomyVar3 = arytenoidectomyVar;
            this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.apical
                @Override // cocoon.attabal.InterfaceC0142attabal
                public final Object execute() {
                    return kowloon.marial(this.f36381attabal, iterable);
                }
            });
            if (backendResponseMarial.dern() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, backendResponseMarial.saneness());
                if (arytenoidectomyVar3.marial()) {
                    this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.formularize
                        @Override // cocoon.attabal.InterfaceC0142attabal
                        public final Object execute() {
                            return kowloon.dern(this.f36402attabal);
                        }
                    });
                }
                j = jMax;
            } else if (backendResponseMarial.dern() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strTriweekly = ((com.google.android.datatransport.runtime.scheduling.persistence.apical) it2.next()).saneness().triweekly();
                    if (map.containsKey(strTriweekly)) {
                        map.put(strTriweekly, Integer.valueOf(((Integer) map.get(strTriweekly)).intValue() + 1));
                    } else {
                        map.put(strTriweekly, 1);
                    }
                }
                this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.impassible
                    @Override // cocoon.attabal.InterfaceC0142attabal
                    public final Object execute() {
                        return kowloon.impromptu(this.f36407attabal, map);
                    }
                });
            }
            arytenoidectomyVar = arytenoidectomyVar3;
        }
        final lehua.arytenoidectomy arytenoidectomyVar4 = arytenoidectomyVar;
        this.f36412beachfront.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.triweekly
            @Override // cocoon.attabal.InterfaceC0142attabal
            public final Object execute() {
                return kowloon.competently(this.f36432attabal, arytenoidectomyVar4, j);
            }
        });
        return backendResponseMarial;
    }

    public void impassible(final lehua.arytenoidectomy arytenoidectomyVar, final int i, final Runnable runnable) {
        this.f36416marial.execute(new Runnable() { // from class: retrocession.wireman
            @Override // java.lang.Runnable
            public final void run() {
                kowloon.taiyuan(this.f36436kowloon, arytenoidectomyVar, i, runnable);
            }
        });
    }
}
