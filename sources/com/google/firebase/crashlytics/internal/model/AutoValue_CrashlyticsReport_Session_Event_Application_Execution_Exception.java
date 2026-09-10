package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20636c;
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20637e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f20640c;
        public CrashlyticsReport.Session.Event.Application.Execution.Exception d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20641e;
        public byte f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception a() {
            String str;
            List list;
            if (this.f == 1 && (str = this.f20638a) != null && (list = this.f20640c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(str, this.f20639b, list, this.d, this.f20641e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20638a == null) {
                sb.append(" type");
            }
            if (this.f20640c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f20640c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d(int i2) {
            this.f20641e = i2;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder e(String str) {
            this.f20639b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f20638a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i2) {
        this.f20634a = str;
        this.f20635b = str2;
        this.f20636c = list;
        this.d = exception;
        this.f20637e = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final List c() {
        return this.f20636c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final int d() {
        return this.f20637e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String e() {
        return this.f20635b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.f20634a.equals(exception.f())) {
            return false;
        }
        String str = this.f20635b;
        if (str == null) {
            if (exception.e() != null) {
                return false;
            }
        } else if (!str.equals(exception.e())) {
            return false;
        }
        if (!this.f20636c.equals(exception.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = this.d;
        if (exception2 == null) {
            if (exception.b() != null) {
                return false;
            }
        } else if (!exception2.equals(exception.b())) {
            return false;
        }
        return this.f20637e == exception.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String f() {
        return this.f20634a;
    }

    public final int hashCode() {
        int iHashCode = (this.f20634a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20635b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f20636c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.d;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.f20637e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f20634a);
        sb.append(", reason=");
        sb.append(this.f20635b);
        sb.append(", frames=");
        sb.append(this.f20636c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return android.support.v4.media.a.i(this.f20637e, "}", sb);
    }
}
