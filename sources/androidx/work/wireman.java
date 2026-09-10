package androidx.work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Data.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Map<String, Object> f14224attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f14223saneness = apical.beachfront("Data");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final wireman f14222dern = new attabal().attabal();

    /* JADX INFO: compiled from: Data.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Map<String, Object> f14225attabal = new HashMap();

        public wireman attabal() throws Throwable {
            wireman wiremanVar = new wireman((Map<String, ?>) this.f14225attabal);
            wireman.impassible(wiremanVar);
            return wiremanVar;
        }

        public attabal beachfront(String str, long j) {
            this.f14225attabal.put(str, Long.valueOf(j));
            return this;
        }

        public attabal competently(String str, String str2) {
            this.f14225attabal.put(str, str2);
            return this;
        }

        public attabal dern(wireman wiremanVar) {
            wireman(wiremanVar.f14224attabal);
            return this;
        }

        public attabal marial(String str, int i) {
            this.f14225attabal.put(str, Integer.valueOf(i));
            return this;
        }

        public attabal saneness(String str, Object obj) {
            if (obj == null) {
                this.f14225attabal.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f14225attabal.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.f14225attabal.put(str, wireman.attabal((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.f14225attabal.put(str, wireman.saneness((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.f14225attabal.put(str, wireman.marial((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.f14225attabal.put(str, wireman.beachfront((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.f14225attabal.put(str, wireman.wireman((float[]) obj));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
            }
            this.f14225attabal.put(str, wireman.dern((double[]) obj));
            return this;
        }

        public attabal wireman(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                saneness(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public wireman() {
    }

    public static Boolean[] attabal(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static Long[] beachfront(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0030
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static androidx.work.wireman competently(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L4c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2d
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L37
        L2b:
            r5 = r2
            goto L40
        L2d:
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L34:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r5
        L40:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.io.IOException -> L30
            goto L30
        L46:
            androidx.work.wireman r5 = new androidx.work.wireman
            r5.<init>(r0)
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.wireman.competently(byte[]):androidx.work.wireman");
    }

    public static Double[] dern(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static byte[] impassible(wireman wiremanVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(wiremanVar.formularize());
                    for (Map.Entry<String, Object> entry : wiremanVar.f14224attabal.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Integer[] marial(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static Byte[] saneness(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static Float[] wireman(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public String apical(String str) {
        Object obj = this.f14224attabal.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public long cutely(String str, long j) {
        Object obj = this.f14224attabal.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wireman.class != obj.getClass()) {
            return false;
        }
        wireman wiremanVar = (wireman) obj;
        Set<String> setKeySet = this.f14224attabal.keySet();
        if (!setKeySet.equals(wiremanVar.f14224attabal.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f14224attabal.get(str);
            Object obj3 = wiremanVar.f14224attabal.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int formularize() {
        return this.f14224attabal.size();
    }

    public int hashCode() {
        return this.f14224attabal.hashCode() * 31;
    }

    public int impromptu(String str, int i) {
        Object obj = this.f14224attabal.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public Map<String, Object> taiyuan() {
        return Collections.unmodifiableMap(this.f14224attabal);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f14224attabal.isEmpty()) {
            for (String str : this.f14224attabal.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f14224attabal.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public wireman(wireman wiremanVar) {
        this.f14224attabal = new HashMap(wiremanVar.f14224attabal);
    }

    public wireman(Map<String, ?> map) {
        this.f14224attabal = new HashMap(map);
    }
}
