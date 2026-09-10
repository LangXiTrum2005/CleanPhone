package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3067bF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4164a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public C3067bF(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10) {
        AbstractC2995aW.q(str, "prettyPrintIndent");
        AbstractC2995aW.q(str2, "classDiscriminator");
        this.f4164a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = z7;
        this.i = z8;
        this.j = str2;
        this.k = z9;
        this.l = z10;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f4164a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=" + this.e + ", explicitNulls=" + this.f + ", prettyPrintIndent='" + this.g + "', coerceInputValues=" + this.h + ", useArrayPolymorphism=" + this.i + ", classDiscriminator='" + this.j + "', allowSpecialFloatingPointValues=" + this.k + ')';
    }
}
