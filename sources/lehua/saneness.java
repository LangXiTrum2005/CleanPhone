package lehua;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_EventInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f32709attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Map<String, String> f32710beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Integer f32711competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final byte[] f32712cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f32713dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f32714impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f32715marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Integer f32716saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final byte[] f32717taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f32718wireman;

    /* JADX INFO: renamed from: lehua.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_EventInternal.java */
    public static final class C0717saneness extends taiyuan.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f32719attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public Map<String, String> f32720beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public Integer f32721competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public byte[] f32722cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public impromptu f32723dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public String f32724impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Long f32725marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Integer f32726saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public byte[] f32727taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Long f32728wireman;

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal apical(byte[] bArr) {
            this.f32722cutely = bArr;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal beachfront(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f32720beachfront = map;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal competently(Integer num) {
            this.f32726saneness = num;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal cutely(byte[] bArr) {
            this.f32727taiyuan = bArr;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal formularize(Integer num) {
            this.f32721competently = num;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal impassible(String str) {
            this.f32724impromptu = str;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal impromptu(impromptu impromptuVar) {
            if (impromptuVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f32723dern = impromptuVar;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal kowloon(long j) {
            this.f32725marial = Long.valueOf(j);
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public Map<String, String> marial() {
            Map<String, String> map = this.f32720beachfront;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal taiyuan(long j) {
            this.f32728wireman = Long.valueOf(j);
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan.attabal triweekly(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f32719attabal = str;
            return this;
        }

        @Override // lehua.taiyuan.attabal
        public taiyuan wireman() {
            String str = "";
            if (this.f32719attabal == null) {
                str = " transportName";
            }
            if (this.f32723dern == null) {
                str = str + " encodedPayload";
            }
            if (this.f32728wireman == null) {
                str = str + " eventMillis";
            }
            if (this.f32725marial == null) {
                str = str + " uptimeMillis";
            }
            if (this.f32720beachfront == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new saneness(this.f32719attabal, this.f32726saneness, this.f32723dern, this.f32728wireman.longValue(), this.f32725marial.longValue(), this.f32720beachfront, this.f32721competently, this.f32724impromptu, this.f32727taiyuan, this.f32722cutely);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    @Override // lehua.taiyuan
    public long beachfront() {
        return this.f32718wireman;
    }

    @Override // lehua.taiyuan
    public byte[] competently() {
        return this.f32717taiyuan;
    }

    @Override // lehua.taiyuan
    public Map<String, String> dern() {
        return this.f32710beachfront;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof taiyuan) {
            taiyuan taiyuanVar = (taiyuan) obj;
            if (this.f32709attabal.equals(taiyuanVar.triweekly()) && ((num = this.f32716saneness) != null ? num.equals(taiyuanVar.wireman()) : taiyuanVar.wireman() == null) && this.f32713dern.equals(taiyuanVar.marial()) && this.f32718wireman == taiyuanVar.beachfront() && this.f32715marial == taiyuanVar.kowloon() && this.f32710beachfront.equals(taiyuanVar.dern()) && ((num2 = this.f32711competently) != null ? num2.equals(taiyuanVar.formularize()) : taiyuanVar.formularize() == null) && ((str = this.f32714impromptu) != null ? str.equals(taiyuanVar.impassible()) : taiyuanVar.impassible() == null)) {
                boolean z = taiyuanVar instanceof saneness;
                if (Arrays.equals(this.f32717taiyuan, z ? ((saneness) taiyuanVar).f32717taiyuan : taiyuanVar.competently())) {
                    if (Arrays.equals(this.f32712cutely, z ? ((saneness) taiyuanVar).f32712cutely : taiyuanVar.impromptu())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // lehua.taiyuan
    public Integer formularize() {
        return this.f32711competently;
    }

    public int hashCode() {
        int iHashCode = (this.f32709attabal.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f32716saneness;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f32713dern.hashCode()) * 1000003;
        long j = this.f32718wireman;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f32715marial;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f32710beachfront.hashCode()) * 1000003;
        Integer num2 = this.f32711competently;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f32714impromptu;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f32717taiyuan)) * 1000003) ^ Arrays.hashCode(this.f32712cutely);
    }

    @Override // lehua.taiyuan
    public String impassible() {
        return this.f32714impromptu;
    }

    @Override // lehua.taiyuan
    public byte[] impromptu() {
        return this.f32712cutely;
    }

    @Override // lehua.taiyuan
    public long kowloon() {
        return this.f32715marial;
    }

    @Override // lehua.taiyuan
    public impromptu marial() {
        return this.f32713dern;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f32709attabal + ", code=" + this.f32716saneness + ", encodedPayload=" + this.f32713dern + ", eventMillis=" + this.f32718wireman + ", uptimeMillis=" + this.f32715marial + ", autoMetadata=" + this.f32710beachfront + ", productId=" + this.f32711competently + ", pseudonymousId=" + this.f32714impromptu + ", experimentIdsClear=" + Arrays.toString(this.f32717taiyuan) + ", experimentIdsEncrypted=" + Arrays.toString(this.f32712cutely) + "}";
    }

    @Override // lehua.taiyuan
    public String triweekly() {
        return this.f32709attabal;
    }

    @Override // lehua.taiyuan
    public Integer wireman() {
        return this.f32716saneness;
    }

    public saneness(String str, Integer num, impromptu impromptuVar, long j, long j2, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f32709attabal = str;
        this.f32716saneness = num;
        this.f32713dern = impromptuVar;
        this.f32718wireman = j;
        this.f32715marial = j2;
        this.f32710beachfront = map;
        this.f32711competently = num2;
        this.f32714impromptu = str2;
        this.f32717taiyuan = bArr;
        this.f32712cutely = bArr2;
    }
}
