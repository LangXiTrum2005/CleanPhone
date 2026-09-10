package com.google.firebase.installations.local;

/* JADX INFO: compiled from: PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static saneness f22507attabal = attabal().attabal();

    /* JADX INFO: compiled from: PersistedInstallationEntry.java */
    public static abstract class attabal {
        public abstract saneness attabal();

        public abstract attabal beachfront(String str);

        public abstract attabal competently(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract attabal dern(long j);

        public abstract attabal impromptu(long j);

        public abstract attabal marial(String str);

        public abstract attabal saneness(String str);

        public abstract attabal wireman(String str);
    }

    public static attabal attabal() {
        return new com.google.firebase.installations.local.attabal.saneness().impromptu(0L).competently(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).dern(0L);
    }

    public boolean apical() {
        return competently() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public saneness arytenoidectomy() {
        return triweekly().saneness(null).attabal();
    }

    public abstract String beachfront();

    public abstract PersistedInstallation.RegistrationStatus competently();

    public boolean cutely() {
        return competently() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || competently() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public abstract long dern();

    public boolean formularize() {
        return competently() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public saneness graveside(String str) {
        return triweekly().wireman(str).competently(PersistedInstallation.RegistrationStatus.UNREGISTERED).attabal();
    }

    public boolean impassible() {
        return competently() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public abstract long impromptu();

    public saneness kowloon(String str, long j, long j2) {
        return triweekly().saneness(str).dern(j).impromptu(j2).attabal();
    }

    public abstract String marial();

    public saneness molybdenite(String str, String str2, long j, String str3, long j2) {
        return triweekly().wireman(str).competently(PersistedInstallation.RegistrationStatus.REGISTERED).saneness(str3).beachfront(str2).dern(j2).impromptu(j).attabal();
    }

    public saneness monoploid(String str) {
        return triweekly().marial(str).competently(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).attabal();
    }

    public saneness polloi() {
        return triweekly().competently(PersistedInstallation.RegistrationStatus.NOT_GENERATED).attabal();
    }

    public abstract String saneness();

    public boolean taiyuan() {
        return competently() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public abstract attabal triweekly();

    public abstract String wireman();
}
