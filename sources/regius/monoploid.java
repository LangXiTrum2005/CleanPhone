package regius;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public class monoploid {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f36214dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<awlwort.wireman> f36213attabal = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<awlwort.wireman> f36215saneness = new HashSet();

    public boolean attabal(awlwort.wireman wiremanVar) {
        boolean z = true;
        if (wiremanVar == null) {
            return true;
        }
        boolean zRemove = this.f36213attabal.remove(wiremanVar);
        if (!this.f36215saneness.remove(wiremanVar) && !zRemove) {
            z = false;
        }
        if (z) {
            wiremanVar.clear();
        }
        return z;
    }

    public void beachfront() {
        this.f36214dern = false;
        for (awlwort.wireman wiremanVar : com.bumptech.glide.util.formularize.apical(this.f36213attabal)) {
            if (!wiremanVar.competently() && !wiremanVar.isRunning()) {
                wiremanVar.impromptu();
            }
        }
        this.f36215saneness.clear();
    }

    public void competently(awlwort.wireman wiremanVar) {
        this.f36213attabal.add(wiremanVar);
        if (!this.f36214dern) {
            wiremanVar.impromptu();
            return;
        }
        wiremanVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f36215saneness.add(wiremanVar);
    }

    public void dern() {
        this.f36214dern = true;
        for (awlwort.wireman wiremanVar : com.bumptech.glide.util.formularize.apical(this.f36213attabal)) {
            if (wiremanVar.isRunning() || wiremanVar.competently()) {
                wiremanVar.clear();
                this.f36215saneness.add(wiremanVar);
            }
        }
    }

    public void marial() {
        for (awlwort.wireman wiremanVar : com.bumptech.glide.util.formularize.apical(this.f36213attabal)) {
            if (!wiremanVar.competently() && !wiremanVar.marial()) {
                wiremanVar.clear();
                if (this.f36214dern) {
                    this.f36215saneness.add(wiremanVar);
                } else {
                    wiremanVar.impromptu();
                }
            }
        }
    }

    public void saneness() {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36213attabal).iterator();
        while (it.hasNext()) {
            attabal((awlwort.wireman) it.next());
        }
        this.f36215saneness.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f36213attabal.size() + ", isPaused=" + this.f36214dern + "}";
    }

    public void wireman() {
        this.f36214dern = true;
        for (awlwort.wireman wiremanVar : com.bumptech.glide.util.formularize.apical(this.f36213attabal)) {
            if (wiremanVar.isRunning()) {
                wiremanVar.pause();
                this.f36215saneness.add(wiremanVar);
            }
        }
    }
}
