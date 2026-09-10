package vc;

import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f52534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f52537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f52538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f52539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f52540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f52541h;

    public final b a() {
        if (this.f52541h == 3 && this.f52535b != 0) {
            return new b(this.f52534a, this.f52535b, this.f52536c, this.f52537d, this.f52538e, this.f52539f, this.f52540g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f52535b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f52541h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f52541h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(d.j(sb2, "Missing required properties:"));
    }
}
