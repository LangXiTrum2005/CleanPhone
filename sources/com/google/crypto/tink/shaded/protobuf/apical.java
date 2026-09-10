package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical implements Writer {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CodedOutputStream f22167attabal;

    /* JADX INFO: compiled from: CodedOutputStreamWriter.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22168attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22168attabal = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22168attabal[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22168attabal[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22168attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22168attabal[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22168attabal[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22168attabal[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22168attabal[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22168attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22168attabal[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22168attabal[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22168attabal[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public apical(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) rotuma.saneness(codedOutputStream, AgentOptions.OUTPUT);
        this.f22167attabal = codedOutputStream2;
        codedOutputStream2.f22111attabal = this;
    }

    public static apical competently(CodedOutputStream codedOutputStream) {
        apical apicalVar = codedOutputStream.f22111attabal;
        return apicalVar != null ? apicalVar : new apical(codedOutputStream);
    }

    public final void adultoid(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.lightstruck(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iGintrap = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iGintrap += CodedOutputStream.gintrap(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iGintrap);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.monroe(gintrapVar.getInt(i2));
            i2++;
        }
    }

    public final void apical(int i, formularize formularizeVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < formularizeVar.size()) {
                this.f22167attabal.sayid(i, formularizeVar.getDouble(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iApical = 0;
        for (int i3 = 0; i3 < formularizeVar.size(); i3++) {
            iApical += CodedOutputStream.apical(formularizeVar.getDouble(i3));
        }
        this.f22167attabal.libyan(iApical);
        while (i2 < formularizeVar.size()) {
            this.f22167attabal.empress(formularizeVar.getDouble(i2));
            i2++;
        }
    }

    public final void arytenoidectomy(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.sensatory(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iKowloon = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iKowloon += CodedOutputStream.kowloon(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iKowloon);
        while (i2 < list.size()) {
            this.f22167attabal.underbelly(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void attabal(int i, restrictive.attabal<K, V> attabalVar, Map<K, V> map) throws IOException {
        if (this.f22167attabal.premeiotic()) {
            cutely(i, attabalVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f22167attabal.homozygous(i, 2);
            this.f22167attabal.libyan(restrictive.saneness(attabalVar, entry.getKey(), entry.getValue()));
            restrictive.wireman(this.f22167attabal, attabalVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void beachfront(int i, List<?> list, premeiotic premeioticVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            saneness(i, list.get(i2), premeioticVar);
        }
    }

    public final void cord(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.hardpan(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMerc = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iMerc += CodedOutputStream.merc(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iMerc);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.herdbook(gintrapVar.getInt(i2));
            i2++;
        }
    }

    public final void cuirassed(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.hardpan(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMerc = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMerc += CodedOutputStream.merc(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iMerc);
        while (i2 < list.size()) {
            this.f22167attabal.herdbook(list.get(i2).intValue());
            i2++;
        }
    }

    public final <K, V> void cutely(int i, restrictive.attabal<K, V> attabalVar, Map<K, V> map) throws IOException {
        int[] iArr = attabal.f22168attabal;
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void dern(int i, List<?> list, premeiotic premeioticVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            marial(i, list.get(i2), premeioticVar);
        }
    }

    public final void dovishness(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.lightstruck(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iGintrap = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iGintrap += CodedOutputStream.gintrap(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iGintrap);
        while (i2 < list.size()) {
            this.f22167attabal.monroe(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public final void formularize(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.sayid(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iApical = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iApical += CodedOutputStream.apical(list.get(i3).doubleValue());
        }
        this.f22167attabal.libyan(iApical);
        while (i2 < list.size()) {
            this.f22167attabal.empress(list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void gintrap(int i, kattegat kattegatVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < kattegatVar.size()) {
                this.f22167attabal.julian(i, kattegatVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iPreprohormone = 0;
        for (int i3 = 0; i3 < kattegatVar.size(); i3++) {
            iPreprohormone += CodedOutputStream.preprohormone(kattegatVar.getLong(i3));
        }
        this.f22167attabal.libyan(iPreprohormone);
        while (i2 < kattegatVar.size()) {
            this.f22167attabal.achondroplasia(kattegatVar.getLong(i2));
            i2++;
        }
    }

    public final void graveside(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.igbo(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMolybdenite = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(list.get(i3).floatValue());
        }
        this.f22167attabal.libyan(iMolybdenite);
        while (i2 < list.size()) {
            this.f22167attabal.gusty(list.get(i2).floatValue());
            i2++;
        }
    }

    public final void impassible(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.coi(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iImpassible = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iImpassible += CodedOutputStream.impassible(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iImpassible);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.czestochowa(gintrapVar.getInt(i2));
            i2++;
        }
    }

    public final void impromptu(int i, beachfront beachfrontVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < beachfrontVar.size()) {
                this.f22167attabal.lerp(i, beachfrontVar.getBoolean(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iBeachfront = 0;
        for (int i3 = 0; i3 < beachfrontVar.size(); i3++) {
            iBeachfront += CodedOutputStream.beachfront(beachfrontVar.getBoolean(i3));
        }
        this.f22167attabal.libyan(iBeachfront);
        while (i2 < beachfrontVar.size()) {
            this.f22167attabal.nosophobia(beachfrontVar.getBoolean(i2));
            i2++;
        }
    }

    public final void kattegat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.setterwort(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iCreditor = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCreditor += CodedOutputStream.creditor(list.get(i3).longValue());
        }
        this.f22167attabal.libyan(iCreditor);
        while (i2 < list.size()) {
            this.f22167attabal.mastfed(list.get(i2).longValue());
            i2++;
        }
    }

    public final void kowloon(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.sensatory(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iKowloon = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iKowloon += CodedOutputStream.kowloon(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iKowloon);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.underbelly(gintrapVar.getInt(i2));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void marial(int i, Object obj, premeiotic premeioticVar) throws IOException {
        com.google.crypto.tink.shaded.protobuf.attabal attabalVar = (com.google.crypto.tink.shaded.protobuf.attabal) obj;
        this.f22167attabal.homozygous(i, 2);
        this.f22167attabal.libyan(attabalVar.dern(premeioticVar));
        premeioticVar.dern(attabalVar, this);
    }

    public final void merc(int i, kattegat kattegatVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < kattegatVar.size()) {
                this.f22167attabal.deadwork(i, kattegatVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iOverspeculate = 0;
        for (int i3 = 0; i3 < kattegatVar.size(); i3++) {
            iOverspeculate += CodedOutputStream.overspeculate(kattegatVar.getLong(i3));
        }
        this.f22167attabal.libyan(iOverspeculate);
        while (i2 < kattegatVar.size()) {
            this.f22167attabal.molet(kattegatVar.getLong(i2));
            i2++;
        }
    }

    public final void molybdenite(int i, adultoid adultoidVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < adultoidVar.size()) {
                this.f22167attabal.igbo(i, adultoidVar.getFloat(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMolybdenite = 0;
        for (int i3 = 0; i3 < adultoidVar.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(adultoidVar.getFloat(i3));
        }
        this.f22167attabal.libyan(iMolybdenite);
        while (i2 < adultoidVar.size()) {
            this.f22167attabal.gusty(adultoidVar.getFloat(i2));
            i2++;
        }
    }

    public final void monoploid(int i, kattegat kattegatVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < kattegatVar.size()) {
                this.f22167attabal.preterite(i, kattegatVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMonoploid = 0;
        for (int i3 = 0; i3 < kattegatVar.size(); i3++) {
            iMonoploid += CodedOutputStream.monoploid(kattegatVar.getLong(i3));
        }
        this.f22167attabal.libyan(iMonoploid);
        while (i2 < kattegatVar.size()) {
            this.f22167attabal.wostteth(kattegatVar.getLong(i2));
            i2++;
        }
    }

    public final void oilcan(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.dhss(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iSaran = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iSaran += CodedOutputStream.saran(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iSaran);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.vesuvio(gintrapVar.getInt(i2));
            i2++;
        }
    }

    public final void polder(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.deadwork(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iOverspeculate = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOverspeculate += CodedOutputStream.overspeculate(list.get(i3).longValue());
        }
        this.f22167attabal.libyan(iOverspeculate);
        while (i2 < list.size()) {
            this.f22167attabal.molet(list.get(i2).longValue());
            i2++;
        }
    }

    public final void polloi(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.preterite(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMonoploid = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMonoploid += CodedOutputStream.monoploid(list.get(i3).longValue());
        }
        this.f22167attabal.libyan(iMonoploid);
        while (i2 < list.size()) {
            this.f22167attabal.wostteth(list.get(i2).longValue());
            i2++;
        }
    }

    public final void preprohormone(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f22167attabal.attendance(i, (String) obj);
        } else {
            this.f22167attabal.lotta(i, (ByteString) obj);
        }
    }

    public void restrictive(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.lampshade(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMathsort = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMathsort += CodedOutputStream.mathsort(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iMathsort);
        while (i2 < list.size()) {
            this.f22167attabal.libyan(list.get(i2).intValue());
            i2++;
        }
    }

    public final void rotuma(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.julian(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iPreprohormone = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iPreprohormone += CodedOutputStream.preprohormone(list.get(i3).longValue());
        }
        this.f22167attabal.libyan(iPreprohormone);
        while (i2 < list.size()) {
            this.f22167attabal.achondroplasia(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void saneness(int i, Object obj, premeiotic premeioticVar) throws IOException {
        this.f22167attabal.picketboat(i, (privatdozent) obj, premeioticVar);
    }

    public final void sealless(int i, kattegat kattegatVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < kattegatVar.size()) {
                this.f22167attabal.setterwort(i, kattegatVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iCreditor = 0;
        for (int i3 = 0; i3 < kattegatVar.size(); i3++) {
            iCreditor += CodedOutputStream.creditor(kattegatVar.getLong(i3));
        }
        this.f22167attabal.libyan(iCreditor);
        while (i2 < kattegatVar.size()) {
            this.f22167attabal.mastfed(kattegatVar.getLong(i2));
            i2++;
        }
    }

    public final void stratoscope(int i, kattegat kattegatVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < kattegatVar.size()) {
                this.f22167attabal.technofreak(i, kattegatVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iSeminary = 0;
        for (int i3 = 0; i3 < kattegatVar.size(); i3++) {
            iSeminary += CodedOutputStream.seminary(kattegatVar.getLong(i3));
        }
        this.f22167attabal.libyan(iSeminary);
        while (i2 < kattegatVar.size()) {
            this.f22167attabal.outmarry(kattegatVar.getLong(i2));
            i2++;
        }
    }

    public final void supplicat(int i, gintrap gintrapVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gintrapVar.size()) {
                this.f22167attabal.lampshade(i, gintrapVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iMathsort = 0;
        for (int i3 = 0; i3 < gintrapVar.size(); i3++) {
            iMathsort += CodedOutputStream.mathsort(gintrapVar.getInt(i3));
        }
        this.f22167attabal.libyan(iMathsort);
        while (i2 < gintrapVar.size()) {
            this.f22167attabal.libyan(gintrapVar.getInt(i2));
            i2++;
        }
    }

    public final void taiyuan(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.lerp(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iBeachfront = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iBeachfront += CodedOutputStream.beachfront(list.get(i3).booleanValue());
        }
        this.f22167attabal.libyan(iBeachfront);
        while (i2 < list.size()) {
            this.f22167attabal.nosophobia(list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void triweekly(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.coi(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iImpassible = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iImpassible += CodedOutputStream.impassible(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iImpassible);
        while (i2 < list.size()) {
            this.f22167attabal.czestochowa(list.get(i2).intValue());
            i2++;
        }
    }

    public final void trm(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.technofreak(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iSeminary = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSeminary += CodedOutputStream.seminary(list.get(i3).longValue());
        }
        this.f22167attabal.libyan(iSeminary);
        while (i2 < list.size()) {
            this.f22167attabal.outmarry(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void wireman(int i, ByteString byteString) throws IOException {
        this.f22167attabal.lotta(i, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBool(int i, boolean z) throws IOException {
        this.f22167attabal.lerp(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof beachfront) {
            impromptu(i, (beachfront) list, z);
        } else {
            taiyuan(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytesList(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f22167attabal.lotta(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDouble(int i, double d) throws IOException {
        this.f22167attabal.sayid(i, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDoubleList(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof formularize) {
            apical(i, (formularize) list, z);
        } else {
            formularize(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i) throws IOException {
        this.f22167attabal.homozygous(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnum(int i, int i2) throws IOException {
        this.f22167attabal.coi(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnumList(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            impassible(i, (gintrap) list, z);
        } else {
            triweekly(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32(int i, int i2) throws IOException {
        this.f22167attabal.sensatory(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            kowloon(i, (gintrap) list, z);
        } else {
            arytenoidectomy(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64(int i, long j) throws IOException {
        this.f22167attabal.preterite(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof kattegat) {
            monoploid(i, (kattegat) list, z);
        } else {
            polloi(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloat(int i, float f) throws IOException {
        this.f22167attabal.igbo(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloatList(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof adultoid) {
            molybdenite(i, (adultoid) list, z);
        } else {
            graveside(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32(int i, int i2) throws IOException {
        this.f22167attabal.lightstruck(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            adultoid(i, (gintrap) list, z);
        } else {
            dovishness(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64(int i, long j) throws IOException {
        this.f22167attabal.julian(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof kattegat) {
            gintrap(i, (kattegat) list, z);
        } else {
            rotuma(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f22167attabal.claque(i, (ByteString) obj);
        } else {
            this.f22167attabal.unconsolidated(i, (privatdozent) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32(int i, int i2) throws IOException {
        this.f22167attabal.hardpan(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            cord(i, (gintrap) list, z);
        } else {
            cuirassed(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64(int i, long j) throws IOException {
        this.f22167attabal.technofreak(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof kattegat) {
            stratoscope(i, (kattegat) list, z);
        } else {
            trm(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32(int i, int i2) throws IOException {
        this.f22167attabal.dhss(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            oilcan(i, (gintrap) list, z);
        } else {
            yemenite(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64(int i, long j) throws IOException {
        this.f22167attabal.setterwort(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof kattegat) {
            sealless(i, (kattegat) list, z);
        } else {
            kattegat(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i) throws IOException {
        this.f22167attabal.homozygous(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeString(int i, String str) throws IOException {
        this.f22167attabal.attendance(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStringList(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof trm)) {
            while (i2 < list.size()) {
                this.f22167attabal.attendance(i, list.get(i2));
                i2++;
            }
        } else {
            trm trmVar = (trm) list;
            while (i2 < list.size()) {
                preprohormone(i, trmVar.getRaw(i2));
                i2++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32(int i, int i2) throws IOException {
        this.f22167attabal.lampshade(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof gintrap) {
            supplicat(i, (gintrap) list, z);
        } else {
            restrictive(i, list, z);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64(int i, long j) throws IOException {
        this.f22167attabal.deadwork(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof kattegat) {
            merc(i, (kattegat) list, z);
        } else {
            polder(i, list, z);
        }
    }

    public void yemenite(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f22167attabal.dhss(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f22167attabal.homozygous(i, 2);
        int iSaran = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSaran += CodedOutputStream.saran(list.get(i3).intValue());
        }
        this.f22167attabal.libyan(iSaran);
        while (i2 < list.size()) {
            this.f22167attabal.vesuvio(list.get(i2).intValue());
            i2++;
        }
    }
}
