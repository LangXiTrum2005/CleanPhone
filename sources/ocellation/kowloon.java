package ocellation;

import androidx.room.RoomDatabase;

/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon implements triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34043attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sulfarsenide.competently f34044dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<impassible> f34045saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sulfarsenide.competently f34046wireman;

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<impassible> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, impassible impassibleVar) throws Throwable {
            String str = impassibleVar.f34041attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            byte[] bArrImpassible = androidx.work.wireman.impassible(impassibleVar.f34042saneness);
            if (bArrImpassible == null) {
                beachfrontVar.lotta(2);
            } else {
                beachfrontVar.premeiotic(2, bArrImpassible);
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class dern extends sulfarsenide.competently {
        public dern(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "DELETE FROM WorkProgress";
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class saneness extends sulfarsenide.competently {
        public saneness(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public kowloon(RoomDatabase roomDatabase) {
        this.f34043attabal = roomDatabase;
        this.f34045saneness = new attabal(roomDatabase);
        this.f34044dern = new saneness(roomDatabase);
        this.f34046wireman = new dern(roomDatabase);
    }

    @Override // ocellation.triweekly
    public void attabal(String str) {
        this.f34043attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34044dern.attabal();
        if (str == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.peridotite(1, str);
        }
        this.f34043attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34043attabal.polloi();
        } finally {
            this.f34043attabal.competently();
            this.f34044dern.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.triweekly
    public void dern() {
        this.f34043attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34046wireman.attabal();
        this.f34043attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34043attabal.polloi();
        } finally {
            this.f34043attabal.competently();
            this.f34046wireman.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.triweekly
    public void saneness(impassible impassibleVar) {
        this.f34043attabal.saneness();
        this.f34043attabal.dern();
        try {
            this.f34045saneness.impromptu(impassibleVar);
            this.f34043attabal.polloi();
        } finally {
            this.f34043attabal.competently();
        }
    }
}
