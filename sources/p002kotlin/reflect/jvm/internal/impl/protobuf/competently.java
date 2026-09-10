package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes5.dex */
public final class competently<FieldDescriptorType extends saneness<FieldDescriptorType>> {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final competently f31107wireman = new competently(true);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f31110saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f31109dern = false;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final molybdenite<FieldDescriptorType, Object> f31108attabal = molybdenite.arytenoidectomy(16);

    /* JADX INFO: compiled from: FieldSet.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31111attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31112saneness;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f31112saneness = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31112saneness[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31112saneness[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31112saneness[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31112saneness[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31112saneness[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31112saneness[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31112saneness[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31112saneness[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31112saneness[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31112saneness[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31112saneness[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31112saneness[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31112saneness[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31112saneness[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31112saneness[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31112saneness[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31112saneness[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f31111attabal = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31111attabal[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31111attabal[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31111attabal[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31111attabal[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31111attabal[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31111attabal[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31111attabal[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31111attabal[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface saneness<T extends saneness<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        triweekly.attabal impromptu(triweekly.attabal attabalVar, triweekly triweeklyVar);

        boolean isPacked();

        boolean isRepeated();
    }

    public competently() {
    }

    public static Object adultoid(marial marialVar, WireFormat.FieldType fieldType, boolean z) throws IOException {
        switch (attabal.f31112saneness[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(marialVar.impassible());
            case 2:
                return Float.valueOf(marialVar.monoploid());
            case 3:
                return Long.valueOf(marialVar.graveside());
            case 4:
                return Long.valueOf(marialVar.grimness());
            case 5:
                return Integer.valueOf(marialVar.molybdenite());
            case 6:
                return Long.valueOf(marialVar.arytenoidectomy());
            case 7:
                return Integer.valueOf(marialVar.kowloon());
            case 8:
                return Boolean.valueOf(marialVar.apical());
            case 9:
                return z ? marialVar.merc() : marialVar.restrictive();
            case 10:
                return marialVar.formularize();
            case 11:
                return Integer.valueOf(marialVar.seminary());
            case 12:
                return Integer.valueOf(marialVar.yemenite());
            case 13:
                return Long.valueOf(marialVar.sealless());
            case 14:
                return Integer.valueOf(marialVar.kattegat());
            case 15:
                return Long.valueOf(marialVar.supplicat());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int beachfront(saneness<?> sanenessVar, Object obj) {
        WireFormat.FieldType liteType = sanenessVar.getLiteType();
        int number = sanenessVar.getNumber();
        if (!sanenessVar.isRepeated()) {
            return wireman(liteType, number, obj);
        }
        int iWireman = 0;
        if (sanenessVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iWireman += marial(liteType, it.next());
            }
            return CodedOutputStream.oilcan(number) + iWireman + CodedOutputStream.dovishness(iWireman);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iWireman += wireman(liteType, number, it2.next());
        }
        return iWireman;
    }

    public static <T extends saneness<T>> competently<T> competently() {
        return f31107wireman;
    }

    public static void cord(saneness<?> sanenessVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = sanenessVar.getLiteType();
        int number = sanenessVar.getNumber();
        if (!sanenessVar.isRepeated()) {
            if (obj instanceof taiyuan) {
                rotuma(codedOutputStream, liteType, number, ((taiyuan) obj).marial());
                return;
            } else {
                rotuma(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!sanenessVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rotuma(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.lightstruck(number, 2);
        Iterator it2 = list.iterator();
        int iMarial = 0;
        while (it2.hasNext()) {
            iMarial += marial(liteType, it2.next());
        }
        codedOutputStream.sensatory(iMarial);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            preprohormone(codedOutputStream, liteType, it3.next());
        }
    }

    public static int formularize(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static void gintrap(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (attabal.f31111attabal[fieldType.getJavaType().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof wireman) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof impromptu.attabal)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof triweekly) && !(obj instanceof taiyuan)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static <T extends saneness<T>> competently<T> graveside() {
        return new competently<>();
    }

    public static int marial(WireFormat.FieldType fieldType, Object obj) {
        switch (attabal.f31112saneness[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.competently(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.impassible(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.monoploid(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.sealless(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.arytenoidectomy(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.apical(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.cutely(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.saneness(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.trm((String) obj);
            case 10:
                return obj instanceof wireman ? CodedOutputStream.marial((wireman) obj) : CodedOutputStream.dern((byte[]) obj);
            case 11:
                return CodedOutputStream.yemenite(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.rotuma(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.preprohormone(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.cord(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.stratoscope(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.triweekly((triweekly) obj);
            case 17:
                return obj instanceof taiyuan ? CodedOutputStream.polloi((taiyuan) obj) : CodedOutputStream.graveside((triweekly) obj);
            case 18:
                return obj instanceof impromptu.attabal ? CodedOutputStream.taiyuan(((impromptu.attabal) obj).getNumber()) : CodedOutputStream.taiyuan(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void preprohormone(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (attabal.f31112saneness[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.hydrovane(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.clubfoot(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.timberyard(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.achondroplasia(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.premeiotic(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.splinterproof(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mathsort(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.grimness(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.palmyra((String) obj);
                break;
            case 10:
                if (!(obj instanceof wireman)) {
                    codedOutputStream.saran((byte[]) obj);
                } else {
                    codedOutputStream.creditor((wireman) obj);
                }
                break;
            case 11:
                codedOutputStream.julian(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.preterite(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.wostteth(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.igbo(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.picketboat(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.permissivist((triweekly) obj);
                break;
            case 17:
                codedOutputStream.treadless((triweekly) obj);
                break;
            case 18:
                if (!(obj instanceof impromptu.attabal)) {
                    codedOutputStream.peridotite(((Integer) obj).intValue());
                } else {
                    codedOutputStream.peridotite(((impromptu.attabal) obj).getNumber());
                }
                break;
        }
    }

    public static void rotuma(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.dent(i, (triweekly) obj);
        } else {
            codedOutputStream.lightstruck(i, formularize(fieldType, false));
            preprohormone(codedOutputStream, fieldType, obj);
        }
    }

    public static int wireman(WireFormat.FieldType fieldType, int i, Object obj) {
        int iOilcan = CodedOutputStream.oilcan(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iOilcan *= 2;
        }
        return iOilcan + marial(fieldType, obj);
    }

    public int apical() {
        int iBeachfront = 0;
        for (int i = 0; i < this.f31108attabal.cutely(); i++) {
            Map.Entry<K, Object> entryTaiyuan = this.f31108attabal.taiyuan(i);
            iBeachfront += beachfront((saneness) entryTaiyuan.getKey(), entryTaiyuan.getValue());
        }
        Iterator it = this.f31108attabal.formularize().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iBeachfront += beachfront((saneness) entry.getKey(), entry.getValue());
        }
        return iBeachfront;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> arytenoidectomy() {
        return this.f31109dern ? new taiyuan.dern(this.f31108attabal.entrySet().iterator()) : this.f31108attabal.entrySet().iterator();
    }

    public void attabal(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        gintrap(fielddescriptortype.getLiteType(), obj);
        Object objImpromptu = impromptu(fielddescriptortype);
        if (objImpromptu == null) {
            arrayList = new ArrayList();
            this.f31108attabal.monoploid(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objImpromptu;
        }
        arrayList.add(obj);
    }

    public int cutely(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objImpromptu = impromptu(fielddescriptortype);
        if (objImpromptu == null) {
            return 0;
        }
        return ((List) objImpromptu).size();
    }

    public final Object dern(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public void dovishness(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            gintrap(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gintrap(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof taiyuan) {
            this.f31109dern = true;
        }
        this.f31108attabal.monoploid(fielddescriptortype, obj);
    }

    public boolean impassible(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f31108attabal.get(fielddescriptortype) != null;
    }

    public Object impromptu(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f31108attabal.get(fielddescriptortype);
        return obj instanceof taiyuan ? ((taiyuan) obj).marial() : obj;
    }

    public final boolean kowloon(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((triweekly) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof triweekly)) {
                    if (value instanceof taiyuan) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((triweekly) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void molybdenite(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof taiyuan) {
            value = ((taiyuan) value).marial();
        }
        if (key.isRepeated()) {
            Object objImpromptu = impromptu(key);
            if (objImpromptu == null) {
                objImpromptu = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objImpromptu).add(dern(it.next()));
            }
            this.f31108attabal.monoploid(key, objImpromptu);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f31108attabal.monoploid(key, dern(value));
            return;
        }
        Object objImpromptu2 = impromptu(key);
        if (objImpromptu2 == null) {
            this.f31108attabal.monoploid(key, dern(value));
        } else {
            this.f31108attabal.monoploid(key, key.impromptu(((triweekly) objImpromptu2).toBuilder(), (triweekly) value).build());
        }
    }

    public void monoploid() {
        if (this.f31110saneness) {
            return;
        }
        this.f31108attabal.kowloon();
        this.f31110saneness = true;
    }

    public void polloi(competently<FieldDescriptorType> competentlyVar) {
        for (int i = 0; i < competentlyVar.f31108attabal.cutely(); i++) {
            molybdenite(competentlyVar.f31108attabal.taiyuan(i));
        }
        Iterator it = competentlyVar.f31108attabal.formularize().iterator();
        while (it.hasNext()) {
            molybdenite((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public competently<FieldDescriptorType> clone() {
        competently<FieldDescriptorType> competentlyVarGraveside = graveside();
        for (int i = 0; i < this.f31108attabal.cutely(); i++) {
            Map.Entry<K, Object> entryTaiyuan = this.f31108attabal.taiyuan(i);
            competentlyVarGraveside.dovishness((saneness) entryTaiyuan.getKey(), entryTaiyuan.getValue());
        }
        Iterator it = this.f31108attabal.formularize().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            competentlyVarGraveside.dovishness((saneness) entry.getKey(), entry.getValue());
        }
        competentlyVarGraveside.f31109dern = this.f31109dern;
        return competentlyVarGraveside;
    }

    public Object taiyuan(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objImpromptu = impromptu(fielddescriptortype);
        if (objImpromptu != null) {
            return ((List) objImpromptu).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean triweekly() {
        for (int i = 0; i < this.f31108attabal.cutely(); i++) {
            if (!kowloon(this.f31108attabal.taiyuan(i))) {
                return false;
            }
        }
        Iterator it = this.f31108attabal.formularize().iterator();
        while (it.hasNext()) {
            if (!kowloon((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public competently(boolean z) {
        monoploid();
    }
}
