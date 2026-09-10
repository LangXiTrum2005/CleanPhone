package nattier;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.rotuma;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.hydrovane;
import cybernatic.supplicat;
import cybernatic.trm;
import decarock.cuirassed;
import decarock.grimness;
import decarock.stratoscope;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f33831attabal = grimness.czestochowa("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f33832attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final stratoscope f33833beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final stratoscope f33834competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f33835dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f33836impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f33837marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f33838saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f33839taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f33840wireman;

        public attabal(stratoscope stratoscopeVar, stratoscope stratoscopeVar2, boolean z) throws ParserException {
            this.f33834competently = stratoscopeVar;
            this.f33833beachfront = stratoscopeVar2;
            this.f33837marial = z;
            stratoscopeVar2.mathsort(12);
            this.f33832attabal = stratoscopeVar2.seminary();
            stratoscopeVar.mathsort(12);
            this.f33839taiyuan = stratoscopeVar.seminary();
            cybernatic.molybdenite.attabal(stratoscopeVar.monoploid() == 1, "first_chunk must be 1");
            this.f33838saneness = -1;
        }

        public boolean attabal() {
            int i = this.f33838saneness + 1;
            this.f33838saneness = i;
            if (i == this.f33832attabal) {
                return false;
            }
            this.f33840wireman = this.f33837marial ? this.f33833beachfront.grimness() : this.f33833beachfront.merc();
            if (this.f33838saneness == this.f33836impromptu) {
                this.f33835dern = this.f33834competently.seminary();
                this.f33834competently.splinterproof(4);
                int i2 = this.f33839taiyuan - 1;
                this.f33839taiyuan = i2;
                this.f33836impromptu = i2 > 0 ? this.f33834competently.seminary() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class beachfront implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final stratoscope f33841attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f33842dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f33843marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f33844saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f33845wireman;

        public beachfront(nattier.attabal.saneness sanenessVar) {
            stratoscope stratoscopeVar = sanenessVar.f33702saneness;
            this.f33841attabal = stratoscopeVar;
            stratoscopeVar.mathsort(12);
            this.f33842dern = stratoscopeVar.seminary() & 255;
            this.f33844saneness = stratoscopeVar.seminary();
        }

        @Override // nattier.saneness.dern
        public int attabal() {
            return -1;
        }

        @Override // nattier.saneness.dern
        public int getSampleCount() {
            return this.f33844saneness;
        }

        @Override // nattier.saneness.dern
        public int readNextSampleSize() {
            int i = this.f33842dern;
            if (i == 8) {
                return this.f33841attabal.supplicat();
            }
            if (i == 16) {
                return this.f33841attabal.saran();
            }
            int i2 = this.f33845wireman;
            this.f33845wireman = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f33843marial & 15;
            }
            int iSupplicat = this.f33841attabal.supplicat();
            this.f33843marial = iSupplicat;
            return (iSupplicat & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f33846attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f33847dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f33848saneness;

        public competently(int i, long j, int i2) {
            this.f33846attabal = i;
            this.f33848saneness = j;
            this.f33847dern = i2;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public interface dern {
        int attabal();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class marial implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f33849attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final stratoscope f33850dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f33851saneness;

        public marial(nattier.attabal.saneness sanenessVar, androidx.media3.common.polloi polloiVar) {
            stratoscope stratoscopeVar = sanenessVar.f33702saneness;
            this.f33850dern = stratoscopeVar;
            stratoscopeVar.mathsort(12);
            int iSeminary = stratoscopeVar.seminary();
            if (MimeTypes.AUDIO_RAW.equals(polloiVar.f11218triweekly)) {
                int iMilliradian = grimness.milliradian(polloiVar.f11206oilcan, polloiVar.f11215stratoscope);
                if (iSeminary == 0 || iSeminary % iMilliradian != 0) {
                    decarock.triweekly.impromptu("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iMilliradian + ", stsz sample size: " + iSeminary);
                    iSeminary = iMilliradian;
                }
            }
            this.f33849attabal = iSeminary == 0 ? -1 : iSeminary;
            this.f33851saneness = stratoscopeVar.seminary();
        }

        @Override // nattier.saneness.dern
        public int attabal() {
            return this.f33849attabal;
        }

        @Override // nattier.saneness.dern
        public int getSampleCount() {
            return this.f33851saneness;
        }

        @Override // nattier.saneness.dern
        public int readNextSampleSize() {
            int i = this.f33849attabal;
            return i == -1 ? this.f33850dern.seminary() : i;
        }
    }

    /* JADX INFO: renamed from: nattier.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class C0752saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f33852attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f33853dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final byte[] f33854saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f33855wireman;

        public C0752saneness(String str, byte[] bArr, long j, long j2) {
            this.f33852attabal = str;
            this.f33854saneness = bArr;
            this.f33853dern = j;
            this.f33855wireman = j2;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final graveside[] f33856attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f33857dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.media3.common.polloi f33858saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f33859wireman = 0;

        public wireman(int i) {
            this.f33856attabal = new graveside[i];
        }
    }

    public static Pair<Integer, graveside> adultoid(stratoscope stratoscopeVar, int i, int i2) throws ParserException {
        Pair<Integer, graveside> pairTaiyuan;
        int iBeachfront = stratoscopeVar.beachfront();
        while (iBeachfront - i < i2) {
            stratoscopeVar.mathsort(iBeachfront);
            int iMonoploid = stratoscopeVar.monoploid();
            cybernatic.molybdenite.attabal(iMonoploid > 0, "childAtomSize must be positive");
            if (stratoscopeVar.monoploid() == 1936289382 && (pairTaiyuan = taiyuan(stratoscopeVar, iBeachfront, iMonoploid)) != null) {
                return pairTaiyuan;
            }
            iBeachfront += iMonoploid;
        }
        return null;
    }

    public static C0752saneness apical(stratoscope stratoscopeVar, int i) {
        stratoscopeVar.mathsort(i + 12);
        stratoscopeVar.splinterproof(1);
        formularize(stratoscopeVar);
        stratoscopeVar.splinterproof(2);
        int iSupplicat = stratoscopeVar.supplicat();
        if ((iSupplicat & 128) != 0) {
            stratoscopeVar.splinterproof(2);
        }
        if ((iSupplicat & 64) != 0) {
            stratoscopeVar.splinterproof(stratoscopeVar.supplicat());
        }
        if ((iSupplicat & 32) != 0) {
            stratoscopeVar.splinterproof(2);
        }
        stratoscopeVar.splinterproof(1);
        formularize(stratoscopeVar);
        String strDern = rotuma.dern(stratoscopeVar.supplicat());
        if (MimeTypes.AUDIO_MPEG.equals(strDern) || MimeTypes.AUDIO_DTS.equals(strDern) || MimeTypes.AUDIO_DTS_HD.equals(strDern)) {
            return new C0752saneness(strDern, null, -1L, -1L);
        }
        stratoscopeVar.splinterproof(4);
        long jMerc = stratoscopeVar.merc();
        long jMerc2 = stratoscopeVar.merc();
        stratoscopeVar.splinterproof(1);
        int iFormularize = formularize(stratoscopeVar);
        long j = jMerc2;
        byte[] bArr = new byte[iFormularize];
        stratoscopeVar.formularize(bArr, 0, iFormularize);
        if (j <= 0) {
            j = -1;
        }
        return new C0752saneness(strDern, bArr, j, jMerc > 0 ? jMerc : -1L);
    }

    public static Metadata arytenoidectomy(nattier.attabal.C0751attabal c0751attabal) {
        nattier.attabal.saneness sanenessVarCompetently = c0751attabal.competently(1751411826);
        nattier.attabal.saneness sanenessVarCompetently2 = c0751attabal.competently(1801812339);
        nattier.attabal.saneness sanenessVarCompetently3 = c0751attabal.competently(1768715124);
        if (sanenessVarCompetently == null || sanenessVarCompetently2 == null || sanenessVarCompetently3 == null || impassible(sanenessVarCompetently.f33702saneness) != 1835299937) {
            return null;
        }
        stratoscope stratoscopeVar = sanenessVarCompetently2.f33702saneness;
        stratoscopeVar.mathsort(12);
        int iMonoploid = stratoscopeVar.monoploid();
        String[] strArr = new String[iMonoploid];
        for (int i = 0; i < iMonoploid; i++) {
            int iMonoploid2 = stratoscopeVar.monoploid();
            stratoscopeVar.splinterproof(4);
            strArr[i] = stratoscopeVar.yemenite(iMonoploid2 - 8);
        }
        stratoscope stratoscopeVar2 = sanenessVarCompetently3.f33702saneness;
        stratoscopeVar2.mathsort(8);
        ArrayList arrayList = new ArrayList();
        while (stratoscopeVar2.attabal() > 8) {
            int iBeachfront = stratoscopeVar2.beachfront();
            int iMonoploid3 = stratoscopeVar2.monoploid();
            int iMonoploid4 = stratoscopeVar2.monoploid() - 1;
            if (iMonoploid4 < 0 || iMonoploid4 >= iMonoploid) {
                decarock.triweekly.impromptu("AtomParsers", "Skipped metadata with unknown key index: " + iMonoploid4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryImpromptu = cutely.impromptu(stratoscopeVar2, iBeachfront + iMonoploid3, strArr[iMonoploid4]);
                if (mdtaMetadataEntryImpromptu != null) {
                    arrayList.add(mdtaMetadataEntryImpromptu);
                }
            }
            stratoscopeVar2.mathsort(iBeachfront + iMonoploid3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static ByteBuffer attabal() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static void beachfront(stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        stratoscopeVar.splinterproof(4);
        if (stratoscopeVar.monoploid() != 1751411826) {
            iBeachfront += 4;
        }
        stratoscopeVar.mathsort(iBeachfront);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01be  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0201  */
    /* JADX WARN: Code duplicated, block: B:145:0x021e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0224  */
    /* JADX WARN: Code duplicated, block: B:151:0x023e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0243  */
    /* JADX WARN: Code duplicated, block: B:155:0x024e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0258  */
    /* JADX WARN: Code duplicated, block: B:158:0x025d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0268  */
    /* JADX WARN: Code duplicated, block: B:164:0x0276  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:228:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    public static void competently(stratoscope stratoscopeVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, wireman wiremanVar, int i5) throws ParserException {
        int iSaran;
        int i6;
        int iSaran2;
        int iRestrictive;
        int iMonoploid;
        int i7;
        String str2;
        String str3;
        int i8;
        String str4;
        List<byte[]> listOf;
        String str5;
        C0752saneness c0752sanenessApical;
        int iMonoploid2;
        boolean z2;
        int iMonoploid3;
        String str6;
        int iWireman;
        byte[] bArr;
        char c;
        int iSupplicat;
        byte[] bArr2;
        int iSupplicat2;
        String str7;
        byte[] bArr3;
        ImmutableList immutableListOf;
        int i9 = i3;
        DrmInitData drmInitDataSaneness = drmInitData;
        stratoscopeVar.mathsort(i2 + 16);
        if (z) {
            iSaran = stratoscopeVar.saran();
            stratoscopeVar.splinterproof(6);
        } else {
            stratoscopeVar.splinterproof(8);
            iSaran = 0;
        }
        if (iSaran == 0 || iSaran == 1) {
            i6 = 2;
            iSaran2 = stratoscopeVar.saran();
            stratoscopeVar.splinterproof(6);
            iRestrictive = stratoscopeVar.restrictive();
            stratoscopeVar.mathsort(stratoscopeVar.beachfront() - 4);
            iMonoploid = stratoscopeVar.monoploid();
            if (iSaran == 1) {
                stratoscopeVar.splinterproof(16);
            }
            i7 = -1;
        } else {
            if (iSaran != 2) {
                return;
            }
            stratoscopeVar.splinterproof(16);
            iRestrictive = (int) Math.round(stratoscopeVar.kowloon());
            iSaran2 = stratoscopeVar.seminary();
            stratoscopeVar.splinterproof(4);
            int iSeminary = stratoscopeVar.seminary();
            int iSeminary2 = stratoscopeVar.seminary();
            boolean z3 = (iSeminary2 & 1) != 0;
            boolean z4 = (iSeminary2 & 2) != 0;
            i6 = 2;
            if (z3) {
                if (iSeminary == 32) {
                    i7 = 4;
                } else {
                    i7 = -1;
                }
            } else if (iSeminary == 8) {
                i7 = 3;
            } else if (iSeminary == 16) {
                i7 = z4 ? 268435456 : 2;
            } else if (iSeminary == 24) {
                i7 = z4 ? 1342177280 : 21;
            } else if (iSeminary == 32) {
                i7 = z4 ? 1610612736 : 22;
            } else {
                i7 = -1;
            }
            stratoscopeVar.splinterproof(8);
            iMonoploid = 0;
        }
        int iBeachfront = stratoscopeVar.beachfront();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, graveside> pairAdultoid = adultoid(stratoscopeVar, i2, i9);
            if (pairAdultoid != null) {
                iIntValue = ((Integer) pairAdultoid.first).intValue();
                drmInitDataSaneness = drmInitDataSaneness == null ? null : drmInitDataSaneness.saneness(((graveside) pairAdultoid.second).f33720saneness);
                wiremanVar.f33856attabal[i5] = (graveside) pairAdultoid.second;
            }
            stratoscopeVar.mathsort(iBeachfront);
        }
        String str8 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                str3 = MimeTypes.AUDIO_RAW;
                if (iIntValue == 1936684916) {
                    i8 = i6;
                } else if (iIntValue == 1953984371) {
                    i8 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i7 == -1) {
                        i8 = i6;
                    } else {
                        i8 = i7;
                    }
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    i8 = i7;
                    str3 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = MimeTypes.AUDIO_TRUEHD;
                } else {
                    i8 = i7;
                    str3 = null;
                }
                str4 = str3;
                listOf = null;
                str5 = null;
                c0752sanenessApical = null;
                while (iBeachfront - i2 < i9) {
                    stratoscopeVar.mathsort(iBeachfront);
                    iMonoploid2 = stratoscopeVar.monoploid();
                    if (iMonoploid2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = i8;
                    cybernatic.molybdenite.attabal(z2, "childAtomSize must be positive");
                    iMonoploid3 = stratoscopeVar.monoploid();
                    if (iMonoploid3 == 1835557187) {
                        stratoscopeVar.mathsort(iBeachfront + 8);
                        stratoscopeVar.splinterproof(1);
                        iSupplicat2 = stratoscopeVar.supplicat();
                        stratoscopeVar.splinterproof(1);
                        if (Objects.equals(str4, str8)) {
                            str7 = String.format("mhm1.%02X", Integer.valueOf(iSupplicat2));
                        } else {
                            str7 = String.format("mha1.%02X", Integer.valueOf(iSupplicat2));
                        }
                        String str9 = str7;
                        int iSaran3 = stratoscopeVar.saran();
                        bArr3 = new byte[iSaran3];
                        stratoscopeVar.formularize(bArr3, 0, iSaran3);
                        if (listOf == null) {
                            immutableListOf = ImmutableList.of(bArr3);
                        } else {
                            immutableListOf = ImmutableList.of(bArr3, listOf.get(0));
                        }
                        listOf = immutableListOf;
                        str5 = str9;
                    } else {
                        if (iMonoploid3 == 1835557200) {
                            stratoscopeVar.mathsort(iBeachfront + 8);
                            iSupplicat = stratoscopeVar.supplicat();
                            if (iSupplicat > 0) {
                                bArr2 = new byte[iSupplicat];
                                str6 = str8;
                                stratoscopeVar.formularize(bArr2, 0, iSupplicat);
                                if (listOf == null) {
                                    listOf = ImmutableList.of(bArr2);
                                } else {
                                    listOf = ImmutableList.of(listOf.get(0), bArr2);
                                }
                            }
                        } else {
                            str6 = str8;
                            if (iMonoploid3 != 1702061171 || (z && iMonoploid3 == 2002876005)) {
                                if (iMonoploid3 == 1702061171) {
                                    iWireman = iBeachfront;
                                } else {
                                    iWireman = wireman(stratoscopeVar, 1702061171, iBeachfront, iMonoploid2);
                                }
                                if (iWireman != -1) {
                                    c0752sanenessApical = apical(stratoscopeVar, iWireman);
                                    str4 = c0752sanenessApical.f33852attabal;
                                    bArr = c0752sanenessApical.f33854saneness;
                                    if (bArr != null) {
                                        if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                            listOf = hydrovane.marial(bArr);
                                        } else {
                                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                                cybernatic.attabal.saneness sanenessVarMarial = cybernatic.attabal.marial(bArr);
                                                int i11 = sanenessVarMarial.f24603attabal;
                                                int i12 = sanenessVarMarial.f24605saneness;
                                                str5 = sanenessVarMarial.f24604dern;
                                                iRestrictive = i11;
                                                iSaran2 = i12;
                                            }
                                            listOf = ImmutableList.of(bArr);
                                        }
                                    }
                                }
                            } else {
                                if (iMonoploid3 == 1684103987) {
                                    stratoscopeVar.mathsort(iBeachfront + 8);
                                    wiremanVar.f33858saneness = cybernatic.saneness.wireman(stratoscopeVar, Integer.toString(i4), str, drmInitDataSaneness);
                                } else if (iMonoploid3 == 1684366131) {
                                    stratoscopeVar.mathsort(iBeachfront + 8);
                                    wiremanVar.f33858saneness = cybernatic.saneness.impromptu(stratoscopeVar, Integer.toString(i4), str, drmInitDataSaneness);
                                } else if (iMonoploid3 == 1684103988) {
                                    stratoscopeVar.mathsort(iBeachfront + 8);
                                    wiremanVar.f33858saneness = cybernatic.dern.saneness(stratoscopeVar, Integer.toString(i4), str, drmInitDataSaneness);
                                } else if (iMonoploid3 == 1684892784) {
                                    if (iMonoploid <= 0) {
                                        throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + iMonoploid, null);
                                    }
                                    iRestrictive = iMonoploid;
                                    iSaran2 = i6;
                                } else if (iMonoploid3 == 1684305011 || iMonoploid3 == 1969517683) {
                                    c = 24931;
                                    wiremanVar.f33858saneness = new androidx.media3.common.polloi.saneness().permissivist(i4).sensatory(str4).saran(iSaran2).underbelly(iRestrictive).mathsort(drmInitDataSaneness).treadless(str).polder();
                                } else if (iMonoploid3 == 1682927731) {
                                    int i13 = iMonoploid2 - 8;
                                    byte[] bArr4 = f33831attabal;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i13);
                                    stratoscopeVar.mathsort(iBeachfront + 8);
                                    stratoscopeVar.formularize(bArrCopyOf, bArr4.length, i13);
                                    listOf = supplicat.attabal(bArrCopyOf);
                                } else if (iMonoploid3 == 1684425825) {
                                    byte[] bArr5 = new byte[iMonoploid2 - 8];
                                    bArr5[0] = 102;
                                    bArr5[1] = 76;
                                    bArr5[i6] = 97;
                                    bArr5[3] = 67;
                                    stratoscopeVar.mathsort(iBeachfront + 12);
                                    stratoscopeVar.formularize(bArr5, 4, iMonoploid2 - 12);
                                    listOf = ImmutableList.of(bArr5);
                                } else {
                                    c = 24931;
                                    if (iMonoploid3 == 1634492771) {
                                        int i14 = iMonoploid2 - 12;
                                        byte[] bArr6 = new byte[i14];
                                        stratoscopeVar.mathsort(iBeachfront + 12);
                                        stratoscopeVar.formularize(bArr6, 0, i14);
                                        Pair<Integer, Integer> pairMarial = decarock.marial.marial(bArr6);
                                        int iIntValue2 = ((Integer) pairMarial.first).intValue();
                                        int iIntValue3 = ((Integer) pairMarial.second).intValue();
                                        listOf = ImmutableList.of(bArr6);
                                        iRestrictive = iIntValue2;
                                        iSaran2 = iIntValue3;
                                    }
                                }
                                c = 24931;
                            }
                            iBeachfront += iMonoploid2;
                            i9 = i3;
                            i8 = i10;
                            str8 = str6;
                        }
                        iBeachfront += iMonoploid2;
                        i9 = i3;
                        i8 = i10;
                        str8 = str6;
                    }
                    str6 = str8;
                    iBeachfront += iMonoploid2;
                    i9 = i3;
                    i8 = i10;
                    str8 = str6;
                }
                int i15 = i8;
                if (wiremanVar.f33858saneness == null || str4 == null) {
                }
                androidx.media3.common.polloi.saneness sanenessVarTreadless = new androidx.media3.common.polloi.saneness().permissivist(i4).sensatory(str4).privatdozent(str5).saran(iSaran2).underbelly(iRestrictive).nosophobia(i15).premeiotic(listOf).mathsort(drmInitDataSaneness).treadless(str);
                if (c0752sanenessApical != null) {
                    sanenessVarTreadless.grimness(Ints.formularize(c0752sanenessApical.f33853dern)).lotta(Ints.formularize(c0752sanenessApical.f33855wireman));
                }
                wiremanVar.f33858saneness = sanenessVarTreadless.polder();
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i8 = i7;
        str4 = str3;
        listOf = null;
        str5 = null;
        c0752sanenessApical = null;
        while (iBeachfront - i2 < i9) {
            stratoscopeVar.mathsort(iBeachfront);
            iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i16 = i8;
            cybernatic.molybdenite.attabal(z2, "childAtomSize must be positive");
            iMonoploid3 = stratoscopeVar.monoploid();
            if (iMonoploid3 == 1835557187) {
                stratoscopeVar.mathsort(iBeachfront + 8);
                stratoscopeVar.splinterproof(1);
                iSupplicat2 = stratoscopeVar.supplicat();
                stratoscopeVar.splinterproof(1);
                if (Objects.equals(str4, str8)) {
                    str7 = String.format("mhm1.%02X", Integer.valueOf(iSupplicat2));
                } else {
                    str7 = String.format("mha1.%02X", Integer.valueOf(iSupplicat2));
                }
                String str10 = str7;
                int iSaran4 = stratoscopeVar.saran();
                bArr3 = new byte[iSaran4];
                stratoscopeVar.formularize(bArr3, 0, iSaran4);
                if (listOf == null) {
                    immutableListOf = ImmutableList.of(bArr3);
                } else {
                    immutableListOf = ImmutableList.of(bArr3, listOf.get(0));
                }
                listOf = immutableListOf;
                str5 = str10;
            } else {
                if (iMonoploid3 == 1835557200) {
                    stratoscopeVar.mathsort(iBeachfront + 8);
                    iSupplicat = stratoscopeVar.supplicat();
                    if (iSupplicat > 0) {
                        bArr2 = new byte[iSupplicat];
                        str6 = str8;
                        stratoscopeVar.formularize(bArr2, 0, iSupplicat);
                        if (listOf == null) {
                            listOf = ImmutableList.of(bArr2);
                        } else {
                            listOf = ImmutableList.of(listOf.get(0), bArr2);
                        }
                    }
                } else {
                    str6 = str8;
                    if (iMonoploid3 != 1702061171) {
                        if (iMonoploid3 == 1702061171) {
                            iWireman = iBeachfront;
                        } else {
                            iWireman = wireman(stratoscopeVar, 1702061171, iBeachfront, iMonoploid2);
                        }
                        if (iWireman != -1) {
                            c0752sanenessApical = apical(stratoscopeVar, iWireman);
                            str4 = c0752sanenessApical.f33852attabal;
                            bArr = c0752sanenessApical.f33854saneness;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                    listOf = hydrovane.marial(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        cybernatic.attabal.saneness sanenessVarMarial2 = cybernatic.attabal.marial(bArr);
                                        int i17 = sanenessVarMarial2.f24603attabal;
                                        int i18 = sanenessVarMarial2.f24605saneness;
                                        str5 = sanenessVarMarial2.f24604dern;
                                        iRestrictive = i17;
                                        iSaran2 = i18;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                        }
                    } else {
                        if (iMonoploid3 == 1702061171) {
                            iWireman = iBeachfront;
                        } else {
                            iWireman = wireman(stratoscopeVar, 1702061171, iBeachfront, iMonoploid2);
                        }
                        if (iWireman != -1) {
                            c0752sanenessApical = apical(stratoscopeVar, iWireman);
                            str4 = c0752sanenessApical.f33852attabal;
                            bArr = c0752sanenessApical.f33854saneness;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                    listOf = hydrovane.marial(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        cybernatic.attabal.saneness sanenessVarMarial3 = cybernatic.attabal.marial(bArr);
                                        int i19 = sanenessVarMarial3.f24603attabal;
                                        int i110 = sanenessVarMarial3.f24605saneness;
                                        str5 = sanenessVarMarial3.f24604dern;
                                        iRestrictive = i19;
                                        iSaran2 = i110;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                        }
                    }
                    iBeachfront += iMonoploid2;
                    i9 = i3;
                    i8 = i16;
                    str8 = str6;
                }
                iBeachfront += iMonoploid2;
                i9 = i3;
                i8 = i16;
                str8 = str6;
            }
            str6 = str8;
            iBeachfront += iMonoploid2;
            i9 = i3;
            i8 = i16;
            str8 = str6;
        }
        int i111 = i8;
        if (wiremanVar.f33858saneness == null) {
        }
    }

    public static competently cord(stratoscope stratoscopeVar) {
        long j;
        stratoscopeVar.mathsort(8);
        int iDern = nattier.attabal.dern(stratoscopeVar.monoploid());
        stratoscopeVar.splinterproof(iDern == 0 ? 8 : 16);
        int iMonoploid = stratoscopeVar.monoploid();
        stratoscopeVar.splinterproof(4);
        int iBeachfront = stratoscopeVar.beachfront();
        int i = iDern == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i3 >= i) {
                stratoscopeVar.splinterproof(i);
                break;
            }
            if (stratoscopeVar.marial()[iBeachfront + i3] != -1) {
                long jMerc = iDern == 0 ? stratoscopeVar.merc() : stratoscopeVar.grimness();
                if (jMerc == 0) {
                    break;
                }
                j = jMerc;
                break;
            }
            i3++;
        }
        stratoscopeVar.splinterproof(16);
        int iMonoploid2 = stratoscopeVar.monoploid();
        int iMonoploid3 = stratoscopeVar.monoploid();
        stratoscopeVar.splinterproof(4);
        int iMonoploid4 = stratoscopeVar.monoploid();
        int iMonoploid5 = stratoscopeVar.monoploid();
        if (iMonoploid2 == 0 && iMonoploid3 == 65536 && iMonoploid4 == -65536 && iMonoploid5 == 0) {
            i2 = 90;
        } else if (iMonoploid2 == 0 && iMonoploid3 == -65536 && iMonoploid4 == 65536 && iMonoploid5 == 0) {
            i2 = 270;
        } else if (iMonoploid2 == -65536 && iMonoploid3 == 0 && iMonoploid4 == 0 && iMonoploid5 == -65536) {
            i2 = Opcodes.GETFIELD;
        }
        return new competently(iMonoploid, j, i2);
    }

    public static molybdenite cuirassed(nattier.attabal.C0751attabal c0751attabal, nattier.attabal.saneness sanenessVar, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        nattier.attabal.C0751attabal c0751attabalBeachfront;
        Pair<long[], long[]> pairCutely;
        nattier.attabal.C0751attabal c0751attabal2 = (nattier.attabal.C0751attabal) decarock.attabal.marial(c0751attabal.beachfront(1835297121));
        int iMarial = marial(impassible(((nattier.attabal.saneness) decarock.attabal.marial(c0751attabal2.competently(1751411826))).f33702saneness));
        if (iMarial == -1) {
            return null;
        }
        competently competentlyVarCord = cord(((nattier.attabal.saneness) decarock.attabal.marial(c0751attabal.competently(1953196132))).f33702saneness);
        long jDeadwork = C.TIME_UNSET;
        long j2 = j == C.TIME_UNSET ? competentlyVarCord.f33848saneness : j;
        long j3 = polloi(sanenessVar.f33702saneness).f11345monoploid;
        if (j2 != C.TIME_UNSET) {
            jDeadwork = grimness.deadwork(j2, 1000000L, j3);
        }
        long j4 = jDeadwork;
        nattier.attabal.C0751attabal c0751attabal3 = (nattier.attabal.C0751attabal) decarock.attabal.marial(((nattier.attabal.C0751attabal) decarock.attabal.marial(c0751attabal2.beachfront(1835626086))).beachfront(1937007212));
        Pair<Long, String> pairKowloon = kowloon(((nattier.attabal.saneness) decarock.attabal.marial(c0751attabal2.competently(1835296868))).f33702saneness);
        nattier.attabal.saneness sanenessVarCompetently = c0751attabal3.competently(1937011556);
        if (sanenessVarCompetently == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        wireman wiremanVarRotuma = rotuma(sanenessVarCompetently.f33702saneness, competentlyVarCord.f33846attabal, competentlyVarCord.f33847dern, (String) pairKowloon.second, drmInitData, z2);
        if (z || (c0751attabalBeachfront = c0751attabal.beachfront(1701082227)) == null || (pairCutely = cutely(c0751attabalBeachfront)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairCutely.first;
            jArr2 = (long[]) pairCutely.second;
            jArr = jArr3;
        }
        if (wiremanVarRotuma.f33858saneness == null) {
            return null;
        }
        return new molybdenite(competentlyVarCord.f33846attabal, iMarial, ((Long) pairKowloon.first).longValue(), j3, j4, wiremanVarRotuma.f33858saneness, wiremanVarRotuma.f33859wireman, wiremanVarRotuma.f33856attabal, wiremanVarRotuma.f33857dern, jArr, jArr2);
    }

    public static Pair<long[], long[]> cutely(nattier.attabal.C0751attabal c0751attabal) {
        nattier.attabal.saneness sanenessVarCompetently = c0751attabal.competently(1701606260);
        if (sanenessVarCompetently == null) {
            return null;
        }
        stratoscope stratoscopeVar = sanenessVarCompetently.f33702saneness;
        stratoscopeVar.mathsort(8);
        int iDern = nattier.attabal.dern(stratoscopeVar.monoploid());
        int iSeminary = stratoscopeVar.seminary();
        long[] jArr = new long[iSeminary];
        long[] jArr2 = new long[iSeminary];
        for (int i = 0; i < iSeminary; i++) {
            jArr[i] = iDern == 1 ? stratoscopeVar.grimness() : stratoscopeVar.merc();
            jArr2[i] = iDern == 1 ? stratoscopeVar.cuirassed() : stratoscopeVar.monoploid();
            if (stratoscopeVar.oilcan() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            stratoscopeVar.splinterproof(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static boolean dern(int i) {
        return i != 1;
    }

    public static graveside dovishness(stratoscope stratoscopeVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            stratoscopeVar.mathsort(i5);
            int iMonoploid = stratoscopeVar.monoploid();
            if (stratoscopeVar.monoploid() == 1952804451) {
                int iDern = nattier.attabal.dern(stratoscopeVar.monoploid());
                stratoscopeVar.splinterproof(1);
                if (iDern == 0) {
                    stratoscopeVar.splinterproof(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iSupplicat = stratoscopeVar.supplicat();
                    i3 = iSupplicat & 15;
                    i4 = (iSupplicat & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z = stratoscopeVar.supplicat() == 1;
                int iSupplicat2 = stratoscopeVar.supplicat();
                byte[] bArr2 = new byte[16];
                stratoscopeVar.formularize(bArr2, 0, 16);
                if (z && iSupplicat2 == 0) {
                    int iSupplicat3 = stratoscopeVar.supplicat();
                    bArr = new byte[iSupplicat3];
                    stratoscopeVar.formularize(bArr, 0, iSupplicat3);
                }
                return new graveside(z, str, iSupplicat2, bArr2, i4, i3, bArr);
            }
            i5 += iMonoploid;
        }
    }

    public static int formularize(stratoscope stratoscopeVar) {
        int iSupplicat = stratoscopeVar.supplicat();
        int i = iSupplicat & 127;
        while ((iSupplicat & 128) == 128) {
            iSupplicat = stratoscopeVar.supplicat();
            i = (i << 7) | (iSupplicat & 127);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    public static dovishness gintrap(molybdenite molybdeniteVar, nattier.attabal.C0751attabal c0751attabal, cybernatic.stratoscope stratoscopeVar) throws ParserException {
        dern beachfrontVar;
        boolean z;
        int iSeminary;
        int iSeminary2;
        int iSeminary3;
        boolean z2;
        long j;
        long[] jArrCopyOf;
        int i;
        int i2;
        long j2;
        boolean z3;
        int[] iArr;
        long[] jArr;
        ?? r4;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        long j3;
        int[] iArr6;
        int[] iArr7;
        int i3;
        boolean z4;
        int i4;
        int i5;
        nattier.attabal.saneness sanenessVarCompetently = c0751attabal.competently(1937011578);
        if (sanenessVarCompetently != null) {
            beachfrontVar = new marial(sanenessVarCompetently, molybdeniteVar.f33821beachfront);
        } else {
            nattier.attabal.saneness sanenessVarCompetently2 = c0751attabal.competently(1937013298);
            if (sanenessVarCompetently2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            beachfrontVar = new beachfront(sanenessVarCompetently2);
        }
        int sampleCount = beachfrontVar.getSampleCount();
        if (sampleCount == 0) {
            return new dovishness(molybdeniteVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        nattier.attabal.saneness sanenessVarCompetently3 = c0751attabal.competently(1937007471);
        if (sanenessVarCompetently3 == null) {
            sanenessVarCompetently3 = (nattier.attabal.saneness) decarock.attabal.marial(c0751attabal.competently(1668232756));
            z = true;
        } else {
            z = false;
        }
        stratoscope stratoscopeVar2 = sanenessVarCompetently3.f33702saneness;
        stratoscope stratoscopeVar3 = ((nattier.attabal.saneness) decarock.attabal.marial(c0751attabal.competently(1937011555))).f33702saneness;
        stratoscope stratoscopeVar4 = ((nattier.attabal.saneness) decarock.attabal.marial(c0751attabal.competently(1937011827))).f33702saneness;
        nattier.attabal.saneness sanenessVarCompetently4 = c0751attabal.competently(1937011571);
        stratoscope stratoscopeVar5 = sanenessVarCompetently4 != null ? sanenessVarCompetently4.f33702saneness : null;
        nattier.attabal.saneness sanenessVarCompetently5 = c0751attabal.competently(1668576371);
        stratoscope stratoscopeVar6 = sanenessVarCompetently5 != null ? sanenessVarCompetently5.f33702saneness : null;
        attabal attabalVar = new attabal(stratoscopeVar3, stratoscopeVar2, z);
        stratoscopeVar4.mathsort(12);
        int iSeminary4 = stratoscopeVar4.seminary() - 1;
        int iSeminary5 = stratoscopeVar4.seminary();
        int iSeminary6 = stratoscopeVar4.seminary();
        if (stratoscopeVar6 != null) {
            stratoscopeVar6.mathsort(12);
            iSeminary = stratoscopeVar6.seminary();
        } else {
            iSeminary = 0;
        }
        if (stratoscopeVar5 != null) {
            stratoscopeVar5.mathsort(12);
            iSeminary3 = stratoscopeVar5.seminary();
            if (iSeminary3 > 0) {
                iSeminary2 = stratoscopeVar5.seminary() - 1;
                z2 = false;
            } else {
                iSeminary2 = -1;
                z2 = false;
                stratoscopeVar5 = null;
            }
        } else {
            iSeminary2 = -1;
            iSeminary3 = 0;
            z2 = false;
        }
        int iAttabal = beachfrontVar.attabal();
        String str = molybdeniteVar.f33821beachfront.f11218triweekly;
        boolean z5 = (iAttabal == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && iSeminary4 == 0 && iSeminary == 0 && iSeminary3 == 0)) ? z2 ? 1 : 0 : true;
        dern dernVar = beachfrontVar;
        if (z5) {
            int i6 = attabalVar.f33832attabal;
            long[] jArr2 = new long[i6];
            int[] iArr8 = new int[i6];
            while (attabalVar.attabal()) {
                int i7 = attabalVar.f33838saneness;
                jArr2[i7] = attabalVar.f33840wireman;
                iArr8[i7] = attabalVar.f33835dern;
            }
            nattier.marial.saneness sanenessVarAttabal = nattier.marial.attabal(iAttabal, jArr2, iArr8, iSeminary6);
            long[] jArr3 = sanenessVarAttabal.f33813attabal;
            iArr = sanenessVarAttabal.f33817saneness;
            int i8 = sanenessVarAttabal.f33815dern;
            long[] jArr4 = sanenessVarAttabal.f33818wireman;
            int[] iArr9 = sanenessVarAttabal.f33816marial;
            j2 = sanenessVarAttabal.f33814beachfront;
            jArr = jArr3;
            r4 = i8;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j = 0;
        } else {
            long[] jArr5 = new long[sampleCount];
            j = 0;
            int[] iArrCopyOf = new int[sampleCount];
            jArrCopyOf = new long[sampleCount];
            stratoscope stratoscopeVar7 = stratoscopeVar6;
            int[] iArrCopyOf2 = new int[sampleCount];
            stratoscope stratoscopeVar8 = stratoscopeVar5;
            int iSeminary7 = iSeminary2;
            int i9 = z2 ? 1 : 0;
            int iMonoploid = i9;
            int i10 = iMonoploid == true ? 1 : 0;
            int i11 = i10;
            long j4 = 0;
            long j5 = 0;
            int i12 = iSeminary;
            int iMonoploid2 = iSeminary6;
            int i13 = iSeminary5;
            int i14 = iSeminary4;
            int i15 = i11 == true ? 1 : 0;
            while (true) {
                if (i9 >= sampleCount) {
                    boolean z6 = sampleCount == true ? 1 : 0;
                    i = i13;
                    i2 = i10;
                    break;
                }
                long j6 = j5;
                int i16 = i10;
                boolean zAttabal = true;
                while (i16 == 0) {
                    zAttabal = attabalVar.attabal();
                    if (!zAttabal) {
                        break;
                    }
                    int i17 = i13;
                    long j7 = attabalVar.f33840wireman;
                    i16 = attabalVar.f33835dern;
                    j6 = j7;
                    i13 = i17;
                    iMonoploid2 = iMonoploid2;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i18 = sampleCount;
                i = i13;
                int i19 = iMonoploid2;
                if (!zAttabal) {
                    decarock.triweekly.impromptu("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i9);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i9;
                    i2 = i16;
                    break;
                }
                if (stratoscopeVar7 != null) {
                    int iSeminary8 = i11 == true ? 1 : 0;
                    while (iSeminary8 == 0 && i12 > 0) {
                        iSeminary8 = stratoscopeVar7.seminary();
                        iMonoploid = stratoscopeVar7.monoploid();
                        i12--;
                    }
                    i11 = iSeminary8 - 1;
                }
                jArr5[i9] = j6;
                int nextSampleSize = dernVar.readNextSampleSize();
                iArrCopyOf[i9] = nextSampleSize;
                if (nextSampleSize > i15) {
                    i15 = nextSampleSize;
                }
                jArrCopyOf[i9] = j4 + ((long) iMonoploid);
                iArrCopyOf2[i9] = stratoscopeVar8 == null ? 1 : z2 ? 1 : 0;
                if (i9 == iSeminary7) {
                    iArrCopyOf2[i9] = 1;
                    iSeminary3--;
                    if (iSeminary3 > 0) {
                        iSeminary7 = ((stratoscope) decarock.attabal.marial(stratoscopeVar8)).seminary() - 1;
                    }
                }
                j4 += (long) i19;
                int iSeminary9 = i - 1;
                if (iSeminary9 != 0 || i14 <= 0) {
                    iMonoploid2 = i19;
                } else {
                    iSeminary9 = stratoscopeVar4.seminary();
                    i14--;
                    iMonoploid2 = stratoscopeVar4.monoploid();
                }
                i13 = iSeminary9;
                long j8 = j6 + ((long) iArrCopyOf[i9]);
                i10 = i16 - 1;
                i9++;
                j5 = j8;
                sampleCount = i18 == true ? 1 : 0;
            }
            j2 = j4 + ((long) iMonoploid);
            if (stratoscopeVar7 == null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i12 <= 0) {
                    z3 = true;
                    break;
                }
                if (stratoscopeVar7.seminary() != 0) {
                    z3 = z2 ? 1 : 0;
                    break;
                }
                stratoscopeVar7.monoploid();
                i12--;
            }
            if (iSeminary3 != 0 || i != 0 || i2 != 0 || i14 != 0 || i11 != 0 || !z3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                sb.append(molybdeniteVar.f33820attabal);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iSeminary3);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i2);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i14);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i11 == true ? 1 : 0 ? 1 : 0);
                sb.append(!z3 ? ", ctts invalid" : "");
                decarock.triweekly.impromptu("AtomParsers", sb.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r4 = i15 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j9 = j2;
        long jDeadwork = grimness.deadwork(j9, 1000000L, molybdeniteVar.f33824dern);
        long[] jArr6 = molybdeniteVar.f33825impromptu;
        if (jArr6 == null) {
            grimness.molet(jArrCopyOf, 1000000L, molybdeniteVar.f33824dern);
            return new dovishness(molybdeniteVar, jArr, iArr, r4 == true ? 1 : 0, jArrCopyOf, iArr2, jDeadwork);
        }
        int[] iArr10 = iArr;
        int i20 = sampleCount;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && molybdeniteVar.f33827saneness == 1 && jArrCopyOf.length >= 2) {
            long j10 = ((long[]) decarock.attabal.marial(molybdeniteVar.f33828taiyuan))[z2 ? 1 : 0];
            long jDeadwork2 = j10 + grimness.deadwork(molybdeniteVar.f33825impromptu[z2 ? 1 : 0], molybdeniteVar.f33824dern, molybdeniteVar.f33829wireman);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (saneness(jArr8, j9, j10, jDeadwork2)) {
                long jDeadwork3 = grimness.deadwork(j10 - jArrCopyOf[z2 ? 1 : 0], molybdeniteVar.f33821beachfront.f11219trm, molybdeniteVar.f33824dern);
                long jDeadwork4 = grimness.deadwork(j9 - jDeadwork2, molybdeniteVar.f33821beachfront.f11219trm, molybdeniteVar.f33824dern);
                if (jDeadwork3 != j || jDeadwork4 != j) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    if (jDeadwork3 <= 2147483647L && jDeadwork4 <= 2147483647L) {
                        stratoscopeVar.f24785attabal = (int) jDeadwork3;
                        stratoscopeVar.f24786saneness = (int) jDeadwork4;
                        grimness.molet(jArrCopyOf, 1000000L, molybdeniteVar.f33824dern);
                        return new dovishness(molybdeniteVar, jArr7, iArr11, r4 == true ? 1 : 0, jArrCopyOf, iArr2, grimness.deadwork(molybdeniteVar.f33825impromptu[z2 ? 1 : 0], 1000000L, molybdeniteVar.f33829wireman));
                    }
                }
            }
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j9 = j9;
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j9 = j9;
            jArr = jArr7;
            iArr3 = iArr11;
        }
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        long[] jArr9 = molybdeniteVar.f33825impromptu;
        if (jArr9.length == 1 && jArr9[z2 ? 1 : 0] == j) {
            long j11 = ((long[]) decarock.attabal.marial(molybdeniteVar.f33828taiyuan))[z2 ? 1 : 0];
            for (int i21 = z2 ? 1 : 0; i21 < jArrCopyOf.length; i21++) {
                jArrCopyOf[i21] = grimness.deadwork(jArrCopyOf[i21] - j11, 1000000L, molybdeniteVar.f33824dern);
            }
            return new dovishness(molybdeniteVar, jArr, iArr3, r4 == true ? 1 : 0, jArrCopyOf, iArr2, grimness.deadwork(j9 - j11, 1000000L, molybdeniteVar.f33824dern));
        }
        boolean z7 = molybdeniteVar.f33827saneness == 1 ? true : z2 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) decarock.attabal.marial(molybdeniteVar.f33828taiyuan);
        int i22 = z2 ? 1 : 0;
        boolean z8 = i22 == true ? 1 : 0;
        int i23 = z8 ? 1 : 0;
        int i24 = i23;
        boolean z9 = z8;
        while (true) {
            long[] jArr11 = molybdeniteVar.f33825impromptu;
            iArr4 = iArr13;
            if (i22 >= jArr11.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr12 = jArr10;
            long j12 = jArr12[i22];
            if (j12 != -1) {
                long j13 = jArr11[i22];
                i3 = i22;
                boolean z10 = z9 ? 1 : 0;
                long jDeadwork5 = grimness.deadwork(j13, molybdeniteVar.f33824dern, molybdeniteVar.f33829wireman);
                iArr7 = iArr14;
                iArr7[i3 == true ? 1 : 0] = grimness.competently(jArrCopyOf, j12, true, true);
                long j14 = j12 + jDeadwork5;
                z4 = z2;
                iArr4[i3 == true ? 1 : 0] = grimness.wireman(jArrCopyOf, j14, z7, z4);
                while (true) {
                    i4 = iArr7[i3 == true ? 1 : 0];
                    i5 = iArr4[i3 == true ? 1 : 0];
                    if (i4 >= i5 || (iArr2[i4] & 1) != 0) {
                        break;
                    }
                    iArr7[i3 == true ? 1 : 0] = i4 + 1;
                }
                i23 += i5 - i4;
                z9 = (z10 ? 1 : 0) | (i24 != i4 ? true : z4 ? 1 : 0);
                i24 = i5;
            } else {
                iArr7 = iArr14;
                i3 = i22;
                boolean z11 = z9 ? 1 : 0;
                z4 = z2;
            }
            jArr10 = jArr12;
            z2 = z4;
            iArr13 = iArr4;
            i22 = i3 + 1;
            iArr12 = iArr7;
            z9 = z9;
        }
        int[] iArr15 = iArr12;
        boolean z12 = z2;
        boolean z13 = (z9 ? 1 : 0 ? 1 : 0) | (i23 != i20 ? true : z12);
        long[] jArr13 = z13 != 0 ? new long[i23] : jArr;
        if (z13 != 0) {
            iArr6 = new int[i23];
        } else {
            iArr5 = iArr3;
        }
        if (z13 != 0) {
            iArr5 = iArr6;
            r4 = z12;
        }
        int[] iArr16 = z13 != 0 ? new int[i23] : iArr2;
        long[] jArr14 = new long[i23];
        ?? r12 = z12;
        long j15 = j;
        boolean z14 = z13;
        int[] iArr17 = iArr3;
        ?? r5 = r4;
        ?? r11 = z12;
        while (r11 < molybdeniteVar.f33825impromptu.length) {
            long j16 = molybdeniteVar.f33828taiyuan[r11];
            int i25 = iArr15[r11];
            boolean z15 = z14;
            int i26 = iArr4[r11];
            ?? r38 = r5;
            if (z15 != 0) {
                int i27 = i26 - i25;
                System.arraycopy(jArr, i25, jArr13, r12, i27);
                System.arraycopy(iArr17, i25, iArr5, r12, i27);
                System.arraycopy(iArr2, i25, iArr16, r12, i27);
            }
            int i28 = r38 == true ? 1 : 0;
            int[] iArr18 = iArr17;
            ?? r13 = r12;
            while (i25 < i26) {
                long[] jArr15 = jArr;
                int[] iArr19 = iArr18;
                long jDeadwork6 = grimness.deadwork(j15, 1000000L, molybdeniteVar.f33829wireman);
                long jDeadwork7 = grimness.deadwork(jArrCopyOf[i25] - j16, 1000000L, molybdeniteVar.f33824dern);
                int i29 = i26;
                long[] jArr16 = jArrCopyOf;
                if (dern(molybdeniteVar.f33827saneness)) {
                    j3 = j;
                    jDeadwork7 = Math.max(j3, jDeadwork7);
                } else {
                    j3 = j;
                }
                jArr14[r13] = jDeadwork6 + jDeadwork7;
                if (z15 != 0 && iArr5[r13] > i28) {
                    i28 = iArr19[i25];
                }
                i25++;
                j = j3;
                jArr = jArr15;
                iArr18 = iArr19;
                jArrCopyOf = jArr16;
                iArr2 = iArr2;
                i26 = i29;
                i28 = i28;
                r13++;
            }
            j15 += molybdeniteVar.f33825impromptu[r11];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z14 = z15;
            iArr17 = iArr18;
            r5 = i28;
            r11++;
            r12 = r13;
        }
        return new dovishness(molybdeniteVar, jArr13, iArr5, r5, jArr14, iArr16, grimness.deadwork(j15, 1000000L, molybdeniteVar.f33829wireman));
    }

    public static byte[] graveside(stratoscope stratoscopeVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            stratoscopeVar.mathsort(i3);
            int iMonoploid = stratoscopeVar.monoploid();
            if (stratoscopeVar.monoploid() == 1886547818) {
                return Arrays.copyOfRange(stratoscopeVar.marial(), i3, iMonoploid + i3);
            }
            i3 += iMonoploid;
        }
        return null;
    }

    public static int impassible(stratoscope stratoscopeVar) {
        stratoscopeVar.mathsort(16);
        return stratoscopeVar.monoploid();
    }

    public static androidx.media3.common.impromptu impromptu(stratoscope stratoscopeVar) {
        androidx.media3.common.impromptu.saneness sanenessVar = new androidx.media3.common.impromptu.saneness();
        cuirassed cuirassedVar = new cuirassed(stratoscopeVar.marial());
        cuirassedVar.arytenoidectomy(stratoscopeVar.beachfront() * 8);
        cuirassedVar.molybdenite(1);
        int iImpromptu = cuirassedVar.impromptu(3);
        cuirassedVar.polloi(6);
        boolean zCompetently = cuirassedVar.competently();
        boolean zCompetently2 = cuirassedVar.competently();
        if (iImpromptu == 2 && zCompetently) {
            sanenessVar.competently(zCompetently2 ? 12 : 10);
            sanenessVar.saneness(zCompetently2 ? 12 : 10);
        } else if (iImpromptu <= 2) {
            sanenessVar.competently(zCompetently ? 10 : 8);
            sanenessVar.saneness(zCompetently ? 10 : 8);
        }
        cuirassedVar.polloi(13);
        cuirassedVar.monoploid();
        int iImpromptu2 = cuirassedVar.impromptu(4);
        if (iImpromptu2 != 1) {
            decarock.triweekly.beachfront("AtomParsers", "Unsupported obu_type: " + iImpromptu2);
            return sanenessVar.attabal();
        }
        if (cuirassedVar.competently()) {
            decarock.triweekly.beachfront("AtomParsers", "Unsupported obu_extension_flag");
            return sanenessVar.attabal();
        }
        boolean zCompetently3 = cuirassedVar.competently();
        cuirassedVar.monoploid();
        if (zCompetently3 && cuirassedVar.impromptu(8) > 127) {
            decarock.triweekly.beachfront("AtomParsers", "Excessive obu_size");
            return sanenessVar.attabal();
        }
        int iImpromptu3 = cuirassedVar.impromptu(3);
        cuirassedVar.monoploid();
        if (cuirassedVar.competently()) {
            decarock.triweekly.beachfront("AtomParsers", "Unsupported reduced_still_picture_header");
            return sanenessVar.attabal();
        }
        if (cuirassedVar.competently()) {
            decarock.triweekly.beachfront("AtomParsers", "Unsupported timing_info_present_flag");
            return sanenessVar.attabal();
        }
        if (cuirassedVar.competently()) {
            decarock.triweekly.beachfront("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return sanenessVar.attabal();
        }
        int iImpromptu4 = cuirassedVar.impromptu(5);
        boolean z = false;
        for (int i = 0; i <= iImpromptu4; i++) {
            cuirassedVar.polloi(12);
            if (cuirassedVar.impromptu(5) > 7) {
                cuirassedVar.monoploid();
            }
        }
        int iImpromptu5 = cuirassedVar.impromptu(4);
        int iImpromptu6 = cuirassedVar.impromptu(4);
        cuirassedVar.polloi(iImpromptu5 + 1);
        cuirassedVar.polloi(iImpromptu6 + 1);
        if (cuirassedVar.competently()) {
            cuirassedVar.polloi(7);
        }
        cuirassedVar.polloi(7);
        boolean zCompetently4 = cuirassedVar.competently();
        if (zCompetently4) {
            cuirassedVar.polloi(2);
        }
        if ((cuirassedVar.competently() ? 2 : cuirassedVar.impromptu(1)) > 0 && !cuirassedVar.competently()) {
            cuirassedVar.polloi(1);
        }
        if (zCompetently4) {
            cuirassedVar.polloi(3);
        }
        cuirassedVar.polloi(3);
        boolean zCompetently5 = cuirassedVar.competently();
        if (iImpromptu3 == 2 && zCompetently5) {
            cuirassedVar.monoploid();
        }
        if (iImpromptu3 != 1 && cuirassedVar.competently()) {
            z = true;
        }
        if (cuirassedVar.competently()) {
            int iImpromptu7 = cuirassedVar.impromptu(8);
            int iImpromptu8 = cuirassedVar.impromptu(8);
            sanenessVar.wireman(androidx.media3.common.impromptu.apical(iImpromptu7)).dern(((z || iImpromptu7 != 1 || iImpromptu8 != 13 || cuirassedVar.impromptu(8) != 0) ? cuirassedVar.impromptu(1) : 1) != 1 ? 2 : 1).marial(androidx.media3.common.impromptu.formularize(iImpromptu8));
        }
        return sanenessVar.attabal();
    }

    public static Pair<Long, String> kowloon(stratoscope stratoscopeVar) {
        stratoscopeVar.mathsort(8);
        int iDern = nattier.attabal.dern(stratoscopeVar.monoploid());
        stratoscopeVar.splinterproof(iDern == 0 ? 8 : 16);
        long jMerc = stratoscopeVar.merc();
        stratoscopeVar.splinterproof(iDern == 0 ? 4 : 8);
        int iSaran = stratoscopeVar.saran();
        return Pair.create(Long.valueOf(jMerc), "" + ((char) (((iSaran >> 10) & 31) + 96)) + ((char) (((iSaran >> 5) & 31) + 96)) + ((char) ((iSaran & 31) + 96)));
    }

    public static int marial(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static float molybdenite(stratoscope stratoscopeVar, int i) {
        stratoscopeVar.mathsort(i + 8);
        return stratoscopeVar.seminary() / stratoscopeVar.seminary();
    }

    public static void monoploid(stratoscope stratoscopeVar, int i, int i2, int i3, wireman wiremanVar) {
        stratoscopeVar.mathsort(i2 + 16);
        if (i == 1835365492) {
            stratoscopeVar.stratoscope();
            String strStratoscope = stratoscopeVar.stratoscope();
            if (strStratoscope != null) {
                wiremanVar.f33858saneness = new androidx.media3.common.polloi.saneness().permissivist(i3).sensatory(strStratoscope).polder();
            }
        }
    }

    public static Metadata oilcan(stratoscope stratoscopeVar, int i) {
        stratoscopeVar.splinterproof(8);
        beachfront(stratoscopeVar);
        while (stratoscopeVar.beachfront() < i) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iMonoploid = stratoscopeVar.monoploid();
            if (stratoscopeVar.monoploid() == 1768715124) {
                stratoscopeVar.mathsort(iBeachfront);
                return triweekly(stratoscopeVar, iBeachfront + iMonoploid);
            }
            stratoscopeVar.mathsort(iBeachfront + iMonoploid);
        }
        return null;
    }

    public static Mp4TimestampData polloi(stratoscope stratoscopeVar) {
        long jCuirassed;
        long jCuirassed2;
        stratoscopeVar.mathsort(8);
        if (nattier.attabal.dern(stratoscopeVar.monoploid()) == 0) {
            jCuirassed = stratoscopeVar.merc();
            jCuirassed2 = stratoscopeVar.merc();
        } else {
            jCuirassed = stratoscopeVar.cuirassed();
            jCuirassed2 = stratoscopeVar.cuirassed();
        }
        return new Mp4TimestampData(jCuirassed, jCuirassed2, stratoscopeVar.merc());
    }

    public static void preprohormone(stratoscope stratoscopeVar, int i, int i2, int i3, int i4, String str, wireman wiremanVar) {
        stratoscopeVar.mathsort(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                stratoscopeVar.formularize(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                wiremanVar.f33859wireman = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        wiremanVar.f33858saneness = new androidx.media3.common.polloi.saneness().permissivist(i4).sensatory(str2).treadless(str).igbo(j).premeiotic(immutableListOf).polder();
    }

    public static wireman rotuma(stratoscope stratoscopeVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        stratoscopeVar.mathsort(12);
        int iMonoploid = stratoscopeVar.monoploid();
        wireman wiremanVar = new wireman(iMonoploid);
        int i3 = 0;
        while (i3 < iMonoploid) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iMonoploid2 = stratoscopeVar.monoploid();
            cybernatic.molybdenite.attabal(iMonoploid2 > 0, "childAtomSize must be positive");
            int iMonoploid3 = stratoscopeVar.monoploid();
            if (iMonoploid3 == 1635148593 || iMonoploid3 == 1635148595 || iMonoploid3 == 1701733238 || iMonoploid3 == 1831958048 || iMonoploid3 == 1836070006 || iMonoploid3 == 1752589105 || iMonoploid3 == 1751479857 || iMonoploid3 == 1932670515 || iMonoploid3 == 1211250227 || iMonoploid3 == 1987063864 || iMonoploid3 == 1987063865 || iMonoploid3 == 1635135537 || iMonoploid3 == 1685479798 || iMonoploid3 == 1685479729 || iMonoploid3 == 1685481573 || iMonoploid3 == 1685481521) {
                wireman wiremanVar2 = wiremanVar;
                int i4 = i3;
                yemenite(stratoscopeVar, iMonoploid3, iBeachfront, iMonoploid2, i, i2, drmInitData, wiremanVar2, i4);
                wiremanVar = wiremanVar2;
                i3 = i4;
            } else if (iMonoploid3 == 1836069985 || iMonoploid3 == 1701733217 || iMonoploid3 == 1633889587 || iMonoploid3 == 1700998451 || iMonoploid3 == 1633889588 || iMonoploid3 == 1835823201 || iMonoploid3 == 1685353315 || iMonoploid3 == 1685353317 || iMonoploid3 == 1685353320 || iMonoploid3 == 1685353324 || iMonoploid3 == 1685353336 || iMonoploid3 == 1935764850 || iMonoploid3 == 1935767394 || iMonoploid3 == 1819304813 || iMonoploid3 == 1936684916 || iMonoploid3 == 1953984371 || iMonoploid3 == 778924082 || iMonoploid3 == 778924083 || iMonoploid3 == 1835557169 || iMonoploid3 == 1835560241 || iMonoploid3 == 1634492771 || iMonoploid3 == 1634492791 || iMonoploid3 == 1970037111 || iMonoploid3 == 1332770163 || iMonoploid3 == 1716281667) {
                wireman wiremanVar3 = wiremanVar;
                competently(stratoscopeVar, iMonoploid3, iBeachfront, iMonoploid2, i, str, z, drmInitData, wiremanVar3, i3);
                wiremanVar = wiremanVar3;
            } else if (iMonoploid3 == 1414810956 || iMonoploid3 == 1954034535 || iMonoploid3 == 2004251764 || iMonoploid3 == 1937010800 || iMonoploid3 == 1664495672) {
                preprohormone(stratoscopeVar, iMonoploid3, iBeachfront, iMonoploid2, i, str, wiremanVar);
            } else if (iMonoploid3 == 1835365492) {
                monoploid(stratoscopeVar, iMonoploid3, iBeachfront, i, wiremanVar);
            } else if (iMonoploid3 == 1667329389) {
                wiremanVar.f33858saneness = new androidx.media3.common.polloi.saneness().permissivist(i).sensatory(MimeTypes.APPLICATION_CAMERA_MOTION).polder();
            }
            stratoscopeVar.mathsort(iBeachfront + iMonoploid2);
            i3++;
        }
        return wiremanVar;
    }

    public static boolean saneness(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[grimness.kowloon(4, 0, length)] && jArr[grimness.kowloon(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    public static Metadata sealless(stratoscope stratoscopeVar) {
        short sOilcan = stratoscopeVar.oilcan();
        stratoscopeVar.splinterproof(2);
        String strYemenite = stratoscopeVar.yemenite(sOilcan);
        int iMax = Math.max(strYemenite.lastIndexOf(43), strYemenite.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(strYemenite.substring(0, iMax)), Float.parseFloat(strYemenite.substring(iMax, strYemenite.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static List<dovishness> stratoscope(nattier.attabal.C0751attabal c0751attabal, cybernatic.stratoscope stratoscopeVar, long j, DrmInitData drmInitData, boolean z, boolean z2, com.google.common.base.marial<molybdenite, molybdenite> marialVar) throws ParserException {
        molybdenite molybdeniteVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0751attabal.f33701wireman.size(); i++) {
            nattier.attabal.C0751attabal c0751attabal2 = c0751attabal.f33701wireman.get(i);
            if (c0751attabal2.f33698attabal == 1953653099 && (molybdeniteVarApply = marialVar.apply(cuirassed(c0751attabal2, (nattier.attabal.saneness) decarock.attabal.marial(c0751attabal.competently(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(gintrap(molybdeniteVarApply, (nattier.attabal.C0751attabal) decarock.attabal.marial(((nattier.attabal.C0751attabal) decarock.attabal.marial(((nattier.attabal.C0751attabal) decarock.attabal.marial(c0751attabal2.beachfront(1835297121))).beachfront(1835626086))).beachfront(1937007212)), stratoscopeVar));
            }
        }
        return arrayList;
    }

    public static Pair<Integer, graveside> taiyuan(stratoscope stratoscopeVar, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String strYemenite = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            stratoscopeVar.mathsort(i3);
            int iMonoploid = stratoscopeVar.monoploid();
            int iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid2 == 1718775137) {
                numValueOf = Integer.valueOf(stratoscopeVar.monoploid());
            } else if (iMonoploid2 == 1935894637) {
                stratoscopeVar.splinterproof(4);
                strYemenite = stratoscopeVar.yemenite(4);
            } else if (iMonoploid2 == 1935894633) {
                i4 = i3;
                i5 = iMonoploid;
            }
            i3 += iMonoploid;
        }
        if (!C.CENC_TYPE_cenc.equals(strYemenite) && !C.CENC_TYPE_cbc1.equals(strYemenite) && !C.CENC_TYPE_cens.equals(strYemenite) && !C.CENC_TYPE_cbcs.equals(strYemenite)) {
            return null;
        }
        cybernatic.molybdenite.attabal(numValueOf != null, "frma atom is mandatory");
        cybernatic.molybdenite.attabal(i4 != -1, "schi atom is mandatory");
        graveside gravesideVarDovishness = dovishness(stratoscopeVar, i4, i5, strYemenite);
        cybernatic.molybdenite.attabal(gravesideVarDovishness != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (graveside) grimness.impromptu(gravesideVarDovishness));
    }

    public static Metadata triweekly(stratoscope stratoscopeVar, int i) {
        stratoscopeVar.splinterproof(8);
        ArrayList arrayList = new ArrayList();
        while (stratoscopeVar.beachfront() < i) {
            Metadata.Entry entryDern = cutely.dern(stratoscopeVar);
            if (entryDern != null) {
                arrayList.add(entryDern);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata trm(nattier.attabal.saneness sanenessVar) {
        stratoscope stratoscopeVar = sanenessVar.f33702saneness;
        stratoscopeVar.mathsort(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (stratoscopeVar.attabal() >= 8) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iMonoploid = stratoscopeVar.monoploid();
            int iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid2 == 1835365473) {
                stratoscopeVar.mathsort(iBeachfront);
                metadata = metadata.saneness(oilcan(stratoscopeVar, iBeachfront + iMonoploid));
            } else if (iMonoploid2 == 1936553057) {
                stratoscopeVar.mathsort(iBeachfront);
                metadata = metadata.saneness(monoploid.saneness(stratoscopeVar, iBeachfront + iMonoploid));
            } else if (iMonoploid2 == -1451722374) {
                metadata = metadata.saneness(sealless(stratoscopeVar));
            }
            stratoscopeVar.mathsort(iBeachfront + iMonoploid);
        }
        return metadata;
    }

    public static int wireman(stratoscope stratoscopeVar, int i, int i2, int i3) throws ParserException {
        int iBeachfront = stratoscopeVar.beachfront();
        cybernatic.molybdenite.attabal(iBeachfront >= i2, null);
        while (iBeachfront - i2 < i3) {
            stratoscopeVar.mathsort(iBeachfront);
            int iMonoploid = stratoscopeVar.monoploid();
            cybernatic.molybdenite.attabal(iMonoploid > 0, "childAtomSize must be positive");
            if (stratoscopeVar.monoploid() == i) {
                return iBeachfront;
            }
            iBeachfront += iMonoploid;
        }
        return -1;
    }

    public static void yemenite(stratoscope stratoscopeVar, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, wireman wiremanVar, int i6) throws ParserException {
        String str;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i3;
        DrmInitData drmInitDataSaneness = drmInitData;
        wireman wiremanVar2 = wiremanVar;
        stratoscopeVar.mathsort(i10 + 16);
        stratoscopeVar.splinterproof(16);
        int iSaran = stratoscopeVar.saran();
        int iSaran2 = stratoscopeVar.saran();
        stratoscopeVar.splinterproof(50);
        int iBeachfront = stratoscopeVar.beachfront();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, graveside> pairAdultoid = adultoid(stratoscopeVar, i10, i11);
            if (pairAdultoid != null) {
                iIntValue = ((Integer) pairAdultoid.first).intValue();
                drmInitDataSaneness = drmInitDataSaneness == null ? null : drmInitDataSaneness.saneness(((graveside) pairAdultoid.second).f33720saneness);
                wiremanVar2.f33856attabal[i6] = (graveside) pairAdultoid.second;
            }
            stratoscopeVar.mathsort(iBeachfront);
        }
        String str2 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float fMolybdenite = 1.0f;
        int i12 = 8;
        int i13 = 8;
        List<byte[]> listOf = null;
        String str3 = null;
        byte[] bArrGraveside = null;
        int i14 = -1;
        int i15 = -1;
        int iApical = -1;
        int i16 = -1;
        int iFormularize = -1;
        ByteBuffer byteBufferAttabal = null;
        C0752saneness c0752sanenessApical = null;
        boolean z = false;
        while (iBeachfront - i10 < i11) {
            stratoscopeVar.mathsort(iBeachfront);
            int iBeachfront2 = stratoscopeVar.beachfront();
            int iMonoploid = stratoscopeVar.monoploid();
            if (iMonoploid == 0 && stratoscopeVar.beachfront() - i10 == i11) {
                break;
            }
            cybernatic.molybdenite.attabal(iMonoploid > 0, "childAtomSize must be positive");
            int iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid2 == 1635148611) {
                cybernatic.molybdenite.attabal(str == null, null);
                stratoscopeVar.mathsort(iBeachfront2 + 8);
                cybernatic.wireman wiremanVarSaneness = cybernatic.wireman.saneness(stratoscopeVar);
                List<byte[]> list = wiremanVarSaneness.f24810attabal;
                wiremanVar2.f33857dern = wiremanVarSaneness.f24818saneness;
                if (!z) {
                    fMolybdenite = wiremanVarSaneness.f24809apical;
                }
                String str4 = wiremanVarSaneness.f24815formularize;
                int i17 = wiremanVarSaneness.f24813cutely;
                int i18 = wiremanVarSaneness.f24812competently;
                int i19 = wiremanVarSaneness.f24816impromptu;
                int i20 = wiremanVarSaneness.f24819taiyuan;
                int i21 = wiremanVarSaneness.f24817marial;
                drmInitDataSaneness = drmInitDataSaneness;
                iBeachfront = iBeachfront;
                iIntValue = iIntValue;
                str2 = str2;
                i15 = i17;
                iApical = i18;
                i16 = i19;
                iFormularize = i20;
                i13 = wiremanVarSaneness.f24811beachfront;
                i12 = i21;
                listOf = list;
                str = "video/avc";
                str3 = str4;
            } else if (iMonoploid2 == 1752589123) {
                cybernatic.molybdenite.attabal(str == null, null);
                stratoscopeVar.mathsort(iBeachfront2 + 8);
                trm trmVarAttabal = trm.attabal(stratoscopeVar);
                List<byte[]> list2 = trmVarAttabal.f24798attabal;
                wiremanVar2.f33857dern = trmVarAttabal.f24806saneness;
                if (!z) {
                    fMolybdenite = trmVarAttabal.f24801cutely;
                }
                int i22 = trmVarAttabal.f24797apical;
                String str5 = trmVarAttabal.f24803formularize;
                int i23 = trmVarAttabal.f24800competently;
                drmInitDataSaneness = drmInitDataSaneness;
                iBeachfront = iBeachfront;
                i15 = i22;
                iIntValue = iIntValue;
                str2 = str2;
                iApical = i23;
                i16 = trmVarAttabal.f24804impromptu;
                iFormularize = trmVarAttabal.f24807taiyuan;
                str = "video/hevc";
                i12 = trmVarAttabal.f24805marial;
                str3 = str5;
                listOf = list2;
                i13 = trmVarAttabal.f24799beachfront;
            } else {
                if (iMonoploid2 == 1685480259 || iMonoploid2 == 1685485123) {
                    drmInitDataSaneness = drmInitDataSaneness;
                    iBeachfront = iBeachfront;
                    iIntValue = iIntValue;
                    str2 = str2;
                    i7 = i12;
                    i8 = iApical;
                    i9 = iFormularize;
                    cybernatic.triweekly triweeklyVarAttabal = cybernatic.triweekly.attabal(stratoscopeVar);
                    if (triweeklyVarAttabal != null) {
                        str = "video/dolby-vision";
                        str3 = triweeklyVarAttabal.f24795dern;
                    }
                } else if (iMonoploid2 == 1987076931) {
                    cybernatic.molybdenite.attabal(str == null, null);
                    String str6 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                    stratoscopeVar.mathsort(iBeachfront2 + 12);
                    stratoscopeVar.splinterproof(2);
                    int iSupplicat = stratoscopeVar.supplicat();
                    int i24 = iSupplicat >> 4;
                    boolean z2 = (iSupplicat & 1) != 0;
                    int iSupplicat2 = stratoscopeVar.supplicat();
                    int iSupplicat3 = stratoscopeVar.supplicat();
                    iApical = androidx.media3.common.impromptu.apical(iSupplicat2);
                    i16 = z2 ? 1 : 2;
                    iFormularize = androidx.media3.common.impromptu.formularize(iSupplicat3);
                    drmInitDataSaneness = drmInitDataSaneness;
                    iBeachfront = iBeachfront;
                    i12 = i24;
                    i13 = i12;
                    iIntValue = iIntValue;
                    str2 = str2;
                    str = str6;
                } else if (iMonoploid2 == 1635135811) {
                    int i25 = iMonoploid - 8;
                    byte[] bArr = new byte[i25];
                    stratoscopeVar.formularize(bArr, 0, i25);
                    listOf = ImmutableList.of(bArr);
                    stratoscopeVar.mathsort(iBeachfront2 + 8);
                    androidx.media3.common.impromptu impromptuVarImpromptu = impromptu(stratoscopeVar);
                    int i26 = impromptuVarImpromptu.f10970marial;
                    int i27 = impromptuVarImpromptu.f10967beachfront;
                    int i28 = impromptuVarImpromptu.f10966attabal;
                    int i29 = impromptuVarImpromptu.f10971saneness;
                    iFormularize = impromptuVarImpromptu.f10969dern;
                    drmInitDataSaneness = drmInitDataSaneness;
                    iBeachfront = iBeachfront;
                    iIntValue = iIntValue;
                    str2 = str2;
                    iApical = i28;
                    i16 = i29;
                    str = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                    i12 = i26;
                    i13 = i27;
                } else if (iMonoploid2 == 1668050025) {
                    if (byteBufferAttabal == null) {
                        byteBufferAttabal = attabal();
                    }
                    ByteBuffer byteBuffer = byteBufferAttabal;
                    byteBuffer.position(21);
                    byteBuffer.putShort(stratoscopeVar.oilcan());
                    byteBuffer.putShort(stratoscopeVar.oilcan());
                    byteBufferAttabal = byteBuffer;
                } else if (iMonoploid2 == 1835295606) {
                    if (byteBufferAttabal == null) {
                        byteBufferAttabal = attabal();
                    }
                    ByteBuffer byteBuffer2 = byteBufferAttabal;
                    short sOilcan = stratoscopeVar.oilcan();
                    short sOilcan2 = stratoscopeVar.oilcan();
                    short sOilcan3 = stratoscopeVar.oilcan();
                    short sOilcan4 = stratoscopeVar.oilcan();
                    short sOilcan5 = stratoscopeVar.oilcan();
                    short sOilcan6 = stratoscopeVar.oilcan();
                    short sOilcan7 = stratoscopeVar.oilcan();
                    int i30 = i12;
                    short sOilcan8 = stratoscopeVar.oilcan();
                    long jMerc = stratoscopeVar.merc();
                    long jMerc2 = stratoscopeVar.merc();
                    byteBuffer2.position(1);
                    byteBuffer2.putShort(sOilcan5);
                    byteBuffer2.putShort(sOilcan6);
                    byteBuffer2.putShort(sOilcan);
                    byteBuffer2.putShort(sOilcan2);
                    byteBuffer2.putShort(sOilcan3);
                    byteBuffer2.putShort(sOilcan4);
                    byteBuffer2.putShort(sOilcan7);
                    byteBuffer2.putShort(sOilcan8);
                    byteBuffer2.putShort((short) (jMerc / Ua.s));
                    byteBuffer2.putShort((short) (jMerc2 / Ua.s));
                    byteBufferAttabal = byteBuffer2;
                    i12 = i30;
                } else {
                    drmInitDataSaneness = drmInitDataSaneness;
                    iBeachfront = iBeachfront;
                    iIntValue = iIntValue;
                    str2 = str2;
                    i7 = i12;
                    if (iMonoploid2 == 1681012275) {
                        cybernatic.molybdenite.attabal(str == null, null);
                        str = str2;
                    } else if (iMonoploid2 == 1702061171) {
                        cybernatic.molybdenite.attabal(str == null, null);
                        c0752sanenessApical = apical(stratoscopeVar, iBeachfront2);
                        String str7 = c0752sanenessApical.f33852attabal;
                        byte[] bArr2 = c0752sanenessApical.f33854saneness;
                        if (bArr2 != null) {
                            listOf = ImmutableList.of(bArr2);
                        }
                        str = str7;
                    } else if (iMonoploid2 == 1885434736) {
                        fMolybdenite = molybdenite(stratoscopeVar, iBeachfront2);
                        i12 = i7;
                        z = true;
                    } else if (iMonoploid2 == 1937126244) {
                        bArrGraveside = graveside(stratoscopeVar, iBeachfront2, iMonoploid);
                    } else if (iMonoploid2 == 1936995172) {
                        int iSupplicat4 = stratoscopeVar.supplicat();
                        stratoscopeVar.splinterproof(3);
                        if (iSupplicat4 == 0) {
                            int iSupplicat5 = stratoscopeVar.supplicat();
                            if (iSupplicat5 == 0) {
                                i14 = 0;
                            } else if (iSupplicat5 == 1) {
                                i14 = 1;
                            } else if (iSupplicat5 == 2) {
                                i14 = 2;
                            } else if (iSupplicat5 == 3) {
                                i14 = 3;
                            }
                        }
                    } else {
                        i8 = iApical;
                        if (iMonoploid2 == 1668246642) {
                            i9 = iFormularize;
                            if (i8 == -1 && i9 == -1) {
                                int iMonoploid3 = stratoscopeVar.monoploid();
                                if (iMonoploid3 == 1852009592 || iMonoploid3 == 1852009571) {
                                    int iSaran3 = stratoscopeVar.saran();
                                    int iSaran4 = stratoscopeVar.saran();
                                    stratoscopeVar.splinterproof(2);
                                    boolean z3 = iMonoploid == 19 && (stratoscopeVar.supplicat() & 128) != 0;
                                    iApical = androidx.media3.common.impromptu.apical(iSaran3);
                                    i16 = z3 ? 1 : 2;
                                    iFormularize = androidx.media3.common.impromptu.formularize(iSaran4);
                                } else {
                                    decarock.triweekly.impromptu("AtomParsers", "Unsupported color type: " + nattier.attabal.attabal(iMonoploid3));
                                }
                            }
                            i12 = i7;
                        } else {
                            i9 = iFormularize;
                        }
                    }
                    i12 = i7;
                }
                iFormularize = i9;
                iApical = i8;
                i12 = i7;
            }
            iBeachfront += iMonoploid;
            i10 = i2;
            i11 = i3;
            wiremanVar2 = wiremanVar;
            iIntValue = iIntValue;
            str2 = str2;
            drmInitDataSaneness = drmInitDataSaneness;
        }
        DrmInitData drmInitData2 = drmInitDataSaneness;
        int i31 = i12;
        int i32 = iApical;
        int i33 = iFormularize;
        if (str == null) {
            return;
        }
        androidx.media3.common.polloi.saneness sanenessVarCreditor = new androidx.media3.common.polloi.saneness().permissivist(i4).sensatory(str).privatdozent(str3).palmyra(iSaran).dent(iSaran2).sayid(fMolybdenite).czestochowa(i5).empress(bArrGraveside).wostteth(i14).premeiotic(listOf).coffeecake(i15).mathsort(drmInitData2).creditor(new androidx.media3.common.impromptu.saneness().wireman(i32).dern(i16).marial(i33).beachfront(byteBufferAttabal != null ? byteBufferAttabal.array() : null).competently(i31).saneness(i13).attabal());
        if (c0752sanenessApical != null) {
            sanenessVarCreditor.grimness(Ints.formularize(c0752sanenessApical.f33853dern)).lotta(Ints.formularize(c0752sanenessApical.f33855wireman));
        }
        wiremanVar.f33858saneness = sanenessVarCreditor.polder();
    }
}
