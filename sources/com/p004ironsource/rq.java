package com.p004ironsource;

import com.smartdigimkt.m3.h;

/* JADX INFO: loaded from: classes5.dex */
public enum rq {
    PER_DAY("d"),
    PER_HOUR(h.f36614b);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26687a;

    rq(String str) {
        this.f26687a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f26687a;
    }
}
