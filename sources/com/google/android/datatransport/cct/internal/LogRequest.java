package com.google.android.datatransport.cct.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LogRequest {

    public static abstract class Builder {
        public abstract LogRequest a();

        public abstract Builder b(ClientInfo clientInfo);

        public abstract Builder c(ArrayList arrayList);

        public abstract Builder d(Integer num);

        public abstract Builder e(String str);

        public abstract Builder f();

        public abstract Builder g(long j);

        public abstract Builder h(long j);
    }

    public static Builder a() {
        return new AutoValue_LogRequest.Builder();
    }

    public abstract ClientInfo b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract QosTier f();

    public abstract long g();

    public abstract long h();
}
