package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34071attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sulfarsenide.competently f34072dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<competently> f34073saneness;

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<competently> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, competently competentlyVar) {
            String str = competentlyVar.f34028attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            beachfrontVar.permissivist(2, competentlyVar.f34029saneness);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class saneness extends sulfarsenide.competently {
        public saneness(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public taiyuan(RoomDatabase roomDatabase) {
        this.f34071attabal = roomDatabase;
        this.f34073saneness = new attabal(roomDatabase);
        this.f34072dern = new saneness(roomDatabase);
    }

    @Override // ocellation.impromptu
    public void attabal(competently competentlyVar) {
        this.f34071attabal.saneness();
        this.f34071attabal.dern();
        try {
            this.f34073saneness.impromptu(competentlyVar);
            this.f34071attabal.polloi();
        } finally {
            this.f34071attabal.competently();
        }
    }

    @Override // ocellation.impromptu
    public List<String> dern() {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f34071attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34071attabal, wiremanVarDern, false, null);
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

    @Override // ocellation.impromptu
    public competently saneness(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34071attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34071attabal, wiremanVarDern, false, null);
        try {
            return cursorSaneness.moveToFirst() ? new competently(cursorSaneness.getString(dispope.saneness.saneness(cursorSaneness, "work_spec_id")), cursorSaneness.getInt(dispope.saneness.saneness(cursorSaneness, "system_id"))) : null;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }

    @Override // ocellation.impromptu
    public void wireman(String str) {
        this.f34071attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34072dern.attabal();
        if (str == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.peridotite(1, str);
        }
        this.f34071attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34071attabal.polloi();
        } finally {
            this.f34071attabal.competently();
            this.f34072dern.beachfront(beachfrontVarAttabal);
        }
    }
}
