package lehua;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_TransportContext.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman extends arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f32731attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Priority f32732dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f32733saneness;

    /* JADX INFO: compiled from: AutoValue_TransportContext.java */
    public static final class saneness extends arytenoidectomy.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f32734attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Priority f32735dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public byte[] f32736saneness;

        @Override // lehua.arytenoidectomy.attabal
        public arytenoidectomy attabal() {
            String str = "";
            if (this.f32734attabal == null) {
                str = " backendName";
            }
            if (this.f32735dern == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new wireman(this.f32734attabal, this.f32736saneness, this.f32735dern);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // lehua.arytenoidectomy.attabal
        public arytenoidectomy.attabal dern(byte[] bArr) {
            this.f32736saneness = bArr;
            return this;
        }

        @Override // lehua.arytenoidectomy.attabal
        public arytenoidectomy.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f32734attabal = str;
            return this;
        }

        @Override // lehua.arytenoidectomy.attabal
        public arytenoidectomy.attabal wireman(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f32735dern = priority;
            return this;
        }
    }

    @Override // lehua.arytenoidectomy
    public byte[] dern() {
        return this.f32733saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arytenoidectomy) {
            arytenoidectomy arytenoidectomyVar = (arytenoidectomy) obj;
            if (this.f32731attabal.equals(arytenoidectomyVar.saneness())) {
                if (Arrays.equals(this.f32733saneness, arytenoidectomyVar instanceof wireman ? ((wireman) arytenoidectomyVar).f32733saneness : arytenoidectomyVar.dern()) && this.f32732dern.equals(arytenoidectomyVar.wireman())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f32731attabal.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f32733saneness)) * 1000003) ^ this.f32732dern.hashCode();
    }

    @Override // lehua.arytenoidectomy
    public String saneness() {
        return this.f32731attabal;
    }

    @Override // lehua.arytenoidectomy
    public Priority wireman() {
        return this.f32732dern;
    }

    public wireman(String str, byte[] bArr, Priority priority) {
        this.f32731attabal = str;
        this.f32733saneness = bArr;
        this.f32732dern = priority;
    }
}
