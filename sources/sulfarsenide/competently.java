package sulfarsenide;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SharedSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicBoolean f38245attabal = new AtomicBoolean(false);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile iconoclasm.beachfront f38246dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final RoomDatabase f38247saneness;

    public competently(RoomDatabase roomDatabase) {
        this.f38247saneness = roomDatabase;
    }

    public iconoclasm.beachfront attabal() {
        saneness();
        return marial(this.f38245attabal.compareAndSet(false, true));
    }

    public void beachfront(iconoclasm.beachfront beachfrontVar) {
        if (beachfrontVar == this.f38246dern) {
            this.f38245attabal.set(false);
        }
    }

    public final iconoclasm.beachfront dern() {
        return this.f38247saneness.wireman(wireman());
    }

    public final iconoclasm.beachfront marial(boolean z) {
        if (!z) {
            return dern();
        }
        if (this.f38246dern == null) {
            this.f38246dern = dern();
        }
        return this.f38246dern;
    }

    public void saneness() {
        this.f38247saneness.attabal();
    }

    public abstract String wireman();
}
