package kabul;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.apical;

/* JADX INFO: compiled from: NetworkStateTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends wireman<diakinesis.saneness> {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f29026cutely = apical.beachfront("NetworkStateTracker");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ConnectivityManager f29027competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public saneness f29028impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public attabal f29029taiyuan;

    /* JADX INFO: compiled from: NetworkStateTracker.java */
    public class attabal extends BroadcastReceiver {
        public attabal() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            apical.dern().attabal(marial.f29026cutely, "Network broadcast received", new Throwable[0]);
            marial marialVar = marial.this;
            marialVar.wireman(marialVar.competently());
        }
    }

    /* JADX INFO: compiled from: NetworkStateTracker.java */
    public class saneness extends ConnectivityManager.NetworkCallback {
        public saneness() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            apical.dern().attabal(marial.f29026cutely, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            marial marialVar = marial.this;
            marialVar.wireman(marialVar.competently());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            apical.dern().attabal(marial.f29026cutely, "Network connection lost", new Throwable[0]);
            marial marialVar = marial.this;
            marialVar.wireman(marialVar.competently());
        }
    }

    public marial(Context context, arugula.attabal attabalVar) {
        super(context, attabalVar);
        this.f29027competently = (ConnectivityManager) this.f29037saneness.getSystemService("connectivity");
        if (cutely()) {
            this.f29028impromptu = new saneness();
        } else {
            this.f29029taiyuan = new attabal();
        }
    }

    public static boolean cutely() {
        return true;
    }

    @Override // kabul.wireman
    public void beachfront() {
        if (!cutely()) {
            apical.dern().attabal(f29026cutely, "Unregistering broadcast receiver", new Throwable[0]);
            this.f29037saneness.unregisterReceiver(this.f29029taiyuan);
            return;
        }
        try {
            apical.dern().attabal(f29026cutely, "Unregistering network callback", new Throwable[0]);
            this.f29027competently.unregisterNetworkCallback(this.f29028impromptu);
        } catch (IllegalArgumentException | SecurityException e) {
            apical.dern().saneness(f29026cutely, "Received exception while unregistering network callback", e);
        }
    }

    public diakinesis.saneness competently() {
        NetworkInfo activeNetworkInfo = this.f29027competently.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zTaiyuan = taiyuan();
        boolean zAttabal = unconsolidated.attabal.attabal(this.f29027competently);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new diakinesis.saneness(z2, zTaiyuan, zAttabal, z);
    }

    @Override // kabul.wireman
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public diakinesis.saneness saneness() {
        return competently();
    }

    @Override // kabul.wireman
    public void marial() {
        if (!cutely()) {
            apical.dern().attabal(f29026cutely, "Registering broadcast receiver", new Throwable[0]);
            this.f29037saneness.registerReceiver(this.f29029taiyuan, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            apical.dern().attabal(f29026cutely, "Registering network callback", new Throwable[0]);
            this.f29027competently.registerDefaultNetworkCallback(this.f29028impromptu);
        } catch (IllegalArgumentException | SecurityException e) {
            apical.dern().saneness(f29026cutely, "Received exception while registering network callback", e);
        }
    }

    public boolean taiyuan() {
        try {
            NetworkCapabilities networkCapabilities = this.f29027competently.getNetworkCapabilities(this.f29027competently.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            apical.dern().saneness(f29026cutely, "Unable to validate active network", e);
            return false;
        }
    }
}
