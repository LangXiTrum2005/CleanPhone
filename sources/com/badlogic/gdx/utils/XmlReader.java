package com.badlogic.gdx.utils;

import com.badlogic.gdx.files.FileHandle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes.dex */
public class XmlReader {
    static final int xml_en_elementBody = 15;
    static final int xml_en_main = 1;
    static final int xml_error = 0;
    static final int xml_first_final = 34;
    static final int xml_start = 1;
    private Element current;
    private String entitiesText;
    private Element root;
    private static final byte[] _xml_actions = init__xml_actions_0();
    private static final byte[] _xml_key_offsets = init__xml_key_offsets_0();
    private static final char[] _xml_trans_keys = init__xml_trans_keys_0();
    private static final byte[] _xml_single_lengths = init__xml_single_lengths_0();
    private static final byte[] _xml_range_lengths = init__xml_range_lengths_0();
    private static final short[] _xml_index_offsets = init__xml_index_offsets_0();
    private static final byte[] _xml_indicies = init__xml_indicies_0();
    private static final byte[] _xml_trans_targs = init__xml_trans_targs_0();
    private static final byte[] _xml_trans_actions = init__xml_trans_actions_0();
    private final Array<Element> elements = new Array<>(8);
    private final StringBuilder textBuffer = new StringBuilder(64);

    public static class Element {
        private ObjectMap<String, String> attributes;
        private Array<Element> children;
        private final String name;
        private Element parent;
        private String text;

        public Element(String str, Element element) {
            this.name = str;
            this.parent = element;
        }

        public void addChild(Element element) {
            if (this.children == null) {
                this.children = new Array<>(8);
            }
            this.children.add(element);
        }

        public String get(String str) {
            String str2 = get(str, null);
            if (str2 != null) {
                return str2;
            }
            throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute or child: ", str));
        }

        public String getAttribute(String str) {
            ObjectMap<String, String> objectMap = this.attributes;
            if (objectMap == null) {
                throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute: ", str));
            }
            String str2 = objectMap.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute: ", str));
        }

        public ObjectMap<String, String> getAttributes() {
            return this.attributes;
        }

        public boolean getBoolean(String str) {
            String str2 = get(str, null);
            if (str2 != null) {
                return Boolean.parseBoolean(str2);
            }
            throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute or child: ", str));
        }

        public boolean getBooleanAttribute(String str) {
            return Boolean.parseBoolean(getAttribute(str));
        }

        public Element getChild(int i) {
            Array<Element> array = this.children;
            if (array != null) {
                return array.get(i);
            }
            throw new GdxRuntimeException("Element has no children: " + this.name);
        }

        @Null
        public Element getChildByName(String str) {
            if (this.children == null) {
                return null;
            }
            int i = 0;
            while (true) {
                Array<Element> array = this.children;
                if (i >= array.size) {
                    return null;
                }
                Element element = array.get(i);
                if (element.name.equals(str)) {
                    return element;
                }
                i++;
            }
        }

        @Null
        public Element getChildByNameRecursive(String str) {
            if (this.children == null) {
                return null;
            }
            int i = 0;
            while (true) {
                Array<Element> array = this.children;
                if (i >= array.size) {
                    return null;
                }
                Element element = array.get(i);
                if (element.name.equals(str)) {
                    return element;
                }
                Element childByNameRecursive = element.getChildByNameRecursive(str);
                if (childByNameRecursive != null) {
                    return childByNameRecursive;
                }
                i++;
            }
        }

        public int getChildCount() {
            Array<Element> array = this.children;
            if (array == null) {
                return 0;
            }
            return array.size;
        }

        public Array<Element> getChildren() {
            return this.children;
        }

        public Array<Element> getChildrenByName(String str) {
            Array<Element> array = new Array<>();
            if (this.children == null) {
                return array;
            }
            int i = 0;
            while (true) {
                Array<Element> array2 = this.children;
                if (i >= array2.size) {
                    return array;
                }
                Element element = array2.get(i);
                if (element.name.equals(str)) {
                    array.add(element);
                }
                i++;
            }
        }

        public Array<Element> getChildrenByNameRecursively(String str) {
            Array<Element> array = new Array<>();
            getChildrenByNameRecursively(str, array);
            return array;
        }

