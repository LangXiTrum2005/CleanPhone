package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kind f44021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmMetadataVersion f44022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f44023c;
    public final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f44024e;
    public final String f;
    public final int g;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final LinkedHashMap f44025Y;
        public final int X;

        public static final class Companion {
        }

        static {
            Kind[] kindArrValues = values();
            int iH = MapsKt.h(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.X), kind);
            }
            f44025Y = linkedHashMap;
        }

        Kind(int i2) {
            this.X = i2;
        }
    }

    public KotlinClassHeader(Kind kind, JvmMetadataVersion jvmMetadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i2) {
        Intrinsics.f(kind, "kind");
        this.f44021a = kind;
        this.f44022b = jvmMetadataVersion;
        this.f44023c = strArr;
        this.d = strArr2;
        this.f44024e = strArr3;
        this.f = str;
        this.g = i2;
    }

    public final String toString() {
        return this.f44021a + " version=" + this.f44022b;
    }
}
