package d5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f38687b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f38688a;

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f38688a = new HashMap();
                break;
            default:
                this.f38688a = new HashMap();
                break;
        }
    }

    public void a(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = this.f38688a;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i10 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = f.f38689b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i10 < zArr.length) {
                            boolArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = f.f38689b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i10 < bArr.length) {
                            bArr2[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = f.f38689b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i10 < iArr.length) {
                            numArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = f.f38689b;
                        Long[] lArr = new Long[jArr.length];
                        while (i10 < jArr.length) {
                            lArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = f.f38689b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i10 < fArr.length) {
                            fArr2[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = f.f38689b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i10 < dArr.length) {
                            dArr2[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }
}
