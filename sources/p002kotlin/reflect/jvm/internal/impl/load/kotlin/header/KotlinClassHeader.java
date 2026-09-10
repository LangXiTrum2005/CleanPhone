package p002kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import foreshot.marial;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;

/* JADX INFO: compiled from: KotlinClassHeader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Kind f30758attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f30759beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f30760competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String[] f30761dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f30762impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String[] f30763marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f30764saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final byte[] f30765taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String[] f30766wireman;

    /* JADX INFO: compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final Map<Integer, Kind> f30768kowloon;
        private final int id;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f30769monoploid = p002kotlin.enums.attabal.attabal(attabal());
        public static final attabal Companion = new attabal(null);

        /* JADX INFO: compiled from: KotlinClassHeader.kt */
        public static final class attabal {
            public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind attabal(int i) {
                Kind kind = (Kind) Kind.f30768kowloon.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            public attabal() {
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(wireman.wireman(polder.marial(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            f30768kowloon = linkedHashMap;
        }

        Kind(int i) {
            this.id = i;
        }

        public static final Kind getById(int i) {
            return Companion.attabal(i);
        }
    }

    public KotlinClassHeader(Kind kind, marial metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f30758attabal = kind;
        this.f30764saneness = metadataVersion;
        this.f30761dern = strArr;
        this.f30766wireman = strArr2;
        this.f30763marial = strArr3;
        this.f30759beachfront = str;
        this.f30760competently = i;
        this.f30762impromptu = str2;
        this.f30765taiyuan = bArr;
    }

    public final boolean apical() {
        return impromptu(this.f30760competently, 16) && !impromptu(this.f30760competently, 32);
    }

    public final String[] attabal() {
        return this.f30761dern;
    }

    public final List<String> beachfront() {
        String[] strArr = this.f30761dern;
        if (this.f30758attabal != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listWireman = strArr != null ? arytenoidectomy.wireman(strArr) : null;
        return listWireman == null ? adultoid.formularize() : listWireman;
    }

    public final String[] competently() {
        return this.f30763marial;
    }

    public final boolean cutely() {
        return impromptu(this.f30760competently, 64) && !impromptu(this.f30760competently, 32);
    }

    public final Kind dern() {
        return this.f30758attabal;
    }

    public final boolean impromptu(int i, int i2) {
        return (i & i2) != 0;
    }

    public final String marial() {
        String str = this.f30759beachfront;
        if (this.f30758attabal == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final String[] saneness() {
        return this.f30766wireman;
    }

    public final boolean taiyuan() {
        return impromptu(this.f30760competently, 2);
    }

    public String toString() {
        return this.f30758attabal + " version=" + this.f30764saneness;
    }

    public final marial wireman() {
        return this.f30764saneness;
    }
}