        public float getFloat(String str) {
            String str2 = get(str, null);
            if (str2 != null) {
                return Float.parseFloat(str2);
            }
            throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute or child: ", str));
        }

        public float getFloatAttribute(String str) {
            return Float.parseFloat(getAttribute(str));
        }

        public int getInt(String str) {
            String str2 = get(str, null);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
            throw new GdxRuntimeException(AbstractC5044xl.p(new java.lang.StringBuilder("Element "), this.name, " doesn't have attribute or child: ", str));
        }

        public int getIntAttribute(String str) {
            return Integer.parseInt(getAttribute(str));
        }

        public String getName() {
            return this.name;
        }

        public Element getParent() {
            return this.parent;
        }

        public String getText() {
            return this.text;
        }

        public boolean hasAttribute(String str) {
            ObjectMap<String, String> objectMap = this.attributes;
            if (objectMap == null) {
                return false;
            }
            return objectMap.containsKey(str);
        }

        public boolean hasChild(String str) {
            return (this.children == null || getChildByName(str) == null) ? false : true;
        }

        public boolean hasChildRecursive(String str) {
            return (this.children == null || getChildByNameRecursive(str) == null) ? false : true;
        }

        public void remove() {
            this.parent.removeChild(this);
        }

        public void removeChild(int i) {
            Array<Element> array = this.children;
            if (array != null) {
                array.removeIndex(i);
            }
        }

        public void replaceChild(Element element, Element element2) {
            Array<Element> array = this.children;
            if (array == null) {
                throw new GdxRuntimeException("Element has no children: " + this.name);
            }
            if (array.replaceFirst(element, true, element2)) {
                return;
            }
            throw new GdxRuntimeException("Element '" + this.name + "' does not contain child: " + element);
        }

        public void setAttribute(String str, String str2) {
            if (this.attributes == null) {
                this.attributes = new ObjectMap<>(8);
            }
            this.attributes.put(str, str2);
        }

        public void setText(String str) {
            this.text = str;
        }

        public String toString() {
            return toString("");
        }

        public boolean getBooleanAttribute(String str, boolean z) {
            String attribute = getAttribute(str, null);
            return attribute == null ? z : Boolean.parseBoolean(attribute);
        }

        public float getFloatAttribute(String str, float f) {
            String attribute = getAttribute(str, null);
            return attribute == null ? f : Float.parseFloat(attribute);
        }

        public int getIntAttribute(String str, int i) {
            String attribute = getAttribute(str, null);
            return attribute == null ? i : Integer.parseInt(attribute);
        }

