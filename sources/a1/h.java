package a1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import d5.u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final e W;
    public static final e[][] X;
    public static final e[] Y;
    public static final HashMap[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap[] f3336a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Set f3337b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final HashMap f3338c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Charset f3339d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f3340e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f3341f0;
    public static final Pattern g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f3342h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f3343i0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap[] f3354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f3355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f3356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3359k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f3361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f3367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f3344v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f3345w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f3346x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f3347y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f3348z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        W = new e("StripOffsets", 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        f3336a0 = new HashMap[10];
        f3337b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f3338c0 = new HashMap();
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        f3339d0 = charsetForName;
        f3340e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f3341f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i10 >= eVarArr6.length) {
                HashMap map = f3338c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].f3330a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f3330a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f3330a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f3330a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f3330a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f3330a), 8);
                Pattern.compile(".*[1-9].*");
                g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f3342h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f3343i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i10] = new HashMap();
            f3336a0[i10] = new HashMap();
            for (e eVar : eVarArr6[i10]) {
                Z[i10].put(Integer.valueOf(eVar.f3330a), eVar);
                f3336a0[i10].put(eVar.f3331b, eVar);
            }
            i10++;
        }
    }

    public h(String str) throws Throwable {
        boolean z10;
        e[][] eVarArr = X;
        this.f3354f = new HashMap[eVarArr.length];
        this.f3355g = new HashSet(eVarArr.length);
        this.f3356h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f3351c = null;
        this.f3349a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f3344v) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f3350b = fileInputStream2.getFD();
                } else {
                    this.f3350b = null;
                }
                v(fileInputStream2);
                android.support.v4.media.session.a.e(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                android.support.v4.media.session.a.e(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Pair s(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairS = s(strArrSplit[0]);
            if (((Integer) pairS.first).intValue() == 2) {
                return pairS;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairS2 = s(strArrSplit[i10]);
                int iIntValue = (((Integer) pairS2.first).equals(pairS.first) || ((Integer) pairS2.second).equals(pairS.first)) ? ((Integer) pairS.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairS.second).intValue() == -1 || !(((Integer) pairS2.first).equals(pairS.second) || ((Integer) pairS2.second).equals(pairS.second))) ? -1 : ((Integer) pairS.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairS = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairS = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairS;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j10 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder y(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z10 = f3344v;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void A(g gVar, int i10) throws IOException {
        HashMap[] mapArr;
        long j10;
        long j11;
        boolean z10;
        int i11;
        long j12;
        Integer num;
        HashSet hashSet;
        long j13;
        String str;
        int unsignedShort;
        long j14;
        String strI;
        int i12;
        int i13 = gVar.f3320b;
        int i14 = gVar.f3323e;
        Integer numValueOf = Integer.valueOf(i13);
        HashSet hashSet2 = this.f3355g;
        hashSet2.add(numValueOf);
        short s10 = gVar.readShort();
        boolean z11 = f3344v;
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s10));
        }
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            mapArr = this.f3354f;
            if (s11 >= s10) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i15 = gVar.readInt();
            long j15 = ((long) gVar.f3320b) + 4;
            short s12 = s10;
            e eVar = (e) Z[i10].get(Integer.valueOf(unsignedShort2));
            if (z11) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), eVar != null ? eVar.f3331b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i15)));
            }
            if (eVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = U;
                    if (unsignedShort3 < iArr.length) {
                        int i16 = eVar.f3332c;
                        if (i16 == 7 || unsignedShort3 == 7 || i16 == unsignedShort3 || (i11 = eVar.f3333d) == unsignedShort3 || (((i16 == 4 || i11 == 4) && unsignedShort3 == 3) || (((i16 == 9 || i11 == 9) && unsignedShort3 == 8) || ((i16 == 12 || i11 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i16;
                            }
                            j10 = j15;
                            j11 = ((long) i15) * ((long) iArr[unsignedShort3]);
                            if (j11 < 0 || j11 > 2147483647L) {
                                if (z11 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i15);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z11 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + T[unsignedShort3] + ") is unexpected for tag: " + eVar.f3331b);
                        }
                    }
                    if (z10) {
                        j12 = j10;
                        if (j11 > 4) {
                            i12 = gVar.readInt();
                            if (z11 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f3352d == 7) {
                                if ("MakerNote".equals(eVar.f3331b)) {
                                    this.f3364q = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(eVar.f3331b)) {
                                    this.f3365r = i12;
                                    this.f3366s = i15;
                                    d dVarF = d.f(6, this.f3356h);
                                    d dVarC = d.c(this.f3365r, this.f3356h);
                                    d dVarC2 = d.c(this.f3366s, this.f3356h);
                                    mapArr[4].put("Compression", dVarF);
                                    mapArr[4].put("JPEGInterchangeFormat", dVarC);
                                    mapArr[4].put("JPEGInterchangeFormatLength", dVarC2);
                                }
                            }
                            gVar.h(i12);
                        } else {
                            j12 = j12;
                            unsignedShort2 = unsignedShort2;
                            eVar = eVar;
                        }
                        num = (Integer) f3338c0.get(Integer.valueOf(unsignedShort2));
                        if (z11 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j14 = ((long) gVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    j14 = -1;
                                }
                                if (z11 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                                }
                                if (j14 > 0 || (i14 != -1 && j14 >= i14)) {
                                    hashSet = hashSet2;
                                    if (z11 != 0) {
                                        strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i14 != -1) {
                                            strI = strI + " (total length: " + i14 + ")";
                                        }
                                        Log.d("ExifInterface", strI);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j14))) {
                                        gVar.h(j14);
                                        A(gVar, num.intValue());
                                    } else if (z11 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j14 + ")");
                                    }
                                }
                                gVar.h(j12);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            j14 = unsignedShort;
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                            }
                            if (j14 > 0) {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            gVar.h(j12);
                        } else {
                            hashSet = hashSet2;
                            j13 = j12;
                            int i17 = gVar.f3320b + this.f3363p;
                            byte[] bArr = new byte[(int) j11];
                            gVar.readFully(bArr);
                            d dVar = new d(i17, bArr, unsignedShort3, i15);
                            HashMap map = mapArr[i10];
                            str = eVar.f3331b;
                            map.put(str, dVar);
                            if ("DNGVersion".equals(str)) {
                                this.f3352d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && dVar.j(this.f3356h).contains("PENTAX")) || ("Compression".equals(str) && dVar.i(this.f3356h) == 65535)) {
                                this.f3352d = 8;
                            }
                            if (gVar.f3320b != j13) {
                                gVar.h(j13);
                            }
                        }
                    } else {
                        gVar.h(j10);
                        hashSet = hashSet2;
                    }
                    s11 = (short) (s11 + 1);
                    hashSet2 = hashSet;
                    s10 = s12;
                    z11 = z11;
                }
                j10 = j15;
                if (z11 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j11 = 0;
                z10 = false;
                if (z10) {
                    gVar.h(j10);
                    hashSet = hashSet2;
                } else {
                    j12 = j10;
                    if (j11 > 4) {
                        i12 = gVar.readInt();
                        if (z11 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f3352d == 7) {
                            if ("MakerNote".equals(eVar.f3331b)) {
                                this.f3364q = i12;
                            } else if (i10 != 6) {
                            }
                        }
                        gVar.h(i12);
                    } else {
                        j12 = j12;
                        unsignedShort2 = unsignedShort2;
                        eVar = eVar;
                    }
                    num = (Integer) f3338c0.get(Integer.valueOf(unsignedShort2));
                    if (z11 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j14 = ((long) gVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                            }
                            if (j14 > 0) {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            gVar.h(j12);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        j14 = unsignedShort;
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                        }
                        if (j14 > 0) {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        gVar.h(j12);
                    } else {
                        hashSet = hashSet2;
                        j13 = j12;
                        int i18 = gVar.f3320b + this.f3363p;
                        byte[] bArr2 = new byte[(int) j11];
                        gVar.readFully(bArr2);
                        d dVar2 = new d(i18, bArr2, unsignedShort3, i15);
                        HashMap map2 = mapArr[i10];
                        str = eVar.f3331b;
                        map2.put(str, dVar2);
                        if ("DNGVersion".equals(str)) {
                            this.f3352d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f3352d = 8;
                        if (gVar.f3320b != j13) {
                            gVar.h(j13);
                        }
                    }
                }
                s11 = (short) (s11 + 1);
                hashSet2 = hashSet;
                s10 = s12;
                z11 = z11;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j10 = j15;
            j11 = 0;
            z10 = false;
            if (z10) {
                gVar.h(j10);
                hashSet = hashSet2;
            } else {
                j12 = j10;
                if (j11 > 4) {
                    i12 = gVar.readInt();
                    if (z11 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f3352d == 7) {
                        if ("MakerNote".equals(eVar.f3331b)) {
                            this.f3364q = i12;
                        } else if (i10 != 6) {
                        }
                    }
                    gVar.h(i12);
                } else {
                    j12 = j12;
                    unsignedShort2 = unsignedShort2;
                    eVar = eVar;
                }
                num = (Integer) f3338c0.get(Integer.valueOf(unsignedShort2));
                if (z11 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j14 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                        }
                        if (j14 > 0) {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        gVar.h(j12);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j14 = unsignedShort;
                    if (z11 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar.f3331b));
                    }
                    if (j14 > 0) {
                        hashSet = hashSet2;
                        if (z11 != 0) {
                            strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                            if (i14 != -1) {
                                strI = strI + " (total length: " + i14 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z11 != 0) {
                            strI = defpackage.e.i(j14, "Skip jump into the IFD since its offset is invalid: ");
                            if (i14 != -1) {
                                strI = strI + " (total length: " + i14 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    }
                    gVar.h(j12);
                } else {
                    hashSet = hashSet2;
                    j13 = j12;
                    int i19 = gVar.f3320b + this.f3363p;
                    byte[] bArr3 = new byte[(int) j11];
                    gVar.readFully(bArr3);
                    d dVar3 = new d(i19, bArr3, unsignedShort3, i15);
                    HashMap map3 = mapArr[i10];
                    str = eVar.f3331b;
                    map3.put(str, dVar3);
                    if ("DNGVersion".equals(str)) {
                        this.f3352d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f3352d = 8;
                    if (gVar.f3320b != j13) {
                        gVar.h(j13);
                    }
                }
            }
            s11 = (short) (s11 + 1);
            hashSet2 = hashSet;
            s10 = s12;
            z11 = z11;
        }
        HashSet hashSet3 = hashSet2;
        boolean z12 = z11;
        int i20 = gVar.readInt();
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i20)));
        }
        long j16 = i20;
        if (j16 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i20))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        gVar.h(j16);
        if (mapArr[4].isEmpty()) {
            A(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            A(gVar, 5);
        }
    }

    public final void B(String str) {
        for (int i10 = 0; i10 < X.length; i10++) {
            this.f3354f[i10].remove(str);
        }
    }

    public final void C(int i10, String str, String str2) {
        HashMap[] mapArr = this.f3354f;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, (d) map.get(str));
        mapArr[i10].remove(str);
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b10;
        byte[] bArr;
        if (f3344v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f3363p = K(cVar);
        d dVar = this.f3367t;
        byte[] bArr2 = f3341f0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.j(bArr2.length + 2 + this.f3367t.f3329d.length);
            cVar.write(bArr2);
            cVar.write(this.f3367t.f3329d);
            this.f3368u = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                b10 = bVar.readByte();
            } while (b10 == -1);
            if (b10 == -39 || b10 == -38) {
                cVar.a(-1);
                cVar.a(b10);
                android.support.v4.media.session.a.i(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.a(-1);
                cVar.a(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.j(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                int length2 = bArr2.length;
                byte[] bArr4 = f3340e0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (android.support.v4.media.session.a.H(bArr, bArr4) || android.support.v4.media.session.a.H(bArr, bArr2)) {
                        bVar.a(length - bArr.length);
                    }
                }
                cVar.a(-1);
                cVar.a(b10);
                cVar.j(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i12);
                    length -= i12;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void E(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = a1.h.f3344v
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            a1.b r0 = new a1.b
            r0.<init>(r9)
            a1.c r9 = new a1.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = a1.h.I
            int r10 = r10.length
            android.support.v4.media.session.a.h(r0, r9, r10)
            a1.d r10 = r8.f3367t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.f3368u
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            android.support.v4.media.session.a.i(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            android.support.v4.media.session.a.h(r0, r9, r3)
            int r3 = r8.f3363p
            if (r3 != 0) goto L6a
            r8.L(r9)
            r1 = r2
        L6a:
            a1.d r3 = r8.f3367t
            if (r3 == 0) goto L41
            boolean r3 = r8.f3368u
            if (r3 != 0) goto L41
            r8.M(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.L(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = a1.h.J
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            a1.d r10 = r8.f3367t
            if (r10 == 0) goto La9
            r8.M(r9)
        La9:
            r0.a(r6)
            goto L75
        Lad:
            r9.b(r3)
            r9.b(r4)
            r9.write(r7)
            android.support.v4.media.session.a.h(r0, r9, r6)
            goto L41
        Lba:
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            android.support.v4.media.session.a.h(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void F(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.F(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    public final void G(b bVar) throws Throwable {
        String str;
        d dVar;
        int i10;
        HashMap map = this.f3354f[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f3362o = 6;
            t(bVar, map);
            return;
        }
        int i11 = dVar2.i(this.f3356h);
        this.f3362o = i11;
        int i12 = 1;
        if (i11 != 1) {
            if (i11 == 6) {
                t(bVar, map);
                return;
            } else if (i11 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f3356h);
            int[] iArr2 = f3347y;
            if (Arrays.equals(iArr2, iArr) || (this.f3352d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((i10 = dVar.i(this.f3356h)) == 1 && Arrays.equals(iArr, f3348z)) || (i10 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrG = android.support.v4.media.session.a.g(dVar4.k(this.f3356h));
                long[] jArrG2 = android.support.v4.media.session.a.g(dVar5.k(this.f3356h));
                if (jArrG == null || jArrG.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrG2 == null || jArrG2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrG.length != jArrG2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrG2) {
                    j10 += j11;
                }
                int i13 = (int) j10;
                byte[] bArr = new byte[i13];
                this.f3359k = true;
                this.f3358j = true;
                this.f3357i = true;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < jArrG.length) {
                    int i17 = (int) jArrG[i14];
                    int i18 = (int) jArrG2[i14];
                    if (i14 < jArrG.length - i12) {
                        str = str2;
                        if (i17 + i18 != jArrG[i14 + 1]) {
                            this.f3359k = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i19 = i17 - i15;
                    if (i19 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i19);
                        int i20 = i15 + i19;
                        byte[] bArr2 = new byte[i18];
                        try {
                            bVar.readFully(bArr2);
                            i15 = i20 + i18;
                            System.arraycopy(bArr2, 0, bArr, i16, i18);
                            i16 += i18;
                            i14++;
                            str2 = str3;
                            i12 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i18 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i19 + " bytes.");
                        return;
                    }
                }
                this.f3361n = bArr;
                if (this.f3359k) {
                    this.l = (int) jArrG[0];
                    this.f3360m = i13;
                    return;
                }
                return;
            }
        }
        if (f3344v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void H(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f3354f;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f3344v;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i10].get("ImageLength");
        d dVar2 = (d) mapArr[i10].get("ImageWidth");
        d dVar3 = (d) mapArr[i11].get("ImageLength");
        d dVar4 = (d) mapArr[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = dVar.i(this.f3356h);
        int i13 = dVar2.i(this.f3356h);
        int i14 = dVar3.i(this.f3356h);
        int i15 = dVar4.i(this.f3356h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void I(g gVar, int i10) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap[] mapArr = this.f3354f;
        d dVar = (d) mapArr[i10].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i10].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i10].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i10].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f3326a == 5) {
                f[] fVarArr = (f[]) dVar.k(this.f3356h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarF = d.e(new f[]{fVarArr[0]}, this.f3356h);
                    dVarF2 = d.e(new f[]{fVarArr[1]}, this.f3356h);
                }
            } else {
                int[] iArr = (int[]) dVar.k(this.f3356h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarF = d.f(iArr[0], this.f3356h);
                dVarF2 = d.f(iArr[1], this.f3356h);
            }
            mapArr[i10].put("ImageWidth", dVarF);
            mapArr[i10].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i11 = dVar2.i(this.f3356h);
            int i12 = dVar4.i(this.f3356h);
            int i13 = dVar5.i(this.f3356h);
            int i14 = dVar3.i(this.f3356h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            d dVarF3 = d.f(i12 - i11, this.f3356h);
            d dVarF4 = d.f(i13 - i14, this.f3356h);
            mapArr[i10].put("ImageLength", dVarF3);
            mapArr[i10].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = (d) mapArr[i10].get("ImageLength");
        d dVar7 = (d) mapArr[i10].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i10].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i15 = dVar8.i(this.f3356h);
            int i16 = dVar8.i(this.f3356h);
            gVar.h(i15);
            byte[] bArr = new byte[i16];
            gVar.readFully(bArr);
            g(new b(bArr), i15, i10);
        }
    }

    public final void J() throws Throwable {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.f3354f;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && u(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!u(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        C(0, "ThumbnailOrientation", "Orientation");
        C(0, "ThumbnailImageLength", "ImageLength");
        C(0, "ThumbnailImageWidth", "ImageWidth");
        C(5, "ThumbnailOrientation", "Orientation");
        C(5, "ThumbnailImageLength", "ImageLength");
        C(5, "ThumbnailImageWidth", "ImageWidth");
        C(4, "Orientation", "ThumbnailOrientation");
        C(4, "ImageLength", "ThumbnailImageLength");
        C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int K(c cVar) throws IOException {
        HashMap[] mapArr;
        int i10;
        int[] iArr;
        int i11;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            B(eVar.f3331b);
        }
        if (this.f3357i) {
            if (this.f3358j) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i12 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f3354f;
            if (i12 >= length) {
                break;
            }
            Iterator it = mapArr[i12].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i12++;
        }
        if (mapArr[1].isEmpty()) {
            i10 = 1;
        } else {
            i10 = 1;
            mapArr[0].put(eVarArr2[1].f3331b, d.c(0L, this.f3356h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(eVarArr2[2].f3331b, d.c(0L, this.f3356h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i10].put(eVarArr2[3].f3331b, d.c(0L, this.f3356h));
        }
        int i13 = 4;
        if (this.f3357i) {
            if (this.f3358j) {
                mapArr[4].put("StripOffsets", d.f(0, this.f3356h));
                mapArr[4].put("StripByteCounts", d.f(this.f3360m, this.f3356h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f3356h));
                mapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f3360m, this.f3356h));
            }
        }
        int i14 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = U;
            if (i14 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i14].entrySet().iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                d dVar = (d) ((Map.Entry) it2.next()).getValue();
                dVar.getClass();
                int i16 = iArr[dVar.f3326a] * dVar.f3327b;
                if (i16 > 4) {
                    i15 += i16;
                }
            }
            iArr3[i14] = iArr3[i14] + i15;
            i14++;
        }
        int size = 8;
        for (int i17 = 0; i17 < eVarArr.length; i17++) {
            if (!mapArr[i17].isEmpty()) {
                iArr2[i17] = size;
                size = (mapArr[i17].size() * 12) + 6 + iArr3[i17] + size;
            }
        }
        if (this.f3357i) {
            if (this.f3358j) {
                mapArr[4].put("StripOffsets", d.f(size, this.f3356h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.f3356h));
            }
            this.l = size;
            size += this.f3360m;
        }
        if (this.f3352d == 4) {
            size += 8;
        }
        if (f3344v) {
            for (int i18 = 0; i18 < eVarArr.length; i18++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i18), Integer.valueOf(iArr2[i18]), Integer.valueOf(mapArr[i18].size()), Integer.valueOf(iArr3[i18]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i10].isEmpty()) {
            mapArr[0].put(eVarArr2[i10].f3331b, d.c(iArr2[i10], this.f3356h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].f3331b, d.c(iArr2[2], this.f3356h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i10].put(eVarArr2[r6].f3331b, d.c(iArr2[3], this.f3356h));
        }
        int i19 = this.f3352d;
        if (i19 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(defpackage.e.h(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.j(size);
            cVar.write(f3340e0);
        } else if (i19 == 13) {
            cVar.b(size);
            cVar.b(1700284774);
        } else if (i19 == 14) {
            cVar.write(M);
            cVar.b(size);
        }
        int size2 = cVar.f3324a.size();
        cVar.c(this.f3356h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f3325b = this.f3356h;
        cVar.j(42);
        cVar.h(8L);
        int i20 = 0;
        while (i20 < eVarArr.length) {
            if (mapArr[i20].isEmpty()) {
                i11 = i13;
            } else {
                cVar.j(mapArr[i20].size());
                int size3 = (mapArr[i20].size() * 12) + iArr2[i20] + 2 + i13;
                for (Map.Entry entry : mapArr[i20].entrySet()) {
                    int i21 = ((e) f3336a0[i20].get(entry.getKey())).f3330a;
                    d dVar2 = (d) entry.getValue();
                    dVar2.getClass();
                    int i22 = dVar2.f3327b;
                    int i23 = dVar2.f3326a;
                    int i24 = iArr[i23] * i22;
                    cVar.j(i21);
                    cVar.j(i23);
                    cVar.b(i22);
                    if (i24 > 4) {
                        cVar.h(size3);
                        size3 += i24;
                    } else {
                        cVar.write(dVar2.f3329d);
                        if (i24 < 4) {
                            while (i24 < 4) {
                                cVar.a(0);
                                i24++;
                            }
                        }
                    }
                    i13 = 4;
                }
                int i25 = i13;
                if (i20 != 0 || mapArr[i25].isEmpty()) {
                    cVar.h(0L);
                } else {
                    cVar.h(iArr2[i25]);
                }
                Iterator it3 = mapArr[i20].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it3.next()).getValue()).f3329d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i11 = 4;
            }
            i20++;
            i13 = i11;
        }
        if (this.f3357i) {
            cVar.write(q());
        }
        if (this.f3352d == 14 && size % 2 == i10) {
            cVar.a(0);
        }
        cVar.f3325b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void L(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f3363p = cVar.f3324a.size() + K(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    public final void M(c cVar) throws IOException {
        cVar.b(this.f3367t.f3329d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.b(1767135348);
        crc32.update(InterfaceC0435l1.d.b.f29109f);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f3367t.f3329d);
        crc32.update(this.f3367t.f3329d);
        cVar.b((int) crc32.getValue());
        this.f3368u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f3354f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.f3356h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.f3356h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.f3356h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.f3356h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            int i10 = dVarE.f3326a;
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    u.o(i10, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                f[] fVarArr = (f[]) dVarE.k(this.f3356h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f3334a / fVar.f3335b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f3334a / fVar2.f3335b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f3334a / fVar3.f3335b)));
            }
            if (!f3337b0.contains(str)) {
                return dVarE.j(this.f3356h);
            }
            try {
                return Double.toString(dVarE.h(this.f3356h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i10, String str) {
        d dVarE = e(str);
        if (dVarE != null) {
            try {
                return dVarE.i(this.f3356h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final d e(String str) {
        d dVar;
        int i10;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f3344v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i10 = this.f3352d) != 4 && ((i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) && (dVar2 = this.f3367t) != null)) {
            return dVar2;
        }
        for (int i11 = 0; i11 < X.length; i11++) {
            d dVar3 = (d) this.f3354f[i11].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f3367t) == null) {
            return null;
        }
        return dVar;
    }

    public final void f(g gVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i10 == 15 && i12 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f3354f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.f3356h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.f3356h));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    if (i13 == 90) {
                        i11 = 6;
                    } else if (i13 != 180) {
                        i11 = i13 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    mapArr[0].put("Orientation", d.f(i11, this.f3356h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.h(i14);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f3340e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    gVar.readFully(bArr2);
                    this.f3363p = i16;
                    z(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i18;
                    gVar.h(j10);
                    byte[] bArr3 = new byte[i19];
                    gVar.readFully(bArr3);
                    this.f3367t = new d(j10, bArr3, 1, i19);
                    this.f3368u = true;
                }
                if (f3344v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

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
    public final void g(a1.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.g(a1.b, int, int):void");
    }

    public final double[] h() {
        String strC = c("GPSLatitude");
        String strC2 = c("GPSLatitudeRef");
        String strC3 = c("GPSLongitude");
        String strC4 = c("GPSLongitudeRef");
        if (strC == null || strC2 == null || strC3 == null || strC4 == null) {
            return null;
        }
        try {
            return new double[]{b(strC, strC2), b(strC3, strC4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sbV = defpackage.e.v("latValue=", strC, ", latRef=", strC2, ", lngValue=");
            sbV.append(strC3);
            sbV.append(", lngRef=");
            sbV.append(strC4);
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbV.toString()));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176 A[LOOP:2: B:122:0x0168->B:127:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f A[LOOP:3: B:133:0x0181->B:138:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0199  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a3 A[LOOP:4: B:140:0x0194->B:145:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x018c A[EDGE_INSN: B:183:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01a6 A[EDGE_INSN: B:184:0x01a6->B:146:0x01a6 BREAK  A[LOOP:4: B:140:0x0194->B:145:0x01a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x018c A[EDGE_INSN: B:185:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b A[RETURN] */
    public final int i(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i10;
        b bVar2;
        int i11;
        b bVar3;
        b bVar4;
        int i12;
        b bVar5;
        b bVar6;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        byte[] bArr3;
        b bVar7;
        short s10;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i18 = 0;
        while (true) {
            byte[] bArr5 = A;
            if (i18 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i18] != bArr5[i18]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i19 = 0; i19 < bytes.length; i19++) {
                    if (bArr4[i19] != bytes[i19]) {
                        int i20 = 1;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j11 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.readFully(bArr6);
                                    if (Arrays.equals(bArr6, B)) {
                                        if (j11 == 1) {
                                            j11 = bVar2.readLong();
                                            j10 = 16;
                                            if (j11 < 16) {
                                                bVar2.close();
                                                i10 = 0;
                                                i11 = 0;
                                            }
                                        } else {
                                            j10 = 8;
                                        }
                                        i10 = 0;
                                        long j12 = 5000;
                                        if (j11 > j12) {
                                            j11 = j12;
                                        }
                                        long j13 = j11 - j10;
                                        if (j13 >= 8) {
                                            try {
                                                byte[] bArr7 = new byte[4];
                                                long j14 = 0;
                                                boolean z10 = false;
                                                boolean z11 = false;
                                                boolean z12 = false;
                                                while (true) {
                                                    if (j14 < j13 / 4) {
                                                        try {
                                                            bVar2.readFully(bArr7);
                                                            if (j14 != 1) {
                                                                if (Arrays.equals(bArr7, C)) {
                                                                    z10 = true;
                                                                } else if (Arrays.equals(bArr7, D)) {
                                                                    z11 = true;
                                                                } else if (Arrays.equals(bArr7, E) || Arrays.equals(bArr7, F)) {
                                                                    z12 = true;
                                                                }
                                                                if (!z10) {
                                                                    continue;
                                                                } else if (z11) {
                                                                    bVar2.close();
                                                                    i11 = 12;
                                                                } else if (z12) {
                                                                    bVar2.close();
                                                                    i11 = 15;
                                                                }
                                                            }
                                                            j14++;
                                                        } catch (EOFException unused) {
                                                            bVar2.close();
                                                            i11 = i10;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (f3344v) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (bVar2 != null) {
                                                }
                                                i11 = i10;
                                                if (i11 != 0) {
                                                    return i11;
                                                }
                                                try {
                                                    bVar4 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderY = y(bVar4);
                                                        this.f3356h = byteOrderY;
                                                        bVar4.f3321c = byteOrderY;
                                                        s10 = bVar4.readShort();
                                                        if (s10 != 20306) {
                                                            i12 = 1;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                        bVar4.close();
                                                    } catch (Exception unused2) {
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        i12 = i10;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bVar3 = bVar4;
                                                        if (bVar3 != null) {
                                                            bVar3.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused3) {
                                                    bVar4 = null;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bVar3 = null;
                                                }
                                                if (i12 != 0) {
                                                    return 7;
                                                }
                                                try {
                                                    bVar7 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderY2 = y(bVar7);
                                                        this.f3356h = byteOrderY2;
                                                        bVar7.f3321c = byteOrderY2;
                                                        if (bVar7.readShort() == 85) {
                                                            i13 = 1;
                                                        } else {
                                                            i13 = i10;
                                                        }
                                                        bVar7.close();
                                                    } catch (Exception unused4) {
                                                        bVar6 = bVar7;
                                                        if (bVar6 != null) {
                                                            bVar6.close();
                                                        }
                                                        i13 = i10;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bVar5 = bVar7;
                                                        if (bVar5 != null) {
                                                            bVar5.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused5) {
                                                    bVar6 = null;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    bVar5 = null;
                                                }
                                                if (i13 != 0) {
                                                    return 10;
                                                }
                                                i14 = i10;
                                                while (true) {
                                                    bArr = I;
                                                    if (i14 < bArr.length) {
                                                        i15 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i14] != bArr[i14]) {
                                                        i15 = i10;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                                if (i15 != 0) {
                                                    return 13;
                                                }
                                                i16 = i10;
                                                while (true) {
                                                    bArr2 = K;
                                                    if (i16 < bArr2.length) {
                                                        i17 = i10;
                                                        while (true) {
                                                            bArr3 = L;
                                                            if (i17 >= bArr3.length) {
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i17 + 4] != bArr3[i17]) {
                                                                break;
                                                            }
                                                            i17++;
                                                        }
                                                        if (i20 != 0) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                    if (bArr4[i16] != bArr2[i16]) {
                                                        break;
                                                    }
                                                    i16++;
                                                }
                                                i20 = i10;
                                                if (i20 != 0) {
                                                    return 14;
                                                }
                                                return i10;
                                            }
                                        }
                                        bVar2.close();
                                        i11 = i10;
                                    } else {
                                        bVar2.close();
                                        i10 = 0;
                                        i11 = 0;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    bVar = bVar2;
                                    if (bVar != null) {
                                        bVar.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i10 = 0;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i10 = 0;
                            bVar2 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bVar = null;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        bVar4 = new b(bArr4);
                        ByteOrder byteOrderY3 = y(bVar4);
                        this.f3356h = byteOrderY3;
                        bVar4.f3321c = byteOrderY3;
                        s10 = bVar4.readShort();
                        if (s10 != 20306 || s10 == 21330) {
                            i12 = 1;
                        } else {
                            i12 = i10;
                        }
                        bVar4.close();
                        if (i12 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderY4 = y(bVar7);
                        this.f3356h = byteOrderY4;
                        bVar7.f3321c = byteOrderY4;
                        if (bVar7.readShort() == 85) {
                            i13 = 1;
                        } else {
                            i13 = i10;
                        }
                        bVar7.close();
                        if (i13 != 0) {
                            return 10;
                        }
                        i14 = i10;
                        while (true) {
                            bArr = I;
                            if (i14 < bArr.length) {
                                i15 = 1;
                                break;
                            }
                            if (bArr4[i14] != bArr[i14]) {
                                i15 = i10;
                                break;
                            }
                            i14++;
                        }
                        if (i15 != 0) {
                            return 13;
                        }
                        i16 = i10;
                        while (true) {
                            bArr2 = K;
                            if (i16 < bArr2.length) {
                                i17 = i10;
                                while (true) {
                                    bArr3 = L;
                                    if (i17 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i17 + 4] != bArr3[i17]) {
                                        break;
                                        break;
                                    }
                                    i17++;
                                }
                                if (i20 != 0) {
                                    return 14;
                                }
                                return i10;
                            }
                            if (bArr4[i16] != bArr2[i16]) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        i20 = i10;
                        if (i20 != 0) {
                            return 14;
                        }
                        return i10;
                    }
                }
                return 9;
            }
            i18++;
        }
    }

    public final void j(g gVar) throws Throwable {
        int i10;
        int i11;
        m(gVar);
        HashMap[] mapArr = this.f3354f;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f3329d);
            gVar2.f3321c = this.f3356h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.h(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.h(12L);
            }
            A(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.f3356h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarF = d.f(i14, this.f3356h);
                d dVarF2 = d.f(i15, this.f3356h);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        if (f3344v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f3321c = ByteOrder.BIG_ENDIAN;
        int i10 = bVar.f3320b;
        bVar.a(I.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int i11 = bVar.readInt();
                int i12 = bVar.readInt();
                int i13 = bVar.f3320b;
                int i14 = i13 + i11 + 4;
                int i15 = i13 - i10;
                if (i15 == 16 && i12 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == 1229278788) {
                    break;
                }
                if (i12 == 1700284774 && !z10) {
                    this.f3363p = i15;
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i16 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i12 >>> 24);
                    crc32.update(i12 >>> 16);
                    crc32.update(i12 >>> 8);
                    crc32.update(i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i16) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i16 + ", calculated CRC value: " + crc32.getValue());
                    }
                    z(0, bArr);
                    J();
                    G(new b(bArr));
                    z10 = true;
                } else if (i12 == 1767135348 && !z11) {
                    byte[] bArr2 = J;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i17 = bVar.f3320b - i10;
                            int i18 = i11 - length;
                            byte[] bArr4 = new byte[i18];
                            bVar.readFully(bArr4);
                            this.f3367t = new d(i17, bArr4, 1, i18);
                            z11 = true;
                        }
                    }
                }
                bVar.a(i14 - bVar.f3320b);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f3368u = z11;
    }

    public final void l(b bVar) throws Throwable {
        boolean z10 = f3344v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f3320b);
        bVar.readFully(bArr4);
        g(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f3320b);
        bVar.f3321c = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.f3330a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarF = d.f(s10, this.f3356h);
                d dVarF2 = d.f(s11, this.f3356h);
                HashMap[] mapArr = this.f3354f;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void m(g gVar) throws Throwable {
        w(gVar);
        A(gVar, 0);
        I(gVar, 0);
        I(gVar, 5);
        I(gVar, 4);
        J();
        if (this.f3352d == 8) {
            HashMap[] mapArr = this.f3354f;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f3329d);
                gVar2.f3321c = this.f3356h;
                gVar2.a(6);
                A(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final int n() {
        switch (d(1, "Orientation")) {
            case 3:
            case 4:
                return 180;
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

    public final void o(g gVar) throws Throwable {
        if (f3344v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        HashMap[] mapArr = this.f3354f;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f3329d), (int) dVar.f3328c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean p(g gVar) throws IOException {
        byte[] bArr = f3340e0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        while (true) {
            if (i10 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i11 = gVar.f3319a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
            if (i11 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i10);
                this.f3363p = bArr.length;
                z(0, bArrCopyOf2);
                return true;
            }
            i10 += i11;
            gVar.f3320b += i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] q() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.f3357i) {
            byte[] bArr2 = this.f3361n;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                fileInputStream = this.f3351c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                            android.support.v4.media.session.a.e(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            try {
                                b bVar = new b(fileInputStream);
                                bVar.a(this.l + this.f3363p);
                                bArr = new byte[this.f3360m];
                                bVar.readFully(bArr);
                                this.f3361n = bArr;
                                android.support.v4.media.session.a.e(fileInputStream);
                                if (fileDescriptor != null) {
                                    try {
                                        Os.close(fileDescriptor);
                                        return bArr;
                                    } catch (ErrnoException e10) {
                                        Log.e("ExifInterfaceUtils", "Error closing fd.", e10);
                                    }
                                }
                                return bArr;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = fileInputStream;
                                android.support.v4.media.session.a.e(inputStream);
                                if (fileDescriptor != null) {
                                    try {
                                        Os.close(fileDescriptor);
                                    } catch (ErrnoException e11) {
                                        Log.e("ExifInterfaceUtils", "Error closing fd.", e11);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                            android.support.v4.media.session.a.e(fileInputStream);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                } catch (ErrnoException e13) {
                                    Log.e("ExifInterfaceUtils", "Error closing fd.", e13);
                                }
                            }
                            return null;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        fileDescriptor = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = null;
                        inputStream = fileInputStream;
                        android.support.v4.media.session.a.e(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                } else {
                    if (this.f3349a != null) {
                        fileInputStream = new FileInputStream(this.f3349a);
                        fileDescriptor = null;
                        b bVar2 = new b(fileInputStream);
                        bVar2.a(this.l + this.f3363p);
                        bArr = new byte[this.f3360m];
                        bVar2.readFully(bArr);
                        this.f3361n = bArr;
                        android.support.v4.media.session.a.e(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptorDup = Os.dup(this.f3350b);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = new FileInputStream(fileDescriptorDup);
                        b bVar3 = new b(fileInputStream);
                        bVar3.a(this.l + this.f3363p);
                        bArr = new byte[this.f3360m];
                        bVar3.readFully(bArr);
                        this.f3361n = bArr;
                        android.support.v4.media.session.a.e(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    } catch (Exception e15) {
                        e = e15;
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileDescriptor = fileDescriptorDup;
                        android.support.v4.media.session.a.e(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Exception e16) {
                e = e16;
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th5) {
                th = th5;
                fileDescriptor = null;
            }
            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
            android.support.v4.media.session.a.e(fileInputStream);
            if (fileDescriptor != null) {
                Os.close(fileDescriptor);
            }
        }
        return null;
    }

    public final void r(b bVar) throws Throwable {
        if (f3344v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f3321c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f3340e0;
                    if (android.support.v4.media.session.a.H(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f3363p = i12;
                    z(0, bArrCopyOfRange);
                    G(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void t(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i10 = dVar.i(this.f3356h);
        int i11 = dVar2.i(this.f3356h);
        if (this.f3352d == 7) {
            i10 += this.f3364q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f3357i = true;
            if (this.f3349a == null && this.f3351c == null && this.f3350b == null) {
                byte[] bArr = new byte[i11];
                bVar.a(i10);
                bVar.readFully(bArr);
                this.f3361n = bArr;
            }
            this.l = i10;
            this.f3360m = i11;
        }
        if (f3344v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    public final boolean u(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f3356h) <= 512 && dVar2.i(this.f3356h) <= 512;
    }

    public final void v(InputStream inputStream) {
        boolean z10 = f3344v;
        for (int i10 = 0; i10 < X.length; i10++) {
            try {
                try {
                    this.f3354f[i10] = new HashMap();
                } catch (IOException | UnsupportedOperationException e10) {
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (z10) {
                        x();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                a();
                if (z10) {
                    x();
                }
                throw th2;
            }
        }
        boolean z11 = this.f3353e;
        if (!z11) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3352d = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i11 = this.f3352d;
        if (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) {
            b bVar = new b(inputStream);
            int i12 = this.f3352d;
            if (i12 == 4) {
                g(bVar, 0, 0);
            } else if (i12 == 13) {
                k(bVar);
            } else if (i12 == 9) {
                l(bVar);
            } else if (i12 == 14) {
                r(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z11) {
                int i13 = this.f3352d;
                if (i13 == 12 || i13 == 15) {
                    f(gVar, i13);
                } else if (i13 == 7) {
                    j(gVar);
                } else if (i13 == 10) {
                    o(gVar);
                } else {
                    m(gVar);
                }
            } else if (!p(gVar)) {
                a();
                if (z10) {
                    x();
                    return;
                }
                return;
            }
            gVar.h(this.f3363p);
            G(gVar);
        }
        a();
        if (z10) {
            x();
        }
    }

    public final void w(g gVar) throws IOException {
        ByteOrder byteOrderY = y(gVar);
        this.f3356h = byteOrderY;
        gVar.f3321c = byteOrderY;
        int unsignedShort = gVar.readUnsignedShort();
        int i10 = this.f3352d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = gVar.readInt();
        if (i11 < 8) {
            throw new IOException(l1.d.e(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            gVar.a(i12);
        }
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f3354f;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbU = defpackage.e.u(i10, "The size of tag group[", "]: ");
            sbU.append(mapArr[i10].size());
            Log.d("ExifInterface", sbU.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.j(this.f3356h) + "'");
            }
            i10++;
        }
    }

    public final void z(int i10, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        w(gVar);
        A(gVar, i10);
    }

    public h(InputStream inputStream) throws IOException {
        e[][] eVarArr = X;
        this.f3354f = new HashMap[eVarArr.length];
        this.f3355g = new HashSet(eVarArr.length);
        this.f3356h = ByteOrder.BIG_ENDIAN;
        this.f3349a = null;
        this.f3353e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f3351c = (AssetManager.AssetInputStream) inputStream;
            this.f3350b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f3351c = null;
                this.f3350b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f3344v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f3351c = null;
                this.f3350b = null;
            }
        } else {
            this.f3351c = null;
            this.f3350b = null;
        }
        v(inputStream);
    }
}
