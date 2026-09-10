package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize implements apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34038attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<cutely> f34039saneness;

    /* JADX INFO: compiled from: WorkNameDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<cutely> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, cutely cutelyVar) {
            String str = cutelyVar.name;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            String str2 = cutelyVar.f34030attabal;
            if (str2 == null) {
                beachfrontVar.lotta(2);
            } else {
                beachfrontVar.peridotite(2, str2);
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public formularize(RoomDatabase roomDatabase) {
        this.f34038attabal = roomDatabase;
        this.f34039saneness = new attabal(roomDatabase);
    }

    @Override // ocellation.apical
    public List<String> attabal(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34038attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34038attabal, wiremanVarDern, false, null);
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

    @Override // ocellation.apical
    public void saneness(cutely cutelyVar) {
        this.f34038attabal.saneness();
        this.f34038attabal.dern();
        try {
            this.f34039saneness.impromptu(cutelyVar);
            this.f34038attabal.polloi();
        } finally {
            this.f34038attabal.competently();
        }
    }
}
