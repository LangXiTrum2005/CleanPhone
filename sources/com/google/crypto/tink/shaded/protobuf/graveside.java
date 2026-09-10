package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.graveside.saneness;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside<T extends saneness<T>> {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final graveside<?> f22202wireman = new graveside<>(true);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final treadless<T, Object> f22203attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f22204dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f22205saneness;

    /* JADX INFO: compiled from: FieldSet.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22206attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f22207saneness;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22207saneness = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22207saneness[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22207saneness[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22207saneness[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22207saneness[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22207saneness[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22207saneness[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22207saneness[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22207saneness[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22207saneness[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22207saneness[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22207saneness[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22207saneness[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22207saneness[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22207saneness[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22207saneness[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22207saneness[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22207saneness[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f22206attabal = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22206attabal[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22206attabal[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22206attabal[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22206attabal[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22206attabal[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22206attabal[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22206attabal[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22206attabal[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface saneness<T extends saneness<T>> extends Comparable<T> {
        privatdozent.attabal beachfront(privatdozent.attabal attabalVar, privatdozent privatdozentVar);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public graveside() {
        this.f22203attabal = treadless.graveside();
    }

    public static <T extends saneness<T>> boolean arytenoidectomy(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return monoploid(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!monoploid(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int beachfront(saneness<?> sanenessVar, Object obj) {
        WireFormat.FieldType liteType = sanenessVar.getLiteType();
        int number = sanenessVar.getNumber();
        if (!sanenessVar.isRepeated()) {
            return wireman(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!sanenessVar.isPacked()) {
            int iWireman = 0;
            while (i < size) {
                iWireman += wireman(liteType, number, list.get(i));
                i++;
            }
            return iWireman;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMarial = 0;
        while (i < size) {
            iMarial += marial(liteType, list.get(i));
            i++;
        }
        return CodedOutputStream.walach(number) + iMarial + CodedOutputStream.mathsort(iMarial);
    }

    public static Object dern(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends saneness<T>> graveside<T> gintrap() {
        return new graveside<>();
    }

    public static <T extends saneness<T>> graveside<T> impromptu() {
        return (graveside<T>) f22202wireman;
    }

    public static int marial(WireFormat.FieldType fieldType, Object obj) {
        switch (attabal.f22207saneness[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.apical(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.molybdenite(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.preprohormone(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.overspeculate(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.gintrap(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.monoploid(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.kowloon(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.beachfront(((Boolean) obj).booleanValue());
            case 9:
                return ((privatdozent) obj).getSerializedSize();
            case 10:
                return obj instanceof cuirassed ? CodedOutputStream.stratoscope((cuirassed) obj) : CodedOutputStream.sealless((privatdozent) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) obj) : CodedOutputStream.hydrovane((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) obj) : CodedOutputStream.competently((byte[]) obj);
            case 13:
                return CodedOutputStream.mathsort(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.merc(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.seminary(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.saran(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.creditor(((Long) obj).longValue());
            case 18:
                return obj instanceof rotuma.dern ? CodedOutputStream.impassible(((rotuma.dern) obj).getNumber()) : CodedOutputStream.impassible(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean monoploid(Object obj) {
        if (obj instanceof creditor) {
            return ((creditor) obj).isInitialized();
        }
        if (obj instanceof cuirassed) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean polloi(WireFormat.FieldType fieldType, Object obj) {
        rotuma.attabal(obj);
        switch (attabal.f22206attabal[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof rotuma.dern);
            case 9:
                return (obj instanceof privatdozent) || (obj instanceof cuirassed);
            default:
                return false;
        }
    }

    public static int wireman(WireFormat.FieldType fieldType, int i, Object obj) {
        int iWalach = CodedOutputStream.walach(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iWalach *= 2;
        }
        return iWalach + marial(fieldType, obj);
    }

    public void adultoid(graveside<T> gravesideVar) {
        int iTriweekly = gravesideVar.f22203attabal.triweekly();
        for (int i = 0; i < iTriweekly; i++) {
            dovishness(gravesideVar.f22203attabal.impassible(i));
        }
        Iterator it = gravesideVar.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            dovishness((Map.Entry) it.next());
        }
    }

    public final int apical(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return beachfront(key, value);
        }
        return value instanceof cuirassed ? CodedOutputStream.cord(entry.getKey().getNumber(), (cuirassed) value) : CodedOutputStream.oilcan(entry.getKey().getNumber(), (privatdozent) value);
    }

    public void attabal(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        preprohormone(t, obj);
        Object objTaiyuan = taiyuan(t);
        if (objTaiyuan == null) {
            arrayList = new ArrayList();
            this.f22203attabal.adultoid(t, arrayList);
        } else {
            arrayList = (List) objTaiyuan;
        }
        arrayList.add(obj);
    }

    public Iterator<Map.Entry<T, Object>> competently() {
        if (impassible()) {
            return Collections.emptyIterator();
        }
        return this.f22204dern ? new cuirassed.dern(this.f22203attabal.cutely().iterator()) : this.f22203attabal.cutely().iterator();
    }

    public int cutely() {
        int iTriweekly = this.f22203attabal.triweekly();
        int iApical = 0;
        for (int i = 0; i < iTriweekly; i++) {
            iApical += apical(this.f22203attabal.impassible(i));
        }
        Iterator it = this.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            iApical += apical((Map.Entry) it.next());
        }
        return iApical;
    }

    public final void dovishness(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof cuirassed;
        if (key.isRepeated()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objTaiyuan = taiyuan(key);
            List list = (List) value;
            int size = list.size();
            if (objTaiyuan == null) {
                objTaiyuan = new ArrayList(size);
            }
            List list2 = (List) objTaiyuan;
            for (int i = 0; i < size; i++) {
                list2.add(dern(list.get(i)));
            }
            this.f22203attabal.adultoid(key, objTaiyuan);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f22203attabal.adultoid(key, dern(value));
            return;
        }
        Object objTaiyuan2 = taiyuan(key);
        if (objTaiyuan2 == null) {
            this.f22203attabal.adultoid(key, dern(value));
            if (z) {
                this.f22204dern = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((cuirassed) value).beachfront();
        }
        this.f22203attabal.adultoid(key, key.beachfront(((privatdozent) objTaiyuan2).toBuilder(), (privatdozent) value).build());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof graveside) {
            return this.f22203attabal.equals(((graveside) obj).f22203attabal);
        }
        return false;
    }

    public int formularize() {
        int iTriweekly = this.f22203attabal.triweekly();
        int iBeachfront = 0;
        for (int i = 0; i < iTriweekly; i++) {
            Map.Entry<K, Object> entryImpassible = this.f22203attabal.impassible(i);
            iBeachfront += beachfront((saneness) entryImpassible.getKey(), entryImpassible.getValue());
        }
        Iterator it = this.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iBeachfront += beachfront((saneness) entry.getKey(), entry.getValue());
        }
        return iBeachfront;
    }

    public void graveside() {
        if (this.f22205saneness) {
            return;
        }
        int iTriweekly = this.f22203attabal.triweekly();
        for (int i = 0; i < iTriweekly; i++) {
            Object value = this.f22203attabal.impassible(i).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).cuirassed();
            }
        }
        Iterator it = this.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value2).cuirassed();
            }
        }
        this.f22203attabal.molybdenite();
        this.f22205saneness = true;
    }

    public int hashCode() {
        return this.f22203attabal.hashCode();
    }

    public boolean impassible() {
        return this.f22203attabal.isEmpty();
    }

    public boolean kowloon() {
        int iTriweekly = this.f22203attabal.triweekly();
        for (int i = 0; i < iTriweekly; i++) {
            if (!arytenoidectomy(this.f22203attabal.impassible(i))) {
                return false;
            }
        }
        Iterator it = this.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            if (!arytenoidectomy((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> molybdenite() {
        if (impassible()) {
            return Collections.emptyIterator();
        }
        return this.f22204dern ? new cuirassed.dern(this.f22203attabal.entrySet().iterator()) : this.f22203attabal.entrySet().iterator();
    }

    public final void preprohormone(T t, Object obj) {
        if (!polloi(t.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public void rotuma(T t, Object obj) {
        if (!t.isRepeated()) {
            preprohormone(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                preprohormone(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof cuirassed) {
            this.f22204dern = true;
        }
        this.f22203attabal.adultoid(t, obj);
    }

    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public graveside<T> clone() {
        graveside<T> gravesideVarGintrap = gintrap();
        int iTriweekly = this.f22203attabal.triweekly();
        for (int i = 0; i < iTriweekly; i++) {
            Map.Entry<K, Object> entryImpassible = this.f22203attabal.impassible(i);
            gravesideVarGintrap.rotuma((saneness) entryImpassible.getKey(), entryImpassible.getValue());
        }
        Iterator it = this.f22203attabal.arytenoidectomy().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            gravesideVarGintrap.rotuma((saneness) entry.getKey(), entry.getValue());
        }
        gravesideVarGintrap.f22204dern = this.f22204dern;
        return gravesideVarGintrap;
    }

    public Object taiyuan(T t) {
        Object obj = this.f22203attabal.get(t);
        return obj instanceof cuirassed ? ((cuirassed) obj).beachfront() : obj;
    }

    public boolean triweekly() {
        return this.f22205saneness;
    }

    public graveside(boolean z) {
        this(treadless.graveside());
        graveside();
    }

    public graveside(treadless<T, Object> treadlessVar) {
        this.f22203attabal = treadlessVar;
        graveside();
    }
}
