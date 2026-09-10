package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f21463attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f21464dern = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Long f21465saneness;

    public /* synthetic */ kowloon(String str, Long l, Object obj, triweekly triweeklyVar) {
        this.f21463attabal = str;
        this.f21465saneness = l;
    }

    public static boolean dern() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long attabal() {
        return this.f21465saneness;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f21463attabal.equals(integrityTokenRequest.saneness()) || ((l = this.f21465saneness) != null ? !l.equals(integrityTokenRequest.attabal()) : integrityTokenRequest.attabal() != null)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if ((obj instanceof kowloon) && dern()) {
            return z;
        }
        return z;
    }

    public final int hashCode() {
        int iHashCode = this.f21463attabal.hashCode() ^ 1000003;
        Long l = this.f21465saneness;
        int iHashCode2 = (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return dern() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String saneness() {
        return this.f21463attabal;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f21463attabal + ", cloudProjectNumber=" + this.f21465saneness;
        if (dern()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
