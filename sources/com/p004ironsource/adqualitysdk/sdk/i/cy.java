package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cy extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1472 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1473 = 6;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1474 = {'E', 'r', 'o', ' ', 'c', 'e', 'a', 't', 'i', 'n', 'g', 'M', 'd', 'P', 'l', 'y', 'O', 'I', 'f', 'L', 's', 'S', 'k', 'C', 'm', 'p', AbstractJsonLexerKt.UNICODE_ESC, 'h', 'A', 'F', 'G', 'H', 'J', 'K', 'N', 'Q'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1475 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1476 = -4213525505828552577L;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static WebChromeClient m1737(List<Object> list) {
        int i2 = f1475 + 121;
        f1472 = i2 % 128;
        WebChromeClient webChromeClientM2807 = kh.m2807((WebView) cz.m1785(list, i2 % 2 == 0 ? 1 : 0, WebView.class));
        int i3 = f1472 + 77;
        f1475 = i3 % 128;
        if (i3 % 2 == 0) {
            return webChromeClientM2807;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static WebViewClient m1738(List<Object> list) {
        f1472 = (f1475 + 119) % 128;
        WebViewClient webViewClientM2812 = kh.m2812((WebView) cz.m1785(list, 0, WebView.class));
        f1475 = (f1472 + 55) % 128;
        return webViewClientM2812;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static Object m1739(List<Object> list) {
        f1475 = (f1472 + 55) % 128;
        ((jq) cz.m1785(list, 0, jq.class)).m2647();
        int i2 = f1472 + 47;
        f1475 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static jq m1740(List<Object> list) {
        WebView webView;
        String strM1747;
        int i2 = f1472 + 17;
        f1475 = i2 % 128;
        if (i2 % 2 != 0) {
            webView = (WebView) cz.m1785(list, 0, WebView.class);
            strM1747 = m1747("Ղ䍠ꟳဣԣ썻Ꝯ鄲Ӝ셰ꔳ鍵ڕ", 1 % (Process.myTid() / 95));
        } else {
            webView = (WebView) cz.m1785(list, 0, WebView.class);
            strM1747 = m1747("Ղ䍠ꟳဣԣ썻Ꝯ鄲Ӝ셰ꔳ鍵ڕ", (Process.myTid() >> 22) + 1);
        }
        return jq.m2639(webView, strM1747.intern());
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static boolean m1741(List<Object> list) {
        int i2 = f1472 + 125;
        f1475 = i2 % 128;
        boolean zM2737 = ka.m2737(cz.m1785(list, i2 % 2 != 0 ? 1 : 0, Object.class));
        f1472 = (f1475 + 27) % 128;
        return zM2737;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static Object m1742(List<Object> list) {
        hg hgVar;
        int i2 = f1472 + 33;
        f1475 = i2 % 128;
        if (i2 % 2 != 0) {
            hgVar = (hg) cz.m1785(list, 1, hg.class);
            if (hgVar == null) {
                return null;
            }
        } else {
            hgVar = (hg) cz.m1785(list, 0, hg.class);
            if (hgVar == null) {
                return null;
            }
        }
        Object objMo713 = hgVar.mo713();
        f1472 = (f1475 + 71) % 128;
        return objMo713;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static Object m1743(List<Object> list) {
        int i2 = f1472 + 125;
        f1475 = i2 % 128;
        ((jq) cz.m1785(list, i2 % 2 != 0 ? 1 : 0, jq.class)).m2643();
        f1472 = (f1475 + 101) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static View.OnTouchListener m1744(List<Object> list) {
        int i2 = f1475 + 41;
        f1472 = i2 % 128;
        int i3 = i2 % 2;
        View.OnTouchListener onTouchListenerM2691 = jx.m2691((View) cz.m1785(list, 0, View.class));
        int i4 = f1472 + 69;
        f1475 = i4 % 128;
        if (i4 % 2 == 0) {
            return onTouchListenerM2691;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1745(List<Object> list) {
        f1475 = (f1472 + 105) % 128;
        jc.m2538().m2548((il) cz.m1785(list, 0, il.class));
        int i2 = f1472 + 97;
        f1475 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m1746(List list, Object[] objArr) {
        f1475 = (f1472 + 25) % 128;
        List<Object> listM1751 = m1751((List<Object>) list, objArr);
        int i2 = f1472 + 119;
        f1475 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return listM1751;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1748(List<Object> list) {
        f1475 = (f1472 + 71) % 128;
        jc.m2538().m2546((il) cz.m1785(list, 0, il.class));
        int i2 = f1475 + 47;
        f1472 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnClickListener m1749(List<Object> list) {
        int i2 = f1475 + 125;
        f1472 = i2 % 128;
        return jx.m2685((View) cz.m1785(list, i2 % 2 == 0 ? 1 : 0, View.class));
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1753(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                hj.a aVar = new hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.hj.a
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final void mo1778(hj hjVar, MediaPlayer mediaPlayer) {
                        dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, hjVar, mediaPlayer}));
                    }
                };
                int i2 = f1472 + 77;
                f1475 = i2 % 128;
                if (i2 % 2 == 0) {
                    return aVar;
                }
                throw null;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1750((byte) (KeyEvent.keyCodeFromString("") + 125), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u0017\u0003\u0004\u0017\u0014\u0005\u0019\u001a\u0011\u0002\u000b\u0001\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", (ViewConfiguration.getTapTimeout() >> 16) + 48).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1755(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            final boolean zM1752 = m1752(list, 2);
            cpVar2 = cpVar;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.5

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f1546 = 185;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f1547 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f1548;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m1781(int i2, int i3, int i4, String str, boolean z2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (b.f672) {
                            try {
                                char[] cArr2 = new char[i3];
                                b.f673 = 0;
                                while (true) {
                                    int i5 = b.f673;
                                    if (i5 >= i3) {
                                        break;
                                    }
                                    b.f671 = cArr[i5];
                                    cArr2[b.f673] = (char) (b.f671 + i4);
                                    int i6 = b.f673;
                                    cArr2[i6] = (char) (cArr2[i6] - f1546);
                                    b.f673 = i6 + 1;
                                }
                                if (i2 > 0) {
                                    b.f674 = i2;
                                    char[] cArr3 = new char[i3];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                                    int i7 = b.f674;
                                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                                    int i8 = b.f674;
                                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                                }
                                if (z2) {
                                    char[] cArr4 = new char[i3];
                                    b.f673 = 0;
                                    while (true) {
                                        int i9 = b.f673;
                                        if (i9 >= i3) {
                                            break;
                                        }
                                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                                        b.f673 = i9 + 1;
                                    }
                                    cArr2 = cArr4;
                                }
                                str2 = new String(cArr2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        f1547 = (f1548 + 115) % 128;
                        try {
                            final List<Object> listM1746 = cy.m1746(listM1786, new Object[]{this, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                            if (!zM1752) {
                                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.5.1
                                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                        dtVar.m2037(drVar, cpVar2, listM1746);
                                    }
                                });
                                return;
                            }
                            f1548 = (f1547 + 37) % 128;
                            dtVar.m2037(drVar, cpVar2, listM1746);
                            f1548 = (f1547 + 65) % 128;
                        } catch (Throwable th) {
                            String strM1616 = cpVar2.m1616();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m1781(View.MeasureSpec.getMode(0) + 15, 38 - TextUtils.lastIndexOf("", '0', 0), 281 - (KeyEvent.getMaxKeyCode() >> 16), "\u000f\u0019\u0001￬\u000e\uffef\uffc0\u000e\t\uffc0\u0012\u000f\u0012\u0012￥\uffc0\u0005\u0004\t\u0013\u000e\t\uffc0\u0012\u0005\u000e\u0005\u0014\u0013\t￬\u0005\u0007\u000e\u0001\b￣\u0014\u0015", true).intern());
                            sb.append(dtVar.m2038());
                            cq.m1676(strM1616, sb.toString(), th);
                        }
                    }
                };
                f1475 = (f1472 + 87) % 128;
                return onLayoutChangeListener;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1750((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\u0007\u0015\t\f\b \u000b\u0013\u0018\t\n\u000b\u0001\u0017\u000e\u001a\u000b\u0001\u000b\u0003{", 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1758(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final dt dtVar2 = (dt) cz.m1785(list, 1, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 2);
            final boolean zM1752 = m1752(list, 3);
            cpVar2 = cpVar;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.1

                    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                    private static int f1477 = 1;

                    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                    private static char f1478 = 8667;

                    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                    private static int f1479 = 0;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static char f1480 = 54072;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static char f1481 = 42212;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char f1482 = 44826;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private void m1770(final dt dtVar3, View view) {
                        try {
                            final List<Object> listM1746 = cy.m1746(listM1786, new Object[]{this, view});
                            if (!zM1752) {
                                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.1.2
                                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        dt dtVar4 = dtVar3;
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        dtVar4.m2037(drVar, cpVar2, listM1746);
                                    }
                                });
                                f1479 = (f1477 + 35) % 128;
                                return;
                            }
                            dtVar3.m2037(drVar, cpVar2, listM1746);
                            int i2 = f1479 + 97;
                            f1477 = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i3 = 47 / 0;
                            }
                        } catch (Throwable th) {
                            String strM1616 = cpVar2.m1616();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m1771("䏼뗼圁\u009f뜉夀⤫氣\ue4ea濳瓸ꐩ䑮ረ\ue2c8ꝱﻝ殴䘙⫃帥ण譸繯\ue6e4ꭘ\ue88a꼈ፅ䟯ᐈ䒍덋罞ᜣ㬔텕膸䙂㐉ಐ퉿柪骮", Color.rgb(0, 0, 0) + 16777260).intern());
                            sb.append(dtVar3.m2038());
                            cq.m1676(strM1616, sb.toString(), th);
                        }
                    }

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m1771(String str, int i2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (m.f2870) {
                            try {
                                char[] cArr2 = new char[cArr.length];
                                m.f2869 = 0;
                                char[] cArr3 = new char[2];
                                while (true) {
                                    int i3 = m.f2869;
                                    if (i3 < cArr.length) {
                                        cArr3[0] = cArr[i3];
                                        cArr3[1] = cArr[i3 + 1];
                                        int i4 = 58224;
                                        for (int i5 = 0; i5 < 16; i5++) {
                                            char c2 = cArr3[1];
                                            char c3 = cArr3[0];
                                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1481)) ^ ((c3 >>> 5) + f1478)));
                                            cArr3[1] = c4;
                                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1480) ^ ((c4 + i4) ^ ((c4 << 4) + f1482))));
                                            i4 -= 40503;
                                        }
                                        int i6 = m.f2869;
                                        cArr2[i6] = cArr3[0];
                                        cArr2[i6 + 1] = cArr3[1];
                                        m.f2869 = i6 + 2;
                                    } else {
                                        str2 = new String(cArr2, 0, i2);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        f1479 = (f1477 + 13) % 128;
                        m1770(dtVar, view);
                        f1477 = (f1479 + 19) % 128;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        f1479 = (f1477 + 107) % 128;
                        m1770(dtVar2, view);
                        int i2 = f1479 + 27;
                        f1477 = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                    }
                };
                int i2 = f1472 + 67;
                f1475 = i2 % 128;
                if (i2 % 2 == 0) {
                    return onAttachStateChangeListener;
                }
                throw null;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1750((byte) (90 - ((Process.getThreadPriority(0) + 20) >> 6)), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\n\u001bÎÎ\n\u0000!\u001b\b\u0007\u000b\u0001\u0015\u001d\u0007\n\u000b\u0004\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1760(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                he.a aVar = new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.18
                    @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    public final void mo1779(he heVar, MediaPlayer mediaPlayer) {
                        dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, heVar, mediaPlayer}));
                    }
                };
                f1475 = (f1472 + 109) % 128;
                return aVar;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1747("䱹횎鱘커䰼嚃鳔俶䷷哕黁䷯俤劘飚䯸䧣傚骊䧘䯬庅铟䟨䗅岉雓䗴䟴媛郱䏯䇞墂鋗䇵䏵䚴賲忐巊䒻軎巔忒䊭裫察姈䂯", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.jx.m2683(r0, new com.p004ironsource.adqualitysdk.sdk.i.cy.AnonymousClass12());
        com.p004ironsource.adqualitysdk.sdk.i.cy.f1475 = (com.p004ironsource.adqualitysdk.sdk.i.cy.f1472 + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if ((!m1752(r7, 3)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (m1752(r7, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.jx.m2683(r0, r1);
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1767(java.util.List<java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.cy.f1475
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.cy.f1472 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hc$d> r2 = com.ironsource.adqualitysdk.sdk.i.hc.d.class
            r3 = 0
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 1
            if (r0 != 0) goto L27
            java.lang.Object r0 = com.p004ironsource.adqualitysdk.sdk.i.cz.m1785(r7, r5, r4)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = com.p004ironsource.adqualitysdk.sdk.i.cz.m1785(r7, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.hc$d r1 = (com.ironsource.adqualitysdk.sdk.i.hc.d) r1
            r2 = 3
            boolean r7 = m1752(r7, r2)
            r7 = r7 ^ r5
            if (r7 == r5) goto L3e
            goto L3a
        L27:
            java.lang.Object r0 = com.p004ironsource.adqualitysdk.sdk.i.cz.m1785(r7, r3, r4)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = com.p004ironsource.adqualitysdk.sdk.i.cz.m1785(r7, r5, r2)
            com.ironsource.adqualitysdk.sdk.i.hc$d r2 = (com.ironsource.adqualitysdk.sdk.i.hc.d) r2
            boolean r7 = m1752(r7, r1)
            r1 = r2
            if (r7 == 0) goto L3e
        L3a:
            com.p004ironsource.adqualitysdk.sdk.i.jx.m2683(r0, r1)
            goto L4e
        L3e:
            com.ironsource.adqualitysdk.sdk.i.cy$12 r7 = new com.ironsource.adqualitysdk.sdk.i.cy$12
            r7.<init>()
            com.p004ironsource.adqualitysdk.sdk.i.jx.m2683(r0, r7)
            int r7 = com.p004ironsource.adqualitysdk.sdk.i.cy.f1472
            int r7 = r7 + 95
            int r7 = r7 % 128
            com.p004ironsource.adqualitysdk.sdk.i.cy.f1475 = r7
        L4e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.cy.m1767(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final il m1763(final cp cpVar, List<Object> list, final dr drVar) {
        final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            f1475 = (f1472 + 55) % 128;
            arrayList.addAll((Collection) cz.m1785(list, 1, List.class));
        }
        if (dtVar != null) {
            return new il() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.3
                @Override // com.p004ironsource.adqualitysdk.sdk.i.il
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo1780() {
                    arrayList.add(0, this);
                    dtVar.m2037(drVar, cpVar, arrayList);
                    arrayList.remove(0);
                }
            };
        }
        f1472 = (f1475 + 9) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1757(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            final boolean zM1752 = m1752(list, 2);
            cpVar2 = cpVar;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.8
                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    public static /* synthetic */ void m1782(AnonymousClass8 anonymousClass8, dt dtVar2, dr drVar2, cp cpVar3, List list2, Context context, Intent intent) {
                        dtVar2.m2037(drVar2, cpVar3, cy.m1746(list2, new Object[]{anonymousClass8, context, intent}));
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (zM1752) {
                            dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, context, intent}));
                        } else {
                            s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.8.5
                                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    AnonymousClass8.m1782(anonymousClass8, dtVar, drVar, cpVar2, listM1786, context, intent);
                                }
                            });
                        }
                    }
                };
                int i2 = f1475 + 41;
                f1472 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 8 / 0;
                }
                return broadcastReceiver;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1747("ᜭ쓽╺ࢍᝨ䓰◶覟ᚣ䚦⟣讆ᒰ䃫⇸趑\u12b7䋩⎨达Ⴏ䳽ⷵ膄Ả价\u2fe3莐Თ䣿⧿薍᪠䫨⯽螞", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1769(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                hd.e eVar = new hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.13
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.e
                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    public final boolean mo1776(hd hdVar, MediaPlayer mediaPlayer, int i2, int i3) {
                        return dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, hdVar, mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)})).m2047();
                    }
                };
                f1472 = (f1475 + 79) % 128;
                return eVar;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1750((byte) (TextUtils.lastIndexOf("", '0', 0) + 40), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u000f\u000b\u0014\u0000\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", View.MeasureSpec.getMode(0) + 40).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1762(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                hk.d dVar = new hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.15
                    @Override // com.ironsource.adqualitysdk.sdk.i.hk.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final boolean mo1777(hk hkVar, View view, MotionEvent motionEvent) {
                        return dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, hkVar, view, motionEvent})).m2047();
                    }
                };
                f1475 = (f1472 + 65) % 128;
                return dVar;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1747("ᨶ獪撬\ue1f0ᩳ\uf367搠惢᮸\uf131昵拻ᦫ\uf77c怮擬ᾬ\uf57e找曗ᶯﭠ氵棒Ꮄ凌温櫬ᆽ･栆泼ឡﵽ樫滿ᖳ\ue347", 1 - TextUtils.getOffsetAfter("", 0)).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1768(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                hc.d dVar = new hc.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.hc.d
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1775(hc hcVar, View view) {
                        dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, hcVar, view}));
                    }
                };
                int i2 = f1472 + 21;
                f1475 = i2 % 128;
                if (i2 % 2 == 0) {
                    return dVar;
                }
                throw null;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1747("\ud95bꃑ耨\uffd0\ud91e⃜肤绂\ud8d5⊊花糛\udac6Ⓡ蒪竌\udcc1⛅蛺磷\udec2⣛袱盲탙⫹誮瓐틐ⳝ貂狜퓌⻆躯烟훞ー", -MotionEvent.axisFromString("")).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1754(List<Object> list) {
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1785(list, 0, MediaPlayer.class);
        final hd.e eVar = (hd.e) cz.m1785(list, 1, hd.e.class);
        if (m1752(list, 2)) {
            jx.m2686(mediaPlayer, eVar);
            f1475 = (f1472 + 1) % 128;
        } else {
            jx.m2686(mediaPlayer, new hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.7
                @Override // com.ironsource.adqualitysdk.sdk.i.hd.e
                /* JADX INFO: renamed from: ﻛ */
                public final boolean mo1776(final hd hdVar, final MediaPlayer mediaPlayer2, final int i2, final int i3) {
                    s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.7.2
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            eVar.mo1776(hdVar, mediaPlayer2, i2, i3);
                        }
                    });
                    return false;
                }
            });
        }
        f1472 = (f1475 + 39) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1761(List<Object> list) {
        f1475 = (f1472 + 47) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1785(list, 0, MediaPlayer.class);
        final hf.c cVar = (hf.c) cz.m1785(list, 1, hf.c.class);
        if (!(!m1752(list, 2))) {
            f1475 = (f1472 + 49) % 128;
            jx.m2688(mediaPlayer, cVar);
        } else {
            jx.m2688(mediaPlayer, new hf.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.4
                @Override // com.ironsource.adqualitysdk.sdk.i.hf.c
                /* JADX INFO: renamed from: ﾒ */
                public final void mo1774(final hf hfVar, final MediaPlayer mediaPlayer2) {
                    s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.4.2
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cVar.mo1774(hfVar, mediaPlayer2);
                        }
                    });
                }
            });
            f1472 = (f1475 + 59) % 128;
        }
        f1472 = (f1475 + 31) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1756(List<Object> list) {
        f1475 = (f1472 + 101) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1785(list, 0, MediaPlayer.class);
        final hj.a aVar = (hj.a) cz.m1785(list, 1, hj.a.class);
        if (m1752(list, 2)) {
            jx.m2690(mediaPlayer, aVar);
        } else {
            jx.m2690(mediaPlayer, new hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.2
                @Override // com.ironsource.adqualitysdk.sdk.i.hj.a
                /* JADX INFO: renamed from: ﾒ */
                public final void mo1778(final hj hjVar, final MediaPlayer mediaPlayer2) {
                    s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.2.5
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            aVar.mo1778(hjVar, mediaPlayer2);
                        }
                    });
                }
            });
        }
        int i2 = f1472 + 23;
        f1475 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r0 r1
  0x003d: PHI (r0v6 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v8 android.media.MediaPlayer) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r1v4 com.ironsource.adqualitysdk.sdk.i.he$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.he$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.he$a) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0039 A[PHI: r0 r1
  0x0039: PHI (r0v5 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v8 android.media.MediaPlayer) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r1v3 com.ironsource.adqualitysdk.sdk.i.he$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.he$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.he$a) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1759(List<Object> list) {
        MediaPlayer mediaPlayer;
        final he.a aVar;
        int i2 = f1475 + 69;
        f1472 = i2 % 128;
        if (i2 % 2 == 0) {
            mediaPlayer = (MediaPlayer) cz.m1785(list, 0, MediaPlayer.class);
            aVar = (he.a) cz.m1785(list, 0, he.a.class);
            if (m1752(list, 4)) {
                jx.m2687(mediaPlayer, aVar);
            } else {
                jx.m2687(mediaPlayer, new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1779(final he heVar, final MediaPlayer mediaPlayer2) {
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.6.5
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                aVar.mo1779(heVar, mediaPlayer2);
                            }
                        });
                    }
                });
            }
        } else {
            mediaPlayer = (MediaPlayer) cz.m1785(list, 0, MediaPlayer.class);
            aVar = (he.a) cz.m1785(list, 1, he.a.class);
            if (m1752(list, 2)) {
                jx.m2687(mediaPlayer, aVar);
            } else {
                jx.m2687(mediaPlayer, new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1779(final he heVar, final MediaPlayer mediaPlayer2) {
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.6.5
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                aVar.mo1779(heVar, mediaPlayer2);
                            }
                        });
                    }
                });
            }
        }
        f1472 = (f1475 + 111) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Object> m1751(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            f1472 = (f1475 + 81) % 128;
            arrayList.addAll(list);
        }
        int i2 = f1472 + 97;
        f1475 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1765(List<Object> list) {
        f1472 = (f1475 + 77) % 128;
        View view = (View) cz.m1785(list, 0, View.class);
        final hk.d dVar = (hk.d) cz.m1785(list, 1, hk.d.class);
        if (m1752(list, 2)) {
            jx.m2684(view, dVar);
            f1475 = (f1472 + 115) % 128;
        } else {
            jx.m2684(view, new hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.14
                @Override // com.ironsource.adqualitysdk.sdk.i.hk.d
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final boolean mo1777(final hk hkVar, final View view2, final MotionEvent motionEvent) {
                    s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.14.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            dVar.mo1777(hkVar, view2, motionEvent);
                        }
                    });
                    return false;
                }
            });
        }
        int i2 = f1475 + 65;
        f1472 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1766(cp cpVar, List<Object> list, final dr drVar) {
        final cp cpVar2;
        try {
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            final List<Object> listM1786 = cz.m1786(list, 1);
            cpVar2 = cpVar;
            try {
                hf.c cVar = new hf.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.11
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.c
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final void mo1774(hf hfVar, MediaPlayer mediaPlayer) {
                        dtVar.m2037(drVar, cpVar2, cy.m1746(listM1786, new Object[]{this, hfVar, mediaPlayer}));
                    }
                };
                f1472 = (f1475 + 21) % 128;
                return cVar;
            } catch (Exception e2) {
                e = e2;
                cq.m1676(cpVar2.m1616(), m1747("扉眻㥚媮戌\uf736㧖\udbbc揇\uf560㯃\ud9a5懔\uf32d㷘\udfb2染\uf12f㾈\udd92旜Ｐ㇝펢毵ﴼ㏑톾槄אַ㗳\ud7a5濽浪㟝햿淈\ue716⧡쮗珙\ue509⯳즃燴\ue302ⷩ쾉", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            cpVar2 = cpVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1752(List<Object> list, int i2) {
        if (list.size() > i2) {
            int i3 = f1475 + 15;
            f1472 = i3 % 128;
            int i4 = i3 % 2;
            Boolean bool = (Boolean) cz.m1785(list, i2, Boolean.class);
            if (i4 == 0) {
                bool.booleanValue();
                throw null;
            }
            if (bool.booleanValue()) {
                int i5 = f1475 + 99;
                f1472 = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        f1472 = (f1475 + 71) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1750(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1474;
                char c2 = f1473;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1747(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1476, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1476));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1764(final cp cpVar, List<Object> list) {
        final String simpleName;
        f1472 = (f1475 + 105) % 128;
        Class cls = (Class) cz.m1785(list, 0, Class.class);
        Object objM1785 = cz.m1785(list, 1, Object.class);
        final boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m1785(list, 2, Boolean.class)).booleanValue() : false;
        if (list.size() > 3) {
            simpleName = (String) cz.m1785(list, 3, String.class);
            f1475 = (f1472 + 17) % 128;
        } else {
            simpleName = cls.getSimpleName();
        }
        return ka.m2738(cls, objM1785, new ka.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.10

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1493 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1494 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1495 = {23, 128, 278, 301, 299, 299, 260, 255, 294, 301, 301, 296, 293, 294, 293, 254, 16, ' ', 'G', 'n', 'G', 'B', 'i', 'k', 'n', 'l', 'i', 'A', 137, 144, 139, 135, 'c', 'f', 136, 134};

            /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x0010, B:13:0x001a, B:15:0x0044, B:17:0x004e, B:20:0x0067, B:22:0x0073, B:16:0x0049), top: B:30:0x0010 }] */
            /* JADX WARN: Code duplicated, block: B:15:0x0044 A[Catch: Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x0010, B:13:0x001a, B:15:0x0044, B:17:0x004e, B:20:0x0067, B:22:0x0073, B:16:0x0049), top: B:30:0x0010 }] */
            /* JADX WARN: Code duplicated, block: B:16:0x0049 A[Catch: Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x0010, B:13:0x001a, B:15:0x0044, B:17:0x004e, B:20:0x0067, B:22:0x0073, B:16:0x0049), top: B:30:0x0010 }] */
            /* JADX WARN: Code duplicated, block: B:19:0x005f  */
            @Override // com.ironsource.adqualitysdk.sdk.i.ka.e
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1773(Object obj, Method method, Object[] objArr) {
                List arrayList;
                List<Object> listM1746;
                ArrayList arrayList2;
                int i2 = f1494 + 77;
                f1493 = i2 % 128;
                if (i2 % 2 != 0) {
                    try {
                        int i3 = 47 / 0;
                        if (method != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(simpleName);
                            sb.append(m1772(false, new int[]{0, 1, 0, 0}, "\u0000").intern());
                            sb.append(method.getName());
                            String string = sb.toString();
                            hg hgVar = (hg) obj;
                            if (objArr != null) {
                                arrayList = Arrays.asList(objArr);
                            } else {
                                arrayList = new ArrayList();
                            }
                            listM1746 = cy.m1746(arrayList, new Object[]{hgVar});
                            arrayList2 = new ArrayList();
                            if (zBooleanValue) {
                                f1494 = (f1493 + 113) % 128;
                                arrayList2.add(listM1746);
                                f1494 = (f1493 + 97) % 128;
                                listM1746 = arrayList2;
                            }
                            cpVar.m1615().mo1479(string, listM1746);
                        }
                    } catch (Exception e2) {
                        String strM1616 = cpVar.m1616();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m1772(false, new int[]{1, 15, 187, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001").intern());
                        sb2.append(method.getName());
                        sb2.append(m1772(true, new int[]{16, 11, 0, 1}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000").intern());
                        sb2.append(simpleName);
                        sb2.append(m1772(true, new int[]{27, 9, 29, 6}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001").intern());
                        cq.m1676(strM1616, sb2.toString(), e2);
                        return;
                    }
                } else if (method != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(simpleName);
                    sb3.append(m1772(false, new int[]{0, 1, 0, 0}, "\u0000").intern());
                    sb3.append(method.getName());
                    String string2 = sb3.toString();
                    hg hgVar2 = (hg) obj;
                    if (objArr != null) {
                        arrayList = Arrays.asList(objArr);
                    } else {
                        arrayList = new ArrayList();
                    }
                    listM1746 = cy.m1746(arrayList, new Object[]{hgVar2});
                    arrayList2 = new ArrayList();
                    if (zBooleanValue) {
                        f1494 = (f1493 + 113) % 128;
                        arrayList2.add(listM1746);
                        f1494 = (f1493 + 97) % 128;
                        listM1746 = arrayList2;
                    }
                    cpVar.m1615().mo1479(string2, listM1746);
                }
                int i4 = f1493 + 125;
                f1494 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 18 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1772(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                        System.arraycopy(f1495, i2, cArr, 0, i3);
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
        });
    }
}
