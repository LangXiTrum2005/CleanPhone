package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LogSourceMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16886c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16888b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16889a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f16890b = new ArrayList();
    }

    static {
        Collections.unmodifiableList(new Builder().f16890b);
    }

    public LogSourceMetrics(String str, List list) {
        this.f16887a = str;
        this.f16888b = list;
    }
}
