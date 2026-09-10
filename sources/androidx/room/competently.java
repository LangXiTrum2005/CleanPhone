package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: RoomOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends iconoclasm.dern.attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f13572dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f13573marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public androidx.room.attabal f13574saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f13575wireman;

    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static abstract class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f13576attabal;

        public attabal(int i) {
            this.f13576attabal = i;
        }

        public abstract void attabal(iconoclasm.saneness sanenessVar);

        public abstract void beachfront(iconoclasm.saneness sanenessVar);

        public abstract saneness competently(iconoclasm.saneness sanenessVar);

        public abstract void dern(iconoclasm.saneness sanenessVar);

        public abstract void marial(iconoclasm.saneness sanenessVar);

        public abstract void saneness(iconoclasm.saneness sanenessVar);

        public abstract void wireman(iconoclasm.saneness sanenessVar);
    }

    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f13577attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f13578saneness;

        public saneness(boolean z, String str) {
            this.f13577attabal = z;
            this.f13578saneness = str;
        }
    }

    public competently(androidx.room.attabal attabalVar, attabal attabalVar2, String str, String str2) {
        super(attabalVar2.f13576attabal);
        this.f13574saneness = attabalVar;
        this.f13572dern = attabalVar2;
        this.f13575wireman = str;
        this.f13573marial = str2;
    }

    public static boolean apical(iconoclasm.saneness sanenessVar) {
        Cursor cursorCoffeecake = sanenessVar.coffeecake("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (cursorCoffeecake.moveToFirst() && cursorCoffeecake.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            cursorCoffeecake.close();
        }
    }

    public static boolean cutely(iconoclasm.saneness sanenessVar) {
        Cursor cursorCoffeecake = sanenessVar.coffeecake("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorCoffeecake.moveToFirst() && cursorCoffeecake.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            cursorCoffeecake.close();
        }
    }

    @Override // iconoclasm.dern.attabal
    public void beachfront(iconoclasm.saneness sanenessVar) {
        super.beachfront(sanenessVar);
        impromptu(sanenessVar);
        this.f13572dern.wireman(sanenessVar);
        this.f13574saneness = null;
    }

    @Override // iconoclasm.dern.attabal
    public void competently(iconoclasm.saneness sanenessVar, int i, int i2) {
        List<aristocrat.attabal> listDern;
        androidx.room.attabal attabalVar = this.f13574saneness;
        if (attabalVar == null || (listDern = attabalVar.f13563dern.dern(i, i2)) == null) {
            androidx.room.attabal attabalVar2 = this.f13574saneness;
            if (attabalVar2 != null && !attabalVar2.attabal(i, i2)) {
                this.f13572dern.saneness(sanenessVar);
                this.f13572dern.attabal(sanenessVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f13572dern.beachfront(sanenessVar);
        Iterator<aristocrat.attabal> it = listDern.iterator();
        while (it.hasNext()) {
            it.next().attabal(sanenessVar);
        }
        saneness sanenessVarCompetently = this.f13572dern.competently(sanenessVar);
        if (sanenessVarCompetently.f13577attabal) {
            this.f13572dern.marial(sanenessVar);
            formularize(sanenessVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + sanenessVarCompetently.f13578saneness);
        }
    }

    public final void formularize(iconoclasm.saneness sanenessVar) {
        taiyuan(sanenessVar);
        sanenessVar.impassible(sulfarsenide.dern.attabal(this.f13575wireman));
    }

    public final void impromptu(iconoclasm.saneness sanenessVar) {
        if (!apical(sanenessVar)) {
            saneness sanenessVarCompetently = this.f13572dern.competently(sanenessVar);
            if (sanenessVarCompetently.f13577attabal) {
                this.f13572dern.marial(sanenessVar);
                formularize(sanenessVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + sanenessVarCompetently.f13578saneness);
            }
        }
        Cursor cursorOverspeculate = sanenessVar.overspeculate(new iconoclasm.attabal("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorOverspeculate.moveToFirst() ? cursorOverspeculate.getString(0) : null;
            cursorOverspeculate.close();
            if (!this.f13575wireman.equals(string) && !this.f13573marial.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorOverspeculate.close();
            throw th;
        }
    }

    @Override // iconoclasm.dern.attabal
    public void marial(iconoclasm.saneness sanenessVar, int i, int i2) {
        competently(sanenessVar, i, i2);
    }

    @Override // iconoclasm.dern.attabal
    public void saneness(iconoclasm.saneness sanenessVar) {
        super.saneness(sanenessVar);
    }

    public final void taiyuan(iconoclasm.saneness sanenessVar) {
        sanenessVar.impassible("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    @Override // iconoclasm.dern.attabal
    public void wireman(iconoclasm.saneness sanenessVar) {
        boolean zCutely = cutely(sanenessVar);
        this.f13572dern.attabal(sanenessVar);
        if (!zCutely) {
            saneness sanenessVarCompetently = this.f13572dern.competently(sanenessVar);
            if (!sanenessVarCompetently.f13577attabal) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + sanenessVarCompetently.f13578saneness);
            }
        }
        formularize(sanenessVar);
        this.f13572dern.dern(sanenessVar);
    }
}
