package com.inmobi.media;

import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3260uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3212rc f24032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f24033c;
    public final HashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24034e;
    public final EnumC3228sc f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3244tc f24035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24036i;
    public final int j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M9 f24037l;
    public int m;

    public C3260uc(C3197qc c3197qc) {
        this.f24031a = c3197qc.f23933a;
        this.f24032b = c3197qc.f23934b;
        this.f24033c = c3197qc.f23935c;
        this.d = c3197qc.d;
        String str = c3197qc.f23936e;
        this.f24034e = str == null ? "" : str;
        this.f = EnumC3228sc.LOW;
        Boolean bool = c3197qc.f;
        this.g = bool != null ? bool.booleanValue() : true;
        this.f24035h = c3197qc.g;
        Integer num = c3197qc.f23937h;
        this.f24036i = num != null ? num.intValue() : 60000;
        Integer num2 = c3197qc.f23938i;
        this.j = num2 != null ? num2.intValue() : 60000;
        Boolean bool2 = c3197qc.j;
        this.k = bool2 != null ? bool2.booleanValue() : false;
    }

    public final String toString() {
        return "URL:" + J9.a(this.f24031a, this.d) + " | TAG:null | METHOD:" + this.f24032b + " | PAYLOAD:" + this.f24034e + " | HEADERS:" + this.f24033c + " | RETRY_POLICY:" + this.f24035h;
    }
}
