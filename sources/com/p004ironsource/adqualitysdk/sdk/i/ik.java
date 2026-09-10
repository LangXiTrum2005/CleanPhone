package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ik {

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    private static int f2414 = 0;

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    private static char[] f2415 = null;

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    private static char[] f2416 = null;

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    private static char f2417 = 0;

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    private static int f2418 = 1;

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static String f2419;

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static String f2420;

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static String f2421;

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static String f2422;

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static String f2423;

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static String f2424;

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static String f2425;

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static String f2426;

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static String f2427;

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static String f2428;

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static String f2429;

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static String f2430;

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static String f2431;

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static String f2432;

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static String f2433;

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static String f2434;

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static String f2435;

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static String f2436;

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static String f2437;

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static String f2438;

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static String f2439;

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static String f2440;

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static String f2441;

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static String f2442;

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static String f2443;

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static String f2444;

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static String f2445;

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static String f2446;

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static String f2447;

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static String f2448;

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static String f2449;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static String f2450;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static String f2451;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static String f2452;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static String f2453;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static String f2454;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static String f2455;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static String f2456;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static String f2457;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static String f2458;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static String f2459;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static String f2460;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static String f2461;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static String f2462;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static String f2463;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String f2464;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String f2465;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String f2466;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String f2467;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String f2468;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String f2469;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String f2470;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String f2471;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String f2472;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String f2473;

    static {
        m2441();
        f2471 = m2440(false, new int[]{0, 11, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern();
        f2472 = m2439((byte) (View.getDefaultSize(0, 0) + 81), "\u0001\u0002\u0003\u0004", TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern();
        f2473 = m2440(true, new int[]{11, 4, PsExtractor.AUDIO_STREAM, 0}, "\u0000\u0001\u0001\u0000").intern();
        f2470 = m2439((byte) (View.MeasureSpec.getMode(0) + 33), "\u0005\u0000\u0007\b\t\n", 5 - TextUtils.lastIndexOf("", '0', 0)).intern();
        f2469 = m2439((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 105), "\u0005\u0000\u0010\n\u0006\u0011", 6 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        f2465 = m2439((byte) (ExpandableListView.getPackedPositionType(0L) + 94), "\u0005\b", Color.rgb(0, 0, 0) + 16777218).intern();
        f2464 = m2439((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27), "\u000e\u000f\u0010\u0011\f\u0017", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6).intern();
        f2467 = m2439((byte) (4 - View.getDefaultSize(0, 0)), "\u000f\u000b\u0000\u0001\u000f\u000b\u0014\u0001", TextUtils.getOffsetAfter("", 0) + 8).intern();
        f2468 = m2439((byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0013\u0019\u0014\u0015\u0005\u0010\u0003\u0016s", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9).intern();
        f2466 = m2440(false, new int[]{15, 7, 118, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000").intern();
        f2462 = m2439((byte) (48 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u001b\u000f\u0000\u000e\u0011\u0003", Color.green(0) + 6).intern();
        f2463 = m2439((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51), "\r\u0003\u0017\n\u0017\u000e\u0015\u001b\u000e\b", 10 - TextUtils.indexOf("", "", 0, 0)).intern();
        f2460 = m2440(true, new int[]{22, 5, 0, 0}, "\u0000\u0001\u0001\u0000\u0001").intern();
        f2461 = m2440(false, new int[]{27, 5, 0, 0}, "\u0001\u0001\u0000\u0001\u0001").intern();
        f2459 = m2440(true, new int[]{32, 5, 66, 0}, "\u0001\u0000\u0001\u0000\u0001").intern();
        f2455 = m2439((byte) ((-16777145) - Color.rgb(0, 0, 0)), "\u0003\u000b\b\u0005\u001d\u0017³", Color.rgb(0, 0, 0) + 16777223).intern();
        f2458 = m2440(false, new int[]{37, 8, 0, 4}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001").intern();
        f2456 = m2439((byte) (Color.alpha(0) + 9), "\u0014\u0013\u0001\u0012\u001d\u0012\f\u0017", View.MeasureSpec.makeMeasureSpec(0, 0) + 8).intern();
        f2457 = m2440(true, new int[]{45, 6, 0, 2}, "\u0000\u0001\u0000\u0001\u0001\u0000").intern();
        f2454 = m2439((byte) (ExpandableListView.getPackedPositionGroup(0L) + 24), "\u0014\u0001\f\b\b\t}", 6 - TextUtils.indexOf((CharSequence) "", '0')).intern();
        f2451 = m2439((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53), "\u0007\u0015\u0007\b\t\n", 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
        f2453 = m2439((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 77), "\u0014\u0001\u0011\u0014\f\u0017À", 7 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2452 = m2440(false, new int[]{51, 7, 156, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001").intern();
        f2449 = m2439((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24), "\f\u0002\u0004\u0011\f\u0017\u008c", 7 - View.resolveSize(0, 0)).intern();
        f2450 = m2440(false, new int[]{58, 7, 0, 6}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern();
        f2447 = m2440(true, new int[]{65, 7, 94, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000").intern();
        f2445 = m2439((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 88), "\u0007\u0015\u0011\f\u0017\u0006", 6 - (Process.myPid() >> 22)).intern();
        f2446 = m2439((byte) ((Process.myTid() >> 22) + 41), "\u0001\u0000\u0014\u0001\u009f", 5 - Color.blue(0)).intern();
        f2448 = m2440(true, new int[]{72, 5, 0, 0}, "\u0000\u0000\u0001\u0001\u0001").intern();
        f2444 = m2440(false, new int[]{77, 5, 0, 0}, "\u0001\u0001\u0001\u0001\u0000").intern();
        f2440 = m2439((byte) (39 - TextUtils.lastIndexOf("", '0', 0, 0)), "\u0001\u0000\u000f\u000b\u0099", 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
        f2441 = m2440(false, new int[]{82, 4, 187, 0}, "\u0000\u0001\u0001\u0001").intern();
        f2443 = m2439((byte) (124 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0001\u0000\u0005\u0000ñ", 5 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2442 = m2439((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15), "\u0001\u0000\u0006\t", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3).intern();
        f2439 = m2440(true, new int[]{86, 8, 149, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001").intern();
        f2437 = m2439((byte) (98 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0001\u0000\u0014\u0007\u0002\u0000\u0006\t", 8 - KeyEvent.normalizeMetaState(0)).intern();
        f2438 = m2439((byte) (KeyEvent.keyCodeFromString("") + 53), "\u0012\u0003\b\u001b\u0003\u001d\r\u0017¨", Color.alpha(0) + 9).intern();
        f2434 = m2440(false, new int[]{94, 13, 12, 11}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern();
        f2436 = m2440(false, new int[]{107, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001").intern();
        f2435 = m2440(true, new int[]{117, 11, 0, 10}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000").intern();
        f2431 = m2439((byte) (23 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\b\u001c\u0014\u0001\u001d\u0010\n\u0003\u0003\b{", 11 - TextUtils.indexOf("", "")).intern();
        f2430 = m2439((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 25), "\b\u001c\u0014\u0001\u001a\u0003\u0005\u0010\u0003\b|", Color.green(0) + 11).intern();
        f2433 = m2440(false, new int[]{128, 11, 24, 9}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern();
        f2432 = m2440(true, new int[]{139, 13, PsExtractor.AUDIO_STREAM, 5}, null).intern();
        f2429 = m2439((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 114), "\b\u001c\u0014\u0001\u001c\u0003\u000f\b\u0003\u001d\u0003\u0005\u0003\b", Gravity.getAbsoluteGravity(0, 0) + 14).intern();
        f2428 = m2440(true, new int[]{152, 8, 98, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001").intern();
        f2425 = m2439((byte) (19 - ImageFormat.getBitsPerPixel(0)), "\u0011\u001b!\u0006\u0014\u0001\u0016\u0011\u0001\u0000", TextUtils.getOffsetBefore("", 0) + 10).intern();
        f2426 = m2440(false, new int[]{160, 2, 144, 2}, "\u0000\u0000").intern();
        f2424 = m2439((byte) (TextUtils.lastIndexOf("", '0') + 120), "\u0006\u0005í", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2).intern();
        f2427 = m2439((byte) (25 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0005\u0003\u0090", 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        f2420 = m2440(false, new int[]{162, 14, 93, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern();
        f2421 = m2439((byte) (96 - KeyEvent.getDeadChar(0, 0)), "\u001b\u000f\u0000\u0001\"\u0001\u0003\u0005", '8' - AndroidCharacter.getMirror('0')).intern();
        f2419 = m2440(false, new int[]{176, 3, 190, 0}, "\u0000\u0001\u0001").intern();
        f2422 = m2439((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), "\u0006\u0014Æ", 3 - (Process.myTid() >> 22)).intern();
        f2423 = m2440(false, new int[]{179, 4, 0, 0}, "\u0001\u0000\u0001\u0001").intern();
        f2418 = (f2414 + 51) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2439(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2416;
                char c2 = f2417;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2441() {
        f2415 = new char[]{'4', 'l', 'n', 'k', 'k', 'q', 'l', 'f', 'l', 'i', 'j', 151, 298, 297, 302, 'q', 223, 226, 233, 224, 218, 220, '2', 'f', 'o', 'm', 'b', '0', 'b', 'm', 'o', 'n', 'Z', 176, 177, 175, 164, '6', '`', 'c', 'o', 'i', 'g', 'k', 'g', '6', 'g', 'c', 'j', 'r', 'o', 135, 270, 262, 248, 255, 267, 267, '1', 'i', 'r', 's', 'o', 'o', 'n', 'h', 205, 205, 209, 204, 200, 201, '7', 'o', 'i', 'c', 'f', '4', 'f', 'e', 'l', 'q', 146, 289, 285, 285, 130, 262, 256, 258, 266, 256, 248, 251, '8', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.END_OBJ, 'o', 'g', 'p', 'p', 's', AbstractJsonLexerKt.BEGIN_OBJ, 'y', 'p', '`', 'i', '$', 'D', 'R', 'k', 'b', 'X', 'k', 't', 'l', 'd', '2', 'i', 'q', 't', 'l', AbstractJsonLexerKt.BEGIN_LIST, 'c', 'k', 'R', 'D', 'V', dc.T, 131, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.BEGIN_OBJ, 137, 135, 136, 130, '|', 'n', '\\', 260, 308, 291, 257, 264, 292, 293, 313, 303, 306, 308, 307, 293, 'j', 214, 212, 204, 204, 189, 191, 205, 129, 260, '`', 198, 187, 187, 206, 192, 185, 198, 198, 177, 186, 202, 198, 206, 152, 297, 299, '4', 'f', 'k', 'p'};
        f2417 = (char) 6;
        f2416 = new char[]{'i', 'n', 't', 'g', 'a', 'd', 'T', 'y', 'p', 'e', 'H', 's', 'h', 'w', 'v', 'o', AbstractJsonLexerKt.UNICODE_ESC, 'r', 'l', 'c', 'P', 'm', 'J', 'U', 'k', 'q', 'A', 'S', 'C', 'b', 'j', 'D', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|'};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2440(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f2415, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
