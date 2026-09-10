package org.objectweb.asm.commons;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes5.dex */
public class Method {
    private static final Map<String, String> PRIMITIVE_TYPE_DESCRIPTORS;
    private final String descriptor;
    private final String name;

    static {
        HashMap map = new HashMap();
        map.put("void", "V");
        map.put("byte", "B");
        map.put("char", "C");
        map.put("double", "D");
        map.put("float", "F");
        map.put("int", "I");
        map.put("long", "J");
        map.put("short", "S");
        map.put("boolean", "Z");
        PRIMITIVE_TYPE_DESCRIPTORS = map;
    }

    public Method(String str, String str2) {
        this.name = str;
        this.descriptor = str2;
    }

    private static String getDescriptorInternal(String str, boolean z) {
        if ("".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int iIndexOf = 0;
        while (true) {
            iIndexOf = str.indexOf(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, iIndexOf) + 1;
            if (iIndexOf <= 0) {
                break;
            }
            sb.append('[');
        }
        String strSubstring = str.substring(0, str.length() - (sb.length() * 2));
        String str2 = PRIMITIVE_TYPE_DESCRIPTORS.get(strSubstring);
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append('L');
            if (strSubstring.indexOf(46) < 0) {
                if (!z) {
                    sb.append("java/lang/");
                }
                sb.append(strSubstring);
            } else {
                sb.append(strSubstring.replace('.', '/'));
            }
            sb.append(';');
        }
        return sb.toString();
    }

    public static Method getMethod(java.lang.reflect.Method method) {
        return new Method(method.getName(), Type.getMethodDescriptor(method));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Method)) {
            return false;
        }
        Method method = (Method) obj;
        return this.name.equals(method.name) && this.descriptor.equals(method.descriptor);
    }

    public Type[] getArgumentTypes() {
        return Type.getArgumentTypes(this.descriptor);
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return Type.getReturnType(this.descriptor);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.descriptor.hashCode();
    }

    public String toString() {
        return this.name + this.descriptor;
    }

    public static Method getMethod(Constructor<?> constructor) {
        return new Method("<init>", Type.getConstructorDescriptor(constructor));
    }

    public static Method getMethod(String str) {
        return getMethod(str, false);
    }

    public Method(String str, Type type, Type[] typeArr) {
        this(str, Type.getMethodDescriptor(type, typeArr));
    }

    public static Method getMethod(String str, boolean z) {
        int iIndexOf;
        String descriptorInternal;
        int iIndexOf2 = str.indexOf(32);
        int iIndexOf3 = str.indexOf(40, iIndexOf2);
        int i = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(41, i);
        if (iIndexOf2 != -1 && i != 0 && iIndexOf4 != -1) {
            String strSubstring = str.substring(0, iIndexOf2);
            String strTrim = str.substring(iIndexOf2 + 1, iIndexOf3).trim();
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            do {
                iIndexOf = str.indexOf(44, i);
                if (iIndexOf == -1) {
                    descriptorInternal = getDescriptorInternal(str.substring(i, iIndexOf4).trim(), z);
                } else {
                    descriptorInternal = getDescriptorInternal(str.substring(i, iIndexOf).trim(), z);
                    i = iIndexOf + 1;
                }
                sb.append(descriptorInternal);
            } while (iIndexOf != -1);
            sb.append(')');
            sb.append(getDescriptorInternal(strSubstring, z));
            return new Method(strTrim, sb.toString());
        }
        throw new IllegalArgumentException();
    }
}
