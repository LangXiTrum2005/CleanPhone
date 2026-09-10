package com.facebook.ads.redexgen.core;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.compression.lzma.Base;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1600gE {
    public static byte[] A00;
    public static String[] A01 = {"bbKjH7ZqvrNgg2JoLCbdalacXCLBSOoo", "zT4moXI1y", "6cEZtRcbvzHYw13p20B89Ci", "WWLzGh3Jc", "QcRVcN81i9no2By9oXlGVJzVGhqL0Tuf", "oQg07j295n98Sl5adHTlq", "BZK9xvLAjR27QeAH7DQRoaq11Kx1jZQk", "1stHAKib0sqZ0kJCVJhiZwh1no7Of4np"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final byte[] A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final String[] A0E;
    public static final String[] A0F;

    public static String A0i(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0v() {
        A00 = new byte[]{-87, -79, -43, -14, -9, -2, 1, -60, -54, -9, -19, -5, -8, -14, -19, -87, -103, -100, -49, -75, -95, -70, -43, -95, -38, -92, -95, -83, -47, -17, -90, -15, -99, 66, 89, 84, 72, 68, 118, 72, 67, 89, -125, -115, -121, -122, 89, 66, 89, 84, 73, 66, -121, 123, -120, -125, -128, 127, -115, -114, 66, 72, 68, 67, 67, 89, 67, 89, 118, -86, -78, -86, -78, -86, -78, -86, -78, 119, -86, 123, 118, -86, -78, -86, -78, 119, -86, 123, 118, -86, -78, -86, -78, 119, -87, -94, -62, -85, 118, -86, -78, -86, -78, 119, -120, 118, -86, -78, -86, -78, 119, -120, 118, -86, -78, -86, -78, 119, 118, -87, -86, 124, 122, -85, 118, -86, -78, 121, 119, 119, -115, 118, -87, -88, -56, -85, -54, 118, 118, -86, 121, -54, -86, 123, 119, 118, -86, -78, -115, -86, -78, 119, -120, -115, 118, -86, -78, -86, -78, 119, 119, 119, -115, 64, 55, -98, 71, 59, -84, -99, 117, -123, 116, -119, 124, 116, -63, -12, -21, -52, -24, -35, -11, -31, -18, -56, -27, -34, -85, -82, -86, -76, -86, -83, -85, -58, -50, -47, -54, -55, -123, -39, -44, -123, -41, -54, -58, -55, -123, -40, -34, -40, -39, -54, -46, -123, -43, -41, -44, -43, -54, -41, -39, -34, -123, -113, -76, -68, -89, -78, -81, -86, 102, -86, -81, -71, -74, -78, -89, -65, 102, -71, -81, -64, -85, -128, 102, -84, -83, 105, 106, 122, 96, 115, 94, 96, 96, 95, 110, 122, 94, 92, 107, 92, 93, 100, 103, 100, 111, 100, 96, 110, -122, -121, -105, -115, -122, -117, -115, -120, -120, -121, -118, -116, 125, 124, -105, 124, -118, -123, -103, -102, -86, -96, -103, -98, -96, -101, -101, -102, -99, -97, -112, -113, -86, -97, -92, -101, -112, -63, -35, -36, -25, -99, -68, -79, -76, -84, -104, -90, -95, 107, 112, 108, -126, -109, 107, 107, -98, 115, 112, 124, -96, 109, 108, -100, 108, -126, 107, 107, -98, 115, 112, 124, -96, 109, 108, -112, 108, -126, 107, 107, -98, 115, 112, 124, -96, 109, 108, -121, 108, -126, 107, -105, 107, 107, -98, 115, 112, 124, -96, 109, 108, -117, 108, -126, 107, 107, -98, 115, 112, 124, -96, 109, 108, -112, 108, -126, 107, 107, -98, 115, 112, 124, 113, -96, 109, 108, -106, 108, -126, 108, -126, 103, -55, -45, -107, -36, -33, -47, -22, -11, -21, -118, -105, -115, -101, -104, -110, -115, 87, -111, -118, -101, -115, -96, -118, -101, -114, 87, -99, -94, -103, -114, 87, -118, -98, -99, -104, -106, -104, -99, -110, -97, -114, -22, -9, -19, -5, -8, -14, -19, -73, -8, -4, -73, -36, 2, -4, -3, -18, -10, -39, -5, -8, -7, -18, -5, -3, -14, -18, -4, -117, -102, -102, -106, -109, -115, -117, -98, -109, -103, -104, 89, -114, -117, -99, -110, 85, -94, -105, -106, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -59, -67, -77, 125, -68, -62, 124, -62, -62, -61, -63, 122, -57, -68, -69, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -57, 124, -68, -65, -76, -74, -92, -95, -101, -22, -7, -7, -11, -14, -20, -22, -3, -14, -8, -9, -72, 1, -74, -5, -3, -4, -7, -115, -98, 89, -115, -98, -114, 124, -115, 125, -100, -83, -88, -123, -124, -108, -102, -89, -82, -69, -65, -110, -93, -99, -80, -83, -99, -94, -93, -15, -5, -4, -75, -63, -65, -128, -59, -63, -64, -53, -128, -74, -58, -56, -128, -70, -77, -60, -74, -55, -77, -60, -73, -128, -62, -77, -64, -73, -66, -128, -61, -72, -70, -74, -119, -103, -38, -16, -78, -55, -76, 122, 123, -68, -63, -53, -56, -60, -71, -47, -84, -67, -68, 124, -125, 122, -118, -122, -127, -61, -58, -55, -62, -60, -51, -48, -53, -65, -46, -101, -53, -111, -45, -106, -117, -65, -65, -50, -54, -121, -112, -109, -114, -126, -107, 94, -114, -111, -123, 78, -107, -118, -114, -122, 78, -124, -108, -121, -89, -77, -72, -60, -73, -103, -105, -95, -128, 126, -117, -84, -86, -71, -82, -71, -84, -34, -41, -31, -49, -55, -38, -108, -55, -42, -38, -66, -72, -55, -125, -66, -56, -52, -71, -77, -60, 126, -60, -61, -63, -35, -38, -35, -38, -41, -110, -100, -70, -60, -56, -51, -40, -45, -88, -71, -127, 69, -128, 121, -125, -111, 85, -108, -99, -96, -28, -88, -23, -36, -15, -36, -27, -22, -55, -61, -59, -95, -100, -110, -105, -57, -52, -62, -71, -61, -73, -63, -69, -109, -99, -105, -106, -56, -42, -20, -21, -37, -47, -61, -71, -119, 79, -111, 84, -100, -112, -110, -22, -34, -20, -52, -64, -40, -45, -49, -55, -57, -113, -110, -122, -100, -94, -99, -93, 93, -103, -98, -108, -63, -51, -75, -88, -75, -89, -101, -97, -99, -60, -60, -60, -60, -59, -105, -104, 86, -117, -104, -108, -2, -1, -67, -2, -2, -1, -60, -59, -125, -60, -59, -72, -80, -79, 111, -80, -69, -80, -90, -89, -102, -99, -91, -77, -88, -75, -69, -72, -20, -18, -19, -22, -84, -81, -89, -36, -52, -52, -11, -19, -39, -46, -43, -113, -115, -85, -87, -92, -95, -84, -99, -105, -91, -103, -85, -84, -99, -86, -68, -69, 1, 0, -2, -67, -61, -67, 120, -82, -77, -67, -70, -74, -85, -61, 119, -67, -77, -60, -81, -32, -50, -40, -53, -38, -51, -39, -47, -116, -87, -116, -85, -77, -88, -95, -77, -74, -117, -114, -128, -47, -59, -55, -53, -64, -63, -67, -84, -75, -85, -74, -71, 117, -85, -80, -70, -73, -77, -88, -64, 116, -70, -80, -63, -84, -95, -113, -106, -104, -118, -113, -123, -112, -104, -78, -11, -27, -13, -31, -66, -84, 113, -89, -79, -78, -13, -31, -90, -32, -18, -24, -14, -18, -75, -93, 104, -93, -100, -90, -80, -98, 99, -98, -105, -95, -95, -105, 
        -37, -55, -114, -55, -44, -49, -92, -110, 87, -105, -109, -104, 87, -104, -117, -104, -38, -56, -115, -50, -63, -50, -85, -103, 94, -87, -102, -110, -97, -104};
    }

    static {
        A0v();
        A02 = Build.VERSION.SDK_INT;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder sbAppend = new StringBuilder().append(A03);
        String strA0i = A0i(166, 2, 6);
        A04 = sbAppend.append(strA0i).append(A06).append(strA0i).append(A05).append(strA0i).append(A02).toString();
        A07 = new byte[0];
        A0A = Pattern.compile(A0i(68, 95, 57));
        A0B = Pattern.compile(A0i(EnumC4719u30.WEBVIEW_ERROR_VALUE, 84, 46));
        A08 = Pattern.compile(A0i(16, 17, 95));
        A09 = Pattern.compile(A0i(33, 35, 5), 2);
        A0E = new String[]{A0i(410, 3, 116), A0i(877, 2, 7), A0i(567, 3, 38), A0i(739, 2, 43), A0i(570, 3, 14), A0i(642, 2, 0), A0i(580, 3, 38), A0i(814, 2, 63), A0i(925, 3, 42), A0i(573, 2, 35), A0i(583, 3, 37), A0i(970, 2, 100), A0i(625, 3, 58), A0i(621, 2, 17), A0i(637, 3, 51), A0i(821, 2, 28), A0i(693, 3, 4), A0i(628, 2, 1), A0i(699, 3, 50), A0i(640, 2, 2), A0i(687, 3, 61), A0i(685, 2, 44), A0i(690, 3, 29), A0i(782, 2, 91), A0i(759, 3, 75), A0i(GL20.GL_ONE_MINUS_SRC_COLOR, 2, 59), A0i(790, 3, 26), A0i(801, 2, 71), A0i(793, 3, 104), A0i(799, 2, 81), A0i(796, 3, 74), A0i(806, 2, 26), A0i(857, 3, 46), A0i(644, 2, 11), A0i(866, 3, 37), A0i(860, 2, 52), A0i(869, 3, 84), A0i(719, 7, 60), A0i(874, 3, 81), A0i(872, 2, 109), A0i(958, 3, 21), A0i(623, 2, 98), A0i(762, 2, 35), A0i(808, 6, 27), A0i(778, 2, 74), A0i(726, 2, 96), A0i(728, 3, 96), A0i(726, 2, 96), A0i(780, 2, 109), A0i(968, 2, 103), A0i(564, 3, 6), A0i(558, 6, 23), A0i(764, 2, 20), A0i(808, 6, 27), A0i(766, 3, 73), A0i(808, 6, 27), A0i(819, 2, 36), A0i(840, 6, 65), A0i(852, 3, 35), A0i(840, 6, 65), A0i(823, 2, 65), A0i(834, 6, 123), A0i(825, 3, 65), A0i(834, 6, 123), A0i(928, 2, 42), A0i(404, 6, 83), A0i(930, 3, 2), A0i(404, 6, 83), A0i(578, 2, 27), A0i(TypedValues.TransitionType.TYPE_INTERPOLATOR, 7, 82), A0i(575, 3, 55), A0i(TypedValues.TransitionType.TYPE_INTERPOLATOR, 7, 82), A0i(731, 2, 21), A0i(712, 7, 65), A0i(733, 3, 61), A0i(712, 7, 65), A0i(892, 2, 52), A0i(719, 7, 60), A0i(894, 3, 121), A0i(719, 7, 60), A0i(586, 3, 121), A0i(972, 6, 47), A0i(TypedValues.TransitionType.TYPE_TO, 3, 97), A0i(986, 6, 38), A0i(816, 3, 50), A0i(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 6, 75), A0i(736, 3, 80), A0i(1000, 6, 76)};
        A0F = new String[]{A0i(746, 5, 19), A0i(784, 2, 66), A0i(741, 5, 3), A0i(986, 6, 38), A0i(751, 8, 102), A0i(855, 2, 26), A0i(828, 6, 20), A0i(840, 6, 65), A0i(846, 6, 45), A0i(834, 6, 123), A0i(978, 8, 100), A0i(972, 6, 47), A0i(992, 8, 33), A0i(986, 6, 38), A0i(PointerIconCompat.TYPE_CELL, 10, 21), A0i(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 6, 75), A0i(1022, 8, 28), A0i(1000, 6, 76)};
        A0C = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A0D = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, EnumC4719u30.JSON_ENCODE_ERROR_VALUE, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, EnumC4719u30.INVALID_GZIP_BID_PAYLOAD_VALUE, EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, 205, Input.Keys.NUMPAD_0, Input.Keys.NUMPAD_7, Input.Keys.NUMPAD_DOT, Input.Keys.NUMPAD_9, Input.Keys.F10, Input.Keys.F9, 130, 133, 168, 175, 166, Input.Keys.NUMPAD_EQUALS, 180, 179, Input.Keys.F16, 189, 199, 192, 201, 206, EnumC4719u30.MRAID_JS_COPY_FAILED_VALUE, EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, EnumC4719u30.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, 227, 228, 237, 234, Input.Keys.F13, 176, Input.Keys.F15, Input.Keys.F20, 171, 172, 165, Input.Keys.NUMPAD_LEFT_PAREN, Input.Keys.NUM_LOCK, 136, 129, 134, Input.Keys.NUMPAD_3, Input.Keys.NUMPAD_4, Input.Keys.NUMPAD_ADD, Input.Keys.NUMPAD_DIVIDE, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 122, 137, Input.Keys.F12, 135, 128, Input.Keys.NUMPAD_5, Input.Keys.NUMPAD_2, Input.Keys.NUMPAD_MULTIPLY, Input.Keys.NUMPAD_SUBTRACT, 177, 182, Input.Keys.F21, Input.Keys.F14, 173, 170, Input.Keys.NUMPAD_RIGHT_PAREN, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, Input.Keys.F23, 198, 207, 200, EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, EnumC4719u30.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, 120, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, Input.Keys.NUMPAD_ENTER, 167, 178, 181, Input.Keys.F18, Input.Keys.F17, Input.Keys.NUMPAD_6, Input.Keys.NUMPAD_1, Input.Keys.NUMPAD_8, Input.Keys.NUMPAD_COMMA, 138, Input.Keys.F11, 132, 131, EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, Input.Keys.F24, 197, 204, 203, 230, 225, 232, 239, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, Input.Keys.COLON};
    }

    public static float A00(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                if (A01[4].charAt(26) != 'q') {
                    throw new RuntimeException();
                }
                A01[5] = "0BqAMz80hYmBqXUIiuDmb";
                return 1276;
            case 8:
                int i2 = A02;
                if (A01[6].charAt(22) == 'P') {
                    throw new RuntimeException();
                }
                A01[6] = "9N3unhtn8jZM2LIt5I30ekADgN0U3Azr";
                return (i2 < 23 && A02 < 21) ? 0 : 6396;
            case 9:
            case 10:
            case 11:
            default:
                return 0;
            case 12:
                if (A02 < 32) {
                    return 0;
                }
                return 743676;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case 2:
            case 4:
            case 7:
            case 16:
            case 18:
                return 6005;
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 23:
            default:
                if (A01[2].length() == 30) {
                    throw new RuntimeException();
                }
                A01[2] = "Csm9gU";
                return 6006;
            case 8:
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 10:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 8:
                return 3;
            case 16:
                if (A01[6].charAt(22) == 'P') {
                    throw new RuntimeException();
                }
                A01[4] = "gBFmfliucEMtJsCSFMbrlSNDTmqQWY4S";
                return 2;
            case 24:
                return 536870912;
            case 32:
                return 805306368;
            default:
                return 0;
        }
    }

    public static int A04(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                String[] strArr = A01;
                if (strArr[0].charAt(14) != strArr[7].charAt(14)) {
                    String[] strArr2 = A01;
                    strArr2[1] = "2mF3f7qqM";
                    strArr2[3] = "1fjuXItru";
                    return 8;
                }
                A01[4] = "8VXdjTGzEDwlUVJMAQvMl3j4L0qeZUXl";
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                if (A01[6].charAt(22) == 'P') {
                    throw new RuntimeException();
                }
                A01[6] = "gtEHCOzfi1cFbaTJyD0vAPMLWmK1rRQp";
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A05(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int A06(int i, int i2) {
        switch (i) {
            case 2:
            case 268435456:
                return i2 * 2;
            case 3:
                return i2;
            case 4:
            case 805306368:
                return i2 * 4;
            case 536870912:
                return i2 * 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A07(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int A08(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int A09(Context context, String str, boolean z) {
        if (A02 >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return 5;
        }
        String[] strArr = A01;
        if (strArr[1].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A01[5] = "gpE5cfDz7dgipzGTNJ4r5";
        return 1;
    }

    public static int A0A(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String scheme2 = A0i(862, 4, 101);
            if (AbstractC1684hb.A03(scheme2, scheme)) {
                return 3;
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String scheme3 = lastPathSegment.substring(iLastIndexOf + 1);
            int iA0E = A0E(scheme3);
            if (iA0E != 4) {
                return iA0E;
            }
        }
        Pattern pattern = A09;
        String scheme4 = uri.getPath();
        Matcher matcher = pattern.matcher((CharSequence) AbstractC1517es.A01(scheme4));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        String scheme5 = A01[2];
        if (scheme5.length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "KWbNxlBDR";
        strArr[3] = "nXIJn7KO8";
        String scheme6 = A0i(TTAdConstant.STYLE_SIZE_RADIO_2_3, 19, 12);
        if (strGroup.contains(scheme6)) {
            return 0;
        }
        String scheme7 = A0i(650, 16, 73);
        if (strGroup.contains(scheme7)) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    public static int A0B(Uri uri, String str) {
        byte b;
        if (str == null) {
            return A0A(uri);
        }
        switch (str.hashCode()) {
            case -979127466:
                if (!str.equals(A0i(GL20.GL_ALWAYS, 21, 58))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -156749520:
                if (!str.equals(A0i(492, 27, 58))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 64194685:
                if (!str.equals(A0i(472, 20, 21))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1154777587:
                if (!str.equals(A0i(540, 18, 116))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int A0C(C1562fc c1562fc, long j, boolean z, boolean z2) {
        int i = 0;
        int lowIndex = c1562fc.A02();
        int i2 = lowIndex - 1;
        while (i <= i2) {
            int lowIndex2 = i + i2;
            int i3 = lowIndex2 >>> 1;
            if (c1562fc.A03(i3) < j) {
                i = i3 + 1;
            } else {
                i2 = i3 - 1;
            }
        }
        if (z) {
            int highIndex = i2 + 1;
            int lowIndex3 = c1562fc.A02();
            if (highIndex < lowIndex3) {
                int lowIndex4 = i2 + 1;
                if (c1562fc.A03(lowIndex4) == j) {
                    return i2 + 1;
                }
            }
        }
        if (!z2 || i2 != -1) {
            return i2;
        }
        return 0;
    }

    public static int A0D(String str) {
        int length = str.length();
        AbstractC1517es.A07(length <= 4);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int length2 = str.charAt(i);
            result = (result << 8) | length2;
        }
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    public static int A0E(String str) {
        byte b;
        String strA01 = AbstractC1684hb.A01(str);
        switch (strA01.hashCode()) {
            case 104579:
                if (!strA01.equals(A0i(GL20.GL_ONE_MINUS_SRC_ALPHA, 3, 57))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 108321:
                if (!strA01.equals(A0i(803, 3, 13))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3242057:
                String strA0i = A0i(GL20.GL_DST_COLOR, 4, 21);
                if (A01[2].length() == 30) {
                    String[] strArr = A01;
                    strArr[1] = "oWV7Ow6sR";
                    strArr[3] = "n4C8iSANb";
                    if (!strA01.equals(strA0i)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                } else {
                    A01[4] = "QQD7ZBqKFUFEPEKaa603FvGDkWqUySyg";
                    if (!strA01.equals(strA0i)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                }
                break;
            case 3299913:
                if (!strA01.equals(A0i(786, 4, 7))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
            case 3:
                return 1;
            default:
                String[] strArr2 = A01;
                if (strArr2[1].length() != strArr2[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[1] = "P8w9kP7gE";
                strArr3[3] = "J9iNpMOcC";
                return 4;
        }
    }

    public static int A0F(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static <T extends Comparable<? super T>> int A0G(List<? extends Comparable<? super T>> list, T value, boolean z, boolean z2) {
        int index;
        int iBinarySearch = Collections.binarySearch(list, value);
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        } else {
            int listSize = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= listSize) {
                    break;
                }
                index = list.get(iBinarySearch).compareTo(value);
            } while (index == 0);
            if (z) {
                iBinarySearch--;
            }
        }
        if (!z2) {
            return iBinarySearch;
        }
        int index2 = list.size();
        return Math.min(index2 - 1, iBinarySearch);
    }

    public static <T extends Comparable<? super T>> int A0H(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int iCompareTo;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            int index = iBinarySearch + 2;
            iBinarySearch = -index;
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
                iCompareTo = list.get(iBinarySearch).compareTo(t);
                if (A01[2].length() == 30) {
                    throw new RuntimeException();
                }
                A01[2] = "VRYAuUxJ";
            } while (iCompareTo == 0);
            if (z) {
                iBinarySearch++;
            }
        }
        return z2 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static int A0I(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int[] iArr = A0C;
            int i4 = bArr[i];
            i3 = (i3 << 8) ^ iArr[((i3 >>> 24) ^ (i4 & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int A0J(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int[] iArr = A0D;
            int i4 = bArr[i];
            i3 = iArr[(i4 & 255) ^ i3];
            i++;
        }
        return i3;
    }

    public static int A0K(long[] jArr, long j, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                int index = jArr.length;
                if (iBinarySearch >= index) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            if (z) {
                iBinarySearch--;
            }
        }
        if (!z2) {
            return iBinarySearch;
        }
        int index2 = jArr.length;
        return Math.min(index2 - 1, iBinarySearch);
    }

    public static int A0L(long[] jArr, long j, boolean z, boolean z2) {
        long j2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            int index = iBinarySearch + 2;
            iBinarySearch = -index;
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
                j2 = jArr[iBinarySearch];
                if (A01[5].length() != 21) {
                    throw new RuntimeException();
                }
                A01[5] = "2bZNkJfhiCOBrEHFeJGUQ";
            } while (j2 == j);
            if (z) {
                iBinarySearch++;
            }
        }
        return z2 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static long A0M(int i) {
        return ((long) i) & 4294967295L;
    }

    public static long A0N(int i, int i2) {
        return (A0M(i) << 32) | A0M(i2);
    }

    public static long A0O(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long A0P(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long A0Q(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j * ((double) f));
    }

    public static long A0R(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j / ((double) f));
    }

    public static long A0S(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0T(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long A0U(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static long A0V(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static Point A0W(Context context) {
        Display defaultDisplay = null;
        if (A02 >= 17) {
            if (A01[6].charAt(22) == 'P') {
                throw new RuntimeException();
            }
            A01[4] = "4kh9vctkMPY41BkIEjS5m4hVBoqL3PdX";
            DisplayManager displayManager = (DisplayManager) context.getSystemService(A0i(630, 7, 67));
            if (displayManager != null) {
                defaultDisplay = displayManager.getDisplay(0);
            }
        }
        if (defaultDisplay == null) {
            defaultDisplay = ((WindowManager) AbstractC1517es.A01((WindowManager) context.getSystemService(A0i(961, 6, 12)))).getDefaultDisplay();
        }
        return A0X(context, defaultDisplay);
    }

    public static Point A0X(Context context, Display display) {
        String strA0m;
        if (display.getDisplayId() == 0 && A18(context)) {
            if (A02 < 28) {
                strA0m = A0m(A0i(897, 16, 53));
            } else {
                String displaySize = A0i(939, 19, 50);
                strA0m = A0m(displaySize);
            }
            if (!TextUtils.isEmpty(strA0m)) {
                try {
                    String strTrim = strA0m.trim();
                    String displaySize2 = A0i(967, 1, 37);
                    String[] strArrA1O = A1O(strTrim, displaySize2);
                    if (strArrA1O.length == 2) {
                        String displaySize3 = strArrA1O[0];
                        int width = Integer.parseInt(displaySize3);
                        String displaySize4 = strArrA1O[1];
                        int i = Integer.parseInt(displaySize4);
                        if (width > 0 && i > 0) {
                            return new Point(width, i);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb = new StringBuilder();
                String displaySize5 = A0i(225, 22, 49);
                String string = sb.append(displaySize5).append(strA0m).toString();
                String displaySize6 = A0i(313, 4, 51);
                AbstractC1561fb.A05(displaySize6, string);
            }
            String strA0i = A0i(309, 4, 89);
            String displaySize7 = A05;
            if (strA0i.equals(displaySize7)) {
                String str = A06;
                String[] displaySizeParts = A01;
                if (displaySizeParts[4].charAt(26) != 'q') {
                    throw new RuntimeException();
                }
                A01[5] = "otom7sa7uqR8qE6XRdQaB";
                String displaySize8 = A0i(170, 6, 30);
                if (str.startsWith(displaySize8)) {
                    PackageManager packageManager = context.getPackageManager();
                    String displaySize9 = A0i(589, 32, 61);
                    if (packageManager.hasSystemFeature(displaySize9)) {
                        return new Point(3840, 2160);
                    }
                }
            }
        }
        Point point = new Point();
        if (A02 >= 23) {
            A0z(display, point);
        } else if (A02 >= 17) {
            A0y(display, point);
        } else {
            A0x(display, point);
        }
        return point;
    }

    public static Handler A0Y() {
        return A0a(null);
    }

    public static Handler A0Z() {
        return A0b(null);
    }

    public static Handler A0a(Handler.Callback callback) {
        return A0c((Looper) AbstractC1517es.A02(Looper.myLooper()), callback);
    }

    public static Handler A0b(Handler.Callback callback) {
        return A0c(A0d(), callback);
    }

    public static Handler A0c(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper A0d() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static CharSequence A0e(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T A0f(T value) {
        return value;
    }

    public static String A0g(int i) {
        switch (i) {
            case 0:
                return A0i(247, 2, 73);
            case 1:
                return A0i(290, 19, 54);
            case 2:
                if (A01[6].charAt(22) == 'P') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "Uexk1BSGpvU3SeJUFQSnpkz9icvHIDG5";
                strArr[7] = "q8xV9Cs5x1q6KLJEIuSXEP04B2PgJqAC";
                return A0i(Base.kNumLenSymbols, 18, 35);
            case 3:
                return A0i(249, 23, 6);
            case 4:
                return A0i(317, 3, 62);
            default:
                throw new IllegalStateException();
        }
    }

    public static String A0h(int i) {
        return Integer.toString(i, 36);
    }

    public static String A0j(Context context, String str) {
        String strA0i;
        try {
            strA0i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            strA0i = A0i(169, 1, 73);
        }
        StringBuilder sbAppend = new StringBuilder().append(str);
        String versionName = A0i(168, 1, 104);
        StringBuilder sbAppend2 = sbAppend.append(versionName).append(strA0i);
        String versionName2 = A0i(0, 16, 116);
        StringBuilder sbAppend3 = sbAppend2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder sbAppend4 = sbAppend3.append(versionName3);
        String versionName4 = A0i(Input.Keys.NUMPAD_RIGHT_PAREN, 2, 2);
        StringBuilder sbAppend5 = sbAppend4.append(versionName4);
        String versionName5 = A0i(176, 18, 103);
        return sbAppend5.append(versionName5).toString();
    }

    public static String A0k(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return AbstractC1684hb.A01(str);
        }
    }

    public static String A0l(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int percentCharacterCount = str.charAt(i2);
            if (percentCharacterCount == 37) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int length2 = i * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A08.matcher(str);
        int expectedLength = 0;
        while (i > 0 && matcher.find()) {
            int length3 = Integer.parseInt((String) AbstractC1517es.A01(matcher.group(1)), 16);
            char c = (char) length3;
            int length4 = matcher.start();
            sb.append((CharSequence) str, expectedLength, length4).append(c);
            expectedLength = matcher.end();
            i--;
        }
        if (expectedLength < length) {
            sb.append((CharSequence) str, expectedLength, length);
        }
        int length5 = sb.length();
        if (length5 != startOfNotEscaped) {
            return null;
        }
        return sb.toString();
    }

    public static String A0m(String str) {
        try {
            Class<?> cls = Class.forName(A0i(445, 27, 116));
            Method getMethod = cls.getMethod(A0i(696, 3, 48), String.class);
            return (String) getMethod.invoke(cls, str);
        } catch (Exception e) {
            AbstractC1561fb.A08(A0i(313, 4, 51), A0i(Input.Keys.F24, 31, 80) + str, e);
            return null;
        }
    }

    public static String A0n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0o(Locale locale) {
        return A02 >= 21 ? A0p(locale) : locale.toString();
    }

    public static String A0p(Locale locale) {
        return locale.toLanguageTag();
    }

    public static String A0q(byte[] bArr) {
        return new String(bArr, AbstractC1686hd.A06);
    }

    public static String A0r(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, AbstractC1686hd.A06);
    }

    public static String A0s(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(A0i(166, 2, 6));
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ Thread A0t(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService A0u(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.facebook.ads.redexgen.X.gB
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC1600gE.A0t(str, runnable);
            }
        });
    }

    public static void A0w(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0x(Display display, Point point) {
        display.getSize(point);
    }

    public static void A0y(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void A0z(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A10(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A11(Throwable th) throws Throwable {
        A12(th);
        throw null;
    }

    public static <T extends Throwable> void A12(Throwable th) throws Throwable {
        throw th;
    }

    public static void A13(long[] jArr, long j, long j2) {
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            for (int i = 0; i < jArr.length; i++) {
                long divisionFactor = jArr[i];
                jArr[i] = divisionFactor / j3;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            for (int i2 = 0; i2 < jArr.length; i2++) {
                long multiplicationFactor = jArr[i2];
                jArr[i2] = multiplicationFactor * j4;
            }
            return;
        }
        double d = j / j2;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            double multiplicationFactor2 = (long) (jArr[i3] * d);
            jArr[i3] = multiplicationFactor2;
        }
    }

    public static boolean A14(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean A15(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean A16(int i) {
        return i == 10 || i == 13;
    }

    public static boolean A17(Context context) {
        return A02 >= 23 && context.getPackageManager().hasSystemFeature(A0i(413, 32, 20));
    }

    public static boolean A18(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService(A0i(933, 6, 71));
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean A19(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, A0i(879, 13, 35), A0i(913, 12, 87), new String[]{str}) > 0;
    }

    public static boolean A1A(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0i(646, 4, 72);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1B(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        Looper looper2 = handler.getLooper();
        Looper looper3 = Looper.myLooper();
        if (looper2 == looper3) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean A1C(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1D(C1576fq c1576fq, C1576fq c1576fq2, Inflater inflater) {
        if (c1576fq.A07() <= 0) {
            return false;
        }
        if (c1576fq2.A08() < c1576fq.A07()) {
            c1576fq2.A0c(c1576fq.A07() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c1576fq.A0l(), c1576fq.A09(), c1576fq.A07());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(c1576fq2.A0l(), iInflate, c1576fq2.A08() - iInflate);
                if (inflater.finished()) {
                    c1576fq2.A0e(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == c1576fq2.A08()) {
                        c1576fq2.A0c(c1576fq2.A08() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static boolean A1E(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] A1F(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                String[] strArr = A01;
                if (strArr[0].charAt(14) != strArr[7].charAt(14)) {
                    break;
                }
                String[] strArr2 = A01;
                strArr2[1] = "meKJ4UU98";
                strArr2[3] = "f43WZcDU7";
                return byteArray;
            }
            if (A01[6].charAt(22) == 'P') {
                break;
            }
            A01[4] = "oXCDl3Mukfvub6PB7hyolQvecMqJvNUZ";
            byteArrayOutputStream.write(bArr, 0, i);
        }
        throw new RuntimeException();
    }

    public static byte[] A1G(String str) {
        return str.getBytes(AbstractC1686hd.A06);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] A1H(T[] value) {
        return value;
    }

    public static <T> T[] A1I(T[] tArr, int i) {
        AbstractC1517es.A07(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] A1J(T[] tArr, int i, int i2) {
        boolean z = true;
        AbstractC1517es.A07(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        AbstractC1517es.A07(z);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    public static <T> T[] A1K(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String[] A1L() {
        String[] strArrA1M = A1M();
        for (int i = 0; i < strArrA1M.length; i++) {
            strArrA1M[i] = A0k(strArrA1M[i]);
        }
        return strArrA1M;
    }

    public static String[] A1M() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (A02 >= 24) {
            return A1N(configuration);
        }
        return new String[]{A0o(configuration.locale)};
    }

    public static String[] A1N(Configuration configuration) {
        return A1O(configuration.getLocales().toLanguageTags(), A0i(165, 1, 93));
    }

    public static String[] A1O(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A1P(String str, String str2) {
        return str.split(str2, 2);
    }
}
