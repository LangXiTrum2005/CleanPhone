package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy extends kowloon<GeneratedMessageLite.wireman> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9689attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9689attabal = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9689attabal[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9689attabal[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9689attabal[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9689attabal[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9689attabal[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9689attabal[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9689attabal[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9689attabal[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9689attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9689attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9689attabal[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9689attabal[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9689attabal[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9689attabal[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9689attabal[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9689attabal[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9689attabal[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public int attabal(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.wireman) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public void beachfront(Object obj) {
        dern(obj).adultoid();
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public <UT, UB> UB competently(Object obj, cultivated cultivatedVar, Object obj2, triweekly triweeklyVar, molybdenite<GeneratedMessageLite.wireman> molybdeniteVar, UB ub, lerp<UT, UB> lerpVar) throws IOException {
        Object objTaiyuan;
        ArrayList arrayList;
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj2;
        int iDern = marialVar.dern();
        if (marialVar.f9658saneness.isRepeated() && marialVar.f9658saneness.isPacked()) {
            switch (attabal.f9689attabal[marialVar.attabal().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    cultivatedVar.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    cultivatedVar.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    cultivatedVar.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    cultivatedVar.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    cultivatedVar.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    cultivatedVar.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    cultivatedVar.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    cultivatedVar.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    cultivatedVar.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    cultivatedVar.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    cultivatedVar.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    cultivatedVar.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    cultivatedVar.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    cultivatedVar.readEnumList(arrayList);
                    marialVar.f9658saneness.dern();
                    ub = (UB) milliradian.cord(obj, iDern, arrayList, null, ub, lerpVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + marialVar.f9658saneness.getLiteType());
            }
            molybdeniteVar.preprohormone(marialVar.f9658saneness, arrayList);
            return ub;
        }
        Object objCompetently = null;
        if (marialVar.attabal() == WireFormat.FieldType.ENUM) {
            cultivatedVar.readInt32();
            marialVar.f9658saneness.dern();
            throw null;
        }
        int[] iArr = attabal.f9689attabal;
        switch (iArr[marialVar.attabal().ordinal()]) {
            case 1:
                objCompetently = Double.valueOf(cultivatedVar.readDouble());
                break;
            case 2:
                objCompetently = Float.valueOf(cultivatedVar.readFloat());
                break;
            case 3:
                objCompetently = Long.valueOf(cultivatedVar.readInt64());
                break;
            case 4:
                objCompetently = Long.valueOf(cultivatedVar.readUInt64());
                break;
            case 5:
                objCompetently = Integer.valueOf(cultivatedVar.readInt32());
                break;
            case 6:
                objCompetently = Long.valueOf(cultivatedVar.readFixed64());
                break;
            case 7:
                objCompetently = Integer.valueOf(cultivatedVar.readFixed32());
                break;
            case 8:
                objCompetently = Boolean.valueOf(cultivatedVar.readBool());
                break;
            case 9:
                objCompetently = Integer.valueOf(cultivatedVar.readUInt32());
                break;
            case 10:
                objCompetently = Integer.valueOf(cultivatedVar.readSFixed32());
                break;
            case 11:
                objCompetently = Long.valueOf(cultivatedVar.readSFixed64());
                break;
            case 12:
                objCompetently = Integer.valueOf(cultivatedVar.readSInt32());
                break;
            case 13:
                objCompetently = Long.valueOf(cultivatedVar.readSInt64());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objCompetently = cultivatedVar.readBytes();
                break;
            case 16:
                objCompetently = cultivatedVar.readString();
                break;
            case 17:
                if (!marialVar.wireman()) {
                    Object objTaiyuan2 = molybdeniteVar.taiyuan(marialVar.f9658saneness);
                    if (objTaiyuan2 instanceof GeneratedMessageLite) {
                        premeiotic premeioticVarWireman = clubfoot.attabal().wireman(objTaiyuan2);
                        if (!((GeneratedMessageLite) objTaiyuan2).cuirassed()) {
                            Object objNewInstance = premeioticVarWireman.newInstance();
                            premeioticVarWireman.mergeFrom(objNewInstance, objTaiyuan2);
                            molybdeniteVar.preprohormone(marialVar.f9658saneness, objNewInstance);
                            objTaiyuan2 = objNewInstance;
                        }
                        cultivatedVar.beachfront(objTaiyuan2, premeioticVarWireman, triweeklyVar);
                        return ub;
                    }
                }
                objCompetently = cultivatedVar.wireman(marialVar.saneness().getClass(), triweeklyVar);
                break;
            case 18:
                if (!marialVar.wireman()) {
                    Object objTaiyuan3 = molybdeniteVar.taiyuan(marialVar.f9658saneness);
                    if (objTaiyuan3 instanceof GeneratedMessageLite) {
                        premeiotic premeioticVarWireman2 = clubfoot.attabal().wireman(objTaiyuan3);
                        if (!((GeneratedMessageLite) objTaiyuan3).cuirassed()) {
                            Object objNewInstance2 = premeioticVarWireman2.newInstance();
                            premeioticVarWireman2.mergeFrom(objNewInstance2, objTaiyuan3);
                            molybdeniteVar.preprohormone(marialVar.f9658saneness, objNewInstance2);
                            objTaiyuan3 = objNewInstance2;
                        }
                        cultivatedVar.attabal(objTaiyuan3, premeioticVarWireman2, triweeklyVar);
                        return ub;
                    }
                }
                objCompetently = cultivatedVar.dern(marialVar.saneness().getClass(), triweeklyVar);
                break;
        }
        if (marialVar.wireman()) {
            molybdeniteVar.attabal(marialVar.f9658saneness, objCompetently);
            return ub;
        }
        int i = iArr[marialVar.attabal().ordinal()];
        if ((i == 17 || i == 18) && (objTaiyuan = molybdeniteVar.taiyuan(marialVar.f9658saneness)) != null) {
            objCompetently = gintrap.competently(objTaiyuan, objCompetently);
        }
        molybdeniteVar.preprohormone(marialVar.f9658saneness, objCompetently);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public void cutely(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.wireman wiremanVar = (GeneratedMessageLite.wireman) entry.getKey();
        if (!wiremanVar.isRepeated()) {
            switch (attabal.f9689attabal[wiremanVar.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(wiremanVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(wiremanVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(wiremanVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(wiremanVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(wiremanVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(wiremanVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(wiremanVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(wiremanVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(wiremanVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.saneness(wiremanVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.writeString(wiremanVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.marial(wiremanVar.getNumber(), entry.getValue(), clubfoot.attabal().dern(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.dern(wiremanVar.getNumber(), entry.getValue(), clubfoot.attabal().dern(entry.getValue().getClass()));
                    break;
            }
        }
        switch (attabal.f9689attabal[wiremanVar.getLiteType().ordinal()]) {
            case 1:
                milliradian.privatdozent(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 2:
                milliradian.walach(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 3:
                milliradian.splinterproof(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 4:
                milliradian.milliradian(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 5:
                milliradian.mathsort(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 6:
                milliradian.hydrovane(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 7:
                milliradian.starveling(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 8:
                milliradian.grimness(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 9:
                milliradian.timberyard(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 10:
                milliradian.clubfoot(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 11:
                milliradian.dent(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 12:
                milliradian.permissivist(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 13:
                milliradian.cultivated(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 14:
                milliradian.mathsort(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 15:
                milliradian.saran(wiremanVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                milliradian.premeiotic(wiremanVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    milliradian.peridotite(wiremanVar.getNumber(), (List) entry.getValue(), writer, clubfoot.attabal().dern(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    milliradian.overspeculate(wiremanVar.getNumber(), (List) entry.getValue(), writer, clubfoot.attabal().dern(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public molybdenite<GeneratedMessageLite.wireman> dern(Object obj) {
        return ((GeneratedMessageLite.dern) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public void impromptu(cultivated cultivatedVar, Object obj, triweekly triweeklyVar, molybdenite<GeneratedMessageLite.wireman> molybdeniteVar) throws IOException {
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj;
        molybdeniteVar.preprohormone(marialVar.f9658saneness, cultivatedVar.dern(marialVar.saneness().getClass(), triweeklyVar));
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public boolean marial(saran saranVar) {
        return saranVar instanceof GeneratedMessageLite.dern;
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public Object saneness(triweekly triweeklyVar, saran saranVar, int i) {
        return triweeklyVar.attabal(saranVar, i);
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public void taiyuan(ByteString byteString, Object obj, triweekly triweeklyVar, molybdenite<GeneratedMessageLite.wireman> molybdeniteVar) throws IOException {
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj;
        saran.attabal attabalVarNewBuilderForType = marialVar.saneness().newBuilderForType();
        impromptu impromptuVarNewCodedInput = byteString.newCodedInput();
        attabalVarNewBuilderForType.kattegat(impromptuVarNewCodedInput, triweeklyVar);
        molybdeniteVar.preprohormone(marialVar.f9658saneness, attabalVarNewBuilderForType.buildPartial());
        impromptuVarNewCodedInput.attabal(0);
    }

    @Override // androidx.datastore.preferences.protobuf.kowloon
    public molybdenite<GeneratedMessageLite.wireman> wireman(Object obj) {
        return ((GeneratedMessageLite.dern) obj).saran();
    }
}