        public void removeChild(Element element) {
            Array<Element> array = this.children;
            if (array != null) {
                array.removeValue(element, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public String toString(String str) {
            String str2;
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append(str);
            stringBuilder.append('<');
            stringBuilder.append(this.name);
            ObjectMap<String, String> objectMap = this.attributes;
            if (objectMap != null) {
                ObjectMap.Entries<String, String> it = objectMap.entries().iterator();
                while (it.hasNext()) {
                    ObjectMap.Entry next = it.next();
                    stringBuilder.append(' ');
                    stringBuilder.append((String) next.key);
                    stringBuilder.append("=\"");
                    stringBuilder.append((String) next.value);
                    stringBuilder.append('\"');
                }
            }
            if (this.children == null && ((str2 = this.text) == null || str2.length() == 0)) {
                stringBuilder.append("/>");
            } else {
                stringBuilder.append(">\n");
                String str3 = str + '\t';
                String str4 = this.text;
                if (str4 != null && str4.length() > 0) {
                    stringBuilder.append(str3);
                    stringBuilder.append(this.text);
                    stringBuilder.append('\n');
                }
                Array<Element> array = this.children;
                if (array != null) {
                    Array.ArrayIterator<Element> it2 = array.iterator();
                    while (it2.hasNext()) {
                        stringBuilder.append(it2.next().toString(str3));
                        stringBuilder.append('\n');
                    }
                }
                stringBuilder.append(str);
                stringBuilder.append("</");
                stringBuilder.append(this.name);
                stringBuilder.append('>');
            }
            return stringBuilder.toString();
        }

        private void getChildrenByNameRecursively(String str, Array<Element> array) {
            if (this.children == null) {
                return;
            }
            int i = 0;
            while (true) {
                Array<Element> array2 = this.children;
                if (i >= array2.size) {
                    return;
                }
                Element element = array2.get(i);
                if (element.name.equals(str)) {
                    array.add(element);
                }
                element.getChildrenByNameRecursively(str, array);
                i++;
            }
        }

        public String get(String str, String str2) {
            String text;
            String str3;
            ObjectMap<String, String> objectMap = this.attributes;
            if (objectMap != null && (str3 = objectMap.get(str)) != null) {
                return str3;
            }
            Element childByName = getChildByName(str);
            return (childByName == null || (text = childByName.getText()) == null) ? str2 : text;
        }

        public boolean getBoolean(String str, boolean z) {
            String str2 = get(str, null);
            return str2 == null ? z : Boolean.parseBoolean(str2);
        }

        public float getFloat(String str, float f) {
            String str2 = get(str, null);
            return str2 == null ? f : Float.parseFloat(str2);
        }

        public int getInt(String str, int i) {
            String str2 = get(str, null);
            return str2 == null ? i : Integer.parseInt(str2);
        }

        public String getAttribute(String str, String str2) {
            String str3;
            ObjectMap<String, String> objectMap = this.attributes;
            return (objectMap == null || (str3 = objectMap.get(str)) == null) ? str2 : str3;
        }
    }

    private static byte[] init__xml_actions_0() {
        return new byte[]{0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 2, 1, 4, 2, 2, 4, 2, 6, 7, 2, 6, 8, 3, 0, 6, 7};
    }

    private static short[] init__xml_index_offsets_0() {
        return new short[]{0, 0, 4, 9, 14, 20, 26, 30, 35, 37, 39, 44, 48, 52, 54, 56, 60, 62, 67, 72, 78, 84, 88, 93, 95, 97, 102, 106, 110, 112, 116, 118, 120, 122, 124, 127};
    }

    private static byte[] init__xml_indicies_0() {
        return new byte[]{0, 2, 0, 1, 2, 1, 1, 2, 3, 5, 6, 7, 5, 4, 9, 10, 1, 11, 9, 8, cw.k, 1, cw.l, 1, cw.k, 12, cw.m, cw.n, cw.m, 1, cw.n, 17, 18, cw.n, 1, 20, 19, 22, 21, 9, 10, 11, 9, 1, 23, 24, 23, 1, 25, 11, 25, 1, 20, 26, 22, 27, 29, 30, 29, 28, 32, 31, 30, 34, 1, 30, 33, 36, 37, 38, 36, 35, 40, 41, 1, 42, 40, 39, 44, 1, 45, 1, 44, 43, 46, 47, 46, 1, 47, 48, 49, 47, 1, 51, 50, 53, 52, 40, 41, 42, 40, 1, 54, 55, 54, 1, 56, 42, 56, 1, 57, 1, 57, 34, 57, 1, 1, 58, 59, 58, 51, 60, 53, 61, 62, 62, 1, 1, 0};
    }

    private static byte[] init__xml_key_offsets_0() {
        return new byte[]{0, 0, 4, 9, cw.l, 20, 26, 30, 35, 36, 37, 42, 46, 50, 51, 52, 56, 57, 62, 67, 73, 79, 83, 88, 89, 90, 95, 99, 103, 104, 108, 109, 110, 111, 112, 115};
    }

    private static byte[] init__xml_range_lengths_0() {
        return new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0};
    }

    private static byte[] init__xml_single_lengths_0() {
        return new byte[]{0, 2, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 1, 2, 1, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0};
    }

    private static byte[] init__xml_trans_actions_0() {
        return new byte[]{0, 0, 0, 1, 0, 3, 3, cw.k, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, 25, 0, 19, 5, cw.n, 0, 1, 0, 1, 0, 0, 0, 22, 1, 0, 0, 3, 3, cw.k, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, 25, 0, 19, 5, cw.n, 0, 0, 0, 7, 1, 0, 0};
    }

    private static char[] init__xml_trans_keys_0() {
        return new char[]{' ', '<', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', '>', '\t', '\r', ' ', '>', '\t', '\r', ' ', '>', '\t', '\r', '\'', '\'', ' ', '<', '\t', '\r', '<', ' ', '/', '>', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', '>', '\t', '\r', ' ', '>', '\t', '\r', ' ', '>', '\t', '\r', '<', ' ', '/', '\t', '\r', '>', '>', '\'', '\'', ' ', '\t', '\r', 0};
    }

    private static byte[] init__xml_trans_targs_0() {
        return new byte[]{1, 0, 2, 3, 3, 4, 11, 34, 5, 4, 11, 34, 5, 6, 7, 6, 7, 8, cw.k, 9, 10, 9, 10, 12, 34, 12, cw.l, cw.l, cw.n, cw.m, 17, cw.n, 17, 18, 30, 18, 19, 26, 28, 20, 19, 26, 28, 20, 21, 22, 21, 22, 23, 32, 24, 25, 24, 25, 27, 28, 27, 29, 31, 35, 33, 33, 34};
    }

    public void attribute(String str, String str2) {
        this.current.setAttribute(str, str2);
    }

    public void close() {
        this.root = this.elements.pop();
        Array<Element> array = this.elements;
        this.current = array.size > 0 ? array.peek() : null;
    }

    @Null
    public String entity(String str) {
        if (str.equals("lt")) {
            return "<";
        }
        if (str.equals("gt")) {
            return ">";
        }
        if (str.equals("amp")) {
            return "&";
        }
        if (str.equals("apos")) {
            return "'";
        }
        if (str.equals("quot")) {
            return "\"";
        }
        if (str.startsWith("#x")) {
            return Character.toString((char) Integer.parseInt(str.substring(2), 16));
        }
        return null;
    }

    public void open(String str) {
        Element element = new Element(str, this.current);
        Element element2 = this.current;
        if (element2 != null) {
            element2.addChild(element);
        }
        this.elements.add(element);
        this.current = element;
    }

    public Element parse(String str) {
        char[] charArray = str.toCharArray();
        return parse(charArray, 0, charArray.length);
    }

    public void text(String str) {
        String text = this.current.getText();
        Element element = this.current;
        if (text != null) {
            str = DM.h(text, str);
        }
        element.setText(str);
    }

    public Element parse(Reader reader) {
        try {
            try {
                char[] cArr = new char[1024];
                int i = 0;
                while (true) {
                    int i2 = reader.read(cArr, i, cArr.length - i);
                    if (i2 == -1) {
                        Element element = parse(cArr, 0, i);
                        StreamUtils.closeQuietly(reader);
                        return element;
                    }
                    if (i2 == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i += i2;
                    }
                    StreamUtils.closeQuietly(reader);
                    throw th;
                }
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(reader);
            throw th;
        }
    }

    public Element parse(InputStream inputStream) {
        try {
            try {
                Element element = parse(new InputStreamReader(inputStream, C.UTF8_NAME));
                StreamUtils.closeQuietly(inputStream);
                return element;
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    public Element parse(FileHandle fileHandle) {
        try {
            return parse(fileHandle.reader(C.UTF8_NAME));
        } catch (Exception e) {
            throw new SerializationException(AbstractC5044xl.k("Error parsing file: ", fileHandle), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x022f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8 A[LOOP:6: B:67:0x00ee->B:70:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x013e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00b0. Please report as an issue. */
    public Element parse(char[] cArr, int i, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        char[] cArr2;
        int i8;
        boolean z;
        int i9;
        int i10;
        String str2;
        String strEntity;
        int i11 = 1;
        int i12 = i;
        int i13 = 0;
        byte b = 1;
        int i14 = 0;
        String str3 = null;
        while (true) {
            boolean z2 = false;
            while (true) {
                char c2 = '\n';
                if (i13 != 0) {
                    if (i13 != i11) {
                        if (i13 != 2) {
                            str = null;
                        }
                    }
                    if (b == 0) {
                        i11 = 1;
                        i13 = 5;
                    } else {
                        i12++;
                        if (i12 != i2) {
                            i11 = 1;
                            i13 = 1;
                        } else {
                            str = null;
                        }
                    }
                } else if (i12 == i2) {
                    i13 = 4;
                } else if (b == 0) {
                    i13 = 5;
                }
                int i15 = _xml_key_offsets[b];
                short s = _xml_index_offsets[b];
                byte b2 = _xml_single_lengths[b];
                int i16 = s;
                if (b2 > 0) {
                    int i17 = i15 + b2;
                    int i18 = i15;
                    int i19 = i17 - 1;
                    while (true) {
                        if (i19 >= i18) {
                            int i20 = i18 + ((i19 - i18) >> 1);
                            char c3 = cArr[i12];
                            char c4 = _xml_trans_keys[i20];
                            if (c3 < c4) {
                                i19 = i20 - 1;
                            } else if (c3 > c4) {
                                i18 = i20 + 1;
                            } else {
                                i4 = (i20 - i15) + s;
                            }
                        } else {
                            i15 = i17;
                            i16 = s + b2;
                            i3 = _xml_range_lengths[b];
                            if (i3 > 0) {
                                i5 = ((i3 << 1) + i15) - 2;
                                i6 = i15;
                                while (i5 >= i6) {
                                    i7 = (((i5 - i6) >> i11) & (-2)) + i6;
                                    c = cArr[i12];
                                    cArr2 = _xml_trans_keys;
                                    if (c < cArr2[i7]) {
                                        i5 = i7 - 2;
                                    } else if (c > cArr2[i7 + 1]) {
                                        i6 = i7 + 2;
                                    } else {
                                        i3 = (i7 - i15) >> 1;
                                        i4 = i16 + i3;
                                    }
                                }
                                i4 = i16 + i3;
                            } else {
                                i4 = i16;
                            }
                        }
                    }
                } else {
                    i3 = _xml_range_lengths[b];
                    if (i3 > 0) {
                        i5 = ((i3 << 1) + i15) - 2;
                        i6 = i15;
                        while (i5 >= i6) {
                            i7 = (((i5 - i6) >> i11) & (-2)) + i6;
                            c = cArr[i12];
                            cArr2 = _xml_trans_keys;
                            if (c < cArr2[i7]) {
                                i5 = i7 - 2;
                            } else if (c > cArr2[i7 + 1]) {
                                i6 = i7 + 2;
                            } else {
                                i3 = (i7 - i15) >> 1;
                                i4 = i16 + i3;
                            }
                        }
                        i4 = i16 + i3;
                    } else {
                        i4 = i16;
                    }
                }
                byte b3 = _xml_indicies[i4];
                byte b4 = _xml_trans_targs[b3];
                byte b5 = _xml_trans_actions[b3];
                if (b5 != 0) {
                    int i21 = b5 + 1;
                    int i22 = _xml_actions[b5];
                    while (true) {
                        int i23 = i22 - 1;
                        if (i22 > 0) {
                            int i24 = i21 + 1;
                            byte b6 = _xml_actions[i21];
                            b = cw.m;
                            switch (b6) {
                                case 0:
                                    i14 = i12;
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                case 1:
                                    char c5 = cArr[i14];
                                    if (c5 != '?' && c5 != '!') {
                                        open(new String(cArr, i14, i12 - i14));
                                        z2 = true;
                                        i22 = i23;
                                        i21 = i24;
                                        c2 = '\n';
                                    } else {
                                        char c6 = cArr[i14 + 1];
                                        if (c6 == '[' && cArr[i14 + 2] == 'C' && cArr[i14 + 3] == 'D' && cArr[i14 + 4] == 'A' && cArr[i14 + 5] == 'T' && cArr[i14 + 6] == 'A' && cArr[i14 + 7] == '[') {
                                            int i25 = i14 + 8;
                                            int i26 = i14 + 10;
                                            while (true) {
                                                if (cArr[i26 - 2] == ']' && cArr[i26 - 1] == ']' && cArr[i26] == '>') {
                                                    text(new String(cArr, i25, (i26 - i25) - 2));
                                                    i12 = i26;
                                                    i14 = i25;
                                                } else {
                                                    i26++;
                                                }
                                            }
                                        } else if (c5 == '!' && c6 == '-' && cArr[i14 + 2] == '-') {
                                            int i27 = i14 + 3;
                                            while (true) {
                                                if (cArr[i27] == '-' && cArr[i27 + 1] == '-') {
                                                    int i28 = i27 + 2;
                                                    if (cArr[i28] == '>') {
                                                        i12 = i28;
                                                    }
                                                }
                                                i27++;
                                            }
                                        } else {
                                            while (cArr[i12] != '>') {
                                                i12++;
                                            }
                                        }
                                        i11 = 1;
                                        i13 = 2;
                                    }
                                    break;
                                case 2:
                                    close();
                                    i11 = 1;
                                    i13 = 2;
                                    break;
                                case 3:
                                    close();
                                    i11 = 1;
                                    i13 = 2;
                                    break;
                                case 4:
                                    if (z2) {
                                        i11 = 1;
                                        i13 = 2;
                                    }
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                case 5:
                                    str3 = new String(cArr, i14, i12 - i14);
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                case 6:
                                    for (int i29 = i12; i29 != i14; i29--) {
                                        char c7 = cArr[i29 - 1];
                                        if (c7 != '\t' && c7 != c2 && c7 != '\r' && c7 != ' ') {
                                            i8 = i14;
                                            z = false;
                                            while (i14 != i29) {
                                                i9 = i14 + 1;
                                                if (cArr[i14] != '&') {
                                                    i14 = i9;
                                                } else {
                                                    i14 = i9;
                                                    while (i14 != i29) {
                                                        i10 = i14 + 1;
                                                        if (cArr[i14] != ';') {
                                                            i14 = i10;
                                                        } else {
                                                            this.textBuffer.append(cArr, i8, (i9 - i8) - 1);
                                                            str2 = new String(cArr, i9, (i10 - i9) - 1);
                                                            strEntity = entity(str2);
                                                            StringBuilder stringBuilder = this.textBuffer;
                                                            if (strEntity != null) {
                                                                str2 = strEntity;
                                                            }
                                                            stringBuilder.append(str2);
                                                            i8 = i10;
                                                            i14 = i8;
                                                            z = true;
                                                        }
                                                    }
                                                }
                                            }
                                            if (z) {
                                                if (i8 < i29) {
                                                    this.textBuffer.append(cArr, i8, i29 - i8);
                                                }
                                                this.entitiesText = this.textBuffer.toString();
                                                this.textBuffer.setLength(0);
                                            } else {
                                                this.entitiesText = new String(cArr, i8, i29 - i8);
                                            }
                                            i14 = i8;
                                            i22 = i23;
                                            i21 = i24;
                                            c2 = '\n';
                                        }
                                        break;
                                    }
                                    i8 = i14;
                                    z = false;
                                    while (i14 != i29) {
                                        i9 = i14 + 1;
                                        if (cArr[i14] != '&') {
                                            i14 = i9;
                                        } else {
                                            i14 = i9;
                                            while (i14 != i29) {
                                                i10 = i14 + 1;
                                                if (cArr[i14] != ';') {
                                                    i14 = i10;
                                                } else {
                                                    this.textBuffer.append(cArr, i8, (i9 - i8) - 1);
                                                    str2 = new String(cArr, i9, (i10 - i9) - 1);
                                                    strEntity = entity(str2);
                                                    StringBuilder stringBuilder2 = this.textBuffer;
                                                    if (strEntity != null) {
                                                        str2 = strEntity;
                                                    }
                                                    stringBuilder2.append(str2);
                                                    i8 = i10;
                                                    i14 = i8;
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                    if (z) {
                                        if (i8 < i29) {
                                            this.textBuffer.append(cArr, i8, i29 - i8);
                                        }
                                        this.entitiesText = this.textBuffer.toString();
                                        this.textBuffer.setLength(0);
                                    } else {
                                        this.entitiesText = new String(cArr, i8, i29 - i8);
                                    }
                                    i14 = i8;
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                case 7:
                                    attribute(str3, this.entitiesText);
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                case 8:
                                    text(this.entitiesText);
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                                default:
                                    i22 = i23;
                                    i21 = i24;
                                    c2 = '\n';
                                    break;
                            }
                        }
                    }
                }
                b = b4;
                if (b == 0) {
                    i11 = 1;
                    i13 = 5;
                } else {
                    i12++;
                    if (i12 != i2) {
                        i11 = 1;
                        i13 = 1;
                    } else {
                        str = null;
                    }
                }
            }
        }
        this.entitiesText = str;
        if (i12 < i2) {
            int i30 = 1;
            for (int i31 = 0; i31 < i12; i31++) {
                if (cArr[i31] == '\n') {
                    i30++;
                }
            }
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("Error parsing XML on line ", i30, " near: ");
            sbQ.append(new String(cArr, i12, Math.min(32, i2 - i12)));
            throw new SerializationException(sbQ.toString());
        }
        Array<Element> array = this.elements;
        if (array.size == 0) {
            Element element = this.root;
            this.root = null;
            return element;
        }
        Element elementPeek = array.peek();
        this.elements.clear();
        throw new SerializationException("Error parsing XML, unclosed element: " + elementPeek.getName());
    }
}
