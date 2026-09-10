package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import cd.c;
import cd.d;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.ironsource.ph;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import jd.a;
import jd.b;
import nd.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends d {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final c appStateMonitor;
    private final Set<WeakReference<b>> clients;
    private final GaugeManager gaugeManager;
    private a perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, a aVar, c cVar) {
        super(c.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = cVar;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f43818c) {
            this.gaugeManager.logGaugeMetadata(aVar.f43816a, l.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(l lVar) {
        a aVar = this.perfSession;
        if (aVar.f43818c) {
            this.gaugeManager.logGaugeMetadata(aVar.f43816a, lVar);
        }
    }

    private void startOrStopCollectingGauges(l lVar) {
        a aVar = this.perfSession;
        if (aVar.f43818c) {
            this.gaugeManager.startCollectingGauges(aVar, lVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        l lVar = l.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(lVar);
        startOrStopCollectingGauges(lVar);
    }

    @Override // cd.d, cd.b
    public void onUpdateAppState(l lVar) {
        super.onUpdateAppState(lVar);
        if (this.appStateMonitor.f6365q) {
            return;
        }
        if (lVar == l.FOREGROUND) {
            updatePerfSession(a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(lVar);
        }
    }

    public final a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new ph(this, context, this.perfSession, 29));
    }

    public void setPerfSession(a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(a aVar) {
        if (aVar.f43816a == this.perfSession.f43816a) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(aVar);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f6363o);
        startOrStopCollectingGauges(this.appStateMonitor.f6363o);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), a.c(UUID.randomUUID().toString()), c.a());
    }
}
