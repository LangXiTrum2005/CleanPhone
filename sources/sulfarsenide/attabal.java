package sulfarsenide;

import androidx.room.RoomDatabase;

/* JADX INFO: compiled from: EntityInsertionAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal<T> extends competently {
    public attabal(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public abstract void competently(iconoclasm.beachfront beachfrontVar, T t);

    public final void impromptu(T t) {
        iconoclasm.beachfront beachfrontVarAttabal = attabal();
        try {
            competently(beachfrontVarAttabal, t);
            beachfrontVarAttabal.walach();
        } finally {
            beachfront(beachfrontVarAttabal);
        }
    }
}
