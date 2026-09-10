package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ih {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2484 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2485 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2488 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2489 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2490 = 5;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<ig.e, ib> f2491;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2487 = {'T', 'g', 'o', 'j', 'h', 'y', 'K', 'n', 's', 'i', 'w', '%', '~', 'u', 'k', 't', 'r', 'q', 'f', 'x', 'z', 'm', 'J', 'l', '}', 'H', 'R', '1', '{', '?'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2486 = 99;

    public ih() {
        m2485((String) null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2491 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <T> T m2468(Class cls, Object obj, hz hzVar, T t10) {
        Field fieldM2315;
        int i10 = f2484 + 125;
        f2485 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM2315 = id.m2382().m2384().m2315(cls, hzVar);
                int i11 = 98 / 0;
                if (fieldM2315 == null) {
                    return t10;
                }
            } else {
                fieldM2315 = id.m2382().m2384().m2315(cls, hzVar);
                if (fieldM2315 == null) {
                    return t10;
                }
            }
            T t11 = (T) fieldM2315.get(obj);
            int i12 = f2485 + 115;
            f2484 = i12 % 128;
            if (i12 % 2 == 0) {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m2485((String) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2473((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, false, 193 - TextUtils.lastIndexOf("", '0', 0, 0), "\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1￦\u0013\u0013\u0010\u0013", TextUtils.indexOf("", "", 0) + 9).intern());
            sb2.append(hzVar.m2332());
            sb2.append(m2485((String) null, 127 - (ViewConfiguration.getTouchSlop() >> 8), (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2485((String) null, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, (int[]) null, "\u0094\u0094\u0093\u0092\u0085\u008c").intern());
            m.m2972(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2475(Object obj, List<String> list) {
        int i10 = f2484;
        f2485 = (i10 + 35) % 128;
        if (obj == null) {
            return false;
        }
        f2485 = (i10 + 87) % 128;
        boolean zM2880 = kk.m2880(obj.getClass(), list);
        f2484 = (f2485 + 65) % 128;
        return zM2880;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m2483(Class cls, Object obj, hz hzVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = id.m2382().m2384().m2314(cls, hzVar).iterator();
            f2484 = (f2485 + 89) % 128;
            while (it.hasNext()) {
                int i10 = f2485 + 29;
                f2484 = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList.add(it.next().get(obj));
                    throw null;
                }
                arrayList.add(it.next().get(obj));
            }
            return arrayList;
        } catch (Throwable unused) {
            String strIntern = m2485((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2473((-16777202) - Color.rgb(0, 0, 0), false, 194 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1￦\u0013\u0013\u0010\u0013", 9 - TextUtils.indexOf("", "", 0, 0)).intern());
            sb2.append(hzVar.m2332());
            sb2.append(m2485((String) null, 127 - Drawable.resolveOpacity(0, 0), (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2485((String) null, TextUtils.getOffsetBefore("", 0) + 127, (int[]) null, "\u0094\u0094\u0093\u0092\u0085\u008c").intern());
            m.m2972(strIntern, sb2.toString());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> Cif<T> m2490(Object obj, ig igVar) {
        int i10 = f2485 + InterfaceC0435l1.d.b.f29110g;
        f2484 = i10 % 128;
        if (i10 % 2 != 0) {
            System.currentTimeMillis();
            this.f2491.get(igVar.m2425(obj.getClass()));
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ig.e eVarM2425 = igVar.m2425(obj.getClass());
        ib ibVar = this.f2491.get(eVarM2425);
        if (ibVar != null) {
            Cif<T> cifM2480 = m2480(obj, ibVar);
            if (cifM2480 != null) {
                int i11 = f2485 + 41;
                f2484 = i11 % 128;
                if (i11 % 2 != 0) {
                    m2470(igVar.m2423(), cifM2480);
                    throw null;
                }
                if (m2470(igVar.m2423(), cifM2480)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2485((String) null, 127 - KeyEvent.normalizeMetaState(0), (int[]) null, "\u008c\u0089\u0088\u008c\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0089\u0095\u0090\u008f").intern());
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    m2487(cifM2480, obj, f2.m(sb2, m2473(2 - View.resolveSizeAndState(0, 0, 0), true, 211 - TextUtils.indexOf("", "", 0), "�\u0003", KeyEvent.normalizeMetaState(0) + 1)));
                    return cifM2480;
                }
            }
            String strIntern = m2485((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(m2473(Gravity.getAbsoluteGravity(0, 0) + 11, false, TextUtils.indexOf("", "", 0) + PsExtractor.PRIVATE_STREAM_1, "￠ￆ\u0016\u0007\u001a\u000eￆ\u0013\u000f\u0019\u0019", 10 - Process.getGidForName("")).intern());
            m.m2972(strIntern, sb3.toString());
            this.f2491.remove(eVarM2425);
        }
        ij<T> ijVar = new ij<>(igVar);
        Cif<T> cifM2484 = m2484(obj, ijVar, 0, (Cif) null);
        if (cifM2484 == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2473(13 - Drawable.resolveOpacity(0, 0), true, 190 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0019\u0014\u0013ￅ\u0013\u000eￅ\t\u0013\u001a\u0014\u000bￅ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3).intern());
            sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb4.append(m2473(4 - View.MeasureSpec.makeMeasureSpec(0, 0), false, 174 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\"(￡ￕ", 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            sb4.append(ijVar.m2502().size());
            m2487((Cif) null, obj, f2.m(sb4, m2473(15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, 191 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006", 2 - TextUtils.getOffsetAfter("", 0))));
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(m2473((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 190, "ￅ\t\u0013\u001a\u0014\u000bￅ\u0013\u000e", Color.red(0) + 6).intern());
        sb5.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb5.append(m2473(4 - View.MeasureSpec.makeMeasureSpec(0, 0), false, 175 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\"(￡ￕ", 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        sb5.append(ijVar.m2502().size());
        m2487(cifM2484, obj, f2.m(sb5, m2473(14 - TextUtils.lastIndexOf("", '0', 0), true, 191 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006", 2 - (KeyEvent.getMaxKeyCode() >> 16))));
        this.f2491.put(eVarM2425, ijVar.m2498());
        return cifM2484;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final <T> Cif<T> m2492(Object obj, ii iiVar, hx hxVar, List<String> list, int i10) {
        Cif<T> cifM2490 = m2490(obj, new ig.d().m2434(true).m2442(iiVar, hxVar, list, i10));
        f2484 = (f2485 + 97) % 128;
        return cifM2490;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<Cif> m2494(Object obj, ig igVar) {
        ij ijVar = new ij(igVar);
        ijVar.m2500();
        m2484(obj, ijVar, 0, (Cif) null);
        ArrayList arrayList = new ArrayList(ijVar.m2496());
        f2485 = (f2484 + 13) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> Cif<T> m2472(Object obj, Object obj2, Cif cif) {
        if (obj == null) {
            return null;
        }
        f2485 = (f2484 + InterfaceC0435l1.d.b.f29107d) % 128;
        if (obj instanceof Collection) {
            ik ikVar = new ik((Collection) obj, obj2, cif);
            int i10 = f2485 + 83;
            f2484 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 94 / 0;
            }
            return ikVar;
        }
        if (obj instanceof Map) {
            ik ikVar2 = new ik((Map) obj, obj2, cif);
            int i12 = f2484 + 125;
            f2485 = i12 % 128;
            if (i12 % 2 != 0) {
                return ikVar2;
            }
            throw null;
        }
        if (obj.getClass().isArray()) {
            return new ik(new ArrayList(Arrays.asList(obj)), obj2, cif);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #0 {all -> 0x0069, blocks: (B:18:0x004a, B:21:0x005c, B:26:0x0083, B:28:0x008b, B:30:0x009d, B:33:0x00a4, B:24:0x006b), top: B:37:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:18:0x004a, B:21:0x005c, B:26:0x0083, B:28:0x008b, B:30:0x009d, B:33:0x00a4, B:24:0x006b), top: B:37:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:18:0x004a, B:21:0x005c, B:26:0x0083, B:28:0x008b, B:30:0x009d, B:33:0x00a4, B:24:0x006b), top: B:37:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private <T> Cif<T> m2484(Object obj, ij<T> ijVar, int i10, Cif cif) {
        Field[] fieldArrM2488;
        ib ibVarM2498;
        int length;
        int i11;
        Cif<T> cifM2477;
        int i12 = f2485 + 27;
        f2484 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 85 / 0;
            if (i10 != ijVar.m2503().m2417()) {
                if (obj != null && !ijVar.m2502().contains(obj)) {
                    f2485 = (f2484 + 107) % 128;
                    if (i10 > 0 || !(obj instanceof Activity)) {
                        ijVar.m2502().add(obj);
                        try {
                            if (ijVar.m2503().m2422() != null) {
                                f2484 = (f2485 + 31) % 128;
                                fieldArrM2488 = ijVar.m2503().m2422().mo2319(obj);
                            } else {
                                fieldArrM2488 = m2488(obj.getClass(), ijVar.m2503().m2421(i10));
                                f2485 = (f2484 + 69) % 128;
                            }
                            ibVarM2498 = ijVar.m2498();
                            length = fieldArrM2488.length;
                            i11 = 0;
                            while (i11 < length) {
                                Field field = fieldArrM2488[i11];
                                field.setAccessible(true);
                                ibVarM2498.m2364(field);
                                cifM2477 = m2477(m2482(field, obj, cif), ijVar, i10);
                                if (cifM2477 == null && !ijVar.m2504()) {
                                    return cifM2477;
                                }
                                ibVarM2498.m2366(field);
                                i11++;
                                f2485 = (f2484 + 11) % 128;
                            }
                        } catch (Throwable th2) {
                            m.m2983(m2485((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2473('I' - AndroidCharacter.getMirror('0'), true, 195 - KeyEvent.getDeadChar(0, 0), "\u0012\u000f\u0012\u0012￥\u0004\f\u0005\t￦\u0014\u0003\u0005\n\u0002\uffef\uffc0\u0007\u000e\t\u0014\u0014\u0005\u0007\uffc0", 5 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th2);
                        }
                    }
                }
            }
        } else if (i10 != ijVar.m2503().m2417()) {
            if (obj != null) {
                f2485 = (f2484 + 107) % 128;
                if (i10 > 0) {
                    ijVar.m2502().add(obj);
                    if (ijVar.m2503().m2422() != null) {
                        f2484 = (f2485 + 31) % 128;
                        fieldArrM2488 = ijVar.m2503().m2422().mo2319(obj);
                    } else {
                        fieldArrM2488 = m2488(obj.getClass(), ijVar.m2503().m2421(i10));
                        f2485 = (f2484 + 69) % 128;
                    }
                    ibVarM2498 = ijVar.m2498();
                    length = fieldArrM2488.length;
                    i11 = 0;
                    while (i11 < length) {
                        Field field2 = fieldArrM2488[i11];
                        field2.setAccessible(true);
                        ibVarM2498.m2364(field2);
                        cifM2477 = m2477(m2482(field2, obj, cif), ijVar, i10);
                        if (cifM2477 == null) {
                        }
                        ibVarM2498.m2366(field2);
                        i11++;
                        f2485 = (f2484 + 11) % 128;
                    }
                } else {
                    ijVar.m2502().add(obj);
                    if (ijVar.m2503().m2422() != null) {
                        f2484 = (f2485 + 31) % 128;
                        fieldArrM2488 = ijVar.m2503().m2422().mo2319(obj);
                    } else {
                        fieldArrM2488 = m2488(obj.getClass(), ijVar.m2503().m2421(i10));
                        f2485 = (f2484 + 69) % 128;
                    }
                    ibVarM2498 = ijVar.m2498();
                    length = fieldArrM2488.length;
                    i11 = 0;
                    while (i11 < length) {
                        Field field3 = fieldArrM2488[i11];
                        field3.setAccessible(true);
                        ibVarM2498.m2364(field3);
                        cifM2477 = m2477(m2482(field3, obj, cif), ijVar, i10);
                        if (cifM2477 == null) {
                        }
                        ibVarM2498.m2366(field3);
                        i11++;
                        f2485 = (f2484 + 11) % 128;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2470(ii iiVar, Cif cif) {
        int i10 = f2484 + 15;
        f2485 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                boolean zMo1868 = iiVar.mo1868(cif);
                int i11 = f2485 + 9;
                f2484 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 30 / 0;
                }
                return zMo1868;
            }
            iiVar.mo1868(cif);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private <T> Cif<T> m2480(Object obj, ib ibVar) {
        List<Field> list;
        int i10 = f2484 + InterfaceC0435l1.d.b.f29110g;
        f2485 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                list = ibVar.m2362().get(0);
            } else {
                list = ibVar.m2362().get(0);
            }
            Cif<T> cifM2476 = m2476(m2481(obj, list, (Cif) null), ibVar, 1);
            int i11 = f2484 + 85;
            f2485 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 45 / 0;
            }
            return cifM2476;
        } catch (Exception e10) {
            m.m2983(m2485((String) null, 126 - MotionEvent.axisFromString(""), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2485((String) null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0092\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0098\u0089\u0088\u0086\u0086\u0084\u0098\u008c\u008b\u0090\u008b\u008b\u0097").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m2469(Object obj) {
        int i10 = f2484 + 115;
        f2485 = i10 % 128;
        List listM2486 = i10 % 2 == 0 ? m2486(obj, true, true, false) : m2486(obj, true, true, true);
        int i11 = f2485 + 57;
        f2484 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 93 / 0;
        }
        return listM2486;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2489(Object obj, JSONArray jSONArray) {
        if (jSONArray != null) {
            f2484 = (f2485 + 65) % 128;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int i11 = f2485 + 55;
                f2484 = i11 % 128;
                if (i11 % 2 == 0) {
                    String strM2491 = m2491(obj, jSONArray.optString(i10));
                    if (strM2491 != null) {
                        f2485 = (f2484 + 119) % 128;
                        return strM2491;
                    }
                } else {
                    m2491(obj, jSONArray.optString(i10));
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2471(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (i10 < length) {
            f2485 = (f2484 + InterfaceC0435l1.d.b.f29109f) % 128;
            Field field = declaredFields[i10];
            if (field.getType().equals(String.class)) {
                f2484 = (f2485 + InterfaceC0435l1.d.b.f29105b) % 128;
                arrayList.add(field);
            }
            i10++;
            f2485 = (f2484 + 87) % 128;
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> Cif<T> m2481(Object obj, List<Field> list, Cif cif) throws IllegalAccessException {
        Object obj2;
        for (Field field : list) {
            if (WeakReference.class.isAssignableFrom(field.getType())) {
                int i10 = f2485 + 13;
                f2484 = i10 % 128;
                if (i10 % 2 != 0) {
                    obj2 = ((WeakReference) field.get(obj)).get();
                    int i11 = 1 / 0;
                } else {
                    obj2 = ((WeakReference) field.get(obj)).get();
                }
            } else {
                obj2 = field.get(obj);
                f2485 = (f2484 + 39) % 128;
            }
            cif = m2482(field, obj, cif);
            obj = obj2;
        }
        return cif;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2474(Object obj, Class cls, String str) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            for (Field field : m2471(cls)) {
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                        int i10 = f2485 + 57;
                        f2484 = i10 % 128;
                        if (i10 % 2 == 0) {
                            return str2;
                        }
                        throw null;
                    }
                    f2485 = (f2484 + 61) % 128;
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        int i11 = f2485 + 57;
        f2484 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 88 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> Cif<T> m2482(Field field, Object obj, Cif cif) {
        ik ikVar = new ik(field, obj, cif);
        f2485 = (f2484 + 7) % 128;
        return ikVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2495(Object obj, List<String> list, int i10) {
        ij ijVar = new ij(new ig.d().m2438(true).m2441(true).m2436(true).m2439(-1).m2443(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ih.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1868(Cif cif) {
                return cif.mo2410() instanceof String;
            }
        }, list, i10));
        ijVar.m2500();
        m2484(obj, ijVar, 0, (Cif) null);
        ArrayList arrayList = new ArrayList(ijVar.m2497());
        int i11 = f2484 + 45;
        f2485 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2473(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f2486);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> Cif<T> m2476(Cif cif, ib ibVar, int i10) {
        int i11 = f2485 + 119;
        f2484 = i11 % 128;
        if (i11 % 2 != 0) {
            ibVar.m2362().size();
            throw null;
        }
        if (i10 >= ibVar.m2362().size()) {
            return cif;
        }
        List<Field> list = ibVar.m2362().get(i10);
        Object objMo2410 = cif.mo2410();
        List listM2469 = m2469(objMo2410);
        if (listM2469 == null) {
            String strIntern = m2485((String) null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2485((String) null, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, (int[]) null, "\u008c\u008a\u0084\u009d\u0088\u0084\u0085\u0084\u008b\u008c\u009c\u008e\u0093\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0092\u0092\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0097").intern());
            sb2.append(objMo2410.getClass());
            m.m2972(strIntern, sb2.toString());
            return null;
        }
        Iterator it = listM2469.iterator();
        f2484 = (f2485 + 115) % 128;
        while (it.hasNext()) {
            int i12 = f2484 + 19;
            f2485 = i12 % 128;
            if (i12 % 2 != 0) {
                Object next = it.next();
                try {
                    Cif cifM2481 = m2481(next, list, m2472(objMo2410, next, cif));
                    if (cifM2481 != null) {
                        f2485 = (f2484 + 61) % 128;
                        Cif<T> cifM2476 = m2476(cifM2481, ibVar, i10 + 1);
                        int i13 = f2484 + 5;
                        f2485 = i13 % 128;
                        if (i13 % 2 != 0) {
                            return cifM2476;
                        }
                        throw null;
                    }
                } catch (Exception unused) {
                }
            } else {
                Object next2 = it.next();
                m2481(next2, list, m2472(objMo2410, next2, cif));
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Field[] m2488(Class cls, int i10) {
        Field[] declaredFields = cls.getDeclaredFields();
        int i11 = 0;
        while (cls != null && i11 != i10) {
            int i12 = f2484 + 63;
            f2485 = i12 % 128;
            if (i12 % 2 != 0) {
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = kk.m2878(declaredFields, cls.getDeclaredFields());
                }
                i11++;
                f2484 = (f2485 + 81) % 128;
            } else {
                cls.getSuperclass();
                throw null;
            }
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List m2486(Object obj, boolean z10, boolean z11, boolean z12) {
        int i10 = f2485;
        int i11 = i10 + 91;
        f2484 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            f2484 = (i10 + 89) % 128;
            if (obj instanceof Collection) {
                f2484 = (i10 + 3) % 128;
                if (z10) {
                    return new ArrayList((Collection) obj);
                }
            }
            if (obj.getClass().isArray() && z12) {
                ArrayList arrayList = new ArrayList(Arrays.asList(obj));
                f2485 = (f2484 + 89) % 128;
                return arrayList;
            }
            if ((obj instanceof Map) && z11) {
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.values());
                arrayList2.addAll(map.keySet());
                f2484 = (f2485 + 7) % 128;
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2493(Class cls, String str) {
        int i10 = f2484 + 71;
        f2485 = i10 % 128;
        if (i10 % 2 == 0) {
            m2474((Object) null, cls, str);
            throw null;
        }
        String strM2474 = m2474((Object) null, cls, str);
        f2485 = (f2484 + InterfaceC0435l1.d.b.f29105b) % 128;
        return strM2474;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        r5 = m2485((java.lang.String) null, 127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        r0 = new java.lang.StringBuilder();
        r0.append(r6);
        r0.append(m2485((java.lang.String) null, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, (int[]) null, "\u008c\u009e").intern());
        r0.append(r7);
        com.ironsource.adqualitysdk.sdk.i.m.m2964(r5, r0.toString());
        com.ironsource.adqualitysdk.sdk.i.ih.f2484 = (com.ironsource.adqualitysdk.sdk.i.ih.f2485 + 59) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r0 = m2485((java.lang.String) null, 127 - android.graphics.Color.blue(0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        r2 = new java.lang.StringBuilder();
        r2.append(r6);
        r2.append(m2485((java.lang.String) null, 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (int[]) null, "\u008c\u009e").intern());
        r2.append(r7);
        r2.append(m2473(android.graphics.Color.rgb(0, 0, 0) + 16777224, true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 180, "\u0014$\u001b\u0010%ￏￛￏ", 6 - android.text.TextUtils.lastIndexOf("", '0', 0)).intern());
        r2.append(r5.mo2410());
        com.ironsource.adqualitysdk.sdk.i.m.m2964(r0, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2487(com.ironsource.adqualitysdk.sdk.i.Cif r5, java.lang.Object r6, java.lang.String r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ih.f2484
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ih.f2485 = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u008c\u009e"
            java.lang.String r2 = "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L18
            r0 = 83
            int r0 = r0 / r3
            if (r5 == 0) goto L7d
            goto L1a
        L18:
            if (r5 == 0) goto L7d
        L1a:
            int r0 = android.graphics.Color.blue(r3)
            int r0 = 127 - r0
            java.lang.String r0 = m2485(r4, r0, r4, r2)
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = 127 - r6
            java.lang.String r6 = m2485(r4, r6, r4, r1)
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            r2.append(r7)
            r6 = 16777224(0x1000008, float:2.350991E-38)
            int r7 = android.graphics.Color.rgb(r3, r3, r3)
            int r7 = r7 + r6
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + 180
            java.lang.String r1 = ""
            r4 = 48
            int r1 = android.text.TextUtils.lastIndexOf(r1, r4, r3)
            int r1 = 6 - r1
            r3 = 1
            java.lang.String r4 = "\u0014$\u001b\u0010%ￏￛￏ"
            java.lang.String r6 = m2473(r7, r3, r6, r4, r1)
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            java.lang.Object r5 = r5.mo2410()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.ironsource.adqualitysdk.sdk.i.m.m2964(r0, r5)
            return
        L7d:
            int r5 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r5 = r5 >> 16
            int r5 = 127 - r5
            java.lang.String r5 = m2485(r4, r5, r4, r2)
            java.lang.String r5 = r5.intern()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            int r6 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r6 = r6 >> 16
            int r6 = r6 + 127
            java.lang.String r6 = m2485(r4, r6, r4, r1)
            java.lang.String r6 = r6.intern()
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            com.ironsource.adqualitysdk.sdk.i.m.m2964(r5, r6)
            int r5 = com.ironsource.adqualitysdk.sdk.i.ih.f2485
            int r5 = r5 + 59
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ih.f2484 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ih.m2487(com.ironsource.adqualitysdk.sdk.i.if, java.lang.Object, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif m2477(Cif cif, ij ijVar, int i10) {
        Object objMo2410 = cif.mo2410();
        Cif cifM2477 = null;
        if (!ijVar.m2502().contains(objMo2410) && !ijVar.m2497().contains(objMo2410)) {
            if (ijVar.m2503().m2418(i10) && m2470(ijVar.m2503().m2423(), cif)) {
                if (ijVar.m2504()) {
                    ijVar.m2501(cif);
                    ijVar.m2499(objMo2410);
                }
                return cif;
            }
            if (objMo2410 instanceof WeakReference) {
                WeakReference weakReference = (WeakReference) objMo2410;
                if (weakReference.get() != null) {
                    f2484 = (f2485 + 1) % 128;
                    if (ijVar.m2503().m2427(i10) && m2475(weakReference.get(), ijVar.m2503().m2426())) {
                        return m2484(weakReference.get(), ijVar, i10 + 1, cif);
                    }
                }
            }
            if (m2475(objMo2410, ijVar.m2503().m2426())) {
                int i11 = f2485 + 97;
                f2484 = i11 % 128;
                return i11 % 2 != 0 ? m2484(objMo2410, ijVar, i10, cif) : m2484(objMo2410, ijVar, i10 + 1, cif);
            }
            if (ijVar.m2503().m2419() && objMo2410 != null) {
                ijVar.m2502().add(objMo2410);
            }
            List listM2479 = m2479(objMo2410, ijVar.m2503(), i10);
            ib ibVarM2498 = ijVar.m2498();
            if (listM2479 != null) {
                Iterator it = listM2479.iterator();
                while (it.hasNext()) {
                    Cif cifM2472 = m2472(objMo2410, it.next(), cif);
                    ibVarM2498.m2363();
                    cifM2477 = m2477(cifM2472, ijVar, i10);
                    if (cifM2477 != null && !ijVar.m2504()) {
                        return cifM2477;
                    }
                    ibVarM2498.m2365();
                }
            }
            return cifM2477;
        }
        f2485 = (f2484 + 77) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2485(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2487;
                int i11 = f2490;
                if (f2488) {
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
                if (f2489) {
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List m2479(Object obj, ig igVar, int i10) {
        f2485 = (f2484 + 97) % 128;
        List listM2486 = m2486(obj, igVar.m2416(i10), igVar.m2420(i10), igVar.m2424(i10));
        f2484 = (f2485 + 87) % 128;
        return listM2486;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2491(Object obj, String str) {
        int i10 = f2485 + 17;
        f2484 = i10 % 128;
        if (i10 % 2 != 0) {
            m2474(obj, obj.getClass(), str);
            throw null;
        }
        String strM2474 = m2474(obj, obj.getClass(), str);
        int i11 = f2485 + 49;
        f2484 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM2474;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2478(Object obj, List<String> list, int i10) {
        String strM2361 = new ia(list, i10).m2361(obj);
        f2485 = (f2484 + 15) % 128;
        return strM2361;
    }
}
