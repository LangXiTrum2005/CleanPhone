package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class bs {
    private static final int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Placement> f24449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g4 f24450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24451c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24452e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24454i;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Placement f24455l;
    private o5 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24456n;

    public bs() {
        this.f24449a = new ArrayList<>();
        this.f24450b = new g4();
    }

    public Placement a() {
        for (Placement placement : this.f24449a) {
            if (placement.getIsDefault()) {
                return placement;
            }
        }
        return this.f24455l;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.f24456n;
    }

    public ArrayList<Placement> e() {
        return this.f24449a;
    }

    public boolean f() {
        return this.f24454i;
    }

    public int g() {
        return this.f24451c;
    }

    public int h() {
        return this.f24452e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f24452e);
    }

    public boolean j() {
        return this.d;
    }

    public o5 k() {
        return this.m;
    }

    public long l() {
        return this.f24453h;
    }

    public g4 m() {
        return this.f24450b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb.append(this.f24451c);
        sb.append(", bidderExclusive=");
        return a.r(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }

    public bs(int i2, boolean z2, int i3, int i4, g4 g4Var, o5 o5Var, int i5, boolean z3, long j, boolean z4, boolean z5, boolean z6) {
        this.f24449a = new ArrayList<>();
        this.f24451c = i2;
        this.d = z2;
        this.f24452e = i3;
        this.f24450b = g4Var;
        this.f = i4;
        this.m = o5Var;
        this.g = i5;
        this.f24456n = z3;
        this.f24453h = j;
        this.f24454i = z4;
        this.j = z5;
        this.k = z6;
    }

    public Placement a(String str) {
        for (Placement placement : this.f24449a) {
            if (placement.getPlacementName().equals(str)) {
                return placement;
            }
        }
        return null;
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.f24449a.add(placement);
            if (this.f24455l == null || placement.isPlacementId(0)) {
                this.f24455l = placement;
            }
        }
    }
}
