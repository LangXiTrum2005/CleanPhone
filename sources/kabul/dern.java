package kabul;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.apical;

/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern<T> extends wireman<T> {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f29023impromptu = apical.beachfront("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final BroadcastReceiver f29024competently;

    /* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
    public class attabal extends BroadcastReceiver {
        public attabal() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                dern.this.impromptu(context, intent);
            }
        }
    }

    public dern(Context context, arugula.attabal attabalVar) {
        super(context, attabalVar);
        this.f29024competently = new attabal();
    }

    @Override // kabul.wireman
    public void beachfront() {
        apical.dern().attabal(f29023impromptu, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f29037saneness.unregisterReceiver(this.f29024competently);
    }

    public abstract IntentFilter competently();

    public abstract void impromptu(Context context, Intent intent);

    @Override // kabul.wireman
    public void marial() {
        apical.dern().attabal(f29023impromptu, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f29037saneness.registerReceiver(this.f29024competently, competently());
    }
}
