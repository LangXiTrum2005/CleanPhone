package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.VideoView;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ki {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2996 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2997 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2998 = 120;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Field f2999 = null;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f3001 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f3002 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field f3003;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object f3004;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field f3005;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class f3006;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Field f3007;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f3000 = {217, 230, 220, 234, 231, 225, 166, 238, 221, 239, 207, 197, 223, 193, 229, 232, 228, 236, 188, 222, 237, 191, 218, 199, 204, 219, 224, 196, 235, 152, 200, 241, 187, 203, 227, 190};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f2995 = 6;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f2994 = {'g', 'e', 't', 'I', 'n', 's', 'a', 'c', 'A', 'd', 'r', 'o', 'i', 'U', 'l', 'E', ' ', 'W', 'w', 'M', 'v', ':', 'm', 'O', 'C', 'k', 'L', 'P', 'y', 'p', 'V', 'h', 'j', 'q', 'u', 'x'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnClickListener m2837(View view) {
        try {
            Object objM2838 = m2838(view);
            if (objM2838 == null) {
                return null;
            }
            Class<?> cls = objM2838.getClass();
            synchronized (ke.class) {
                try {
                    if (f3003 == null) {
                        f3003 = m2843((Class) cls, m2842(KeyEvent.keyCodeFromString("") + 16, "\u0017\u0012\u0000\u001c\u000f\r\r\u001f\u0018\u000e\u0000\u0003\u0002\u0005\u0004\u0007", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 106)).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnClickListener) f3003.get(objM2838);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<View> m2839() {
        f2996 = (f2997 + 19) % 128;
        try {
            if (f3006 == null || f3004 == null) {
                Class<?> cls = Class.forName(m2848(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0091\u0081\u0097\u0085\u0091\u0096\u0084\u0089\u008d\u0081\u0082\u0081\u008c\u008a\u0085\u0083\u0082\u0086\u008b\u0087\u008a\u0089\u0086\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                f3006 = cls;
                f3004 = cls.getMethod(m2842(TextUtils.lastIndexOf("", '0') + 12, "\u0001\u0002\u0003\u0004\u0005\u0000\u0000\b\u0001\ny", (byte) (TextUtils.indexOf("", "", 0) + 20)).intern(), null).invoke(null, null);
            }
            return m2844(f3006, f3004);
        } catch (Throwable th2) {
            String strIntern = m2842(TextUtils.lastIndexOf("", '0', 0) + 13, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) (TextUtils.getOffsetAfter("", 0) + 93)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2842(35 - TextUtils.getTrimmedLength(""), "\u0010\t\u000b\u0006\u0010\u0016\u0001\u0002\u008f\u008f\u0010\u0000\u0004\f\f\r\u0003\n\u0006\u0017\u0012\u0007\u0000\n\u0001\u0002\u0010\u0016\u0012\u000e\u0000\u0013\u0003\u0017;", (byte) (AndroidCharacter.getMirror('0') - 21)).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2964(strIntern, sb2.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2845(MediaPlayer mediaPlayer, hn.a aVar) {
        Field fieldM2843;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i10 = f2997 + 15;
        f2996 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, TextUtils.getOffsetAfter("", 0) * 49, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0082\u0098\u008f").intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2843.get(mediaPlayer);
                if (onCompletionListener instanceof hn) {
                    return;
                }
            } else {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0082\u0098\u008f").intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2843.get(mediaPlayer);
                if (onCompletionListener instanceof hn) {
                    return;
                }
            }
            fieldM2843.set(mediaPlayer, new hn(onCompletionListener, aVar));
            f2997 = (f2996 + 65) % 128;
        } catch (Exception e10) {
            kl.m2899(m2842(TextUtils.indexOf("", "", 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 94)).intern(), m2848(null, 126 - MotionEvent.axisFromString(""), null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0081\u0086\u0083\u0089\u008c\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static MediaPlayer m2847(VideoView videoView) {
        try {
            Field fieldM2843 = m2843(VideoView.class, m2842(12 - KeyEvent.normalizeMetaState(0), "\u0017\u0014\u0003\u0007\u0012\f\u001a\u000f\n\u0018\u0004\u0007", (byte) (92 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern());
            if (fieldM2843 != null) {
                int i10 = f2996 + 81;
                f2997 = i10 % 128;
                if (i10 % 2 != 0) {
                    return (MediaPlayer) fieldM2843.get(videoView);
                }
                throw null;
            }
        } catch (Exception e10) {
            kl.m2899(m2842(TextUtils.getOffsetAfter("", 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) (AndroidCharacter.getMirror('0') + '-')).intern(), m2848(null, 127 - View.MeasureSpec.getSize(0), null, "\u0084\u0089 \u0081\u0091\u009f\u0081\u0086\u0083\u0089\u008c\u0092\u0089\u008d\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e10, false);
        }
        f2996 = (f2997 + 85) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnTouchListener m2850(View view) {
        try {
            Object objM2838 = m2838(view);
            if (objM2838 == null) {
                return null;
            }
            Class<?> cls = objM2838.getClass();
            synchronized (ke.class) {
                try {
                    if (f2999 == null) {
                        f2999 = m2843((Class) cls, m2848(null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u009b\u009a\u0095\u0085\u0099\u0082\u0098\u008f").intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnTouchListener) f2999.get(objM2838);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2849(MediaPlayer mediaPlayer, hm.e eVar) {
        try {
            Field fieldM2843 = m2843(MediaPlayer.class, m2848(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0085\u0094\u0082\u008e\u0082\u0098\u008f").intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldM2843.get(mediaPlayer);
            if (!(onInfoListener instanceof hm)) {
                fieldM2843.set(mediaPlayer, new hm(onInfoListener, eVar));
                f2997 = (f2996 + 121) % 128;
            }
            f2996 = (f2997 + 63) % 128;
        } catch (Exception e10) {
            kl.m2899(m2842((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 93)).intern(), m2848(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0085\u0094\u0082\u008e\u0081\u0086\u0083\u0089\u008c\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2840(View view, hp.b bVar) {
        f2996 = (f2997 + 117) % 128;
        View.OnClickListener onClickListenerM2837 = m2837(view);
        if (onClickListenerM2837 instanceof hp) {
            return;
        }
        view.setOnClickListener(new hp(onClickListenerM2837, bVar));
        f2996 = (f2997 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2851(MediaPlayer mediaPlayer, ho.c cVar) {
        Field fieldM2843;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i10 = f2997 + 1;
        f2996 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, Color.red(1) * 86, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0083\u0089\u0084\u0081\u0090\u0089\u0084\u009f\u0082\u0098\u008f").intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2843.get(mediaPlayer);
                if (onPreparedListener instanceof ho) {
                    return;
                }
            } else {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, 127 - Color.red(0), null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0083\u0089\u0084\u0081\u0090\u0089\u0084\u009f\u0082\u0098\u008f").intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2843.get(mediaPlayer);
                if (onPreparedListener instanceof ho) {
                    return;
                }
            }
            fieldM2843.set(mediaPlayer, new ho(onPreparedListener, cVar));
            f2996 = (f2997 + 85) % 128;
        } catch (Exception e10) {
            kl.m2899(m2842(12 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) (KeyEvent.normalizeMetaState(0) + 93)).intern(), m2842(38 - TextUtils.indexOf((CharSequence) "", '0'), "\u0004\u0007\u000b\u0006\u0010\u0016\u0010\u0000\u0016\u0010\u0005\u0019\f\b\r\u0007\u0016\u0005\u0019\u0007\u0006\u000f\t\u0018\u0007\u0004\u0018\u000b\u0007\u0004\b\u001b\u0011\u0000\u0003\u0002\u0005\u0002È", (byte) (86 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2846(MediaPlayer mediaPlayer, hq.d dVar) {
        Field fieldM2843;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i10 = f2996 + 115;
        f2997 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, ViewConfiguration.getDoubleTapTimeout() >> 51, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u008f").intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2843.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof hq)) {
                    fieldM2843.set(mediaPlayer, new hq(onSeekCompleteListener, dVar));
                }
            } else {
                fieldM2843 = m2843(MediaPlayer.class, m2848(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u008f").intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2843.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof hq)) {
                    fieldM2843.set(mediaPlayer, new hq(onSeekCompleteListener, dVar));
                }
            }
            int i11 = f2996 + 81;
            f2997 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            kl.m2899(m2842(View.MeasureSpec.makeMeasureSpec(0, 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) (92 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), m2848(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m2838(View view) {
        try {
            synchronized (ke.class) {
                try {
                    if (f3005 == null) {
                        f3005 = m2843(View.class, m2848(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0085\u0094\u0082\u008e\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u008f").intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f3005.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2848(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f3000;
                int i11 = f2998;
                if (f3001) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f3002) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r0
  0x0021: PHI (r0v4 android.view.View$OnTouchListener) = (r0v3 android.view.View$OnTouchListener), (r0v5 android.view.View$OnTouchListener) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2841(View view, ht.e eVar) {
        View.OnTouchListener onTouchListenerM2850;
        int i10 = f2996 + 3;
        f2997 = i10 % 128;
        if (i10 % 2 == 0) {
            onTouchListenerM2850 = m2850(view);
            int i11 = 80 / 0;
            if (!(onTouchListenerM2850 instanceof ht)) {
                view.setOnTouchListener(new ht(onTouchListenerM2850, eVar));
            }
        } else {
            onTouchListenerM2850 = m2850(view);
            if (!(onTouchListenerM2850 instanceof ht)) {
                view.setOnTouchListener(new ht(onTouchListenerM2850, eVar));
            }
        }
        int i12 = f2997 + 25;
        f2996 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<View> m2844(Class cls, Object obj) throws Exception {
        if (f3007 == null) {
            Field declaredField = cls.getDeclaredField(m2842(7 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0012\"\r\u0000\u0017\u0000", (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 38)).intern());
            f3007 = declaredField;
            declaredField.setAccessible(true);
            f2997 = (f2996 + 71) % 128;
        }
        Object obj2 = f3007.get(obj);
        if (obj2 instanceof List) {
            f2996 = (f2997 + 81) % 128;
            return (List) f3007.get(obj);
        }
        if (obj2 instanceof View[]) {
            return Arrays.asList((View[]) f3007.get(obj));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field m2843(Class cls, String str) {
        int i10 = f2996 + 121;
        f2997 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            }
            Field declaredField2 = cls.getDeclaredField(str);
            declaredField2.setAccessible(true);
            return declaredField2;
        } catch (Exception e10) {
            kl.m2899(m2842(11 - MotionEvent.axisFromString(""), "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 93)).intern(), m2848(null, Gravity.getAbsoluteGravity(0, 0) + 127, null, "\u0083\u0091\u0089\u0086¤\u0083\u0089\u0084\u0081\u0091\u009a\u0089\u0093\u0092\u0089\u008d\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e10, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2842(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2994;
                char c4 = f2995;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
