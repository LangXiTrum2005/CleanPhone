package tectonization;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public static final wireman[] f38680coffeecake;

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public static final HashSet<String> f38681coi;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public static final wireman[] f38685cultivated;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f38686czestochowa;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public static final wireman[] f38687dent;

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public static final HashMap<String, wireman>[] f38689empress;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name */
    public static final Pattern f38692gusty;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name */
    public static final Pattern f38694igbo;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public static final wireman[] f38695itchy;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public static final wireman[] f38697lerp;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public static final wireman[] f38698lotta;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public static SimpleDateFormat f38699mathsort;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public static final wireman f38701milliradian;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public static final wireman[][] f38702nosophobia;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public static SimpleDateFormat f38705peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public static final wireman[] f38706permissivist;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name */
    public static final Pattern f38707picketboat;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public static final wireman[] f38709premeiotic;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name */
    public static final byte[] f38711preterite;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public static final HashMap<Integer, wireman>[] f38716sayid;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
    public static final Charset f38719sensatory;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public static final wireman[] f38724timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public static final wireman[] f38725treadless;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
    public static final byte[] f38727underbelly;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
    public static final Pattern f38729wostteth;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f38731apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f38732arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f38733attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final HashMap<String, dern>[] f38734beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Set<Integer> f38735competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f38736cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public AssetManager.AssetInputStream f38737dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f38738formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f38739graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f38740impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public ByteOrder f38741impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f38742kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f38743marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f38744molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f38745monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f38746polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public FileDescriptor f38747saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f38748taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public byte[] f38749triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f38750wireman;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final boolean f38678adultoid = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final List<Integer> f38688dovishness = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final List<Integer> f38690gintrap = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final int[] f38714rotuma = {8, 8, 8};

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final int[] f38710preprohormone = {4};

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final int[] f38682cord = {8};

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final byte[] f38684cuirassed = {-1, -40, -1};

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final byte[] f38722stratoscope = {102, 116, 121, 112};

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final byte[] f38726trm = {109, 105, 102, 49};

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final byte[] f38703oilcan = {104, 101, 105, 99};

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final byte[] f38730yemenite = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final byte[] f38717sealless = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final byte[] f38696kattegat = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final byte[] f38723supplicat = {101, 88, 73, 102};

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public static final byte[] f38713restrictive = {73, 72, 68, 82};

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final byte[] f38700merc = {73, 69, 78, 68};

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final byte[] f38708polder = {82, 73, 70, 70};

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final byte[] f38718seminary = {87, 69, 66, 80};

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public static final byte[] f38691grimness = {69, 88, 73, 70};

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public static final byte[] f38715saran = {-99, 1, 42};

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public static final byte[] f38712privatdozent = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public static final byte[] f38683creditor = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public static final byte[] f38721starveling = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public static final byte[] f38693hydrovane = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public static final byte[] f38728walach = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public static final String[] f38720splinterproof = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public static final int[] f38704overspeculate = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public static final byte[] f38679clubfoot = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f38754attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f38755dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f38756saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final byte[] f38757wireman;

        public dern(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static dern attabal(String str) {
            byte[] bytes = (str + (char) 0).getBytes(attabal.f38719sensatory);
            return new dern(2, bytes.length, bytes);
        }

        public static dern beachfront(int i, ByteOrder byteOrder) {
            return competently(new int[]{i}, byteOrder);
        }

        public static dern competently(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[attabal.f38704overspeculate[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new dern(3, iArr.length, byteBufferWrap.array());
        }

        public static dern dern(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[attabal.f38704overspeculate[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new dern(4, jArr.length, byteBufferWrap.array());
        }

        public static dern marial(marial[] marialVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[attabal.f38704overspeculate[5] * marialVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (marial marialVar : marialVarArr) {
                byteBufferWrap.putInt((int) marialVar.f38758attabal);
                byteBufferWrap.putInt((int) marialVar.f38759saneness);
            }
            return new dern(5, marialVarArr.length, byteBufferWrap.array());
        }

        public static dern saneness(long j, ByteOrder byteOrder) {
            return dern(new long[]{j}, byteOrder);
        }

        public static dern wireman(marial marialVar, ByteOrder byteOrder) {
            return marial(new marial[]{marialVar}, byteOrder);
        }

        public Object apical(ByteOrder byteOrder) throws Throwable {
            saneness sanenessVar;
            byte b;
            byte b2;
            saneness sanenessVar2 = null;
            try {
                sanenessVar = new saneness(this.f38757wireman);
                try {
                    sanenessVar.dern(byteOrder);
                    int length = 0;
                    switch (this.f38754attabal) {
                        case 1:
                        case 6:
                            byte[] bArr = this.f38757wireman;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                String str = new String(bArr, attabal.f38719sensatory);
                                try {
                                    sanenessVar.close();
                                    break;
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f38756saneness >= attabal.f38679clubfoot.length) {
                                int i = 0;
                                while (true) {
                                    byte[] bArr2 = attabal.f38679clubfoot;
                                    if (i >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (this.f38757wireman[i] == bArr2[i]) {
                                        i++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.f38756saneness && (b2 = this.f38757wireman[length]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string = sb.toString();
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return string;
                        case 3:
                            int[] iArr = new int[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                iArr[length] = sanenessVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                jArr[length] = sanenessVar.saneness();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            marial[] marialVarArr = new marial[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                marialVarArr[length] = new marial(sanenessVar.saneness(), sanenessVar.saneness());
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused6) {
                            }
                            return marialVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                iArr2[length] = sanenessVar.readShort();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                iArr3[length] = sanenessVar.readInt();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            marial[] marialVarArr2 = new marial[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                marialVarArr2[length] = new marial(sanenessVar.readInt(), sanenessVar.readInt());
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused9) {
                            }
                            return marialVarArr2;
                        case 11:
                            double[] dArr = new double[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                dArr[length] = sanenessVar.readFloat();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f38756saneness];
                            while (length < this.f38756saneness) {
                                dArr2[length] = sanenessVar.readDouble();
                                length++;
                            }
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                sanenessVar.close();
                                break;
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (sanenessVar != null) {
                        try {
                            sanenessVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    sanenessVar2 = sanenessVar;
                    if (sanenessVar2 != null) {
                        try {
                            sanenessVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                sanenessVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public String cutely(ByteOrder byteOrder) throws Throwable {
            Object objApical = apical(byteOrder);
            if (objApical == null) {
                return null;
            }
            if (objApical instanceof String) {
                return (String) objApical;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objApical instanceof long[]) {
                long[] jArr = (long[]) objApical;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objApical instanceof int[]) {
                int[] iArr = (int[]) objApical;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objApical instanceof double[]) {
                double[] dArr = (double[]) objApical;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objApical instanceof marial[])) {
                return null;
            }
            marial[] marialVarArr = (marial[]) objApical;
            while (i < marialVarArr.length) {
                sb.append(marialVarArr[i].f38758attabal);
                sb.append('/');
                sb.append(marialVarArr[i].f38759saneness);
                i++;
                if (i != marialVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public double impromptu(ByteOrder byteOrder) throws Throwable {
            Object objApical = apical(byteOrder);
            if (objApical == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objApical instanceof String) {
                return Double.parseDouble((String) objApical);
            }
            if (objApical instanceof long[]) {
                long[] jArr = (long[]) objApical;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objApical instanceof int[]) {
                int[] iArr = (int[]) objApical;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objApical instanceof double[]) {
                double[] dArr = (double[]) objApical;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objApical instanceof marial[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            marial[] marialVarArr = (marial[]) objApical;
            if (marialVarArr.length == 1) {
                return marialVarArr[0].attabal();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int taiyuan(ByteOrder byteOrder) throws Throwable {
            Object objApical = apical(byteOrder);
            if (objApical == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objApical instanceof String) {
                return Integer.parseInt((String) objApical);
            }
            if (objApical instanceof long[]) {
                long[] jArr = (long[]) objApical;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objApical instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objApical;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String toString() {
            return "(" + attabal.f38720splinterproof[this.f38754attabal] + ", data length:" + this.f38757wireman.length + ")";
        }

        public dern(int i, int i2, long j, byte[] bArr) {
            this.f38754attabal = i;
            this.f38756saneness = i2;
            this.f38755dern = j;
            this.f38757wireman = bArr;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f38758attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f38759saneness;

        public marial(long j, long j2) {
            if (j2 == 0) {
                this.f38758attabal = 0L;
                this.f38759saneness = 1L;
            } else {
                this.f38758attabal = j;
                this.f38759saneness = j2;
            }
        }

        public double attabal() {
            return this.f38758attabal / this.f38759saneness;
        }

        public String toString() {
            return this.f38758attabal + "/" + this.f38759saneness;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class saneness extends InputStream implements DataInput {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public ByteOrder f38762arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final DataInputStream f38763kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f38764monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public byte[] f38765polloi;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public static final ByteOrder f38761molybdenite = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public static final ByteOrder f38760graveside = ByteOrder.BIG_ENDIAN;

        public saneness(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int attabal() {
            return this.f38764monoploid;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f38763kowloon.available();
        }

        public void dern(ByteOrder byteOrder) {
            this.f38762arytenoidectomy = byteOrder;
        }

        public void marial(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f38763kowloon.skip(i3);
                if (iSkip <= 0) {
                    if (this.f38765polloi == null) {
                        this.f38765polloi = new byte[8192];
                    }
                    iSkip = this.f38763kowloon.read(this.f38765polloi, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.f38764monoploid += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f38764monoploid++;
            return this.f38763kowloon.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f38764monoploid++;
            return this.f38763kowloon.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f38764monoploid++;
            int i = this.f38763kowloon.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f38764monoploid += 2;
            return this.f38763kowloon.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f38764monoploid += i2;
            this.f38763kowloon.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f38764monoploid += 4;
            int i = this.f38763kowloon.read();
            int i2 = this.f38763kowloon.read();
            int i3 = this.f38763kowloon.read();
            int i4 = this.f38763kowloon.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38762arytenoidectomy;
            if (byteOrder == f38761molybdenite) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f38760graveside) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f38762arytenoidectomy);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f38764monoploid += 8;
            int i = this.f38763kowloon.read();
            int i2 = this.f38763kowloon.read();
            int i3 = this.f38763kowloon.read();
            int i4 = this.f38763kowloon.read();
            int i5 = this.f38763kowloon.read();
            int i6 = this.f38763kowloon.read();
            int i7 = this.f38763kowloon.read();
            int i8 = this.f38763kowloon.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38762arytenoidectomy;
            if (byteOrder == f38761molybdenite) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f38760graveside) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            throw new IOException("Invalid byte order: " + this.f38762arytenoidectomy);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f38764monoploid += 2;
            int i = this.f38763kowloon.read();
            int i2 = this.f38763kowloon.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38762arytenoidectomy;
            if (byteOrder == f38761molybdenite) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f38760graveside) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f38762arytenoidectomy);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f38764monoploid += 2;
            return this.f38763kowloon.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f38764monoploid++;
            return this.f38763kowloon.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f38764monoploid += 2;
            int i = this.f38763kowloon.read();
            int i2 = this.f38763kowloon.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38762arytenoidectomy;
            if (byteOrder == f38761molybdenite) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f38760graveside) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f38762arytenoidectomy);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public long saneness() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public saneness(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public saneness(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f38762arytenoidectomy = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f38763kowloon = dataInputStream;
            dataInputStream.mark(0);
            this.f38764monoploid = 0;
            this.f38762arytenoidectomy = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f38763kowloon.read(bArr, i, i2);
            this.f38764monoploid += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f38764monoploid += bArr.length;
            this.f38763kowloon.readFully(bArr);
        }
    }

    static {
        wireman[] wiremanVarArr = {new wireman("NewSubfileType", 254, 4), new wireman("SubfileType", 255, 4), new wireman("ImageWidth", 256, 3, 4), new wireman("ImageLength", 257, 3, 4), new wireman("BitsPerSample", 258, 3), new wireman("Compression", 259, 3), new wireman("PhotometricInterpretation", 262, 3), new wireman("ImageDescription", 270, 2), new wireman("Make", 271, 2), new wireman("Model", 272, 2), new wireman("StripOffsets", 273, 3, 4), new wireman("Orientation", 274, 3), new wireman("SamplesPerPixel", 277, 3), new wireman("RowsPerStrip", 278, 3, 4), new wireman("StripByteCounts", 279, 3, 4), new wireman("XResolution", 282, 5), new wireman("YResolution", 283, 5), new wireman("PlanarConfiguration", 284, 3), new wireman("ResolutionUnit", 296, 3), new wireman("TransferFunction", 301, 3), new wireman("Software", Sdk$SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new wireman("DateTime", 306, 2), new wireman("Artist", Sdk$SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new wireman("WhitePoint", Sdk$SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new wireman("PrimaryChromaticities", Sdk$SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new wireman("SubIFDPointer", 330, 4), new wireman("JPEGInterchangeFormat", 513, 4), new wireman("JPEGInterchangeFormatLength", 514, 4), new wireman("YCbCrCoefficients", 529, 5), new wireman("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new wireman("YCbCrPositioning", 531, 3), new wireman("ReferenceBlackWhite", 532, 5), new wireman("Copyright", 33432, 2), new wireman("ExifIFDPointer", 34665, 4), new wireman("GPSInfoIFDPointer", 34853, 4), new wireman("SensorTopBorder", 4, 4), new wireman("SensorLeftBorder", 5, 4), new wireman("SensorBottomBorder", 6, 4), new wireman("SensorRightBorder", 7, 4), new wireman("ISO", 23, 3), new wireman("JpgFromRaw", 46, 7), new wireman("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        f38687dent = wiremanVarArr;
        wireman[] wiremanVarArr2 = {new wireman("ExposureTime", 33434, 5), new wireman("FNumber", 33437, 5), new wireman("ExposureProgram", 34850, 3), new wireman("SpectralSensitivity", 34852, 2), new wireman("PhotographicSensitivity", 34855, 3), new wireman("OECF", 34856, 7), new wireman("SensitivityType", 34864, 3), new wireman("StandardOutputSensitivity", 34865, 4), new wireman("RecommendedExposureIndex", 34866, 4), new wireman("ISOSpeed", 34867, 4), new wireman("ISOSpeedLatitudeyyy", 34868, 4), new wireman("ISOSpeedLatitudezzz", 34869, 4), new wireman("ExifVersion", 36864, 2), new wireman("DateTimeOriginal", 36867, 2), new wireman("DateTimeDigitized", 36868, 2), new wireman("OffsetTime", 36880, 2), new wireman("OffsetTimeOriginal", 36881, 2), new wireman("OffsetTimeDigitized", 36882, 2), new wireman("ComponentsConfiguration", 37121, 7), new wireman("CompressedBitsPerPixel", 37122, 5), new wireman("ShutterSpeedValue", 37377, 10), new wireman("ApertureValue", 37378, 5), new wireman("BrightnessValue", 37379, 10), new wireman("ExposureBiasValue", 37380, 10), new wireman("MaxApertureValue", 37381, 5), new wireman("SubjectDistance", 37382, 5), new wireman("MeteringMode", 37383, 3), new wireman("LightSource", 37384, 3), new wireman("Flash", 37385, 3), new wireman("FocalLength", 37386, 5), new wireman("SubjectArea", 37396, 3), new wireman("MakerNote", 37500, 7), new wireman("UserComment", 37510, 7), new wireman("SubSecTime", 37520, 2), new wireman("SubSecTimeOriginal", 37521, 2), new wireman("SubSecTimeDigitized", 37522, 2), new wireman("FlashpixVersion", 40960, 7), new wireman("ColorSpace", 40961, 3), new wireman("PixelXDimension", 40962, 3, 4), new wireman("PixelYDimension", 40963, 3, 4), new wireman("RelatedSoundFile", 40964, 2), new wireman("InteroperabilityIFDPointer", 40965, 4), new wireman("FlashEnergy", 41483, 5), new wireman("SpatialFrequencyResponse", 41484, 7), new wireman("FocalPlaneXResolution", 41486, 5), new wireman("FocalPlaneYResolution", 41487, 5), new wireman("FocalPlaneResolutionUnit", 41488, 3), new wireman("SubjectLocation", 41492, 3), new wireman("ExposureIndex", 41493, 5), new wireman("SensingMethod", 41495, 3), new wireman("FileSource", 41728, 7), new wireman("SceneType", 41729, 7), new wireman("CFAPattern", 41730, 7), new wireman("CustomRendered", 41985, 3), new wireman("ExposureMode", 41986, 3), new wireman("WhiteBalance", 41987, 3), new wireman("DigitalZoomRatio", 41988, 5), new wireman("FocalLengthIn35mmFilm", 41989, 3), new wireman("SceneCaptureType", 41990, 3), new wireman("GainControl", 41991, 3), new wireman("Contrast", 41992, 3), new wireman("Saturation", 41993, 3), new wireman("Sharpness", 41994, 3), new wireman("DeviceSettingDescription", 41995, 7), new wireman("SubjectDistanceRange", 41996, 3), new wireman("ImageUniqueID", 42016, 2), new wireman("CameraOwnerName", 42032, 2), new wireman("BodySerialNumber", 42033, 2), new wireman("LensSpecification", 42034, 5), new wireman("LensMake", 42035, 2), new wireman("LensModel", 42036, 2), new wireman("Gamma", 42240, 5), new wireman("DNGVersion", 50706, 1), new wireman("DefaultCropSize", 50720, 3, 4)};
        f38706permissivist = wiremanVarArr2;
        wireman[] wiremanVarArr3 = {new wireman("GPSVersionID", 0, 1), new wireman("GPSLatitudeRef", 1, 2), new wireman("GPSLatitude", 2, 5, 10), new wireman("GPSLongitudeRef", 3, 2), new wireman("GPSLongitude", 4, 5, 10), new wireman("GPSAltitudeRef", 5, 1), new wireman("GPSAltitude", 6, 5), new wireman("GPSTimeStamp", 7, 5), new wireman("GPSSatellites", 8, 2), new wireman("GPSStatus", 9, 2), new wireman("GPSMeasureMode", 10, 2), new wireman("GPSDOP", 11, 5), new wireman("GPSSpeedRef", 12, 2), new wireman("GPSSpeed", 13, 5), new wireman("GPSTrackRef", 14, 2), new wireman("GPSTrack", 15, 5), new wireman("GPSImgDirectionRef", 16, 2), new wireman("GPSImgDirection", 17, 5), new wireman("GPSMapDatum", 18, 2), new wireman("GPSDestLatitudeRef", 19, 2), new wireman("GPSDestLatitude", 20, 5), new wireman("GPSDestLongitudeRef", 21, 2), new wireman("GPSDestLongitude", 22, 5), new wireman("GPSDestBearingRef", 23, 2), new wireman("GPSDestBearing", 24, 5), new wireman("GPSDestDistanceRef", 25, 2), new wireman("GPSDestDistance", 26, 5), new wireman("GPSProcessingMethod", 27, 7), new wireman("GPSAreaInformation", 28, 7), new wireman("GPSDateStamp", 29, 2), new wireman("GPSDifferential", 30, 3), new wireman("GPSHPositioningError", 31, 5)};
        f38685cultivated = wiremanVarArr3;
        wireman[] wiremanVarArr4 = {new wireman("InteroperabilityIndex", 1, 2)};
        f38709premeiotic = wiremanVarArr4;
        wireman[] wiremanVarArr5 = {new wireman("NewSubfileType", 254, 4), new wireman("SubfileType", 255, 4), new wireman("ThumbnailImageWidth", 256, 3, 4), new wireman("ThumbnailImageLength", 257, 3, 4), new wireman("BitsPerSample", 258, 3), new wireman("Compression", 259, 3), new wireman("PhotometricInterpretation", 262, 3), new wireman("ImageDescription", 270, 2), new wireman("Make", 271, 2), new wireman("Model", 272, 2), new wireman("StripOffsets", 273, 3, 4), new wireman("ThumbnailOrientation", 274, 3), new wireman("SamplesPerPixel", 277, 3), new wireman("RowsPerStrip", 278, 3, 4), new wireman("StripByteCounts", 279, 3, 4), new wireman("XResolution", 282, 5), new wireman("YResolution", 283, 5), new wireman("PlanarConfiguration", 284, 3), new wireman("ResolutionUnit", 296, 3), new wireman("TransferFunction", 301, 3), new wireman("Software", Sdk$SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new wireman("DateTime", 306, 2), new wireman("Artist", Sdk$SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new wireman("WhitePoint", Sdk$SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new wireman("PrimaryChromaticities", Sdk$SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new wireman("SubIFDPointer", 330, 4), new wireman("JPEGInterchangeFormat", 513, 4), new wireman("JPEGInterchangeFormatLength", 514, 4), new wireman("YCbCrCoefficients", 529, 5), new wireman("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new wireman("YCbCrPositioning", 531, 3), new wireman("ReferenceBlackWhite", 532, 5), new wireman("Copyright", 33432, 2), new wireman("ExifIFDPointer", 34665, 4), new wireman("GPSInfoIFDPointer", 34853, 4), new wireman("DNGVersion", 50706, 1), new wireman("DefaultCropSize", 50720, 3, 4)};
        f38724timberyard = wiremanVarArr5;
        f38701milliradian = new wireman("StripOffsets", 273, 3);
        wireman[] wiremanVarArr6 = {new wireman("ThumbnailImage", 256, 7), new wireman("CameraSettingsIFDPointer", 8224, 4), new wireman("ImageProcessingIFDPointer", 8256, 4)};
        f38725treadless = wiremanVarArr6;
        wireman[] wiremanVarArr7 = {new wireman("PreviewImageStart", 257, 4), new wireman("PreviewImageLength", 258, 4)};
        f38695itchy = wiremanVarArr7;
        wireman[] wiremanVarArr8 = {new wireman("AspectFrame", 4371, 3)};
        f38680coffeecake = wiremanVarArr8;
        wireman[] wiremanVarArr9 = {new wireman("ColorSpace", 55, 3)};
        f38697lerp = wiremanVarArr9;
        wireman[][] wiremanVarArr10 = {wiremanVarArr, wiremanVarArr2, wiremanVarArr3, wiremanVarArr4, wiremanVarArr5, wiremanVarArr, wiremanVarArr6, wiremanVarArr7, wiremanVarArr8, wiremanVarArr9};
        f38702nosophobia = wiremanVarArr10;
        f38698lotta = new wireman[]{new wireman("SubIFDPointer", 330, 4), new wireman("ExifIFDPointer", 34665, 4), new wireman("GPSInfoIFDPointer", 34853, 4), new wireman("InteroperabilityIFDPointer", 40965, 4), new wireman("CameraSettingsIFDPointer", 8224, 1), new wireman("ImageProcessingIFDPointer", 8256, 1)};
        f38716sayid = new HashMap[wiremanVarArr10.length];
        f38689empress = new HashMap[wiremanVarArr10.length];
        f38681coi = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f38686czestochowa = new HashMap<>();
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        f38719sensatory = charsetForName;
        f38727underbelly = "Exif\u0000\u0000".getBytes(charsetForName);
        f38711preterite = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f38705peridotite = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f38699mathsort = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            wireman[][] wiremanVarArr11 = f38702nosophobia;
            if (i >= wiremanVarArr11.length) {
                HashMap<Integer, Integer> map = f38686czestochowa;
                wireman[] wiremanVarArr12 = f38698lotta;
                map.put(Integer.valueOf(wiremanVarArr12[0].f38766attabal), 5);
                map.put(Integer.valueOf(wiremanVarArr12[1].f38766attabal), 1);
                map.put(Integer.valueOf(wiremanVarArr12[2].f38766attabal), 2);
                map.put(Integer.valueOf(wiremanVarArr12[3].f38766attabal), 3);
                map.put(Integer.valueOf(wiremanVarArr12[4].f38766attabal), 7);
                map.put(Integer.valueOf(wiremanVarArr12[5].f38766attabal), 8);
                f38729wostteth = Pattern.compile(".*[1-9].*");
                f38694igbo = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f38692gusty = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f38707picketboat = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f38716sayid[i] = new HashMap<>();
            f38689empress[i] = new HashMap<>();
            for (wireman wiremanVar : wiremanVarArr11[i]) {
                f38716sayid[i].put(Integer.valueOf(wiremanVar.f38766attabal), wiremanVar);
                f38689empress[i].put(wiremanVar.name, wiremanVar);
            }
            i++;
        }
    }

    public attabal(String str) throws Throwable {
        wireman[][] wiremanVarArr = f38702nosophobia;
        this.f38734beachfront = new HashMap[wiremanVarArr.length];
        this.f38735competently = new HashSet(wiremanVarArr.length);
        this.f38741impromptu = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        polloi(str);
    }

    public static boolean adultoid(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f38684cuirassed;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean cord(FileDescriptor fileDescriptor) {
        try {
            tectonization.saneness.attabal.dern(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean grimness(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    public static boolean molybdenite(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f38727underbelly;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f38727underbelly;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    public final void apical(beachfront beachfrontVar) throws Throwable {
        dern dernVar;
        yemenite(beachfrontVar);
        restrictive(beachfrontVar, 0);
        privatdozent(beachfrontVar, 0);
        privatdozent(beachfrontVar, 5);
        privatdozent(beachfrontVar, 4);
        creditor();
        if (this.f38750wireman != 8 || (dernVar = this.f38734beachfront[1].get("MakerNote")) == null) {
            return;
        }
        beachfront beachfrontVar2 = new beachfront(dernVar.f38757wireman);
        beachfrontVar2.dern(this.f38741impromptu);
        beachfrontVar2.marial(6);
        restrictive(beachfrontVar2, 9);
        dern dernVar2 = this.f38734beachfront[9].get("ColorSpace");
        if (dernVar2 != null) {
            this.f38734beachfront[1].put("ColorSpace", dernVar2);
        }
    }

    public final void arytenoidectomy(saneness sanenessVar, HashMap map) throws Throwable {
        dern dernVar = (dern) map.get("JPEGInterchangeFormat");
        dern dernVar2 = (dern) map.get("JPEGInterchangeFormatLength");
        if (dernVar == null || dernVar2 == null) {
            return;
        }
        int iTaiyuan = dernVar.taiyuan(this.f38741impromptu);
        int iTaiyuan2 = dernVar2.taiyuan(this.f38741impromptu);
        if (this.f38750wireman == 7) {
            iTaiyuan += this.f38745monoploid;
        }
        if (iTaiyuan <= 0 || iTaiyuan2 <= 0) {
            return;
        }
        this.f38748taiyuan = true;
        if (this.f38733attabal == null && this.f38737dern == null && this.f38747saneness == null) {
            byte[] bArr = new byte[iTaiyuan2];
            sanenessVar.skip(iTaiyuan);
            sanenessVar.read(bArr);
            this.f38749triweekly = bArr;
        }
        this.f38738formularize = iTaiyuan;
        this.f38740impassible = iTaiyuan2;
    }

    public final void attabal() {
        String strSaneness = saneness("DateTimeOriginal");
        if (strSaneness != null && saneness("DateTime") == null) {
            this.f38734beachfront[0].put("DateTime", dern.attabal(strSaneness));
        }
        if (saneness("ImageWidth") == null) {
            this.f38734beachfront[0].put("ImageWidth", dern.saneness(0L, this.f38741impromptu));
        }
        if (saneness("ImageLength") == null) {
            this.f38734beachfront[0].put("ImageLength", dern.saneness(0L, this.f38741impromptu));
        }
        if (saneness("Orientation") == null) {
            this.f38734beachfront[0].put("Orientation", dern.saneness(0L, this.f38741impromptu));
        }
        if (saneness("LightSource") == null) {
            this.f38734beachfront[1].put("LightSource", dern.saneness(0L, this.f38741impromptu));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void beachfront(tectonization.attabal.saneness r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tectonization.attabal.beachfront(tectonization.attabal$saneness, int, int):void");
    }

    public final int competently(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (adultoid(bArr)) {
            return 4;
        }
        if (rotuma(bArr)) {
            return 9;
        }
        if (graveside(bArr)) {
            return 12;
        }
        if (dovishness(bArr)) {
            return 7;
        }
        if (preprohormone(bArr)) {
            return 10;
        }
        if (gintrap(bArr)) {
            return 13;
        }
        return trm(bArr) ? 14 : 0;
    }

    public final void creditor() throws Throwable {
        saran(0, 5);
        saran(0, 4);
        saran(5, 4);
        dern dernVar = this.f38734beachfront[1].get("PixelXDimension");
        dern dernVar2 = this.f38734beachfront[1].get("PixelYDimension");
        if (dernVar != null && dernVar2 != null) {
            this.f38734beachfront[0].put("ImageWidth", dernVar);
            this.f38734beachfront[0].put("ImageLength", dernVar2);
        }
        if (this.f38734beachfront[4].isEmpty() && stratoscope(this.f38734beachfront[5])) {
            HashMap<String, dern>[] mapArr = this.f38734beachfront;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        stratoscope(this.f38734beachfront[4]);
        merc(0, "ThumbnailOrientation", "Orientation");
        merc(0, "ThumbnailImageLength", "ImageLength");
        merc(0, "ThumbnailImageWidth", "ImageWidth");
        merc(5, "ThumbnailOrientation", "Orientation");
        merc(5, "ThumbnailImageLength", "ImageLength");
        merc(5, "ThumbnailImageWidth", "ImageWidth");
        merc(4, "Orientation", "ThumbnailOrientation");
        merc(4, "ImageLength", "ThumbnailImageLength");
        merc(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final boolean cuirassed(HashMap map) throws Throwable {
        dern dernVar;
        dern dernVar2 = (dern) map.get("BitsPerSample");
        if (dernVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dernVar2.apical(this.f38741impromptu);
        int[] iArr2 = f38714rotuma;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f38750wireman != 3 || (dernVar = (dern) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iTaiyuan = dernVar.taiyuan(this.f38741impromptu);
        return (iTaiyuan == 1 && Arrays.equals(iArr, f38682cord)) || (iTaiyuan == 6 && Arrays.equals(iArr, iArr2));
    }

    public final void cutely(saneness sanenessVar) throws Throwable {
        if (f38678adultoid) {
            Objects.toString(sanenessVar);
        }
        sanenessVar.marial(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        sanenessVar.read(bArr);
        sanenessVar.read(bArr2);
        sanenessVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        sanenessVar.marial(i - sanenessVar.attabal());
        sanenessVar.read(bArr4);
        beachfront(new saneness(bArr4), i, 5);
        sanenessVar.marial(i3 - sanenessVar.attabal());
        sanenessVar.dern(ByteOrder.BIG_ENDIAN);
        int i4 = sanenessVar.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = sanenessVar.readUnsignedShort();
            int unsignedShort2 = sanenessVar.readUnsignedShort();
            if (unsignedShort == f38701milliradian.f38766attabal) {
                short s = sanenessVar.readShort();
                short s2 = sanenessVar.readShort();
                dern dernVarBeachfront = dern.beachfront(s, this.f38741impromptu);
                dern dernVarBeachfront2 = dern.beachfront(s2, this.f38741impromptu);
                this.f38734beachfront[0].put("ImageLength", dernVarBeachfront);
                this.f38734beachfront[0].put("ImageWidth", dernVarBeachfront2);
                return;
            }
            sanenessVar.marial(unsignedShort2);
        }
    }

    public int dern(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        dern dernVarWireman = wireman(str);
        if (dernVarWireman != null) {
            try {
                return dernVarWireman.taiyuan(this.f38741impromptu);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final boolean dovishness(byte[] bArr) throws Throwable {
        saneness sanenessVar = null;
        try {
            saneness sanenessVar2 = new saneness(bArr);
            try {
                ByteOrder byteOrderKattegat = kattegat(sanenessVar2);
                this.f38741impromptu = byteOrderKattegat;
                sanenessVar2.dern(byteOrderKattegat);
                short s = sanenessVar2.readShort();
                boolean z = s == 20306 || s == 21330;
                sanenessVar2.close();
                return z;
            } catch (Exception unused) {
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int formularize() {
        switch (dern("Orientation", 1)) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final boolean gintrap(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f38696kattegat;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean graveside(byte[] bArr) throws Throwable {
        long j;
        saneness sanenessVar = null;
        try {
            saneness sanenessVar2 = new saneness(bArr);
            try {
                long length = sanenessVar2.readInt();
                byte[] bArr2 = new byte[4];
                sanenessVar2.read(bArr2);
                if (!Arrays.equals(bArr2, f38722stratoscope)) {
                    sanenessVar2.close();
                    return false;
                }
                if (length == 1) {
                    length = sanenessVar2.readLong();
                    j = 16;
                    if (length < 16) {
                        sanenessVar2.close();
                        return false;
                    }
                } else {
                    j = 8;
                }
                if (length > bArr.length) {
                    length = bArr.length;
                }
                long j2 = length - j;
                if (j2 < 8) {
                    sanenessVar2.close();
                    return false;
                }
                byte[] bArr3 = new byte[4];
                boolean z = false;
                boolean z2 = false;
                for (long j3 = 0; j3 < j2 / 4; j3++) {
                    if (sanenessVar2.read(bArr3) != 4) {
                        sanenessVar2.close();
                        return false;
                    }
                    if (j3 != 1) {
                        if (Arrays.equals(bArr3, f38726trm)) {
                            z = true;
                        } else if (Arrays.equals(bArr3, f38703oilcan)) {
                            z2 = true;
                        }
                        if (z && z2) {
                            sanenessVar2.close();
                            return true;
                        }
                    }
                }
                sanenessVar2.close();
            } catch (Exception unused) {
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
            } catch (Throwable th) {
                th = th;
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return false;
    }

    public final void impassible(beachfront beachfrontVar) throws Throwable {
        if (f38678adultoid) {
            Objects.toString(beachfrontVar);
        }
        apical(beachfrontVar);
        dern dernVar = this.f38734beachfront[0].get("JpgFromRaw");
        if (dernVar != null) {
            beachfront(new saneness(dernVar.f38757wireman), (int) dernVar.f38755dern, 5);
        }
        dern dernVar2 = this.f38734beachfront[0].get("ISO");
        dern dernVar3 = this.f38734beachfront[1].get("PhotographicSensitivity");
        if (dernVar2 == null || dernVar3 != null) {
            return;
        }
        this.f38734beachfront[1].put("PhotographicSensitivity", dernVar2);
    }

    public final void impromptu(beachfront beachfrontVar) throws Throwable {
        int i;
        int i2;
        apical(beachfrontVar);
        dern dernVar = this.f38734beachfront[1].get("MakerNote");
        if (dernVar != null) {
            beachfront beachfrontVar2 = new beachfront(dernVar.f38757wireman);
            beachfrontVar2.dern(this.f38741impromptu);
            byte[] bArr = f38730yemenite;
            byte[] bArr2 = new byte[bArr.length];
            beachfrontVar2.readFully(bArr2);
            beachfrontVar2.cutely(0L);
            byte[] bArr3 = f38717sealless;
            byte[] bArr4 = new byte[bArr3.length];
            beachfrontVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                beachfrontVar2.cutely(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                beachfrontVar2.cutely(12L);
            }
            restrictive(beachfrontVar2, 6);
            dern dernVar2 = this.f38734beachfront[7].get("PreviewImageStart");
            dern dernVar3 = this.f38734beachfront[7].get("PreviewImageLength");
            if (dernVar2 != null && dernVar3 != null) {
                this.f38734beachfront[5].put("JPEGInterchangeFormat", dernVar2);
                this.f38734beachfront[5].put("JPEGInterchangeFormatLength", dernVar3);
            }
            dern dernVar4 = this.f38734beachfront[8].get("AspectFrame");
            if (dernVar4 != null) {
                int[] iArr = (int[]) dernVar4.apical(this.f38741impromptu);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                dern dernVarBeachfront = dern.beachfront(i5, this.f38741impromptu);
                dern dernVarBeachfront2 = dern.beachfront(i6, this.f38741impromptu);
                this.f38734beachfront[0].put("ImageWidth", dernVarBeachfront);
                this.f38734beachfront[0].put("ImageLength", dernVarBeachfront2);
            }
        }
    }

    public final ByteOrder kattegat(saneness sanenessVar) throws IOException {
        short s = sanenessVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void kowloon(saneness sanenessVar) throws Throwable {
        if (f38678adultoid) {
            Objects.toString(sanenessVar);
        }
        sanenessVar.dern(ByteOrder.LITTLE_ENDIAN);
        sanenessVar.marial(f38708polder.length);
        int i = sanenessVar.readInt() + 8;
        byte[] bArr = f38718seminary;
        sanenessVar.marial(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (sanenessVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = sanenessVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f38691grimness, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (sanenessVar.read(bArr3) == i2) {
                        this.f38732arytenoidectomy = i3;
                        supplicat(bArr3, 0);
                        seminary(new saneness(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + tectonization.saneness.attabal(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                sanenessVar.marial(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void marial(beachfront beachfrontVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                tectonization.saneness.C0808saneness.attabal(mediaMetadataRetriever, new C0807attabal(beachfrontVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f38734beachfront[0].put("ImageWidth", dern.beachfront(Integer.parseInt(strExtractMetadata), this.f38741impromptu));
                }
                if (strExtractMetadata2 != null) {
                    this.f38734beachfront[0].put("ImageLength", dern.beachfront(Integer.parseInt(strExtractMetadata2), this.f38741impromptu));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    this.f38734beachfront[0].put("Orientation", dern.beachfront(i, this.f38741impromptu));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    beachfrontVar.cutely(i3);
                    byte[] bArr = new byte[6];
                    if (beachfrontVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f38727underbelly)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (beachfrontVar.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f38732arytenoidectomy = i5;
                    supplicat(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void merc(int i, String str, String str2) {
        if (this.f38734beachfront[i].isEmpty() || this.f38734beachfront[i].get(str) == null) {
            return;
        }
        HashMap<String, dern> map = this.f38734beachfront[i];
        map.put(str2, map.get(str));
        this.f38734beachfront[i].remove(str);
    }

    public final void monoploid(saneness sanenessVar, HashMap map) throws IOException {
        dern dernVar = (dern) map.get("StripOffsets");
        dern dernVar2 = (dern) map.get("StripByteCounts");
        if (dernVar == null || dernVar2 == null) {
            return;
        }
        long[] jArrDern = tectonization.saneness.dern(dernVar.apical(this.f38741impromptu));
        long[] jArrDern2 = tectonization.saneness.dern(dernVar2.apical(this.f38741impromptu));
        if (jArrDern == null || jArrDern.length == 0 || jArrDern2 == null || jArrDern2.length == 0 || jArrDern.length != jArrDern2.length) {
            return;
        }
        long j = 0;
        for (long j2 : jArrDern2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.f38731apical = true;
        this.f38736cutely = true;
        this.f38748taiyuan = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrDern.length; i4++) {
            int i5 = (int) jArrDern[i4];
            int i6 = (int) jArrDern2[i4];
            if (i4 < jArrDern.length - 1 && i5 + i6 != jArrDern[i4 + 1]) {
                this.f38731apical = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (sanenessVar.skip(j3) != j3) {
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (sanenessVar.read(bArr2) != i6) {
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.f38749triweekly = bArr;
        if (this.f38731apical) {
            this.f38738formularize = (int) jArrDern[0];
            this.f38740impassible = i;
        }
    }

    public final void oilcan(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < f38702nosophobia.length; i++) {
            try {
                try {
                    this.f38734beachfront[i] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z = f38678adultoid;
                    attabal();
                    if (z) {
                        sealless();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                attabal();
                if (f38678adultoid) {
                    sealless();
                }
                throw th;
            }
        }
        if (!this.f38743marial) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f38750wireman = competently(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (grimness(this.f38750wireman)) {
            beachfront beachfrontVar = new beachfront(inputStream);
            if (this.f38743marial) {
                triweekly(beachfrontVar);
            } else {
                int i2 = this.f38750wireman;
                if (i2 == 12) {
                    marial(beachfrontVar);
                } else if (i2 == 7) {
                    impromptu(beachfrontVar);
                } else if (i2 == 10) {
                    impassible(beachfrontVar);
                } else {
                    apical(beachfrontVar);
                }
            }
            beachfrontVar.cutely(this.f38732arytenoidectomy);
            seminary(beachfrontVar);
        } else {
            saneness sanenessVar = new saneness(inputStream);
            int i3 = this.f38750wireman;
            if (i3 == 4) {
                beachfront(sanenessVar, 0, 0);
            } else if (i3 == 13) {
                taiyuan(sanenessVar);
            } else if (i3 == 9) {
                cutely(sanenessVar);
            } else if (i3 == 14) {
                kowloon(sanenessVar);
            }
        }
        attabal();
        if (f38678adultoid) {
            sealless();
        }
    }

    public final void polder(beachfront beachfrontVar, int i) throws Throwable {
        dern dernVar = this.f38734beachfront[i].get("ImageLength");
        dern dernVar2 = this.f38734beachfront[i].get("ImageWidth");
        if (dernVar == null || dernVar2 == null) {
            dern dernVar3 = this.f38734beachfront[i].get("JPEGInterchangeFormat");
            dern dernVar4 = this.f38734beachfront[i].get("JPEGInterchangeFormatLength");
            if (dernVar3 == null || dernVar4 == null) {
                return;
            }
            int iTaiyuan = dernVar3.taiyuan(this.f38741impromptu);
            int iTaiyuan2 = dernVar3.taiyuan(this.f38741impromptu);
            beachfrontVar.cutely(iTaiyuan);
            byte[] bArr = new byte[iTaiyuan2];
            beachfrontVar.read(bArr);
            beachfront(new saneness(bArr), iTaiyuan, i);
        }
    }

    public final void polloi(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f38737dern = null;
        this.f38733attabal = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (cord(fileInputStream2.getFD())) {
                    this.f38747saneness = fileInputStream2.getFD();
                } else {
                    this.f38747saneness = null;
                }
                oilcan(fileInputStream2);
                tectonization.saneness.saneness(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                tectonization.saneness.saneness(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean preprohormone(byte[] bArr) throws Throwable {
        saneness sanenessVar = null;
        try {
            saneness sanenessVar2 = new saneness(bArr);
            try {
                ByteOrder byteOrderKattegat = kattegat(sanenessVar2);
                this.f38741impromptu = byteOrderKattegat;
                sanenessVar2.dern(byteOrderKattegat);
                boolean z = sanenessVar2.readShort() == 85;
                sanenessVar2.close();
                return z;
            } catch (Exception unused) {
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                sanenessVar = sanenessVar2;
                if (sanenessVar != null) {
                    sanenessVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void privatdozent(beachfront beachfrontVar, int i) throws Throwable {
        dern dernVarBeachfront;
        dern dernVarBeachfront2;
        dern dernVar = this.f38734beachfront[i].get("DefaultCropSize");
        dern dernVar2 = this.f38734beachfront[i].get("SensorTopBorder");
        dern dernVar3 = this.f38734beachfront[i].get("SensorLeftBorder");
        dern dernVar4 = this.f38734beachfront[i].get("SensorBottomBorder");
        dern dernVar5 = this.f38734beachfront[i].get("SensorRightBorder");
        if (dernVar != null) {
            if (dernVar.f38754attabal == 5) {
                marial[] marialVarArr = (marial[]) dernVar.apical(this.f38741impromptu);
                if (marialVarArr == null || marialVarArr.length != 2) {
                    Arrays.toString(marialVarArr);
                    return;
                } else {
                    dernVarBeachfront = dern.wireman(marialVarArr[0], this.f38741impromptu);
                    dernVarBeachfront2 = dern.wireman(marialVarArr[1], this.f38741impromptu);
                }
            } else {
                int[] iArr = (int[]) dernVar.apical(this.f38741impromptu);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dernVarBeachfront = dern.beachfront(iArr[0], this.f38741impromptu);
                    dernVarBeachfront2 = dern.beachfront(iArr[1], this.f38741impromptu);
                }
            }
            this.f38734beachfront[i].put("ImageWidth", dernVarBeachfront);
            this.f38734beachfront[i].put("ImageLength", dernVarBeachfront2);
            return;
        }
        if (dernVar2 == null || dernVar3 == null || dernVar4 == null || dernVar5 == null) {
            polder(beachfrontVar, i);
            return;
        }
        int iTaiyuan = dernVar2.taiyuan(this.f38741impromptu);
        int iTaiyuan2 = dernVar4.taiyuan(this.f38741impromptu);
        int iTaiyuan3 = dernVar5.taiyuan(this.f38741impromptu);
        int iTaiyuan4 = dernVar3.taiyuan(this.f38741impromptu);
        if (iTaiyuan2 <= iTaiyuan || iTaiyuan3 <= iTaiyuan4) {
            return;
        }
        dern dernVarBeachfront3 = dern.beachfront(iTaiyuan2 - iTaiyuan, this.f38741impromptu);
        dern dernVarBeachfront4 = dern.beachfront(iTaiyuan3 - iTaiyuan4, this.f38741impromptu);
        this.f38734beachfront[i].put("ImageLength", dernVarBeachfront3);
        this.f38734beachfront[i].put("ImageWidth", dernVarBeachfront4);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    public final void restrictive(beachfront beachfrontVar, int i) throws IOException {
        int i2;
        long j;
        boolean z;
        int unsignedShort;
        long jSaneness;
        this.f38735competently.add(Integer.valueOf(beachfrontVar.f38764monoploid));
        short s = beachfrontVar.readShort();
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (s2 < s) {
            int unsignedShort2 = beachfrontVar.readUnsignedShort();
            int unsignedShort3 = beachfrontVar.readUnsignedShort();
            int i3 = beachfrontVar.readInt();
            long jAttabal = ((long) beachfrontVar.attabal()) + 4;
            wireman wiremanVar = f38716sayid[i].get(Integer.valueOf(unsignedShort2));
            boolean z2 = f38678adultoid;
            if (z2) {
                i2 = 4;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), wiremanVar != null ? wiremanVar.name : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            } else {
                i2 = 4;
            }
            if (wiremanVar != null && unsignedShort3 > 0) {
                int[] iArr = f38704overspeculate;
                if (unsignedShort3 >= iArr.length) {
                    j = 0;
                } else if (wiremanVar.attabal(unsignedShort3)) {
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = wiremanVar.f38768saneness;
                    }
                    j = ((long) i3) * ((long) iArr[unsignedShort3]);
                    z = j >= 0 && j <= 2147483647L;
                } else {
                    if (z2) {
                        String str = f38720splinterproof[unsignedShort3];
                    }
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (z) {
                if (j > 4) {
                    int i4 = beachfrontVar.readInt();
                    if (this.f38750wireman == 7) {
                        if ("MakerNote".equals(wiremanVar.name)) {
                            this.f38745monoploid = i4;
                        } else if (i == 6 && "ThumbnailImage".equals(wiremanVar.name)) {
                            this.f38746polloi = i4;
                            this.f38744molybdenite = i3;
                            dern dernVarBeachfront = dern.beachfront(6, this.f38741impromptu);
                            dern dernVarSaneness = dern.saneness(this.f38746polloi, this.f38741impromptu);
                            dern dernVarSaneness2 = dern.saneness(this.f38744molybdenite, this.f38741impromptu);
                            this.f38734beachfront[i2].put("Compression", dernVarBeachfront);
                            this.f38734beachfront[i2].put("JPEGInterchangeFormat", dernVarSaneness);
                            this.f38734beachfront[i2].put("JPEGInterchangeFormatLength", dernVarSaneness2);
                        }
                    }
                    beachfrontVar.cutely(i4);
                } else {
                    z2 = z2;
                    unsignedShort2 = unsignedShort2;
                }
                Integer num = f38686czestochowa.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i2) {
                            jSaneness = beachfrontVar.saneness();
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = beachfrontVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = beachfrontVar.readInt();
                        } else {
                            jSaneness = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jSaneness), wiremanVar.name);
                        }
                        if (jSaneness > 0 && !this.f38735competently.contains(Integer.valueOf((int) jSaneness))) {
                            beachfrontVar.cutely(jSaneness);
                            restrictive(beachfrontVar, num.intValue());
                        }
                        beachfrontVar.cutely(jAttabal);
                    } else {
                        unsignedShort = beachfrontVar.readUnsignedShort();
                    }
                    jSaneness = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(jSaneness), wiremanVar.name);
                    }
                    if (jSaneness > 0) {
                        beachfrontVar.cutely(jSaneness);
                        restrictive(beachfrontVar, num.intValue());
                    }
                    beachfrontVar.cutely(jAttabal);
                } else {
                    int iAttabal = beachfrontVar.attabal() + this.f38732arytenoidectomy;
                    byte[] bArr = new byte[(int) j];
                    beachfrontVar.readFully(bArr);
                    dern dernVar = new dern(unsignedShort3, i3, iAttabal, bArr);
                    this.f38734beachfront[i].put(wiremanVar.name, dernVar);
                    if ("DNGVersion".equals(wiremanVar.name)) {
                        this.f38750wireman = 3;
                    }
                    if ((("Make".equals(wiremanVar.name) || "Model".equals(wiremanVar.name)) && dernVar.cutely(this.f38741impromptu).contains("PENTAX")) || ("Compression".equals(wiremanVar.name) && dernVar.taiyuan(this.f38741impromptu) == 65535)) {
                        this.f38750wireman = 8;
                    }
                    if (beachfrontVar.attabal() != jAttabal) {
                        beachfrontVar.cutely(jAttabal);
                    }
                }
            } else {
                beachfrontVar.cutely(jAttabal);
                s2 = s2;
            }
            s2 = (short) (s2 + 1);
            s = s;
        }
        int i5 = beachfrontVar.readInt();
        if (f38678adultoid) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i5));
        }
        long j2 = i5;
        if (j2 <= 0 || this.f38735competently.contains(Integer.valueOf(i5))) {
            return;
        }
        beachfrontVar.cutely(j2);
        if (this.f38734beachfront[4].isEmpty()) {
            restrictive(beachfrontVar, 4);
        } else if (this.f38734beachfront[5].isEmpty()) {
            restrictive(beachfrontVar, 5);
        }
    }

    public final boolean rotuma(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public String saneness(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        dern dernVarWireman = wireman(str);
        if (dernVarWireman != null) {
            if (!f38681coi.contains(str)) {
                return dernVarWireman.cutely(this.f38741impromptu);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = dernVarWireman.f38754attabal;
                if (i != 5 && i != 10) {
                    return null;
                }
                marial[] marialVarArr = (marial[]) dernVarWireman.apical(this.f38741impromptu);
                if (marialVarArr == null || marialVarArr.length != 3) {
                    Arrays.toString(marialVarArr);
                    return null;
                }
                marial marialVar = marialVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (marialVar.f38758attabal / marialVar.f38759saneness));
                marial marialVar2 = marialVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (marialVar2.f38758attabal / marialVar2.f38759saneness));
                marial marialVar3 = marialVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (marialVar3.f38758attabal / marialVar3.f38759saneness)));
            }
            try {
                return Double.toString(dernVarWireman.impromptu(this.f38741impromptu));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void saran(int i, int i2) throws Throwable {
        if (this.f38734beachfront[i].isEmpty() || this.f38734beachfront[i2].isEmpty()) {
            return;
        }
        dern dernVar = this.f38734beachfront[i].get("ImageLength");
        dern dernVar2 = this.f38734beachfront[i].get("ImageWidth");
        dern dernVar3 = this.f38734beachfront[i2].get("ImageLength");
        dern dernVar4 = this.f38734beachfront[i2].get("ImageWidth");
        if (dernVar == null || dernVar2 == null || dernVar3 == null || dernVar4 == null) {
            return;
        }
        int iTaiyuan = dernVar.taiyuan(this.f38741impromptu);
        int iTaiyuan2 = dernVar2.taiyuan(this.f38741impromptu);
        int iTaiyuan3 = dernVar3.taiyuan(this.f38741impromptu);
        int iTaiyuan4 = dernVar4.taiyuan(this.f38741impromptu);
        if (iTaiyuan >= iTaiyuan3 || iTaiyuan2 >= iTaiyuan4) {
            return;
        }
        HashMap<String, dern>[] mapArr = this.f38734beachfront;
        HashMap<String, dern> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void sealless() throws Throwable {
        for (int i = 0; i < this.f38734beachfront.length; i++) {
            this.f38734beachfront[i].size();
            for (Map.Entry<String, dern> entry : this.f38734beachfront[i].entrySet()) {
                dern value = entry.getValue();
                entry.getKey();
                value.toString();
                value.cutely(this.f38741impromptu);
            }
        }
    }

    public final void seminary(saneness sanenessVar) throws Throwable {
        HashMap<String, dern> map = this.f38734beachfront[4];
        dern dernVar = map.get("Compression");
        if (dernVar == null) {
            this.f38742kowloon = 6;
            arytenoidectomy(sanenessVar, map);
            return;
        }
        int iTaiyuan = dernVar.taiyuan(this.f38741impromptu);
        this.f38742kowloon = iTaiyuan;
        if (iTaiyuan != 1) {
            if (iTaiyuan == 6) {
                arytenoidectomy(sanenessVar, map);
                return;
            } else if (iTaiyuan != 7) {
                return;
            }
        }
        if (cuirassed(map)) {
            monoploid(sanenessVar, map);
        }
    }

    public final boolean stratoscope(HashMap map) throws IOException {
        dern dernVar = (dern) map.get("ImageLength");
        dern dernVar2 = (dern) map.get("ImageWidth");
        if (dernVar == null || dernVar2 == null) {
            return false;
        }
        return dernVar.taiyuan(this.f38741impromptu) <= 512 && dernVar2.taiyuan(this.f38741impromptu) <= 512;
    }

    public final void supplicat(byte[] bArr, int i) throws IOException {
        beachfront beachfrontVar = new beachfront(bArr);
        yemenite(beachfrontVar);
        restrictive(beachfrontVar, i);
    }

    public final void taiyuan(saneness sanenessVar) throws Throwable {
        if (f38678adultoid) {
            Objects.toString(sanenessVar);
        }
        sanenessVar.dern(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f38696kattegat;
        sanenessVar.marial(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = sanenessVar.readInt();
                byte[] bArr2 = new byte[4];
                if (sanenessVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f38713restrictive)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f38700merc)) {
                    return;
                }
                if (Arrays.equals(bArr2, f38723supplicat)) {
                    byte[] bArr3 = new byte[i];
                    if (sanenessVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + tectonization.saneness.attabal(bArr2));
                    }
                    int i3 = sanenessVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f38732arytenoidectomy = i2;
                        supplicat(bArr3, 0);
                        creditor();
                        seminary(new saneness(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                sanenessVar.marial(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void triweekly(beachfront beachfrontVar) throws IOException {
        byte[] bArr = f38727underbelly;
        beachfrontVar.marial(bArr.length);
        byte[] bArr2 = new byte[beachfrontVar.available()];
        beachfrontVar.readFully(bArr2);
        this.f38732arytenoidectomy = bArr.length;
        supplicat(bArr2, 0);
    }

    public final boolean trm(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f38708polder;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f38718seminary;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f38708polder.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public final dern wireman(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f38702nosophobia.length; i++) {
            dern dernVar = this.f38734beachfront[i].get(str);
            if (dernVar != null) {
                return dernVar;
            }
        }
        return null;
    }

    public final void yemenite(saneness sanenessVar) throws IOException {
        ByteOrder byteOrderKattegat = kattegat(sanenessVar);
        this.f38741impromptu = byteOrderKattegat;
        sanenessVar.dern(byteOrderKattegat);
        int unsignedShort = sanenessVar.readUnsignedShort();
        int i = this.f38750wireman;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = sanenessVar.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i2);
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            sanenessVar.marial(i3);
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class beachfront extends saneness {
        public beachfront(byte[] bArr) throws IOException {
            super(bArr);
            this.f38763kowloon.mark(Integer.MAX_VALUE);
        }

        public void cutely(long j) throws IOException {
            int i = this.f38764monoploid;
            if (i > j) {
                this.f38764monoploid = 0;
                this.f38763kowloon.reset();
            } else {
                j -= (long) i;
            }
            marial((int) j);
        }

        public beachfront(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f38763kowloon.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f38766attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f38767dern;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f38768saneness;

        public wireman(String str, int i, int i2) {
            this.name = str;
            this.f38766attabal = i;
            this.f38768saneness = i2;
            this.f38767dern = -1;
        }

        public boolean attabal(int i) {
            int i2;
            int i3 = this.f38768saneness;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f38767dern) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public wireman(String str, int i, int i2, int i3) {
            this.name = str;
            this.f38766attabal = i;
            this.f38768saneness = i2;
            this.f38767dern = i3;
        }
    }

    public attabal(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public attabal(InputStream inputStream, int i) throws Throwable {
        wireman[][] wiremanVarArr = f38702nosophobia;
        this.f38734beachfront = new HashMap[wiremanVarArr.length];
        this.f38735competently = new HashSet(wiremanVarArr.length);
        this.f38741impromptu = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f38733attabal = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f38727underbelly.length);
                if (!molybdenite(bufferedInputStream)) {
                    return;
                }
                this.f38743marial = true;
                this.f38737dern = null;
                this.f38747saneness = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f38737dern = (AssetManager.AssetInputStream) inputStream;
                this.f38747saneness = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (cord(fileInputStream.getFD())) {
                    this.f38737dern = null;
                    this.f38747saneness = fileInputStream.getFD();
                } else {
                    this.f38737dern = null;
                    this.f38747saneness = null;
                }
            } else {
                this.f38737dern = null;
                this.f38747saneness = null;
            }
            oilcan(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* JADX INFO: renamed from: tectonization.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterface.java */
    public class C0807attabal extends MediaDataSource {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront f38751arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public long f38752kowloon;

        public C0807attabal(beachfront beachfrontVar) {
            this.f38751arytenoidectomy = beachfrontVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f38752kowloon;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f38751arytenoidectomy.available())) {
                        return -1;
                    }
                    this.f38751arytenoidectomy.cutely(j);
                    this.f38752kowloon = j;
                }
                if (i2 > this.f38751arytenoidectomy.available()) {
                    i2 = this.f38751arytenoidectomy.available();
                }
                int i3 = this.f38751arytenoidectomy.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f38752kowloon += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f38752kowloon = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
