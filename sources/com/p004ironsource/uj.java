package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class uj {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27422n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<InterstitialPlacement> f27423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g4 f27424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27425c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27426e;
    private int f;
    private o5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f27428i;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27429l;
    private InterstitialPlacement m;

    public uj() {
        this.f27423a = new ArrayList<>();
        this.f27424b = new g4();
        this.g = new o5();
    }

    public InterstitialPlacement a() {
        for (InterstitialPlacement interstitialPlacement : this.f27423a) {
            if (interstitialPlacement.getIsDefault()) {
                return interstitialPlacement;
            }
        }
        return this.m;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.f27425c;
    }

    public int d() {
        return this.f27426e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f27426e);
    }

    public boolean f() {
        return this.d;
    }

    public o5 g() {
        return this.g;
    }

    public long h() {
        return this.f27428i;
    }

    public g4 i() {
        return this.f27424b;
    }

    public boolean j() {
        return this.f27427h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.f27429l;
    }

    public boolean m() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InterstitialConfigurations{parallelLoad=");
        sb.append(this.f27425c);
        sb.append(", bidderExclusive=");
        return a.r(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }

    public uj(int i2, boolean z2, int i3, g4 g4Var, o5 o5Var, int i4, boolean z3, long j, boolean z4, boolean z5, boolean z6) {
        this.f27423a = new ArrayList<>();
        this.f27425c = i2;
        this.d = z2;
        this.f27426e = i3;
        this.f27424b = g4Var;
        this.g = o5Var;
        this.j = z4;
        this.k = z5;
        this.f = i4;
        this.f27427h = z3;
        this.f27428i = j;
        this.f27429l = z6;
    }

    public InterstitialPlacement a(String str) {
        for (InterstitialPlacement interstitialPlacement : this.f27423a) {
            if (interstitialPlacement.getPlacementName().equals(str)) {
                return interstitialPlacement;
            }
        }
        return null;
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f27423a.add(interstitialPlacement);
            if (this.m == null || interstitialPlacement.isPlacementId(0)) {
                this.m = interstitialPlacement;
            }
        }
    }
}
