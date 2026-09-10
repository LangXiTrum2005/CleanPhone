package regius;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class polloi {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static volatile polloi f36216wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f36217attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f36218dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<regius.saneness.attabal> f36219saneness = new HashSet();

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public class attabal implements com.bumptech.glide.util.beachfront.saneness<ConnectivityManager> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f36220attabal;

        public attabal(Context context) {
            this.f36220attabal = context;
        }

        @Override // com.bumptech.glide.util.beachfront.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f36220attabal.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public interface dern {
        boolean attabal();

        void saneness();
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public class saneness implements regius.saneness.attabal {
        public saneness() {
        }

        @Override // regius.saneness.attabal
        public void attabal(boolean z) {
            ArrayList arrayList;
            com.bumptech.glide.util.formularize.saneness();
            synchronized (polloi.this) {
                arrayList = new ArrayList(polloi.this.f36219saneness);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((regius.saneness.attabal) it.next()).attabal(z);
            }
        }
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public static final class wireman implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f36223attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final com.bumptech.glide.util.beachfront.saneness<ConnectivityManager> f36224dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final regius.saneness.attabal f36225saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f36226wireman = new attabal();

        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        public class attabal extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: regius.polloi$wireman$attabal$attabal, reason: collision with other inner class name */
            /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
            public class RunnableC0783attabal implements Runnable {

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ boolean f36229kowloon;

                public RunnableC0783attabal(boolean z) {
                    this.f36229kowloon = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    attabal.this.attabal(this.f36229kowloon);
                }
            }

            public attabal() {
            }

            public void attabal(boolean z) {
                com.bumptech.glide.util.formularize.saneness();
                wireman wiremanVar = wireman.this;
                boolean z2 = wiremanVar.f36223attabal;
                wiremanVar.f36223attabal = z;
                if (z2 != z) {
                    wiremanVar.f36225saneness.attabal(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                saneness(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                saneness(false);
            }

            public final void saneness(boolean z) {
                com.bumptech.glide.util.formularize.gintrap(new RunnableC0783attabal(z));
            }
        }

        public wireman(com.bumptech.glide.util.beachfront.saneness<ConnectivityManager> sanenessVar, regius.saneness.attabal attabalVar) {
            this.f36224dern = sanenessVar;
            this.f36225saneness = attabalVar;
        }

        @Override // regius.polloi.dern
        public boolean attabal() {
            this.f36223attabal = this.f36224dern.get().getActiveNetwork() != null;
            try {
                this.f36224dern.get().registerDefaultNetworkCallback(this.f36226wireman);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return false;
            }
        }

        @Override // regius.polloi.dern
        public void saneness() {
            this.f36224dern.get().unregisterNetworkCallback(this.f36226wireman);
        }
    }

    public polloi(Context context) {
        this.f36217attabal = new wireman(com.bumptech.glide.util.beachfront.attabal(new attabal(context)), new saneness());
    }

    public static polloi attabal(Context context) {
        if (f36216wireman == null) {
            synchronized (polloi.class) {
                try {
                    if (f36216wireman == null) {
                        f36216wireman = new polloi(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36216wireman;
    }

    public final void dern() {
        if (this.f36218dern && this.f36219saneness.isEmpty()) {
            this.f36217attabal.saneness();
            this.f36218dern = false;
        }
    }

    public synchronized void marial(regius.saneness.attabal attabalVar) {
        this.f36219saneness.remove(attabalVar);
        dern();
    }

    public final void saneness() {
        if (this.f36218dern || this.f36219saneness.isEmpty()) {
            return;
        }
        this.f36218dern = this.f36217attabal.attabal();
    }

    public synchronized void wireman(regius.saneness.attabal attabalVar) {
        this.f36219saneness.add(attabalVar);
        saneness();
    }
}
