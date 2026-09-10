package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ClientMetrics {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16875e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeWindow f16876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlobalMetrics f16878c;
    public final String d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TimeWindow f16879a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f16880b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GlobalMetrics f16881c = null;
        public String d = "";
    }

    static {
        Collections.unmodifiableList(new Builder().f16880b);
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f16876a = timeWindow;
        this.f16877b = list;
        this.f16878c = globalMetrics;
        this.d = str;
    }
}
