package vc;

import defpackage.e;
import v0.i;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52542h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f52548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f52549g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(d.j(sb2, "Missing required properties:"));
    }

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f52543a = str;
        this.f52544b = i10;
        this.f52545c = str2;
        this.f52546d = str3;
        this.f52547e = j10;
        this.f52548f = j11;
        this.f52549g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f52534a = this.f52543a;
        aVar.f52535b = this.f52544b;
        aVar.f52536c = this.f52545c;
        aVar.f52537d = this.f52546d;
        aVar.f52538e = this.f52547e;
        aVar.f52539f = this.f52548f;
        aVar.f52540g = this.f52549g;
        aVar.f52541h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f52549g;
        String str2 = bVar.f52546d;
        String str3 = bVar.f52545c;
        String str4 = bVar.f52543a;
        String str5 = this.f52543a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!i.b(this.f52544b, bVar.f52544b)) {
            return false;
        }
        String str6 = this.f52545c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f52546d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f52547e != bVar.f52547e || this.f52548f != bVar.f52548f) {
            return false;
        }
        String str8 = this.f52549g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f52543a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ i.c(this.f52544b)) * 1000003;
        String str2 = this.f52545c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f52546d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f52547e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f52548f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f52549g;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f52543a);
        sb2.append(", registrationStatus=");
        int i10 = this.f52544b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f52545c);
        sb2.append(", refreshToken=");
        sb2.append(this.f52546d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f52547e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f52548f);
        sb2.append(", fisError=");
        return e.q(this.f52549g, "}", sb2);
    }
}
