package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.molybdenite.saneness;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class molybdenite<T extends saneness<T>> {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final molybdenite<?> f9788wireman = new molybdenite<>(true);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final treadless<T, Object> f9789attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f9790dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f9791saneness;

    /* JADX INFO: compiled from: FieldSet.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9792attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f9793saneness;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9793saneness = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9793saneness[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9793saneness[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9793saneness[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9793saneness[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9793saneness[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9793saneness[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9793saneness[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9793saneness[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9793saneness[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9793saneness[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9793saneness[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9793saneness[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9793saneness[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9793saneness[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9793saneness[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9793saneness[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9793saneness[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f9792attabal = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9792attabal[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9792attabal[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9792attabal[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9792attabal[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9792attabal[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9792attabal[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9792attabal[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9792attabal[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface saneness<T extends saneness<T>> extends Comparable<T> {
        saran.attabal competently(saran.attabal attabalVar, saran saranVar);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public molybdenite() {
        this.f9789attabal = treadless.molybdenite();
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
        return CodedOutputStream.splinterproof(number) + iMarial + CodedOutputStream.clubfoot(iMarial);
    }

    public static void cuirassed(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.unconsolidated(i, (saran) obj);
        } else {
            codedOutputStream.licking(i, impassible(fieldType, false));
            stratoscope(codedOutputStream, fieldType, obj);
        }
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

    public static int impassible(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public static <T extends saneness<T>> molybdenite<T> impromptu() {
        return (molybdenite<T>) f9788wireman;
    }

    public static int marial(WireFormat.FieldType fieldType, Object obj) {
        switch (attabal.f9793saneness[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.apical(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.molybdenite(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.cord(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.permissivist(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.rotuma(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.monoploid(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.kowloon(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.beachfront(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.adultoid((saran) obj);
            case 10:
                return obj instanceof cord ? CodedOutputStream.trm((cord) obj) : CodedOutputStream.supplicat((saran) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) obj) : CodedOutputStream.mathsort((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) obj) : CodedOutputStream.competently((byte[]) obj);
            case 13:
                return CodedOutputStream.clubfoot(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.grimness(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.privatdozent(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.starveling(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.walach(((Long) obj).longValue());
            case 18:
                return obj instanceof gintrap.attabal ? CodedOutputStream.impassible(((gintrap.attabal) obj).getNumber()) : CodedOutputStream.impassible(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean molybdenite(WireFormat.FieldType fieldType, Object obj) {
        gintrap.attabal(obj);
        switch (attabal.f9792attabal[fieldType.getJavaType().ordinal()]) {
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
                return (obj instanceof Integer) || (obj instanceof gintrap.attabal);
            case 9:
                return (obj instanceof saran) || (obj instanceof cord);
            default:
                return false;
        }
    }

    public static <T extends saneness<T>> boolean monoploid(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return polloi(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!polloi(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean polloi(Object obj) {
        if (obj instanceof privatdozent) {
            return ((privatdozent) obj).isInitialized();
        }
        if (obj instanceof cord) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static <T extends saneness<T>> molybdenite<T> rotuma() {
        return new molybdenite<>();
    }

    public static void stratoscope(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (attabal.f9793saneness[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.wostteth(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.achondroplasia(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.vesuvio(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.pruinose(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.outmarry(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.monroe(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.palmyra(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.empress(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.hardpan((saran) obj);
                break;
            case 10:
                codedOutputStream.mastfed((saran) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.osteal((String) obj);
                } else {
                    codedOutputStream.underbelly((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.coi((byte[]) obj);
                } else {
                    codedOutputStream.underbelly((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.fastrack(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.libyan(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.molet(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.immediately(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.tectonization(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof gintrap.attabal)) {
                    codedOutputStream.gusty(((Integer) obj).intValue());
                } else {
                    codedOutputStream.gusty(((gintrap.attabal) obj).getNumber());
                }
                break;
        }
    }

    public static int wireman(WireFormat.FieldType fieldType, int i, Object obj) {
        int iSplinterproof = CodedOutputStream.splinterproof(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iSplinterproof *= 2;
        }
        return iSplinterproof + marial(fieldType, obj);
    }

    public void adultoid() {
        if (this.f9791saneness) {
            return;
        }
        int iImpassible = this.f9789attabal.impassible();
        for (int i = 0; i < iImpassible; i++) {
            Map.Entry<K, Object> entryFormularize = this.f9789attabal.formularize(i);
            if (entryFormularize.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryFormularize.getValue()).stratoscope();
            }
        }
        this.f9789attabal.polloi();
        this.f9791saneness = true;
    }

    public final int apical(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return beachfront(key, value);
        }
        return value instanceof cord ? CodedOutputStream.cuirassed(entry.getKey().getNumber(), (cord) value) : CodedOutputStream.yemenite(entry.getKey().getNumber(), (saran) value);
    }

    public boolean arytenoidectomy() {
        int iImpassible = this.f9789attabal.impassible();
        for (int i = 0; i < iImpassible; i++) {
            if (!monoploid(this.f9789attabal.formularize(i))) {
                return false;
            }
        }
        Iterator it = this.f9789attabal.kowloon().iterator();
        while (it.hasNext()) {
            if (!monoploid((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void attabal(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        cord(t, obj);
        Object objTaiyuan = taiyuan(t);
        if (objTaiyuan == null) {
            arrayList = new ArrayList();
            this.f9789attabal.graveside(t, arrayList);
        } else {
            arrayList = (List) objTaiyuan;
        }
        arrayList.add(obj);
    }

    public Iterator<Map.Entry<T, Object>> competently() {
        if (triweekly()) {
            return Collections.emptyIterator();
        }
        return this.f9790dern ? new cord.dern(this.f9789attabal.taiyuan().iterator()) : this.f9789attabal.taiyuan().iterator();
    }

    public final void cord(T t, Object obj) {
        if (!molybdenite(t.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public int cutely() {
        int iImpassible = this.f9789attabal.impassible();
        int iApical = 0;
        for (int i = 0; i < iImpassible; i++) {
            iApical += apical(this.f9789attabal.formularize(i));
        }
        Iterator it = this.f9789attabal.kowloon().iterator();
        while (it.hasNext()) {
            iApical += apical((Map.Entry) it.next());
        }
        return iApical;
    }

    public void dovishness(molybdenite<T> molybdeniteVar) {
        int iImpassible = molybdeniteVar.f9789attabal.impassible();
        for (int i = 0; i < iImpassible; i++) {
            gintrap(molybdeniteVar.f9789attabal.formularize(i));
        }
        Iterator it = molybdeniteVar.f9789attabal.kowloon().iterator();
        while (it.hasNext()) {
            gintrap((Map.Entry) it.next());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof molybdenite) {
            return this.f9789attabal.equals(((molybdenite) obj).f9789attabal);
        }
        return false;
    }

    public int formularize() {
        int iImpassible = this.f9789attabal.impassible();
        int iBeachfront = 0;
        for (int i = 0; i < iImpassible; i++) {
            Map.Entry<K, Object> entryFormularize = this.f9789attabal.formularize(i);
            iBeachfront += beachfront((saneness) entryFormularize.getKey(), entryFormularize.getValue());
        }
        Iterator it = this.f9789attabal.kowloon().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iBeachfront += beachfront((saneness) entry.getKey(), entry.getValue());
        }
        return iBeachfront;
    }

    public final void gintrap(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof cord;
        if (key.isRepeated()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objTaiyuan = taiyuan(key);
            if (objTaiyuan == null) {
                objTaiyuan = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objTaiyuan).add(dern(it.next()));
            }
            this.f9789attabal.graveside(key, objTaiyuan);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f9789attabal.graveside(key, dern(value));
            return;
        }
        Object objTaiyuan2 = taiyuan(key);
        if (objTaiyuan2 == null) {
            this.f9789attabal.graveside(key, dern(value));
            if (z) {
                this.f9790dern = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((cord) value).beachfront();
        }
        this.f9789attabal.graveside(key, key.competently(((saran) objTaiyuan2).toBuilder(), (saran) value).build());
    }

    public Iterator<Map.Entry<T, Object>> graveside() {
        if (triweekly()) {
            return Collections.emptyIterator();
        }
        return this.f9790dern ? new cord.dern(this.f9789attabal.entrySet().iterator()) : this.f9789attabal.entrySet().iterator();
    }

    public int hashCode() {
        return this.f9789attabal.hashCode();
    }

    public boolean kowloon() {
        return this.f9791saneness;
    }

    public void preprohormone(T t, Object obj) {
        if (!t.isRepeated()) {
            cord(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cord(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof cord) {
            this.f9790dern = true;
        }
        this.f9789attabal.graveside(t, obj);
    }

    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public molybdenite<T> clone() {
        molybdenite<T> molybdeniteVarRotuma = rotuma();
        int iImpassible = this.f9789attabal.impassible();
        for (int i = 0; i < iImpassible; i++) {
            Map.Entry<K, Object> entryFormularize = this.f9789attabal.formularize(i);
            molybdeniteVarRotuma.preprohormone((saneness) entryFormularize.getKey(), entryFormularize.getValue());
        }
        Iterator it = this.f9789attabal.kowloon().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            molybdeniteVarRotuma.preprohormone((saneness) entry.getKey(), entry.getValue());
        }
        molybdeniteVarRotuma.f9790dern = this.f9790dern;
        return molybdeniteVarRotuma;
    }

    public Object taiyuan(T t) {
        Object obj = this.f9789attabal.get(t);
        return obj instanceof cord ? ((cord) obj).beachfront() : obj;
    }

    public boolean triweekly() {
        return this.f9789attabal.isEmpty();
    }

    public molybdenite(boolean z) {
        this(treadless.molybdenite());
        adultoid();
    }

    public molybdenite(treadless<T, Object> treadlessVar) {
        this.f9789attabal = treadlessVar;
        adultoid();
    }
}
