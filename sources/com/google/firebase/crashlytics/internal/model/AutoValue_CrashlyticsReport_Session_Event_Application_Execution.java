package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f20620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f20621c;
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f20622e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f20623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f20624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f20625c;
        public CrashlyticsReport.Session.Event.Application.Execution.Signal d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f20626e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution a() {
            List list;
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = this.d;
            if (signal != null && (list = this.f20626e) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f20623a, this.f20624b, this.f20625c, signal, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" signal");
            }
            if (this.f20626e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f20625c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f20626e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder d(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f20624b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder e(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = signal;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder f(List list) {
            this.f20623a = list;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f20619a = list;
        this.f20620b = exception;
        this.f20621c = applicationExitInfo;
        this.d = signal;
        this.f20622e = list2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.ApplicationExitInfo b() {
        return this.f20621c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final List c() {
        return this.f20622e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception d() {
        return this.f20620b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List list = this.f20619a;
        if (list == null) {
            if (execution.f() != null) {
                return false;
            }
        } else if (!list.equals(execution.f())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f20620b;
        if (exception == null) {
            if (execution.d() != null) {
                return false;
            }
        } else if (!exception.equals(execution.d())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f20621c;
        if (applicationExitInfo == null) {
            if (execution.b() != null) {
                return false;
            }
        } else if (!applicationExitInfo.equals(execution.b())) {
            return false;
        }
        return this.d.equals(execution.e()) && this.f20622e.equals(execution.c());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final List f() {
        return this.f20619a;
    }

    public final int hashCode() {
        List list = this.f20619a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f20620b;
        int iHashCode2 = (iHashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f20621c;
        return (((((applicationExitInfo != null ? applicationExitInfo.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f20622e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f20619a + ", exception=" + this.f20620b + ", appExitInfo=" + this.f20621c + ", signal=" + this.d + ", binaries=" + this.f20622e + "}";
    }
}
