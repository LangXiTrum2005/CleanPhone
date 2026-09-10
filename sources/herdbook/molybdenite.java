package herdbook;

import java.util.Locale;

/* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class molybdenite {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final polloi f27690beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final polloi f27691dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final polloi f27692marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final polloi f27694wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final polloi f27689attabal = new marial(null, false);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final polloi f27693saneness = new marial(null, true);

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class attabal implements dern {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f27695saneness = new attabal(true);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f27696attabal;

        public attabal(boolean z) {
            this.f27696attabal = z;
        }

        @Override // herdbook.molybdenite.dern
        public int attabal(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iAttabal = molybdenite.attabal(Character.getDirectionality(charSequence.charAt(i)));
                if (iAttabal != 0) {
                    if (iAttabal != 1) {
                        continue;
                    } else if (!this.f27696attabal) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.f27696attabal) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f27696attabal ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class beachfront extends wireman {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final beachfront f27697saneness = new beachfront();

        public beachfront() {
            super(null);
        }

        @Override // herdbook.molybdenite.wireman
        public boolean attabal() {
            return graveside.attabal(Locale.getDefault()) == 1;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public interface dern {
        int attabal(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class marial extends wireman {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f27698saneness;

        public marial(dern dernVar, boolean z) {
            super(dernVar);
            this.f27698saneness = z;
        }

        @Override // herdbook.molybdenite.wireman
        public boolean attabal() {
            return this.f27698saneness;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f27699attabal = new saneness();

        @Override // herdbook.molybdenite.dern
        public int attabal(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iSaneness = 2;
            while (i < i3 && iSaneness == 2) {
                iSaneness = molybdenite.saneness(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iSaneness;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class wireman implements polloi {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final dern f27700attabal;

        public wireman(dern dernVar) {
            this.f27700attabal = dernVar;
        }

        public abstract boolean attabal();

        @Override // herdbook.polloi
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f27700attabal == null ? attabal() : saneness(charSequence, i, i2);
        }

        public final boolean saneness(CharSequence charSequence, int i, int i2) {
            int iAttabal = this.f27700attabal.attabal(charSequence, i, i2);
            if (iAttabal == 0) {
                return true;
            }
            if (iAttabal != 1) {
                return attabal();
            }
            return false;
        }
    }

    static {
        saneness sanenessVar = saneness.f27699attabal;
        f27691dern = new marial(sanenessVar, false);
        f27694wireman = new marial(sanenessVar, true);
        f27692marial = new marial(attabal.f27695saneness, false);
        f27690beachfront = beachfront.f27697saneness;
    }

    public static int attabal(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int saneness(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
