package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely implements Writer {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CodedOutputStream f9705attabal;

    /* JADX INFO: compiled from: CodedOutputStreamWriter.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9706attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9706attabal = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9706attabal[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9706attabal[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9706attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9706attabal[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9706attabal[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9706attabal[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9706attabal[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9706attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9706attabal[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9706attabal[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9706attabal[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public cutely(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) gintrap.saneness(codedOutputStream, AgentOptions.OUTPUT);
        this.f9705attabal = codedOutputStream2;
        codedOutputStream2.f9636attabal = this;
    }

    public static cutely competently(CodedOutputStream codedOutputStream) {
        cutely cutelyVar = codedOutputStream.f9636attabal;
        return cutelyVar != null ? cutelyVar : new cutely(codedOutputStream);
    }

    public final void adultoid(int i, sealless seallessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < seallessVar.size()) {
                this.f9705attabal.lightstruck(i, seallessVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iMonoploid = 0;
        for (int i3 = 0; i3 < seallessVar.size(); i3++) {
            iMonoploid += CodedOutputStream.monoploid(seallessVar.getLong(i3));
        }
        this.f9705attabal.fastrack(iMonoploid);
        while (i2 < seallessVar.size()) {
            this.f9705attabal.monroe(seallessVar.getLong(i2));
            i2++;
        }
    }

    public final <V> void apical(int i, supplicat.attabal<Integer, V> attabalVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f9705attabal.licking(i, 2);
            this.f9705attabal.fastrack(supplicat.saneness(attabalVar, Integer.valueOf(i4), v));
            supplicat.marial(this.f9705attabal, attabalVar, Integer.valueOf(i4), v);
        }
    }

    public final void arytenoidectomy(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.preterite(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iApical = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iApical += CodedOutputStream.apical(list.get(i3).doubleValue());
        }
        this.f9705attabal.fastrack(iApical);
        while (i2 < list.size()) {
            this.f9705attabal.wostteth(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void attabal(int i, List<?> list, premeiotic premeioticVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            marial(i, list.get(i2), premeioticVar);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void beachfront(int i, List<?> list, premeiotic premeioticVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            dern(i, list.get(i2), premeioticVar);
        }
    }

    public final void cord(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.technofreak(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iRotuma = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRotuma += CodedOutputStream.rotuma(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iRotuma);
        while (i2 < list.size()) {
            this.f9705attabal.outmarry(list.get(i2).intValue());
            i2++;
        }
    }

    public final void cuirassed(int i, sealless seallessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < seallessVar.size()) {
                this.f9705attabal.dhss(i, seallessVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iCord = 0;
        for (int i3 = 0; i3 < seallessVar.size(); i3++) {
            iCord += CodedOutputStream.cord(seallessVar.getLong(i3));
        }
        this.f9705attabal.fastrack(iCord);
        while (i2 < seallessVar.size()) {
            this.f9705attabal.vesuvio(seallessVar.getLong(i2));
            i2++;
        }
    }

    public final <V> void cutely(int i, boolean z, V v, supplicat.attabal<Boolean, V> attabalVar) throws IOException {
        this.f9705attabal.licking(i, 2);
        this.f9705attabal.fastrack(supplicat.saneness(attabalVar, Boolean.valueOf(z), v));
        supplicat.marial(this.f9705attabal, attabalVar, Boolean.valueOf(z), v);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void dern(int i, Object obj, premeiotic premeioticVar) throws IOException {
        this.f9705attabal.setterwort(i, (saran) obj, premeioticVar);
    }

    public final void dovishness(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.lightstruck(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iMonoploid = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMonoploid += CodedOutputStream.monoploid(list.get(i3).longValue());
        }
        this.f9705attabal.fastrack(iMonoploid);
        while (i2 < list.size()) {
            this.f9705attabal.monroe(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public final <V> void formularize(int i, supplicat.attabal<Long, V> attabalVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f9705attabal.licking(i, 2);
            this.f9705attabal.fastrack(supplicat.saneness(attabalVar, Long.valueOf(j), v));
            supplicat.marial(this.f9705attabal, attabalVar, Long.valueOf(j), v);
        }
    }

    public final void gintrap(int i, graveside gravesideVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < gravesideVar.size()) {
                this.f9705attabal.julian(i, gravesideVar.getFloat(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iMolybdenite = 0;
        for (int i3 = 0; i3 < gravesideVar.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(gravesideVar.getFloat(i3));
        }
        this.f9705attabal.fastrack(iMolybdenite);
        while (i2 < gravesideVar.size()) {
            this.f9705attabal.achondroplasia(gravesideVar.getFloat(i2));
            i2++;
        }
    }

    public final void graveside(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.picketboat(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iKowloon = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iKowloon += CodedOutputStream.kowloon(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iKowloon);
        while (i2 < list.size()) {
            this.f9705attabal.palmyra(list.get(i2).intValue());
            i2++;
        }
    }

    public void grimness(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.microchemistry(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iClubfoot = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iClubfoot += CodedOutputStream.clubfoot(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iClubfoot);
        while (i2 < list.size()) {
            this.f9705attabal.fastrack(list.get(i2).intValue());
            i2++;
        }
    }

    public final <K, V> void impassible(int i, supplicat.attabal<K, V> attabalVar, Map<K, V> map) throws IOException {
        switch (attabal.f9706attabal[attabalVar.f9866attabal.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    cutely(i, false, v, attabalVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    cutely(i, true, v2, attabalVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                apical(i, attabalVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                formularize(i, attabalVar, map);
                return;
            case 12:
                triweekly(i, attabalVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + attabalVar.f9866attabal);
        }
    }

    public final void impromptu(int i, marial marialVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < marialVar.size()) {
                this.f9705attabal.sayid(i, marialVar.getBoolean(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iBeachfront = 0;
        for (int i3 = 0; i3 < marialVar.size(); i3++) {
            iBeachfront += CodedOutputStream.beachfront(marialVar.getBoolean(i3));
        }
        this.f9705attabal.fastrack(iBeachfront);
        while (i2 < marialVar.size()) {
            this.f9705attabal.empress(marialVar.getBoolean(i2));
            i2++;
        }
    }

    public final void kattegat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.deadwork(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iPrivatdozent = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iPrivatdozent += CodedOutputStream.privatdozent(list.get(i3).longValue());
        }
        this.f9705attabal.fastrack(iPrivatdozent);
        while (i2 < list.size()) {
            this.f9705attabal.molet(list.get(i2).longValue());
            i2++;
        }
    }

    public final void kowloon(int i, apical apicalVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < apicalVar.size()) {
                this.f9705attabal.preterite(i, apicalVar.getDouble(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iApical = 0;
        for (int i3 = 0; i3 < apicalVar.size(); i3++) {
            iApical += CodedOutputStream.apical(apicalVar.getDouble(i3));
        }
        this.f9705attabal.fastrack(iApical);
        while (i2 < apicalVar.size()) {
            this.f9705attabal.wostteth(apicalVar.getDouble(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void marial(int i, Object obj, premeiotic premeioticVar) throws IOException {
        this.f9705attabal.claque(i, (saran) obj, premeioticVar);
    }

    public final void merc(int i, sealless seallessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < seallessVar.size()) {
                this.f9705attabal.basify(i, seallessVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iWalach = 0;
        for (int i3 = 0; i3 < seallessVar.size(); i3++) {
            iWalach += CodedOutputStream.walach(seallessVar.getLong(i3));
        }
        this.f9705attabal.fastrack(iWalach);
        while (i2 < seallessVar.size()) {
            this.f9705attabal.tectonization(seallessVar.getLong(i2));
            i2++;
        }
    }

    public final void molybdenite(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.picketboat(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iKowloon = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iKowloon += CodedOutputStream.kowloon(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iKowloon);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.palmyra(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void monoploid(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.igbo(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iImpassible = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iImpassible += CodedOutputStream.impassible(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iImpassible);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.gusty(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void oilcan(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.lampshade(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iGrimness = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iGrimness += CodedOutputStream.grimness(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iGrimness);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.libyan(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void polder(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.basify(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iWalach = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iWalach += CodedOutputStream.walach(list.get(i3).longValue());
        }
        this.f9705attabal.fastrack(iWalach);
        while (i2 < list.size()) {
            this.f9705attabal.tectonization(list.get(i2).longValue());
            i2++;
        }
    }

    public final void polloi(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.igbo(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iImpassible = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iImpassible += CodedOutputStream.impassible(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iImpassible);
        while (i2 < list.size()) {
            this.f9705attabal.gusty(list.get(i2).intValue());
            i2++;
        }
    }

    public final void preprohormone(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.technofreak(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iRotuma = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iRotuma += CodedOutputStream.rotuma(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iRotuma);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.outmarry(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void privatdozent(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.cosy(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iPermissivist = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iPermissivist += CodedOutputStream.permissivist(list.get(i3).longValue());
        }
        this.f9705attabal.fastrack(iPermissivist);
        while (i2 < list.size()) {
            this.f9705attabal.pruinose(list.get(i2).longValue());
            i2++;
        }
    }

    public void restrictive(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.sakeen(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iStarveling = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iStarveling += CodedOutputStream.starveling(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iStarveling);
        while (i2 < list.size()) {
            this.f9705attabal.immediately(list.get(i2).intValue());
            i2++;
        }
    }

    public final void rotuma(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.julian(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iMolybdenite = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(list.get(i3).floatValue());
        }
        this.f9705attabal.fastrack(iMolybdenite);
        while (i2 < list.size()) {
            this.f9705attabal.achondroplasia(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void saneness(int i, ByteString byteString) throws IOException {
        this.f9705attabal.sensatory(i, byteString);
    }

    public final void saran(int i, sealless seallessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < seallessVar.size()) {
                this.f9705attabal.cosy(i, seallessVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iPermissivist = 0;
        for (int i3 = 0; i3 < seallessVar.size(); i3++) {
            iPermissivist += CodedOutputStream.permissivist(seallessVar.getLong(i3));
        }
        this.f9705attabal.fastrack(iPermissivist);
        while (i2 < seallessVar.size()) {
            this.f9705attabal.pruinose(seallessVar.getLong(i2));
            i2++;
        }
    }

    public final void sealless(int i, sealless seallessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < seallessVar.size()) {
                this.f9705attabal.deadwork(i, seallessVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iPrivatdozent = 0;
        for (int i3 = 0; i3 < seallessVar.size(); i3++) {
            iPrivatdozent += CodedOutputStream.privatdozent(seallessVar.getLong(i3));
        }
        this.f9705attabal.fastrack(iPrivatdozent);
        while (i2 < seallessVar.size()) {
            this.f9705attabal.molet(seallessVar.getLong(i2));
            i2++;
        }
    }

    public final void seminary(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.microchemistry(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iClubfoot = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iClubfoot += CodedOutputStream.clubfoot(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iClubfoot);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.fastrack(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void stratoscope(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.dhss(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iCord = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCord += CodedOutputStream.cord(list.get(i3).longValue());
        }
        this.f9705attabal.fastrack(iCord);
        while (i2 < list.size()) {
            this.f9705attabal.vesuvio(list.get(i2).longValue());
            i2++;
        }
    }

    public final void supplicat(int i, dovishness dovishnessVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < dovishnessVar.size()) {
                this.f9705attabal.sakeen(i, dovishnessVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iStarveling = 0;
        for (int i3 = 0; i3 < dovishnessVar.size(); i3++) {
            iStarveling += CodedOutputStream.starveling(dovishnessVar.getInt(i3));
        }
        this.f9705attabal.fastrack(iStarveling);
        while (i2 < dovishnessVar.size()) {
            this.f9705attabal.immediately(dovishnessVar.getInt(i2));
            i2++;
        }
    }

    public final void taiyuan(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.sayid(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iBeachfront = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iBeachfront += CodedOutputStream.beachfront(list.get(i3).booleanValue());
        }
        this.f9705attabal.fastrack(iBeachfront);
        while (i2 < list.size()) {
            this.f9705attabal.empress(list.get(i2).booleanValue());
            i2++;
        }
    }

    public final <V> void triweekly(int i, supplicat.attabal<String, V> attabalVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.f9705attabal.licking(i, 2);
            this.f9705attabal.fastrack(supplicat.saneness(attabalVar, str, v));
            supplicat.marial(this.f9705attabal, attabalVar, str, v);
        }
    }

    public final void trm(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f9705attabal.prefect(i, (String) obj);
        } else {
            this.f9705attabal.sensatory(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void wireman(int i, supplicat.attabal<K, V> attabalVar, Map<K, V> map) throws IOException {
        if (this.f9705attabal.treadless()) {
            impassible(i, attabalVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f9705attabal.licking(i, 2);
            this.f9705attabal.fastrack(supplicat.saneness(attabalVar, entry.getKey(), entry.getValue()));
            supplicat.marial(this.f9705attabal, attabalVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i, boolean z) throws IOException {
        this.f9705attabal.sayid(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof marial) {
            impromptu(i, (marial) list, z);
        } else {
            taiyuan(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9705attabal.sensatory(i, list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i, double d) throws IOException {
        this.f9705attabal.preterite(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof apical) {
            kowloon(i, (apical) list, z);
        } else {
            arytenoidectomy(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i) throws IOException {
        this.f9705attabal.licking(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i, int i2) throws IOException {
        this.f9705attabal.igbo(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            monoploid(i, (dovishness) list, z);
        } else {
            polloi(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i, int i2) throws IOException {
        this.f9705attabal.picketboat(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            molybdenite(i, (dovishness) list, z);
        } else {
            graveside(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i, long j) throws IOException {
        this.f9705attabal.lightstruck(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof sealless) {
            adultoid(i, (sealless) list, z);
        } else {
            dovishness(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i, float f) throws IOException {
        this.f9705attabal.julian(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof graveside) {
            gintrap(i, (graveside) list, z);
        } else {
            rotuma(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i, int i2) throws IOException {
        this.f9705attabal.technofreak(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            preprohormone(i, (dovishness) list, z);
        } else {
            cord(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i, long j) throws IOException {
        this.f9705attabal.dhss(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof sealless) {
            cuirassed(i, (sealless) list, z);
        } else {
            stratoscope(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f9705attabal.homozygous(i, (ByteString) obj);
        } else {
            this.f9705attabal.attendance(i, (saran) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i, int i2) throws IOException {
        this.f9705attabal.lampshade(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            oilcan(i, (dovishness) list, z);
        } else {
            yemenite(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i, long j) throws IOException {
        this.f9705attabal.deadwork(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof sealless) {
            sealless(i, (sealless) list, z);
        } else {
            kattegat(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i, int i2) throws IOException {
        this.f9705attabal.sakeen(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            supplicat(i, (dovishness) list, z);
        } else {
            restrictive(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i, long j) throws IOException {
        this.f9705attabal.basify(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof sealless) {
            merc(i, (sealless) list, z);
        } else {
            polder(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i) throws IOException {
        this.f9705attabal.licking(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i, String str) throws IOException {
        this.f9705attabal.prefect(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof stratoscope)) {
            while (i2 < list.size()) {
                this.f9705attabal.prefect(i, list.get(i2));
                i2++;
            }
        } else {
            stratoscope stratoscopeVar = (stratoscope) list;
            while (i2 < list.size()) {
                trm(i, stratoscopeVar.getRaw(i2));
                i2++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i, int i2) throws IOException {
        this.f9705attabal.microchemistry(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof dovishness) {
            seminary(i, (dovishness) list, z);
        } else {
            grimness(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i, long j) throws IOException {
        this.f9705attabal.cosy(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof sealless) {
            saran(i, (sealless) list, z);
        } else {
            privatdozent(i, list, z);
        }
    }

    public final void yemenite(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9705attabal.lampshade(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9705attabal.licking(i, 2);
        int iGrimness = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iGrimness += CodedOutputStream.grimness(list.get(i3).intValue());
        }
        this.f9705attabal.fastrack(iGrimness);
        while (i2 < list.size()) {
            this.f9705attabal.libyan(list.get(i2).intValue());
            i2++;
        }
    }
}
