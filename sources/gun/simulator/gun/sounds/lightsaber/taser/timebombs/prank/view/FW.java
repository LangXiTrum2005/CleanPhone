package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3068a = {0, 0, 0, 1};
    public static final String[] b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    public static final ExecutorC4527rs c = new ExecutorC4527rs(0);
    public static final ExecutorC4527rs d = new ExecutorC4527rs(1);
    public static final int[] e = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static int f = 2;

    public static void A() {
        if (Ug0.f3833a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean C(CharSequence charSequence, String str) {
        char c2;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length != str.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = str.charAt(i);
            if (cCharAt != cCharAt2 && ((c2 = (char) ((cCharAt | ' ') - 97)) >= 26 || c2 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean D(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static C3965lY E(InterfaceC2512Jb interfaceC2512Jb, ArrayList arrayList) {
        C5086yC c5086yC = AC.b;
        n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            InterfaceC2538Kb interfaceC2538KbG = interfaceC2512Jb.g(bundle);
            interfaceC2538KbG.getClass();
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i3));
            }
            objArrCopyOf[i2] = interfaceC2538KbG;
            i++;
            i2 = i3;
        }
        return AC.h(i2, objArrCopyOf);
    }

    public static Object F(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static C4868vl G(int i) {
        int i2 = Ug0.f3833a;
        Locale locale = Locale.US;
        return new C4868vl(Uri.parse("rtp://0.0.0.0:" + i));
    }

    public static Object H(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return DM.f(list, 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int[] I(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int J(String str) {
        byte b2;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = AbstractC5011xP.f5222a;
        byte b3 = 2;
        switch (str.hashCode()) {
            case -1007807498:
                if (!str2.equals("audio/x-flac")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -586683234:
                if (!str2.equals("audio/x-wav")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 187090231:
                if (!str2.equals("audio/mp3")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                str2 = MimeTypes.AUDIO_FLAC;
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = MimeTypes.AUDIO_MPEG;
                break;
        }
        switch (str2.hashCode()) {
            case -2123537834:
                if (!str2.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case -1662384011:
                if (!str2.equals("video/mp2p")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case -1662384007:
                if (!str2.equals("video/mp2t")) {
                    b3 = -1;
                }
                break;
            case -1662095187:
                if (!str2.equals("video/webm")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case -1606874997:
                if (!str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                    b3 = -1;
                } else {
                    b3 = 4;
                }
                break;
            case -1487394660:
                if (!str2.equals("image/jpeg")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case -1248337486:
                if (!str2.equals(MimeTypes.APPLICATION_MP4)) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case -1079884372:
                if (!str2.equals("video/x-msvideo")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case -1004728940:
                if (!str2.equals(MimeTypes.TEXT_VTT)) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case -387023398:
                if (!str2.equals("audio/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            case -43467528:
                if (!str2.equals(MimeTypes.APPLICATION_WEBM)) {
                    b3 = -1;
                } else {
                    b3 = 10;
                }
                break;
            case 13915911:
                if (!str2.equals("video/x-flv")) {
                    b3 = -1;
                } else {
                    b3 = 11;
                }
                break;
            case 187078296:
                if (!str2.equals(MimeTypes.AUDIO_AC3)) {
                    b3 = -1;
                } else {
                    b3 = 12;
                }
                break;
            case 187078297:
                if (!str2.equals("audio/ac4")) {
                    b3 = -1;
                } else {
                    b3 = com.umeng.analytics.pro.cw.k;
                }
                break;
            case 187078669:
                if (!str2.equals("audio/amr")) {
                    b3 = -1;
                } else {
                    b3 = com.umeng.analytics.pro.cw.l;
                }
                break;
            case 187090232:
                if (!str2.equals(MimeTypes.AUDIO_MP4)) {
                    b3 = -1;
                } else {
                    b3 = com.umeng.analytics.pro.cw.m;
                }
                break;
            case 187091926:
                if (!str2.equals("audio/ogg")) {
                    b3 = -1;
                } else {
                    b3 = com.umeng.analytics.pro.cw.n;
                }
                break;
            case 187099443:
                if (!str2.equals("audio/wav")) {
                    b3 = -1;
                } else {
                    b3 = 17;
                }
                break;
            case 1331848029:
                if (!str2.equals(MimeTypes.VIDEO_MP4)) {
                    b3 = -1;
                } else {
                    b3 = 18;
                }
                break;
            case 1503095341:
                if (!str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                    b3 = -1;
                } else {
                    b3 = 19;
                }
                break;
            case 1504578661:
                if (!str2.equals(MimeTypes.AUDIO_E_AC3)) {
                    b3 = -1;
                } else {
                    b3 = 20;
                }
                break;
            case 1504619009:
                if (!str2.equals(MimeTypes.AUDIO_FLAC)) {
                    b3 = -1;
                } else {
                    b3 = 21;
                }
                break;
            case 1504824762:
                if (!str2.equals("audio/midi")) {
                    b3 = -1;
                } else {
                    b3 = 22;
                }
                break;
            case 1504831518:
                if (!str2.equals(MimeTypes.AUDIO_MPEG)) {
                    b3 = -1;
                } else {
                    b3 = 23;
                }
                break;
            case 1505118770:
                if (!str2.equals(MimeTypes.AUDIO_WEBM)) {
                    b3 = -1;
                } else {
                    b3 = 24;
                }
                break;
            case 2039520277:
                if (!str2.equals("video/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 25;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
            case 12:
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 9:
            case 10:
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case 8:
                return 13;
            case 11:
                return 5;
            case 13:
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    public static int K(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static String L(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static int M(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static void N(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static int O(int i) {
        int i2 = i % 65536;
        return i2 >= 0 ? i2 : i2 + 65536;
    }

    public static XS P(C3971lc... c3971lcArr) {
        int i;
        int i2 = 0;
        if (c3971lcArr.length == 0) {
            return new XS(new C3971lc[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new P5(c3971lcArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c3971lcArr.length);
        for (C3971lc c3971lc : c3971lcArr) {
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Integer[] numArr = (Integer[]) array;
        ArrayList arrayListL = AbstractC2340Cl.L(Arrays.copyOf(numArr, numArr.length));
        int length = c3971lcArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C3971lc c3971lc2 = c3971lcArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC5044xl.g("fromIndex (0) is greater than toIndex (", size, ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException(AbstractC3950lJ.q("toIndex (", size, ") is greater than size (", size2, ")."));
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iR = AbstractC3375el.r((Comparable) arrayList.get(i), c3971lc2);
                if (iR >= 0) {
                    if (iR <= 0) {
                        break;
                    }
                    i6 = i - 1;
                } else {
                    i7 = i + 1;
                }
            }
            arrayListL.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((C3971lc) arrayList.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C3971lc c3971lc3 = (C3971lc) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C3971lc c3971lc4 = (C3971lc) arrayList.get(i10);
                c3971lc4.getClass();
                AbstractC2995aW.q(c3971lc3, "prefix");
                if (!c3971lc4.h(c3971lc3, c3971lc3.c())) {
                    break;
                }
                if (c3971lc4.c() == c3971lc3.c()) {
                    throw new IllegalArgumentException(AbstractC2995aW.v0(c3971lc4, "duplicate option: ").toString());
                }
                if (((Number) arrayListL.get(i10)).intValue() > ((Number) arrayListL.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayListL.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        C4848vb c4848vb = new C4848vb();
        g(0L, c4848vb, 0, arrayList, 0, arrayList.size(), arrayListL);
        int[] iArr = new int[(int) (c4848vb.b / ((long) 4))];
        while (!c4848vb.K()) {
            iArr[i2] = c4848vb.readInt();
            i2++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(c3971lcArr, c3971lcArr.length);
        AbstractC2995aW.p(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new XS((C3971lc[]) objArrCopyOf, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    public static ArrayList Q(JT jt) {
        int i;
        C3875kW c3875kW;
        JT jt2 = jt;
        C3875kW c3875kW2 = null;
        if (jt.t() != 0) {
            return null;
        }
        int i2 = 7;
        jt2.F(7);
        int iF = jt.f();
        if (iF == 1684433976) {
            JT jt3 = new JT();
            Inflater inflater = new Inflater(true);
            try {
                if (!Ug0.H(jt2, jt3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                jt2 = jt3;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iF != 1918990112) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = jt2.b;
        int i4 = jt2.c;
        while (i3 < i4) {
            int iF2 = jt2.f() + i3;
            if (iF2 > i3 && iF2 <= i4) {
                if (jt2.f() == 1835365224) {
                    int iF3 = jt2.f();
                    if (iF3 > 10000) {
                        c3875kW = c3875kW2;
                        i = i4;
                    } else {
                        float[] fArr = new float[iF3];
                        for (int i5 = 0; i5 < iF3; i5++) {
                            fArr[i5] = Float.intBitsToFloat(jt2.f());
                        }
                        int iF4 = jt2.f();
                        if (iF4 > 32000) {
                            c3875kW = c3875kW2;
                            i = i4;
                        } else {
                            double dLog = Math.log(2.0d);
                            i = i4;
                            int iCeil = (int) Math.ceil(Math.log(((double) iF3) * 2.0d) / dLog);
                            Uh0 uh0 = new Uh0(jt2.f3266a, 2, c3875kW2);
                            uh0.p(jt2.b * 8);
                            float[] fArr2 = new float[iF4 * 5];
                            int i6 = 5;
                            int[] iArr = new int[5];
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                if (i7 < iF4) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < i6) {
                                            int i10 = iArr[i9];
                                            int i11 = uh0.i(iCeil);
                                            int i12 = ((i11 >> 1) ^ (-(i11 & 1))) + i10;
                                            if (i12 < iF3 && i12 >= 0) {
                                                fArr2[i8] = fArr[i12];
                                                iArr[i9] = i12;
                                                i9++;
                                                i8++;
                                                i6 = 5;
                                            }
                                        } else {
                                            i7++;
                                            i6 = 5;
                                        }
                                    }
                                } else {
                                    uh0.p((uh0.g() + i2) & (-8));
                                    int i13 = 32;
                                    int i14 = uh0.i(32);
                                    VC[] vcArr = new VC[i14];
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < i14) {
                                            int i16 = uh0.i(8);
                                            int i17 = uh0.i(8);
                                            int i18 = uh0.i(i13);
                                            if (i18 <= 128000) {
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iF4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[i18 * 3];
                                                float[] fArr4 = new float[i18 * 2];
                                                int i19 = i14;
                                                int i20 = 0;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i20 < i18) {
                                                        int i22 = uh0.i(iCeil2);
                                                        int i23 = i18;
                                                        int i24 = ((i22 >> 1) ^ (-(i22 & 1))) + i21;
                                                        if (i24 < 0 || i24 >= iF4) {
                                                            c3875kW = null;
                                                        } else {
                                                            int i25 = i20 * 3;
                                                            int i26 = i24 * 5;
                                                            fArr3[i25] = fArr2[i26];
                                                            fArr3[i25 + 1] = fArr2[i26 + 1];
                                                            fArr3[i25 + 2] = fArr2[i26 + 2];
                                                            int i27 = i20 * 2;
                                                            fArr4[i27] = fArr2[i26 + 3];
                                                            fArr4[i27 + 1] = fArr2[i26 + 4];
                                                            i20++;
                                                            i21 = i24;
                                                            i18 = i23;
                                                        }
                                                    } else {
                                                        vcArr[i15] = new VC(fArr3, i16, fArr4, i17);
                                                        i15++;
                                                        i14 = i19;
                                                        i13 = 32;
                                                    }
                                                }
                                            }
                                        } else {
                                            c3875kW = new C3875kW(vcArr);
                                        }
                                    }
                                }
                                c3875kW = null;
                            }
                        }
                    }
                    if (c3875kW != null) {
                        arrayList.add(c3875kW);
                    }
                } else {
                    i = i4;
                }
                jt2.E(iF2);
                i4 = i;
                i3 = iF2;
                i2 = 7;
                c3875kW2 = null;
            }
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static A70 R(byte[] bArr) {
        JT jt = new JT(bArr);
        if (jt.c < 32) {
            return null;
        }
        jt.E(0);
        int i = 4;
        if (jt.f() != jt.a() + 4 || jt.f() != 1886614376) {
            return null;
        }
        int iD = AbstractC4936wb.d(jt.f());
        if (iD > 1) {
            AbstractC4038mJ.f();
            return null;
        }
        UUID uuid = new UUID(jt.n(), jt.n());
        if (iD == 1) {
            jt.F(jt.w() * 16);
        }
        int iW = jt.w();
        if (iW != jt.a()) {
            return null;
        }
        ?? r2 = new byte[iW];
        jt.d(r2, 0, iW);
        return new A70(uuid, iD, (Serializable) r2, i);
    }

    public static byte[] S(byte[] bArr, UUID uuid) {
        A70 a70R = R(bArr);
        if (a70R == null) {
            return null;
        }
        if (uuid.equals((UUID) a70R.c)) {
            return (byte[]) a70R.d;
        }
        uuid.toString();
        Objects.toString((UUID) a70R.c);
        AbstractC4038mJ.f();
        return null;
    }

    public static int T(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iC0 = c0(obj);
        int i2 = iC0 & i;
        int iE0 = e0(i2, obj3);
        if (iE0 == 0) {
            return -1;
        }
        int i3 = ~i;
        int i4 = iC0 & i3;
        int i5 = -1;
        while (true) {
            int i6 = iE0 - 1;
            int i7 = iArr[i6];
            if ((i7 & i3) == i4 && B(obj, objArr[i6]) && (objArr2 == null || B(obj2, objArr2[i6]))) {
                int i8 = i7 & i;
                if (i5 == -1) {
                    f0(i2, i8, obj3);
                } else {
                    iArr[i5] = M(iArr[i5], i8, i);
                }
                return i6;
            }
            int i9 = i7 & i;
            if (i9 == 0) {
                return -1;
            }
            i5 = i6;
            iE0 = i9;
        }
    }

    public static String U(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String V(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrI = I(str2);
        if (iArrI[0] != -1) {
            sb.append(str2);
            U(sb, iArrI[1], iArrI[2]);
            return sb.toString();
        }
        int[] iArrI2 = I(str);
        if (iArrI[3] == 0) {
            sb.append((CharSequence) str, 0, iArrI2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrI[2] == 0) {
            sb.append((CharSequence) str, 0, iArrI2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrI[1];
        if (i != 0) {
            int i2 = iArrI2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return U(sb, iArrI[1] + i2, i2 + iArrI[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrI2[1]);
            sb.append(str2);
            int i3 = iArrI2[1];
            return U(sb, i3, iArrI[2] + i3);
        }
        int i4 = iArrI2[0] + 2;
        int i5 = iArrI2[1];
        if (i4 >= i5 || i5 != iArrI2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrI2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrI2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return U(sb, iArrI2[1], i6 + iArrI[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrI2[1];
        return U(sb, i7, iArrI[2] + i7 + 1);
    }

    public static C4943we0 W(C4943we0 c4943we0, String[] strArr, Map map) {
        int i = 0;
        if (c4943we0 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C4943we0) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C4943we0 c4943we1 = new C4943we0();
                int length = strArr.length;
                while (i < length) {
                    c4943we1.a((C4943we0) map.get(strArr[i]));
                    i++;
                }
                return c4943we1;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c4943we0.a((C4943we0) map.get(strArr[0]));
                return c4943we0;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c4943we0.a((C4943we0) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c4943we0;
    }

    public static Uri X(String str, String str2) {
        return Uri.parse(V(str, str2));
    }

    public static void Y(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC3950lJ.p("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static C2868Wu Z(int i, InterfaceC4265ot interfaceC4265ot, JT jt) throws KT {
        C2868Wu c2868WuD = C2868Wu.d(interfaceC4265ot, jt);
        while (true) {
            int i2 = c2868WuD.f3945a;
            if (i2 == i) {
                return c2868WuD;
            }
            AbstractC4038mJ.f();
            long j = c2868WuD.b + 8;
            if (j > 2147483647L) {
                throw KT.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC4265ot.skipFully((int) j);
            c2868WuD = C2868Wu.d(interfaceC4265ot, jt);
        }
    }

    public static A6 a() throws InterruptedException {
        A6 a6 = A6.j;
        AbstractC2995aW.n(a6);
        A6 a7 = a6.f;
        if (a7 == null) {
            long jNanoTime = System.nanoTime();
            A6.class.wait(A6.h);
            A6 a8 = A6.j;
            AbstractC2995aW.n(a8);
            if (a8.f != null || System.nanoTime() - jNanoTime < A6.i) {
                return null;
            }
            return A6.j;
        }
        long jNanoTime2 = a7.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            A6.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        A6 a9 = A6.j;
        AbstractC2995aW.n(a9);
        a9.f = a7.f;
        a7.f = null;
        return a7;
    }

    public static void a0(List list, InterfaceC4753uV interfaceC4753uV, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (interfaceC4753uV.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return L("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static void c(String str) {
        if (Ug0.f3833a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static int c0(Object obj) {
        return b0(obj == null ? 0 : obj.hashCode());
    }

    public static String d(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static boolean d0(InterfaceC4265ot interfaceC4265ot, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        long length = interfaceC4265ot.getLength();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j2 = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i2 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = length;
        }
        int i3 = (int) j;
        JT jt = new JT(64);
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        while (true) {
            if (i4 < i3) {
                jt.B(8);
                if (interfaceC4265ot.peekFully(jt.f3266a, z5 ? 1 : 0, 8, true)) {
                    long jU = jt.u();
                    int iF = jt.f();
                    if (jU == 1) {
                        interfaceC4265ot.peekFully(jt.f3266a, 8, 8);
                        jt.D(16);
                        jU = jt.n();
                        i = 16;
                    } else {
                        if (jU == 0) {
                            long length2 = interfaceC4265ot.getLength();
                            if (length2 != j2) {
                                jU = (length2 - interfaceC4265ot.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (jU < j3) {
                        return z5;
                    }
                    i4 += i;
                    if (iF == 1836019574) {
                        i3 += (int) jU;
                        if (i2 != 0 && i3 > length) {
                            i3 = (int) length;
                        }
                        j2 = -1;
                    } else {
                        if (iF == 1836019558 || iF == 1836475768) {
                            z3 = true;
                            z4 = true;
                            if (z6 || z != z4) {
                                return false;
                            }
                            return z3;
                        }
                        int i5 = i2;
                        if ((((long) i4) + jU) - j3 < i3) {
                            int i6 = (int) (jU - j3);
                            i4 += i6;
                            if (iF == 1718909296) {
                                if (i6 < 8) {
                                    return false;
                                }
                                jt.B(i6);
                                interfaceC4265ot.peekFully(jt.f3266a, 0, i6);
                                int i7 = i6 / 4;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if (i8 != 1) {
                                        int iF2 = jt.f();
                                        if ((iF2 >>> 8) != 3368816 && (iF2 != 1751476579 || !z2)) {
                                            int[] iArr = e;
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= 29) {
                                                    continue;
                                                } else if (iArr[i9] != iF2) {
                                                    i9++;
                                                }
                                            }
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    jt.F(4);
                                }
                                if (!z6) {
                                    return false;
                                }
                            } else if (i6 != 0) {
                                interfaceC4265ot.advancePeekPosition(i6);
                            }
                            i2 = i5;
                            j2 = -1;
                            z5 = false;
                        }
                    }
                }
            }
            z3 = true;
            z4 = false;
            if (z6) {
            }
            return false;
        }
    }

    public static String e(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        int i5 = Ug0.f3833a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static int e0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static byte[] f(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static void f0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static void g(long j, C4848vb c4848vb, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 0;
        int i9 = 1;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i2 < i3) {
            int i10 = i2;
            while (true) {
                int i11 = i10 + 1;
                if (((C3971lc) arrayList.get(i10)).c() < i7) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (i11 >= i3) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        C3971lc c3971lc = (C3971lc) arrayList.get(i2);
        C3971lc c3971lc2 = (C3971lc) arrayList.get(i3 - 1);
        if (i7 == c3971lc.c()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i12 = i2 + 1;
            C3971lc c3971lc3 = (C3971lc) arrayList.get(i12);
            i4 = i12;
            i5 = iIntValue;
            c3971lc = c3971lc3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c3971lc.f(i7) == c3971lc2.f(i7)) {
            int iMin = Math.min(c3971lc.c(), c3971lc2.c());
            if (i7 < iMin) {
                int i13 = i7;
                while (true) {
                    int i14 = i13 + 1;
                    if (c3971lc.f(i13) != c3971lc2.f(i13)) {
                        break;
                    }
                    i8++;
                    if (i14 >= iMin) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
            }
            long j2 = 4;
            long j3 = (c4848vb.b / j2) + j + ((long) 2) + ((long) i8) + 1;
            c4848vb.U(-i8);
            c4848vb.U(i5);
            int i15 = i7 + i8;
            if (i7 < i15) {
                while (true) {
                    int i16 = i7 + 1;
                    c4848vb.U(c3971lc.f(i7) & 255);
                    if (i16 >= i15) {
                        break;
                    } else {
                        i7 = i16;
                    }
                }
            }
            if (i4 + 1 == i3) {
                if (i15 != ((C3971lc) arrayList.get(i4)).c()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c4848vb.U(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                C4848vb c4848vb2 = new C4848vb();
                c4848vb.U(((int) ((c4848vb2.b / j2) + j3)) * (-1));
                g(j3, c4848vb2, i15, arrayList, i4, i3, arrayList2);
                c4848vb.B(c4848vb2);
                return;
            }
        }
        int i17 = i4 + 1;
        if (i17 < i3) {
            while (true) {
                int i18 = i17 + 1;
                if (((C3971lc) arrayList.get(i17 - 1)).f(i7) != ((C3971lc) arrayList.get(i17)).f(i7)) {
                    i9++;
                }
                if (i18 >= i3) {
                    break;
                } else {
                    i17 = i18;
                }
            }
        }
        long j4 = 4;
        long j5 = ((long) (i9 * 2)) + (c4848vb.b / j4) + j + ((long) 2);
        c4848vb.U(i9);
        c4848vb.U(i5);
        if (i4 < i3) {
            int i19 = i4;
            while (true) {
                int i20 = i19 + 1;
                int iF = ((C3971lc) arrayList.get(i19)).f(i7);
                if (i19 == i4 || iF != ((C3971lc) arrayList.get(i19 - 1)).f(i7)) {
                    c4848vb.U(iF & 255);
                }
                if (i20 >= i3) {
                    break;
                } else {
                    i19 = i20;
                }
            }
        }
        C4848vb c4848vb3 = new C4848vb();
        while (i4 < i3) {
            byte bF = ((C3971lc) arrayList.get(i4)).f(i7);
            int i21 = i4 + 1;
            if (i21 >= i3) {
                i6 = i3;
                break;
            }
            int i22 = i21;
            while (true) {
                int i23 = i22 + 1;
                if (bF != ((C3971lc) arrayList.get(i22)).f(i7)) {
                    i6 = i22;
                    break;
                } else {
                    if (i23 >= i3) {
                        i6 = i3;
                        break;
                    }
                    i22 = i23;
                }
            }
            if (i21 == i6 && i7 + 1 == ((C3971lc) arrayList.get(i4)).c()) {
                c4848vb.U(((Number) arrayList2.get(i4)).intValue());
            } else {
                c4848vb.U(((int) ((c4848vb3.b / j4) + j5)) * (-1));
                g(j5, c4848vb3, i7 + 1, arrayList, i4, i6, arrayList2);
            }
            i4 = i6;
            c4848vb3 = c4848vb3;
            j4 = j4;
            j5 = j5;
        }
        c4848vb.B(c4848vb3);
    }

    public static ArrayList g0(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2538Kb) it.next()).toBundle());
        }
        return arrayList;
    }

    public static void h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static String h0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void i(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static long i0(long j, long j2, long j3, int i) {
        return j + Ug0.R(j2 - j3, 1000000L, i);
    }

    public static void j(int i, int i2) {
        String strL;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strL = L("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strL = L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String j0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void k(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static boolean l(InterfaceC4265ot interfaceC4265ot) {
        JT jt = new JT(8);
        int i = C2868Wu.d(interfaceC4265ot, jt).f3945a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC4265ot.peekFully(jt.f3266a, 0, 4);
        jt.E(0);
        if (jt.f() == 1463899717) {
            return true;
        }
        AbstractC4038mJ.c();
        return false;
    }

    public static void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void n(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void o(Object obj) {
        obj.getClass();
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, "index"));
        }
    }

    public static void r(int i, int i2, int i3) {
        String strB;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strB = b(i, i3, "start index");
            } else {
                strB = (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void s(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void t(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void v(InterfaceC4429ql interfaceC4429ql) {
        if (interfaceC4429ql != null) {
            try {
                interfaceC4429ql.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C3483g0 w(InterfaceC3299dt interfaceC3299dt) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC3299dt.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC3299dt.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C3483g0(1, 0, length, i);
    }

    public static Object x(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public Metadata y(C4747uP c4747uP) {
        ByteBuffer byteBuffer = c4747uP.d;
        byteBuffer.getClass();
        h(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c4747uP.c(Integer.MIN_VALUE)) {
            return null;
        }
        return z(c4747uP, byteBuffer);
    }

    public abstract Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer);
}
