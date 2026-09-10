package com.smartdigimkt.x4;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<Double> f39924c;
    long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39925e;

    public f(com.smartdigimkt.w6.g gVar) {
        this.f39923b = 0;
        this.f39925e = 0L;
        this.f39922a = gVar.m1();
        this.f39923b = gVar.i1();
        this.f39924c = gVar.b1();
        this.d = gVar.c1();
        this.f39925e = gVar.e1();
    }

    public long a() {
        return this.d;
    }

    public int b() {
        return this.f39923b;
    }

    public List<Double> c() {
        return this.f39924c;
    }

    public long d() {
        return this.f39925e;
    }

    public int e() {
        return this.f39922a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShakeSensorSetting{shakeWay=");
        sb.append(this.f39922a);
        sb.append(", shakeStrength=");
        sb.append(this.f39923b);
        sb.append(", shakeStrengthList=");
        sb.append(this.f39924c);
        sb.append(", shakeDetectDurationTime=");
        sb.append(this.d);
        sb.append(", shakeTimeMs=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.f39925e, AbstractJsonLexerKt.END_OBJ);
    }
}
