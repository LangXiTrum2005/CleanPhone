package d5;

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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38689b = o.i("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f38690c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38691a;

    static {
        f fVar = new f(new HashMap());
        c(fVar);
        f38690c = fVar;
    }

    public f(f fVar) {
        this.f38691a = new HashMap(fVar.f38691a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static f a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th2;
        Throwable e10;
        String str = f38689b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                try {
                    try {
                        try {
                            for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                                map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e11) {
                                    Log.e(str, "Error in Data#fromByteArray: ", e11);
                                }
                            }
                            try {
                                byteArrayInputStream.close();
                                throw th2;
                            } catch (IOException e12) {
                                Log.e(str, "Error in Data#fromByteArray: ", e12);
                                throw th2;
                            }
                        }
                    } catch (IOException | ClassNotFoundException e13) {
                        e10 = e13;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return new f(map);
                    }
                    objectInputStream.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#fromByteArray: ", e14);
                }
                byteArrayInputStream.close();
            } catch (IOException e15) {
                Log.e(str, "Error in Data#fromByteArray: ", e15);
            }
        } catch (IOException | ClassNotFoundException e16) {
            objectInputStream = null;
            e10 = e16;
        } catch (Throwable th4) {
            objectInputStream = null;
            th2 = th4;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th2;
        }
        return new f(map);
    }

    public static byte[] c(f fVar) throws Throwable {
        String str = f38689b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(fVar.f38691a.size());
                    for (Map.Entry entry : fVar.f38691a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(str, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(str, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(str, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String b(String str) {
        Object obj = this.f38691a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                HashMap map = ((f) obj).f38691a;
                HashMap map2 = this.f38691a;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
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
        return this.f38691a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap map = this.f38691a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public f(HashMap map) {
        this.f38691a = new HashMap(map);
    }
}
