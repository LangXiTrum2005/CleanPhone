package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends arytenoidectomy<GeneratedMessageLite.wireman> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22251attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22251attabal = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22251attabal[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22251attabal[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22251attabal[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22251attabal[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22251attabal[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22251attabal[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22251attabal[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22251attabal[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22251attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22251attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22251attabal[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22251attabal[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22251attabal[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22251attabal[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22251attabal[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22251attabal[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22251attabal[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public int attabal(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.wireman) entry.getKey()).getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public void beachfront(Object obj) {
        dern(obj).graveside();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public <UT, UB> UB competently(Object obj, cultivated cultivatedVar, Object obj2, kowloon kowloonVar, graveside<GeneratedMessageLite.wireman> gravesideVar, UB ub, lerp<UT, UB> lerpVar) throws IOException {
        Object objValueOf;
        Object objTaiyuan;
        ArrayList arrayList;
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj2;
        int iDern = marialVar.dern();
        if (marialVar.f22132saneness.isRepeated() && marialVar.f22132saneness.isPacked()) {
            switch (attabal.f22251attabal[marialVar.attabal().ordinal()]) {
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
                    ub = (UB) milliradian.stratoscope(obj, iDern, arrayList, marialVar.f22132saneness.dern(), ub, lerpVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + marialVar.f22132saneness.getLiteType());
            }
            gravesideVar.rotuma(marialVar.f22132saneness, arrayList);
            return ub;
        }
        if (marialVar.attabal() != WireFormat.FieldType.ENUM) {
            switch (attabal.f22251attabal[marialVar.attabal().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(cultivatedVar.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(cultivatedVar.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(cultivatedVar.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(cultivatedVar.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(cultivatedVar.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(cultivatedVar.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(cultivatedVar.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(cultivatedVar.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(cultivatedVar.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(cultivatedVar.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(cultivatedVar.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(cultivatedVar.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(cultivatedVar.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = cultivatedVar.readBytes();
                    break;
                case 16:
                    objValueOf = cultivatedVar.readString();
                    break;
                case 17:
                    if (!marialVar.wireman()) {
                        Object objTaiyuan2 = gravesideVar.taiyuan(marialVar.f22132saneness);
                        if (objTaiyuan2 instanceof GeneratedMessageLite) {
                            premeiotic premeioticVarWireman = clubfoot.attabal().wireman(objTaiyuan2);
                            if (!((GeneratedMessageLite) objTaiyuan2).cord()) {
                                Object objNewInstance = premeioticVarWireman.newInstance();
                                premeioticVarWireman.mergeFrom(objNewInstance, objTaiyuan2);
                                gravesideVar.rotuma(marialVar.f22132saneness, objNewInstance);
                                objTaiyuan2 = objNewInstance;
                            }
                            cultivatedVar.attabal(objTaiyuan2, premeioticVarWireman, kowloonVar);
                            return ub;
                        }
                    }
                    objValueOf = cultivatedVar.saneness(marialVar.saneness().getClass(), kowloonVar);
                    break;
                case 18:
                    if (!marialVar.wireman()) {
                        Object objTaiyuan3 = gravesideVar.taiyuan(marialVar.f22132saneness);
                        if (objTaiyuan3 instanceof GeneratedMessageLite) {
                            premeiotic premeioticVarWireman2 = clubfoot.attabal().wireman(objTaiyuan3);
                            if (!((GeneratedMessageLite) objTaiyuan3).cord()) {
                                Object objNewInstance2 = premeioticVarWireman2.newInstance();
                                premeioticVarWireman2.mergeFrom(objNewInstance2, objTaiyuan3);
                                gravesideVar.rotuma(marialVar.f22132saneness, objNewInstance2);
                                objTaiyuan3 = objNewInstance2;
                            }
                            cultivatedVar.wireman(objTaiyuan3, premeioticVarWireman2, kowloonVar);
                            return ub;
                        }
                    }
                    objValueOf = cultivatedVar.beachfront(marialVar.saneness().getClass(), kowloonVar);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = cultivatedVar.readInt32();
            if (marialVar.f22132saneness.dern().findValueByNumber(int32) == null) {
                return (UB) milliradian.seminary(obj, iDern, int32, ub, lerpVar);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (marialVar.wireman()) {
            gravesideVar.attabal(marialVar.f22132saneness, objValueOf);
            return ub;
        }
        int i = attabal.f22251attabal[marialVar.attabal().ordinal()];
        if ((i == 17 || i == 18) && (objTaiyuan = gravesideVar.taiyuan(marialVar.f22132saneness)) != null) {
            objValueOf = rotuma.competently(objTaiyuan, objValueOf);
        }
        gravesideVar.rotuma(marialVar.f22132saneness, objValueOf);
        return ub;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public void cutely(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.wireman wiremanVar = (GeneratedMessageLite.wireman) entry.getKey();
        if (!wiremanVar.isRepeated()) {
            switch (attabal.f22251attabal[wiremanVar.getLiteType().ordinal()]) {
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
                    writer.wireman(wiremanVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.writeString(wiremanVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.saneness(wiremanVar.getNumber(), entry.getValue(), clubfoot.attabal().dern(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.marial(wiremanVar.getNumber(), entry.getValue(), clubfoot.attabal().dern(entry.getValue().getClass()));
                    break;
            }
        }
        switch (attabal.f22251attabal[wiremanVar.getLiteType().ordinal()]) {
            case 1:
                milliradian.starveling(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 2:
                milliradian.mathsort(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 3:
                milliradian.clubfoot(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 4:
                milliradian.itchy(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 5:
                milliradian.overspeculate(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 6:
                milliradian.peridotite(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 7:
                milliradian.walach(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 8:
                milliradian.privatdozent(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 9:
                milliradian.treadless(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 10:
                milliradian.permissivist(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 11:
                milliradian.cultivated(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 12:
                milliradian.premeiotic(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 13:
                milliradian.timberyard(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 14:
                milliradian.overspeculate(wiremanVar.getNumber(), (List) entry.getValue(), writer, wiremanVar.isPacked());
                break;
            case 15:
                milliradian.creditor(wiremanVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                milliradian.milliradian(wiremanVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    milliradian.splinterproof(wiremanVar.getNumber(), (List) entry.getValue(), writer, clubfoot.attabal().dern(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    milliradian.dent(wiremanVar.getNumber(), (List) entry.getValue(), writer, clubfoot.attabal().dern(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public graveside<GeneratedMessageLite.wireman> dern(Object obj) {
        return ((GeneratedMessageLite.dern) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public void impromptu(cultivated cultivatedVar, Object obj, kowloon kowloonVar, graveside<GeneratedMessageLite.wireman> gravesideVar) throws IOException {
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj;
        gravesideVar.rotuma(marialVar.f22132saneness, cultivatedVar.beachfront(marialVar.saneness().getClass(), kowloonVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public boolean marial(privatdozent privatdozentVar) {
        return privatdozentVar instanceof GeneratedMessageLite.dern;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public Object saneness(kowloon kowloonVar, privatdozent privatdozentVar, int i) {
        return kowloonVar.attabal(privatdozentVar, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public void taiyuan(ByteString byteString, Object obj, kowloon kowloonVar, graveside<GeneratedMessageLite.wireman> gravesideVar) throws IOException {
        GeneratedMessageLite.marial marialVar = (GeneratedMessageLite.marial) obj;
        privatdozent.attabal attabalVarNewBuilderForType = marialVar.saneness().newBuilderForType();
        taiyuan taiyuanVarNewCodedInput = byteString.newCodedInput();
        attabalVarNewBuilderForType.creditor(taiyuanVarNewCodedInput, kowloonVar);
        gravesideVar.rotuma(marialVar.f22132saneness, attabalVarNewBuilderForType.buildPartial());
        taiyuanVarNewCodedInput.attabal(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.arytenoidectomy
    public graveside<GeneratedMessageLite.wireman> wireman(Object obj) {
        return ((GeneratedMessageLite.dern) obj).starveling();
    }
}
