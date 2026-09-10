package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* JADX INFO: compiled from: PreferenceDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34025attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<wireman> f34026saneness;

    /* JADX INFO: compiled from: PreferenceDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<wireman> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, wireman wiremanVar) {
            String str = wiremanVar.f34076attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            Long l = wiremanVar.f34077saneness;
            if (l == null) {
                beachfrontVar.lotta(2);
            } else {
                beachfrontVar.permissivist(2, l.longValue());
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public beachfront(RoomDatabase roomDatabase) {
        this.f34025attabal = roomDatabase;
        this.f34026saneness = new attabal(roomDatabase);
    }

    @Override // ocellation.marial
    public void attabal(wireman wiremanVar) {
        this.f34025attabal.saneness();
        this.f34025attabal.dern();
        try {
            this.f34026saneness.impromptu(wiremanVar);
            this.f34025attabal.polloi();
        } finally {
            this.f34025attabal.competently();
        }
    }

    @Override // ocellation.marial
    public Long saneness(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34025attabal.saneness();
        Long lValueOf = null;
        Cursor cursorSaneness = dispope.dern.saneness(this.f34025attabal, wiremanVarDern, false, null);
        try {
            if (cursorSaneness.moveToFirst() && !cursorSaneness.isNull(0)) {
                lValueOf = Long.valueOf(cursorSaneness.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }
}
