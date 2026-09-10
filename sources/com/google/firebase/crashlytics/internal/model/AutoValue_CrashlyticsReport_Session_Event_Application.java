package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20612c;
    public final Boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails f20613e;
    public final List f;
    public final int g;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution f20614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f20615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f20616c;
        public Boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.ProcessDetails f20617e;
        public List f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f20618h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application a() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.f20618h == 1 && (execution = this.f20614a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(execution, this.f20615b, this.f20616c, this.d, this.f20617e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20614a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f20618h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder b(List list) {
            this.f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder c(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder d(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f20617e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder e(List list) {
            this.f20615b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder f(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.f20614a = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder g(List list) {
            this.f20616c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder h(int i2) {
            this.g = i2;
            this.f20618h = (byte) (this.f20618h | 1);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i2) {
        this.f20610a = execution;
        this.f20611b = list;
        this.f20612c = list2;
        this.d = bool;
        this.f20613e = processDetails;
        this.f = list3;
        this.g = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final Boolean c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails d() {
        return this.f20613e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List e() {
        return this.f20611b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.f20610a.equals(application.f())) {
            return false;
        }
        List list = this.f20611b;
        if (list == null) {
            if (application.e() != null) {
                return false;
            }
        } else if (!list.equals(application.e())) {
            return false;
        }
        List list2 = this.f20612c;
        if (list2 == null) {
            if (application.g() != null) {
                return false;
            }
        } else if (!list2.equals(application.g())) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (application.c() != null) {
                return false;
            }
        } else if (!bool.equals(application.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f20613e;
        if (processDetails == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!processDetails.equals(application.d())) {
            return false;
        }
        List list3 = this.f;
        if (list3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!list3.equals(application.b())) {
            return false;
        }
        return this.g == application.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Execution f() {
        return this.f20610a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List g() {
        return this.f20612c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f20610a.hashCode() ^ 1000003) * 1000003;
        List list = this.f20611b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f20612c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f20613e;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Builder i() {
        Builder builder = new Builder();
        builder.f20614a = this.f20610a;
        builder.f20615b = this.f20611b;
        builder.f20616c = this.f20612c;
        builder.d = this.d;
        builder.f20617e = this.f20613e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f20618h = (byte) 1;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f20610a);
        sb.append(", customAttributes=");
        sb.append(this.f20611b);
        sb.append(", internalKeys=");
        sb.append(this.f20612c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f20613e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return android.support.v4.media.a.i(this.g, "}", sb);
    }
}
