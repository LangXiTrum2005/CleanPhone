package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Data {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8618b = Logger.e("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Data f8619c = new Builder().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8620a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f8621a = new HashMap();

        public final Data a() throws Throwable {
            Data data = new Data(this.f8621a);
            Data.c(data);
            return data;
        }

        public final void b(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap map2 = this.f8621a;
                if (value == null) {
                    map2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        map2.put(str, value);
                    } else {
                        int i2 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = Data.f8618b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i2 < zArr.length) {
                                boolArr[i2] = Boolean.valueOf(zArr[i2]);
                                i2++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = Data.f8618b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i2 < bArr.length) {
                                bArr2[i2] = Byte.valueOf(bArr[i2]);
                                i2++;
                            }
                            map2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = Data.f8618b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i2 < iArr.length) {
                                numArr[i2] = Integer.valueOf(iArr[i2]);
                                i2++;
                            }
                            map2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = Data.f8618b;
                            Long[] lArr = new Long[jArr.length];
                            while (i2 < jArr.length) {
                                lArr[i2] = Long.valueOf(jArr[i2]);
                                i2++;
                            }
                            map2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = Data.f8618b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i2 < fArr.length) {
                                fArr2[i2] = Float.valueOf(fArr[i2]);
                                i2++;
                            }
                            map2.put(str, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                            }
                            double[] dArr = (double[]) value;
                            String str7 = Data.f8618b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i2 < dArr.length) {
                                dArr2[i2] = Double.valueOf(dArr[i2]);
                                i2++;
                            }
                            map2.put(str, dArr2);
                        }
                    }
                }
            }
        }
    }

    public Data(Data data) {
        this.f8620a = new HashMap(data.f8620a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Data a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e2;
        String str = f8618b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            Log.e(str, "Error in Data#fromByteArray: ", e3);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        e2 = e4;
                        Log.e(str, "Error in Data#fromByteArray: ", e2);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                                Log.e(str, "Error in Data#fromByteArray: ", e5);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e6) {
                        e2 = e6;
                        Log.e(str, "Error in Data#fromByteArray: ", e2);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e7) {
                    e = e7;
                    Throwable th = e;
                    objectInputStream = null;
                    e2 = th;
                    Log.e(str, "Error in Data#fromByteArray: ", e2);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    Throwable th2 = e;
                    objectInputStream = null;
                    e2 = th2;
                    Log.e(str, "Error in Data#fromByteArray: ", e2);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e9) {
                            Log.e(str, "Error in Data#fromByteArray: ", e9);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e10) {
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                Log.e(str, "Error in Data#fromByteArray: ", e11);
            }
            return new Data(map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] c(Data data) throws Throwable {
        String str = f8618b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.f8620a.size());
                    for (Map.Entry entry : data.f8620a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#toByteArray: ", e2);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        Log.e(str, "Error in Data#toByteArray: ", e3);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e5) {
                            Log.e(str, "Error in Data#toByteArray: ", e5);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        Log.e(str, "Error in Data#toByteArray: ", e6);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e7) {
                            Log.e(str, "Error in Data#toByteArray: ", e7);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e8) {
                        Log.e(str, "Error in Data#toByteArray: ", e8);
                        throw th;
                    }
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String b(String str) {
        Object obj = this.f8620a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && Data.class == obj.getClass()) {
                HashMap map = this.f8620a;
                Set<String> setKeySet = map.keySet();
                HashMap map2 = ((Data) obj).f8620a;
                if (setKeySet.equals(map2.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map.get(str);
                        Object obj3 = map2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8620a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f8620a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
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

    public Data(HashMap map) {
        this.f8620a = new HashMap(map);
    }
}
