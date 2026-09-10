package com.smartdigimkt.n4;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.a f37073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.p4.v f37074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37075c;

    public x(h.a aVar, com.smartdigimkt.p4.v vVar, int i2) {
        this.f37073a = aVar;
        this.f37074b = vVar;
        this.f37075c = i2;
    }

    @Override // com.smartdigimkt.n4.h.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.f37073a.a(), this.f37074b, this.f37075c);
    }
}
