package sulfarsenide;

import androidx.p001lifecycle.gintrap;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: compiled from: InvalidationLiveDataContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<gintrap> f38260attabal = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final RoomDatabase f38261saneness;

    public saneness(RoomDatabase roomDatabase) {
        this.f38261saneness = roomDatabase;
    }
}
