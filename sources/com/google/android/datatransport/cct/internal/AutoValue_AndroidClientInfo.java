package com.google.android.datatransport.cct.internal;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16729c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16730e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16732i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16733l;

    public static final class Builder extends AndroidClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f16734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16736c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16737e;
        public String f;
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f16738h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f16739i;
        public String j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f16740l;

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo a() {
            return new AutoValue_AndroidClientInfo(this.f16734a, this.f16735b, this.f16736c, this.d, this.f16737e, this.f, this.g, this.f16738h, this.f16739i, this.j, this.k, this.f16740l);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder b(String str) {
            this.f16740l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder c(String str) {
            this.j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder d(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder e(String str) {
            this.f16738h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder f(String str) {
            this.f16736c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder g(String str) {
            this.f16739i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder h(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder i(String str) {
            this.k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder j(String str) {
            this.f16735b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder k(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder l(String str) {
            this.f16737e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder m(Integer num) {
            this.f16734a = num;
            return this;
        }
    }

    public AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f16727a = num;
        this.f16728b = str;
        this.f16729c = str2;
        this.d = str3;
        this.f16730e = str4;
        this.f = str5;
        this.g = str6;
        this.f16731h = str7;
        this.f16732i = str8;
        this.j = str9;
        this.k = str10;
        this.f16733l = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String b() {
        return this.f16733l;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String c() {
        return this.j;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String e() {
        return this.f16731h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f16727a;
        if (num == null) {
            if (androidClientInfo.m() != null) {
                return false;
            }
        } else if (!num.equals(androidClientInfo.m())) {
            return false;
        }
        String str = this.f16728b;
        if (str == null) {
            if (androidClientInfo.j() != null) {
                return false;
            }
        } else if (!str.equals(androidClientInfo.j())) {
            return false;
        }
        String str2 = this.f16729c;
        if (str2 == null) {
            if (androidClientInfo.f() != null) {
                return false;
            }
        } else if (!str2.equals(androidClientInfo.f())) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (androidClientInfo.d() != null) {
                return false;
            }
        } else if (!str3.equals(androidClientInfo.d())) {
            return false;
        }
        String str4 = this.f16730e;
        if (str4 == null) {
            if (androidClientInfo.l() != null) {
                return false;
            }
        } else if (!str4.equals(androidClientInfo.l())) {
            return false;
        }
        String str5 = this.f;
        if (str5 == null) {
            if (androidClientInfo.k() != null) {
                return false;
            }
        } else if (!str5.equals(androidClientInfo.k())) {
            return false;
        }
        String str6 = this.g;
        if (str6 == null) {
            if (androidClientInfo.h() != null) {
                return false;
            }
        } else if (!str6.equals(androidClientInfo.h())) {
            return false;
        }
        String str7 = this.f16731h;
        if (str7 == null) {
            if (androidClientInfo.e() != null) {
                return false;
            }
        } else if (!str7.equals(androidClientInfo.e())) {
            return false;
        }
        String str8 = this.f16732i;
        if (str8 == null) {
            if (androidClientInfo.g() != null) {
                return false;
            }
        } else if (!str8.equals(androidClientInfo.g())) {
            return false;
        }
        String str9 = this.j;
        if (str9 == null) {
            if (androidClientInfo.c() != null) {
                return false;
            }
        } else if (!str9.equals(androidClientInfo.c())) {
            return false;
        }
        String str10 = this.k;
        if (str10 == null) {
            if (androidClientInfo.i() != null) {
                return false;
            }
        } else if (!str10.equals(androidClientInfo.i())) {
            return false;
        }
        String str11 = this.f16733l;
        if (str11 == null) {
            return androidClientInfo.b() == null;
        }
        return str11.equals(androidClientInfo.b());
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String f() {
        return this.f16729c;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String g() {
        return this.f16732i;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        Integer num = this.f16727a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f16728b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16729c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16730e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f16731h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f16732i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f16733l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String i() {
        return this.k;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String j() {
        return this.f16728b;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String k() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String l() {
        return this.f16730e;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final Integer m() {
        return this.f16727a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f16727a);
        sb.append(", model=");
        sb.append(this.f16728b);
        sb.append(", hardware=");
        sb.append(this.f16729c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.f16730e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.f16731h);
        sb.append(", locale=");
        sb.append(this.f16732i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return a.r(sb, this.f16733l, "}");
    }
}
