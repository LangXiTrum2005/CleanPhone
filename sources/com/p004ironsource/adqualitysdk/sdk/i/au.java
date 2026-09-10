package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class au {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f391 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f392 = null;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f393 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f394 = 91;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f395 = -2712609236675154410L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f396 = -1881330655;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f397 = 419090097;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f398 = {51, 61, -59, 59, -61, 39, 20, -21, 21, -18, 49, -59, 20, -23, 19, 45, -15, -49, 51, -63, 59, 55, -64, 63, -59, 114, -13, 49, -59, 52, -55, 51, 13, -9, -56, 58, -124, -118, 114, -116, 116, -112, -93, 92, -94, 89, -122, 114, -93, 94, -92, -102, 70, 120, -124, 118, -116, -128, 119, -120, 114, -59, 58, -114, -126, -78, 68, -122, 114, -125, 126, -124, -70, 64, AbstractJsonLexerKt.TC_INVALID, -115, 89, 85, 87, -120, 105, -125, -65, -76, 67, -26, -63, -53, 54, 52, -53, -53, 38, 55, 3, -10, -77, 68, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f399;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f400;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f401;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f403 = Arrays.asList(m538("\uf49f\uf4fc衊☳洧ㅦﭹ\uf115䲦䀳▆㦑葀㢜\ufdde膥\udde0\uf148됰졅ᖖꤠಝჵ", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m538("\uea35\uea54憪쿒朝㭕߹\u0dc9刂꧕⾵앍髲텱\uf7eb絠썔ᢸ빏", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), "");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f402 = new ArrayList();

    public au() {
        List<String> listAsList = Arrays.asList(m536((byte) (TextUtils.indexOf((CharSequence) "", '0') + 55), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777270) - Color.rgb(0, 0, 0), Gravity.getAbsoluteGravity(0, 0) - 419090097, 1881330754 - TextUtils.getOffsetAfter("", 0)).intern(), m536((byte) ((-127) - (ViewConfiguration.getJumpTapTimeout() >> 16)), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 51, Color.alpha(0) - 419090061, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1881330754).intern(), m538("䶈䷡鄖㽯█禊䢜䊮\uf5a2奤浽詧㵟⇌땸㈇擮\ue805ﳛ箤겛끭䑯ꍊ푙磀谂\ueb48ῑ㼧ퟂᒫ䞒蝢Ὢ屟輼俐朇藲㛑ᘢ꺺춯纎\ude80\uf662畗", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m538("䵁䴨퀌繵᱉䁋莏覽\uf56b\u187e咼䅴㶖惖貹樂搧ꤟ씚낷걒\uf177綮桙풐㧚뗃⁛ἤ縺\uee59\udf94䝇왿⚺靗迲໗廎仹㘰场靣ڔ繒龇쾾빋ꛠ\ue7df߆", MotionEvent.axisFromString("") + 1).intern());
        this.f401 = listAsList;
        m538("逳遄뛎\u18ae嶂Ǟ职", View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        m536((byte) ((-88) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (short) View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) - 87, Drawable.resolveOpacity(0, 0) - 419090021, View.MeasureSpec.getMode(0) + 1881330774).intern();
        m538("梯棆龩㇜浊ㄖ㊗", TextUtils.indexOf("", "")).intern();
        m536((byte) (121 - KeyEvent.getDeadChar(0, 0)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-87) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-419090018) - Color.argb(0, 0, 0, 0), 1881330760 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        m538("꭪ꬌ骋㓩\uee3d뉩፴", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern();
        m538("㔚㕿㜾饜\ude0b艟쫉", ViewConfiguration.getFadingEdgeLength() >> 16).intern();
        m536((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 69), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) - 87, (Process.myPid() >> 22) - 419090015, TextUtils.indexOf((CharSequence) "", '0') + 1881330761).intern();
        this.f399 = new JSONObject();
        this.f400 = new JSONObject();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f400.put(it.next(), m536((byte) (View.MeasureSpec.getSize(0) + 28), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-90) - TextUtils.lastIndexOf("", '0', 0), (-419090012) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1881330769 - Color.green(0)).intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m537(au auVar, String str) {
        f391 = (f393 + 41) % 128;
        auVar.m539(str);
        f393 = (f391 + 35) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m539(String str) {
        int i2 = f393 + 105;
        f391 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f399 = new JSONObject(str);
                    return;
                } catch (JSONException unused) {
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.f399 = new JSONObject(str);
            return;
        }
        f393 = (f391 + 73) % 128;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m540() {
        f391 = (f393 + 43) % 128;
        String strOptString = this.f399.optString(m538("胾肚㽋鄩冤෬뷥럓", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m538("ꃳꂒ鬼㕞㴔慔\ue667", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
        int i2 = f391 + 115;
        f393 = i2 % 128;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m541() {
        f393 = (f391 + 83) % 128;
        int iOptInt = this.f399.optInt(m536((byte) (64 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) TextUtils.getOffsetBefore("", 0), (-87) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-419090001) - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1881330754 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), 3000);
        f393 = (f391 + 69) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final JSONObject m542() {
        JSONObject jSONObjectOptJSONObject = this.f399.optJSONObject(m538("\uf56b\uf50f뾲ᇐ祧┭␒⸳", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        int i2 = f391;
        int i3 = i2 + 105;
        f393 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        JSONObject jSONObject = this.f400;
        f393 = (i2 + 5) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<String> m543() {
        List<String> listM2762 = kc.m2762(this.f399, m538("㔚㕿㜾饜\ude0b艟쫉", KeyEvent.keyCodeFromString("")).intern(), new ArrayList());
        int i2 = f393 + 37;
        f391 = i2 % 128;
        if (i2 % 2 == 0) {
            return listM2762;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m545(ix ixVar) {
        m539(ixVar.m2488(m536((byte) (Gravity.getAbsoluteGravity(0, 0) - 55), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-82) - (KeyEvent.getMaxKeyCode() >> 16), (-419090011) - (Process.myPid() >> 22), 1881330771 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m536((byte) (1 - Color.blue(0)), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-88) - TextUtils.getCapsMode("", 0, 0), Color.red(0) - 419090003, 1881330709 - TextUtils.lastIndexOf("", '0', 0)).intern(), new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.au.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo550(String str) {
                au.m537(au.this, str);
            }
        }));
        int i2 = f393 + 111;
        f391 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m547() {
        f393 = (f391 + 113) % 128;
        List<String> listM2762 = kc.m2762(this.f399, m538("梯棆龩㇜浊ㄖ㊗", ViewConfiguration.getTouchSlop() >> 8).intern(), this.f402);
        int i2 = f393 + 91;
        f391 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return listM2762;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m549() {
        f391 = (f393 + 85) % 128;
        int iOptInt = this.f399.optInt(m536((byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 88), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') - 86, (-419090022) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1881330774).intern(), 7);
        f391 = (f393 + 35) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m546() {
        List<String> listM2762 = kc.m2762(this.f399, m538("꭪ꬌ骋㓩\uee3d뉩፴", Color.red(0)).intern(), new ArrayList());
        f393 = (f391 + 25) % 128;
        return listM2762;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m536(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f394;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f398;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f397 + i3] + i5);
                    } else {
                        i6 = (short) (f392[f397 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f397 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f396);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f398;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f392;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m544() {
        f393 = (f391 + 37) % 128;
        int iOptInt = this.f399.optInt(m536((byte) (121 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 88, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 419090017, ImageFormat.getBitsPerPixel(0) + 1881330761).intern(), 2);
        f393 = (f391 + 125) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m548() {
        JSONObject jSONObject;
        int maxKeyCode;
        int i2 = f391 + 79;
        f393 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObject = this.f399;
            maxKeyCode = KeyEvent.getMaxKeyCode() / 99;
        } else {
            jSONObject = this.f399;
            maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        }
        List<String> listM2762 = kc.m2762(jSONObject, m538("逳遄뛎\u18ae嶂Ǟ职", maxKeyCode).intern(), this.f403);
        int i3 = f393 + 15;
        f391 = i3 % 128;
        if (i3 % 2 == 0) {
            return listM2762;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m538(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f395, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f395));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
