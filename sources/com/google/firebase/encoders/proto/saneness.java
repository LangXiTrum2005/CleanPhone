package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import derbyshire.beachfront;
import derbyshire.dern;
import derbyshire.marial;
import derbyshire.wireman;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Charset f22456beachfront = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final dern f22457competently = dern.attabal(X3.i.W).saneness(com.google.firebase.encoders.proto.attabal.saneness().dern(1).attabal()).attabal();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final dern f22458impromptu = dern.attabal("value").saneness(com.google.firebase.encoders.proto.attabal.saneness().dern(2).attabal()).attabal();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final wireman<Map.Entry<Object, Object>> f22459taiyuan = new wireman() { // from class: uniterm.dern
        @Override // derbyshire.saneness
        public final void attabal(Object obj, derbyshire.marial marialVar) throws IOException {
            com.google.firebase.encoders.proto.saneness.attabal((Map.Entry) obj, marialVar);
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public OutputStream f22460attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<Class<?>, beachfront<?>> f22461dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final uniterm.beachfront f22462marial = new uniterm.beachfront(this);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Class<?>, wireman<?>> f22463saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final wireman<Object> f22464wireman;

    /* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22465attabal;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f22465attabal = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22465attabal[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22465attabal[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public saneness(OutputStream outputStream, Map<Class<?>, wireman<?>> map, Map<Class<?>, beachfront<?>> map2, wireman<Object> wiremanVar) {
        this.f22460attabal = outputStream;
        this.f22463saneness = map;
        this.f22461dern = map2;
        this.f22464wireman = wiremanVar;
    }

    public static Protobuf adultoid(dern dernVar) {
        Protobuf protobuf = (Protobuf) dernVar.dern(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static ByteBuffer arytenoidectomy(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static /* synthetic */ void attabal(Map.Entry entry, marial marialVar) throws IOException {
        marialVar.beachfront(f22457competently, entry.getKey());
        marialVar.beachfront(f22458impromptu, entry.getValue());
    }

    public static int dovishness(dern dernVar) {
        Protobuf protobuf = (Protobuf) dernVar.dern(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // derbyshire.marial
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public saneness saneness(dern dernVar, boolean z) throws IOException {
        return formularize(dernVar, z, true);
    }

    @Override // derbyshire.marial
    public marial beachfront(dern dernVar, Object obj) throws IOException {
        return kowloon(dernVar, obj, true);
    }

    @Override // derbyshire.marial
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public saneness dern(dern dernVar, int i) throws IOException {
        return impromptu(dernVar, i, true);
    }

    public saneness cutely(dern dernVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            Protobuf protobufAdultoid = adultoid(dernVar);
            int i = attabal.f22465attabal[protobufAdultoid.intEncoding().ordinal()];
            if (i == 1) {
                gintrap(protobufAdultoid.tag() << 3);
                rotuma(j);
                return this;
            }
            if (i == 2) {
                gintrap(protobufAdultoid.tag() << 3);
                rotuma((j >> 63) ^ (j << 1));
                return this;
            }
            if (i == 3) {
                gintrap((protobufAdultoid.tag() << 3) | 1);
                this.f22460attabal.write(arytenoidectomy(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    public saneness formularize(dern dernVar, boolean z, boolean z2) throws IOException {
        return impromptu(dernVar, z ? 1 : 0, z2);
    }

    public final void gintrap(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f22460attabal.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f22460attabal.write(i & 127);
    }

    public saneness graveside(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        wireman<?> wiremanVar = this.f22463saneness.get(obj.getClass());
        if (wiremanVar != null) {
            wiremanVar.attabal(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public marial impassible(dern dernVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        gintrap((dovishness(dernVar) << 3) | 1);
        this.f22460attabal.write(arytenoidectomy(8).putDouble(d).array());
        return this;
    }

    public saneness impromptu(dern dernVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            Protobuf protobufAdultoid = adultoid(dernVar);
            int i2 = attabal.f22465attabal[protobufAdultoid.intEncoding().ordinal()];
            if (i2 == 1) {
                gintrap(protobufAdultoid.tag() << 3);
                gintrap(i);
                return this;
            }
            if (i2 == 2) {
                gintrap(protobufAdultoid.tag() << 3);
                gintrap((i << 1) ^ (i >> 31));
                return this;
            }
            if (i2 == 3) {
                gintrap((protobufAdultoid.tag() << 3) | 5);
                this.f22460attabal.write(arytenoidectomy(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    public marial kowloon(dern dernVar, Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    gintrap((dovishness(dernVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f22456beachfront);
                    gintrap(bytes.length);
                    this.f22460attabal.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    kowloon(dernVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    polloi(f22459taiyuan, dernVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return impassible(dernVar, ((Double) obj).doubleValue(), z);
                }
                if (obj instanceof Float) {
                    return triweekly(dernVar, ((Float) obj).floatValue(), z);
                }
                if (obj instanceof Number) {
                    return cutely(dernVar, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return formularize(dernVar, ((Boolean) obj).booleanValue(), z);
                }
                if (!(obj instanceof byte[])) {
                    wireman<?> wiremanVar = this.f22463saneness.get(obj.getClass());
                    if (wiremanVar != null) {
                        return polloi(wiremanVar, dernVar, obj, z);
                    }
                    beachfront<?> beachfrontVar = this.f22461dern.get(obj.getClass());
                    if (beachfrontVar != null) {
                        return molybdenite(beachfrontVar, dernVar, obj, z);
                    }
                    if (obj instanceof uniterm.saneness) {
                        return dern(dernVar, ((uniterm.saneness) obj).getNumber());
                    }
                    return obj instanceof Enum ? dern(dernVar, ((Enum) obj).ordinal()) : polloi(this.f22464wireman, dernVar, obj, z);
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    gintrap((dovishness(dernVar) << 3) | 2);
                    gintrap(bArr.length);
                    this.f22460attabal.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // derbyshire.marial
    public marial marial(dern dernVar, double d) throws IOException {
        return impassible(dernVar, d, true);
    }

    public final <T> saneness molybdenite(beachfront<T> beachfrontVar, dern dernVar, T t, boolean z) throws IOException {
        this.f22462marial.dern(dernVar, z);
        beachfrontVar.attabal(t, this.f22462marial);
        return this;
    }

    public final <T> long monoploid(wireman<T> wiremanVar, T t) throws IOException {
        uniterm.attabal attabalVar = new uniterm.attabal();
        try {
            OutputStream outputStream = this.f22460attabal;
            this.f22460attabal = attabalVar;
            try {
                wiremanVar.attabal(t, this);
                this.f22460attabal = outputStream;
                long jAttabal = attabalVar.attabal();
                attabalVar.close();
                return jAttabal;
            } catch (Throwable th) {
                this.f22460attabal = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                attabalVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final <T> saneness polloi(wireman<T> wiremanVar, dern dernVar, T t, boolean z) throws IOException {
        long jMonoploid = monoploid(wiremanVar, t);
        if (z && jMonoploid == 0) {
            return this;
        }
        gintrap((dovishness(dernVar) << 3) | 2);
        rotuma(jMonoploid);
        wiremanVar.attabal(t, this);
        return this;
    }

    public final void rotuma(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f22460attabal.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f22460attabal.write(((int) j) & 127);
    }

    @Override // derbyshire.marial
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public saneness wireman(dern dernVar, long j) throws IOException {
        return cutely(dernVar, j, true);
    }

    public marial triweekly(dern dernVar, float f, boolean z) throws IOException {
        if (z && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this;
        }
        gintrap((dovishness(dernVar) << 3) | 5);
        this.f22460attabal.write(arytenoidectomy(4).putFloat(f).array());
        return this;
    }
}
