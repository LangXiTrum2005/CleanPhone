package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34031attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<ocellation.attabal> f34032saneness;

    /* JADX INFO: compiled from: DependencyDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<ocellation.attabal> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, ocellation.attabal attabalVar) {
            String str = attabalVar.f34023attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            String str2 = attabalVar.f34024saneness;
            if (str2 == null) {
                beachfrontVar.lotta(2);
            } else {
                beachfrontVar.peridotite(2, str2);
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public dern(RoomDatabase roomDatabase) {
        this.f34031attabal = roomDatabase;
        this.f34032saneness = new attabal(roomDatabase);
    }

    @Override // ocellation.saneness
    public List<String> attabal(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34031attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34031attabal, wiremanVarDern, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
            while (cursorSaneness.moveToNext()) {
                arrayList.add(cursorSaneness.getString(0));
            }
            cursorSaneness.close();
            wiremanVarDern.release();
            return arrayList;
        } catch (Throwable th) {
            cursorSaneness.close();
            wiremanVarDern.release();
            throw th;
        }
    }

    @Override // ocellation.saneness
    public void dern(ocellation.attabal attabalVar) {
        this.f34031attabal.saneness();
        this.f34031attabal.dern();
        try {
            this.f34032saneness.impromptu(attabalVar);
            this.f34031attabal.polloi();
        } finally {
            this.f34031attabal.competently();
        }
    }

    @Override // ocellation.saneness
    public boolean saneness(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34031attabal.saneness();
        boolean z = false;
        Cursor cursorSaneness = dispope.dern.saneness(this.f34031attabal, wiremanVarDern, false, null);
        try {
            if (cursorSaneness.moveToFirst()) {
                z = cursorSaneness.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }

    @Override // ocellation.saneness
    public boolean wireman(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34031attabal.saneness();
        boolean z = false;
        Cursor cursorSaneness = dispope.dern.saneness(this.f34031attabal, wiremanVarDern, false, null);
        try {
            if (cursorSaneness.moveToFirst()) {
                z = cursorSaneness.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }
}
