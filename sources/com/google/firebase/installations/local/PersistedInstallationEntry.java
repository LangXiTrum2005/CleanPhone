package com.google.firebase.installations.local;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PersistedInstallationEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20873a = 0;

    public static abstract class Builder {
        public abstract PersistedInstallationEntry a();

        public abstract Builder b(String str);

        public abstract Builder c(long j);

        public abstract Builder d(String str);

        public abstract Builder e(String str);

        public abstract Builder f(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract Builder g(long j);
    }

    static {
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.g(0L);
        builder.f20863b = PersistedInstallation.RegistrationStatus.X;
        builder.c(0L);
        builder.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();

    public abstract Builder h();

    public final PersistedInstallationEntry i() {
        AutoValue_PersistedInstallationEntry.Builder builder = (AutoValue_PersistedInstallationEntry.Builder) h();
        builder.g = "BAD CONFIG";
        builder.f20863b = PersistedInstallation.RegistrationStatus.f0;
        return builder.a();
    }
}
