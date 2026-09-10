package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class adultoid implements graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f33992attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<molybdenite> f33993saneness;

    /* JADX INFO: compiled from: WorkTagDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<molybdenite> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, molybdenite molybdeniteVar) {
            String str = molybdeniteVar.f34050attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            String str2 = molybdeniteVar.f34051saneness;
            if (str2 == null) {
                beachfrontVar.lotta(2);
            } else {
                beachfrontVar.peridotite(2, str2);
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public adultoid(RoomDatabase roomDatabase) {
        this.f33992attabal = roomDatabase;
        this.f33993saneness = new attabal(roomDatabase);
    }

    @Override // ocellation.graveside
    public void attabal(molybdenite molybdeniteVar) {
        this.f33992attabal.saneness();
        this.f33992attabal.dern();
        try {
            this.f33993saneness.impromptu(molybdeniteVar);
            this.f33992attabal.polloi();
        } finally {
            this.f33992attabal.competently();
        }
    }

    @Override // ocellation.graveside
    public List<String> saneness(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f33992attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f33992attabal, wiremanVarDern, false, null);
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
}
