package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20650c;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f20653c;
        public byte d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread a() {
            String str;
            List list;
            if (this.d == 1 && (str = this.f20651a) != null && (list = this.f20653c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(str, this.f20652b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20651a == null) {
                sb.append(" name");
            }
            if ((1 & this.d) == 0) {
                sb.append(" importance");
            }
            if (this.f20653c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f20653c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder c(int i2) {
            this.f20652b = i2;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20651a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i2, List list) {
        this.f20648a = str;
        this.f20649b = i2;
        this.f20650c = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final List b() {
        return this.f20650c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final int c() {
        return this.f20649b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final String d() {
        return this.f20648a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        return this.f20648a.equals(thread.d()) && this.f20649b == thread.c() && this.f20650c.equals(thread.b());
    }

    public final int hashCode() {
        return ((((this.f20648a.hashCode() ^ 1000003) * 1000003) ^ this.f20649b) * 1000003) ^ this.f20650c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f20648a + ", importance=" + this.f20649b + ", frames=" + this.f20650c + "}";
    }
}
